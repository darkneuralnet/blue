package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
@KeepForSdk
@DynamiteApi
/* loaded from: classes6.dex */
public class ThickBarcodeScannerCreator extends FL7 {
    @Override // p000.WL7
    public InterfaceC38496bL7 newBarcodeScanner(WO1 wo1, zzbc zzbcVar) {
        return new BC7((Context) BinderC36557Vd3.m79637d5(wo1), zzbcVar);
    }
}
