package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* renamed from: Sh9 */
/* loaded from: classes5.dex */
public final class Sh9 extends Dw9 {
    public Sh9(Hy9 hy9, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84249n(new Hx9(this));
    }
}
