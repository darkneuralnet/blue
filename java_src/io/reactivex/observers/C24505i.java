package io.reactivex.observers;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.observers.i */
/* loaded from: classes8.dex */
public class C24505i<T> extends AbstractC24497a<T, C24505i<T>> implements InterfaceC23436D<T>, InterfaceC24541s<T>, InterfaceC23445I<T>, InterfaceC23476f {

    /* renamed from: j */
    public final InterfaceC23436D<? super T> f91114j;

    /* renamed from: k */
    public final AtomicReference<InterfaceC23465c> f91115k;

    /* renamed from: l */
    public InterfaceC23550e<T> f91116l;

    /* renamed from: io.reactivex.observers.i$a */
    /* loaded from: classes8.dex */
    public enum EnumC24506a implements InterfaceC23436D<Object> {
        INSTANCE;

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        }
    }

    public C24505i() {
        this(EnumC24506a.INSTANCE);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        EnumC23501d.m33000a(this.f91115k);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        return EnumC23501d.m32999b(this.f91115k.get());
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!this.f91098g) {
            this.f91098g = true;
            if (this.f91115k.get() == null) {
                this.f91095d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f91097f = Thread.currentThread();
            this.f91096e++;
            this.f91114j.onComplete();
        } finally {
            this.f91093b.countDown();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        if (!this.f91098g) {
            this.f91098g = true;
            if (this.f91115k.get() == null) {
                this.f91095d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f91097f = Thread.currentThread();
            if (th == null) {
                this.f91095d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f91095d.add(th);
            }
            this.f91114j.onError(th);
        } finally {
            this.f91093b.countDown();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        if (!this.f91098g) {
            this.f91098g = true;
            if (this.f91115k.get() == null) {
                this.f91095d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f91097f = Thread.currentThread();
        if (this.f91100i != 2) {
            this.f91094c.add(t);
            if (t == null) {
                this.f91095d.add(new NullPointerException("onNext received a null value"));
            }
            this.f91114j.onNext(t);
            return;
        }
        while (true) {
            try {
                T poll = this.f91116l.poll();
                if (poll != null) {
                    this.f91094c.add(poll);
                } else {
                    return;
                }
            } catch (Throwable th) {
                this.f91095d.add(th);
                this.f91116l.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        this.f91097f = Thread.currentThread();
        if (interfaceC23465c == null) {
            this.f91095d.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!C42482i24.m35337a(this.f91115k, null, interfaceC23465c)) {
            interfaceC23465c.dispose();
            if (this.f91115k.get() != EnumC23501d.DISPOSED) {
                this.f91095d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + interfaceC23465c));
            }
        } else {
            int i = this.f91099h;
            if (i != 0 && (interfaceC23465c instanceof InterfaceC23550e)) {
                InterfaceC23550e<T> interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                this.f91116l = interfaceC23550e;
                int mo31868b = interfaceC23550e.mo31868b(i);
                this.f91100i = mo31868b;
                if (mo31868b == 1) {
                    this.f91098g = true;
                    this.f91097f = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.f91116l.poll();
                            if (poll != null) {
                                this.f91094c.add(poll);
                            } else {
                                this.f91096e++;
                                this.f91115k.lazySet(EnumC23501d.DISPOSED);
                                return;
                            }
                        } catch (Throwable th) {
                            this.f91095d.add(th);
                            return;
                        }
                    }
                }
            }
            this.f91114j.onSubscribe(interfaceC23465c);
        }
    }

    @Override // io.reactivex.InterfaceC24541s
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    public C24505i(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f91115k = new AtomicReference<>();
        this.f91114j = interfaceC23436D;
    }
}
