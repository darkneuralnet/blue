package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth.zzbw;
/* renamed from: yd9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52317yd9 extends C49964uf7 {
    public C52317yd9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    /* renamed from: c5 */
    public final void m3149c5(IStatusCallback iStatusCallback, zzbw zzbwVar) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, iStatusCallback);
        C51602xQ7.m5271c(zza, zzbwVar);
        zzc(2, zza);
    }

    /* renamed from: d5 */
    public final void m3148d5(CZ8 cz8, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, cz8);
        C51602xQ7.m5271c(zza, accountChangeEventsRequest);
        zzc(4, zza);
    }

    /* renamed from: e5 */
    public final void m3147e5(InterfaceC50857w99 interfaceC50857w99, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, interfaceC50857w99);
        C51602xQ7.m5271c(zza, account);
        zza.writeString(str);
        C51602xQ7.m5271c(zza, bundle);
        zzc(1, zza);
    }

    /* renamed from: f5 */
    public final void m3146f5(MN8 mn8, Account account) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, mn8);
        C51602xQ7.m5271c(zza, account);
        zzc(6, zza);
    }

    /* renamed from: g5 */
    public final void m3145g5(MN8 mn8, String str) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5270d(zza, mn8);
        zza.writeString(str);
        zzc(3, zza);
    }
}
