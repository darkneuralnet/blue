package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.queue.C24409c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.k1 */
/* loaded from: classes6.dex */
public final class C24213k1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90295c;

    /* renamed from: d */
    public final TimeUnit f90296d;

    /* renamed from: e */
    public final AbstractC23437E f90297e;

    /* renamed from: f */
    public final int f90298f;

    /* renamed from: g */
    public final boolean f90299g;

    /* renamed from: io.reactivex.internal.operators.observable.k1$a */
    /* loaded from: classes6.dex */
    public static final class C24214a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90300b;

        /* renamed from: c */
        public final long f90301c;

        /* renamed from: d */
        public final TimeUnit f90302d;

        /* renamed from: e */
        public final AbstractC23437E f90303e;

        /* renamed from: f */
        public final C24409c<Object> f90304f;

        /* renamed from: g */
        public final boolean f90305g;

        /* renamed from: h */
        public InterfaceC23465c f90306h;

        /* renamed from: i */
        public volatile boolean f90307i;

        /* renamed from: j */
        public volatile boolean f90308j;

        /* renamed from: k */
        public Throwable f90309k;

        public C24214a(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, boolean z) {
            this.f90300b = interfaceC23436D;
            this.f90301c = j;
            this.f90302d = timeUnit;
            this.f90303e = abstractC23437E;
            this.f90304f = new C24409c<>(i);
            this.f90305g = z;
        }

        /* renamed from: a */
        public void m32498a() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23436D<? super T> interfaceC23436D = this.f90300b;
            C24409c<Object> c24409c = this.f90304f;
            boolean z2 = this.f90305g;
            TimeUnit timeUnit = this.f90302d;
            AbstractC23437E abstractC23437E = this.f90303e;
            long j = this.f90301c;
            int i = 1;
            while (!this.f90307i) {
                boolean z3 = this.f90308j;
                Long l = (Long) c24409c.m32364n();
                if (l == null) {
                    z = true;
                } else {
                    z = false;
                }
                long m33168c = abstractC23437E.m33168c(timeUnit);
                if (!z && l.longValue() > m33168c - j) {
                    z = true;
                }
                if (z3) {
                    if (z2) {
                        if (z) {
                            Throwable th = this.f90309k;
                            if (th != null) {
                                interfaceC23436D.onError(th);
                                return;
                            } else {
                                interfaceC23436D.onComplete();
                                return;
                            }
                        }
                    } else {
                        Throwable th2 = this.f90309k;
                        if (th2 != null) {
                            this.f90304f.clear();
                            interfaceC23436D.onError(th2);
                            return;
                        } else if (z) {
                            interfaceC23436D.onComplete();
                            return;
                        }
                    }
                }
                if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    c24409c.poll();
                    interfaceC23436D.onNext(c24409c.poll());
                }
            }
            this.f90304f.clear();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90307i) {
                this.f90307i = true;
                this.f90306h.dispose();
                if (getAndIncrement() == 0) {
                    this.f90304f.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90307i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90308j = true;
            m32498a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90309k = th;
            this.f90308j = true;
            m32498a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90304f.m32365m(Long.valueOf(this.f90303e.m33168c(this.f90302d)), t);
            m32498a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90306h, interfaceC23465c)) {
                this.f90306h = interfaceC23465c;
                this.f90300b.onSubscribe(this);
            }
        }
    }

    public C24213k1(InterfaceC23434B<T> interfaceC23434B, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, int i, boolean z) {
        super(interfaceC23434B);
        this.f90295c = j;
        this.f90296d = timeUnit;
        this.f90297e = abstractC23437E;
        this.f90298f = i;
        this.f90299g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24214a(interfaceC23436D, this.f90295c, this.f90296d, this.f90297e, this.f90298f, this.f90299g));
    }
}
