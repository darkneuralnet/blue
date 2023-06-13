package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: MS7 */
/* loaded from: classes5.dex */
public abstract class MS7 extends DL7 implements InterfaceC38568bT7 {
    public MS7() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p000.DL7
    /* renamed from: c5 */
    public final boolean mo75075c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else {
            long readLong = parcel.readLong();
            UL7.m81614c(parcel);
            mo8625u(parcel.readString(), parcel.readString(), (Bundle) UL7.m81616a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
