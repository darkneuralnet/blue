package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.observers.a */
/* loaded from: classes6.dex */
public abstract class AbstractC23556a<T, R> implements InterfaceC23436D<T>, InterfaceC23550e<R> {

    /* renamed from: b */
    public final InterfaceC23436D<? super R> f88288b;

    /* renamed from: c */
    public InterfaceC23465c f88289c;

    /* renamed from: d */
    public InterfaceC23550e<T> f88290d;

    /* renamed from: e */
    public boolean f88291e;

    /* renamed from: f */
    public int f88292f;

    public AbstractC23556a(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f88288b = interfaceC23436D;
    }

    /* renamed from: a */
    public void m32920a() {
    }

    /* renamed from: c */
    public boolean m32919c() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        this.f88290d.clear();
    }

    /* renamed from: d */
    public final void m32918d(Throwable th) {
        C23475a.m33009b(th);
        this.f88289c.dispose();
        onError(th);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        this.f88289c.dispose();
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f88289c.mo1769e();
    }

    /* renamed from: g */
    public final int m32917g(int i) {
        InterfaceC23550e<T> interfaceC23550e = this.f88290d;
        if (interfaceC23550e != null && (i & 4) == 0) {
            int mo31868b = interfaceC23550e.mo31868b(i);
            if (mo31868b != 0) {
                this.f88292f = mo31868b;
            }
            return mo31868b;
        }
        return 0;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return this.f88290d.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (this.f88291e) {
            return;
        }
        this.f88291e = true;
        this.f88288b.onComplete();
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (this.f88291e) {
            C24508a.m31988u(th);
            return;
        }
        this.f88291e = true;
        this.f88288b.onError(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public final void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32993j(this.f88289c, interfaceC23465c)) {
            this.f88289c = interfaceC23465c;
            if (interfaceC23465c instanceof InterfaceC23550e) {
                this.f88290d = (InterfaceC23550e) interfaceC23465c;
            }
            if (m32919c()) {
                this.f88288b.onSubscribe(this);
                m32920a();
            }
        }
    }
}
