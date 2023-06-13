package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes6.dex */
public abstract class zzaa extends WB7 implements zzx {
    public zzaa() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    @Override // p000.WB7
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        zze((DataHolder) C43119j68.m31105a(parcel, DataHolder.CREATOR));
                    } else {
                        zzb((Status) C43119j68.m31105a(parcel, Status.CREATOR));
                    }
                } else {
                    zzd((DataHolder) C43119j68.m31105a(parcel, DataHolder.CREATOR));
                }
            } else {
                zzc((DataHolder) C43119j68.m31105a(parcel, DataHolder.CREATOR));
            }
        } else {
            zzb((DataHolder) C43119j68.m31105a(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}
