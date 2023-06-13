package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.b */
/* loaded from: classes6.dex */
public final class C23870b<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c, InterfaceC24502f {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: b */
    public final InterfaceC23484g<? super T> f89207b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f89208c;

    /* renamed from: d */
    public final InterfaceC23478a f89209d;

    public C23870b(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
        this.f89207b = interfaceC23484g;
        this.f89208c = interfaceC23484g2;
        this.f89209d = interfaceC23478a;
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

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        return this.f89208c != C23506a.f88250f;
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onComplete() {
        lazySet(EnumC23501d.DISPOSED);
        try {
            this.f89209d.run();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onError(Throwable th) {
        lazySet(EnumC23501d.DISPOSED);
        try {
            this.f89208c.accept(th);
        } catch (Throwable th2) {
            C23475a.m33009b(th2);
            C24508a.m31988u(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(T t) {
        lazySet(EnumC23501d.DISPOSED);
        try {
            this.f89207b.accept(t);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            C24508a.m31988u(th);
        }
    }
}
