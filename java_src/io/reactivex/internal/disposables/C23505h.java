package io.reactivex.internal.disposables;

import io.reactivex.disposables.InterfaceC23465c;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.disposables.h */
/* loaded from: classes7.dex */
public final class C23505h extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c {
    private static final long serialVersionUID = -754898800686245608L;

    public C23505h() {
    }

    /* renamed from: a */
    public boolean m32981a(InterfaceC23465c interfaceC23465c) {
        return EnumC23501d.m32998c(this, interfaceC23465c);
    }

    /* renamed from: b */
    public boolean m32980b(InterfaceC23465c interfaceC23465c) {
        return EnumC23501d.m32996g(this, interfaceC23465c);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return EnumC23501d.m32999b(get());
    }

    public C23505h(InterfaceC23465c interfaceC23465c) {
        lazySet(interfaceC23465c);
    }
}
