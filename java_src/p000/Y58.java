package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* renamed from: Y58 */
/* loaded from: classes5.dex */
public final class Y58 extends AbstractC41654ge8 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f44513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y58(C34069Km8 c34069Km8, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f44513a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84244s(this.f44513a);
        setResult((Y58) Status.RESULT_SUCCESS);
    }
}
