package com.google.android.libraries.vision.visionkit.pipeline;

import android.content.Context;
/* loaded from: classes6.dex */
public final class AndroidAssetUtil {
    /* renamed from: a */
    public static synchronized boolean m50502a(Context context) {
        boolean nativeInitializeAssetManager;
        synchronized (AndroidAssetUtil.class) {
            nativeInitializeAssetManager = nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
        return nativeInitializeAssetManager;
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
