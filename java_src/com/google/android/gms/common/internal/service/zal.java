package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public final class zal extends DP6 {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zakVar) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, zakVar);
        zad(1, zaa);
    }
}
