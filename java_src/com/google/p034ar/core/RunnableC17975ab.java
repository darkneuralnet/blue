package com.google.p034ar.core;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.ar.core.ab */
/* loaded from: classes6.dex */
final class RunnableC17975ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f73734a;

    /* renamed from: b */
    final /* synthetic */ RunnableC17976ac f73735b;

    public RunnableC17975ab(RunnableC17976ac runnableC17976ac, AtomicBoolean atomicBoolean) {
        this.f73735b = runnableC17976ac;
        this.f73734a = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f73734a.getAndSet(true)) {
            Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
            RunnableC17976ac runnableC17976ac = this.f73735b;
            C18013u c18013u = runnableC17976ac.f73738c;
            C18013u.m48386o(runnableC17976ac.f73736a, runnableC17976ac.f73737b);
        }
    }
}
