package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.utils.StyleUtils;
import com.luck.picture.lib.utils.ValueOf;

/**
 * @author：luck
 * @date：2021/11/21 11:28 下午
 * @describe：CompleteSelectView
 */
public class CompleteSelectView extends ConstraintLayout {
    private TextView tvSelectNum;
    private TextView tvComplete;
    private Animation numberChangeAnimation;
    private SelectorConfig config;

    public CompleteSelectView(Context context) {
        super(context);
        init();
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflateLayout();
        tvSelectNum = findViewById(R.id.ps_tv_select_num);
        tvComplete = findViewById(R.id.ps_tv_complete);
        numberChangeAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.ps_anim_modal_in);
        config = SelectorProviders.getInstance().getSelectorConfig();
    }

    protected void inflateLayout() {
        LayoutInflater.from(getContext()).inflate(R.layout.ps_complete_selected_layout, this);
    }

    /**
     * 完成选择按钮样式
     */
    public void setCompleteSelectViewStyle() {
        PictureSelectorStyle selectorStyle = config.selectorStyle;
        SelectMainStyle selectMainStyle = selectorStyle.getSelectMainStyle();
        if (StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalBackgroundResources())) {
            setBackgroundResource(selectMainStyle.getSelectNormalBackgroundResources());
        }
        if (StyleUtils.checkStyleValidity(selectMainStyle.getSelectCompleteBtnNormalBackgroundResources())) {
            tvComplete.setBackgroundResource(selectMainStyle.getSelectCompleteBtnNormalBackgroundResources());
        }
        String selectNormalText = StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalTextResId())
                ? getContext().getString(selectMainStyle.getSelectNormalTextResId()) : selectMainStyle.getSelectNormalText();
        if (StyleUtils.checkTextValidity(selectNormalText)) {
            int formatCount = StyleUtils.getFormatCount(selectNormalText);
            if (formatCount == 1) {
                tvComplete.setText(String.format(selectNormalText, config.getSelectCount()));
            } else if (formatCount == 2) {
                tvComplete.setText(String.format(selectNormalText, config.getSelectCount(), config.maxSelectNum));
            } else {
                tvComplete.setText(selectNormalText);
            }
        }

        int selectNormalTextSize = selectMainStyle.getSelectNormalTextSize();
        if (StyleUtils.checkSizeValidity(selectNormalTextSize)) {
            tvComplete.setTextSize(selectNormalTextSize);
        }

        int selectNormalTextColor = selectMainStyle.getSelectNormalTextColor();
        if (StyleUtils.checkStyleValidity(selectNormalTextColor)) {
            tvComplete.setTextColor(selectNormalTextColor);
        }

        BottomNavBarStyle bottomBarStyle = selectorStyle.getBottomBarStyle();

        if (bottomBarStyle.isCompleteCountTips()) {
            int selectNumRes = bottomBarStyle.getBottomSelectNumResources();
            if (StyleUtils.checkStyleValidity(selectNumRes)) {
                tvSelectNum.setBackgroundResource(selectNumRes);
            }
            int selectNumTextSize = bottomBarStyle.getBottomSelectNumTextSize();
            if (StyleUtils.checkSizeValidity(selectNumTextSize)) {
                tvSelectNum.setTextSize(selectNumTextSize);
            }

            int selectNumTextColor = bottomBarStyle.getBottomSelectNumTextColor();
            if (StyleUtils.checkStyleValidity(selectNumTextColor)) {
                tvSelectNum.setTextColor(selectNumTextColor);
            }
        }
    }

    /**
     * 选择结果发生变化
     */
    public void setSelectedChange(boolean isPreview) {
        PictureSelectorStyle selectorStyle = config.selectorStyle;
        SelectMainStyle selectMainStyle = selectorStyle.getSelectMainStyle();
        if (config.getSelectCount() > 0) {
            int[] tvCompleteSize = selectMainStyle.getSelectCompleteBtnSize();
            if (tvCompleteSize.length == 2 && tvCompleteSize[0] > 0 && tvCompleteSize[1] > 0) {
                tvComplete.getLayoutParams().width = tvCompleteSize[0];
                tvComplete.getLayoutParams().height = tvCompleteSize[1];
            } else {
                tvComplete.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
                tvComplete.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
            }

            setEnabled(true);
            int selectBackground = selectMainStyle.getSelectBackgroundResources();
            if (StyleUtils.checkStyleValidity(selectBackground)) {
                setBackgroundResource(selectBackground);
            } else {
                setBackgroundResource(R.drawable.ps_ic_trans_1px);
            }
            int selectCompleteBtnBackground = selectMainStyle.getSelectCompleteBtnBackgroundResources();
            tvComplete.setBackgroundResource(selectCompleteBtnBackground);

            String selectText = StyleUtils.checkStyleValidity(selectMainStyle.getSelectTextResId())
                    ? getContext().getString(selectMainStyle.getSelectTextResId()) : selectMainStyle.getSelectText();
            if (StyleUtils.checkTextValidity(selectText)) {
                int formatCount = StyleUtils.getFormatCount(selectText);
                if (formatCount == 1) {
                    tvComplete.setText(String.format(selectText, config.getSelectCount()));
                } else if (formatCount == 2) {
                    tvComplete.setText(String.format(selectText, config.getSelectCount(), config.maxSelectNum));
                } else {
                    tvComplete.setText(selectText);
                }
            } else {
                tvComplete.setText(getContext().getString(R.string.ps_completed));
            }
            int selectTextSize = selectMainStyle.getSelectTextSize();
            if (StyleUtils.checkSizeValidity(selectTextSize)) {
                tvComplete.setTextSize(selectTextSize);
            }
            int selectTextColor = selectMainStyle.getSelectTextColor();
            if (StyleUtils.checkStyleValidity(selectTextColor)) {
                tvComplete.setTextColor(selectTextColor);
            } else {
                tvComplete.setTextColor(ContextCompat.getColor(getContext(), R.color.ps_color_fa632d));
            }
            if (selectorStyle.getBottomBarStyle().isCompleteCountTips()) {
                if (tvSelectNum.getVisibility() == GONE || tvSelectNum.getVisibility() == INVISIBLE) {
                    tvSelectNum.setVisibility(VISIBLE);
                }
                if (TextUtils.equals(ValueOf.toString(config.getSelectCount()), tvSelectNum.getText())) {
                    // ignore
                } else {
                    tvSelectNum.setText(ValueOf.toString(config.getSelectCount()));
                    if (config.onSelectAnimListener != null) {
                        config.onSelectAnimListener.onSelectAnim(tvSelectNum);
                    } else {
                        tvSelectNum.startAnimation(numberChangeAnimation);
                    }
                }
            } else {
                tvSelectNum.setVisibility(GONE);
            }
        } else {
            if (isPreview && selectMainStyle.isCompleteSelectRelativeTop()) {
                setEnabled(true);
                int selectBackground = selectMainStyle.getSelectBackgroundResources();
                if (StyleUtils.checkStyleValidity(selectBackground)) {
                    setBackgroundResource(selectBackground);
                } else {
                    setBackgroundResource(R.drawable.ps_ic_trans_1px);
                }
                int selectCompleteBtnBackground = selectMainStyle.getSelectCompleteBtnBackgroundResources();
                tvComplete.setBackgroundResource(selectCompleteBtnBackground);

                int selectTextColor = selectMainStyle.getSelectTextColor();
                if (StyleUtils.checkStyleValidity(selectTextColor)) {
                    tvComplete.setTextColor(selectTextColor);
                } else {
                    tvComplete.setTextColor(ContextCompat.getColor(getContext(), R.color.ps_color_9b));
                }
                int[] tvCompleteSelectSize = selectMainStyle.getSelectCompleteBtnSize();
                if (tvCompleteSelectSize.length == 2 && tvCompleteSelectSize[0] > 0 && tvCompleteSelectSize[1] > 0) {
                    tvComplete.getLayoutParams().width = tvCompleteSelectSize[0];
                    tvComplete.getLayoutParams().height = tvCompleteSelectSize[1];
                } else {
                    tvComplete.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    tvComplete.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
                }
            } else {
                setEnabled(config.isEmptyResultReturn);
                int normalBackground = selectMainStyle.getSelectNormalBackgroundResources();
                if (StyleUtils.checkStyleValidity(normalBackground)) {
                    setBackgroundResource(normalBackground);
                } else {
                    setBackgroundResource(R.drawable.ps_ic_trans_1px);
                }
                int selectCompleteBtnNormalBackground = selectMainStyle.getSelectCompleteBtnNormalBackgroundResources();
                tvComplete.setBackgroundResource(selectCompleteBtnNormalBackground);

                int normalTextColor = selectMainStyle.getSelectNormalTextColor();
                if (StyleUtils.checkStyleValidity(normalTextColor)) {
                    tvComplete.setTextColor(normalTextColor);
                } else {
                    tvComplete.setTextColor(ContextCompat.getColor(getContext(), R.color.ps_color_9b));
                }
                int[] selectViewNormalSize = selectMainStyle.getSelectCompleteBtnNormalSize();
                if (selectViewNormalSize.length == 2 && selectViewNormalSize[0] > 0 && selectViewNormalSize[1] > 0) {
                    tvComplete.getLayoutParams().width = selectViewNormalSize[0];
                    tvComplete.getLayoutParams().height = selectViewNormalSize[1];
                } else {
                    tvComplete.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
                    tvComplete.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
                }
            }

            tvSelectNum.setVisibility(GONE);
            String selectNormalText = StyleUtils.checkStyleValidity(selectMainStyle.getSelectNormalTextResId())
                    ? getContext().getString(selectMainStyle.getSelectNormalTextResId()) : selectMainStyle.getSelectNormalText();
            if (StyleUtils.checkTextValidity(selectNormalText)) {
                int formatCount = StyleUtils.getFormatCount(selectNormalText);
                if (formatCount == 1) {
                    tvComplete.setText(String.format(selectNormalText, config.getSelectCount()));
                } else if (formatCount == 2) {
                    tvComplete.setText(String.format(selectNormalText, config.getSelectCount(), config.maxSelectNum));
                } else {
                    tvComplete.setText(selectNormalText);
                }
            } else {
                tvComplete.setText(getContext().getString(R.string.ps_please_select));
            }
            int normalTextSize = selectMainStyle.getSelectNormalTextSize();
            if (StyleUtils.checkSizeValidity(normalTextSize)) {
                tvComplete.setTextSize(normalTextSize);
            }
        }
    }
}
