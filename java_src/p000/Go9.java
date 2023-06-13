package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Go9 */
/* loaded from: classes6.dex */
public abstract class Go9 extends KB7 implements Gq9 {
    public Go9() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
