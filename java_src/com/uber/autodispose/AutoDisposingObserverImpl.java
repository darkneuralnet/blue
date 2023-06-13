package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingObserver;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.AbstractC24499c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposingObserverImpl<T> extends AtomicInteger implements AutoDisposingObserver<T> {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f75535b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f75536c = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicThrowable f75537d = new AtomicThrowable();

    /* renamed from: e */
    public final InterfaceC23496h f75538e;

    /* renamed from: f */
    public final InterfaceC23436D<? super T> f75539f;

    public AutoDisposingObserverImpl(InterfaceC23496h interfaceC23496h, InterfaceC23436D<? super T> interfaceC23436D) {
        this.f75538e = interfaceC23496h;
        this.f75539f = interfaceC23436D;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        AutoDisposableHelper.m45240a(this.f75536c);
        AutoDisposableHelper.m45240a(this.f75535b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f75535b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.uber.autodispose.observers.AutoDisposingObserver
    /* renamed from: f */
    public InterfaceC23436D<? super T> mo45174f() {
        return this.f75539f;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!mo1769e()) {
            this.f75535b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75536c);
            HalfSerializer.m45213b(this.f75539f, this, this.f75537d);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (!mo1769e()) {
            this.f75535b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75536c);
            HalfSerializer.m45211d(this.f75539f, th, this, this.f75537d);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (!mo1769e() && HalfSerializer.m45209f(this.f75539f, t, this, this.f75537d)) {
            this.f75535b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75536c);
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        AbstractC24499c abstractC24499c = new AbstractC24499c() { // from class: com.uber.autodispose.AutoDisposingObserverImpl.1
            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                AutoDisposingObserverImpl.this.f75536c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.m45240a(AutoDisposingObserverImpl.this.f75535b);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                AutoDisposingObserverImpl.this.f75536c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingObserverImpl.this.onError(th);
            }
        };
        if (AutoDisposeEndConsumerHelper.m45227d(this.f75536c, abstractC24499c, AutoDisposingObserverImpl.class)) {
            this.f75539f.onSubscribe(this);
            this.f75538e.mo33003g(abstractC24499c);
            AutoDisposeEndConsumerHelper.m45227d(this.f75535b, interfaceC23465c, AutoDisposingObserverImpl.class);
        }
    }
}
