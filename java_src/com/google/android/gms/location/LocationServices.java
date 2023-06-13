package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes6.dex */
public class LocationServices {
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;
    @Deprecated
    public static final GeofencingApi GeofencingApi;
    @Deprecated
    public static final SettingsApi SettingsApi;
    private static final Api.ClientKey<TA7> zza;
    private static final Api.AbstractClientBuilder<TA7, Api.ApiOptions.NoOptions> zzb;

    static {
        Api.ClientKey<TA7> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzbh zzbhVar = new zzbh();
        zzb = zzbhVar;
        API = new Api<>("LocationServices.API", zzbhVar, clientKey);
        FusedLocationApi = new Hy9();
        GeofencingApi = new C48236rk7();
        SettingsApi = new C50946wJ7();
    }

    private LocationServices() {
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity) {
        return new FusedLocationProviderClient(activity);
    }

    public static GeofencingClient getGeofencingClient(Activity activity) {
        return new GeofencingClient(activity);
    }

    public static SettingsClient getSettingsClient(Activity activity) {
        return new SettingsClient(activity);
    }

    public static TA7 zza(GoogleApiClient googleApiClient) {
        boolean z;
        boolean z2 = true;
        if (googleApiClient != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "GoogleApiClient parameter is required.");
        TA7 ta7 = (TA7) googleApiClient.getClient(zza);
        if (ta7 == null) {
            z2 = false;
        }
        Preconditions.checkState(z2, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return ta7;
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        return new FusedLocationProviderClient(context);
    }

    public static GeofencingClient getGeofencingClient(Context context) {
        return new GeofencingClient(context);
    }

    public static SettingsClient getSettingsClient(Context context) {
        return new SettingsClient(context);
    }
}
