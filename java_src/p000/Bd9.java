package p000;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* renamed from: Bd9 */
/* loaded from: classes5.dex */
public final class Bd9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ Location f2619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd9(Hy9 hy9, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f2619a = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84250m(this.f2619a);
        setResult((Bd9) Status.RESULT_SUCCESS);
    }
}
