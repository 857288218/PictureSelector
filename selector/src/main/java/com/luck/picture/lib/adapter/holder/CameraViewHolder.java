package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.StyleUtils;

/**
 * @author：luck
 * @date：2021/11/20 3:54 下午
 * @describe：CameraViewHolder
 */
public class CameraViewHolder extends BaseRecyclerMediaHolder {

    public CameraViewHolder(View itemView) {
        super(itemView);
        TextView tvCamera = itemView.findViewById(R.id.tvCamera);
        ImageView ivCamera = itemView.findViewById(R.id.ivCamera);
        selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
        SelectMainStyle adapterStyle = selectorConfig.selectorStyle.getSelectMainStyle();
        int background = adapterStyle.getAdapterCameraBackgroundColor();
        if (StyleUtils.checkStyleValidity(background)) {
            tvCamera.setBackgroundColor(background);
        }
        int rootBackground = adapterStyle.getAdapterCameraItemBackgroundColor();
        if (StyleUtils.checkStyleValidity(rootBackground)) {
            itemView.setBackgroundColor(rootBackground);
        }
        int drawableTop = adapterStyle.getAdapterCameraDrawableTop();
        if (StyleUtils.checkStyleValidity(drawableTop)) {
            tvCamera.setCompoundDrawablesRelativeWithIntrinsicBounds(0, drawableTop, 0, 0);
            ivCamera.setImageResource(drawableTop);
        }
        String text = StyleUtils.checkStyleValidity(adapterStyle.getAdapterCameraTextResId())
                ? itemView.getContext().getString(adapterStyle.getAdapterCameraTextResId()) : adapterStyle.getAdapterCameraText();
        if (StyleUtils.checkTextValidity(text)) {
            tvCamera.setText(text);
        } else {
            if (selectorConfig.chooseMode == SelectMimeType.ofAudio()) {
                tvCamera.setText(itemView.getContext().getString(R.string.ps_tape));
            }
        }
        boolean isShowCameraText = adapterStyle.getIsShowAdapterCameraText();
        if (isShowCameraText) {
            tvCamera.setVisibility(View.VISIBLE);
            ivCamera.setVisibility(View.GONE);
        } else {
            tvCamera.setVisibility(View.GONE);
            ivCamera.setVisibility(View.VISIBLE);
        }
        int textSize = adapterStyle.getAdapterCameraTextSize();
        if (StyleUtils.checkSizeValidity(textSize)) {
            tvCamera.setTextSize(textSize);
        }
        int textColor = adapterStyle.getAdapterCameraTextColor();
        if (StyleUtils.checkStyleValidity(textColor)) {
            tvCamera.setTextColor(textColor);
        }
    }

}
