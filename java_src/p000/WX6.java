package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: WX6 */
/* loaded from: classes5.dex */
public final class WX6 extends GoogleApi<zbl> implements SignInClient {

    /* renamed from: b */
    public static final Api.ClientKey<ZX6> f41255b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder<ZX6, zbl> f41256c;

    /* renamed from: d */
    public static final Api<zbl> f41257d;

    /* renamed from: a */
    public final String f41258a;

    static {
        Api.ClientKey<ZX6> clientKey = new Api.ClientKey<>();
        f41255b = clientKey;
        KX6 kx6 = new KX6();
        f41256c = kx6;
        f41257d = new Api<>("Auth.Api.Identity.SignIn.API", kx6, clientKey);
    }

    public WX6(Activity activity, zbl zblVar) {
        super(activity, f41257d, zblVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f41258a = C41001fY6.m41198a();
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest.Builder zba = BeginSignInRequest.zba(beginSignInRequest);
        zba.zba(this.f41258a);
        final BeginSignInRequest build = zba.build();
        return doRead(TaskApiCall.builder().setFeatures(C39205cY6.f60874a).run(new RemoteCall() { // from class: EX6
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                WX6 wx6 = WX6.this;
                BeginSignInRequest beginSignInRequest2 = build;
                ((ST6) ((ZX6) obj).getService()).m85375c5(new NX6(wx6, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
            if (status != null) {
                if (status.isSuccess()) {
                    SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
                    if (signInCredential != null) {
                        return signInCredential;
                    }
                    throw new ApiException(Status.RESULT_INTERNAL_ERROR);
                }
                throw new ApiException(status);
            }
            throw new ApiException(Status.RESULT_CANCELED);
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        GetSignInIntentRequest.Builder zba = GetSignInIntentRequest.zba(getSignInIntentRequest);
        zba.zba(this.f41258a);
        final GetSignInIntentRequest build = zba.build();
        return doRead(TaskApiCall.builder().setFeatures(C39205cY6.f60879f).run(new RemoteCall() { // from class: HX6
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                WX6 wx6 = WX6.this;
                GetSignInIntentRequest getSignInIntentRequest2 = build;
                ((ST6) ((ZX6) obj).getService()).m85374d5(new TX6(wx6, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest2));
            }
        }).setMethodKey(1555).build());
    }

    /* renamed from: i */
    public final /* synthetic */ void m78244i(ZX6 zx6, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((ST6) zx6.getService()).m85373e5(new QX6(this, taskCompletionSource), this.f41258a);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient googleApiClient : GoogleApiClient.getAllClients()) {
            googleApiClient.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(C39205cY6.f60875b).run(new RemoteCall() { // from class: BX6
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                WX6.this.m78244i((ZX6) obj, (TaskCompletionSource) obj2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    public WX6(Context context, zbl zblVar) {
        super(context, f41257d, zblVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f41258a = C41001fY6.m41198a();
    }
}
