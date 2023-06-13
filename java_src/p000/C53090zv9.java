package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* renamed from: zv9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53090zv9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f122492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53090zv9(Hy9 hy9, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f122492a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84253j(this.f122492a, new Hx9(this));
    }
}
