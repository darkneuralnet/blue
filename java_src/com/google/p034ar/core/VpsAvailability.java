package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.VpsAvailability */
/* loaded from: classes6.dex */
public enum VpsAvailability {
    UNKNOWN(0),
    AVAILABLE(1),
    UNAVAILABLE(2),
    ERROR_INTERNAL(-1),
    ERROR_NETWORK_CONNECTION(-2),
    ERROR_NOT_AUTHORIZED(-3),
    ERROR_RESOURCE_EXHAUSTED(-4);
    
    final int nativeCode;

    VpsAvailability(int i) {
        this.nativeCode = i;
    }

    public static VpsAvailability forNumber(int i) {
        VpsAvailability[] values;
        for (VpsAvailability vpsAvailability : values()) {
            if (vpsAvailability.nativeCode == i) {
                return vpsAvailability;
            }
        }
        throw new FatalException("Unexpected value for native VpsAvailability, value=" + i);
    }
}
