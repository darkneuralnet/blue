package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Fe7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32826Fe7 implements IInterface {

    /* renamed from: a */
    public final IBinder f9917a;

    /* renamed from: b */
    public final String f9918b;

    public C32826Fe7(IBinder iBinder, String str) {
        this.f9917a = iBinder;
        this.f9918b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9917a;
    }

    /* renamed from: c5 */
    public final Parcel m106773c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9918b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m106772d5(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9917a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
