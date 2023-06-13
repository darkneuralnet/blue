package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.j */
/* loaded from: classes6.dex */
public final class C23565j extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c, InterfaceC23484g<Throwable>, InterfaceC24502f {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: b */
    public final InterfaceC23484g<? super Throwable> f88304b;

    /* renamed from: c */
    public final InterfaceC23478a f88305c;

    public C23565j(InterfaceC23478a interfaceC23478a) {
        this.f88304b = this;
        this.f88305c = interfaceC23478a;
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    /* renamed from: a */
    public void accept(Throwable th) {
        C24508a.m31988u(new OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        return this.f88304b != this;
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        try {
            this.f88305c.run();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
        lazySet(EnumC23501d.DISPOSED);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        try {
            this.f88304b.accept(th);
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(th2);
        }
        lazySet(EnumC23501d.DISPOSED);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }

    public C23565j(InterfaceC23484g<? super Throwable> interfaceC23484g, InterfaceC23478a interfaceC23478a) {
        this.f88304b = interfaceC23484g;
        this.f88305c = interfaceC23478a;
    }
}
