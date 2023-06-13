package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.WO1;
/* loaded from: classes5.dex */
public final class zam extends DP6 {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final WO1 zae(WO1 wo1, zax zaxVar) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, wo1);
        JP6.m100499d(zaa, zaxVar);
        Parcel zab = zab(2, zaa);
        WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(zab.readStrongBinder());
        zab.recycle();
        return m78501c5;
    }
}
