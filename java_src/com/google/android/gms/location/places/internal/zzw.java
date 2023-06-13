package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
/* loaded from: classes6.dex */
public final class zzw extends JP7 implements zzt {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    @Override // com.google.android.gms.location.places.internal.zzt
    public final void zzb(List<String> list, zzau zzauVar, zzx zzxVar) throws RemoteException {
        Parcel zzb = zzb();
        zzb.writeStringList(list);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzxVar);
        zzb(17, zzb);
    }

    @Override // com.google.android.gms.location.places.internal.zzt
    public final void zzb(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, zzau zzauVar, zzx zzxVar) throws RemoteException {
        Parcel zzb = zzb();
        zzb.writeString(str);
        C43119j68.m31103c(zzb, latLngBounds);
        zzb.writeInt(i);
        C43119j68.m31103c(zzb, autocompleteFilter);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzxVar);
        zzb(28, zzb);
    }

    @Override // com.google.android.gms.location.places.internal.zzt
    public final void zzb(AddPlaceRequest addPlaceRequest, zzau zzauVar, zzx zzxVar) throws RemoteException {
        Parcel zzb = zzb();
        C43119j68.m31103c(zzb, addPlaceRequest);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzxVar);
        zzb(14, zzb);
    }

    @Override // com.google.android.gms.location.places.internal.zzt
    public final void zzb(String str, zzau zzauVar, zzv zzvVar) throws RemoteException {
        Parcel zzb = zzb();
        zzb.writeString(str);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzvVar);
        zzb(19, zzb);
    }

    @Override // com.google.android.gms.location.places.internal.zzt
    public final void zzb(String str, int i, int i2, int i3, zzau zzauVar, zzv zzvVar) throws RemoteException {
        Parcel zzb = zzb();
        zzb.writeString(str);
        zzb.writeInt(i);
        zzb.writeInt(i2);
        zzb.writeInt(i3);
        C43119j68.m31103c(zzb, zzauVar);
        C43119j68.m31104b(zzb, zzvVar);
        zzb(20, zzb);
    }
}
