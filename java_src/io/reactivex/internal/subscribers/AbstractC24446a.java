package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.subscribers.a */
/* loaded from: classes8.dex */
public abstract class AbstractC24446a<T, R> implements InterfaceC23546a<T>, InterfaceC23552g<R> {

    /* renamed from: b */
    public final InterfaceC23546a<? super R> f91016b;

    /* renamed from: c */
    public InterfaceC46292oT5 f91017c;

    /* renamed from: d */
    public InterfaceC23552g<T> f91018d;

    /* renamed from: e */
    public boolean f91019e;

    /* renamed from: f */
    public int f91020f;

    public AbstractC24446a(InterfaceC23546a<? super R> interfaceC23546a) {
        this.f91016b = interfaceC23546a;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public final void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (EnumC24463g.m32286i(this.f91017c, interfaceC46292oT5)) {
            this.f91017c = interfaceC46292oT5;
            if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                this.f91018d = (InterfaceC23552g) interfaceC46292oT5;
            }
            if (m32316d()) {
                this.f91016b.mo31867a(this);
                m32317c();
            }
        }
    }

    /* renamed from: c */
    public void m32317c() {
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.f91017c.cancel();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        this.f91018d.clear();
    }

    /* renamed from: d */
    public boolean m32316d() {
        return true;
    }

    /* renamed from: e */
    public final void m32315e(Throwable th) {
        C23475a.m33009b(th);
        this.f91017c.cancel();
        onError(th);
    }

    /* renamed from: f */
    public final int m32314f(int i) {
        InterfaceC23552g<T> interfaceC23552g = this.f91018d;
        if (interfaceC23552g != null && (i & 4) == 0) {
            int mo31868b = interfaceC23552g.mo31868b(i);
            if (mo31868b != 0) {
                this.f91020f = mo31868b;
            }
            return mo31868b;
        }
        return 0;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return this.f91018d.isEmpty();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        this.f91017c.mo21023o(j);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (this.f91019e) {
            return;
        }
        this.f91019e = true;
        this.f91016b.onComplete();
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        if (this.f91019e) {
            C24508a.m31988u(th);
            return;
        }
        this.f91019e = true;
        this.f91016b.onError(th);
    }
}
