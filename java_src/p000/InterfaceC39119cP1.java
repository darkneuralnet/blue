package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: cP1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC39119cP1 extends IInterface {

    /* renamed from: cP1$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractBinderC13540a extends Binder implements InterfaceC39119cP1 {

        /* renamed from: cP1$a$a */
        /* loaded from: classes5.dex */
        public static class C13541a implements InterfaceC39119cP1 {

            /* renamed from: b */
            public static InterfaceC39119cP1 f60540b;

            /* renamed from: a */
            public IBinder f60541a;

            public C13541a(IBinder iBinder) {
                this.f60541a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60541a;
            }

            @Override // p000.InterfaceC39119cP1
            /* renamed from: g2 */
            public int mo61429g2(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f60541a.transact(1, obtain, obtain2, 0) && AbstractBinderC13540a.m61430d5() != null) {
                        return AbstractBinderC13540a.m61430d5().mo61429g2(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC13540a() {
            attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
        }

        /* renamed from: c5 */
        public static InterfaceC39119cP1 m61431c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC39119cP1)) {
                return (InterfaceC39119cP1) queryLocalInterface;
            }
            return new C13541a(iBinder);
        }

        /* renamed from: d5 */
        public static InterfaceC39119cP1 m61430d5() {
            return C13541a.f60540b;
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
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
            parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            int mo61429g2 = mo61429g2(bundle);
            parcel2.writeNoException();
            parcel2.writeInt(mo61429g2);
            return true;
        }
    }

    /* renamed from: g2 */
    int mo61429g2(Bundle bundle) throws RemoteException;
}
