package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzi implements zzk<List<AccountChangeEvent>> {
    final /* synthetic */ AccountChangeEventsRequest zza;

    public zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ List<AccountChangeEvent> zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        AccountChangeEventsResponse mo83230b4 = M68.m95812c5(iBinder).mo83230b4(this.zza);
        zzl.zzi(mo83230b4);
        return mo83230b4.getEvents();
    }
}
