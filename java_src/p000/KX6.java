package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: KX6 */
/* loaded from: classes5.dex */
public final class KX6 extends Api.AbstractClientBuilder<ZX6, zbl> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ ZX6 buildClient(Context context, Looper looper, ClientSettings clientSettings, zbl zblVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new ZX6(context, looper, zblVar, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
