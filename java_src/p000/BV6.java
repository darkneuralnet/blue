package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
/* renamed from: BV6 */
/* loaded from: classes5.dex */
public final class BV6 extends Api.AbstractClientBuilder<C37245Yb7, zbc> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ C37245Yb7 buildClient(Context context, Looper looper, ClientSettings clientSettings, zbc zbcVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new C37245Yb7(context, looper, zbcVar, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
