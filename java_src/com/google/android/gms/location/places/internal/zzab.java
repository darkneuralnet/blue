package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzm;
/* loaded from: classes6.dex */
final class zzab extends zzm.zzf<zzae> {
    private final /* synthetic */ PlaceReport zzbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzz zzzVar, Api api, GoogleApiClient googleApiClient, PlaceReport placeReport) {
        super(api, googleApiClient);
        this.zzbu = placeReport;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzae) anyClient).zzb(new com.google.android.gms.location.places.zzm(this), this.zzbu);
    }
}
