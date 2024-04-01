package com.luck.picture.lib.interfaces;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.BottomNavBar;
import java.util.List;

public interface OnBottomNavBarSelectedChangeListener {

    void onSelectedChange(BottomNavBar bottomNavBar, List<LocalMedia> selectLocalMedia);
}
