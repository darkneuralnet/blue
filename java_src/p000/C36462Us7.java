package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import p000.C35336Px6;
/* renamed from: Us7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36462Us7 extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C35336Px6.C6596a c6596a = (C35336Px6.C6596a) obj;
        if (c6596a == null) {
            c6596a = new C35336Px6.C6596a();
        }
        return new C50738vx9(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener, c6596a.f29473b, c6596a.f29474c, c6596a.f29476e);
    }
}
