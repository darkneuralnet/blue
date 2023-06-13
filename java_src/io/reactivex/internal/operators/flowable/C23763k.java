package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscribers.AbstractC24446a;
import io.reactivex.internal.subscribers.AbstractC24447b;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.flowable.k */
/* loaded from: classes6.dex */
public final class C23763k<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23484g<? super T> f88847d;

    /* renamed from: e */
    public final InterfaceC23484g<? super Throwable> f88848e;

    /* renamed from: f */
    public final InterfaceC23478a f88849f;

    /* renamed from: g */
    public final InterfaceC23478a f88850g;

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    /* loaded from: classes6.dex */
    public static final class C23764a<T> extends AbstractC24446a<T, T> {

        /* renamed from: g */
        public final InterfaceC23484g<? super T> f88851g;

        /* renamed from: h */
        public final InterfaceC23484g<? super Throwable> f88852h;

        /* renamed from: i */
        public final InterfaceC23478a f88853i;

        /* renamed from: j */
        public final InterfaceC23478a f88854j;

        public C23764a(InterfaceC23546a<? super T> interfaceC23546a, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
            super(interfaceC23546a);
            this.f88851g = interfaceC23484g;
            this.f88852h = interfaceC23484g2;
            this.f88853i = interfaceC23478a;
            this.f88854j = interfaceC23478a2;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32314f(i);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            if (this.f91019e) {
                return false;
            }
            try {
                this.f88851g.accept(t);
                return this.f91016b.mo32761h(t);
            } catch (Throwable th) {
                m32315e(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24446a, p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f91019e) {
                return;
            }
            try {
                this.f88853i.run();
                this.f91019e = true;
                this.f91016b.onComplete();
                try {
                    this.f88854j.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            } catch (Throwable th2) {
                m32315e(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24446a, p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f91019e) {
                C24508a.m31988u(th);
                return;
            }
            boolean z = true;
            this.f91019e = true;
            try {
                this.f88852h.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f91016b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f91016b.onError(th);
            }
            try {
                this.f88854j.run();
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                C24508a.m31988u(th3);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f91019e) {
                return;
            }
            if (this.f91020f != 0) {
                this.f91016b.onNext(null);
                return;
            }
            try {
                this.f88851g.accept(t);
                this.f91016b.onNext(t);
            } catch (Throwable th) {
                m32315e(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            try {
                T poll = this.f91018d.poll();
                if (poll != null) {
                    try {
                        this.f88851g.accept(poll);
                    } catch (Throwable th) {
                        try {
                            C23475a.m33009b(th);
                            this.f88852h.accept(th);
                            throw C24475k.m32258c(th);
                        } finally {
                            this.f88854j.run();
                        }
                    }
                } else if (this.f91020f == 1) {
                    this.f88853i.run();
                }
                return poll;
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                try {
                    this.f88852h.accept(th2);
                    throw C24475k.m32258c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.k$b */
    /* loaded from: classes6.dex */
    public static final class C23765b<T> extends AbstractC24447b<T, T> {

        /* renamed from: g */
        public final InterfaceC23484g<? super T> f88855g;

        /* renamed from: h */
        public final InterfaceC23484g<? super Throwable> f88856h;

        /* renamed from: i */
        public final InterfaceC23478a f88857i;

        /* renamed from: j */
        public final InterfaceC23478a f88858j;

        public C23765b(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
            super(interfaceC42141hT5);
            this.f88855g = interfaceC23484g;
            this.f88856h = interfaceC23484g2;
            this.f88857i = interfaceC23478a;
            this.f88858j = interfaceC23478a2;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32310f(i);
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24447b, p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f91024e) {
                return;
            }
            try {
                this.f88857i.run();
                this.f91024e = true;
                this.f91021b.onComplete();
                try {
                    this.f88858j.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            } catch (Throwable th2) {
                m32311e(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.AbstractC24447b, p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f91024e) {
                C24508a.m31988u(th);
                return;
            }
            boolean z = true;
            this.f91024e = true;
            try {
                this.f88856h.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f91021b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f91021b.onError(th);
            }
            try {
                this.f88858j.run();
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                C24508a.m31988u(th3);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f91024e) {
                return;
            }
            if (this.f91025f != 0) {
                this.f91021b.onNext(null);
                return;
            }
            try {
                this.f88855g.accept(t);
                this.f91021b.onNext(t);
            } catch (Throwable th) {
                m32311e(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            try {
                T poll = this.f91023d.poll();
                if (poll != null) {
                    try {
                        this.f88855g.accept(poll);
                    } catch (Throwable th) {
                        try {
                            C23475a.m33009b(th);
                            this.f88856h.accept(th);
                            throw C24475k.m32258c(th);
                        } finally {
                            this.f88858j.run();
                        }
                    }
                } else if (this.f91025f == 1) {
                    this.f88857i.run();
                }
                return poll;
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                try {
                    this.f88856h.accept(th2);
                    throw C24475k.m32258c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }
    }

    public C23763k(AbstractC24490k<T> abstractC24490k, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
        super(abstractC24490k);
        this.f88847d = interfaceC23484g;
        this.f88848e = interfaceC23484g2;
        this.f88849f = interfaceC23478a;
        this.f88850g = interfaceC23478a2;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23764a((InterfaceC23546a) interfaceC42141hT5, this.f88847d, this.f88848e, this.f88849f, this.f88850g));
        } else {
            this.f88638c.m32166W0(new C23765b(interfaceC42141hT5, this.f88847d, this.f88848e, this.f88849f, this.f88850g));
        }
    }
}
