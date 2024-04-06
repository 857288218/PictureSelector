package com.luck.picture.lib.interfaces;

/**
 * @author：luck
 * @date：2022/7/1 23:25 下午
 * @describe：OnPlayerListener
 */
public interface OnPlayerListener {
    /**
     * player error
     */
    void onPlayerError();

    /**
     * playing
     */
    void onPlayerReady();
    // rjq+：画面开始渲染
    void onRendingStart();
    /**
     * preparing to play
     */
    void onPlayerLoading();

    /**
     * end of playback
     */
    void onPlayerEnd();
}
