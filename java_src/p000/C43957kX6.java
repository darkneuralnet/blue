package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: kX6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43957kX6 extends GoogleApi<zbc> implements CredentialSavingClient {

    /* renamed from: b */
    public static final Api.ClientKey<C37245Yb7> f94484b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder<C37245Yb7, zbc> f94485c;

    /* renamed from: d */
    public static final Api<zbc> f94486d;

    /* renamed from: a */
    public final String f94487a;

    static {
        Api.ClientKey<C37245Yb7> clientKey = new Api.ClientKey<>();
        f94484b = clientKey;
        BV6 bv6 = new BV6();
        f94485c = bv6;
        f94486d = new Api<>("Auth.Api.Identity.CredentialSaving.API", bv6, clientKey);
    }

    public C43957kX6(Activity activity, zbc zbcVar) {
        super(activity, f94486d, zbcVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f94487a = C41001fY6.m41198a();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        SaveAccountLinkingTokenRequest.Builder zba = SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        zba.zba(this.f94487a);
        final SaveAccountLinkingTokenRequest build = zba.build();
        return doRead(TaskApiCall.builder().setFeatures(C39205cY6.f60880g).run(new RemoteCall() { // from class: vU6
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C43957kX6 c43957kX6 = C43957kX6.this;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = build;
                ((C33051Gd7) ((C37245Yb7) obj).getService()).m104942c5(new BinderC40390eW6(c43957kX6, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.Builder zba = SavePasswordRequest.zba(savePasswordRequest);
        zba.zba(this.f94487a);
        final SavePasswordRequest build = zba.build();
        return doRead(TaskApiCall.builder().setFeatures(C39205cY6.f60878e).run(new RemoteCall() { // from class: YU6
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C43957kX6 c43957kX6 = C43957kX6.this;
                SavePasswordRequest savePasswordRequest2 = build;
                ((C33051Gd7) ((C37245Yb7) obj).getService()).m104941d5(new HW6(c43957kX6, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public C43957kX6(Context context, zbc zbcVar) {
        super(context, f94486d, zbcVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f94487a = C41001fY6.m41198a();
    }
}
