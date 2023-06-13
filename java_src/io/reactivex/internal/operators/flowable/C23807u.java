package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.u */
/* loaded from: classes6.dex */
public final class C23807u<T> extends AbstractC23461c implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f89028b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89029c;

    /* renamed from: d */
    public final int f89030d;

    /* renamed from: e */
    public final boolean f89031e;

    /* renamed from: io.reactivex.internal.operators.flowable.u$a */
    /* loaded from: classes6.dex */
    public static final class C23808a<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        public final InterfaceC23476f f89032b;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89034d;

        /* renamed from: e */
        public final boolean f89035e;

        /* renamed from: g */
        public final int f89037g;

        /* renamed from: h */
        public InterfaceC46292oT5 f89038h;

        /* renamed from: i */
        public volatile boolean f89039i;

        /* renamed from: c */
        public final C24467c f89033c = new C24467c();

        /* renamed from: f */
        public final C23464b f89036f = new C23464b();

        /* renamed from: io.reactivex.internal.operators.flowable.u$a$a */
        /* loaded from: classes6.dex */
        public final class C23809a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C23809a() {
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            public void dispose() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.disposables.InterfaceC23465c
            /* renamed from: e */
            public boolean mo1769e() {
                return EnumC23501d.m32999b(get());
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                C23808a.this.m32772b(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                C23808a.this.m32771c(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23808a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
            this.f89032b = interfaceC23476f;
            this.f89034d = interfaceC23492o;
            this.f89035e = z;
            this.f89037g = i;
            lazySet(1);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89038h, interfaceC46292oT5)) {
                this.f89038h = interfaceC46292oT5;
                this.f89032b.onSubscribe(this);
                int i = this.f89037g;
                if (i == Integer.MAX_VALUE) {
                    interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                } else {
                    interfaceC46292oT5.mo21023o(i);
                }
            }
        }

        /* renamed from: b */
        public void m32772b(C23808a<T>.C23809a c23809a) {
            this.f89036f.mo32984b(c23809a);
            onComplete();
        }

        /* renamed from: c */
        public void m32771c(C23808a<T>.C23809a c23809a, Throwable th) {
            this.f89036f.mo32984b(c23809a);
            onError(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89039i = true;
            this.f89038h.cancel();
            this.f89036f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89036f.mo1769e();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m32275b = this.f89033c.m32275b();
                if (m32275b != null) {
                    this.f89032b.onError(m32275b);
                } else {
                    this.f89032b.onComplete();
                }
            } else if (this.f89037g != Integer.MAX_VALUE) {
                this.f89038h.mo21023o(1L);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f89033c.m32276a(th)) {
                if (this.f89035e) {
                    if (decrementAndGet() == 0) {
                        this.f89032b.onError(this.f89033c.m32275b());
                        return;
                    } else if (this.f89037g != Integer.MAX_VALUE) {
                        this.f89038h.mo21023o(1L);
                        return;
                    } else {
                        return;
                    }
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.f89032b.onError(this.f89033c.m32275b());
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89034d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C23809a c23809a = new C23809a();
                if (!this.f89039i && this.f89036f.mo32983c(c23809a)) {
                    interfaceC23496h.mo33003g(c23809a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89038h.cancel();
                onError(th);
            }
        }
    }

    public C23807u(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
        this.f89028b = abstractC24490k;
        this.f89029c = interfaceC23492o;
        this.f89031e = z;
        this.f89030d = i;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f89028b.m32166W0(new C23808a(interfaceC23476f, this.f89029c, this.f89031e, this.f89030d));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23802t(this.f89028b, this.f89029c, this.f89031e, this.f89030d));
    }
}
