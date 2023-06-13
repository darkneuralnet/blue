package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzh implements zzk<Void> {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;

    public zzh(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Void zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle mo83229h3 = M68.m95812c5(iBinder).mo83229h3(this.zza, this.zzb);
        zzl.zzi(mo83229h3);
        String string = mo83229h3.getString("Error");
        if (mo83229h3.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
