package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.j */
/* loaded from: classes6.dex */
public final class C23943j<T> extends AbstractC23461c {

    /* renamed from: b */
    public final Observable<T> f89409b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89410c;

    /* renamed from: d */
    public final boolean f89411d;

    /* renamed from: io.reactivex.internal.operators.mixed.j$a */
    /* loaded from: classes6.dex */
    public static final class C23944a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: i */
        public static final C23945a f89412i = new C23945a(null);

        /* renamed from: b */
        public final InterfaceC23476f f89413b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89414c;

        /* renamed from: d */
        public final boolean f89415d;

        /* renamed from: e */
        public final C24467c f89416e = new C24467c();

        /* renamed from: f */
        public final AtomicReference<C23945a> f89417f = new AtomicReference<>();

        /* renamed from: g */
        public volatile boolean f89418g;

        /* renamed from: h */
        public InterfaceC23465c f89419h;

        /* renamed from: io.reactivex.internal.operators.mixed.j$a$a */
        /* loaded from: classes6.dex */
        public static final class C23945a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f {
            private static final long serialVersionUID = -8003404460084760287L;

            /* renamed from: b */
            public final C23944a<?> f89420b;

            public C23945a(C23944a<?> c23944a) {
                this.f89420b = c23944a;
            }

            /* renamed from: a */
            public void m32700a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                this.f89420b.m32702b(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                this.f89420b.m32701c(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23944a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
            this.f89413b = interfaceC23476f;
            this.f89414c = interfaceC23492o;
            this.f89415d = z;
        }

        /* renamed from: a */
        public void m32703a() {
            AtomicReference<C23945a> atomicReference = this.f89417f;
            C23945a c23945a = f89412i;
            C23945a andSet = atomicReference.getAndSet(c23945a);
            if (andSet != null && andSet != c23945a) {
                andSet.m32700a();
            }
        }

        /* renamed from: b */
        public void m32702b(C23945a c23945a) {
            if (C42482i24.m35337a(this.f89417f, c23945a, null) && this.f89418g) {
                Throwable m32275b = this.f89416e.m32275b();
                if (m32275b == null) {
                    this.f89413b.onComplete();
                } else {
                    this.f89413b.onError(m32275b);
                }
            }
        }

        /* renamed from: c */
        public void m32701c(C23945a c23945a, Throwable th) {
            if (C42482i24.m35337a(this.f89417f, c23945a, null) && this.f89416e.m32276a(th)) {
                if (this.f89415d) {
                    if (this.f89418g) {
                        this.f89413b.onError(this.f89416e.m32275b());
                        return;
                    }
                    return;
                }
                dispose();
                Throwable m32275b = this.f89416e.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f89413b.onError(m32275b);
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89419h.dispose();
            m32703a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89417f.get() == f89412i;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89418g = true;
            if (this.f89417f.get() == null) {
                Throwable m32275b = this.f89416e.m32275b();
                if (m32275b == null) {
                    this.f89413b.onComplete();
                } else {
                    this.f89413b.onError(m32275b);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89416e.m32276a(th)) {
                if (this.f89415d) {
                    onComplete();
                    return;
                }
                m32703a();
                Throwable m32275b = this.f89416e.m32275b();
                if (m32275b != C24475k.f91077a) {
                    this.f89413b.onError(m32275b);
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C23945a c23945a;
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89414c.apply(t), "The mapper returned a null CompletableSource");
                C23945a c23945a2 = new C23945a(this);
                do {
                    c23945a = this.f89417f.get();
                    if (c23945a == f89412i) {
                        return;
                    }
                } while (!C42482i24.m35337a(this.f89417f, c23945a, c23945a2));
                if (c23945a != null) {
                    c23945a.m32700a();
                }
                interfaceC23496h.mo33003g(c23945a2);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89419h.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89419h, interfaceC23465c)) {
                this.f89419h = interfaceC23465c;
                this.f89413b.onSubscribe(this);
            }
        }
    }

    public C23943j(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        this.f89409b = observable;
        this.f89410c = interfaceC23492o;
        this.f89411d = z;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        if (!C23952m.m32690a(this.f89409b, this.f89410c, interfaceC23476f)) {
            this.f89409b.subscribe(new C23944a(interfaceC23476f, this.f89410c, this.f89411d));
        }
    }
}
