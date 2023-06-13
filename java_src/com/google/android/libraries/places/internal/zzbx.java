package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Map;
import p000.EM4;
/* loaded from: classes6.dex */
final class zzbx extends OX1 {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzby zzbyVar, String str, EM4.InterfaceC1800b interfaceC1800b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, EM4.InterfaceC1799a interfaceC1799a, Map map) {
        super(str, interfaceC1800b, 0, 0, scaleType, config, interfaceC1799a);
        this.zza = map;
    }

    @Override // p000.AbstractC45006mI4
    public final Map getHeaders() {
        return this.zza;
    }
}
