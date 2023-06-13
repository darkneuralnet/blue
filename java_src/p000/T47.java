package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* renamed from: T47 */
/* loaded from: classes5.dex */
public final class T47 extends F67<Status> {
    public T47(C38357b67 c38357b67, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // p000.F67
    /* renamed from: a */
    public final void mo18233a(Context context, C49914ua7 c49914ua7) throws RemoteException {
        c49914ua7.m10007f5(new BinderC51408x57(this));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
