package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: tK7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49177tK7 extends BaseImplementation.ApiMethodImpl<ProxyApi.SpatulaHeaderResult, C46177oG7> {
    public AbstractC49177tK7(GoogleApiClient googleApiClient) {
        super(AuthProxy.API, googleApiClient);
    }

    /* renamed from: a */
    public abstract void mo12497a(Context context, PI7 pi7) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new C43877kO7(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(C46177oG7 c46177oG7) throws RemoteException {
        C46177oG7 c46177oG72 = c46177oG7;
        mo12497a(c46177oG72.getContext(), (PI7) c46177oG72.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((AbstractC49177tK7) ((Result) obj));
    }
}