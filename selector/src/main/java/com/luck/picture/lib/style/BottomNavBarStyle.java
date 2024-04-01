package com.luck.picture.lib.style;

/**
 * @author：luck
 * @date：2021/11/15 4:15 下午
 * @describe：NavBarbottomStyle
 */
public class BottomNavBarStyle {
    /**
     * 底部导航栏背景色
     */
    private int bottomNarBarBackgroundColor;

    /**
     * 底部预览页NarBar背景色
     */
    private int bottomPreviewNarBarBackgroundColor;

    /**
     * 底部导航栏高度
     * <p>
     * use unit dp
     * </p>
     */
    private int bottomNarBarHeight;

    /**
     * 底部预览文本
     */
    private String bottomPreviewNormalText;

    /**
     * 底部预览文本
     */
    private int bottomPreviewNormalTextResId;

    /**
     * 底部预览文本字体大小
     */
    private int bottomPreviewNormalTextSize;
    /**
     * 底部预览文本正常字体色值
     */
    private int bottomPreviewNormalTextColor;

    /**
     * 底部选中预览文本
     */
    private String bottomPreviewSelectText;

    /**
     * 底部选中预览文本
     */
    private int bottomPreviewSelectTextResId;

    /**
     * 底部预览文本选中字体色值
     */
    private int bottomPreviewSelectTextColor;

    /**
     * 底部编辑文字
     */
    private String bottomEditorText;

    /**
     * 底部编辑文字
     */
    private int bottomEditorTextResId;

    /**
     * 底部编辑文字大小
     */
    private int bottomEditorTextSize;
    /**
     * 底部编辑文字色值
     */
    private int bottomEditorTextColor;
    /**
     * 底部原图文字DrawableLeft
     */
    private int bottomOriginalDrawableLeft;
    /**
     * 底部原图文字
     */
    private String bottomOriginalText;

    /**
     * 底部原图文字
     */
    private int bottomOriginalTextResId;

    /**
     * 底部原图文字大小
     */
    private int bottomOriginalTextSize;
    /**
     * 底部原图文字色值
     */
    private int bottomOriginalTextColor;

    /**
     * 已选数量背景样式
     */
    private int bottomSelectNumResources;
    /**
     * 已选数量文字大小
     */
    private int bottomSelectNumTextSize;
    /**
     * 已选数量文字颜色
     */
    private int bottomSelectNumTextColor;

    /**
     * 是否显示已选数量圆点提醒
     */
    private boolean isCompleteCountTips = true;

    // rjq+：是否显示BottomNavBar左边预览按钮
    private boolean isShowBottomPreviewBtn = true;

    // rjq+：是否选中后再显示bottomNavBar
    private boolean isSelectedShowBottomNavBar;
    // rjq+：isSelectedShowBottomNavBar=true时是否从底向上出现，如果gallery也显示则其也从底向上出现。isSelectedShowBottomNavBar=false时即使该变量为true，显示/隐藏gallery时也不会有动画
    // preview页暂不支持该动画
    private boolean isSelectedShowBottomNavBarAnim;
    // isSelectedShowBottomNavBarAnim=true时从底向上动画时长
    private int selectedShowBottomNavBarAnimDuration = 150;

    // rjq+：是否展示预览页BottomNavBar
    private boolean isShowPreviewBottomNavBar = true;

    // rjq+：是否显示BottomNavBar左边提醒文字
    private boolean isShowBottomNotice;

    // rjq+：预览页是否显示BottomNavBar左边提醒文字
    private boolean isShowPreviewBottomNotice;
    // rjq+：BottomNavBar左边提醒文字颜色
    private int bottomNoticeTextColor;
    // rjq+：BottomNavBar左边提醒文字大小
    private int bottomNoticeTextSize;
    // rjq+：BottomNavBar左边提醒文本
    private String bottomNoticeText;


    public BottomNavBarStyle() {
    }

    public int getBottomNarBarBackgroundColor() {
        return bottomNarBarBackgroundColor;
    }

    public void setBottomNarBarBackgroundColor(int bottomNarBarBackgroundColor) {
        this.bottomNarBarBackgroundColor = bottomNarBarBackgroundColor;
    }

    public int getBottomPreviewNarBarBackgroundColor() {
        return bottomPreviewNarBarBackgroundColor;
    }

    public void setBottomPreviewNarBarBackgroundColor(int bottomPreviewNarBarBackgroundColor) {
        this.bottomPreviewNarBarBackgroundColor = bottomPreviewNarBarBackgroundColor;
    }

    public int getBottomNarBarHeight() {
        return bottomNarBarHeight;
    }

    public void setBottomNarBarHeight(int bottomNarBarHeight) {
        this.bottomNarBarHeight = bottomNarBarHeight;
    }

    public String getBottomPreviewNormalText() {
        return bottomPreviewNormalText;
    }

    public void setBottomPreviewNormalText(String bottomPreviewNormalText) {
        this.bottomPreviewNormalText = bottomPreviewNormalText;
    }

    public void setBottomPreviewNormalText(int resId) {
        this.bottomPreviewNormalTextResId = resId;
    }

    public int getBottomPreviewNormalTextResId() {
        return bottomPreviewNormalTextResId;
    }

    public int getBottomPreviewNormalTextSize() {
        return bottomPreviewNormalTextSize;
    }

    public void setBottomPreviewNormalTextSize(int bottomPreviewNormalTextSize) {
        this.bottomPreviewNormalTextSize = bottomPreviewNormalTextSize;
    }

    public int getBottomPreviewNormalTextColor() {
        return bottomPreviewNormalTextColor;
    }

    public void setBottomPreviewNormalTextColor(int bottomPreviewNormalTextColor) {
        this.bottomPreviewNormalTextColor = bottomPreviewNormalTextColor;
    }

    public String getBottomPreviewSelectText() {
        return bottomPreviewSelectText;
    }

    public void setBottomPreviewSelectText(String bottomPreviewSelectText) {
        this.bottomPreviewSelectText = bottomPreviewSelectText;
    }

    public void setBottomPreviewSelectText(int resId) {
        this.bottomPreviewSelectTextResId = resId;
    }

    public int getBottomPreviewSelectTextResId() {
        return bottomPreviewSelectTextResId;
    }

    public int getBottomPreviewSelectTextColor() {
        return bottomPreviewSelectTextColor;
    }

    public void setBottomPreviewSelectTextColor(int bottomPreviewSelectTextColor) {
        this.bottomPreviewSelectTextColor = bottomPreviewSelectTextColor;
    }

    public String getBottomEditorText() {
        return bottomEditorText;
    }

    public void setBottomEditorText(String bottomEditorText) {
        this.bottomEditorText = bottomEditorText;
    }

    public void setBottomEditorText(int resId) {
        this.bottomEditorTextResId = resId;
    }

    public int getBottomEditorTextResId() {
        return bottomEditorTextResId;
    }

    public int getBottomEditorTextSize() {
        return bottomEditorTextSize;
    }

    public void setBottomEditorTextSize(int bottomEditorTextSize) {
        this.bottomEditorTextSize = bottomEditorTextSize;
    }

    public int getBottomEditorTextColor() {
        return bottomEditorTextColor;
    }

    public void setBottomEditorTextColor(int bottomEditorTextColor) {
        this.bottomEditorTextColor = bottomEditorTextColor;
    }

    public int getBottomOriginalDrawableLeft() {
        return bottomOriginalDrawableLeft;
    }

    public void setBottomOriginalDrawableLeft(int bottomOriginalDrawableLeft) {
        this.bottomOriginalDrawableLeft = bottomOriginalDrawableLeft;
    }

    public String getBottomOriginalText() {
        return bottomOriginalText;
    }

    public void setBottomOriginalText(String bottomOriginalText) {
        this.bottomOriginalText = bottomOriginalText;
    }

    public void setBottomOriginalText(int resId) {
        this.bottomOriginalTextResId = resId;
    }

    public int getBottomOriginalTextResId() {
        return bottomOriginalTextResId;
    }

    public int getBottomOriginalTextSize() {
        return bottomOriginalTextSize;
    }

    public void setBottomOriginalTextSize(int bottomOriginalTextSize) {
        this.bottomOriginalTextSize = bottomOriginalTextSize;
    }

    public int getBottomOriginalTextColor() {
        return bottomOriginalTextColor;
    }

    public void setBottomOriginalTextColor(int bottomOriginalTextColor) {
        this.bottomOriginalTextColor = bottomOriginalTextColor;
    }

    public int getBottomSelectNumResources() {
        return bottomSelectNumResources;
    }

    public void setBottomSelectNumResources(int bottomSelectNumResources) {
        this.bottomSelectNumResources = bottomSelectNumResources;
    }

    public int getBottomSelectNumTextSize() {
        return bottomSelectNumTextSize;
    }

    public void setBottomSelectNumTextSize(int bottomSelectNumTextSize) {
        this.bottomSelectNumTextSize = bottomSelectNumTextSize;
    }

    public int getBottomSelectNumTextColor() {
        return bottomSelectNumTextColor;
    }

    public void setBottomSelectNumTextColor(int bottomSelectNumTextColor) {
        this.bottomSelectNumTextColor = bottomSelectNumTextColor;
    }

    public boolean isCompleteCountTips() {
        return isCompleteCountTips;
    }

    public void setCompleteCountTips(boolean completeCountTips) {
        isCompleteCountTips = completeCountTips;
    }

    public boolean isShowBottomPreviewBtn() {
        return isShowBottomPreviewBtn;
    }

    public void setShowBottomPreviewBtn(boolean show) {
        isShowBottomPreviewBtn = show;
    }

    public boolean isSelectedShowBottomNavBar() {
        return isSelectedShowBottomNavBar;
    }

    public void setSelectedShowBottomNavBar(boolean show) {
        isSelectedShowBottomNavBar = show;
    }

    public boolean isSelectedShowBottomNavBarAnim() {
        return isSelectedShowBottomNavBarAnim;
    }

    public void setSelectedShowBottomNavBarAnim(boolean show) {
        isSelectedShowBottomNavBarAnim = show;
    }

    public int getSelectedShowBottomNavBarAnimDuration() {
        return selectedShowBottomNavBarAnimDuration;
    }

    public void setSelectedShowBottomNavBarAnimDuration(int duration) {
        selectedShowBottomNavBarAnimDuration = duration;
    }

    public boolean isShowPreviewBottomNavBar() {
        return isShowPreviewBottomNavBar;
    }

    public void setShowPreviewBottomNavBar(boolean show) {
        isShowPreviewBottomNavBar = show;
    }

    public boolean isShowBottomNotice() {
        return isShowBottomNotice;
    }

    public void setShowBottomNotice(boolean show) {
        isShowBottomNotice = show;
    }

    public boolean isShowPreviewBottomNotice() {
        return isShowPreviewBottomNotice;
    }

    public void setShowPreviewBottomNotice(boolean show) {
        isShowPreviewBottomNotice = show;
    }

    public int getBottomNoticeTextColor() {
        return bottomNoticeTextColor;
    }

    public void setBottomNoticeTextColor(int color) {
        bottomNoticeTextColor = color;
    }

    public int getBottomNoticeTextSize() {
        return bottomNoticeTextSize;
    }

    public void setBottomNoticeTextSize(int size) {
        bottomNoticeTextSize = size;
    }

    public String getBottomNoticeText() {
        return bottomNoticeText;
    }

    public void setBottomNoticeText(String str) {
        bottomNoticeText = str;
    }
}
