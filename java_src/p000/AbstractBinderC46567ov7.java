package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ov7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC46567ov7 extends KB7 implements InterfaceC40054dw7 {
    public AbstractBinderC46567ov7() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean mo43477a = mo43477a(Av9.m114831d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C51593xP7.m5289b(parcel2, mo43477a);
            return true;
        }
        return false;
    }
}
