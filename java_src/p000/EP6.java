package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: EP6 */
/* loaded from: classes6.dex */
public final class EP6 extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        GA5 ga5 = (GA5) obj;
        return new FA5(context, looper, true, clientSettings, FA5.m107475c(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
