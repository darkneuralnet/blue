package com.google.android.libraries.places.internal;

import java.io.IOException;
/* loaded from: classes6.dex */
public final /* synthetic */ class zzew implements C96 {
    public static final /* synthetic */ zzew zza = new zzew();

    private /* synthetic */ zzew() {
    }

    @Override // p000.C96
    public final Object apply(Object obj) {
        zzlg zzlgVar = (zzlg) obj;
        try {
            byte[] bArr = new byte[zzlgVar.zzv()];
            zzacx zzC = zzacx.zzC(bArr);
            zzlgVar.zzH(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            String name = zzlgVar.getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
