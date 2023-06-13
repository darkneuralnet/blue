package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes5.dex */
public abstract class zzd extends DB7 implements zze {
    public static zze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof zze) {
            return (zze) queryLocalInterface;
        }
        return new zzc(iBinder);
    }
}
