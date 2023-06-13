package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.completable.r */
/* loaded from: classes6.dex */
public final class C23620r extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h[] f88419b;

    /* renamed from: io.reactivex.internal.operators.completable.r$a */
    /* loaded from: classes6.dex */
    public static final class C23621a extends AtomicInteger implements InterfaceC23476f {
        private static final long serialVersionUID = -8360547806504310570L;

        /* renamed from: b */
        public final InterfaceC23476f f88420b;

        /* renamed from: c */
        public final AtomicBoolean f88421c;

        /* renamed from: d */
        public final C23464b f88422d;

        public C23621a(InterfaceC23476f interfaceC23476f, AtomicBoolean atomicBoolean, C23464b c23464b, int i) {
            this.f88420b = interfaceC23476f;
            this.f88421c = atomicBoolean;
            this.f88422d = c23464b;
            lazySet(i);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (decrementAndGet() == 0 && this.f88421c.compareAndSet(false, true)) {
                this.f88420b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88422d.dispose();
            if (this.f88421c.compareAndSet(false, true)) {
                this.f88420b.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88422d.mo32983c(interfaceC23465c);
        }
    }

    public C23620r(InterfaceC23496h[] interfaceC23496hArr) {
        this.f88419b = interfaceC23496hArr;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        InterfaceC23496h[] interfaceC23496hArr;
        C23464b c23464b = new C23464b();
        C23621a c23621a = new C23621a(interfaceC23476f, new AtomicBoolean(), c23464b, this.f88419b.length + 1);
        interfaceC23476f.onSubscribe(c23464b);
        for (InterfaceC23496h interfaceC23496h : this.f88419b) {
            if (c23464b.mo1769e()) {
                return;
            }
            if (interfaceC23496h == null) {
                c23464b.dispose();
                c23621a.onError(new NullPointerException("A completable source is null"));
                return;
            }
            interfaceC23496h.mo33003g(c23621a);
        }
        c23621a.onComplete();
    }
}
