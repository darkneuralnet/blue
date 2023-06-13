package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p000.InterfaceC45057mO1;
/* renamed from: YO1 */
/* loaded from: classes.dex */
public interface YO1 extends IInterface {

    /* renamed from: YO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC9766a extends Binder implements YO1 {
        public AbstractBinderC9766a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            }
            if (i != 1598968902) {
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    mo69684N4(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), parcel.readString(), (Bundle) C9767b.m75125b(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                } else {
                    mo69685B3(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Bundle) C9767b.m75125b(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
    }

    /* renamed from: YO1$b */
    /* loaded from: classes.dex */
    public static class C9767b {
        /* renamed from: b */
        public static <T> T m75125b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: B3 */
    void mo69685B3(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) throws RemoteException;

    /* renamed from: N4 */
    void mo69684N4(InterfaceC45057mO1 interfaceC45057mO1, String str, Bundle bundle) throws RemoteException;
}
