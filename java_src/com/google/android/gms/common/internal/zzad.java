package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public final class zzad extends C44025ke7 implements zzaf {
    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10347d(zza, zzoVar);
        Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) C49815uP7.m10350a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10347d(zza, zzoVar);
        Parcel zzB = zzB(8, zza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) C49815uP7.m10350a(zzB, com.google.android.gms.common.zzq.CREATOR);
        zzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(9, zza());
        boolean m10344g = C49815uP7.m10344g(zzB);
        zzB.recycle();
        return m10344g;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, WO1 wo1) throws RemoteException {
        Parcel zza = zza();
        C49815uP7.m10347d(zza, zzsVar);
        C49815uP7.m10345f(zza, wo1);
        Parcel zzB = zzB(5, zza);
        boolean m10344g = C49815uP7.m10344g(zzB);
        zzB.recycle();
        return m10344g;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean m10344g = C49815uP7.m10344g(zzB);
        zzB.recycle();
        return m10344g;
    }
}
