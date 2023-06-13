package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Q1 */
/* loaded from: classes6.dex */
public final class C24087Q1<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {
    private static final long serialVersionUID = -8612022020200669122L;

    /* renamed from: b */
    public final InterfaceC23436D<? super T> f89909b;

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f89910c = new AtomicReference<>();

    public C24087Q1(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f89909b = interfaceC23436D;
    }

    /* renamed from: a */
    public void m32605a(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32996g(this, interfaceC23465c);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        EnumC23501d.m33000a(this.f89910c);
        EnumC23501d.m33000a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f89910c.get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        dispose();
        this.f89909b.onComplete();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        dispose();
        this.f89909b.onError(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        this.f89909b.onNext(t);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32995h(this.f89910c, interfaceC23465c)) {
            this.f89909b.onSubscribe(this);
        }
    }
}
