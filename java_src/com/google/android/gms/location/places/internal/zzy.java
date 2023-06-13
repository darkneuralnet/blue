package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;
/* loaded from: classes6.dex */
public abstract class zzy extends WB7 implements zzv {
    public zzy() {
        super("com.google.android.gms.location.places.internal.IPhotosCallbacks");
    }

    @Override // p000.WB7
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            zzb((PlacePhotoMetadataResult) C43119j68.m31105a(parcel, PlacePhotoMetadataResult.CREATOR));
            return true;
        }
        zzb((PlacePhotoResult) C43119j68.m31105a(parcel, PlacePhotoResult.CREATOR));
        return true;
    }
}
