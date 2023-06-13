package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.InterfaceC46836pO1;
/* renamed from: qO1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC47429qO1 extends IInterface {

    /* renamed from: qO1$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBinderC27593a extends Binder implements InterfaceC47429qO1 {

        /* renamed from: qO1$a$a */
        /* loaded from: classes6.dex */
        public static class C27594a implements InterfaceC47429qO1 {

            /* renamed from: b */
            public static InterfaceC47429qO1 f105238b;

            /* renamed from: a */
            public IBinder f105239a;

            public C27594a(IBinder iBinder) {
                this.f105239a = iBinder;
            }

            @Override // p000.InterfaceC47429qO1
            /* renamed from: L3 */
            public void mo17570L3(InterfaceC46836pO1 interfaceC46836pO1, String str) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (interfaceC46836pO1 != null) {
                        iBinder = interfaceC46836pO1.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.f105239a.transact(1, obtain, obtain2, 0) && AbstractBinderC27593a.m17571d5() != null) {
                        AbstractBinderC27593a.m17571d5().mo17570L3(interfaceC46836pO1, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f105239a;
            }

            @Override // p000.InterfaceC47429qO1
            /* renamed from: y2 */
            public void mo17569y2(InterfaceC46836pO1 interfaceC46836pO1, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (interfaceC46836pO1 != null) {
                        iBinder = interfaceC46836pO1.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f105239a.transact(2, obtain, obtain2, 0) && AbstractBinderC27593a.m17571d5() != null) {
                        AbstractBinderC27593a.m17571d5().mo17569y2(interfaceC46836pO1, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC27593a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        }

        /* renamed from: c5 */
        public static InterfaceC47429qO1 m17572c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC47429qO1)) {
                return (InterfaceC47429qO1) queryLocalInterface;
            }
            return new C27594a(iBinder);
        }

        /* renamed from: d5 */
        public static InterfaceC47429qO1 m17571d5() {
            return C27594a.f105238b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    return true;
                }
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                InterfaceC46836pO1 m19356c5 = InterfaceC46836pO1.AbstractBinderC27282a.m19356c5(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo17569y2(m19356c5, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            mo17570L3(InterfaceC46836pO1.AbstractBinderC27282a.m19356c5(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: L3 */
    void mo17570L3(InterfaceC46836pO1 interfaceC46836pO1, String str) throws RemoteException;

    /* renamed from: y2 */
    void mo17569y2(InterfaceC46836pO1 interfaceC46836pO1, Bundle bundle) throws RemoteException;
}
