package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
/* renamed from: bu9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38833bu9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationListener f59755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38833bu9(Hy9 hy9, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f59755a = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84254i(ListenerHolders.createListenerKey(this.f59755a, LocationListener.class.getSimpleName()), new Hx9(this));
    }
}
