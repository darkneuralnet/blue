package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
/* renamed from: PI7 */
/* loaded from: classes5.dex */
public final class PI7 extends C49964uf7 {
    public PI7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: c5 */
    public final void m90486c5(XH7 xh7) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, xh7);
        zzc(3, zza);
    }

    /* renamed from: d5 */
    public final void m90485d5(XH7 xh7, ProxyRequest proxyRequest) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, xh7);
        C51602xQ7.m5271c(zza, proxyRequest);
        zzc(1, zza);
    }
}
