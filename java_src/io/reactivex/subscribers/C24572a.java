package io.reactivex.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24464a;
import io.reactivex.internal.util.EnumC24479n;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.subscribers.a */
/* loaded from: classes8.dex */
public final class C24572a<T> implements InterfaceC24494o<T>, InterfaceC46292oT5 {

    /* renamed from: b */
    public final InterfaceC42141hT5<? super T> f91280b;

    /* renamed from: c */
    public final boolean f91281c;

    /* renamed from: d */
    public InterfaceC46292oT5 f91282d;

    /* renamed from: e */
    public boolean f91283e;

    /* renamed from: f */
    public C24464a<Object> f91284f;

    /* renamed from: g */
    public volatile boolean f91285g;

    public C24572a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this(interfaceC42141hT5, false);
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (EnumC24463g.m32286i(this.f91282d, interfaceC46292oT5)) {
            this.f91282d = interfaceC46292oT5;
            this.f91280b.mo31867a(this);
        }
    }

    /* renamed from: b */
    public void m31866b() {
        C24464a<Object> c24464a;
        do {
            synchronized (this) {
                c24464a = this.f91284f;
                if (c24464a == null) {
                    this.f91283e = false;
                    return;
                }
                this.f91284f = null;
            }
        } while (!c24464a.m32285a((InterfaceC42141hT5<? super T>) this.f91280b));
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.f91282d.cancel();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        this.f91282d.mo21023o(j);
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (this.f91285g) {
            return;
        }
        synchronized (this) {
            if (this.f91285g) {
                return;
            }
            if (this.f91283e) {
                C24464a<Object> c24464a = this.f91284f;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91284f = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32243e());
                return;
            }
            this.f91285g = true;
            this.f91283e = true;
            this.f91280b.onComplete();
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        if (this.f91285g) {
            C24508a.m31988u(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f91285g) {
                if (this.f91283e) {
                    this.f91285g = true;
                    C24464a<Object> c24464a = this.f91284f;
                    if (c24464a == null) {
                        c24464a = new C24464a<>(4);
                        this.f91284f = c24464a;
                    }
                    Object m32241g = EnumC24479n.m32241g(th);
                    if (this.f91281c) {
                        c24464a.m32283c(m32241g);
                    } else {
                        c24464a.m32281e(m32241g);
                    }
                    return;
                }
                this.f91285g = true;
                this.f91283e = true;
                z = false;
            }
            if (z) {
                C24508a.m31988u(th);
            } else {
                this.f91280b.onError(th);
            }
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        if (this.f91285g) {
            return;
        }
        if (t == null) {
            this.f91282d.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f91285g) {
                return;
            }
            if (this.f91283e) {
                C24464a<Object> c24464a = this.f91284f;
                if (c24464a == null) {
                    c24464a = new C24464a<>(4);
                    this.f91284f = c24464a;
                }
                c24464a.m32283c(EnumC24479n.m32236l(t));
                return;
            }
            this.f91283e = true;
            this.f91280b.onNext(t);
            m31866b();
        }
    }

    public C24572a(InterfaceC42141hT5<? super T> interfaceC42141hT5, boolean z) {
        this.f91280b = interfaceC42141hT5;
        this.f91281c = z;
    }
}
