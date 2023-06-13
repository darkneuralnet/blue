package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* loaded from: classes5.dex */
public final class zaf extends DP6 {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, zaeVar);
        JP6.m100499d(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, zaeVar);
        JP6.m100499d(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, zaeVar);
        JP6.m100499d(zaa, apiFeatureRequest);
        JP6.m100498e(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, iStatusCallback);
        JP6.m100499d(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        JP6.m100498e(zaa, iStatusCallback);
        JP6.m100498e(zaa, zahVar);
        zac(6, zaa);
    }
}
