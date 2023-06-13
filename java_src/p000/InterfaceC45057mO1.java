package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: mO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45057mO1 extends IInterface {

    /* renamed from: mO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC26081a extends Binder implements InterfaceC45057mO1 {

        /* renamed from: mO1$a$a */
        /* loaded from: classes.dex */
        public static class C26082a implements InterfaceC45057mO1 {

            /* renamed from: a */
            public IBinder f97939a;

            public C26082a(IBinder iBinder) {
                this.f97939a = iBinder;
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: D1 */
            public void mo8954D1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: P */
            public Bundle mo8953P(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) C26083b.m25687c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: U4 */
            public void mo8952U4(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: X4 */
            public void mo8951X4(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: Y4 */
            public void mo8950Y4(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    C26083b.m25686d(obtain, uri, 0);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: a3 */
            public void mo8949a3(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f97939a;
            }

            @Override // p000.InterfaceC45057mO1
            /* renamed from: h1 */
            public void mo8948h1(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    C26083b.m25686d(obtain, bundle, 0);
                    this.f97939a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC26081a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: c5 */
        public static InterfaceC45057mO1 m25690c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC45057mO1)) {
                return (InterfaceC45057mO1) queryLocalInterface;
            }
            return new C26082a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        mo8954D1(parcel.readInt(), (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        break;
                    case 3:
                        mo8949a3(parcel.readString(), (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        break;
                    case 4:
                        mo8951X4((Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 5:
                        mo8952U4(parcel.readString(), (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 6:
                        int readInt = parcel.readInt();
                        Uri uri = (Uri) C26083b.m25687c(parcel, Uri.CREATOR);
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mo8950Y4(readInt, uri, z, (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        break;
                    case 7:
                        Bundle mo8953P = mo8953P(parcel.readString(), (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        C26083b.m25686d(parcel2, mo8953P, 1);
                        break;
                    case 8:
                        mo8948h1(parcel.readInt(), parcel.readInt(), (Bundle) C26083b.m25687c(parcel, Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }

    /* renamed from: mO1$b */
    /* loaded from: classes.dex */
    public static class C26083b {
        /* renamed from: c */
        public static <T> T m25687c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m25686d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: D1 */
    void mo8954D1(int i, Bundle bundle) throws RemoteException;

    /* renamed from: P */
    Bundle mo8953P(String str, Bundle bundle) throws RemoteException;

    /* renamed from: U4 */
    void mo8952U4(String str, Bundle bundle) throws RemoteException;

    /* renamed from: X4 */
    void mo8951X4(Bundle bundle) throws RemoteException;

    /* renamed from: Y4 */
    void mo8950Y4(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: a3 */
    void mo8949a3(String str, Bundle bundle) throws RemoteException;

    /* renamed from: h1 */
    void mo8948h1(int i, int i2, Bundle bundle) throws RemoteException;
}
