package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public abstract class zza extends DB7 implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzc(C51602xQ7.m5269e(parcel));
        } else {
            zzb((Account) C51602xQ7.m5273a(parcel, Account.CREATOR));
        }
        return true;
    }
}
