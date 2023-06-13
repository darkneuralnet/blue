package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: qe7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47583qe7 implements IInterface {

    /* renamed from: a */
    public final IBinder f105571a;

    /* renamed from: b */
    public final String f105572b;

    public C47583qe7(IBinder iBinder, String str) {
        this.f105571a = iBinder;
        this.f105572b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f105571a;
    }

    /* renamed from: c5 */
    public final Parcel m17273c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f105572b);
        return obtain;
    }

    /* renamed from: d5 */
    public final Parcel m17272d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f105571a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: e5 */
    public final void m17271e5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f105571a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
