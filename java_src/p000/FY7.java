package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
/* renamed from: FY7 */
/* loaded from: classes5.dex */
public final class FY7 extends C49964uf7 implements InterfaceC36103Te8 {
    public FY7(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // p000.InterfaceC36103Te8
    /* renamed from: A1 */
    public final Bundle mo83233A1(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle bundle = (Bundle) C51602xQ7.m5273a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // p000.InterfaceC36103Te8
    /* renamed from: T3 */
    public final Bundle mo83232T3(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5271c(zza, account);
        zza.writeString(str);
        C51602xQ7.m5271c(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle bundle2 = (Bundle) C51602xQ7.m5273a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // p000.InterfaceC36103Te8
    /* renamed from: X0 */
    public final Bundle mo83231X0(Account account) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5271c(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle bundle = (Bundle) C51602xQ7.m5273a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // p000.InterfaceC36103Te8
    /* renamed from: b4 */
    public final AccountChangeEventsResponse mo83230b4(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        C51602xQ7.m5271c(zza, accountChangeEventsRequest);
        Parcel zzb = zzb(3, zza);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) C51602xQ7.m5273a(zzb, AccountChangeEventsResponse.CREATOR);
        zzb.recycle();
        return accountChangeEventsResponse;
    }

    @Override // p000.InterfaceC36103Te8
    /* renamed from: h3 */
    public final Bundle mo83229h3(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        C51602xQ7.m5271c(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle bundle2 = (Bundle) C51602xQ7.m5273a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }
}
