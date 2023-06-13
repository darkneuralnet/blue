package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public abstract class zzab extends HB7 implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p000.HB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                C49815uP7.m10349b(parcel);
                zzc(parcel.readInt(), parcel.readStrongBinder(), (zzj) C49815uP7.m10350a(parcel, zzj.CREATOR));
            } else {
                C49815uP7.m10349b(parcel);
                zzb(parcel.readInt(), (Bundle) C49815uP7.m10350a(parcel, Bundle.CREATOR));
            }
        } else {
            C49815uP7.m10349b(parcel);
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C49815uP7.m10350a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
