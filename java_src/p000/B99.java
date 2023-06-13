package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* renamed from: B99 */
/* loaded from: classes5.dex */
public final class B99 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ boolean f1927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B99(Hy9 hy9, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f1927a = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84251l(this.f1927a);
        setResult((B99) Status.RESULT_SUCCESS);
    }
}
