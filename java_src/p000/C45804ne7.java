package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ne7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45804ne7 implements IInterface {

    /* renamed from: a */
    public final IBinder f100273a;

    /* renamed from: b */
    public final String f100274b;

    public C45804ne7(IBinder iBinder, String str) {
        this.f100273a = iBinder;
        this.f100274b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f100273a;
    }

    /* renamed from: c5 */
    public final Parcel m23365c5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f100273a.transact(i, parcel, obtain, 0);
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

    /* renamed from: d5 */
    public final Parcel m23364d5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f100274b);
        return obtain;
    }

    /* renamed from: e5 */
    public final void m23363e5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f100273a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
