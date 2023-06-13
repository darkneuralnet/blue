package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ms9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC45353ms9 extends KB7 implements Ot9 {
    public AbstractBinderC45353ms9() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo26707g(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
