package io.reactivex.internal.subscriptions;
/* renamed from: io.reactivex.internal.subscriptions.c */
/* loaded from: classes8.dex */
public class C24459c<T> extends AbstractC24457a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: b */
    public final InterfaceC42141hT5<? super T> f91047b;

    /* renamed from: c */
    public T f91048c;

    public C24459c(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f91047b = interfaceC42141hT5;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23551f
    /* renamed from: b */
    public final int mo31868b(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public final void m32302c(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f91047b;
                interfaceC42141hT5.onNext(t);
                if (get() != 4) {
                    interfaceC42141hT5.onComplete();
                    return;
                }
                return;
            }
            this.f91048c = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.f91048c = null;
                return;
            }
        }
        this.f91048c = t;
        lazySet(16);
        InterfaceC42141hT5<? super T> interfaceC42141hT52 = this.f91047b;
        interfaceC42141hT52.onNext(t);
        if (get() != 4) {
            interfaceC42141hT52.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f91048c = null;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final void clear() {
        lazySet(32);
        this.f91048c = null;
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public final void mo21023o(long j) {
        T t;
        if (EnumC24463g.m32287h(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (compareAndSet(1, 3) && (t = this.f91048c) != null) {
                        this.f91048c = null;
                        InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f91047b;
                        interfaceC42141hT5.onNext(t);
                        if (get() != 4) {
                            interfaceC42141hT5.onComplete();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23555j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f91048c;
        this.f91048c = null;
        return t;
    }
}
