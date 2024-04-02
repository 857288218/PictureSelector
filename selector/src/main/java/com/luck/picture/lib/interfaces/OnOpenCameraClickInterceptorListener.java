package com.luck.picture.lib.interfaces;

import androidx.fragment.app.Fragment;

public interface OnOpenCameraClickInterceptorListener {
    // true标识消费该事件，不再走库中后续逻辑
    boolean openCameraClickInterceptorListener(Fragment fragment, int cameraMode, int requestCode);
}
