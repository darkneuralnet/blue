package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingCompletableObserver;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.AbstractC24499c;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposingCompletableObserverImpl implements AutoDisposingCompletableObserver {

    /* renamed from: b */
    public final AtomicReference<InterfaceC23465c> f75525b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f75526c = new AtomicReference<>();

    /* renamed from: d */
    public final InterfaceC23496h f75527d;

    /* renamed from: e */
    public final InterfaceC23476f f75528e;

    public AutoDisposingCompletableObserverImpl(InterfaceC23496h interfaceC23496h, InterfaceC23476f interfaceC23476f) {
        this.f75527d = interfaceC23496h;
        this.f75528e = interfaceC23476f;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        AutoDisposableHelper.m45240a(this.f75526c);
        AutoDisposableHelper.m45240a(this.f75525b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f75525b.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.uber.autodispose.observers.AutoDisposingCompletableObserver
    /* renamed from: f */
    public InterfaceC23476f mo45176f() {
        return this.f75528e;
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        if (!mo1769e()) {
            this.f75525b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75526c);
            this.f75528e.onComplete();
        }
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        if (!mo1769e()) {
            this.f75525b.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.m45240a(this.f75526c);
            this.f75528e.onError(th);
        }
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        AbstractC24499c abstractC24499c = new AbstractC24499c() { // from class: com.uber.autodispose.AutoDisposingCompletableObserverImpl.1
            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                AutoDisposingCompletableObserverImpl.this.f75526c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposableHelper.m45240a(AutoDisposingCompletableObserverImpl.this.f75525b);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                AutoDisposingCompletableObserverImpl.this.f75526c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingCompletableObserverImpl.this.onError(th);
            }
        };
        if (AutoDisposeEndConsumerHelper.m45227d(this.f75526c, abstractC24499c, AutoDisposingCompletableObserverImpl.class)) {
            this.f75528e.onSubscribe(this);
            this.f75527d.mo33003g(abstractC24499c);
            AutoDisposeEndConsumerHelper.m45227d(this.f75525b, interfaceC23465c, AutoDisposingCompletableObserverImpl.class);
        }
    }
}
