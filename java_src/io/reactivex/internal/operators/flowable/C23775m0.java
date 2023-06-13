package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.m0 */
/* loaded from: classes6.dex */
public final class C23775m0<T, R> extends AbstractC23695a<T, R> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> f88891d;

    /* renamed from: e */
    public final int f88892e;

    /* renamed from: f */
    public final boolean f88893f;

    /* renamed from: io.reactivex.internal.operators.flowable.m0$a */
    /* loaded from: classes6.dex */
    public static final class C23776a<T, R> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: b */
        public final C23777b<T, R> f88894b;

        /* renamed from: c */
        public final long f88895c;

        /* renamed from: d */
        public final int f88896d;

        /* renamed from: e */
        public volatile InterfaceC23555j<R> f88897e;

        /* renamed from: f */
        public volatile boolean f88898f;

        /* renamed from: g */
        public int f88899g;

        public C23776a(C23777b<T, R> c23777b, long j, int i) {
            this.f88894b = c23777b;
            this.f88895c = j;
            this.f88896d = i;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88899g = mo31868b;
                        this.f88897e = interfaceC23552g;
                        this.f88898f = true;
                        this.f88894b.m32792c();
                        return;
                    } else if (mo31868b == 2) {
                        this.f88899g = mo31868b;
                        this.f88897e = interfaceC23552g;
                        interfaceC46292oT5.mo21023o(this.f88896d);
                        return;
                    }
                }
                this.f88897e = new C24408b(this.f88896d);
                interfaceC46292oT5.mo21023o(this.f88896d);
            }
        }

        /* renamed from: b */
        public void m32795b() {
            EnumC24463g.m32294a(this);
        }

        /* renamed from: c */
        public void m32794c(long j) {
            if (this.f88899g != 1) {
                get().mo21023o(j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            C23777b<T, R> c23777b = this.f88894b;
            if (this.f88895c == c23777b.f88911l) {
                this.f88898f = true;
                c23777b.m32792c();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            C23777b<T, R> c23777b = this.f88894b;
            if (this.f88895c == c23777b.f88911l && c23777b.f88906g.m32276a(th)) {
                if (!c23777b.f88904e) {
                    c23777b.f88908i.cancel();
                    c23777b.f88905f = true;
                }
                this.f88898f = true;
                c23777b.m32792c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(R r) {
            C23777b<T, R> c23777b = this.f88894b;
            if (this.f88895c == c23777b.f88911l) {
                if (this.f88899g == 0 && !this.f88897e.offer(r)) {
                    onError(new MissingBackpressureException("Queue full?!"));
                } else {
                    c23777b.m32792c();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.m0$b */
    /* loaded from: classes6.dex */
    public static final class C23777b<T, R> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {

        /* renamed from: m */
        public static final C23776a<Object, Object> f88900m;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f88901b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> f88902c;

        /* renamed from: d */
        public final int f88903d;

        /* renamed from: e */
        public final boolean f88904e;

        /* renamed from: f */
        public volatile boolean f88905f;

        /* renamed from: h */
        public volatile boolean f88907h;

        /* renamed from: i */
        public InterfaceC46292oT5 f88908i;

        /* renamed from: l */
        public volatile long f88911l;

        /* renamed from: j */
        public final AtomicReference<C23776a<T, R>> f88909j = new AtomicReference<>();

        /* renamed from: k */
        public final AtomicLong f88910k = new AtomicLong();

        /* renamed from: g */
        public final C24467c f88906g = new C24467c();

        static {
            C23776a<Object, Object> c23776a = new C23776a<>(null, -1L, 1);
            f88900m = c23776a;
            c23776a.m32795b();
        }

        public C23777b(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, int i, boolean z) {
            this.f88901b = interfaceC42141hT5;
            this.f88902c = interfaceC23492o;
            this.f88903d = i;
            this.f88904e = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88908i, interfaceC46292oT5)) {
                this.f88908i = interfaceC46292oT5;
                this.f88901b.mo31867a(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m32793b() {
            C23776a<Object, Object> c23776a;
            C23776a<T, R> c23776a2 = this.f88909j.get();
            C23776a<Object, Object> c23776a3 = f88900m;
            if (c23776a2 != c23776a3 && (c23776a = (C23776a) this.f88909j.getAndSet(c23776a3)) != c23776a3 && c23776a != null) {
                c23776a.m32795b();
            }
        }

        /* renamed from: c */
        public void m32792c() {
            InterfaceC23555j<R> interfaceC23555j;
            boolean z;
            R r;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f88901b;
            int i = 1;
            while (!this.f88907h) {
                if (this.f88905f) {
                    if (this.f88904e) {
                        if (this.f88909j.get() == null) {
                            if (this.f88906g.get() != null) {
                                interfaceC42141hT5.onError(this.f88906g.m32275b());
                                return;
                            } else {
                                interfaceC42141hT5.onComplete();
                                return;
                            }
                        }
                    } else if (this.f88906g.get() != null) {
                        m32793b();
                        interfaceC42141hT5.onError(this.f88906g.m32275b());
                        return;
                    } else if (this.f88909j.get() == null) {
                        interfaceC42141hT5.onComplete();
                        return;
                    }
                }
                C23776a<T, R> c23776a = this.f88909j.get();
                if (c23776a != null) {
                    interfaceC23555j = c23776a.f88897e;
                } else {
                    interfaceC23555j = null;
                }
                if (interfaceC23555j != null) {
                    if (c23776a.f88898f) {
                        if (!this.f88904e) {
                            if (this.f88906g.get() != null) {
                                m32793b();
                                interfaceC42141hT5.onError(this.f88906g.m32275b());
                                return;
                            } else if (interfaceC23555j.isEmpty()) {
                                C42482i24.m35337a(this.f88909j, c23776a, null);
                            }
                        } else if (interfaceC23555j.isEmpty()) {
                            C42482i24.m35337a(this.f88909j, c23776a, null);
                        }
                    }
                    long j = this.f88910k.get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 != j) {
                            if (this.f88907h) {
                                return;
                            }
                            boolean z3 = c23776a.f88898f;
                            try {
                                r = interfaceC23555j.poll();
                            } catch (Throwable th) {
                                C23475a.m33009b(th);
                                c23776a.m32795b();
                                this.f88906g.m32276a(th);
                                r = (Object) null;
                                z3 = true;
                            }
                            if (r == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (c23776a != this.f88909j.get()) {
                                break;
                            }
                            if (z3) {
                                if (!this.f88904e) {
                                    if (this.f88906g.get() != null) {
                                        interfaceC42141hT5.onError(this.f88906g.m32275b());
                                        return;
                                    } else if (z2) {
                                        C42482i24.m35337a(this.f88909j, c23776a, null);
                                        break;
                                    }
                                } else if (z2) {
                                    C42482i24.m35337a(this.f88909j, c23776a, null);
                                    break;
                                }
                            }
                            if (z2) {
                                break;
                            }
                            interfaceC42141hT5.onNext(r);
                            j2++;
                        } else {
                            break;
                        }
                    }
                    z = true;
                    if (j2 != 0 && !this.f88907h) {
                        if (j != LongCompanionObject.MAX_VALUE) {
                            this.f88910k.addAndGet(-j2);
                        }
                        c23776a.m32794c(j2);
                    }
                    if (z) {
                        continue;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f88907h) {
                this.f88907h = true;
                this.f88908i.cancel();
                m32793b();
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88910k, j);
                if (this.f88911l == 0) {
                    this.f88908i.mo21023o(LongCompanionObject.MAX_VALUE);
                } else {
                    m32792c();
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88905f) {
                return;
            }
            this.f88905f = true;
            m32792c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (!this.f88905f && this.f88906g.m32276a(th)) {
                if (!this.f88904e) {
                    m32793b();
                }
                this.f88905f = true;
                m32792c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            C23776a<T, R> c23776a;
            if (this.f88905f) {
                return;
            }
            long j = this.f88911l + 1;
            this.f88911l = j;
            C23776a<T, R> c23776a2 = this.f88909j.get();
            if (c23776a2 != null) {
                c23776a2.m32795b();
            }
            try {
                InterfaceC45761na4 interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(this.f88902c.apply(t), "The publisher returned is null");
                C23776a c23776a3 = new C23776a(this, j, this.f88903d);
                do {
                    c23776a = this.f88909j.get();
                    if (c23776a == f88900m) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f88909j, c23776a, c23776a3));
                interfaceC45761na4.mo23497c(c23776a3);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88908i.cancel();
                onError(th);
            }
        }
    }

    public C23775m0(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC45761na4<? extends R>> interfaceC23492o, int i, boolean z) {
        super(abstractC24490k);
        this.f88891d = interfaceC23492o;
        this.f88892e = i;
        this.f88893f = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        if (C23746g0.m32799b(this.f88638c, interfaceC42141hT5, this.f88891d)) {
            return;
        }
        this.f88638c.m32166W0(new C23777b(interfaceC42141hT5, this.f88891d, this.f88892e, this.f88893f));
    }
}
