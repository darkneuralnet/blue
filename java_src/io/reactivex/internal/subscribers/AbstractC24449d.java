package io.reactivex.internal.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24487s;
import io.reactivex.internal.util.InterfaceC24486r;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.subscribers.d */
/* loaded from: classes8.dex */
public abstract class AbstractC24449d<T, U, V> extends C24453h implements InterfaceC24494o<T>, InterfaceC24486r<U, V> {

    /* renamed from: d */
    public final InterfaceC42141hT5<? super V> f91030d;

    /* renamed from: e */
    public final InterfaceC23554i<U> f91031e;

    /* renamed from: f */
    public volatile boolean f91032f;

    /* renamed from: g */
    public volatile boolean f91033g;

    /* renamed from: h */
    public Throwable f91034h;

    public AbstractC24449d(InterfaceC42141hT5<? super V> interfaceC42141hT5, InterfaceC23554i<U> interfaceC23554i) {
        this.f91030d = interfaceC42141hT5;
        this.f91031e = interfaceC23554i;
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    /* renamed from: b */
    public final int mo32222b(int i) {
        return this.f91036b.addAndGet(i);
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    /* renamed from: c */
    public final boolean mo32221c() {
        return this.f91032f;
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    /* renamed from: d */
    public final long mo32220d(long j) {
        return this.f91035c.addAndGet(-j);
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    public final boolean done() {
        return this.f91033g;
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    /* renamed from: g */
    public final long mo32219g() {
        return this.f91035c.get();
    }

    /* renamed from: i */
    public boolean mo32218i(InterfaceC42141hT5<? super V> interfaceC42141hT5, U u) {
        return false;
    }

    @Override // io.reactivex.internal.util.InterfaceC24486r
    /* renamed from: j */
    public final Throwable mo32217j() {
        return this.f91034h;
    }

    /* renamed from: k */
    public final boolean m32309k() {
        return this.f91036b.getAndIncrement() == 0;
    }

    /* renamed from: l */
    public final boolean m32308l() {
        return this.f91036b.get() == 0 && this.f91036b.compareAndSet(0, 1);
    }

    /* renamed from: m */
    public final void m32307m(U u, boolean z, InterfaceC23465c interfaceC23465c) {
        InterfaceC42141hT5<? super V> interfaceC42141hT5 = this.f91030d;
        InterfaceC23554i<U> interfaceC23554i = this.f91031e;
        if (m32308l()) {
            long j = this.f91035c.get();
            if (j != 0) {
                if (mo32218i(interfaceC42141hT5, u) && j != LongCompanionObject.MAX_VALUE) {
                    mo32220d(1L);
                }
                if (mo32222b(-1) == 0) {
                    return;
                }
            } else {
                interfaceC23465c.dispose();
                interfaceC42141hT5.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            interfaceC23554i.offer(u);
            if (!m32309k()) {
                return;
            }
        }
        C24487s.m32212e(interfaceC23554i, interfaceC42141hT5, z, interfaceC23465c, this);
    }

    /* renamed from: n */
    public final void m32306n(U u, boolean z, InterfaceC23465c interfaceC23465c) {
        InterfaceC42141hT5<? super V> interfaceC42141hT5 = this.f91030d;
        InterfaceC23554i<U> interfaceC23554i = this.f91031e;
        if (m32308l()) {
            long j = this.f91035c.get();
            if (j != 0) {
                if (interfaceC23554i.isEmpty()) {
                    if (mo32218i(interfaceC42141hT5, u) && j != LongCompanionObject.MAX_VALUE) {
                        mo32220d(1L);
                    }
                    if (mo32222b(-1) == 0) {
                        return;
                    }
                } else {
                    interfaceC23554i.offer(u);
                }
            } else {
                this.f91032f = true;
                interfaceC23465c.dispose();
                interfaceC42141hT5.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            interfaceC23554i.offer(u);
            if (!m32309k()) {
                return;
            }
        }
        C24487s.m32212e(interfaceC23554i, interfaceC42141hT5, z, interfaceC23465c, this);
    }

    /* renamed from: p */
    public final void m32305p(long j) {
        if (EnumC24463g.m32287h(j)) {
            C24468d.m32274a(this.f91035c, j);
        }
    }
}
