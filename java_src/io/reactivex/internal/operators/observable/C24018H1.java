package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.subjects.C24570i;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.H1 */
/* loaded from: classes6.dex */
public final class C24018H1<T> extends AbstractC24145a<T, Observable<T>> {

    /* renamed from: c */
    public final long f89644c;

    /* renamed from: d */
    public final long f89645d;

    /* renamed from: e */
    public final int f89646e;

    /* renamed from: io.reactivex.internal.operators.observable.H1$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24019a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Observable<T>> f89647b;

        /* renamed from: c */
        public final long f89648c;

        /* renamed from: d */
        public final int f89649d;

        /* renamed from: e */
        public long f89650e;

        /* renamed from: f */
        public InterfaceC23465c f89651f;

        /* renamed from: g */
        public C24570i<T> f89652g;

        /* renamed from: h */
        public volatile boolean f89653h;

        public RunnableC24019a(InterfaceC23436D<? super Observable<T>> interfaceC23436D, long j, int i) {
            this.f89647b = interfaceC23436D;
            this.f89648c = j;
            this.f89649d = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89653h = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89653h;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            C24570i<T> c24570i = this.f89652g;
            if (c24570i != null) {
                this.f89652g = null;
                c24570i.onComplete();
            }
            this.f89647b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            C24570i<T> c24570i = this.f89652g;
            if (c24570i != null) {
                this.f89652g = null;
                c24570i.onError(th);
            }
            this.f89647b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24570i<T> c24570i = this.f89652g;
            if (c24570i == null && !this.f89653h) {
                c24570i = C24570i.m31875g(this.f89649d, this);
                this.f89652g = c24570i;
                this.f89647b.onNext(c24570i);
            }
            if (c24570i != null) {
                c24570i.onNext(t);
                long j = this.f89650e + 1;
                this.f89650e = j;
                if (j >= this.f89648c) {
                    this.f89650e = 0L;
                    this.f89652g = null;
                    c24570i.onComplete();
                    if (this.f89653h) {
                        this.f89651f.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89651f, interfaceC23465c)) {
                this.f89651f = interfaceC23465c;
                this.f89647b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89653h) {
                this.f89651f.dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.H1$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC24020b<T> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Observable<T>> f89654b;

        /* renamed from: c */
        public final long f89655c;

        /* renamed from: d */
        public final long f89656d;

        /* renamed from: e */
        public final int f89657e;

        /* renamed from: g */
        public long f89659g;

        /* renamed from: h */
        public volatile boolean f89660h;

        /* renamed from: i */
        public long f89661i;

        /* renamed from: j */
        public InterfaceC23465c f89662j;

        /* renamed from: k */
        public final AtomicInteger f89663k = new AtomicInteger();

        /* renamed from: f */
        public final ArrayDeque<C24570i<T>> f89658f = new ArrayDeque<>();

        public RunnableC24020b(InterfaceC23436D<? super Observable<T>> interfaceC23436D, long j, long j2, int i) {
            this.f89654b = interfaceC23436D;
            this.f89655c = j;
            this.f89656d = j2;
            this.f89657e = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89660h = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89660h;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            ArrayDeque<C24570i<T>> arrayDeque = this.f89658f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f89654b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            ArrayDeque<C24570i<T>> arrayDeque = this.f89658f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f89654b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            ArrayDeque<C24570i<T>> arrayDeque = this.f89658f;
            long j = this.f89659g;
            long j2 = this.f89656d;
            if (j % j2 == 0 && !this.f89660h) {
                this.f89663k.getAndIncrement();
                C24570i<T> m31875g = C24570i.m31875g(this.f89657e, this);
                arrayDeque.offer(m31875g);
                this.f89654b.onNext(m31875g);
            }
            long j3 = this.f89661i + 1;
            Iterator<C24570i<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.f89655c) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f89660h) {
                    this.f89662j.dispose();
                    return;
                }
                this.f89661i = j3 - j2;
            } else {
                this.f89661i = j3;
            }
            this.f89659g = j + 1;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89662j, interfaceC23465c)) {
                this.f89662j = interfaceC23465c;
                this.f89654b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89663k.decrementAndGet() == 0 && this.f89660h) {
                this.f89662j.dispose();
            }
        }
    }

    public C24018H1(InterfaceC23434B<T> interfaceC23434B, long j, long j2, int i) {
        super(interfaceC23434B);
        this.f89644c = j;
        this.f89645d = j2;
        this.f89646e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Observable<T>> interfaceC23436D) {
        if (this.f89644c == this.f89645d) {
            this.f90078b.subscribe(new RunnableC24019a(interfaceC23436D, this.f89644c, this.f89646e));
        } else {
            this.f90078b.subscribe(new RunnableC24020b(interfaceC23436D, this.f89644c, this.f89645d, this.f89646e));
        }
    }
}
