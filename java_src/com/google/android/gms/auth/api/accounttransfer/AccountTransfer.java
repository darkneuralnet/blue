package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
/* loaded from: classes5.dex */
public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    public static final Api<zzq> zza;
    @Deprecated
    public static final C46537os7 zzb;
    @Deprecated
    public static final C46537os7 zzc;
    private static final Api.ClientKey<C41210ft7> zzd;
    private static final Api.AbstractClientBuilder<C41210ft7, zzq> zze;

    static {
        Api.ClientKey<C41210ft7> clientKey = new Api.ClientKey<>();
        zzd = clientKey;
        zza zzaVar = new zza();
        zze = zzaVar;
        zza = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        zzb = new C46537os7();
        zzc = new C46537os7();
    }

    private AccountTransfer() {
    }

    public static AccountTransferClient getAccountTransferClient(Activity activity) {
        return new AccountTransferClient(activity, (zzq) null);
    }

    public static AccountTransferClient getAccountTransferClient(Context context) {
        return new AccountTransferClient(context, (zzq) null);
    }
}
