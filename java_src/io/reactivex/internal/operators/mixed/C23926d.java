package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.mixed.d */
/* loaded from: classes6.dex */
public final class C23926d<T> extends AbstractC23461c {

    /* renamed from: b */
    public final AbstractC24490k<T> f89329b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89330c;

    /* renamed from: d */
    public final boolean f89331d;

    /* renamed from: io.reactivex.internal.operators.mixed.d$a */
    /* loaded from: classes6.dex */
    public static final class C23927a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: i */
        public static final C23928a f89332i = new C23928a(null);

        /* renamed from: b */
        public final InterfaceC23476f f89333b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89334c;

        /* renamed from: d */
        public final boolean f89335d;

        /* renamed from: e */
        public final C24467c f89336e = new C24467c();

        /* renamed from: f */
        public final AtomicReference<C23928a> f89337f = new AtomicReference<>();

        /* renamed from: g */
        public volatile boolean f89338g;

        /* renamed from: h */
        public InterfaceC46292oT5 f89339h;

        /* renamed from: io.reactivex.internal.operators.mixed.d$a$a */
        /* loaded from: classes6.dex */
        public static final class C23928a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b */
            public final C23927a<?> f89340b;

            public C23928a(C23927a<?> c23927a) {
                this.f89340b = c23927a;
            }

            /* renamed from: a */
            public void m32721a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                this.f89340b.m32723c(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                this.f89340b.m32722d(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23927a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
            this.f89333b = interfaceC23476f;
            this.f89334c = interfaceC23492o;
            this.f89335d = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89339h, interfaceC46292oT5)) {
                this.f89339h = interfaceC46292oT5;
                this.f89333b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void m32724b() {
            AtomicReference<C23928a> atomicReference = this.f89337f;
            C23928a c23928a = f89332i;
            C23928a andSet = atomicReference.getAndSet(c23928a);
            if (andSet != null && andSet != c23928a) {
                andSet.m32721a();
            }
        }

        /* renamed from: c */
        public void m32723c(C23928a c23928a) {
            if (C42482i24.m35337a(this.f89337f, c23928a, null) && this.f89338g) {
                Throwable m32275b = this.f89336e.m32275b();
                if (m32275b == null) {
                    this.f89333b.onComplete();
                } else {
                    this.f89333b.onError(m32275b);
                }
            }
        }

        /* renamed from: d */
        public void m32722d(C23928a c23928a, Throwable th) {
            if (C42482i24.m35337a(this.f89337f, c23928a, null) && this.f89336e.m32276a(th)) {
                if (this.f89335d) {
                    if (this.f89338g) {
                        this.f89333b.onError(this.f89336e.m32275b());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable m32275b = this.f89336e.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f89333b.onError(m32275b);
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89339h.cancel();
            m32724b();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89337f.get() == f89332i;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89338g = true;
            if (this.f89337f.get() == null) {
                Throwable m32275b = this.f89336e.m32275b();
                if (m32275b == null) {
                    this.f89333b.onComplete();
                } else {
                    this.f89333b.onError(m32275b);
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f89336e.m32276a(th)) {
                if (this.f89335d) {
                    onComplete();
                    return;
                }
                m32724b();
                Throwable m32275b = this.f89336e.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f89333b.onError(m32275b);
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            C23928a c23928a;
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89334c.apply(t), "The mapper returned a null CompletableSource");
                C23928a c23928a2 = new C23928a(this);
                do {
                    c23928a = this.f89337f.get();
                    if (c23928a == f89332i) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f89337f, c23928a, c23928a2));
                if (c23928a != null) {
                    c23928a.m32721a();
                }
                interfaceC23496h.mo33003g(c23928a2);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89339h.cancel();
                onError(th);
            }
        }
    }

    public C23926d(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        this.f89329b = abstractC24490k;
        this.f89330c = interfaceC23492o;
        this.f89331d = z;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f89329b.m32166W0(new C23927a(interfaceC23476f, this.f89330c, this.f89331d));
    }
}
