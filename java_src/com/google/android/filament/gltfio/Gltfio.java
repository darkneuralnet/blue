package com.google.android.filament.gltfio;

import com.google.android.filament.Filament;
/* loaded from: classes5.dex */
public class Gltfio {
    public static void init() {
        Filament.init();
        System.loadLibrary("gltfio-jni");
    }
}
