package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* renamed from: wT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51037wT8 extends C45804ne7 implements QO1 {
    public C51037wT8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p000.QO1
    /* renamed from: S4 */
    public final void mo6787S4(InterfaceC51299wu7 interfaceC51299wu7) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, interfaceC51299wu7);
        m23363e5(9, m23364d5);
    }

    @Override // p000.QO1
    public final WO1 getView() throws RemoteException {
        Parcel m23365c5 = m23365c5(8, m23364d5());
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m78501c5;
    }

    @Override // p000.QO1
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, bundle);
        m23363e5(2, m23364d5);
    }

    @Override // p000.QO1
    public final void onDestroy() throws RemoteException {
        m23363e5(5, m23364d5());
    }

    @Override // p000.QO1
    public final void onLowMemory() throws RemoteException {
        m23363e5(6, m23364d5());
    }

    @Override // p000.QO1
    public final void onPause() throws RemoteException {
        m23363e5(4, m23364d5());
    }

    @Override // p000.QO1
    public final void onResume() throws RemoteException {
        m23363e5(3, m23364d5());
    }

    @Override // p000.QO1
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5288c(m23364d5, bundle);
        Parcel m23365c5 = m23365c5(7, m23364d5);
        if (m23365c5.readInt() != 0) {
            bundle.readFromParcel(m23365c5);
        }
        m23365c5.recycle();
    }

    @Override // p000.QO1
    public final void onStart() throws RemoteException {
        m23363e5(12, m23364d5());
    }

    @Override // p000.QO1
    public final void onStop() throws RemoteException {
        m23363e5(13, m23364d5());
    }
}
