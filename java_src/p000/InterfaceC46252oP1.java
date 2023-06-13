package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.InterfaceC45659nP1;
/* renamed from: oP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC46252oP1 extends IInterface {

    /* renamed from: oP1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC26933a extends Binder implements InterfaceC46252oP1 {
        public AbstractBinderC26933a() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            if (i != 1598968902) {
                if (i != 1) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo21218n2(InterfaceC45659nP1.AbstractBinderC26491a.m23847c5(parcel.readStrongBinder()));
                return true;
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
    }

    /* renamed from: n2 */
    void mo21218n2(InterfaceC45659nP1 interfaceC45659nP1) throws RemoteException;
}
