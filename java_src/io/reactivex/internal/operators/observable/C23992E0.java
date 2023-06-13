package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.observers.AbstractC23557b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.schedulers.C24441p;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.E0 */
/* loaded from: classes6.dex */
public final class C23992E0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final AbstractC23437E f89565c;

    /* renamed from: d */
    public final boolean f89566d;

    /* renamed from: e */
    public final int f89567e;

    /* renamed from: io.reactivex.internal.operators.observable.E0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23993a<T> extends AbstractC23557b<T> implements InterfaceC23436D<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89568b;

        /* renamed from: c */
        public final AbstractC23437E.AbstractC23440c f89569c;

        /* renamed from: d */
        public final boolean f89570d;

        /* renamed from: e */
        public final int f89571e;

        /* renamed from: f */
        public InterfaceC23555j<T> f89572f;

        /* renamed from: g */
        public InterfaceC23465c f89573g;

        /* renamed from: h */
        public Throwable f89574h;

        /* renamed from: i */
        public volatile boolean f89575i;

        /* renamed from: j */
        public volatile boolean f89576j;

        /* renamed from: k */
        public int f89577k;

        /* renamed from: l */
        public boolean f89578l;

        public RunnableC23993a(InterfaceC23436D<? super T> interfaceC23436D, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z, int i) {
            this.f89568b = interfaceC23436D;
            this.f89569c = abstractC23440c;
            this.f89570d = z;
            this.f89571e = i;
        }

        /* renamed from: a */
        public boolean m32663a(boolean z, boolean z2, InterfaceC23436D<? super T> interfaceC23436D) {
            if (this.f89576j) {
                this.f89572f.clear();
                return true;
            } else if (z) {
                Throwable th = this.f89574h;
                if (this.f89570d) {
                    if (z2) {
                        this.f89576j = true;
                        if (th != null) {
                            interfaceC23436D.onError(th);
                        } else {
                            interfaceC23436D.onComplete();
                        }
                        this.f89569c.dispose();
                        return true;
                    }
                    return false;
                } else if (th != null) {
                    this.f89576j = true;
                    this.f89572f.clear();
                    interfaceC23436D.onError(th);
                    this.f89569c.dispose();
                    return true;
                } else if (z2) {
                    this.f89576j = true;
                    interfaceC23436D.onComplete();
                    this.f89569c.dispose();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 2) != 0) {
                this.f89578l = true;
                return 2;
            }
            return 0;
        }

        /* renamed from: c */
        public void m32662c() {
            int i = 1;
            while (!this.f89576j) {
                boolean z = this.f89575i;
                Throwable th = this.f89574h;
                if (!this.f89570d && z && th != null) {
                    this.f89576j = true;
                    this.f89568b.onError(this.f89574h);
                    this.f89569c.dispose();
                    return;
                }
                this.f89568b.onNext(null);
                if (z) {
                    this.f89576j = true;
                    Throwable th2 = this.f89574h;
                    if (th2 != null) {
                        this.f89568b.onError(th2);
                    } else {
                        this.f89568b.onComplete();
                    }
                    this.f89569c.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89572f.clear();
        }

        /* renamed from: d */
        public void m32661d() {
            boolean z;
            InterfaceC23555j<T> interfaceC23555j = this.f89572f;
            InterfaceC23436D<? super T> interfaceC23436D = this.f89568b;
            int i = 1;
            while (!m32663a(this.f89575i, interfaceC23555j.isEmpty(), interfaceC23436D)) {
                while (true) {
                    boolean z2 = this.f89575i;
                    try {
                        Object obj = (T) interfaceC23555j.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32663a(z2, z, interfaceC23436D)) {
                            return;
                        }
                        if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            interfaceC23436D.onNext(obj);
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f89576j = true;
                        this.f89573g.dispose();
                        interfaceC23555j.clear();
                        interfaceC23436D.onError(th);
                        this.f89569c.dispose();
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f89576j) {
                this.f89576j = true;
                this.f89573g.dispose();
                this.f89569c.dispose();
                if (!this.f89578l && getAndIncrement() == 0) {
                    this.f89572f.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89576j;
        }

        /* renamed from: g */
        public void m32660g() {
            if (getAndIncrement() == 0) {
                this.f89569c.mo32320b(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f89572f.isEmpty();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89575i) {
                return;
            }
            this.f89575i = true;
            m32660g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89575i) {
                C24508a.m31988u(th);
                return;
            }
            this.f89574h = th;
            this.f89575i = true;
            m32660g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89575i) {
                return;
            }
            if (this.f89577k != 2) {
                this.f89572f.offer(t);
            }
            m32660g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89573g, interfaceC23465c)) {
                this.f89573g = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f89577k = mo31868b;
                        this.f89572f = interfaceC23550e;
                        this.f89575i = true;
                        this.f89568b.onSubscribe(this);
                        m32660g();
                        return;
                    } else if (mo31868b == 2) {
                        this.f89577k = mo31868b;
                        this.f89572f = interfaceC23550e;
                        this.f89568b.onSubscribe(this);
                        return;
                    }
                }
                this.f89572f = new C24409c(this.f89571e);
                this.f89568b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            return this.f89572f.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f89578l) {
                m32662c();
            } else {
                m32661d();
            }
        }
    }

    public C23992E0(InterfaceC23434B<T> interfaceC23434B, AbstractC23437E abstractC23437E, boolean z, int i) {
        super(interfaceC23434B);
        this.f89565c = abstractC23437E;
        this.f89566d = z;
        this.f89567e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        AbstractC23437E abstractC23437E = this.f89565c;
        if (abstractC23437E instanceof C24441p) {
            this.f90078b.subscribe(interfaceC23436D);
            return;
        }
        this.f90078b.subscribe(new RunnableC23993a(interfaceC23436D, abstractC23437E.mo8041b(), this.f89566d, this.f89567e));
    }
}
