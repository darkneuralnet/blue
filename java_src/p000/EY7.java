package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: EY7 */
/* loaded from: classes5.dex */
public final class EY7 extends C49371tf7 implements InterfaceC35869Se8 {
    public EY7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p000.InterfaceC35869Se8
    /* renamed from: H */
    public final boolean mo85160H(boolean z) throws RemoteException {
        Parcel m11953c5 = m11953c5();
        C51009wQ7.m6844a(m11953c5, true);
        Parcel m11952d5 = m11952d5(2, m11953c5);
        boolean m6843b = C51009wQ7.m6843b(m11952d5);
        m11952d5.recycle();
        return m6843b;
    }

    @Override // p000.InterfaceC35869Se8
    public final String zzc() throws RemoteException {
        Parcel m11952d5 = m11952d5(1, m11953c5());
        String readString = m11952d5.readString();
        m11952d5.recycle();
        return readString;
    }
}
