package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC24492m;
import io.reactivex.InterfaceC24493n;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.e */
/* loaded from: classes6.dex */
public final class C23723e<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC24493n<T> f88755c;

    /* renamed from: d */
    public final EnumC23460b f88756d;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C23724a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88757a;

        static {
            int[] iArr = new int[EnumC23460b.values().length];
            f88757a = iArr;
            try {
                iArr[EnumC23460b.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88757a[EnumC23460b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88757a[EnumC23460b.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88757a[EnumC23460b.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23725b<T> extends AtomicLong implements InterfaceC24492m<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88758b;

        /* renamed from: c */
        public final C23505h f88759c = new C23505h();

        public AbstractC23725b(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88758b = interfaceC42141hT5;
        }

        @Override // io.reactivex.InterfaceC24492m
        /* renamed from: b */
        public final void mo32091b(InterfaceC23465c interfaceC23465c) {
            this.f88759c.m32980b(interfaceC23465c);
        }

        /* renamed from: c */
        public boolean mo32809c(Throwable th) {
            return m32811f(th);
        }

        @Override // p000.InterfaceC46292oT5
        public final void cancel() {
            this.f88759c.dispose();
            mo32807h();
        }

        /* renamed from: d */
        public void m32812d() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f88758b.onComplete();
            } finally {
                this.f88759c.dispose();
            }
        }

        /* renamed from: f */
        public boolean m32811f(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f88758b.onError(th);
                this.f88759c.dispose();
                return true;
            } catch (Throwable th2) {
                this.f88759c.dispose();
                throw th2;
            }
        }

        /* renamed from: g */
        public void mo32808g() {
        }

        /* renamed from: h */
        public void mo32807h() {
        }

        @Override // io.reactivex.InterfaceC24492m
        public final boolean isCancelled() {
            return this.f88759c.mo1769e();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public final void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this, j);
                mo32808g();
            }
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onComplete() {
            m32812d();
        }

        @Override // io.reactivex.InterfaceC24489j
        public final void onError(Throwable th) {
            if (!mo32809c(th)) {
                C24508a.m31988u(th);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$c */
    /* loaded from: classes6.dex */
    public static final class C23726c<T> extends AbstractC23725b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: d */
        public final C24409c<T> f88760d;

        /* renamed from: e */
        public Throwable f88761e;

        /* renamed from: f */
        public volatile boolean f88762f;

        /* renamed from: g */
        public final AtomicInteger f88763g;

        public C23726c(InterfaceC42141hT5<? super T> interfaceC42141hT5, int i) {
            super(interfaceC42141hT5);
            this.f88760d = new C24409c<>(i);
            this.f88763g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: c */
        public boolean mo32809c(Throwable th) {
            if (!this.f88762f && !isCancelled()) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.f88761e = th;
                this.f88762f = true;
                m32810i();
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: g */
        public void mo32808g() {
            m32810i();
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: h */
        public void mo32807h() {
            if (this.f88763g.getAndIncrement() == 0) {
                this.f88760d.clear();
            }
        }

        /* renamed from: i */
        public void m32810i() {
            int i;
            boolean z;
            if (this.f88763g.getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88758b;
            C24409c<T> c24409c = this.f88760d;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        c24409c.clear();
                        return;
                    } else {
                        boolean z2 = this.f88762f;
                        Object obj = (T) c24409c.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2 && z) {
                            Throwable th = this.f88761e;
                            if (th != null) {
                                m32811f(th);
                                return;
                            } else {
                                m32812d();
                                return;
                            }
                        } else if (z) {
                            break;
                        } else {
                            interfaceC42141hT5.onNext(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        c24409c.clear();
                        return;
                    }
                    boolean z3 = this.f88762f;
                    boolean isEmpty = c24409c.isEmpty();
                    if (z3 && isEmpty) {
                        Throwable th2 = this.f88761e;
                        if (th2 != null) {
                            m32811f(th2);
                            return;
                        } else {
                            m32812d();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C24468d.m32271d(this, j2);
                }
                i2 = this.f88763g.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b, io.reactivex.InterfaceC24489j
        public void onComplete() {
            this.f88762f = true;
            m32810i();
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onNext(T t) {
            if (!this.f88762f && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f88760d.offer(t);
                m32810i();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$d */
    /* loaded from: classes6.dex */
    public static final class C23727d<T> extends AbstractC23731h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public C23727d(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23731h
        /* renamed from: i */
        public void mo32805i() {
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$e */
    /* loaded from: classes6.dex */
    public static final class C23728e<T> extends AbstractC23731h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public C23728e(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23731h
        /* renamed from: i */
        public void mo32805i() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$f */
    /* loaded from: classes6.dex */
    public static final class C23729f<T> extends AbstractC23725b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: d */
        public final AtomicReference<T> f88764d;

        /* renamed from: e */
        public Throwable f88765e;

        /* renamed from: f */
        public volatile boolean f88766f;

        /* renamed from: g */
        public final AtomicInteger f88767g;

        public C23729f(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
            this.f88764d = new AtomicReference<>();
            this.f88767g = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: c */
        public boolean mo32809c(Throwable th) {
            if (!this.f88766f && !isCancelled()) {
                if (th == null) {
                    onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.f88765e = th;
                this.f88766f = true;
                m32806i();
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: g */
        public void mo32808g() {
            m32806i();
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b
        /* renamed from: h */
        public void mo32807h() {
            if (this.f88767g.getAndIncrement() == 0) {
                this.f88764d.lazySet(null);
            }
        }

        /* renamed from: i */
        public void m32806i() {
            int i;
            boolean z;
            boolean z2;
            if (this.f88767g.getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88758b;
            AtomicReference<T> atomicReference = this.f88764d;
            int i2 = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    z = false;
                    if (i == 0) {
                        break;
                    } else if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    } else {
                        boolean z3 = this.f88766f;
                        Object obj = (T) atomicReference.getAndSet(null);
                        if (obj == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            Throwable th = this.f88765e;
                            if (th != null) {
                                m32811f(th);
                                return;
                            } else {
                                m32812d();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            interfaceC42141hT5.onNext(obj);
                            j2++;
                        }
                    }
                }
                if (i == 0) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z4 = this.f88766f;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (z4 && z) {
                        Throwable th2 = this.f88765e;
                        if (th2 != null) {
                            m32811f(th2);
                            return;
                        } else {
                            m32812d();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    C24468d.m32271d(this, j2);
                }
                i2 = this.f88767g.addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.C23723e.AbstractC23725b, io.reactivex.InterfaceC24489j
        public void onComplete() {
            this.f88766f = true;
            m32806i();
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onNext(T t) {
            if (!this.f88766f && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f88764d.set(t);
                m32806i();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$g */
    /* loaded from: classes6.dex */
    public static final class C23730g<T> extends AbstractC23725b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public C23730g(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onNext(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t != null) {
                this.f88758b.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.e$h */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23731h<T> extends AbstractC23725b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public AbstractC23731h(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        /* renamed from: i */
        public abstract void mo32805i();

        @Override // io.reactivex.InterfaceC24489j
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.f88758b.onNext(t);
                C24468d.m32271d(this, 1L);
            } else {
                mo32805i();
            }
        }
    }

    public C23723e(InterfaceC24493n<T> interfaceC24493n, EnumC23460b enumC23460b) {
        this.f88755c = interfaceC24493n;
        this.f88756d = enumC23460b;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        AbstractC23725b c23730g;
        int i = C23724a.f88757a[this.f88756d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c23730g = new C23726c(interfaceC42141hT5, AbstractC24490k.m32139j());
                    } else {
                        c23730g = new C23729f(interfaceC42141hT5);
                    }
                } else {
                    c23730g = new C23727d(interfaceC42141hT5);
                }
            } else {
                c23730g = new C23728e(interfaceC42141hT5);
            }
        } else {
            c23730g = new C23730g(interfaceC42141hT5);
        }
        interfaceC42141hT5.mo31867a(c23730g);
        try {
            this.f88755c.mo32090a(c23730g);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            c23730g.onError(th);
        }
    }
}
