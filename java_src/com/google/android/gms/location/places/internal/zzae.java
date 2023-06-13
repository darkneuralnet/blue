package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class zzae extends GmsClient<zzr> {
    private final Locale locale;
    private final zzau zzbt;

    private zzae(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, PlacesOptions placesOptions) {
        super(context, looper, 67, clientSettings, connectionCallbacks, onConnectionFailedListener);
        Locale locale = Locale.getDefault();
        this.locale = locale;
        this.zzbt = new zzau(str, locale, clientSettings.getAccount() != null ? clientSettings.getAccount().name : null, null, 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (queryLocalInterface instanceof zzr) {
            return (zzr) queryLocalInterface;
        }
        return new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    public final void zzb(com.google.android.gms.location.places.zzm zzmVar, PlaceFilter placeFilter) throws RemoteException {
        Preconditions.checkNotNull(zzmVar, "callback == null");
        if (placeFilter == null) {
            placeFilter = PlaceFilter.zzc();
        }
        ((zzr) getService()).zzb(placeFilter, this.zzbt, zzmVar);
    }

    public final void zzb(com.google.android.gms.location.places.zzm zzmVar, PlaceReport placeReport) throws RemoteException {
        Preconditions.checkNotNull(zzmVar, "callback == null");
        ((zzr) getService()).zzb(placeReport, this.zzbt, zzmVar);
    }
}
