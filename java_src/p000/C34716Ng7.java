package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Ng7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34716Ng7 extends C45804ne7 implements InterfaceC32160Ci7 {
    public C34716Ng7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // p000.InterfaceC32160Ci7
    /* renamed from: D0 */
    public final boolean mo93583D0(InterfaceC32160Ci7 interfaceC32160Ci7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC32160Ci7);
        Parcel m23365c5 = m23365c5(15, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.InterfaceC32160Ci7
    /* renamed from: f */
    public final void mo93582f() throws RemoteException {
        m23363e5(1, m23364d5());
    }

    @Override // p000.InterfaceC32160Ci7
    public final int zzh() throws RemoteException {
        Parcel m23365c5 = m23365c5(16, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }
}
