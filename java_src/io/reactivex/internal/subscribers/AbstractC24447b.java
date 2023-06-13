package io.reactivex.internal.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.subscribers.b */
/* loaded from: classes8.dex */
public abstract class AbstractC24447b<T, R> implements InterfaceC24494o<T>, InterfaceC23552g<R> {

    /* renamed from: b */
    public final InterfaceC42141hT5<? super R> f91021b;

    /* renamed from: c */
    public InterfaceC46292oT5 f91022c;

    /* renamed from: d */
    public InterfaceC23552g<T> f91023d;

    /* renamed from: e */
    public boolean f91024e;

    /* renamed from: f */
    public int f91025f;

    public AbstractC24447b(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f91021b = interfaceC42141hT5;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public final void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (EnumC24463g.m32286i(this.f91022c, interfaceC46292oT5)) {
            this.f91022c = interfaceC46292oT5;
            if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                this.f91023d = (InterfaceC23552g) interfaceC46292oT5;
            }
            if (m32312d()) {
                this.f91021b.mo31867a(this);
                m32313c();
            }
        }
    }

    /* renamed from: c */
    public void m32313c() {
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.f91022c.cancel();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        this.f91023d.clear();
    }

    /* renamed from: d */
    public boolean m32312d() {
        return true;
    }

    /* renamed from: e */
    public final void m32311e(Throwable th) {
        C23475a.m33009b(th);
        this.f91022c.cancel();
        onError(th);
    }

    /* renamed from: f */
    public final int m32310f(int i) {
        InterfaceC23552g<T> interfaceC23552g = this.f91023d;
        if (interfaceC23552g != null && (i & 4) == 0) {
            int mo31868b = interfaceC23552g.mo31868b(i);
            if (mo31868b != 0) {
                this.f91025f = mo31868b;
            }
            return mo31868b;
        }
        return 0;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return this.f91023d.isEmpty();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        this.f91022c.mo21023o(j);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (this.f91024e) {
            return;
        }
        this.f91024e = true;
        this.f91021b.onComplete();
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        if (this.f91024e) {
            C24508a.m31988u(th);
            return;
        }
        this.f91024e = true;
        this.f91021b.onError(th);
    }
}
