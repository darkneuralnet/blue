package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: z81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52618z81 extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* renamed from: a */
    public static final Api.ClientKey<A81> f120847a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder<A81, Api.ApiOptions.NoOptions> f120848b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f120849c;

    /* renamed from: z81$a */
    /* loaded from: classes6.dex */
    public class C30920a extends Api.AbstractClientBuilder<A81, Api.ApiOptions.NoOptions> {
        @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
        /* renamed from: a */
        public A81 buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new A81(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        }
    }

    static {
        Api.ClientKey<A81> clientKey = new Api.ClientKey<>();
        f120847a = clientKey;
        C30920a c30920a = new C30920a();
        f120848b = c30920a;
        f120849c = new Api<>("DynamicLinks.API", c30920a, clientKey);
    }

    @VisibleForTesting
    public C52618z81(Context context) {
        super(context, f120849c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
