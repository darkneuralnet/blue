package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes5.dex */
public abstract class zaj extends IP6 implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // p000.IP6
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            JP6.m100501b(parcel);
            zab(readInt);
            return true;
        }
        return false;
    }
}
