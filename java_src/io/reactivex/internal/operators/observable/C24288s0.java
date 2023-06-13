package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.observable.C24216l0;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.s0 */
/* loaded from: classes6.dex */
public final class C24288s0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC24145a<TLeft, R> {

    /* renamed from: c */
    public final InterfaceC23434B<? extends TRight> f90552c;

    /* renamed from: d */
    public final InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> f90553d;

    /* renamed from: e */
    public final InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> f90554e;

    /* renamed from: f */
    public final InterfaceC23480c<? super TLeft, ? super TRight, ? extends R> f90555f;

    /* renamed from: io.reactivex.internal.operators.observable.s0$a */
    /* loaded from: classes6.dex */
    public static final class C24289a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC23465c, C24216l0.InterfaceC24218b {

        /* renamed from: o */
        public static final Integer f90556o = 1;

        /* renamed from: p */
        public static final Integer f90557p = 2;

        /* renamed from: q */
        public static final Integer f90558q = 3;

        /* renamed from: r */
        public static final Integer f90559r = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90560b;

        /* renamed from: h */
        public final InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> f90566h;

        /* renamed from: i */
        public final InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> f90567i;

        /* renamed from: j */
        public final InterfaceC23480c<? super TLeft, ? super TRight, ? extends R> f90568j;

        /* renamed from: l */
        public int f90570l;

        /* renamed from: m */
        public int f90571m;

        /* renamed from: n */
        public volatile boolean f90572n;

        /* renamed from: d */
        public final C23464b f90562d = new C23464b();

        /* renamed from: c */
        public final C24409c<Object> f90561c = new C24409c<>(Observable.bufferSize());

        /* renamed from: e */
        public final Map<Integer, TLeft> f90563e = new LinkedHashMap();

        /* renamed from: f */
        public final Map<Integer, TRight> f90564f = new LinkedHashMap();

        /* renamed from: g */
        public final AtomicReference<Throwable> f90565g = new AtomicReference<>();

        /* renamed from: k */
        public final AtomicInteger f90569k = new AtomicInteger(2);

        public C24289a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super TLeft, ? super TRight, ? extends R> interfaceC23480c) {
            this.f90560b = interfaceC23436D;
            this.f90566h = interfaceC23492o;
            this.f90567i = interfaceC23492o2;
            this.f90568j = interfaceC23480c;
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: a */
        public void mo32437a(Throwable th) {
            if (C24475k.m32260a(this.f90565g, th)) {
                this.f90569k.decrementAndGet();
                m32431i();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: b */
        public void mo32436b(boolean z, C24216l0.C24219c c24219c) {
            Integer num;
            synchronized (this) {
                C24409c<Object> c24409c = this.f90561c;
                if (z) {
                    num = f90558q;
                } else {
                    num = f90559r;
                }
                c24409c.m32365m(num, c24219c);
            }
            m32431i();
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: c */
        public void mo32435c(Throwable th) {
            if (C24475k.m32260a(this.f90565g, th)) {
                m32431i();
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: d */
        public void mo32434d(C24216l0.C24220d c24220d) {
            this.f90562d.mo32984b(c24220d);
            this.f90569k.decrementAndGet();
            m32431i();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90572n) {
                this.f90572n = true;
                m32432h();
                if (getAndIncrement() == 0) {
                    this.f90561c.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90572n;
        }

        @Override // io.reactivex.internal.operators.observable.C24216l0.InterfaceC24218b
        /* renamed from: g */
        public void mo32433g(boolean z, Object obj) {
            Integer num;
            synchronized (this) {
                C24409c<Object> c24409c = this.f90561c;
                if (z) {
                    num = f90556o;
                } else {
                    num = f90557p;
                }
                c24409c.m32365m(num, obj);
            }
            m32431i();
        }

        /* renamed from: h */
        public void m32432h() {
            this.f90562d.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: i */
        public void m32431i() {
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            C24409c<?> c24409c = this.f90561c;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90560b;
            int i = 1;
            while (!this.f90572n) {
                if (this.f90565g.get() != null) {
                    c24409c.clear();
                    m32432h();
                    m32430j(interfaceC23436D);
                    return;
                }
                if (this.f90569k.get() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Integer num = (Integer) c24409c.poll();
                if (num == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    this.f90563e.clear();
                    this.f90564f.clear();
                    this.f90562d.dispose();
                    interfaceC23436D.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    Object poll = c24409c.poll();
                    if (num == f90556o) {
                        int i2 = this.f90570l;
                        this.f90570l = i2 + 1;
                        this.f90563e.put(Integer.valueOf(i2), poll);
                        try {
                            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90566h.apply(poll), "The leftEnd returned a null ObservableSource");
                            C24216l0.C24219c c24219c = new C24216l0.C24219c(this, true, i2);
                            this.f90562d.mo32983c(c24219c);
                            interfaceC23434B.subscribe(c24219c);
                            if (this.f90565g.get() != null) {
                                c24409c.clear();
                                m32432h();
                                m32430j(interfaceC23436D);
                                return;
                            }
                            for (TRight tright : this.f90564f.values()) {
                                try {
                                    interfaceC23436D.onNext((Object) C23544b.m32923e(this.f90568j.apply(poll, tright), "The resultSelector returned a null value"));
                                } catch (Throwable th) {
                                    m32429k(th, interfaceC23436D, c24409c);
                                    return;
                                }
                            }
                            continue;
                        } catch (Throwable th2) {
                            m32429k(th2, interfaceC23436D, c24409c);
                            return;
                        }
                    } else if (num == f90557p) {
                        int i3 = this.f90571m;
                        this.f90571m = i3 + 1;
                        this.f90564f.put(Integer.valueOf(i3), poll);
                        try {
                            InterfaceC23434B interfaceC23434B2 = (InterfaceC23434B) C23544b.m32923e(this.f90567i.apply(poll), "The rightEnd returned a null ObservableSource");
                            C24216l0.C24219c c24219c2 = new C24216l0.C24219c(this, false, i3);
                            this.f90562d.mo32983c(c24219c2);
                            interfaceC23434B2.subscribe(c24219c2);
                            if (this.f90565g.get() != null) {
                                c24409c.clear();
                                m32432h();
                                m32430j(interfaceC23436D);
                                return;
                            }
                            for (TLeft tleft : this.f90563e.values()) {
                                try {
                                    interfaceC23436D.onNext((Object) C23544b.m32923e(this.f90568j.apply(tleft, poll), "The resultSelector returned a null value"));
                                } catch (Throwable th3) {
                                    m32429k(th3, interfaceC23436D, c24409c);
                                    return;
                                }
                            }
                            continue;
                        } catch (Throwable th4) {
                            m32429k(th4, interfaceC23436D, c24409c);
                            return;
                        }
                    } else if (num == f90558q) {
                        C24216l0.C24219c c24219c3 = (C24216l0.C24219c) poll;
                        this.f90563e.remove(Integer.valueOf(c24219c3.f90333d));
                        this.f90562d.mo32985a(c24219c3);
                    } else {
                        C24216l0.C24219c c24219c4 = (C24216l0.C24219c) poll;
                        this.f90564f.remove(Integer.valueOf(c24219c4.f90333d));
                        this.f90562d.mo32985a(c24219c4);
                    }
                }
            }
            c24409c.clear();
        }

        /* renamed from: j */
        public void m32430j(InterfaceC23436D<?> interfaceC23436D) {
            Throwable m32259b = C24475k.m32259b(this.f90565g);
            this.f90563e.clear();
            this.f90564f.clear();
            interfaceC23436D.onError(m32259b);
        }

        /* renamed from: k */
        public void m32429k(Throwable th, InterfaceC23436D<?> interfaceC23436D, C24409c<?> c24409c) {
            C23475a.m33009b(th);
            C24475k.m32260a(this.f90565g, th);
            c24409c.clear();
            m32432h();
            m32430j(interfaceC23436D);
        }
    }

    public C24288s0(InterfaceC23434B<TLeft> interfaceC23434B, InterfaceC23434B<? extends TRight> interfaceC23434B2, InterfaceC23492o<? super TLeft, ? extends InterfaceC23434B<TLeftEnd>> interfaceC23492o, InterfaceC23492o<? super TRight, ? extends InterfaceC23434B<TRightEnd>> interfaceC23492o2, InterfaceC23480c<? super TLeft, ? super TRight, ? extends R> interfaceC23480c) {
        super(interfaceC23434B);
        this.f90552c = interfaceC23434B2;
        this.f90553d = interfaceC23492o;
        this.f90554e = interfaceC23492o2;
        this.f90555f = interfaceC23480c;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C24289a c24289a = new C24289a(interfaceC23436D, this.f90553d, this.f90554e, this.f90555f);
        interfaceC23436D.onSubscribe(c24289a);
        C24216l0.C24220d c24220d = new C24216l0.C24220d(c24289a, true);
        c24289a.f90562d.mo32983c(c24220d);
        C24216l0.C24220d c24220d2 = new C24216l0.C24220d(c24289a, false);
        c24289a.f90562d.mo32983c(c24220d2);
        this.f90078b.subscribe(c24220d);
        this.f90552c.subscribe(c24220d2);
    }
}
