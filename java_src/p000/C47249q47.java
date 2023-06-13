package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p031authapi.zbp;
/* renamed from: q47  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47249q47 extends F67<Status> {

    /* renamed from: a */
    public final /* synthetic */ Credential f104632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47249q47(C38357b67 c38357b67, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f104632a = credential;
    }

    @Override // p000.F67
    /* renamed from: a */
    public final void mo18233a(Context context, C49914ua7 c49914ua7) throws RemoteException {
        c49914ua7.m10010c5(new BinderC51408x57(this), new zbp(this.f104632a));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
