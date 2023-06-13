package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* renamed from: kP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC43880kP1 extends IInterface {

    /* renamed from: kP1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC25155a extends Binder implements InterfaceC43880kP1 {

        /* renamed from: kP1$a$a */
        /* loaded from: classes.dex */
        public static class C25156a implements InterfaceC43880kP1 {

            /* renamed from: a */
            public IBinder f94349a;

            public C25156a(IBinder iBinder) {
                this.f94349a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f94349a;
            }
        }

        public AbstractBinderC25155a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }

        /* renamed from: c5 */
        public static InterfaceC43880kP1 m29019c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC43880kP1)) {
                return (InterfaceC43880kP1) queryLocalInterface;
            }
            return new C25156a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            }
            if (i != 1598968902) {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                m29020W4(parcel.readString(), (Bundle) C25157b.m29017b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            return true;
        }
    }

    /* renamed from: kP1$b */
    /* loaded from: classes.dex */
    public static class C25157b {
        /* renamed from: b */
        public static <T> T m29017b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: W4 */
    void m29020W4(String str, Bundle bundle) throws RemoteException;
}
