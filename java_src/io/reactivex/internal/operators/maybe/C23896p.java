package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.p */
/* loaded from: classes6.dex */
public final class C23896p<T, R> extends AbstractC23869a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89260c;

    /* renamed from: d */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends R>> f89261d;

    /* renamed from: e */
    public final Callable<? extends InterfaceC24574u<? extends R>> f89262e;

    /* renamed from: io.reactivex.internal.operators.maybe.p$a */
    /* loaded from: classes6.dex */
    public static final class C23897a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: b */
        public final InterfaceC24541s<? super R> f89263b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89264c;

        /* renamed from: d */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends R>> f89265d;

        /* renamed from: e */
        public final Callable<? extends InterfaceC24574u<? extends R>> f89266e;

        /* renamed from: f */
        public InterfaceC23465c f89267f;

        /* renamed from: io.reactivex.internal.operators.maybe.p$a$a */
        /* loaded from: classes6.dex */
        public final class C23898a implements InterfaceC24541s<R> {
            public C23898a() {
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                C23897a.this.f89263b.onComplete();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                C23897a.this.f89263b.onError(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(C23897a.this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                C23897a.this.f89263b.onSuccess(r);
            }
        }

        public C23897a(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC24574u<? extends R>> callable) {
            this.f89263b = interfaceC24541s;
            this.f89264c = interfaceC23492o;
            this.f89265d = interfaceC23492o2;
            this.f89266e = callable;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            this.f89267f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            try {
                ((InterfaceC24574u) C23544b.m32923e(this.f89266e.call(), "The onCompleteSupplier returned a null MaybeSource")).mo31865a(new C23898a());
            } catch (Exception e) {
                C23475a.m33009b(e);
                this.f89263b.onError(e);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            try {
                ((InterfaceC24574u) C23544b.m32923e(this.f89265d.apply(th), "The onErrorMapper returned a null MaybeSource")).mo31865a(new C23898a());
            } catch (Exception e) {
                C23475a.m33009b(e);
                this.f89263b.onError(new CompositeException(th, e));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89267f, interfaceC23465c)) {
                this.f89267f = interfaceC23465c;
                this.f89263b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                ((InterfaceC24574u) C23544b.m32923e(this.f89264c.apply(t), "The onSuccessMapper returned a null MaybeSource")).mo31865a(new C23898a());
            } catch (Exception e) {
                C23475a.m33009b(e);
                this.f89263b.onError(e);
            }
        }
    }

    public C23896p(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC24574u<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC24574u<? extends R>> callable) {
        super(interfaceC24574u);
        this.f89260c = interfaceC23492o;
        this.f89261d = interfaceC23492o2;
        this.f89262e = callable;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        this.f89206b.mo31865a(new C23897a(interfaceC24541s, this.f89260c, this.f89261d, this.f89262e));
    }
}
