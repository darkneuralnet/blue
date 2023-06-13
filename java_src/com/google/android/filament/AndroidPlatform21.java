package com.google.android.filament;

import android.opengl.EGLContext;
/* loaded from: classes5.dex */
final class AndroidPlatform21 {
    public static long getSharedContextNativeHandle(Object obj) {
        return ((EGLContext) obj).getNativeHandle();
    }
}
