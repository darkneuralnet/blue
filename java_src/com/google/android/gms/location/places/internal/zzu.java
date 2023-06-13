package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
/* loaded from: classes6.dex */
public final class zzu extends JP7 implements zzr {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    @Override // com.google.android.gms.location.places.internal.zzr
    public final void zzb(PlaceFilter placeFilter, zzau zzauVar, zzx zzxVar) throws RemoteException {
        Parcel zzb = zzb();
        C43119j68.m31103c(zzb, placeFilter);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzxVar);
        zzb(6, zzb);
    }

    @Override // com.google.android.gms.location.places.internal.zzr
    public final void zzb(PlaceReport placeReport, zzau zzauVar, zzx zzxVar) throws RemoteException {
        Parcel zzb = zzb();
        C43119j68.m31103c(zzb, placeReport);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzxVar);
        zzb(7, zzb);
    }
}
