package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import p000.WO1;
/* renamed from: dN7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39718dN7 extends C45804ne7 implements ZO1 {
    public C39718dN7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p000.ZO1
    /* renamed from: D2 */
    public final VisibleRegion mo44337D2() throws RemoteException {
        Parcel m23365c5 = m23365c5(3, m23364d5());
        VisibleRegion visibleRegion = (VisibleRegion) C51593xP7.m5290a(m23365c5, VisibleRegion.CREATOR);
        m23365c5.recycle();
        return visibleRegion;
    }

    @Override // p000.ZO1
    /* renamed from: f1 */
    public final LatLng mo44336f1(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        Parcel m23365c5 = m23365c5(1, m23364d5);
        LatLng latLng = (LatLng) C51593xP7.m5290a(m23365c5, LatLng.CREATOR);
        m23365c5.recycle();
        return latLng;
    }

    @Override // p000.ZO1
    /* renamed from: t2 */
    public final WO1 mo44335t2(LatLng latLng) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        Parcel m23365c5 = m23365c5(2, m23364d5);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }
}
