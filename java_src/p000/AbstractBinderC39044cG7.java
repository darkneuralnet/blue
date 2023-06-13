package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: cG7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39044cG7 extends KB7 implements UG7 {
    public AbstractBinderC39044cG7() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31052A(Iy9.m101413d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
