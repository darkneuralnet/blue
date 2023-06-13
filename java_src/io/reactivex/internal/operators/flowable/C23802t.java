package io.reactivex.internal.operators.flowable;

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
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.t */
/* loaded from: classes6.dex */
public final class C23802t<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89011d;

    /* renamed from: e */
    public final int f89012e;

    /* renamed from: f */
    public final boolean f89013f;

    /* renamed from: io.reactivex.internal.operators.flowable.t$a */
    /* loaded from: classes6.dex */
    public static final class C23803a<T> extends AbstractC24457a<T> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f89014b;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89016d;

        /* renamed from: e */
        public final boolean f89017e;

        /* renamed from: g */
        public final int f89019g;

        /* renamed from: h */
        public InterfaceC46292oT5 f89020h;

        /* renamed from: i */
        public volatile boolean f89021i;

        /* renamed from: c */
        public final C24467c f89015c = new C24467c();

        /* renamed from: f */
        public final C23464b f89018f = new C23464b();

        /* renamed from: io.reactivex.internal.operators.flowable.t$a$a */
        /* loaded from: classes6.dex */
        public final class C23804a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C23804a() {
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
                C23803a.this.m32775c(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                C23803a.this.m32774d(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23803a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
            this.f89014b = interfaceC42141hT5;
            this.f89016d = interfaceC23492o;
            this.f89017e = z;
            this.f89019g = i;
            lazySet(1);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89020h, interfaceC46292oT5)) {
                this.f89020h = interfaceC46292oT5;
                this.f89014b.mo31867a(this);
                int i = this.f89019g;
                if (i == Integer.MAX_VALUE) {
                    interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                } else {
                    interfaceC46292oT5.mo21023o(i);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return i & 2;
        }

        /* renamed from: c */
        public void m32775c(C23803a<T>.C23804a c23804a) {
            this.f89018f.mo32984b(c23804a);
            onComplete();
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89021i = true;
            this.f89020h.cancel();
            this.f89018f.dispose();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
        }

        /* renamed from: d */
        public void m32774d(C23803a<T>.C23804a c23804a, Throwable th) {
            this.f89018f.mo32984b(c23804a);
            onError(th);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m32275b = this.f89015c.m32275b();
                if (m32275b != null) {
                    this.f89014b.onError(m32275b);
                } else {
                    this.f89014b.onComplete();
                }
            } else if (this.f89019g != Integer.MAX_VALUE) {
                this.f89020h.mo21023o(1L);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f89015c.m32276a(th)) {
                if (this.f89017e) {
                    if (decrementAndGet() == 0) {
                        this.f89014b.onError(this.f89015c.m32275b());
                        return;
                    } else if (this.f89019g != Integer.MAX_VALUE) {
                        this.f89020h.mo21023o(1L);
                        return;
                    } else {
                        return;
                    }
                }
                cancel();
                if (getAndSet(0) > 0) {
                    this.f89014b.onError(this.f89015c.m32275b());
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89016d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C23804a c23804a = new C23804a();
                if (!this.f89021i && this.f89018f.mo32983c(c23804a)) {
                    interfaceC23496h.mo33003g(c23804a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89020h.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            return null;
        }
    }

    public C23802t(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z, int i) {
        super(abstractC24490k);
        this.f89011d = interfaceC23492o;
        this.f89013f = z;
        this.f89012e = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23803a(interfaceC42141hT5, this.f89011d, this.f89013f, this.f89012e));
    }
}
