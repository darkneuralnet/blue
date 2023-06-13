package io.reactivex.internal.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24477l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.subscribers.k */
/* loaded from: classes8.dex */
public class C24456k<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: b */
    public final InterfaceC42141hT5<? super T> f91041b;

    /* renamed from: c */
    public final C24467c f91042c = new C24467c();

    /* renamed from: d */
    public final AtomicLong f91043d = new AtomicLong();

    /* renamed from: e */
    public final AtomicReference<InterfaceC46292oT5> f91044e = new AtomicReference<>();

    /* renamed from: f */
    public final AtomicBoolean f91045f = new AtomicBoolean();

    /* renamed from: g */
    public volatile boolean f91046g;

    public C24456k(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f91041b = interfaceC42141hT5;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (this.f91045f.compareAndSet(false, true)) {
            this.f91041b.mo31867a(this);
            EnumC24463g.m32292c(this.f91044e, this.f91043d, interfaceC46292oT5);
            return;
        }
        interfaceC46292oT5.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        if (!this.f91046g) {
            EnumC24463g.m32294a(this.f91044e);
        }
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        EnumC24463g.m32293b(this.f91044e, this.f91043d, j);
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        this.f91046g = true;
        C24477l.m32255a(this.f91041b, this, this.f91042c);
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        this.f91046g = true;
        C24477l.m32253c(this.f91041b, th, this, this.f91042c);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        C24477l.m32251e(this.f91041b, t, this, this.f91042c);
    }
}
