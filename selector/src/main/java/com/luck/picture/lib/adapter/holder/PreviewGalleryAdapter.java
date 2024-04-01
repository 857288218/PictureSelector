package com.luck.picture.lib.adapter.holder;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.luck.picture.lib.PictureSelectorFragment;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.R;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.InjectResourceSource;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.DateUtils;
import com.luck.picture.lib.utils.DensityUtil;
import com.luck.picture.lib.utils.StyleUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：luck
 * @date：2019-11-30 20:50
 * @describe：preview gallery
 */
public class PreviewGalleryAdapter extends RecyclerView.Adapter<PreviewGalleryAdapter.ViewHolder> {
    private final boolean isBottomPreview; // 是否为BottomNavBar预览按钮进入
    private final SelectorConfig selectorConfig;
    private List<LocalMedia> mData;
    private OnItemClickListener listener;
    private OnItemLongClickListener mItemLongClickListener;
    private PictureCommonFragment fragment;

    public PreviewGalleryAdapter(PictureCommonFragment fragment, SelectorConfig config, boolean isBottomPreview) {
        this.fragment = fragment;
        this.selectorConfig = config;
        this.isBottomPreview = isBottomPreview;
        this.mData = new ArrayList<>(selectorConfig.getSelectedResult());
        for (int i = 0; i < this.mData.size(); i++) {
            LocalMedia media = mData.get(i);
            media.setGalleryEnabledMask(false);
            media.setChecked(false);
        }
    }

    // rjq+: 刷新画廊数据顺序,当拖动改变预览页画廊顺序时，使用该方法改变选择图片页画廊顺序
    public void refreshSelectOrder() {
        this.mData = new ArrayList<>(selectorConfig.getSelectedResult());
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutResourceId = InjectResourceSource.getLayoutResource(parent.getContext(),
                InjectResourceSource.PREVIEW_GALLERY_ITEM_LAYOUT_RESOURCE, selectorConfig);
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(layoutResourceId != InjectResourceSource.DEFAULT_LAYOUT_RESOURCE ? layoutResourceId
                        : R.layout.ps_preview_gallery_item, parent, false);
        return new ViewHolder(itemView);
    }

    public List<LocalMedia> getData() {
        return mData;
    }

    public void clear() {
        mData.clear();
    }

    /**
     * 添加选中的至画廊效果里
     *
     * @param currentMedia
     */
    public void addGalleryData(LocalMedia currentMedia) {
        int lastCheckPosition = getLastCheckPosition();
        if (lastCheckPosition != RecyclerView.NO_POSITION) {
            LocalMedia lastSelectedMedia = mData.get(lastCheckPosition);
            lastSelectedMedia.setChecked(false);
            notifyItemChanged(lastCheckPosition);
        }
        if (isBottomPreview && mData.contains(currentMedia)) {
            int currentPosition = getCurrentPosition(currentMedia);
            LocalMedia media = mData.get(currentPosition);
            media.setGalleryEnabledMask(false);
            media.setChecked(true);
            notifyItemChanged(currentPosition);
        } else {
            currentMedia.setChecked(true);
            mData.add(currentMedia);
            notifyItemChanged(mData.size() - 1);
        }
    }

    /**
     * 移除画廊中未选中的结果
     *
     * @param currentMedia
     */
    public void removeGalleryData(LocalMedia currentMedia) {
        int currentPosition = getCurrentPosition(currentMedia);
        if (currentPosition != RecyclerView.NO_POSITION) {
            if (isBottomPreview) {
                LocalMedia media = mData.get(currentPosition);
                media.setGalleryEnabledMask(true);
                notifyItemChanged(currentPosition);
            } else {
                mData.remove(currentPosition);
                notifyItemRemoved(currentPosition);
            }
        }
    }

    /**
     * 当前LocalMedia是否选中
     *
     * @param currentMedia
     */
    public void isSelectMedia(LocalMedia currentMedia) {
        int lastCheckPosition = getLastCheckPosition();
        if (lastCheckPosition != RecyclerView.NO_POSITION) {
            LocalMedia lastSelectedMedia = mData.get(lastCheckPosition);
            lastSelectedMedia.setChecked(false);
            notifyItemChanged(lastCheckPosition);
        }

        int currentPosition = getCurrentPosition(currentMedia);
        if (currentPosition != RecyclerView.NO_POSITION) {
            LocalMedia media = mData.get(currentPosition);
            media.setChecked(true);
            notifyItemChanged(currentPosition);
        }
    }

    /**
     * 获取画廊上一次选中的位置
     *
     * @return
     */
    public int getLastCheckPosition() {
        for (int i = 0; i < mData.size(); i++) {
            LocalMedia media = mData.get(i);
            if (media.isChecked()) {
                return i;
            }
        }
        return RecyclerView.NO_POSITION;
    }

    /**
     * 获取当前画廊LocalMedia的位置
     *
     * @param currentMedia
     * @return
     */
    private int getCurrentPosition(LocalMedia currentMedia) {
        for (int i = 0; i < mData.size(); i++) {
            LocalMedia media = mData.get(i);
            if (TextUtils.equals(media.getPath(), currentMedia.getPath())
                    || media.getId() == currentMedia.getId()) {
                return i;
            }
        }
        return RecyclerView.NO_POSITION;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LocalMedia item = mData.get(position);
        ColorFilter colorFilter = StyleUtils.getColorFilter(holder.itemView.getContext(), item.isGalleryEnabledMask()
                ? R.color.ps_color_half_white : R.color.ps_color_transparent);
        SelectMainStyle selectMainStyle = selectorConfig.selectorStyle.getSelectMainStyle();
        boolean isShow = fragment instanceof PictureSelectorFragment && selectMainStyle.isShowAdapterGalleryItemSelectBorder();
        boolean isPreviewShow = fragment instanceof PictureSelectorPreviewFragment;
        if (isShow || isPreviewShow) {
            if (item.isChecked() && item.isGalleryEnabledMask()) {
                holder.viewBorder.setVisibility(View.VISIBLE);
            } else {
                holder.viewBorder.setVisibility(item.isChecked() ? View.VISIBLE : View.GONE);
            }
        }
        String path = item.getPath();
        if (item.isEditorImage() && !TextUtils.isEmpty(item.getCutPath())) {
            path = item.getCutPath();
            holder.ivEditor.setVisibility(View.VISIBLE);
        } else {
            holder.ivEditor.setVisibility(View.GONE);
        }
        holder.ivImage.setColorFilter(colorFilter);
        if (selectorConfig.imageEngine != null) {
            selectorConfig.imageEngine.loadGridImage(holder.itemView.getContext(), path, holder.ivImage);
        }
        holder.ivPlay.setVisibility(PictureMimeType.isHasVideo(item.getMimeType()) && holder.canShowVideoIcon ? View.VISIBLE : View.GONE);
        if (holder.isShowVideoDuration && PictureMimeType.isHasVideo(item.getMimeType())) {
            holder.tvVideoDuration.setVisibility(View.VISIBLE);
            holder.tvVideoDuration.setText(DateUtils.formatDurationTime(item.getDuration()));
        } else {
            holder.tvVideoDuration.setVisibility(View.GONE);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onItemClick(holder.getAbsoluteAdapterPosition(), item, view);
                }
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (mItemLongClickListener != null) {
                    int adapterPosition = holder.getAbsoluteAdapterPosition();
                    mItemLongClickListener.onItemLongClick(holder, adapterPosition, v);
                }
                return true;
            }
        });
        holder.ivDelete.setOnClickListener(view -> {
            if (listener != null) {
                listener.onItemDelete(holder.getAbsoluteAdapterPosition(), item, view);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void setItemLongClickListener(OnItemLongClickListener listener) {
        this.mItemLongClickListener = listener;
    }

    // rjq+: 默认imageSize给68dp
    public int getImageHeight(Context context) {
        SelectMainStyle selectMainStyle = selectorConfig.selectorStyle.getSelectMainStyle();
        int imageSize = fragment instanceof PictureSelectorFragment ? selectMainStyle.getAdapterGalleryImageSize() : selectMainStyle.getAdapterPreviewGalleryImageSize();
        if (StyleUtils.checkSizeValidity(imageSize)) {
            return imageSize;
        } else {
            return DensityUtil.dip2px(context, 68);
        }
    }

    // rjq+: 如果布局文件中ivDelete位置调整了从而调整了ivImage的marginTop则这里也需要修改
    public int getImageMarginTop(Context context) {
        return DensityUtil.dip2px(context, 10);
    }

    public interface OnItemClickListener {
        void onItemClick(int position, LocalMedia media, View v);
        void onItemDelete(int position, LocalMedia media, View v);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(RecyclerView.ViewHolder holder, int position, View v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivImage;
        ImageView ivPlay;
        ImageView ivEditor;
        ImageView ivDelete;
        View viewBorder;
        TextView tvVideoDuration;

        boolean canShowVideoIcon = true;
        boolean isShowVideoDuration = false;

        public ViewHolder(View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            ivPlay = itemView.findViewById(R.id.ivPlay);
            ivEditor = itemView.findViewById(R.id.ivEditor);
            ivDelete = itemView.findViewById(R.id.ivDelete);
            viewBorder = itemView.findViewById(R.id.viewBorder);
            tvVideoDuration = itemView.findViewById(R.id.tvVideoDuration);
            SelectMainStyle selectMainStyle = selectorConfig.selectorStyle.getSelectMainStyle();
            if (StyleUtils.checkStyleValidity(selectMainStyle.getAdapterImageEditorResources())) {
                ivEditor.setImageResource(selectMainStyle.getAdapterImageEditorResources());
            }
            if (StyleUtils.checkStyleValidity(selectMainStyle.getAdapterPreviewGalleryFrameResource())) {
                viewBorder.setBackgroundResource(selectMainStyle.getAdapterPreviewGalleryFrameResource());
            }
            boolean showDelete = false;
            int videoIconRes = 0;
            int videoDurationTextSize = 0;
            int videoDurationTextColor = 0;
            int videoDurationBgRes = 0;
            if (fragment instanceof PictureSelectorFragment) {
                videoIconRes = selectMainStyle.getAdapterGalleryVideoItemIconResource();
                showDelete = selectMainStyle.isShowAdapterGalleryItemDelete();
                videoDurationTextSize = selectMainStyle.getAdapterGalleryVideoItemDurationTextSize();
                videoDurationTextColor = selectMainStyle.getAdapterGalleryVideoItemDurationTextColor();
                videoDurationBgRes = selectMainStyle.getAdapterGalleryVideoItemDurationBgRes();
                isShowVideoDuration = selectMainStyle.isShowAdapterGalleryVideoItemDuration();
                canShowVideoIcon = selectMainStyle.isShowAdapterGalleryVideoItemIcon();
            } else if (fragment instanceof PictureSelectorPreviewFragment) {
                videoIconRes = selectMainStyle.getAdapterPreviewGalleryVideoItemIconResource();
                showDelete = selectMainStyle.isShowAdapterPreviewGalleryItemDelete();
                videoDurationTextSize = selectMainStyle.getAdapterPreviewGalleryVideoItemDurationTextSize();
                videoDurationTextColor = selectMainStyle.getAdapterPreviewGalleryVideoItemDurationTextColor();
                videoDurationBgRes = selectMainStyle.getAdapterPreviewGalleryVideoItemDurationBgRes();
                isShowVideoDuration = selectMainStyle.isShowAdapterPreviewGalleryVideoItemDuration();
                canShowVideoIcon = selectMainStyle.isShowAdapterPreviewGalleryVideoItemIcon();
            }

            int imageSize = getImageHeight(itemView.getContext());
            ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(imageSize, imageSize);
            params.startToStart = ConstraintSet.PARENT_ID;
            params.topToTop = R.id.ivDelete;
            params.topMargin = getImageMarginTop(itemView.getContext());
            params.goneTopMargin = 0;
            ivImage.setLayoutParams(params);

            if (StyleUtils.checkStyleValidity(videoIconRes)) {
                ivPlay.setImageResource(videoIconRes);
            }
            ivDelete.setVisibility(showDelete ? View.VISIBLE : View.GONE);
            if (StyleUtils.checkSizeValidity(videoDurationTextSize)) {
                tvVideoDuration.setTextSize(videoDurationTextSize);
            }
            if (StyleUtils.checkStyleValidity(videoDurationTextColor)) {
                tvVideoDuration.setTextColor(videoDurationTextColor);
            }
            if (StyleUtils.checkStyleValidity(videoDurationBgRes)) {
                tvVideoDuration.setBackgroundResource(videoDurationBgRes);
            }
        }
    }
}
