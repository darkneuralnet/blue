package p000;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: FN7 */
/* loaded from: classes5.dex */
public final class FN7 implements ProxyApi {
    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final PendingResult<ProxyApi.SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient);
        return googleApiClient.execute(new C46833pN7(this, googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi
    public final PendingResult<ProxyApi.ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        Preconditions.checkNotNull(googleApiClient);
        Preconditions.checkNotNull(proxyRequest);
        return googleApiClient.execute(new IM7(this, googleApiClient, proxyRequest));
    }
}
