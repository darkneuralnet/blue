package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.account.zze;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: Nh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34725Nh7 extends BaseImplementation.ApiMethodImpl<Result, C33168Gq7> {

    /* renamed from: a */
    public final /* synthetic */ boolean f25006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34725Nh7(C34797Np7 c34797Np7, Api api, GoogleApiClient googleApiClient, boolean z) {
        super(api, googleApiClient);
        this.f25006a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new C38771bo7(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(C33168Gq7 c33168Gq7) throws RemoteException {
        ((zze) c33168Gq7.getService()).zzf(this.f25006a);
        setResult((C34725Nh7) new C38771bo7(Status.RESULT_SUCCESS));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((C34725Nh7) ((Result) obj));
    }
}
