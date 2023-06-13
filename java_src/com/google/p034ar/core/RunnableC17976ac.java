package com.google.p034ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.p034ar.core.dependencies.InterfaceC17994h;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.ac */
/* loaded from: classes6.dex */
public final class RunnableC17976ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f73736a;

    /* renamed from: b */
    final /* synthetic */ C18011s f73737b;

    /* renamed from: c */
    final /* synthetic */ C18013u f73738c;

    public RunnableC17976ac(C18013u c18013u, Activity activity, C18011s c18011s) {
        this.f73738c = c18013u;
        this.f73736a = activity;
        this.f73737b = c18011s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC17994h interfaceC17994h;
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            interfaceC17994h = this.f73738c.f73837c;
            interfaceC17994h.mo48416e(this.f73736a.getApplicationInfo().packageName, Collections.singletonList(C18013u.m48390k()), new Bundle(), new BinderC17974aa(this, atomicBoolean));
            new Handler().postDelayed(new RunnableC17975ab(this, atomicBoolean), 3000L);
        } catch (RemoteException e) {
            Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e);
            C18013u c18013u = this.f73738c;
            C18013u.m48386o(this.f73736a, this.f73737b);
        }
    }
}
