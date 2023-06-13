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
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.y */
/* loaded from: classes6.dex */
public final class C23826y<T, R> extends AbstractC23695a<T, R> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends Iterable<? extends R>> f89110d;

    /* renamed from: e */
    public final int f89111e;

    /* renamed from: io.reactivex.internal.operators.flowable.y$a */
    /* loaded from: classes6.dex */
    public static final class C23827a<T, R> extends AbstractC24457a<R> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89112b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends Iterable<? extends R>> f89113c;

        /* renamed from: d */
        public final int f89114d;

        /* renamed from: e */
        public final int f89115e;

        /* renamed from: g */
        public InterfaceC46292oT5 f89117g;

        /* renamed from: h */
        public InterfaceC23555j<T> f89118h;

        /* renamed from: i */
        public volatile boolean f89119i;

        /* renamed from: j */
        public volatile boolean f89120j;

        /* renamed from: l */
        public Iterator<? extends R> f89122l;

        /* renamed from: m */
        public int f89123m;

        /* renamed from: n */
        public int f89124n;

        /* renamed from: k */
        public final AtomicReference<Throwable> f89121k = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicLong f89116f = new AtomicLong();

        public C23827a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends Iterable<? extends R>> interfaceC23492o, int i) {
            this.f89112b = interfaceC42141hT5;
            this.f89113c = interfaceC23492o;
            this.f89114d = i;
            this.f89115e = i - (i >> 2);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89117g, interfaceC46292oT5)) {
                this.f89117g = interfaceC46292oT5;
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(3);
                    if (mo31868b == 1) {
                        this.f89124n = mo31868b;
                        this.f89118h = interfaceC23552g;
                        this.f89119i = true;
                        this.f89112b.mo31867a(this);
                        return;
                    } else if (mo31868b == 2) {
                        this.f89124n = mo31868b;
                        this.f89118h = interfaceC23552g;
                        this.f89112b.mo31867a(this);
                        interfaceC46292oT5.mo21023o(this.f89114d);
                        return;
                    }
                }
                this.f89118h = new C24408b(this.f89114d);
                this.f89112b.mo31867a(this);
                interfaceC46292oT5.mo21023o(this.f89114d);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return ((i & 1) == 0 || this.f89124n != 1) ? 0 : 1;
        }

        /* renamed from: c */
        public boolean m32750c(boolean z, boolean z2, InterfaceC42141hT5<?> interfaceC42141hT5, InterfaceC23555j<?> interfaceC23555j) {
            if (this.f89120j) {
                this.f89122l = null;
                interfaceC23555j.clear();
                return true;
            } else if (z) {
                if (this.f89121k.get() != null) {
                    Throwable m32259b = C24475k.m32259b(this.f89121k);
                    this.f89122l = null;
                    interfaceC23555j.clear();
                    interfaceC42141hT5.onError(m32259b);
                    return true;
                } else if (z2) {
                    interfaceC42141hT5.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f89120j) {
                this.f89120j = true;
                this.f89117g.cancel();
                if (getAndIncrement() == 0) {
                    this.f89118h.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89122l = null;
            this.f89118h.clear();
        }

        /* renamed from: d */
        public void m32749d(boolean z) {
            if (z) {
                int i = this.f89123m + 1;
                if (i == this.f89115e) {
                    this.f89123m = 0;
                    this.f89117g.mo21023o(i);
                    return;
                }
                this.f89123m = i;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
            if (r6 == null) goto L58;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32748e() {
            boolean z;
            boolean z2;
            boolean z3;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<?> interfaceC42141hT5 = this.f89112b;
            InterfaceC23555j<T> interfaceC23555j = this.f89118h;
            boolean z4 = true;
            if (this.f89124n != 1) {
                z = true;
            } else {
                z = false;
            }
            Iterator<? extends R> it = this.f89122l;
            int i = 1;
            while (true) {
                if (it == null) {
                    boolean z5 = this.f89119i;
                    try {
                        T poll = interfaceC23555j.poll();
                        if (poll == null) {
                            z3 = z4;
                        } else {
                            z3 = false;
                        }
                        if (m32750c(z5, z3, interfaceC42141hT5, interfaceC23555j)) {
                            return;
                        }
                        if (poll != null) {
                            try {
                                it = this.f89113c.apply(poll).iterator();
                                if (!it.hasNext()) {
                                    m32749d(z);
                                    it = null;
                                } else {
                                    this.f89122l = it;
                                }
                            } catch (Throwable th) {
                                C23475a.m33009b(th);
                                this.f89117g.cancel();
                                C24475k.m32260a(this.f89121k, th);
                                interfaceC42141hT5.onError(C24475k.m32259b(this.f89121k));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        this.f89117g.cancel();
                        C24475k.m32260a(this.f89121k, th2);
                        Throwable m32259b = C24475k.m32259b(this.f89121k);
                        this.f89122l = null;
                        interfaceC23555j.clear();
                        interfaceC42141hT5.onError(m32259b);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.f89116f.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            break;
                        } else if (m32750c(this.f89119i, false, interfaceC42141hT5, interfaceC23555j)) {
                            return;
                        } else {
                            try {
                                interfaceC42141hT5.onNext((Object) C23544b.m32923e(it.next(), "The iterator returned a null value"));
                                if (m32750c(this.f89119i, false, interfaceC42141hT5, interfaceC23555j)) {
                                    return;
                                }
                                j2++;
                                try {
                                    if (!it.hasNext()) {
                                        m32749d(z);
                                        this.f89122l = null;
                                        it = null;
                                        break;
                                    }
                                } catch (Throwable th3) {
                                    C23475a.m33009b(th3);
                                    this.f89122l = null;
                                    this.f89117g.cancel();
                                    C24475k.m32260a(this.f89121k, th3);
                                    interfaceC42141hT5.onError(C24475k.m32259b(this.f89121k));
                                    return;
                                }
                            } catch (Throwable th4) {
                                C23475a.m33009b(th4);
                                this.f89122l = null;
                                this.f89117g.cancel();
                                C24475k.m32260a(this.f89121k, th4);
                                interfaceC42141hT5.onError(C24475k.m32259b(this.f89121k));
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        boolean z6 = this.f89119i;
                        if (interfaceC23555j.isEmpty() && it == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (m32750c(z6, z2, interfaceC42141hT5, interfaceC23555j)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != LongCompanionObject.MAX_VALUE) {
                        this.f89116f.addAndGet(-j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                z4 = true;
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f89122l == null && this.f89118h.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89116f, j);
                m32748e();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f89119i) {
                return;
            }
            this.f89119i = true;
            m32748e();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (!this.f89119i && C24475k.m32260a(this.f89121k, th)) {
                this.f89119i = true;
                m32748e();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f89119i) {
                return;
            }
            if (this.f89124n == 0 && !this.f89118h.offer(t)) {
                onError(new MissingBackpressureException("Queue is full?!"));
            } else {
                m32748e();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f89122l;
            while (true) {
                if (it == null) {
                    T poll = this.f89118h.poll();
                    if (poll == null) {
                        return null;
                    }
                    it = this.f89113c.apply(poll).iterator();
                    if (!it.hasNext()) {
                        it = null;
                    } else {
                        this.f89122l = it;
                        break;
                    }
                } else {
                    break;
                }
            }
            R r = (R) C23544b.m32923e(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f89122l = null;
            }
            return r;
        }
    }

    public C23826y(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends Iterable<? extends R>> interfaceC23492o, int i) {
        super(abstractC24490k);
        this.f89110d = interfaceC23492o;
        this.f89111e = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        AbstractC24490k<T> abstractC24490k = this.f88638c;
        if (abstractC24490k instanceof Callable) {
            try {
                Object call = ((Callable) abstractC24490k).call();
                if (call == null) {
                    EnumC24460d.m32301a(interfaceC42141hT5);
                    return;
                }
                try {
                    C23638A.m32892x1(interfaceC42141hT5, this.f89110d.apply(call).iterator());
                    return;
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    EnumC24460d.m32300c(th, interfaceC42141hT5);
                    return;
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                EnumC24460d.m32300c(th2, interfaceC42141hT5);
                return;
            }
        }
        abstractC24490k.m32166W0(new C23827a(interfaceC42141hT5, this.f89110d, this.f89111e));
    }
}
