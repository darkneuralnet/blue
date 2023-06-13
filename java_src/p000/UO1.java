package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.TO1;
/* renamed from: UO1 */
/* loaded from: classes.dex */
public interface UO1 extends IInterface {

    /* renamed from: UO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC8272a extends Binder implements UO1 {

        /* renamed from: UO1$a$a */
        /* loaded from: classes.dex */
        public static class C8273a implements UO1 {

            /* renamed from: a */
            public IBinder f37318a;

            public C8273a(IBinder iBinder) {
                this.f37318a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37318a;
            }

            @Override // p000.UO1
            /* renamed from: r2 */
            public int mo66082r2(TO1 to1, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(to1);
                    obtain.writeString(str);
                    this.f37318a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.UO1
            /* renamed from: x3 */
            public void mo66081x3(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f37318a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8272a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: c5 */
        public static UO1 m81568c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof UO1)) {
                return (UO1) queryLocalInterface;
            }
            return new C8273a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        mo66081x3(parcel.readInt(), parcel.createStringArray());
                    } else {
                        mo66083Q4(TO1.AbstractBinderC7822a.m83703c5(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    int mo66082r2 = mo66082r2(TO1.AbstractBinderC7822a.m83703c5(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo66082r2);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: Q4 */
    void mo66083Q4(TO1 to1, int i) throws RemoteException;

    /* renamed from: r2 */
    int mo66082r2(TO1 to1, String str) throws RemoteException;

    /* renamed from: x3 */
    void mo66081x3(int i, String[] strArr) throws RemoteException;
}
