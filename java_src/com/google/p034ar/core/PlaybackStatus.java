package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.PlaybackStatus */
/* loaded from: classes6.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    PlaybackStatus(int i) {
        this.nativeCode = i;
    }

    public static PlaybackStatus forNumber(int i) {
        PlaybackStatus[] values;
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        throw new FatalException("Unexpected value for native PlaybackStatus, value=" + i);
    }
}
