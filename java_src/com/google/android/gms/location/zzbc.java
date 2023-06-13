package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes6.dex */
public abstract class zzbc extends JB7 implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzbd zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof zzbd) {
            return (zzbd) queryLocalInterface;
        }
        return new zzbb(iBinder);
    }

    @Override // p000.JB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzd((Location) C51000wP7.m6864b(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
