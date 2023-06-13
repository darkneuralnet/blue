package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: LH7 */
/* loaded from: classes6.dex */
public abstract class LH7 extends KB7 implements DI7 {
    public LH7() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30176Y0(AbstractBinderC33555Ih7.m101803d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
