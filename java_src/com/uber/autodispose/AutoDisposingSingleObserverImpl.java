package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingSingleObserver;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.AbstractC24499c;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposingSingleObserverImpl<T> implements AutoDisposingSingleObserver<T> {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f75541b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f75542c = new AtomicReference<>();

    /* renamed from: d */
    public final InterfaceC23496h f75543d;

    /* renamed from: e */
    public final InterfaceC23445I<? super T> f75544e;

    public AutoDisposingSingleObserverImpl(InterfaceC23496h interfaceC23496h, InterfaceC23445I<? super T> interfaceC23445I) {
        this.f75543d = interfaceC23496h;
        this.f75544e = interfaceC23445I;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        AutoDisposableHelper.m45240a(this.f75542c);
        AutoDisposableHelper.m45240a(this.f75541b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f75541b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.uber.autodispose.observers.AutoDisposingSingleObserver
    /* renamed from: f */
    public InterfaceC23445I<? super T> mo45173f() {
        return this.f75544e;
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onError(Throwable th) {
        if (!mo1769e()) {
            this.f75541b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75542c);
            this.f75544e.onError(th);
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        AbstractC24499c abstractC24499c = new AbstractC24499c() { // from class: com.uber.autodispose.AutoDisposingSingleObserverImpl.1
            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                AutoDisposingSingleObserverImpl.this.f75542c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.m45240a(AutoDisposingSingleObserverImpl.this.f75541b);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                AutoDisposingSingleObserverImpl.this.f75542c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingSingleObserverImpl.this.onError(th);
            }
        };
        if (AutoDisposeEndConsumerHelper.m45227d(this.f75542c, abstractC24499c, AutoDisposingSingleObserverImpl.class)) {
            this.f75544e.onSubscribe(this);
            this.f75543d.mo33003g(abstractC24499c);
            AutoDisposeEndConsumerHelper.m45227d(this.f75541b, interfaceC23465c, AutoDisposingSingleObserverImpl.class);
        }
    }

    @Override // io.reactivex.InterfaceC23445I
    public void onSuccess(T t) {
        if (!mo1769e()) {
            this.f75541b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75542c);
            this.f75544e.onSuccess(t);
        }
    }
}
