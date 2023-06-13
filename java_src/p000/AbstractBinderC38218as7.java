package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: as7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC38218as7 extends KB7 implements InterfaceC35994Ss7 {
    public AbstractBinderC38218as7() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo7622h((LatLng) C51593xP7.m5290a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
