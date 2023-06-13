package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* renamed from: KX7 */
/* loaded from: classes5.dex */
public final class KX7 extends AbstractC41654ge8 {

    /* renamed from: a */
    public final /* synthetic */ long f19726a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f19727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KX7(C34069Km8 c34069Km8, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f19726a = j;
        this.f19727b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84247p(this.f19726a, this.f19727b);
        setResult((KX7) Status.RESULT_SUCCESS);
    }
}
