package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
/* loaded from: classes5.dex */
public abstract class zag extends IP6 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // p000.IP6
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            JP6.m100501b(parcel);
            zab((ModuleInstallStatusUpdate) JP6.m100502a(parcel, ModuleInstallStatusUpdate.CREATOR));
            return true;
        }
        return false;
    }
}
