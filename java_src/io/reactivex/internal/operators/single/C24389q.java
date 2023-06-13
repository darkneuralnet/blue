package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.q */
/* loaded from: classes6.dex */
public final class C24389q<T, R> extends AbstractC24507p<R> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90865b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f90866c;

    /* renamed from: io.reactivex.internal.operators.single.q$a */
    /* loaded from: classes6.dex */
    public static final class C24390a<R> implements InterfaceC24541s<R> {

        /* renamed from: b */
        public final AtomicReference<InterfaceC23465c> f90867b;

        /* renamed from: c */
        public final InterfaceC24541s<? super R> f90868c;

        public C24390a(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC24541s<? super R> interfaceC24541s) {
            this.f90867b = atomicReference;
            this.f90868c = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f90868c.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f90868c.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f90867b, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(R r) {
            this.f90868c.onSuccess(r);
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.q$b */
    /* loaded from: classes6.dex */
    public static final class C24391b<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = -5843758257109742742L;

        /* renamed from: b */
        public final InterfaceC24541s<? super R> f90869b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f90870c;

        public C24391b(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
            this.f90869b = interfaceC24541s;
            this.f90870c = interfaceC23492o;
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
            this.f90869b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f90869b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f90870c.apply(t), "The mapper returned a null MaybeSource");
                if (!mo1769e()) {
                    interfaceC24574u.mo31865a(new C24390a(this, this.f90869b));
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(th);
            }
        }
    }

    public C24389q(InterfaceC23447K<? extends T> interfaceC23447K, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o) {
        this.f90866c = interfaceC23492o;
        this.f90865b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        this.f90865b.mo33096a(new C24391b(interfaceC24541s, this.f90866c));
    }
}
