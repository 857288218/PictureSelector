package com.luck.picture.lib.style;

import com.luck.picture.lib.R;
import android.view.Gravity;
import android.widget.RelativeLayout;

/**
 * @author：luck
 * @date：2021/11/15 4:14 下午
 * @describe：SelectMainStyle
 */
public class SelectMainStyle {

    /**
     * 状态栏背景色
     */
    private int statusBarColor;

    /**
     * 导航栏背景色
     */
    private int navigationBarColor;

    /**
     * 状态栏字体颜色，非黑即白
     */
    private boolean isDarkStatusBarBlack = false;

    /**
     * 完成按钮从底部放在右上角
     */
    private boolean isCompleteSelectRelativeTop;

    /**
     * 预览页选择按钮从顶部放在右下角
     */
    private boolean isPreviewSelectRelativeBottom;

    /**
     * 预览页是否显示选择画廊
     */
    private boolean isPreviewDisplaySelectGallery;

    // 相册页是否显示选择画廊
    private boolean isDisplaySelectGallery;
    /**
     * 预览页选择按钮MarginRight
     * <p>
     * unit dp
     * </p>
     */
    private int previewSelectMarginRight;

    /**
     * 预览背景色
     */
    private int previewBackgroundColor;

    /**
     * 预览页选择按钮文本
     */
    private String previewSelectText;

    /**
     * 预览页选择按钮文本
     */
    private int previewSelectTextResId;

    /**
     * 预览页选择按钮字体大小
     */
    private int previewSelectTextSize;
    // rjq+: 预览页选择框中num字体大小
    private int previewSelectNumTextSize;
    // rjq+: 预览页选择框中num字体颜色
    private int previewSelectNumTextColor;
    // rjq+: 预览页是否显示选中按钮
    private boolean isShowPreviewSelect = true;

    /**
     * 预览页选择按钮字体颜色
     */
    private int previewSelectTextColor;


    /**
     * media item勾选样式
     */
    private int selectBackground;

    // rjq+：BaseRecyclerMediaHolder中tvCheck margin，勾选View margin
    private int selectMargin;

    /**
     * 预览样式勾选样式
     */
    private int previewSelectBackground;

    /**
     * 勾选样式是否使用数量类型
     */
    private boolean isSelectNumberStyle;

    /**
     * 预览页勾选样式是否使用数量类型
     */
    private boolean isPreviewSelectNumberStyle;

    /**
     * 列表背景色
     */
    private int mainListBackgroundColor;

    /**
     * 选择按钮默认文本
     */
    private String selectNormalText;

    /**
     * 选择按钮默认文本
     */
    private int selectNormalTextResId;

    /**
     * 选择按钮默认文本字体大小
     */
    private int selectNormalTextSize;
    /**
     * 选择按钮默认文本字体色值
     */
    private int selectNormalTextColor;

    /**
     * 选择按钮默认背景
     */
    private int selectNormalBackgroundResources;

    /**
     * 选择按钮文本
     */
    private String selectText;

    /**
     * 选择按钮文本
     */
    private int selectTextResId;

    /**
     * 选择按钮文本字体大小
     */
    private int selectTextSize;
    /**
     * 选择按钮文本字体色值
     */
    private int selectTextColor;

    /**
     * 选择按钮选中背景
     */
    private int selectBackgroundResources;

    // rjq+：CompleteSelectView中ps_tv_complete选中背景
    private int selectCompleteBtnBackgroundResources;
    // rjq+：CompleteSelectView中ps_tv_complete默认背景
    private int selectCompleteBtnNormalBackgroundResources;

    // rjq+：选择按钮(CompleteSelectView中ps_tv_complete)选中宽度
    private int selectViewWidth;
    // rjq+：选择按钮(CompleteSelectView中ps_tv_complete)选中高度
    private int selectViewHeight;

    // rjq+：选择按钮(CompleteSelectView中ps_tv_complete)默认宽度
    private int selectViewNormalWidth;
    // rjq+：选择按钮(CompleteSelectView中ps_tv_complete)默认高度
    private int selectViewNormalHeight;


    /**
     * RecyclerView列表item间隙
     * <p>
     * use unit dp
     * </p>
     */
    private int adapterItemSpacingSize;

    /**
     * 是否显示左右间距
     */
    private boolean isAdapterItemIncludeEdge;

    /**
     * 勾选样式字体大小
     */
    private int adapterSelectTextSize;

    /**
     * 勾选按钮点击区域
     * <p>
     * use unit dp
     * </p>
     */
    private int adapterSelectClickArea;

    /**
     * 勾选样式字体色值
     */
    private int adapterSelectTextColor;

    /**
     * 勾选样式位置
     * {@link RelativeLayout.addRule()}
     */
    private int[] adapterSelectStyleGravity;

    /**
     * 资源类型标识
     */
    private int adapterDurationDrawableLeft;
    // rjq+: videoItem或audioItem是否显示DrawableLeft
    private boolean isShowAdapterDurationDrawableLeft = true;

    /**
     * 时长文字字体大小
     */
    private int adapterDurationTextSize;

    /**
     * 时长文字Gravity
     */
    private int adapterDurationTextGravity = Gravity.CENTER_VERTICAL;

    /**
     * 时长文字MarginEnd
     */
    private int adapterDurationTextMarginEnd;

    /**
     * 时长文字MarginBottom
     */
    private int adapterDurationTextMarginBottom;

    /**
     * 时长文字颜色
     */
    private int adapterDurationTextColor;

    /**
     * 时长文字位置
     * {@link RelativeLayout.addRule()}
     */
    private int[] adapterDurationGravity;

    /**
     * 时长文字阴影背景
     */
    private int adapterDurationBackgroundResources = R.drawable.ps_ic_shadow_bg;

    /**
     * 拍照按钮背景色
     */
    private int adapterCameraBackgroundColor;

    /**
     * 拍照Item背景色
     */
    private int adapterCameraItemBackgroundColor;

    /**
     * 拍照按钮图标
     */
    private int adapterCameraDrawableTop;

    /**
     * 拍照按钮文本
     */
    private String adapterCameraText;

    /**
     * 拍照按钮文本
     */
    private int adapterCameraTextResId;

    /**
     * 拍照按钮文本字体色值
     */
    private int adapterCameraTextColor;

    /**
     * 是否显示拍照按钮文本
     */
    private boolean isShowAdapterCameraText = true;
    /**
     * 拍照按钮文本字体大小
     */
    private int adapterCameraTextSize;
    /**
     * 资源图标识的背景
     */
    private int adapterTagBackgroundResources;
    /**
     * 资源标识的字体大小
     */
    private int adapterTagTextSize;
    /**
     * 资源标识的字体色值
     */
    private int adapterTagTextColor;
    /**
     * 资源标识的位置
     * {@link RelativeLayout.addRule()}
     */
    private int[] adapterTagGravity;
    /**
     * 图片被编辑标识
     */
    private int adapterImageEditorResources;

    /**
     * 图片被编辑标识位置
     * {@link RelativeLayout.addRule()}
     */
    private int[] adapterImageEditorGravity;

    /**
     * 预览页画廊边框样式
     */
    private int adapterPreviewGalleryFrameResource;

    /**
     * 预览页画廊背景色
     */
    private int adapterPreviewGalleryBackgroundResource;
    // rjq+: 相册页画廊背景色
    private int adapterGalleryBackgroundResource;
    // rjq+: 相册页画廊是否显示选中item border
    private boolean isShowAdapterGalleryItemSelectBorder;
    // rjq+: 画廊选中视频中间播放icon
    private int adapterPreviewGalleryVideoItemIconResource;
    private int adapterGalleryVideoItemIconResource;
    // rjq+: 画廊是否显示选中视频中间播放icon
    private boolean isShowAdapterPreviewGalleryVideoItemIcon = true;
    private boolean isShowAdapterGalleryVideoItemIcon = true;
    // rjq+: 画廊是否显示选中视频时长
    private boolean isShowAdapterPreviewGalleryVideoItemDuration;
    private boolean isShowAdapterGalleryVideoItemDuration;
    // rjq+: 画廊视频时长文字大小
    private int adapterPreviewGalleryVideoItemDurationTextSize;
    private int adapterGalleryVideoItemDurationTextSize;
    // rjq+: 画廊视频时长文字颜色
    private int adapterPreviewGalleryVideoItemDurationTextColor;
    private int adapterGalleryVideoItemDurationTextColor;
    // 画廊视频时长文字背景资源
    private int adapterPreviewGalleryVideoItemDurationBgRes;
    private int adapterGalleryVideoItemDurationBgRes;

    /**
     * 预览页画廊item大小
     * <p>
     * use unit dp
     * </p>
     */
    private int adapterPreviewGalleryImageSize;
    // rjq+: 相册页画廊item大小
    private int adapterGalleryImageSize;
    // rjq+：画廊item长按时是否震动
    private boolean adapterPreviewGalleryItemLongClickVibrator;
    private boolean adapterGalleryItemLongClickVibrator;
    // rjq+：画廊item拖动时透明度
    private float adapterPreviewGalleryItemMovementAlpha = 0.7F;
    private float adapterGalleryItemMovementAlpha = 0.7F;
    // rjq+：画廊item拖动时放大倍数
    private float adapterPreviewGalleryItemScale = 1.1F;
    private float adapterGalleryItemScale = 1.1F;
    // rjq+：画廊是否显示右上角删除icon
    private boolean isShowAdapterPreviewGalleryItemDelete;
    private boolean isShowAdapterGalleryItemDelete = true;
    // rjq+：预览页画廊PaddingLeft
    private int adapterPreviewGalleryPaddingLeft = -1;
    // rjq+：预览页画廊item LeftSpace
    private int adapterPreviewGalleryItemLeftSpace = -1;
    // rjq+：预览页画廊PaddingRight
    private int adapterPreviewGalleryPaddingRight = -1;
    // rjq+：预览页画廊item RightSpace
    private int adapterPreviewGalleryItemRightSpace = -1;
    // rjq+：预览页画廊item TopSpace
    private int adapterPreviewGalleryItemTopSpace = -1;
    // rjq+：预览页画廊item BottomSpace
    private int adapterPreviewGalleryItemBottomSpace = -1;
    // rjq+：相册页画廊PaddingLeft
    private int adapterGalleryItemPaddingLeft = -1;
    // rjq+：相册页画廊item LeftSpace
    private int adapterGalleryItemLeftSpace = -1;
    // rjq+：相册页画廊paddingRight
    private int adapterGalleryPaddingRight = -1;
    // rjq+：相册页画廊item RightSpace
    private int adapterGalleryItemRightSpace = -1;
    // rjq+：相册页画廊item TopSpace
    private int adapterGalleryItemTopSpace = -1;
    // rjq+：相册页画廊item BottomSpace
    private int adapterGalleryItemBottomSpace = -1;

    public SelectMainStyle() {

    }

    public int getStatusBarColor() {
        return statusBarColor;
    }

    public void setStatusBarColor(int statusBarColor) {
        this.statusBarColor = statusBarColor;
    }

    public int getNavigationBarColor() {
        return navigationBarColor;
    }

    public void setNavigationBarColor(int navigationBarColor) {
        this.navigationBarColor = navigationBarColor;
    }

    public boolean isDarkStatusBarBlack() {
        return isDarkStatusBarBlack;
    }

    public void setDarkStatusBarBlack(boolean darkStatusBarBlack) {
        isDarkStatusBarBlack = darkStatusBarBlack;
    }

    public boolean isCompleteSelectRelativeTop() {
        return isCompleteSelectRelativeTop;
    }

    public void setCompleteSelectRelativeTop(boolean completeSelectRelativeTop) {
        isCompleteSelectRelativeTop = completeSelectRelativeTop;
    }

    public boolean isPreviewSelectRelativeBottom() {
        return isPreviewSelectRelativeBottom;
    }

    public void setPreviewSelectRelativeBottom(boolean previewSelectRelativeBottom) {
        isPreviewSelectRelativeBottom = previewSelectRelativeBottom;
    }

    public boolean isPreviewDisplaySelectGallery() {
        return isPreviewDisplaySelectGallery;
    }

    public void setPreviewDisplaySelectGallery(boolean previewDisplaySelectGallery) {
        isPreviewDisplaySelectGallery = previewDisplaySelectGallery;
    }

    public boolean isDisplaySelectGallery() {
        return isDisplaySelectGallery;
    }

    public void setDisplaySelectGallery(boolean displaySelectGallery) {
        isDisplaySelectGallery = displaySelectGallery;
    }

    public int getPreviewSelectMarginRight() {
        return previewSelectMarginRight;
    }

    public void setPreviewSelectMarginRight(int previewSelectMarginRight) {
        this.previewSelectMarginRight = previewSelectMarginRight;
    }

    public String getPreviewSelectText() {
        return previewSelectText;
    }

    public void setPreviewSelectText(String previewSelectText) {
        this.previewSelectText = previewSelectText;
    }

    public void setPreviewSelectText(int resId) {
        this.previewSelectTextResId = resId;
    }

    public int getPreviewSelectTextResId() {
        return previewSelectTextResId;
    }

    public int getPreviewSelectTextSize() {
        return previewSelectTextSize;
    }

    public void setPreviewSelectTextSize(int previewSelectTextSize) {
        this.previewSelectTextSize = previewSelectTextSize;
    }

    public int getPreviewSelectNumTextSize() {
        return previewSelectNumTextSize;
    }

    public void setPreviewSelectNumTextSize(int textSize) {
        this.previewSelectNumTextSize = textSize;
    }

    public int getPreviewSelectNumTextColor() {
        return previewSelectNumTextColor;
    }

    public void setPreviewSelectNumTextColor(int textColor) {
        this.previewSelectNumTextColor = textColor;
    }

    public boolean isShowPreviewSelect() {
        return isShowPreviewSelect;
    }

    public void setShowPreviewSelect(boolean select) {
        this.isShowPreviewSelect = select;
    }

    public int getPreviewSelectTextColor() {
        return previewSelectTextColor;
    }

    public void setPreviewSelectTextColor(int previewSelectTextColor) {
        this.previewSelectTextColor = previewSelectTextColor;
    }

    public int getSelectBackground() {
        return selectBackground;
    }

    public void setSelectBackground(int selectBackground) {
        this.selectBackground = selectBackground;
    }

    public int getSelectMargin() {
        return selectMargin;
    }

    public void setSelectMargin(int margin) {
        this.selectMargin = margin;
    }

    public int getPreviewSelectBackground() {
        return previewSelectBackground;
    }

    public void setPreviewSelectBackground(int previewSelectBackground) {
        this.previewSelectBackground = previewSelectBackground;
    }

    public boolean isSelectNumberStyle() {
        return isSelectNumberStyle;
    }

    public void setSelectNumberStyle(boolean selectNumberStyle) {
        isSelectNumberStyle = selectNumberStyle;
    }

    public boolean isPreviewSelectNumberStyle() {
        return isPreviewSelectNumberStyle;
    }

    public void setPreviewSelectNumberStyle(boolean previewSelectNumberStyle) {
        isPreviewSelectNumberStyle = previewSelectNumberStyle;
    }

    public int getMainListBackgroundColor() {
        return mainListBackgroundColor;
    }

    public void setMainListBackgroundColor(int mainListBackgroundColor) {
        this.mainListBackgroundColor = mainListBackgroundColor;
    }

    public String getSelectNormalText() {
        return selectNormalText;
    }

    public void setSelectNormalText(String selectNormalText) {
        this.selectNormalText = selectNormalText;
    }

    public void setSelectNormalText(int resId) {
        this.selectNormalTextResId = resId;
    }

    public int getSelectNormalTextResId() {
        return selectNormalTextResId;
    }

    public int getSelectNormalTextSize() {
        return selectNormalTextSize;
    }

    public void setSelectNormalTextSize(int selectNormalTextSize) {
        this.selectNormalTextSize = selectNormalTextSize;
    }

    public int getSelectNormalTextColor() {
        return selectNormalTextColor;
    }

    public void setSelectNormalTextColor(int selectNormalTextColor) {
        this.selectNormalTextColor = selectNormalTextColor;
    }

    public int getSelectNormalBackgroundResources() {
        return selectNormalBackgroundResources;
    }

    public void setSelectNormalBackgroundResources(int selectNormalBackgroundResources) {
        this.selectNormalBackgroundResources = selectNormalBackgroundResources;
    }

    public String getSelectText() {
        return selectText;
    }

    public void setSelectText(String selectText) {
        this.selectText = selectText;
    }

    public void setSelectText(int resId) {
        this.selectTextResId = resId;
    }

    public int getSelectTextResId() {
        return selectTextResId;
    }

    public int getSelectTextSize() {
        return selectTextSize;
    }

    public void setSelectTextSize(int selectTextSize) {
        this.selectTextSize = selectTextSize;
    }

    public int getSelectTextColor() {
        return selectTextColor;
    }

    public void setSelectTextColor(int selectTextColor) {
        this.selectTextColor = selectTextColor;
    }

    public int getSelectBackgroundResources() {
        return selectBackgroundResources;
    }

    public void setSelectBackgroundResources(int selectBackgroundResources) {
        this.selectBackgroundResources = selectBackgroundResources;
    }

    public int getSelectCompleteBtnBackgroundResources() {
        return selectCompleteBtnBackgroundResources;
    }

    public void setSelectCompleteBtnBackgroundResources(int resources) {
        this.selectCompleteBtnBackgroundResources = resources;
    }

    public int getSelectCompleteBtnNormalBackgroundResources() {
        return selectCompleteBtnNormalBackgroundResources;
    }

    public void setSelectCompleteBtnNormalBackgroundResources(int resources) {
        this.selectCompleteBtnNormalBackgroundResources = resources;
    }

    public int[] getSelectCompleteBtnSize() {
        return new int[]{selectViewWidth, selectViewHeight};
    }

    public void setSelectCompleteBtnSize(int selectViewWidth, int selectViewHeight) {
        this.selectViewWidth = selectViewWidth;
        this.selectViewHeight = selectViewHeight;
    }

    public int[] getSelectCompleteBtnNormalSize() {
        return new int[]{selectViewNormalWidth, selectViewNormalHeight};
    }

    public void setSelectCompleteBtnNormalSize(int width, int height) {
        this.selectViewNormalWidth = width;
        this.selectViewNormalHeight = height;
    }

    public int getAdapterItemSpacingSize() {
        return adapterItemSpacingSize;
    }

    public void setAdapterItemSpacingSize(int adapterItemSpacingSize) {
        this.adapterItemSpacingSize = adapterItemSpacingSize;
    }

    public boolean isAdapterItemIncludeEdge() {
        return isAdapterItemIncludeEdge;
    }

    public void setAdapterItemIncludeEdge(boolean adapterItemIncludeEdge) {
        isAdapterItemIncludeEdge = adapterItemIncludeEdge;
    }

    public int getAdapterSelectTextSize() {
        return adapterSelectTextSize;
    }

    public void setAdapterSelectTextSize(int adapterSelectTextSize) {
        this.adapterSelectTextSize = adapterSelectTextSize;
    }

    public int getAdapterSelectClickArea() {
        return adapterSelectClickArea;
    }

    public void setAdapterSelectClickArea(int adapterSelectClickArea) {
        this.adapterSelectClickArea = adapterSelectClickArea;
    }

    public int getAdapterSelectTextColor() {
        return adapterSelectTextColor;
    }

    public void setAdapterSelectTextColor(int adapterSelectTextColor) {
        this.adapterSelectTextColor = adapterSelectTextColor;
    }

    public int[] getAdapterSelectStyleGravity() {
        return adapterSelectStyleGravity;
    }

    public void setAdapterSelectStyleGravity(int[] adapterSelectStyleGravity) {
        this.adapterSelectStyleGravity = adapterSelectStyleGravity;
    }

    public int getAdapterDurationDrawableLeft() {
        return adapterDurationDrawableLeft;
    }

    public void setAdapterDurationDrawableLeft(int adapterDurationDrawableLeft) {
        this.adapterDurationDrawableLeft = adapterDurationDrawableLeft;
    }

    public boolean isShowAdapterDurationDrawableLeft() {
        return isShowAdapterDurationDrawableLeft;
    }

    public void setShowAdapterDurationDrawableLeft(boolean show) {
        isShowAdapterDurationDrawableLeft = show;
    }

    public int getAdapterDurationTextSize() {
        return adapterDurationTextSize;
    }

    public void setAdapterDurationTextSize(int adapterDurationTextSize) {
        this.adapterDurationTextSize = adapterDurationTextSize;
    }

    public int getAdapterDurationTextGravity() {
        return adapterDurationTextGravity;
    }

    public void setAdapterDurationTextGravity(int gravity) {
        this.adapterDurationTextGravity = gravity;
    }

    public int getAdapterDurationTextMarginEnd() {
        return adapterDurationTextMarginEnd;
    }

    public void setAdapterDurationTextMarginEnd(int marginEnd) {
        this.adapterDurationTextMarginEnd = marginEnd;
    }

    public int getAdapterDurationTextMarginBottom() {
        return adapterDurationTextMarginBottom;
    }

    public void setAdapterDurationTextMarginBottom(int marginBottom) {
        this.adapterDurationTextMarginBottom = marginBottom;
    }

    public int getAdapterDurationTextColor() {
        return adapterDurationTextColor;
    }

    public void setAdapterDurationTextColor(int adapterDurationTextColor) {
        this.adapterDurationTextColor = adapterDurationTextColor;
    }

    public int[] getAdapterDurationGravity() {
        return adapterDurationGravity;
    }

    public void setAdapterDurationGravity(int[] adapterDurationGravity) {
        this.adapterDurationGravity = adapterDurationGravity;
    }

    public int getAdapterDurationBackgroundResources() {
        return adapterDurationBackgroundResources;
    }

    public void setAdapterDurationBackgroundResources(int adapterDurationBackgroundResources) {
        this.adapterDurationBackgroundResources = adapterDurationBackgroundResources;
    }

    public int getAdapterCameraBackgroundColor() {
        return adapterCameraBackgroundColor;
    }

    public void setAdapterCameraBackgroundColor(int adapterCameraBackgroundColor) {
        this.adapterCameraBackgroundColor = adapterCameraBackgroundColor;
    }

    public int getAdapterCameraItemBackgroundColor() {
        return adapterCameraItemBackgroundColor;
    }

    public void setAdapterCameraItemBackgroundColor(int adapterCameraItemBackgroundColor) {
        this.adapterCameraItemBackgroundColor = adapterCameraItemBackgroundColor;
    }

    public int getAdapterCameraDrawableTop() {
        return adapterCameraDrawableTop;
    }

    public void setAdapterCameraDrawableTop(int adapterCameraDrawableTop) {
        this.adapterCameraDrawableTop = adapterCameraDrawableTop;
    }

    public String getAdapterCameraText() {
        return adapterCameraText;
    }

    public void setAdapterCameraText(String adapterCameraText) {
        this.adapterCameraText = adapterCameraText;
    }

    public void setAdapterCameraText(int resId) {
        this.adapterCameraTextResId = resId;
    }

    public int getAdapterCameraTextResId() {
        return adapterCameraTextResId;
    }

    public int getAdapterCameraTextColor() {
        return adapterCameraTextColor;
    }

    public void setAdapterCameraTextColor(int adapterCameraTextColor) {
        this.adapterCameraTextColor = adapterCameraTextColor;
    }

    public boolean getIsShowAdapterCameraText() {
        return isShowAdapterCameraText;
    }

    public void setIsShowAdapterCameraText(boolean isShow) {
        this.isShowAdapterCameraText = isShow;
    }

    public int getAdapterCameraTextSize() {
        return adapterCameraTextSize;
    }

    public void setAdapterCameraTextSize(int adapterCameraTextSize) {
        this.adapterCameraTextSize = adapterCameraTextSize;
    }

    public int getAdapterTagBackgroundResources() {
        return adapterTagBackgroundResources;
    }

    public void setAdapterTagBackgroundResources(int adapterTagBackgroundResources) {
        this.adapterTagBackgroundResources = adapterTagBackgroundResources;
    }

    public int getAdapterTagTextSize() {
        return adapterTagTextSize;
    }

    public void setAdapterTagTextSize(int adapterTagTextSize) {
        this.adapterTagTextSize = adapterTagTextSize;
    }

    public int getAdapterTagTextColor() {
        return adapterTagTextColor;
    }

    public void setAdapterTagTextColor(int adapterTagTextColor) {
        this.adapterTagTextColor = adapterTagTextColor;
    }

    public int[] getAdapterTagGravity() {
        return adapterTagGravity;
    }

    public void setAdapterTagGravity(int[] adapterTagGravity) {
        this.adapterTagGravity = adapterTagGravity;
    }

    public int getAdapterImageEditorResources() {
        return adapterImageEditorResources;
    }

    public void setAdapterImageEditorResources(int adapterImageEditorResources) {
        this.adapterImageEditorResources = adapterImageEditorResources;
    }

    public int[] getAdapterImageEditorGravity() {
        return adapterImageEditorGravity;
    }

    public void setAdapterImageEditorGravity(int[] adapterImageEditorGravity) {
        this.adapterImageEditorGravity = adapterImageEditorGravity;
    }

    public int getAdapterPreviewGalleryFrameResource() {
        return adapterPreviewGalleryFrameResource;
    }

    public void setAdapterPreviewGalleryFrameResource(int adapterPreviewGalleryFrameResource) {
        this.adapterPreviewGalleryFrameResource = adapterPreviewGalleryFrameResource;
    }

    public int getAdapterPreviewGalleryBackgroundResource() {
        return adapterPreviewGalleryBackgroundResource;
    }

    public void setAdapterPreviewGalleryBackgroundResource(int adapterPreviewGalleryBackgroundResource) {
        this.adapterPreviewGalleryBackgroundResource = adapterPreviewGalleryBackgroundResource;
    }

    public int getAdapterGalleryBackgroundResource() {
        return adapterGalleryBackgroundResource;
    }

    public void setAdapterGalleryBackgroundResource(int adapterGalleryBackgroundResource) {
        this.adapterGalleryBackgroundResource = adapterGalleryBackgroundResource;
    }

    public int getAdapterGalleryVideoItemIconResource() {
        return adapterGalleryVideoItemIconResource;
    }

    public void setAdapterGalleryVideoItemIconResource(int adapterGalleryVideoItemIconResource) {
        this.adapterGalleryVideoItemIconResource = adapterGalleryVideoItemIconResource;
    }

    public int getAdapterPreviewGalleryVideoItemIconResource() {
        return adapterPreviewGalleryVideoItemIconResource;
    }

    public void setAdapterPreviewGalleryVideoItemIconResource(int adapterPreviewGalleryVideoItemIconResource) {
        this.adapterPreviewGalleryVideoItemIconResource = adapterPreviewGalleryVideoItemIconResource;
    }

    public boolean isShowAdapterGalleryVideoItemIcon() {
        return isShowAdapterGalleryVideoItemIcon;
    }

    public void setShowAdapterGalleryVideoItemIcon(boolean show) {
        this.isShowAdapterGalleryVideoItemIcon = show;
    }

    public boolean isShowAdapterGalleryVideoItemDuration() {
        return isShowAdapterGalleryVideoItemDuration;
    }

    public void setShowAdapterGalleryVideoItemDuration(boolean show) {
        this.isShowAdapterGalleryVideoItemDuration = show;
    }

    public boolean isShowAdapterPreviewGalleryVideoItemDuration() {
        return isShowAdapterPreviewGalleryVideoItemDuration;
    }

    public void setShowAdapterPreviewGalleryVideoItemDuration(boolean show) {
        this.isShowAdapterPreviewGalleryVideoItemDuration = show;
    }

    public boolean isShowAdapterPreviewGalleryVideoItemIcon() {
        return isShowAdapterPreviewGalleryVideoItemIcon;
    }

    public void setShowAdapterPreviewGalleryVideoItemIcon(boolean show) {
        this.isShowAdapterPreviewGalleryVideoItemIcon = show;
    }

    public int getAdapterPreviewGalleryImageSize() {
        return adapterPreviewGalleryImageSize;
    }

    public void setAdapterPreviewGalleryImageSize(int adapterPreviewGalleryItemSize) {
        this.adapterPreviewGalleryImageSize = adapterPreviewGalleryItemSize;
    }

    public int getAdapterGalleryImageSize() {
        return adapterGalleryImageSize;
    }

    public void setAdapterGalleryImageSize(int adapterGalleryItemSize) {
        this.adapterGalleryImageSize = adapterGalleryItemSize;
    }

    public int getPreviewBackgroundColor() {
        return previewBackgroundColor;
    }

    public void setPreviewBackgroundColor(int previewBackgroundColor) {
        this.previewBackgroundColor = previewBackgroundColor;
    }

    public int getAdapterPreviewGalleryPaddingLeft() {
        return adapterPreviewGalleryPaddingLeft;
    }

    public void setAdapterPreviewGalleryPaddingLeft(int space) {
        adapterPreviewGalleryPaddingLeft = space;
    }

    public int getAdapterGalleryPaddingLeft() {
        return adapterGalleryItemPaddingLeft;
    }

    public void setAdapterGalleryPaddingLeft(int space) {
        adapterGalleryItemPaddingLeft = space;
    }

    public int getAdapterPreviewGalleryItemLeftSpace() {
        return adapterPreviewGalleryItemLeftSpace;
    }

    public void setAdapterPreviewGalleryItemLeftSpace(int space) {
        adapterPreviewGalleryItemLeftSpace = space;
    }

    public int getAdapterGalleryItemLeftSpace() {
        return adapterGalleryItemLeftSpace;
    }

    public void setAdapterGalleryItemLeftSpace(int space) {
        adapterGalleryItemLeftSpace = space;
    }

    public int getAdapterPreviewGalleryPaddingRight() {
        return adapterPreviewGalleryPaddingRight;
    }

    public void setAdapterPreviewGalleryPaddingRight(int space) {
        adapterPreviewGalleryPaddingRight = space;
    }

    public int getAdapterGalleryPaddingRight() {
        return adapterGalleryPaddingRight;
    }

    public void setAdapterGalleryPaddingRight(int space) {
        adapterGalleryPaddingRight = space;
    }

    public int getAdapterPreviewGalleryItemRightSpace() {
        return adapterPreviewGalleryItemRightSpace;
    }

    public void setAdapterPreviewGalleryItemRightSpace(int space) {
        adapterPreviewGalleryItemRightSpace = space;
    }

    public int getAdapterGalleryItemRightSpace() {
        return adapterGalleryItemRightSpace;
    }

    public void setAdapterGalleryItemRightSpace(int space) {
        adapterGalleryItemRightSpace = space;
    }

    public int getAdapterPreviewGalleryItemTopSpace() {
        return adapterPreviewGalleryItemTopSpace;
    }

    public void setAdapterPreviewGalleryItemTopSpace(int space) {
        adapterPreviewGalleryItemTopSpace = space;
    }

    public int getAdapterGalleryItemTopSpace() {
        return adapterGalleryItemTopSpace;
    }

    public void setAdapterGalleryItemTopSpace(int space) {
        adapterGalleryItemTopSpace = space;
    }

    public int getAdapterPreviewGalleryItemBottomSpace() {
        return adapterPreviewGalleryItemBottomSpace;
    }

    public void setAdapterPreviewGalleryItemBottomSpace(int space) {
        adapterPreviewGalleryItemBottomSpace = space;
    }

    public int getAdapterGalleryItemBottomSpace() {
        return adapterGalleryItemBottomSpace;
    }

    public void setAdapterGalleryItemBottomSpace(int space) {
        adapterGalleryItemBottomSpace = space;
    }

    public boolean getAdapterPreviewGalleryItemLongClickVibrator() {
        return adapterPreviewGalleryItemLongClickVibrator;
    }

    public void setAdapterPreviewGalleryItemLongClickVibrator(boolean isVibrator) {
        adapterPreviewGalleryItemLongClickVibrator = isVibrator;
    }

    public boolean isShowAdapterGalleryItemSelectBorder() {
        return isShowAdapterGalleryItemSelectBorder;
    }

    public void setShowAdapterGalleryItemSelectBorder(boolean isShow) {
        isShowAdapterGalleryItemSelectBorder = isShow;
    }

    public boolean getAdapterGalleryItemLongClickVibrator() {
        return adapterGalleryItemLongClickVibrator;
    }

    public void setAdapterGalleryItemLongClickVibrator(boolean isVibrator) {
        adapterGalleryItemLongClickVibrator = isVibrator;
    }

    public float getAdapterPreviewGalleryItemMovementAlpha() {
        return adapterPreviewGalleryItemMovementAlpha;
    }

    public void setAdapterPreviewGalleryItemMovementAlpha(float alpha) {
        adapterPreviewGalleryItemMovementAlpha = alpha;
    }

    public float getAdapterGalleryItemMovementAlpha() {
        return adapterGalleryItemMovementAlpha;
    }

    public void setAdapterGalleryItemMovementAlpha(float alpha) {
        adapterGalleryItemMovementAlpha = alpha;
    }

    public float getAdapterPreviewGalleryItemScale() {
        return adapterPreviewGalleryItemScale;
    }

    public void setAdapterPreviewGalleryItemScale(float scale) {
        adapterPreviewGalleryItemScale = scale;
    }

    public float getAdapterGalleryItemScale() {
        return adapterGalleryItemScale;
    }

    public void setAdapterGalleryItemScale(float scale) {
        adapterGalleryItemScale = scale;
    }

    public boolean isShowAdapterPreviewGalleryItemDelete() {
        return isShowAdapterPreviewGalleryItemDelete;
    }

    public void setShowAdapterPreviewGalleryItemDelete(boolean show) {
        isShowAdapterPreviewGalleryItemDelete = show;
    }

    public boolean isShowAdapterGalleryItemDelete() {
        return isShowAdapterGalleryItemDelete;
    }

    public void setShowAdapterGalleryItemDelete(boolean show) {
        isShowAdapterGalleryItemDelete = show;
    }

    public int getAdapterGalleryVideoItemDurationTextSize() {
        return adapterGalleryVideoItemDurationTextSize;
    }

    public void setAdapterGalleryVideoItemDurationTextSize(int textSize) {
        adapterGalleryVideoItemDurationTextSize = textSize;
    }

    public int getAdapterPreviewGalleryVideoItemDurationTextSize() {
        return adapterPreviewGalleryVideoItemDurationTextSize;
    }

    public void setAdapterPreviewGalleryVideoItemDurationTextSize(int textSize) {
        adapterPreviewGalleryVideoItemDurationTextSize = textSize;
    }

    public int getAdapterPreviewGalleryVideoItemDurationTextColor() {
        return adapterPreviewGalleryVideoItemDurationTextColor;
    }

    public void setAdapterPreviewGalleryVideoItemDurationTextColor(int textColor) {
        adapterPreviewGalleryVideoItemDurationTextColor = textColor;
    }

    public int getAdapterGalleryVideoItemDurationTextColor() {
        return adapterGalleryVideoItemDurationTextColor;
    }

    public void setAdapterGalleryVideoItemDurationTextColor(int textColor) {
        adapterGalleryVideoItemDurationTextColor = textColor;
    }

    public int getAdapterGalleryVideoItemDurationBgRes() {
        return adapterGalleryVideoItemDurationBgRes;
    }

    public void setAdapterGalleryVideoItemDurationBgRes(int bgRes) {
        adapterGalleryVideoItemDurationBgRes = bgRes;
    }

    public int getAdapterPreviewGalleryVideoItemDurationBgRes() {
        return adapterPreviewGalleryVideoItemDurationBgRes;
    }

    public void setAdapterPreviewGalleryVideoItemDurationBgRes(int bgRes) {
        adapterPreviewGalleryVideoItemDurationBgRes = bgRes;
    }
}
