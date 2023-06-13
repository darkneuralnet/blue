package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzj implements zzk<Boolean> {
    final /* synthetic */ String zza;

    public zzj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Boolean zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Logger logger;
        Bundle mo83233A1 = M68.m95812c5(iBinder).mo83233A1(this.zza);
        zzl.zzi(mo83233A1);
        String string = mo83233A1.getString("Error");
        Intent intent = (Intent) mo83233A1.getParcelable("userRecoveryIntent");
        EnumC39125cP7 m61423a = EnumC39125cP7.m61423a(string);
        if (EnumC39125cP7.SUCCESS.equals(m61423a)) {
            return Boolean.TRUE;
        }
        if (EnumC39125cP7.m61422b(m61423a)) {
            logger = zzl.zzd;
            String valueOf = String.valueOf(m61423a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            logger.m51596w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
