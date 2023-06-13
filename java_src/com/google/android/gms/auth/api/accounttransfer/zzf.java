package com.google.android.gms.auth.api.accounttransfer;
/* loaded from: classes5.dex */
final class zzf extends zzj<DeviceMetaData> {
    final /* synthetic */ zzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, zzk zzkVar) {
        super(zzkVar);
        this.zza = zzgVar;
    }

    @Override // p000.BinderC51862xr7, p000.InterfaceC47170pw7
    public final void zzc(DeviceMetaData deviceMetaData) {
        this.zza.zzb.setResult(deviceMetaData);
    }
}
