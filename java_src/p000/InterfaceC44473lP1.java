package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: lP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC44473lP1 extends IInterface {

    /* renamed from: lP1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC25693a extends Binder implements InterfaceC44473lP1 {
        public AbstractBinderC25693a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            }
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        Bundle mo27327o0 = mo27327o0((Bundle) C25694b.m27323c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        C25694b.m27322d(parcel2, mo27327o0, 1);
                        break;
                    case 3:
                        mo27330I4((Bundle) C25694b.m27323c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int mo27326y4 = mo27326y4();
                        parcel2.writeNoException();
                        parcel2.writeInt(mo27326y4);
                        break;
                    case 5:
                        Bundle mo27328W3 = mo27328W3();
                        parcel2.writeNoException();
                        C25694b.m27322d(parcel2, mo27328W3, 1);
                        break;
                    case 6:
                        Bundle mo27332B4 = mo27332B4((Bundle) C25694b.m27323c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        C25694b.m27322d(parcel2, mo27332B4, 1);
                        break;
                    case 7:
                        Bundle mo27329Q2 = mo27329Q2();
                        parcel2.writeNoException();
                        C25694b.m27322d(parcel2, mo27329Q2, 1);
                        break;
                    case 8:
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                    case 9:
                        Bundle mo27331C2 = mo27331C2(parcel.readString(), (Bundle) C25694b.m27323c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        C25694b.m27322d(parcel2, mo27331C2, 1);
                        break;
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
            return true;
        }
    }

    /* renamed from: lP1$b */
    /* loaded from: classes.dex */
    public static class C25694b {
        /* renamed from: c */
        public static <T> T m27323c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m27322d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: B4 */
    Bundle mo27332B4(Bundle bundle) throws RemoteException;

    /* renamed from: C2 */
    Bundle mo27331C2(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    /* renamed from: I4 */
    void mo27330I4(Bundle bundle) throws RemoteException;

    /* renamed from: Q2 */
    Bundle mo27329Q2() throws RemoteException;

    /* renamed from: W3 */
    Bundle mo27328W3() throws RemoteException;

    /* renamed from: o0 */
    Bundle mo27327o0(Bundle bundle) throws RemoteException;

    /* renamed from: y4 */
    int mo27326y4() throws RemoteException;
}
