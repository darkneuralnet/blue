package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;
@UsedByNative("jni_common.cc")
/* loaded from: classes6.dex */
public class RecognitionOptions {
    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;
    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;
    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;
    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = false;
    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = false;
    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    /* renamed from: a */
    public void m50508a(int i) {
        this.barcodeFormats = i;
    }

    /* renamed from: b */
    public void m50507b(boolean z) {
        this.outputUnrecognizedBarcodes = z;
    }
}
