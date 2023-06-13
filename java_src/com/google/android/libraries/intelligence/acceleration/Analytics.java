package com.google.android.libraries.intelligence.acceleration;
/* loaded from: classes6.dex */
public final class Analytics {
    /* renamed from: a */
    public static void m50506a(boolean z) {
        nativeNotifyProcessLifecycleState(z);
    }

    /* renamed from: b */
    public static boolean m50505b() {
        return nativeIsProcessInBackground();
    }

    private static native boolean nativeIsProcessInBackground();

    private static native void nativeNotifyProcessLifecycleState(boolean z);
}
