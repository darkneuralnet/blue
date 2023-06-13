package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Eh9 */
/* loaded from: classes6.dex */
public abstract class Eh9 extends KB7 implements InterfaceC51211wl9 {
    public Eh9() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
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
