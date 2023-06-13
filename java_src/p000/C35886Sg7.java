package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.auth.zze;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Sg7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35886Sg7 extends GoogleApi<Api.ApiOptions.NoOptions> implements InterfaceC33133Gm8 {

    /* renamed from: a */
    public static final Api.ClientKey<HA8> f34051a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder<HA8, Api.ApiOptions.NoOptions> f34052b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f34053c;

    /* renamed from: d */
    public static final Logger f34054d;

    static {
        Api.ClientKey<HA8> clientKey = new Api.ClientKey<>();
        f34051a = clientKey;
        Qt9 qt9 = new Qt9();
        f34052b = qt9;
        f34053c = new Api<>("GoogleAuthService.API", qt9, clientKey);
        f34054d = zzd.zza("GoogleAuthServiceClient");
    }

    public C35886Sg7(Context context) {
        super(context, f34053c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: i */
    public static /* synthetic */ void m85132i(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (!TaskUtil.trySetResultOrApiException(status, obj, taskCompletionSource)) {
            f34054d.m51596w("The task is already complete.", new Object[0]);
        }
    }

    @Override // p000.InterfaceC33133Gm8
    /* renamed from: a */
    public final Task<Bundle> mo85137a(final Account account) {
        Preconditions.checkNotNull(account, "account cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(zze.zzg).run(new RemoteCall() { // from class: Oh9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C35886Sg7 c35886Sg7 = C35886Sg7.this;
                ((C52317yd9) ((HA8) obj).getService()).m3146f5(new BinderC33069Gf7(c35886Sg7, (TaskCompletionSource) obj2), account);
            }
        }).setMethodKey(1517).build());
    }

    @Override // p000.InterfaceC33133Gm8
    /* renamed from: c */
    public final Task<Bundle> mo85136c(final String str) {
        Preconditions.checkNotNull(str, "Client package name cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(zze.zzg).run(new RemoteCall() { // from class: ps9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C35886Sg7 c35886Sg7 = C35886Sg7.this;
                ((C52317yd9) ((HA8) obj).getService()).m3145g5(new BinderC50146ux9(c35886Sg7, (TaskCompletionSource) obj2), str);
            }
        }).setMethodKey(1514).build());
    }

    @Override // p000.InterfaceC33133Gm8
    /* renamed from: e */
    public final Task<AccountChangeEventsResponse> mo85135e(final AccountChangeEventsRequest accountChangeEventsRequest) {
        Preconditions.checkNotNull(accountChangeEventsRequest, "request cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(zze.zzg).run(new RemoteCall() { // from class: Ro9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C35886Sg7 c35886Sg7 = C35886Sg7.this;
                AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
                ((C52317yd9) ((HA8) obj).getService()).m3148d5(new BinderC51341wy9(c35886Sg7, (TaskCompletionSource) obj2), accountChangeEventsRequest2);
            }
        }).setMethodKey(1515).build());
    }

    @Override // p000.InterfaceC33133Gm8
    /* renamed from: f */
    public final Task<Void> mo85134f(final zzbw zzbwVar) {
        return doWrite(TaskApiCall.builder().setFeatures(zze.zzf).run(new RemoteCall() { // from class: Rq9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C35886Sg7 c35886Sg7 = C35886Sg7.this;
                ((C52317yd9) ((HA8) obj).getService()).m3149c5(new BinderC51321ww9(c35886Sg7, (TaskCompletionSource) obj2), zzbwVar);
            }
        }).setMethodKey(1513).build());
    }

    @Override // p000.InterfaceC33133Gm8
    /* renamed from: h */
    public final Task<Bundle> mo85133h(final Account account, final String str, final Bundle bundle) {
        Preconditions.checkNotNull(account, "Account name cannot be null!");
        Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(zze.zzf).run(new RemoteCall() { // from class: Jl9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C35886Sg7 c35886Sg7 = C35886Sg7.this;
                ((C52317yd9) ((HA8) obj).getService()).m3147e5(new BinderC45383mv9(c35886Sg7, (TaskCompletionSource) obj2), account, str, bundle);
            }
        }).setMethodKey(1512).build());
    }
}
