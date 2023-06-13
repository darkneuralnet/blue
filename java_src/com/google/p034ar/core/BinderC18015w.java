package com.google.p034ar.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.dependencies.AbstractBinderC17995i;
/* renamed from: com.google.ar.core.w */
/* loaded from: classes6.dex */
final class BinderC18015w extends AbstractBinderC17995i {

    /* renamed from: a */
    final /* synthetic */ RunnableC18016x f73845a;

    public BinderC18015w(RunnableC18016x runnableC18016x) {
        this.f73845a = runnableC18016x;
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17996j
    /* renamed from: b */
    public final void mo48384b(Bundle bundle) throws RemoteException {
        int i = bundle.getInt("error.code", -100);
        if (i != -5) {
            if (i != -3) {
                if (i != 0) {
                    Log.e("ARCore-InstallService", "requestInfo returned: " + i);
                    this.f73845a.f73847b.mo48403a(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                }
                this.f73845a.f73847b.mo48403a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                return;
            }
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.f73845a.f73847b.mo48403a(ArCoreApk.Availability.UNKNOWN_ERROR);
            return;
        }
        Log.e("ARCore-InstallService", "The device is not supported.");
        this.f73845a.f73847b.mo48403a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17996j
    /* renamed from: c */
    public final void mo48383c(Bundle bundle) throws RemoteException {
    }
}
