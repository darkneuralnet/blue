package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.K */
/* loaded from: classes6.dex */
public final class C23658K<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final AbstractC23437E f88497d;

    /* renamed from: e */
    public final boolean f88498e;

    /* renamed from: f */
    public final int f88499f;

    /* renamed from: io.reactivex.internal.operators.flowable.K$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractRunnableC23659a<T> extends AbstractC24457a<T> implements InterfaceC24494o<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: b */
        public final AbstractC23437E.AbstractC23440c f88500b;

        /* renamed from: c */
        public final boolean f88501c;

        /* renamed from: d */
        public final int f88502d;

        /* renamed from: e */
        public final int f88503e;

        /* renamed from: f */
        public final AtomicLong f88504f = new AtomicLong();

        /* renamed from: g */
        public InterfaceC46292oT5 f88505g;

        /* renamed from: h */
        public InterfaceC23555j<T> f88506h;

        /* renamed from: i */
        public volatile boolean f88507i;

        /* renamed from: j */
        public volatile boolean f88508j;

        /* renamed from: k */
        public Throwable f88509k;

        /* renamed from: l */
        public int f88510l;

        /* renamed from: m */
        public long f88511m;

        /* renamed from: n */
        public boolean f88512n;

        public AbstractRunnableC23659a(AbstractC23437E.AbstractC23440c abstractC23440c, boolean z, int i) {
            this.f88500b = abstractC23440c;
            this.f88501c = z;
            this.f88502d = i;
            this.f88503e = i - (i >> 2);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public final int mo31868b(int i) {
            if ((i & 2) != 0) {
                this.f88512n = true;
                return 2;
            }
            return 0;
        }

        /* renamed from: c */
        public final boolean m32887c(boolean z, boolean z2, InterfaceC42141hT5<?> interfaceC42141hT5) {
            if (this.f88507i) {
                clear();
                return true;
            } else if (z) {
                if (this.f88501c) {
                    if (z2) {
                        this.f88507i = true;
                        Throwable th = this.f88509k;
                        if (th != null) {
                            interfaceC42141hT5.onError(th);
                        } else {
                            interfaceC42141hT5.onComplete();
                        }
                        this.f88500b.dispose();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f88509k;
                if (th2 != null) {
                    this.f88507i = true;
                    clear();
                    interfaceC42141hT5.onError(th2);
                    this.f88500b.dispose();
                    return true;
                } else if (z2) {
                    this.f88507i = true;
                    interfaceC42141hT5.onComplete();
                    this.f88500b.dispose();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p000.InterfaceC46292oT5
        public final void cancel() {
            if (this.f88507i) {
                return;
            }
            this.f88507i = true;
            this.f88505g.cancel();
            this.f88500b.dispose();
            if (!this.f88512n && getAndIncrement() == 0) {
                this.f88506h.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final void clear() {
            this.f88506h.clear();
        }

        /* renamed from: d */
        public abstract void mo32885d();

        /* renamed from: e */
        public abstract void mo32884e();

        /* renamed from: g */
        public abstract void mo32883g();

        /* renamed from: i */
        public final void m32886i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f88500b.mo32320b(this);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final boolean isEmpty() {
            return this.f88506h.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public final void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88504f, j);
                m32886i();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public final void onComplete() {
            if (!this.f88508j) {
                this.f88508j = true;
                m32886i();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public final void onError(Throwable th) {
            if (this.f88508j) {
                C24508a.m31988u(th);
                return;
            }
            this.f88509k = th;
            this.f88508j = true;
            m32886i();
        }

        @Override // p000.InterfaceC42141hT5
        public final void onNext(T t) {
            if (this.f88508j) {
                return;
            }
            if (this.f88510l == 2) {
                m32886i();
                return;
            }
            if (!this.f88506h.offer(t)) {
                this.f88505g.cancel();
                this.f88509k = new MissingBackpressureException("Queue is full?!");
                this.f88508j = true;
            }
            m32886i();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f88512n) {
                mo32884e();
            } else if (this.f88510l == 1) {
                mo32883g();
            } else {
                mo32885d();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.K$b */
    /* loaded from: classes6.dex */
    public static final class C23660b<T> extends AbstractRunnableC23659a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: o */
        public final InterfaceC23546a<? super T> f88513o;

        /* renamed from: p */
        public long f88514p;

        public C23660b(InterfaceC23546a<? super T> interfaceC23546a, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z, int i) {
            super(abstractC23440c, z, i);
            this.f88513o = interfaceC23546a;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88505g, interfaceC46292oT5)) {
                this.f88505g = interfaceC46292oT5;
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88510l = 1;
                        this.f88506h = interfaceC23552g;
                        this.f88508j = true;
                        this.f88513o.mo31867a(this);
                        return;
                    } else if (mo31868b == 2) {
                        this.f88510l = 2;
                        this.f88506h = interfaceC23552g;
                        this.f88513o.mo31867a(this);
                        interfaceC46292oT5.mo21023o(this.f88502d);
                        return;
                    }
                }
                this.f88506h = new C24408b(this.f88502d);
                this.f88513o.mo31867a(this);
                interfaceC46292oT5.mo21023o(this.f88502d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: d */
        public void mo32885d() {
            int i;
            boolean z;
            InterfaceC23546a<? super T> interfaceC23546a = this.f88513o;
            InterfaceC23555j<T> interfaceC23555j = this.f88506h;
            long j = this.f88511m;
            long j2 = this.f88514p;
            int i2 = 1;
            while (true) {
                long j3 = this.f88504f.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f88508j;
                    try {
                        Object obj = (T) interfaceC23555j.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32887c(z2, z, interfaceC23546a)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        if (interfaceC23546a.mo32761h(obj)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f88503e) {
                            this.f88505g.mo21023o(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88507i = true;
                        this.f88505g.cancel();
                        interfaceC23555j.clear();
                        interfaceC23546a.onError(th);
                        this.f88500b.dispose();
                        return;
                    }
                }
                if (i == 0 && m32887c(this.f88508j, interfaceC23555j.isEmpty(), interfaceC23546a)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f88511m = j;
                    this.f88514p = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: e */
        public void mo32884e() {
            int i = 1;
            while (!this.f88507i) {
                boolean z = this.f88508j;
                this.f88513o.onNext(null);
                if (z) {
                    this.f88507i = true;
                    Throwable th = this.f88509k;
                    if (th != null) {
                        this.f88513o.onError(th);
                    } else {
                        this.f88513o.onComplete();
                    }
                    this.f88500b.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: g */
        public void mo32883g() {
            InterfaceC23546a<? super T> interfaceC23546a = this.f88513o;
            InterfaceC23555j<T> interfaceC23555j = this.f88506h;
            long j = this.f88511m;
            int i = 1;
            while (true) {
                long j2 = this.f88504f.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC23555j.poll();
                        if (this.f88507i) {
                            return;
                        }
                        if (obj == null) {
                            this.f88507i = true;
                            interfaceC23546a.onComplete();
                            this.f88500b.dispose();
                            return;
                        } else if (interfaceC23546a.mo32761h(obj)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88507i = true;
                        this.f88505g.cancel();
                        interfaceC23546a.onError(th);
                        this.f88500b.dispose();
                        return;
                    }
                }
                if (this.f88507i) {
                    return;
                }
                if (interfaceC23555j.isEmpty()) {
                    this.f88507i = true;
                    interfaceC23546a.onComplete();
                    this.f88500b.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f88511m = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f88506h.poll();
            if (poll != null && this.f88510l != 1) {
                long j = this.f88514p + 1;
                if (j == this.f88503e) {
                    this.f88514p = 0L;
                    this.f88505g.mo21023o(j);
                } else {
                    this.f88514p = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.K$c */
    /* loaded from: classes6.dex */
    public static final class C23661c<T> extends AbstractRunnableC23659a<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: o */
        public final InterfaceC42141hT5<? super T> f88515o;

        public C23661c(InterfaceC42141hT5<? super T> interfaceC42141hT5, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z, int i) {
            super(abstractC23440c, z, i);
            this.f88515o = interfaceC42141hT5;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88505g, interfaceC46292oT5)) {
                this.f88505g = interfaceC46292oT5;
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f88510l = 1;
                        this.f88506h = interfaceC23552g;
                        this.f88508j = true;
                        this.f88515o.mo31867a(this);
                        return;
                    } else if (mo31868b == 2) {
                        this.f88510l = 2;
                        this.f88506h = interfaceC23552g;
                        this.f88515o.mo31867a(this);
                        interfaceC46292oT5.mo21023o(this.f88502d);
                        return;
                    }
                }
                this.f88506h = new C24408b(this.f88502d);
                this.f88515o.mo31867a(this);
                interfaceC46292oT5.mo21023o(this.f88502d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: d */
        public void mo32885d() {
            int i;
            boolean z;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88515o;
            InterfaceC23555j<T> interfaceC23555j = this.f88506h;
            long j = this.f88511m;
            int i2 = 1;
            while (true) {
                long j2 = this.f88504f.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f88508j;
                    try {
                        Object obj = (T) interfaceC23555j.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32887c(z2, z, interfaceC42141hT5)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        interfaceC42141hT5.onNext(obj);
                        j++;
                        if (j == this.f88503e) {
                            if (j2 != LongCompanionObject.MAX_VALUE) {
                                j2 = this.f88504f.addAndGet(-j);
                            }
                            this.f88505g.mo21023o(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88507i = true;
                        this.f88505g.cancel();
                        interfaceC23555j.clear();
                        interfaceC42141hT5.onError(th);
                        this.f88500b.dispose();
                        return;
                    }
                }
                if (i == 0 && m32887c(this.f88508j, interfaceC23555j.isEmpty(), interfaceC42141hT5)) {
                    return;
                }
                int i3 = get();
                if (i2 == i3) {
                    this.f88511m = j;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: e */
        public void mo32884e() {
            int i = 1;
            while (!this.f88507i) {
                boolean z = this.f88508j;
                this.f88515o.onNext(null);
                if (z) {
                    this.f88507i = true;
                    Throwable th = this.f88509k;
                    if (th != null) {
                        this.f88515o.onError(th);
                    } else {
                        this.f88515o.onComplete();
                    }
                    this.f88500b.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.C23658K.AbstractRunnableC23659a
        /* renamed from: g */
        public void mo32883g() {
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88515o;
            InterfaceC23555j<T> interfaceC23555j = this.f88506h;
            long j = this.f88511m;
            int i = 1;
            while (true) {
                long j2 = this.f88504f.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC23555j.poll();
                        if (this.f88507i) {
                            return;
                        }
                        if (obj == null) {
                            this.f88507i = true;
                            interfaceC42141hT5.onComplete();
                            this.f88500b.dispose();
                            return;
                        }
                        interfaceC42141hT5.onNext(obj);
                        j++;
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88507i = true;
                        this.f88505g.cancel();
                        interfaceC42141hT5.onError(th);
                        this.f88500b.dispose();
                        return;
                    }
                }
                if (this.f88507i) {
                    return;
                }
                if (interfaceC23555j.isEmpty()) {
                    this.f88507i = true;
                    interfaceC42141hT5.onComplete();
                    this.f88500b.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f88511m = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f88506h.poll();
            if (poll != null && this.f88510l != 1) {
                long j = this.f88511m + 1;
                if (j == this.f88503e) {
                    this.f88511m = 0L;
                    this.f88505g.mo21023o(j);
                } else {
                    this.f88511m = j;
                }
            }
            return poll;
        }
    }

    public C23658K(AbstractC24490k<T> abstractC24490k, AbstractC23437E abstractC23437E, boolean z, int i) {
        super(abstractC24490k);
        this.f88497d = abstractC23437E;
        this.f88498e = z;
        this.f88499f = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        AbstractC23437E.AbstractC23440c mo8041b = this.f88497d.mo8041b();
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            this.f88638c.m32166W0(new C23660b((InterfaceC23546a) interfaceC42141hT5, mo8041b, this.f88498e, this.f88499f));
        } else {
            this.f88638c.m32166W0(new C23661c(interfaceC42141hT5, mo8041b, this.f88498e, this.f88499f));
        }
    }
}
