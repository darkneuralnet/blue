package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
/* renamed from: ws9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51281ws9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f116706a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f116707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51281ws9(Hy9 hy9, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f116706a = locationRequest;
        this.f116707b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84255h(this.f116706a, this.f116707b, new Hx9(this));
    }
}
