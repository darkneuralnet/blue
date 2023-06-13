package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
/* renamed from: e59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40145e59 extends Dw9 {

    /* renamed from: a */
    public final /* synthetic */ LocationCallback f77942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40145e59(Hy9 hy9, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.f77942a = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84252k(ListenerHolders.createListenerKey(this.f77942a, LocationCallback.class.getSimpleName()), new Hx9(this));
    }
}
