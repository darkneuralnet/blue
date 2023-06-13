package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.InterfaceC23552g;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.subscriptions.e */
/* loaded from: classes8.dex */
public final class C24461e<T> extends AtomicInteger implements InterfaceC23552g<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: b */
    public final T f91051b;

    /* renamed from: c */
    public final InterfaceC42141hT5<? super T> f91052c;

    public C24461e(InterfaceC42141hT5<? super T> interfaceC42141hT5, T t) {
        this.f91052c = interfaceC42141hT5;
        this.f91051b = t;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23551f
    /* renamed from: b */
    public int mo31868b(int i) {
        return i & 1;
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        if (EnumC24463g.m32287h(j) && compareAndSet(0, 1)) {
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f91052c;
            interfaceC42141hT5.onNext((T) this.f91051b);
            if (get() != 2) {
                interfaceC42141hT5.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.f91051b;
        }
        return null;
    }
}
