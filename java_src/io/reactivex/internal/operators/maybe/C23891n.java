package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.n */
/* loaded from: classes6.dex */
public final class C23891n<T, U, R> extends AbstractC23869a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends U>> f89249c;

    /* renamed from: d */
    public final InterfaceC23480c<? super T, ? super U, ? extends R> f89250d;

    /* renamed from: io.reactivex.internal.operators.maybe.n$a */
    /* loaded from: classes6.dex */
    public static final class C23892a<T, U, R> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends U>> f89251b;

        /* renamed from: c */
        public final C23893a<T, U, R> f89252c;

        /* renamed from: io.reactivex.internal.operators.maybe.n$a$a */
        /* loaded from: classes6.dex */
        public static final class C23893a<T, U, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* renamed from: b */
            public final InterfaceC24541s<? super R> f89253b;

            /* renamed from: c */
            public final InterfaceC23480c<? super T, ? super U, ? extends R> f89254c;

            /* renamed from: d */
            public T f89255d;

            public C23893a(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
                this.f89253b = interfaceC24541s;
                this.f89254c = interfaceC23480c;
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89253b.onComplete();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89253b.onError(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(U u) {
                T t = this.f89255d;
                this.f89255d = null;
                try {
                    this.f89253b.onSuccess(C23544b.m32923e(this.f89254c.apply(t, u), "The resultSelector returned a null value"));
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f89253b.onError(th);
                }
            }
        }

        public C23892a(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
            this.f89252c = new C23893a<>(interfaceC24541s, interfaceC23480c);
            this.f89251b = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89252c);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89252c.get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89252c.f89253b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89252c.f89253b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this.f89252c, interfaceC23465c)) {
                this.f89252c.f89253b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89251b.apply(t), "The mapper returned a null MaybeSource");
                if (EnumC23501d.m32998c(this.f89252c, null)) {
                    C23893a<T, U, R> c23893a = this.f89252c;
                    c23893a.f89255d = t;
                    interfaceC24574u.mo31865a(c23893a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89252c.f89253b.onError(th);
            }
        }
    }

    public C23891n(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends U>> interfaceC23492o, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
        super(interfaceC24574u);
        this.f89249c = interfaceC23492o;
        this.f89250d = interfaceC23480c;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        this.f89206b.mo31865a(new C23892a(interfaceC24541s, this.f89249c, this.f89250d));
    }
}
