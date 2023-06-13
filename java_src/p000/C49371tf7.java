package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: tf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49371tf7 implements IInterface {

    /* renamed from: a */
    public final IBinder f110853a;

    /* renamed from: b */
    public final String f110854b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C49371tf7(IBinder iBinder, String str) {
        this.f110853a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f110853a;
    }

    /* renamed from: c5 */
    public final Parcel m11953c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f110854b);
        return obtain;
    }

    /* renamed from: d5 */
    public final Parcel m11952d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f110853a.transact(i, parcel, obtain, 0);
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
}
