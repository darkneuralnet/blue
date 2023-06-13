package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
/* renamed from: Ml9 */
/* loaded from: classes5.dex */
public final class Ml9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f23513a;

    /* renamed from: b */
    public final /* synthetic */ LocationListener f23514b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml9(Hy9 hy9, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.f23513a = locationRequest;
        this.f23514b = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84257f(this.f23513a, ListenerHolders.createListenerHolder(this.f23514b, C44434lK7.m27422b(), LocationListener.class.getSimpleName()), new Hx9(this));
    }
}
