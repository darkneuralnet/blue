package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.q */
/* loaded from: classes6.dex */
public final class C23899q<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89269b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89270c;

    /* renamed from: io.reactivex.internal.operators.maybe.q$a */
    /* loaded from: classes6.dex */
    public static final class C23900a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4827726964688405508L;

        /* renamed from: b */
        public final InterfaceC23445I<? super R> f89271b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89272c;

        public C23900a(InterfaceC23445I<? super R> interfaceC23445I, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
            this.f89271b = interfaceC23445I;
            this.f89272c = interfaceC23492o;
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
            this.f89271b.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89271b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89271b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f89272c.apply(t), "The mapper returned a null SingleSource");
                if (!mo1769e()) {
                    interfaceC23447K.mo33096a(new C23901b(this, this.f89271b));
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.q$b */
    /* loaded from: classes6.dex */
    public static final class C23901b<R> implements InterfaceC23445I<R> {

        /* renamed from: b */
        public final AtomicReference<InterfaceC23465c> f89273b;

        /* renamed from: c */
        public final InterfaceC23445I<? super R> f89274c;

        public C23901b(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23445I<? super R> interfaceC23445I) {
            this.f89273b = atomicReference;
            this.f89274c = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f89274c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f89273b, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(R r) {
            this.f89274c.onSuccess(r);
        }
    }

    public C23899q(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        this.f89269b = interfaceC24574u;
        this.f89270c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        this.f89269b.mo31865a(new C23900a(interfaceC23445I, this.f89270c));
    }
}
