package com.google.p034ar.core;

import com.google.p034ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.ar.core.o */
/* loaded from: classes6.dex */
final class C18007o implements InterfaceC18000h {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f73821a;

    public C18007o(AtomicReference atomicReference) {
        this.f73821a = atomicReference;
    }

    @Override // com.google.p034ar.core.InterfaceC18000h
    /* renamed from: a */
    public final void mo48403a(ArCoreApk.Availability availability) {
        this.f73821a.set(availability);
    }
}
