package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: PP7 */
/* loaded from: classes6.dex */
public abstract class PP7 extends KB7 implements XX7 {
    public PP7() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzb();
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}
