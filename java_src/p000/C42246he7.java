package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: he7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42246he7 implements IInterface {

    /* renamed from: a */
    public final IBinder f85628a;

    /* renamed from: b */
    public final String f85629b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C42246he7(IBinder iBinder, String str) {
        this.f85628a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f85628a;
    }

    /* renamed from: c5 */
    public final Parcel m36116c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f85629b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m36115d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f85628a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
