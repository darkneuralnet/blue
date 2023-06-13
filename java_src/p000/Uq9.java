package p000;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
/* renamed from: Uq9 */
/* loaded from: classes5.dex */
public final class Uq9 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f38112a;

    /* renamed from: b */
    public final /* synthetic */ LocationCallback f38113b;

    /* renamed from: c */
    public final /* synthetic */ Looper f38114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uq9(Hy9 hy9, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        super(googleApiClient);
        this.f38112a = locationRequest;
        this.f38113b = locationCallback;
        this.f38114c = looper;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84258e(zzba.m51350s(null, this.f38112a), ListenerHolders.createListenerHolder(this.f38113b, C44434lK7.m27423a(this.f38114c), LocationCallback.class.getSimpleName()), new Hx9(this));
    }
}
