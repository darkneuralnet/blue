package com.google.p034ar.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.p034ar.core.dependencies.AbstractBinderC17995i;
import com.google.p034ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.ar.core.aa */
/* loaded from: classes6.dex */
final class BinderC17974aa extends AbstractBinderC17995i {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f73732a;

    /* renamed from: b */
    final /* synthetic */ RunnableC17976ac f73733b;

    public BinderC17974aa(RunnableC17976ac runnableC17976ac, AtomicBoolean atomicBoolean) {
        this.f73733b = runnableC17976ac;
        this.f73732a = atomicBoolean;
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17996j
    /* renamed from: b */
    public final void mo48384b(Bundle bundle) throws RemoteException {
    }

    @Override // com.google.p034ar.core.dependencies.InterfaceC17996j
    /* renamed from: c */
    public final void mo48383c(Bundle bundle) throws RemoteException {
        if (this.f73732a.getAndSet(true)) {
            return;
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            this.f73733b.f73737b.m48402a(EnumC18012t.COMPLETED);
        } else if (i != 0) {
            Log.w("ARCore-InstallService", "requestInstall = " + i + ", launching fullscreen.");
            RunnableC17976ac runnableC17976ac = this.f73733b;
            C18013u c18013u = runnableC17976ac.f73738c;
            C18013u.m48386o(runnableC17976ac.f73736a, runnableC17976ac.f73737b);
        } else if (bundle.containsKey("resolution.intent")) {
            RunnableC17976ac runnableC17976ac2 = this.f73733b;
            C18013u c18013u2 = runnableC17976ac2.f73738c;
            C18013u.m48385p(runnableC17976ac2.f73736a, bundle, runnableC17976ac2.f73737b);
        } else if (i2 != 10) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    this.f73733b.f73737b.m48402a(EnumC18012t.ACCEPTED);
                    return;
                case 4:
                    this.f73733b.f73737b.m48402a(EnumC18012t.COMPLETED);
                    return;
                case 5:
                    this.f73733b.f73737b.m48401b(new FatalException("Unexpected FAILED install status without error."));
                    return;
                case 6:
                    this.f73733b.f73737b.m48402a(EnumC18012t.CANCELLED);
                    return;
                default:
                    C18011s c18011s = this.f73733b.f73737b;
                    c18011s.m48401b(new FatalException("Unexpected install status: " + i2));
                    return;
            }
        } else {
            this.f73733b.f73737b.m48401b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
        }
    }
}
