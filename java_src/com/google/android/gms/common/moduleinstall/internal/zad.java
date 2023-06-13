package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
/* loaded from: classes5.dex */
public abstract class zad extends IP6 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // p000.IP6
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    JP6.m100501b(parcel);
                    zab((Status) JP6.m100502a(parcel, Status.CREATOR));
                } else {
                    JP6.m100501b(parcel);
                    zac((Status) JP6.m100502a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) JP6.m100502a(parcel, ModuleInstallIntentResponse.CREATOR));
                }
            } else {
                JP6.m100501b(parcel);
                zad((Status) JP6.m100502a(parcel, Status.CREATOR), (ModuleInstallResponse) JP6.m100502a(parcel, ModuleInstallResponse.CREATOR));
            }
        } else {
            JP6.m100501b(parcel);
            zae((Status) JP6.m100502a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) JP6.m100502a(parcel, ModuleAvailabilityResponse.CREATOR));
        }
        return true;
    }
}
