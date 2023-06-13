package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: zT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52816zT8 extends Api.AbstractClientBuilder<C42526i68, Api.ApiOptions.NoOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ C42526i68 buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C42526i68(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
