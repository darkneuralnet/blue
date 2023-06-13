package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: It7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC33663It7 extends KB7 implements InterfaceC51299wu7 {
    public AbstractBinderC33663It7() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC49207tO1 c44699lm8;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c44699lm8 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof InterfaceC49207tO1) {
                    c44699lm8 = (InterfaceC49207tO1) queryLocalInterface;
                } else {
                    c44699lm8 = new C44699lm8(readStrongBinder);
                }
            }
            mo6121H4(c44699lm8);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
