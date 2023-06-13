package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: oH8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46187oH8 extends C45804ne7 implements QT8 {
    public C46187oH8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // p000.QT8
    /* renamed from: h4 */
    public final void mo21412h4(LatLng latLng) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        m23363e5(3, m23364d5);
    }

    @Override // p000.QT8
    /* renamed from: s1 */
    public final void mo21411s1(double d) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeDouble(d);
        m23363e5(5, m23364d5);
    }

    @Override // p000.QT8
    /* renamed from: v0 */
    public final boolean mo21410v0(QT8 qt8) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, qt8);
        Parcel m23365c5 = m23365c5(17, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.QT8
    public final int zzi() throws RemoteException {
        Parcel m23365c5 = m23365c5(18, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }
}
