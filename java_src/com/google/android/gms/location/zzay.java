package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
/* loaded from: classes6.dex */
public final class zzay extends C45211me7 implements zzba {
    public zzay(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzba
    public final void zzd(LocationResult locationResult) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzba
    public final void zze(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }
}