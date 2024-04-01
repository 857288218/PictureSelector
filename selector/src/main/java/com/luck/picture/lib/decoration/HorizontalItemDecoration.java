package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author：luck
 * @data：2022/1/16 下午23:50
 * @describe:HorizontalItemDecoration
 */

public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {

    private final int spanCount;
    private final int leftSpacing, rightSpacing, topSpacing, bottomSpacing;

    public HorizontalItemDecoration(int spanCount, int leftSpacing, int rightSpacing, int topSpacing, int bottomSpacing) {
        this.spanCount = spanCount;
        this.leftSpacing = leftSpacing;
        this.rightSpacing = rightSpacing;
        this.topSpacing = topSpacing;
        this.bottomSpacing = bottomSpacing;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int column = position % spanCount;
        if (position == 0) {
            outRect.left = leftSpacing - column * leftSpacing / spanCount;
        } else {
            outRect.left = column * leftSpacing / spanCount;
        }
        outRect.right = rightSpacing - (column + 1) * rightSpacing / spanCount;
        if (position < spanCount) {
            outRect.top = topSpacing;
        }
        outRect.bottom = bottomSpacing;
    }
}