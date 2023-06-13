package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p000.WO1;
/* renamed from: cu9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39444cu9 extends C45804ne7 implements Ew9 {
    public C39444cu9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // p000.Ew9
    /* renamed from: D4 */
    public final void mo44846D4(String str) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeString(str);
        m23363e5(5, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: F2 */
    public final void mo44845F2(float f, float f2) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23364d5.writeFloat(f2);
        m23363e5(24, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: K4 */
    public final boolean mo44844K4(Ew9 ew9) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, ew9);
        Parcel m23365c5 = m23365c5(16, m23364d5);
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.Ew9
    /* renamed from: W1 */
    public final void mo44843W1(float f, float f2) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23364d5.writeFloat(f2);
        m23363e5(19, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: X */
    public final void mo44842X(float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23363e5(27, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: a2 */
    public final void mo44841a2(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(29, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: b */
    public final void mo44840b() throws RemoteException {
        m23363e5(12, m23364d5());
    }

    @Override // p000.Ew9
    /* renamed from: c */
    public final String mo44839c() throws RemoteException {
        Parcel m23365c5 = m23365c5(2, m23364d5());
        String readString = m23365c5.readString();
        m23365c5.recycle();
        return readString;
    }

    @Override // p000.Ew9
    /* renamed from: e */
    public final void mo44838e() throws RemoteException {
        m23363e5(1, m23364d5());
    }

    @Override // p000.Ew9
    /* renamed from: k2 */
    public final void mo44837k2(float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23363e5(22, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: l4 */
    public final void mo44836l4(String str) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeString(str);
        m23363e5(7, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: m */
    public final void mo44835m() throws RemoteException {
        m23363e5(11, m23364d5());
    }

    @Override // p000.Ew9
    /* renamed from: m1 */
    public final void mo44834m1(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(9, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: n */
    public final void mo44833n(WO1 wo1) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23363e5(18, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: o */
    public final boolean mo44832o() throws RemoteException {
        Parcel m23365c5 = m23365c5(15, m23364d5());
        boolean m5285f = C51593xP7.m5285f(m23365c5);
        m23365c5.recycle();
        return m5285f;
    }

    @Override // p000.Ew9
    /* renamed from: p */
    public final void mo44831p(float f) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        m23364d5.writeFloat(f);
        m23363e5(25, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: q */
    public final void mo44830q(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(14, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: y1 */
    public final void mo44829y1(boolean z) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5289b(m23364d5, z);
        m23363e5(20, m23364d5);
    }

    @Override // p000.Ew9
    /* renamed from: z3 */
    public final void mo44828z3(LatLng latLng) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, latLng);
        m23363e5(3, m23364d5);
    }

    @Override // p000.Ew9
    public final int zzg() throws RemoteException {
        Parcel m23365c5 = m23365c5(17, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }

    @Override // p000.Ew9
    public final WO1 zzh() throws RemoteException {
        Parcel m23365c5 = m23365c5(30, m23364d5());
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.Ew9
    public final LatLng zzi() throws RemoteException {
        Parcel m23365c5 = m23365c5(4, m23364d5());
        LatLng latLng = (LatLng) C51593xP7.m5290a(m23365c5, LatLng.CREATOR);
        m23365c5.recycle();
        return latLng;
    }
}
