package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.TrackingState */
/* loaded from: classes6.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);
    
    final int nativeCode;

    TrackingState(int i) {
        this.nativeCode = i;
    }

    public static TrackingState forNumber(int i) {
        TrackingState[] values;
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        throw new FatalException("Unexpected value for native TrackingState, value=" + i);
    }
}
