package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
/* renamed from: o68  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46084o68 extends C45804ne7 implements InterfaceC49955ue8 {
    public C46084o68(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p000.InterfaceC49955ue8
    /* renamed from: G0 */
    public final void mo9917G0(WO1 wo1, int i) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23364d5.writeInt(i);
        m23363e5(10, m23364d5);
    }

    @Override // p000.InterfaceC49955ue8
    /* renamed from: O0 */
    public final void mo9916O0(WO1 wo1, int i) throws RemoteException {
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        m23364d5.writeInt(i);
        m23363e5(6, m23364d5);
    }

    @Override // p000.InterfaceC49955ue8
    /* renamed from: Z1 */
    public final InterfaceC42101hP1 mo9915Z1(WO1 wo1, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        InterfaceC42101hP1 bo7;
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        C51593xP7.m5288c(m23364d5, streetViewPanoramaOptions);
        Parcel m23365c5 = m23365c5(7, m23364d5);
        IBinder readStrongBinder = m23365c5.readStrongBinder();
        if (readStrongBinder == null) {
            bo7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (queryLocalInterface instanceof InterfaceC42101hP1) {
                bo7 = (InterfaceC42101hP1) queryLocalInterface;
            } else {
                bo7 = new BO7(readStrongBinder);
            }
        }
        m23365c5.recycle();
        return bo7;
    }

    @Override // p000.InterfaceC49955ue8
    /* renamed from: c */
    public final MA8 mo9914c() throws RemoteException {
        Parcel m23365c5 = m23365c5(5, m23364d5());
        MA8 m98198d5 = AbstractBinderC34132Kt8.m98198d5(m23365c5.readStrongBinder());
        m23365c5.recycle();
        return m98198d5;
    }

    @Override // p000.InterfaceC49955ue8
    /* renamed from: f3 */
    public final QO1 mo9913f3(WO1 wo1, GoogleMapOptions googleMapOptions) throws RemoteException {
        QO1 c51037wT8;
        Parcel m23364d5 = m23364d5();
        C51593xP7.m5286e(m23364d5, wo1);
        C51593xP7.m5288c(m23364d5, googleMapOptions);
        Parcel m23365c5 = m23365c5(3, m23364d5);
        IBinder readStrongBinder = m23365c5.readStrongBinder();
        if (readStrongBinder == null) {
            c51037wT8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof QO1) {
                c51037wT8 = (QO1) queryLocalInterface;
            } else {
                c51037wT8 = new C51037wT8(readStrongBinder);
            }
        }
        m23365c5.recycle();
        return c51037wT8;
    }

    @Override // p000.InterfaceC49955ue8
    public final int zzd() throws RemoteException {
        Parcel m23365c5 = m23365c5(9, m23364d5());
        int readInt = m23365c5.readInt();
        m23365c5.recycle();
        return readInt;
    }

    @Override // p000.InterfaceC49955ue8
    public final InterfaceC42685iO1 zze() throws RemoteException {
        InterfaceC42685iO1 c39008cC7;
        Parcel m23365c5 = m23365c5(4, m23364d5());
        IBinder readStrongBinder = m23365c5.readStrongBinder();
        if (readStrongBinder == null) {
            c39008cC7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof InterfaceC42685iO1) {
                c39008cC7 = (InterfaceC42685iO1) queryLocalInterface;
            } else {
                c39008cC7 = new C39008cC7(readStrongBinder);
            }
        }
        m23365c5.recycle();
        return c39008cC7;
    }
}
