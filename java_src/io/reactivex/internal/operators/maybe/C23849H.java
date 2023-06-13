package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.H */
/* loaded from: classes6.dex */
public final class C23849H<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89170b;

    /* renamed from: c */
    public final InterfaceC23447K<? extends T> f89171c;

    /* renamed from: io.reactivex.internal.operators.maybe.H$a */
    /* loaded from: classes6.dex */
    public static final class C23850a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4603919676453758899L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f89172b;

        /* renamed from: c */
        public final InterfaceC23447K<? extends T> f89173c;

        /* renamed from: io.reactivex.internal.operators.maybe.H$a$a */
        /* loaded from: classes6.dex */
        public static final class C23851a<T> implements InterfaceC23445I<T> {

            /* renamed from: b */
            public final InterfaceC23445I<? super T> f89174b;

            /* renamed from: c */
            public final AtomicReference<InterfaceC23465c> f89175c;

            public C23851a(InterfaceC23445I<? super T> interfaceC23445I, AtomicReference<InterfaceC23465c> atomicReference) {
                this.f89174b = interfaceC23445I;
                this.f89175c = atomicReference;
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f89174b.onError(th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this.f89175c, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(T t) {
                this.f89174b.onSuccess(t);
            }
        }

        public C23850a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23447K<? extends T> interfaceC23447K) {
            this.f89172b = interfaceC23445I;
            this.f89173c = interfaceC23447K;
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
                this.f89173c.mo33096a(new C23851a(this.f89172b, this));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89172b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89172b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89172b.onSuccess(t);
        }
    }

    public C23849H(InterfaceC24574u<T> interfaceC24574u, InterfaceC23447K<? extends T> interfaceC23447K) {
        this.f89170b = interfaceC24574u;
        this.f89171c = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f89170b.mo31865a(new C23850a(interfaceC23445I, this.f89171c));
    }
}
