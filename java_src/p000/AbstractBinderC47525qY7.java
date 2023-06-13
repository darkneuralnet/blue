package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* renamed from: qY7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC47525qY7 extends IB7 implements InterfaceC43895kQ7 {
    public AbstractBinderC47525qY7() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static InterfaceC43895kQ7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof InterfaceC43895kQ7) {
            return (InterfaceC43895kQ7) queryLocalInterface;
        }
        return new C41933h68(iBinder);
    }

    @Override // p000.IB7
    /* renamed from: c5 */
    public final boolean mo17460c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                    } else {
                        long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(longFlagValue);
                    }
                } else {
                    int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(intFlagValue);
                }
            } else {
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C50407vP7.m8737b(parcel), parcel.readInt());
                parcel2.writeNoException();
                C50407vP7.m8738a(parcel2, booleanFlagValue);
            }
        } else {
            init(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
