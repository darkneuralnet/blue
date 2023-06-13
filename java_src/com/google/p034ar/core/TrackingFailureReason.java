package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.TrackingFailureReason */
/* loaded from: classes6.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);
    
    final int nativeCode;

    TrackingFailureReason(int i) {
        this.nativeCode = i;
    }

    public static TrackingFailureReason forNumber(int i) {
        TrackingFailureReason[] values;
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        throw new FatalException("Unexpected value for native TrackingFailureReason, value=" + i);
    }
}
