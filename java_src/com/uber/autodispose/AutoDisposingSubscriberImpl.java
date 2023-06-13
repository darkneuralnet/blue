package com.uber.autodispose;

import com.uber.autodispose.observers.AutoDisposingSubscriber;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.observers.AbstractC24499c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposingSubscriberImpl<T> extends AtomicInteger implements AutoDisposingSubscriber<T> {

    /* renamed from: b */
    public final AtomicReference<InterfaceC46292oT5> f75546b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<InterfaceC23465c> f75547c = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicThrowable f75548d = new AtomicThrowable();

    /* renamed from: e */
    public final AtomicReference<InterfaceC46292oT5> f75549e = new AtomicReference<>();

    /* renamed from: f */
    public final AtomicLong f75550f = new AtomicLong();

    /* renamed from: g */
    public final InterfaceC23496h f75551g;

    /* renamed from: h */
    public final InterfaceC42141hT5<? super T> f75552h;

    public AutoDisposingSubscriberImpl(InterfaceC23496h interfaceC23496h, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f75551g = interfaceC23496h;
        this.f75552h = interfaceC42141hT5;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        AbstractC24499c abstractC24499c = new AbstractC24499c() { // from class: com.uber.autodispose.AutoDisposingSubscriberImpl.1
            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                AutoDisposingSubscriberImpl.this.f75547c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoSubscriptionHelper.m45224a(AutoDisposingSubscriberImpl.this.f75546b);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                AutoDisposingSubscriberImpl.this.f75547c.lazySet(AutoDisposableHelper.DISPOSED);
                AutoDisposingSubscriberImpl.this.onError(th);
            }
        };
        if (AutoDisposeEndConsumerHelper.m45227d(this.f75547c, abstractC24499c, AutoDisposingSubscriberImpl.class)) {
            this.f75552h.mo31867a(this);
            this.f75551g.mo33003g(abstractC24499c);
            if (AutoDisposeEndConsumerHelper.m45228c(this.f75546b, interfaceC46292oT5, AutoDisposingSubscriberImpl.class)) {
                AutoSubscriptionHelper.m45222c(this.f75549e, this.f75550f, interfaceC46292oT5);
            }
        }
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        AutoDisposableHelper.m45240a(this.f75547c);
        AutoSubscriptionHelper.m45224a(this.f75546b);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f75546b.get() == AutoSubscriptionHelper.CANCELLED;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        AutoSubscriptionHelper.m45223b(this.f75549e, this.f75550f, j);
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (!mo1769e()) {
            this.f75546b.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.m45240a(this.f75547c);
            HalfSerializer.m45214a(this.f75552h, this, this.f75548d);
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        if (!mo1769e()) {
            this.f75546b.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.m45240a(this.f75547c);
            HalfSerializer.m45212c(this.f75552h, th, this, this.f75548d);
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        if (!mo1769e() && HalfSerializer.m45210e(this.f75552h, t, this, this.f75548d)) {
            this.f75546b.lazySet(AutoSubscriptionHelper.CANCELLED);
            AutoDisposableHelper.m45240a(this.f75547c);
        }
    }

    @Override // com.uber.autodispose.observers.AutoDisposingSubscriber
    /* renamed from: w */
    public InterfaceC42141hT5<? super T> mo45172w() {
        return this.f75552h;
    }
}
