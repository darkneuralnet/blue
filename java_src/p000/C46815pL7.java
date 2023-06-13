package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: pL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46815pL7 implements IInterface {

    /* renamed from: a */
    public final IBinder f103541a;

    /* renamed from: b */
    public final String f103542b;

    public C46815pL7(IBinder iBinder, String str) {
        this.f103541a = iBinder;
        this.f103542b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f103541a;
    }

    /* renamed from: c5 */
    public final Parcel m19441c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f103542b);
        return obtain;
    }

    /* renamed from: d5 */
    public final Parcel m19440d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f103541a.transact(i, parcel, obtain, 0);
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
    public final void m19439e5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f103541a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
