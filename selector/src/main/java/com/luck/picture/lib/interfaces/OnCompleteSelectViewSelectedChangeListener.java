package com.luck.picture.lib.interfaces;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;

import java.util.List;

public interface OnCompleteSelectViewSelectedChangeListener {
    void onSelectedChange(CompleteSelectView completeSelectView, List<LocalMedia> selectLocalMedia);
}
