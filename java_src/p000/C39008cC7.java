package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p000.WO1;
/* renamed from: cC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39008cC7 extends C45804ne7 implements InterfaceC42685iO1 {
    public C39008cC7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p000.InterfaceC42685iO1
    /* renamed from: Y2 */
    public final WO1 mo34036Y2(CameraPosition cameraPosition) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, cameraPosition);
        Parcel m23365c5 = m23365c5(7, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.InterfaceC42685iO1
    /* renamed from: c2 */
    public final WO1 mo34035c2(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLngBounds);
        m23364d5.writeInt(i);
        Parcel m23365c5 = m23365c5(10, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.InterfaceC42685iO1
    /* renamed from: h0 */
    public final WO1 mo34034h0(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLngBounds);
        m23364d5.writeInt(i);
        m23364d5.writeInt(i2);
        m23364d5.writeInt(i3);
        Parcel m23365c5 = m23365c5(11, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.InterfaceC42685iO1
    /* renamed from: i4 */
    public final WO1 mo34033i4(LatLng latLng) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        Parcel m23365c5 = m23365c5(8, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.InterfaceC42685iO1
    /* renamed from: u3 */
    public final WO1 mo34032u3(LatLng latLng, float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        m23364d5.writeFloat(f);
        Parcel m23365c5 = m23365c5(9, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }
}
