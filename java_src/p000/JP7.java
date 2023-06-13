package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: JP7 */
/* loaded from: classes5.dex */
public class JP7 implements IInterface {
    private final IBinder zzc;
    private final String zzd;

    public JP7(IBinder iBinder, String str) {
        this.zzc = iBinder;
        this.zzd = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzc;
    }

    public final Parcel zzb() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzd);
        return obtain;
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzc.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
