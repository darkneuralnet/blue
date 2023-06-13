package com.google.android.filament.utils;

import com.google.android.filament.Filament;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/google/android/filament/utils/Utils;", "", "()V", "init", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final void init() {
        Filament.init();
        System.loadLibrary("filament-utils-jni");
    }
}
