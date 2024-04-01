package com.luck.picture.lib.style;

/**
 * @author：luck
 * @date：2021/11/16 7:56 下午
 * @describe：AlbumWindowStyle
 */
public class AlbumWindowStyle {
    /**
     * 专辑列表item背景资源
     */
    private int albumAdapterItemBackground;
    /**
     * 专辑列表item背景色值
     */
    private int albumAdapterItemBackgroundColor;
    // rjq+: 专辑列表背景色
    private int albumBackgroundColor;
    /**
     * 专辑列表选中样式
     */
    private int albumAdapterItemSelectStyle;
    /**
     * 专辑名称字体大小
     */
    private int albumAdapterItemTitleSize;
    // rjq+：专辑副标题字体大小
    private int albumAdapterItemSubtitleSize;
    /**
     * 专辑名称字体色值
     */
    private int albumAdapterItemTitleColor;
    // rjq+：专辑副标题字体色值
    private int albumAdapterItemSubtitleColor;
    // rjq+：专辑名称距离图片左边距
    private int albumAdapterItemTitleMarginStart;
    // rjq+：专辑占屏幕高度百分比,固定高度
    private float albumHeightPercent = 0.6F;
    // rjq+：专辑是否显示副标题
    private boolean albumAdapterItemShowSubtitle = true;
    // rjq+：专辑封面图大小
    private int albumAdapterItemCoverSize;
    // rjq+：专辑itemView Padding
    private int[] albumAdapterItemPadding; // 左上右下
    // rjq+：专辑是否显示有选中图片红点
    private boolean albumAdapterItemShowSelectTag;
    // rjq+：专辑是否显示顶部线条
    private boolean albumShowTopDivider = true;
    // rjq+：专辑顶部线条颜色
    private int albumTopDividerColor;

    public AlbumWindowStyle() {

    }

    public int getAlbumAdapterItemBackground() {
        return albumAdapterItemBackground;
    }

    public void setAlbumAdapterItemBackground(int albumAdapterItemBackground) {
        this.albumAdapterItemBackground = albumAdapterItemBackground;
    }

    public int getAlbumAdapterItemBackgroundColor() {
        return albumAdapterItemBackgroundColor;
    }

    public void setAlbumAdapterItemBackgroundColor(int color) {
        this.albumAdapterItemBackgroundColor = color;
    }

    public int getAlbumBackgroundColor() {
        return albumBackgroundColor;
    }

    public void setAlbumBackgroundColor(int color) {
        this.albumBackgroundColor = color;
    }

    public int getAlbumAdapterItemSelectStyle() {
        return albumAdapterItemSelectStyle;
    }

    public void setAlbumAdapterItemSelectStyle(int albumAdapterItemSelectStyle) {
        this.albumAdapterItemSelectStyle = albumAdapterItemSelectStyle;
    }

    public int getAlbumAdapterItemTitleSize() {
        return albumAdapterItemTitleSize;
    }

    public void setAlbumAdapterItemTitleSize(int albumAdapterItemTitleSize) {
        this.albumAdapterItemTitleSize = albumAdapterItemTitleSize;
    }

    public int getAlbumAdapterItemSubtitleSize() {
        return albumAdapterItemSubtitleSize;
    }

    public void setAlbumAdapterItemSubtitleSize(int size) {
        this.albumAdapterItemSubtitleSize = size;
    }

    public int getAlbumAdapterItemTitleColor() {
        return albumAdapterItemTitleColor;
    }

    public void setAlbumAdapterItemTitleColor(int albumAdapterItemTitleColor) {
        this.albumAdapterItemTitleColor = albumAdapterItemTitleColor;
    }

    public int getAlbumAdapterItemSubtitleColor() {
        return albumAdapterItemSubtitleColor;
    }

    public void setAlbumAdapterItemSubtitleColor(int color) {
        this.albumAdapterItemSubtitleColor = color;
    }

    public int getAlbumAdapterItemTitleMarginStart() {
        return albumAdapterItemTitleMarginStart;
    }

    public void setAlbumAdapterItemMarginStart(int marginStart) {
        this.albumAdapterItemTitleMarginStart = marginStart;
    }

    public float getAlbumHeightPercent() {
        return albumHeightPercent;
    }

    public void setAlbumHeightPercent(float percent) {
        this.albumHeightPercent = percent;
    }

    public boolean getAlbumAdapterItemShowSubtitle() {
        return albumAdapterItemShowSubtitle;
    }

    public void setAlbumAdapterItemShowSubtitle(boolean isShow) {
        this.albumAdapterItemShowSubtitle = isShow;
    }

    public int getAlbumAdapterItemCoverSize() {
        return albumAdapterItemCoverSize;
    }

    public void setAlbumAdapterItemCoverSize(int size) {
        this.albumAdapterItemCoverSize = size;
    }

    public int[] getAlbumAdapterItemPadding() {
        return albumAdapterItemPadding;
    }

    public void setAlbumAdapterItemPadding(int[] padding) {
        this.albumAdapterItemPadding = padding;
    }

    public boolean getAlbumAdapterItemShowSelectTag() {
        return albumAdapterItemShowSelectTag;
    }

    public void setAlbumAdapterItemShowSelectTag(boolean show) {
        this.albumAdapterItemShowSelectTag = show;
    }

    public boolean getAlbumShowTopDivider() {
        return albumShowTopDivider;
    }

    public void setAlbumShowTopDivider(boolean show) {
        this.albumShowTopDivider = show;
    }

    public int getAlbumTopDividerColor() {
        return albumTopDividerColor;
    }

    public void setAlbumTopDividerColor(int color) {
        this.albumTopDividerColor = color;
    }
}
