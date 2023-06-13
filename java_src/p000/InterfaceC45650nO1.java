package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
import p000.InterfaceC45057mO1;
/* renamed from: nO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45650nO1 extends IInterface {

    /* renamed from: nO1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC26468a extends Binder implements InterfaceC45650nO1 {

        /* renamed from: nO1$a$a */
        /* loaded from: classes.dex */
        public static class C26469a implements InterfaceC45650nO1 {

            /* renamed from: a */
            public IBinder f99857a;

            public C26469a(IBinder iBinder) {
                this.f99857a = iBinder;
            }

            @Override // p000.InterfaceC45650nO1
            /* renamed from: Q */
            public boolean mo23913Q(InterfaceC45057mO1 interfaceC45057mO1) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC45057mO1);
                    boolean z = false;
                    this.f99857a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45650nO1
            /* renamed from: Z */
            public boolean mo23912Z(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC45057mO1);
                    boolean z = false;
                    C26470b.m23906d(obtain, bundle, 0);
                    this.f99857a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f99857a;
            }

            @Override // p000.InterfaceC45650nO1
            /* renamed from: c1 */
            public boolean mo23911c1(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f99857a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC45650nO1
            /* renamed from: t1 */
            public boolean mo23910t1(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongInterface(interfaceC45057mO1);
                    boolean z = false;
                    C26470b.m23906d(obtain, uri, 0);
                    C26470b.m23906d(obtain, bundle, 0);
                    obtain.writeTypedList(list);
                    this.f99857a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC26468a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: c5 */
        public static InterfaceC45650nO1 m23914c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC45650nO1)) {
                return (InterfaceC45650nO1) queryLocalInterface;
            }
            return new C26469a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
            }
            if (i != 1598968902) {
                switch (i) {
                    case 2:
                        boolean mo23911c1 = mo23911c1(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23911c1 ? 1 : 0);
                        break;
                    case 3:
                        boolean mo23913Q = mo23913Q(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23913Q ? 1 : 0);
                        break;
                    case 4:
                        Parcelable.Creator creator = Bundle.CREATOR;
                        boolean mo23910t1 = mo23910t1(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Uri) C26470b.m23907c(parcel, Uri.CREATOR), (Bundle) C26470b.m23907c(parcel, creator), parcel.createTypedArrayList(creator));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23910t1 ? 1 : 0);
                        break;
                    case 5:
                        Bundle mo23916w2 = mo23916w2(parcel.readString(), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        C26470b.m23906d(parcel2, mo23916w2, 1);
                        break;
                    case 6:
                        boolean mo23921F3 = mo23921F3(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23921F3 ? 1 : 0);
                        break;
                    case 7:
                        boolean mo23918o1 = mo23918o1(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Uri) C26470b.m23907c(parcel, Uri.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23918o1 ? 1 : 0);
                        break;
                    case 8:
                        int mo23920H0 = mo23920H0(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), parcel.readString(), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23920H0);
                        break;
                    case 9:
                        boolean mo23917q3 = mo23917q3(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), parcel.readInt(), (Uri) C26470b.m23907c(parcel, Uri.CREATOR), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23917q3 ? 1 : 0);
                        break;
                    case 10:
                        boolean mo23912Z = mo23912Z(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23912Z ? 1 : 0);
                        break;
                    case 11:
                        boolean mo23919J3 = mo23919J3(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Uri) C26470b.m23907c(parcel, Uri.CREATOR), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23919J3 ? 1 : 0);
                        break;
                    case 12:
                        boolean mo23915x4 = mo23915x4(InterfaceC45057mO1.AbstractBinderC26081a.m25690c5(parcel.readStrongBinder()), (Uri) C26470b.m23907c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) C26470b.m23907c(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(mo23915x4 ? 1 : 0);
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
                return true;
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
    }

    /* renamed from: nO1$b */
    /* loaded from: classes.dex */
    public static class C26470b {
        /* renamed from: c */
        public static <T> T m23907c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m23906d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: F3 */
    boolean mo23921F3(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) throws RemoteException;

    /* renamed from: H0 */
    int mo23920H0(InterfaceC45057mO1 interfaceC45057mO1, String str, Bundle bundle) throws RemoteException;

    /* renamed from: J3 */
    boolean mo23919J3(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: Q */
    boolean mo23913Q(InterfaceC45057mO1 interfaceC45057mO1) throws RemoteException;

    /* renamed from: Z */
    boolean mo23912Z(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) throws RemoteException;

    /* renamed from: c1 */
    boolean mo23911c1(long j) throws RemoteException;

    /* renamed from: o1 */
    boolean mo23918o1(InterfaceC45057mO1 interfaceC45057mO1, Uri uri) throws RemoteException;

    /* renamed from: q3 */
    boolean mo23917q3(InterfaceC45057mO1 interfaceC45057mO1, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: t1 */
    boolean mo23910t1(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: w2 */
    Bundle mo23916w2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: x4 */
    boolean mo23915x4(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, int i, Bundle bundle) throws RemoteException;
}
