package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public final class zzw extends C44025ke7 implements ICancelToken {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
