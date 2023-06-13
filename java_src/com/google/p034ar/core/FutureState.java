package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.FutureState */
/* loaded from: classes6.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);
    
    final int nativeCode;

    FutureState(int i) {
        this.nativeCode = i;
    }

    public static FutureState forNumber(int i) {
        FutureState[] values;
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i) {
                return futureState;
            }
        }
        throw new FatalException("Unexpected value for native FutureState, value=" + i);
    }
}
