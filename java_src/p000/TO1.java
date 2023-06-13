package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: TO1 */
/* loaded from: classes.dex */
public interface TO1 extends IInterface {

    /* renamed from: TO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC7822a extends Binder implements TO1 {

        /* renamed from: TO1$a$a */
        /* loaded from: classes.dex */
        public static class C7823a implements TO1 {

            /* renamed from: a */
            public IBinder f35401a;

            public C7823a(IBinder iBinder) {
                this.f35401a = iBinder;
            }

            @Override // p000.TO1
            /* renamed from: G */
            public void mo83702G(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f35401a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f35401a;
            }
        }

        public AbstractBinderC7822a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: c5 */
        public static TO1 m83703c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof TO1)) {
                return (TO1) queryLocalInterface;
            }
            return new C7823a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo83702G(parcel.createStringArray());
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: G */
    void mo83702G(String[] strArr) throws RemoteException;
}
