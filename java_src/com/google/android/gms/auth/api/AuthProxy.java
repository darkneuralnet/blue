package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public final class AuthProxy {
    @ShowFirstParty
    @KeepForSdk
    public static final Api<AuthProxyOptions> API;
    @ShowFirstParty
    @KeepForSdk
    public static final ProxyApi ProxyApi;
    public static final Api.ClientKey<C46177oG7> zza;
    private static final Api.AbstractClientBuilder<C46177oG7, AuthProxyOptions> zzb;

    static {
        Api.ClientKey<C46177oG7> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zzaVar = new zza();
        zzb = zzaVar;
        API = new Api<>("Auth.PROXY_API", zzaVar, clientKey);
        ProxyApi = new FN7();
    }

    @KeepForSdk
    public static ProxyClient getClient(Activity activity, AuthProxyOptions authProxyOptions) {
        return new C38505bM7(activity, authProxyOptions);
    }

    @KeepForSdk
    public static ProxyClient getClient(Context context, AuthProxyOptions authProxyOptions) {
        return new C38505bM7(context, authProxyOptions);
    }
}
