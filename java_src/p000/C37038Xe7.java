package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Xe7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37038Xe7 implements IInterface {

    /* renamed from: a */
    public final IBinder f43499a;

    /* renamed from: b */
    public final String f43500b = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    public C37038Xe7(IBinder iBinder, String str) {
        this.f43499a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f43499a;
    }

    /* renamed from: c5 */
    public final Parcel m76736c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f43500b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m76735d5(int i, Parcel parcel) throws RemoteException {
        try {
            this.f43499a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
