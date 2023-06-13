package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: bM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38505bM7 extends GoogleApi<AuthProxyOptions> implements ProxyClient {
    public C38505bM7(Activity activity, AuthProxyOptions authProxyOptions) {
        super(activity, AuthProxy.API, authProxyOptions == null ? AuthProxyOptions.zza : authProxyOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final Task<String> getSpatulaHeader() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: QK7
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((PI7) ((C46177oG7) obj).getService()).m90486c5(new LL7(C38505bM7.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(1520).build());
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final Task<ProxyResponse> performProxyRequest(final ProxyRequest proxyRequest) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: gL7
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C38505bM7 c38505bM7 = C38505bM7.this;
                ProxyRequest proxyRequest2 = proxyRequest;
                ((PI7) ((C46177oG7) obj).getService()).m90485d5(new BinderC50964wL7(c38505bM7, (TaskCompletionSource) obj2), proxyRequest2);
            }
        }).setMethodKey(1518).build());
    }

    public C38505bM7(Context context, AuthProxyOptions authProxyOptions) {
        super(context, AuthProxy.API, authProxyOptions == null ? AuthProxyOptions.zza : authProxyOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
