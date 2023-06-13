package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: CR7 */
/* loaded from: classes5.dex */
public final class CR7 extends C46815pL7 implements InterfaceC42134hS7 {
    public CR7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p000.InterfaceC42134hS7
    /* renamed from: W0 */
    public final void mo30653W0(Bundle bundle) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, bundle);
        m19439e5(1, m19441c5);
    }
}
