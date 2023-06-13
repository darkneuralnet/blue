package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingMaybeObserver;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.AbstractC24499c;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposingMaybeObserverImpl<T> implements AutoDisposingMaybeObserver<T> {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f75530b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f75531c = new AtomicReference<>();

    /* renamed from: d */
    public final InterfaceC23496h f75532d;

    /* renamed from: e */
    public final InterfaceC24541s<? super T> f75533e;

    public AutoDisposingMaybeObserverImpl(InterfaceC23496h interfaceC23496h, InterfaceC24541s<? super T> interfaceC24541s) {
        this.f75532d = interfaceC23496h;
        this.f75533e = interfaceC24541s;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        AutoDisposableHelper.m45240a(this.f75531c);
        AutoDisposableHelper.m45240a(this.f75530b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f75530b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.uber.autodispose.observers.AutoDisposingMaybeObserver
    /* renamed from: f */
    public InterfaceC24541s<? super T> mo45175f() {
        return this.f75533e;
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onComplete() {
        if (!mo1769e()) {
            this.f75530b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75531c);
            this.f75533e.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onError(Throwable th) {
        if (!mo1769e()) {
            this.f75530b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75531c);
            this.f75533e.onError(th);
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        AbstractC24499c abstractC24499c = new AbstractC24499c() { // from class: com.uber.autodispose.AutoDisposingMaybeObserverImpl.1
            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                AutoDisposingMaybeObserverImpl.this.f75531c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.m45240a(AutoDisposingMaybeObserverImpl.this.f75530b);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                AutoDisposingMaybeObserverImpl.this.f75531c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingMaybeObserverImpl.this.onError(th);
            }
        };
        if (AutoDisposeEndConsumerHelper.m45227d(this.f75531c, abstractC24499c, AutoDisposingMaybeObserverImpl.class)) {
            this.f75533e.onSubscribe(this);
            this.f75532d.mo33003g(abstractC24499c);
            AutoDisposeEndConsumerHelper.m45227d(this.f75530b, interfaceC23465c, AutoDisposingMaybeObserverImpl.class);
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(T t) {
        if (!mo1769e()) {
            this.f75530b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75531c);
            this.f75533e.onSuccess(t);
        }
    }
}
