package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: ie7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42839ie7 implements IInterface {

    /* renamed from: a */
    public final IBinder f87691a;

    /* renamed from: b */
    public final String f87692b;

    public C42839ie7(IBinder iBinder, String str) {
        this.f87691a = iBinder;
        this.f87692b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f87691a;
    }

    /* renamed from: c5 */
    public final Parcel m33625c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f87692b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m33624d5(int i, Parcel parcel) throws RemoteException {
        try {
            this.f87691a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
