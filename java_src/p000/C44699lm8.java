package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
/* renamed from: lm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44699lm8 extends C45804ne7 implements InterfaceC49207tO1 {
    public C44699lm8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: A2 */
    public final void mo12470A2(InterfaceC51211wl9 interfaceC51211wl9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC51211wl9);
        m23363e5(98, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: E1 */
    public final InterfaceC32160Ci7 mo12469E1(PolylineOptions polylineOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, polylineOptions);
        Parcel m23365c5 = m23365c5(9, m23364d5);
        InterfaceC32160Ci7 m101803d5 = AbstractBinderC33555Ih7.m101803d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m101803d5;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: F1 */
    public final QT8 mo12468F1(CircleOptions circleOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, circleOptions);
        Parcel m23365c5 = m23365c5(35, m23364d5);
        QT8 m86782d5 = RN8.m86782d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m86782d5;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: G1 */
    public final void mo12467G1(InterfaceC31755Ap7 interfaceC31755Ap7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC31755Ap7);
        m23363e5(28, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: G3 */
    public final void mo12466G3(InterfaceC40054dw7 interfaceC40054dw7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC40054dw7);
        m23363e5(30, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: H1 */
    public final void mo12465H1(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(4, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: H2 */
    public final C99 mo12464H2(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, groundOverlayOptions);
        Parcel m23365c5 = m23365c5(12, m23364d5);
        C99 m42097d5 = AbstractBinderC40738f59.m42097d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m42097d5;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: I1 */
    public final float mo12463I1() throws RemoteException {
        Parcel m23365c5 = m23365c5(2, m23364d5());
        float readFloat = m23365c5.readFloat();
        m23365c5.recycle();
        return readFloat;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: J1 */
    public final Ew9 mo12462J1(MarkerOptions markerOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, markerOptions);
        Parcel m23365c5 = m23365c5(11, m23364d5);
        Ew9 m114831d5 = Av9.m114831d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m114831d5;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: K1 */
    public final void mo12461K1(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(41, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: L1 */
    public final void mo12460L1(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(5, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: L2 */
    public final void mo12459L2(InterfaceC35994Ss7 interfaceC35994Ss7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC35994Ss7);
        m23363e5(29, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: M1 */
    public final InterfaceC45066mP1 mo12458M1() throws RemoteException {
        InterfaceC45066mP1 qo7;
        Parcel m23365c5 = m23365c5(25, m23364d5());
        IBinder readStrongBinder = m23365c5.readStrongBinder();
        if (readStrongBinder == null) {
            qo7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof InterfaceC45066mP1) {
                qo7 = (InterfaceC45066mP1) queryLocalInterface;
            } else {
                qo7 = new QO7(readStrongBinder);
            }
        }
        m23365c5.recycle();
        return qo7;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: Q1 */
    public final void mo12457Q1(InterfaceC44017kd9 interfaceC44017kd9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC44017kd9);
        m23363e5(99, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: R3 */
    public final boolean mo12456R3(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        Parcel m23365c5 = m23365c5(20, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: U1 */
    public final void mo12455U1(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(22, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: a4 */
    public final void mo12454a4(InterfaceC51934xy9 interfaceC51934xy9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC51934xy9);
        m23363e5(83, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: c0 */
    public final InterfaceC34941Of7 mo12453c0(PolygonOptions polygonOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, polygonOptions);
        Parcel m23365c5 = m23365c5(10, m23364d5);
        InterfaceC34941Of7 m101413d5 = Iy9.m101413d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m101413d5;
    }

    @Override // p000.InterfaceC49207tO1
    public final void clear() throws RemoteException {
        m23363e5(14, m23364d5());
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: g4 */
    public final void mo12452g4(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeInt(i);
        m23364d5.writeInt(i2);
        m23364d5.writeInt(i3);
        m23364d5.writeInt(i4);
        m23363e5(39, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    public final ZO1 getProjection() throws RemoteException {
        ZO1 c39718dN7;
        Parcel m23365c5 = m23365c5(26, m23364d5());
        IBinder readStrongBinder = m23365c5.readStrongBinder();
        if (readStrongBinder == null) {
            c39718dN7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof ZO1) {
                c39718dN7 = (ZO1) queryLocalInterface;
            } else {
                c39718dN7 = new C39718dN7(readStrongBinder);
            }
        }
        m23365c5.recycle();
        return c39718dN7;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: i3 */
    public final void mo12451i3(Ot9 ot9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, ot9);
        m23363e5(96, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: k4 */
    public final boolean mo12450k4(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, mapStyleOptions);
        Parcel m23365c5 = m23365c5(91, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: o3 */
    public final void mo12449o3(UG7 ug7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, ug7);
        m23363e5(85, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: p2 */
    public final void mo12448p2(InterfaceC33465Hx7 interfaceC33465Hx7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC33465Hx7);
        m23363e5(31, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: r3 */
    public final void mo12447r3(InterfaceC45531nA8 interfaceC45531nA8) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC45531nA8);
        m23363e5(33, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: r4 */
    public final void mo12446r4(WO1 wo1, int i, XX7 xx7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23364d5.writeInt(i);
        C51593xP7.m5286e(m23364d5, xx7);
        m23363e5(7, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: s2 */
    public final void mo12445s2(InterfaceC43492jk7 interfaceC43492jk7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC43492jk7);
        m23363e5(86, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: u2 */
    public final void mo12444u2(DI7 di7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, di7);
        m23363e5(87, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: v2 */
    public final CameraPosition mo12443v2() throws RemoteException {
        Parcel m23365c5 = m23365c5(1, m23364d5());
        CameraPosition cameraPosition = (CameraPosition) C51593xP7.m5290a(m23365c5, CameraPosition.CREATOR);
        m23365c5.recycle();
        return cameraPosition;
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: v3 */
    public final void mo12442v3(InterfaceC49401ti7 interfaceC49401ti7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC49401ti7);
        m23363e5(32, m23364d5);
    }

    @Override // p000.InterfaceC49207tO1
    /* renamed from: w3 */
    public final void mo12441w3(Gq9 gq9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, gq9);
        m23363e5(97, m23364d5);
    }
}
