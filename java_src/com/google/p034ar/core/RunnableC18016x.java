package com.google.p034ar.core;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.dependencies.InterfaceC17994h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.x */
/* loaded from: classes6.dex */
public final class RunnableC18016x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f73846a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC18000h f73847b;

    /* renamed from: c */
    final /* synthetic */ C18013u f73848c;

    public RunnableC18016x(C18013u c18013u, Context context, InterfaceC18000h interfaceC18000h) {
        this.f73848c = c18013u;
        this.f73846a = context;
        this.f73847b = interfaceC18000h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC17994h interfaceC17994h;
        try {
            interfaceC17994h = this.f73848c.f73837c;
            interfaceC17994h.mo48417d(this.f73846a.getApplicationInfo().packageName, C18013u.m48390k(), new BinderC18015w(this));
        } catch (RemoteException e) {
            Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.f73847b.mo48403a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
