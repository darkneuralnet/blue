package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: Ce7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32124Ce7 extends Api.AbstractClientBuilder<C45001mH8, Api.ApiOptions.NoOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ C45001mH8 buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C45001mH8(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
