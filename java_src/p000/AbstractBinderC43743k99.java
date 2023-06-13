package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: k99  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC43743k99 extends KB7 implements InterfaceC44017kd9 {
    public AbstractBinderC43743k99() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
