package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
@KeepForSdk
/* renamed from: FA5 */
/* loaded from: classes6.dex */
public class FA5 extends GmsClient<WP6> implements RP6 {

    /* renamed from: f */
    public static final /* synthetic */ int f8976f = 0;

    /* renamed from: b */
    public final boolean f8977b;

    /* renamed from: c */
    public final ClientSettings f8978c;

    /* renamed from: d */
    public final Bundle f8979d;

    /* renamed from: e */
    public final Integer f8980e;

    public FA5(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f8977b = true;
        this.f8978c = clientSettings;
        this.f8979d = bundle;
        this.f8980e = clientSettings.zab();
    }

    @KeepForSdk
    /* renamed from: c */
    public static Bundle m107475c(ClientSettings clientSettings) {
        clientSettings.zaa();
        Integer zab = clientSettings.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (zab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p000.RP6
    /* renamed from: a */
    public final void mo86771a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((WP6) getService()).m78487d5(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f8980e)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // p000.RP6
    /* renamed from: b */
    public final void mo86770b(SP6 sp6) {
        GoogleSignInAccount googleSignInAccount;
        Preconditions.checkNotNull(sp6, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f8978c.getAccountOrDefault();
            if ("<<default account>>".equals(accountOrDefault.name)) {
                googleSignInAccount = Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount();
            } else {
                googleSignInAccount = null;
            }
            ((WP6) getService()).m78486e5(new zai(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f8980e)).intValue(), googleSignInAccount)), sp6);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                sp6.zab(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof WP6) {
            return (WP6) queryLocalInterface;
        }
        return new WP6(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f8978c.getRealClientPackageName())) {
            this.f8979d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f8978c.getRealClientPackageName());
        }
        return this.f8979d;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f8977b;
    }

    @Override // p000.RP6
    public final void zaa() {
        try {
            ((WP6) getService()).m78488c5(((Integer) Preconditions.checkNotNull(this.f8980e)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // p000.RP6
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
