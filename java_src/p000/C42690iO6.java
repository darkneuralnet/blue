package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: iO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42690iO6 implements IInterface {

    /* renamed from: a */
    public final IBinder f87234a;

    /* renamed from: b */
    public final String f87235b;

    public C42690iO6(IBinder iBinder, String str) {
        this.f87234a = iBinder;
        this.f87235b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f87234a;
    }

    /* renamed from: c5 */
    public final Parcel m34028c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f87235b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m34027d5(int i, Parcel parcel) throws RemoteException {
        try {
            this.f87234a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
