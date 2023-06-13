package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.mixed.e */
/* loaded from: classes6.dex */
public final class C23929e<T, R> extends AbstractC24490k<R> {

    /* renamed from: c */
    public final AbstractC24490k<T> f89341c;

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89342d;

    /* renamed from: e */
    public final boolean f89343e;

    /* renamed from: io.reactivex.internal.operators.mixed.e$a */
    /* loaded from: classes6.dex */
    public static final class C23930a<T, R> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {

        /* renamed from: l */
        public static final C23931a<Object> f89344l = new C23931a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89345b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89346c;

        /* renamed from: d */
        public final boolean f89347d;

        /* renamed from: e */
        public final C24467c f89348e = new C24467c();

        /* renamed from: f */
        public final AtomicLong f89349f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference<C23931a<R>> f89350g = new AtomicReference<>();

        /* renamed from: h */
        public InterfaceC46292oT5 f89351h;

        /* renamed from: i */
        public volatile boolean f89352i;

        /* renamed from: j */
        public volatile boolean f89353j;

        /* renamed from: k */
        public long f89354k;

        /* renamed from: io.reactivex.internal.operators.mixed.e$a$a */
        /* loaded from: classes6.dex */
        public static final class C23931a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<R> {
            private static final long serialVersionUID = 8042919737683345351L;

            /* renamed from: b */
            public final C23930a<?, R> f89355b;

            /* renamed from: c */
            public volatile R f89356c;

            public C23931a(C23930a<?, R> c23930a) {
                this.f89355b = c23930a;
            }

            /* renamed from: a */
            public void m32717a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f89355b.m32718d(this, th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                this.f89356c = r;
                this.f89355b.m32719c();
            }
        }

        public C23930a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
            this.f89345b = interfaceC42141hT5;
            this.f89346c = interfaceC23492o;
            this.f89347d = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89351h, interfaceC46292oT5)) {
                this.f89351h = interfaceC46292oT5;
                this.f89345b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m32720b() {
            C23931a<Object> c23931a = f89344l;
            C23931a<Object> c23931a2 = (C23931a) this.f89350g.getAndSet(c23931a);
            if (c23931a2 != null && c23931a2 != c23931a) {
                c23931a2.m32717a();
            }
        }

        /* renamed from: c */
        public void m32719c() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f89345b;
            C24467c c24467c = this.f89348e;
            AtomicReference<C23931a<R>> atomicReference = this.f89350g;
            AtomicLong atomicLong = this.f89349f;
            long j = this.f89354k;
            int i = 1;
            while (!this.f89353j) {
                if (c24467c.get() != null && !this.f89347d) {
                    interfaceC42141hT5.onError(c24467c.m32275b());
                    return;
                }
                boolean z2 = this.f89352i;
                C23931a<R> c23931a = atomicReference.get();
                if (c23931a == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 && z) {
                    Throwable m32275b = c24467c.m32275b();
                    if (m32275b != null) {
                        interfaceC42141hT5.onError(m32275b);
                        return;
                    } else {
                        interfaceC42141hT5.onComplete();
                        return;
                    }
                } else if (!z && c23931a.f89356c != null && j != atomicLong.get()) {
                    C42482i24.m35337a(atomicReference, c23931a, null);
                    interfaceC42141hT5.onNext((R) c23931a.f89356c);
                    j++;
                } else {
                    this.f89354k = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89353j = true;
            this.f89351h.cancel();
            m32720b();
        }

        /* renamed from: d */
        public void m32718d(C23931a<R> c23931a, Throwable th) {
            if (C42482i24.m35337a(this.f89350g, c23931a, null) && this.f89348e.m32276a(th)) {
                if (!this.f89347d) {
                    this.f89351h.cancel();
                    m32720b();
                }
                m32719c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            C24468d.m32274a(this.f89349f, j);
            m32719c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89352i = true;
            m32719c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f89348e.m32276a(th)) {
                if (!this.f89347d) {
                    m32720b();
                }
                this.f89352i = true;
                m32719c();
                return;
            }
            C24508a.m31988u(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            C23931a<R> c23931a;
            C23931a<R> c23931a2 = this.f89350g.get();
            if (c23931a2 != null) {
                c23931a2.m32717a();
            }
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f89346c.apply(t), "The mapper returned a null SingleSource");
                C23931a c23931a3 = new C23931a(this);
                do {
                    c23931a = this.f89350g.get();
                    if (c23931a == f89344l) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f89350g, c23931a, c23931a3));
                interfaceC23447K.mo33096a(c23931a3);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89351h.cancel();
                this.f89350g.getAndSet(f89344l);
                onError(th);
            }
        }
    }

    public C23929e(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z) {
        this.f89341c = abstractC24490k;
        this.f89342d = interfaceC23492o;
        this.f89343e = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f89341c.m32166W0(new C23930a(interfaceC42141hT5, this.f89342d, this.f89343e));
    }
}
