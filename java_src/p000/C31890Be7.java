package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Be7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31890Be7 implements IInterface {

    /* renamed from: a */
    public final IBinder f2632a;

    /* renamed from: b */
    public final String f2633b = "com.google.android.gms.recaptcha.internal.IRecaptchaService";

    public C31890Be7(IBinder iBinder, String str) {
        this.f2632a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2632a;
    }

    /* renamed from: c5 */
    public final Parcel m113738c5() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2633b);
        return obtain;
    }

    /* renamed from: d5 */
    public final void m113737d5(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2632a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
