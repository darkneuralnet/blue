package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.EnumC24479n;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.observers.i */
/* loaded from: classes6.dex */
public final class C23564i<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c {

    /* renamed from: c */
    public static final Object f88302c = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* renamed from: b */
    public final Queue<Object> f88303b;

    public C23564i(Queue<Object> queue) {
        this.f88303b = queue;
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        if (EnumC23501d.m33000a(this)) {
            this.f88303b.offer(f88302c);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC23501d.DISPOSED;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        this.f88303b.offer(EnumC24479n.m32243e());
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        this.f88303b.offer(EnumC24479n.m32241g(th));
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        this.f88303b.offer(EnumC24479n.m32236l(t));
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        EnumC23501d.m32995h(this, interfaceC23465c);
    }
}
