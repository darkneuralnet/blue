package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.o */
/* loaded from: classes6.dex */
public final class C24384o<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90855b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f90856c;

    /* renamed from: io.reactivex.internal.operators.single.o$a */
    /* loaded from: classes6.dex */
    public static final class C24385a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: b */
        public final InterfaceC23445I<? super R> f90857b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f90858c;

        /* renamed from: io.reactivex.internal.operators.single.o$a$a */
        /* loaded from: classes6.dex */
        public static final class C24386a<R> implements InterfaceC23445I<R> {

            /* renamed from: b */
            public final AtomicReference<InterfaceC23465c> f90859b;

            /* renamed from: c */
            public final InterfaceC23445I<? super R> f90860c;

            public C24386a(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23445I<? super R> interfaceC23445I) {
                this.f90859b = atomicReference;
                this.f90860c = interfaceC23445I;
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f90860c.onError(th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this.f90859b, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                this.f90860c.onSuccess(r);
            }
        }

        public C24385a(InterfaceC23445I<? super R> interfaceC23445I, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
            this.f90857b = interfaceC23445I;
            this.f90858c = interfaceC23492o;
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

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90857b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f90857b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f90858c.apply(t), "The single returned by the mapper is null");
                if (!mo1769e()) {
                    interfaceC23447K.mo33096a(new C24386a(this, this.f90857b));
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90857b.onError(th);
            }
        }
    }

    public C24384o(InterfaceC23447K<? extends T> interfaceC23447K, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o) {
        this.f90856c = interfaceC23492o;
        this.f90855b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        this.f90855b.mo33096a(new C24385a(interfaceC23445I, this.f90856c));
    }
}
