package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
/* loaded from: classes5.dex */
public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final WorkAccountApi WorkAccountApi;
    private static final Api.ClientKey<C33168Gq7> zza;
    private static final Api.AbstractClientBuilder<C33168Gq7, Api.ApiOptions.NoOptions> zzb;

    static {
        Api.ClientKey<C33168Gq7> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        API = new Api<>("WorkAccount.API", zzfVar, clientKey);
        WorkAccountApi = new C34797Np7();
    }

    private WorkAccount() {
    }

    public static WorkAccountClient getClient(Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(Context context) {
        return new WorkAccountClient(context);
    }
}
