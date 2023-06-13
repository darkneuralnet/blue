package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC10923a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC10924a extends Binder implements InterfaceC10923a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* loaded from: classes.dex */
        public static class C10925a implements InterfaceC10923a {

            /* renamed from: a */
            public IBinder f51407a;

            public C10925a(IBinder iBinder) {
                this.f51407a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f51407a;
            }

            @Override // android.support.p001v4.p002os.InterfaceC10923a
            /* renamed from: z0 */
            public void mo70514z0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C10926b.m70510d(obtain, bundle, 0);
                    this.f51407a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC10924a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: c5 */
        public static InterfaceC10923a m70515c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10923a)) {
                return (InterfaceC10923a) queryLocalInterface;
            }
            return new C10925a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo70514z0(parcel.readInt(), (Bundle) C10926b.m70511c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    /* loaded from: classes.dex */
    public static class C10926b {
        /* renamed from: c */
        public static <T> T m70511c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m70510d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: z0 */
    void mo70514z0(int i, Bundle bundle) throws RemoteException;
}
