package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: nP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45659nP1 extends IInterface {

    /* renamed from: nP1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC26491a extends Binder implements InterfaceC45659nP1 {

        /* renamed from: nP1$a$a */
        /* loaded from: classes.dex */
        public static class C26492a implements InterfaceC45659nP1 {

            /* renamed from: a */
            public IBinder f99899a;

            public C26492a(IBinder iBinder) {
                this.f99899a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f99899a;
            }
        }

        public AbstractBinderC26491a() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }

        /* renamed from: c5 */
        public static InterfaceC45659nP1 m23847c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC45659nP1)) {
                return (InterfaceC45659nP1) queryLocalInterface;
            }
            return new C26492a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                m23848n3(z, z2);
                return true;
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return true;
        }
    }

    /* renamed from: n3 */
    void m23848n3(boolean z, boolean z2) throws RemoteException;
}
