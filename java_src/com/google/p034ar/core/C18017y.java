package com.google.p034ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.y */
/* loaded from: classes6.dex */
public final class C18017y extends PackageInstaller.SessionCallback {

    /* renamed from: a */
    final Map f73849a = new HashMap();

    /* renamed from: b */
    final /* synthetic */ C18011s f73850b;

    /* renamed from: c */
    final /* synthetic */ C18013u f73851c;

    public C18017y(C18013u c18013u, C18011s c18011s) {
        this.f73851c = c18013u;
        this.f73850b = c18011s;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        PackageInstaller packageInstaller;
        packageInstaller = this.f73851c.f73841g;
        this.f73849a.put(Integer.valueOf(i), packageInstaller.getSessionInfo(i));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.f73849a.remove(Integer.valueOf(i));
        if (sessionInfo != null && "com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            Log.i("ARCore-InstallService", "Detected ARCore install completion");
            this.f73850b.m48402a(EnumC18012t.COMPLETED);
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
    }
}
