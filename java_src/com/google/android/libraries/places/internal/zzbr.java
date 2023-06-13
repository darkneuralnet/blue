package com.google.android.libraries.places.internal;

import java.util.Map;
import org.json.JSONObject;
import p000.EM4;
/* loaded from: classes6.dex */
final class zzbr extends C36367Ui2 {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(zzbs zzbsVar, int i, String str, JSONObject jSONObject, EM4.InterfaceC1800b interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a, Map map) {
        super(0, str, null, interfaceC1800b, interfaceC1799a);
        this.zza = map;
    }

    @Override // p000.AbstractC45006mI4
    public final Map getHeaders() {
        return this.zza;
    }
}
