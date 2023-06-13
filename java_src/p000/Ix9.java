package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Ix9 */
/* loaded from: classes5.dex */
public final class Ix9 extends C45804ne7 implements InterfaceC34941Of7 {
    public Ix9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: V4 */
    public final boolean mo91717V4(InterfaceC34941Of7 interfaceC34941Of7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC34941Of7);
        Parcel m23365c5 = m23365c5(19, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: b */
    public final List<LatLng> mo91716b() throws RemoteException {
        Parcel m23365c5 = m23365c5(4, m23364d5());
        ArrayList createTypedArrayList = m23365c5.createTypedArrayList(LatLng.CREATOR);
        m23365c5.recycle();
        return createTypedArrayList;
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: f */
    public final void mo91715f() throws RemoteException {
        m23363e5(1, m23364d5());
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: l */
    public final boolean mo91714l() throws RemoteException {
        Parcel m23365c5 = m23365c5(16, m23364d5());
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: q */
    public final void mo91713q(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(15, m23364d5);
    }

    @Override // p000.InterfaceC34941Of7
    /* renamed from: r1 */
    public final void mo91712r1(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(27, m23364d5);
    }

    @Override // p000.InterfaceC34941Of7
    public final int zzi() throws RemoteException {
        Parcel m23365c5 = m23365c5(20, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }
}
