package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;
/* renamed from: Hh7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33321Hh7 extends AbstractC50004uj7 {

    /* renamed from: a */
    public final /* synthetic */ GeofencingRequest f13773a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f13774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33321Hh7(C48236rk7 c48236rk7, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f13773a = geofencingRequest;
        this.f13774b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84242u(this.f13773a, this.f13774b, this);
    }
}
