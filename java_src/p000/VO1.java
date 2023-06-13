package p000;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: VO1 */
/* loaded from: classes.dex */
public interface VO1 extends IInterface {

    /* renamed from: VO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC8645a extends Binder implements VO1 {

        /* renamed from: VO1$a$a */
        /* loaded from: classes.dex */
        public static class C8646a implements VO1 {

            /* renamed from: a */
            public IBinder f39049a;

            public C8646a(IBinder iBinder) {
                this.f39049a = iBinder;
            }

            @Override // p000.VO1
            /* renamed from: Y1 */
            public void mo79897Y1(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C8647b.m79891d(obtain, notification, 0);
                    this.f39049a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39049a;
            }

            @Override // p000.VO1
            /* renamed from: g0 */
            public void mo79896g0(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f39049a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p000.VO1
            /* renamed from: j4 */
            public void mo79895j4(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f39049a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC8645a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: c5 */
        public static VO1 m79898c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && (queryLocalInterface instanceof VO1)) {
                return (VO1) queryLocalInterface;
            }
            return new C8646a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        mo79895j4(parcel.readString());
                    } else {
                        mo79896g0(parcel.readString(), parcel.readInt(), parcel.readString());
                    }
                } else {
                    mo79897Y1(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C8647b.m79892c(parcel, Notification.CREATOR));
                }
                return true;
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        }
    }

    /* renamed from: VO1$b */
    /* loaded from: classes.dex */
    public static class C8647b {
        /* renamed from: c */
        public static <T> T m79892c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m79891d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: Y1 */
    void mo79897Y1(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: g0 */
    void mo79896g0(String str, int i, String str2) throws RemoteException;

    /* renamed from: j4 */
    void mo79895j4(String str) throws RemoteException;
}
