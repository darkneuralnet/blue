package com.google.p034ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.v */
/* loaded from: classes6.dex */
public final class ServiceConnectionC18014v implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C18013u f73844a;

    public ServiceConnectionC18014v(C18013u c18013u) {
        this.f73844a = c18013u;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f73844a.m48389l(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f73844a.m48388m();
    }
}
