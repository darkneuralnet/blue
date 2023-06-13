package p000;

import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Tw7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC36264Tw7 extends KB7 implements InterfaceC33465Hx7 {
    public AbstractBinderC36264Tw7() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                mo64825r(Av9.m114831d5(parcel.readStrongBinder()));
            } else {
                mo64826a(Av9.m114831d5(parcel.readStrongBinder()));
            }
        } else {
            mo64827C4(Av9.m114831d5(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
