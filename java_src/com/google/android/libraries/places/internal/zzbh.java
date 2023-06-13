package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;
/* loaded from: classes6.dex */
public final /* synthetic */ class zzbh implements Comparator {
    public static final /* synthetic */ zzbh zza = new zzbh();

    private /* synthetic */ zzbh() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = zzbi.zza;
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
