package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.auth.account.zze;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: Bj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31935Bj7 extends BaseImplementation.ApiMethodImpl<WorkAccountApi.AddAccountResult, C33168Gq7> {

    /* renamed from: a */
    public final /* synthetic */ String f2777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31935Bj7(C34797Np7 c34797Np7, Api api, GoogleApiClient googleApiClient, String str) {
        super(api, googleApiClient);
        this.f2777a = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new C43522jn7(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(C33168Gq7 c33168Gq7) throws RemoteException {
        ((zze) c33168Gq7.getService()).zzd(new BinderC33564Ii7(this), this.f2777a);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C31935Bj7) ((Result) obj));
    }
}
