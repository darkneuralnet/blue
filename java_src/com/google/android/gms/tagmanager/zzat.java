package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzat implements zzaw {
    final /* synthetic */ DataLayer zza;

    public zzat(DataLayer dataLayer) {
        this.zza = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(List<zzau> list) {
        CountDownLatch countDownLatch;
        for (zzau zzauVar : list) {
            DataLayer dataLayer = this.zza;
            dataLayer.zzi(dataLayer.zza(zzauVar.zza, zzauVar.zzb));
        }
        countDownLatch = this.zza.zzh;
        countDownLatch.countDown();
    }
}
