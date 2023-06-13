package io.reactivex.disposables;

import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.disposables.g */
/* loaded from: classes6.dex */
public final class C23469g implements InterfaceC23465c {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f88232b = new AtomicReference<>();

    /* renamed from: a */
    public boolean m33017a(InterfaceC23465c interfaceC23465c) {
        return EnumC23501d.m32996g(this.f88232b, interfaceC23465c);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this.f88232b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return EnumC23501d.m32999b(this.f88232b.get());
    }
}
