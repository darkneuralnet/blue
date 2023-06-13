package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
/* renamed from: vx9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50738vx9 extends GmsClient {

    /* renamed from: b */
    public final Context f114997b;

    /* renamed from: c */
    public final int f114998c;

    /* renamed from: d */
    public final String f114999d;

    /* renamed from: e */
    public final int f115000e;

    /* renamed from: f */
    public final boolean f115001f;

    public C50738vx9(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, int i2, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        String str;
        this.f114997b = context;
        this.f114998c = i;
        Account account = clientSettings.getAccount();
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.f114999d = str;
        this.f115000e = i2;
        this.f115001f = z;
    }

    /* renamed from: c */
    public final void m7705c(IsReadyToPayRequest isReadyToPayRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        BinderC44167ks9 binderC44167ks9 = new BinderC44167ks9(taskCompletionSource);
        try {
            ((C42557i99) getService()).m34389e5(isReadyToPayRequest, m7703e(), binderC44167ks9);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            binderC44167ks9.mo28245L0(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof C42557i99) {
            return (C42557i99) queryLocalInterface;
        }
        return new C42557i99(iBinder);
    }

    /* renamed from: d */
    public final void m7704d(PaymentDataRequest paymentDataRequest, TaskCompletionSource taskCompletionSource) {
        Bundle m7703e = m7703e();
        m7703e.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BinderC49543tw9 binderC49543tw9 = new BinderC49543tw9(taskCompletionSource);
        try {
            ((C42557i99) getService()).m34388f5(paymentDataRequest, m7703e, binderC49543tw9);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            binderC49543tw9.mo11176X2(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }

    /* renamed from: e */
    public final Bundle m7703e() {
        int i = this.f114998c;
        String packageName = this.f114997b.getPackageName();
        String str = this.f114999d;
        int i2 = this.f115000e;
        boolean z = this.f115001f;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return AN8.f470i;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
