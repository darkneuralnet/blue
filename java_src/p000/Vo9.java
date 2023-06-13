package p000;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
/* renamed from: Vo9 */
/* loaded from: classes5.dex */
public final class Vo9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f39794a;

    /* renamed from: b */
    public final /* synthetic */ LocationListener f39795b;

    /* renamed from: c */
    public final /* synthetic */ Looper f39796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vo9(Hy9 hy9, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.f39794a = locationRequest;
        this.f39795b = locationListener;
        this.f39796c = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84257f(this.f39794a, ListenerHolders.createListenerHolder(this.f39795b, C44434lK7.m27423a(this.f39796c), LocationListener.class.getSimpleName()), new Hx9(this));
    }
}
