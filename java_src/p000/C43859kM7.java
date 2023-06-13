package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: kM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43859kM7 extends C46815pL7 implements QM7 {
    public C43859kM7(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // p000.QM7
    /* renamed from: a1 */
    public final Bundle mo29038a1(Bundle bundle) throws RemoteException {
        Parcel m19441c5 = m19441c5();
        UL7.m81613d(m19441c5, bundle);
        Parcel m19440d5 = m19440d5(1, m19441c5);
        Bundle bundle2 = (Bundle) UL7.m81616a(m19440d5, Bundle.CREATOR);
        m19440d5.recycle();
        return bundle2;
    }
}
