package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.G */
/* loaded from: classes6.dex */
public final class C23846G<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC24574u<? extends T> f89165c;

    /* renamed from: io.reactivex.internal.operators.maybe.G$a */
    /* loaded from: classes6.dex */
    public static final class C23847a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89166b;

        /* renamed from: c */
        public final InterfaceC24574u<? extends T> f89167c;

        /* renamed from: io.reactivex.internal.operators.maybe.G$a$a */
        /* loaded from: classes6.dex */
        public static final class C23848a<T> implements InterfaceC24541s<T> {

            /* renamed from: b */
            public final InterfaceC24541s<? super T> f89168b;

            /* renamed from: c */
            public final AtomicReference<InterfaceC23465c> f89169c;

            public C23848a(InterfaceC24541s<? super T> interfaceC24541s, AtomicReference<InterfaceC23465c> atomicReference) {
                this.f89168b = interfaceC24541s;
                this.f89169c = atomicReference;
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                this.f89168b.onComplete();
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                this.f89168b.onError(th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this.f89169c, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(T t) {
                this.f89168b.onSuccess(t);
            }
        }

        public C23847a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC24574u<? extends T> interfaceC24574u) {
            this.f89166b = interfaceC24541s;
            this.f89167c = interfaceC24574u;
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

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            InterfaceC23465c interfaceC23465c = get();
            if (interfaceC23465c != EnumC23501d.DISPOSED && compareAndSet(interfaceC23465c, null)) {
                this.f89167c.mo31865a(new C23848a(this.f89166b, this));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89166b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89166b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89166b.onSuccess(t);
        }
    }

    public C23846G(InterfaceC24574u<T> interfaceC24574u, InterfaceC24574u<? extends T> interfaceC24574u2) {
        super(interfaceC24574u);
        this.f89165c = interfaceC24574u2;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23847a(interfaceC24541s, this.f89165c));
    }
}
