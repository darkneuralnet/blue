package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: sO1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC48614sO1 extends IInterface {

    /* renamed from: sO1$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC28297a extends Binder implements InterfaceC48614sO1 {

        /* renamed from: sO1$a$a */
        /* loaded from: classes5.dex */
        public static class C28298a implements InterfaceC48614sO1 {

            /* renamed from: a */
            public IBinder f108720a;

            public C28298a(IBinder iBinder) {
                this.f108720a = iBinder;
            }

            @Override // p000.InterfaceC48614sO1
            /* renamed from: E2 */
            public Bundle mo14246E2(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f108720a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f108720a;
            }
        }

        public AbstractBinderC28297a() {
            attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        /* renamed from: c5 */
        public static InterfaceC48614sO1 m14247c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC48614sO1)) {
                return (InterfaceC48614sO1) queryLocalInterface;
            }
            return new C28298a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return true;
            }
            parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            Bundle mo14246E2 = mo14246E2(bundle);
            parcel2.writeNoException();
            if (mo14246E2 != null) {
                parcel2.writeInt(1);
                mo14246E2.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    /* renamed from: E2 */
    Bundle mo14246E2(Bundle bundle) throws RemoteException;
}
