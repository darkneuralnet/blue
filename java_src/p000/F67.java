package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: F67 */
/* loaded from: classes5.dex */
public abstract class F67<R extends Result> extends BaseImplementation.ApiMethodImpl<R, M77> {
    public F67(GoogleApiClient googleApiClient) {
        super(Auth.CREDENTIALS_API, googleApiClient);
    }

    /* renamed from: a */
    public abstract void mo18233a(Context context, C49914ua7 c49914ua7) throws DeadObjectException, RemoteException;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(M77 m77) throws RemoteException {
        M77 m772 = m77;
        mo18233a(m772.getContext(), (C49914ua7) m772.getService());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((F67<R>) ((Result) obj));
    }
}
