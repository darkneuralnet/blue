package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ye7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52325ye7 implements IInterface {

    /* renamed from: a */
    public final IBinder f119930a;

    /* renamed from: b */
    public final String f119931b;

    public C52325ye7(IBinder iBinder, String str) {
        this.f119930a = iBinder;
        this.f119931b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f119930a;
    }

    /* renamed from: c5 */
    public final Parcel m3041c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f119931b);
        return obtain;
    }

    /* renamed from: d5 */
    public final Parcel m3040d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f119930a.transact(i, parcel, obtain, 0);
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
    public final void m3039e5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f119930a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
