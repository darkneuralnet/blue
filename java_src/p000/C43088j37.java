package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* renamed from: j37  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43088j37 extends F67<CredentialRequestResult> {

    /* renamed from: a */
    public final /* synthetic */ CredentialRequest f92062a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43088j37(C38357b67 c38357b67, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.f92062a = credentialRequest;
    }

    @Override // p000.F67
    /* renamed from: a */
    public final void mo18233a(Context context, C49914ua7 c49914ua7) throws RemoteException {
        c49914ua7.m10009d5(new E27(this), this.f92062a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new B17(status, null);
    }
}
