package p000;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.zze;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: tl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49431tl7 extends BaseImplementation.ApiMethodImpl<Result, C33168Gq7> {

    /* renamed from: a */
    public final /* synthetic */ Account f110986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49431tl7(C34797Np7 c34797Np7, Api api, GoogleApiClient googleApiClient, Account account) {
        super(api, googleApiClient);
        this.f110986a = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new C37128Xo7(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(C33168Gq7 c33168Gq7) throws RemoteException {
        ((zze) c33168Gq7.getService()).zze(new BinderC52385yk7(this), this.f110986a);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C49431tl7) ((Result) obj));
    }
}
