package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ue7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49954ue7 implements IInterface {

    /* renamed from: a */
    public final IBinder f112709a;

    /* renamed from: b */
    public final String f112710b;

    public C49954ue7(IBinder iBinder, String str) {
        this.f112709a = iBinder;
        this.f112710b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f112709a;
    }

    /* renamed from: c5 */
    public final Parcel m9920c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f112710b);
        return obtain;
    }

    /* renamed from: d5 */
    public final Parcel m9919d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f112709a.transact(i, parcel, obtain, 0);
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
    public final void m9918e5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f112709a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
