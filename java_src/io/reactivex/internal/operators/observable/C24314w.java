package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.observers.C23572q;
import io.reactivex.internal.observers.InterfaceC23573r;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.plugins.C24508a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.w */
/* loaded from: classes6.dex */
public final class C24314w<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90669c;

    /* renamed from: d */
    public final EnumC24474j f90670d;

    /* renamed from: e */
    public final int f90671e;

    /* renamed from: f */
    public final int f90672f;

    /* renamed from: io.reactivex.internal.operators.observable.w$a */
    /* loaded from: classes6.dex */
    public static final class C24315a<T, R> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC23573r<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90673b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90674c;

        /* renamed from: d */
        public final int f90675d;

        /* renamed from: e */
        public final int f90676e;

        /* renamed from: f */
        public final EnumC24474j f90677f;

        /* renamed from: g */
        public final C24467c f90678g = new C24467c();

        /* renamed from: h */
        public final ArrayDeque<C23572q<R>> f90679h = new ArrayDeque<>();

        /* renamed from: i */
        public InterfaceC23555j<T> f90680i;

        /* renamed from: j */
        public InterfaceC23465c f90681j;

        /* renamed from: k */
        public volatile boolean f90682k;

        /* renamed from: l */
        public int f90683l;

        /* renamed from: m */
        public volatile boolean f90684m;

        /* renamed from: n */
        public C23572q<R> f90685n;

        /* renamed from: o */
        public int f90686o;

        public C24315a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, int i, int i2, EnumC24474j enumC24474j) {
            this.f90673b = interfaceC23436D;
            this.f90674c = interfaceC23492o;
            this.f90675d = i;
            this.f90676e = i2;
            this.f90677f = enumC24474j;
        }

        @Override // io.reactivex.internal.observers.InterfaceC23573r
        /* renamed from: a */
        public void mo32410a(C23572q<R> c23572q, Throwable th) {
            if (this.f90678g.m32276a(th)) {
                if (this.f90677f == EnumC24474j.IMMEDIATE) {
                    this.f90681j.dispose();
                }
                c23572q.m32906c();
                mo32409b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.internal.observers.InterfaceC23573r
        /* renamed from: b */
        public void mo32409b() {
            R poll;
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC23555j<T> interfaceC23555j = this.f90680i;
            ArrayDeque<C23572q<R>> arrayDeque = this.f90679h;
            InterfaceC23436D<? super R> interfaceC23436D = this.f90673b;
            EnumC24474j enumC24474j = this.f90677f;
            int i = 1;
            while (true) {
                int i2 = this.f90686o;
                while (i2 != this.f90675d) {
                    if (this.f90684m) {
                        interfaceC23555j.clear();
                        m32406g();
                        return;
                    } else if (enumC24474j == EnumC24474j.IMMEDIATE && this.f90678g.get() != null) {
                        interfaceC23555j.clear();
                        m32406g();
                        interfaceC23436D.onError(this.f90678g.m32275b());
                        return;
                    } else {
                        try {
                            T poll2 = interfaceC23555j.poll();
                            if (poll2 == null) {
                                break;
                            }
                            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90674c.apply(poll2), "The mapper returned a null ObservableSource");
                            C23572q<R> c23572q = new C23572q<>(this, this.f90676e);
                            arrayDeque.offer(c23572q);
                            interfaceC23434B.subscribe(c23572q);
                            i2++;
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            this.f90681j.dispose();
                            interfaceC23555j.clear();
                            m32406g();
                            this.f90678g.m32276a(th);
                            interfaceC23436D.onError(this.f90678g.m32275b());
                            return;
                        }
                    }
                }
                this.f90686o = i2;
                if (this.f90684m) {
                    interfaceC23555j.clear();
                    m32406g();
                    return;
                } else if (enumC24474j == EnumC24474j.IMMEDIATE && this.f90678g.get() != null) {
                    interfaceC23555j.clear();
                    m32406g();
                    interfaceC23436D.onError(this.f90678g.m32275b());
                    return;
                } else {
                    C23572q<R> c23572q2 = this.f90685n;
                    if (c23572q2 == null) {
                        if (enumC24474j == EnumC24474j.BOUNDARY && this.f90678g.get() != null) {
                            interfaceC23555j.clear();
                            m32406g();
                            interfaceC23436D.onError(this.f90678g.m32275b());
                            return;
                        }
                        boolean z3 = this.f90682k;
                        C23572q<R> poll3 = arrayDeque.poll();
                        if (poll3 == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            if (this.f90678g.get() != null) {
                                interfaceC23555j.clear();
                                m32406g();
                                interfaceC23436D.onError(this.f90678g.m32275b());
                                return;
                            }
                            interfaceC23436D.onComplete();
                            return;
                        }
                        if (!z2) {
                            this.f90685n = poll3;
                        }
                        c23572q2 = poll3;
                    }
                    if (c23572q2 != null) {
                        InterfaceC23555j<R> m32907b = c23572q2.m32907b();
                        while (!this.f90684m) {
                            boolean m32908a = c23572q2.m32908a();
                            if (enumC24474j == EnumC24474j.IMMEDIATE && this.f90678g.get() != null) {
                                interfaceC23555j.clear();
                                m32406g();
                                interfaceC23436D.onError(this.f90678g.m32275b());
                                return;
                            }
                            try {
                                poll = m32907b.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } catch (Throwable th2) {
                                C23475a.m33009b(th2);
                                this.f90678g.m32276a(th2);
                                this.f90685n = null;
                                this.f90686o--;
                            }
                            if (m32908a && z) {
                                this.f90685n = null;
                                this.f90686o--;
                            } else if (!z) {
                                interfaceC23436D.onNext(poll);
                            }
                        }
                        interfaceC23555j.clear();
                        m32406g();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.observers.InterfaceC23573r
        /* renamed from: c */
        public void mo32408c(C23572q<R> c23572q) {
            c23572q.m32906c();
            mo32409b();
        }

        @Override // io.reactivex.internal.observers.InterfaceC23573r
        /* renamed from: d */
        public void mo32407d(C23572q<R> c23572q, R r) {
            c23572q.m32907b().offer(r);
            mo32409b();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90684m) {
                return;
            }
            this.f90684m = true;
            this.f90681j.dispose();
            m32405h();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90684m;
        }

        /* renamed from: g */
        public void m32406g() {
            C23572q<R> c23572q = this.f90685n;
            if (c23572q != null) {
                c23572q.dispose();
            }
            while (true) {
                C23572q<R> poll = this.f90679h.poll();
                if (poll == null) {
                    return;
                }
                poll.dispose();
            }
        }

        /* renamed from: h */
        public void m32405h() {
            if (getAndIncrement() == 0) {
                do {
                    this.f90680i.clear();
                    m32406g();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90682k = true;
            mo32409b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90678g.m32276a(th)) {
                this.f90682k = true;
                mo32409b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90683l == 0) {
                this.f90680i.offer(t);
            }
            mo32409b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90681j, interfaceC23465c)) {
                this.f90681j = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(3);
                    if (mo31868b == 1) {
                        this.f90683l = mo31868b;
                        this.f90680i = interfaceC23550e;
                        this.f90682k = true;
                        this.f90673b.onSubscribe(this);
                        mo32409b();
                        return;
                    } else if (mo31868b == 2) {
                        this.f90683l = mo31868b;
                        this.f90680i = interfaceC23550e;
                        this.f90673b.onSubscribe(this);
                        return;
                    }
                }
                this.f90680i = new C24409c(this.f90676e);
                this.f90673b.onSubscribe(this);
            }
        }
    }

    public C24314w(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, EnumC24474j enumC24474j, int i, int i2) {
        super(interfaceC23434B);
        this.f90669c = interfaceC23492o;
        this.f90670d = enumC24474j;
        this.f90671e = i;
        this.f90672f = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f90078b.subscribe(new C24315a(interfaceC23436D, this.f90669c, this.f90671e, this.f90672f, this.f90670d));
    }
}
