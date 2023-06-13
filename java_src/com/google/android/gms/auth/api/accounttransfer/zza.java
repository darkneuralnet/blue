package com.google.android.gms.auth.api.accounttransfer;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
/* loaded from: classes5.dex */
final class zza extends Api.AbstractClientBuilder<C41210ft7, zzq> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ C41210ft7 buildClient(Context context, Looper looper, ClientSettings clientSettings, zzq zzqVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C41210ft7(context, looper, clientSettings, zzqVar, connectionCallbacks, onConnectionFailedListener);
    }
}
