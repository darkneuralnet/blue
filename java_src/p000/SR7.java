package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: SR7 */
/* loaded from: classes5.dex */
public abstract class SR7 extends DL7 implements InterfaceC42134hS7 {
    public SR7() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // p000.DL7
    /* renamed from: c5 */
    public final boolean mo75075c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            UL7.m81614c(parcel);
            mo30653W0((Bundle) UL7.m81616a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
