package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: wM7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC50973wM7 extends KB7 implements MM7 {
    public AbstractBinderC50973wM7() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC41508gP1 yn7;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                yn7 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (queryLocalInterface instanceof InterfaceC41508gP1) {
                    yn7 = (InterfaceC41508gP1) queryLocalInterface;
                } else {
                    yn7 = new YN7(readStrongBinder);
                }
            }
            mo95396Z0(yn7);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
