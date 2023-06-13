package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p000.WO1;
/* renamed from: HZ8 */
/* loaded from: classes5.dex */
public final class HZ8 extends C45804ne7 implements C99 {
    public HZ8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // p000.C99
    /* renamed from: A3 */
    public final void mo103726A3(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(15, m23364d5);
    }

    @Override // p000.C99
    /* renamed from: N1 */
    public final boolean mo103725N1(C99 c99) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, c99);
        Parcel m23365c5 = m23365c5(19, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.C99
    /* renamed from: P0 */
    public final void mo103724P0(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(24, m23364d5);
    }

    @Override // p000.C99
    /* renamed from: P2 */
    public final void mo103723P2(LatLng latLng) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        m23363e5(3, m23364d5);
    }

    @Override // p000.C99
    /* renamed from: c */
    public final WO1 mo103722c() throws RemoteException {
        Parcel m23365c5 = m23365c5(25, m23364d5());
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.C99
    /* renamed from: e */
    public final void mo103721e() throws RemoteException {
        m23363e5(1, m23364d5());
    }

    @Override // p000.C99
    /* renamed from: g1 */
    public final void mo103720g1(float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23363e5(5, m23364d5);
    }

    @Override // p000.C99
    /* renamed from: m */
    public final boolean mo103719m() throws RemoteException {
        Parcel m23365c5 = m23365c5(16, m23364d5());
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.C99
    /* renamed from: n */
    public final void mo103718n(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(21, m23364d5);
    }

    @Override // p000.C99
    /* renamed from: p */
    public final void mo103717p(float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23363e5(11, m23364d5);
    }

    @Override // p000.C99
    public final int zzi() throws RemoteException {
        Parcel m23365c5 = m23365c5(20, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }
}
