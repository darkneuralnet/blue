package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* renamed from: Jo7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC33852Jo7 extends KB7 implements InterfaceC31755Ap7 {
    public AbstractBinderC33852Jo7() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo6060h((LatLng) C51593xP7.m5290a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
