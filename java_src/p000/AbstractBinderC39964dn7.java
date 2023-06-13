package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
/* renamed from: dn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC39964dn7 extends KB7 implements InterfaceC36651Vn7 {
    public AbstractBinderC39964dn7() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: d5 */
    public static InterfaceC36651Vn7 m43710d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof InterfaceC36651Vn7) {
            return (InterfaceC36651Vn7) queryLocalInterface;
        }
        return new C43512jm7(iBinder);
    }

    @Override // p000.KB7
    /* renamed from: c5 */
    public final boolean mo4380c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Tile m79413Z2 = m79413Z2(parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            C51593xP7.m5287d(parcel2, m79413Z2);
            return true;
        }
        return false;
    }
}
