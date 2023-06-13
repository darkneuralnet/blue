package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: xx9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC51924xx9 extends KB7 implements InterfaceC51934xy9 {
    public AbstractBinderC51924xx9() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo4357S(AbstractBinderC40738f59.m42097d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
