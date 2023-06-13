package com.google.p034ar.core;

import com.google.p034ar.core.ArCoreApk;
/* renamed from: com.google.ar.core.i */
/* loaded from: classes6.dex */
final class C18001i implements InterfaceC18000h {

    /* renamed from: a */
    final /* synthetic */ C18002j f73801a;

    public C18001i(C18002j c18002j) {
        this.f73801a = c18002j;
    }

    @Override // com.google.p034ar.core.InterfaceC18000h
    /* renamed from: a */
    public final void mo48403a(ArCoreApk.Availability availability) {
        synchronized (this.f73801a) {
            this.f73801a.f73808g = availability;
            this.f73801a.f73809h = false;
        }
    }
}
