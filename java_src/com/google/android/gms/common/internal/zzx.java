package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* loaded from: classes5.dex */
public final class zzx extends C44025ke7 implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final WO1 zzd() throws RemoteException {
        Parcel zzB = zzB(1, zza());
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zzB.readStrongBinder());
        zzB.recycle();
        return m78501c5;
    }
}
