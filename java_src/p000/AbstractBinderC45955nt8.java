package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: nt8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC45955nt8 extends KB7 implements InterfaceC45531nA8 {
    public AbstractBinderC45955nt8() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            WO1 mo11967a = mo11967a(Av9.m114831d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C51593xP7.m5286e(parcel2, mo11967a);
        } else {
            WO1 mo11966r = mo11966r(Av9.m114831d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C51593xP7.m5286e(parcel2, mo11966r);
        }
        return true;
    }
}
