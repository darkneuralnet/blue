package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Ah7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC31683Ah7 extends KB7 implements InterfaceC49401ti7 {
    public AbstractBinderC31683Ah7() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo11879a(Av9.m114831d5(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
