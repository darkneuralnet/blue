package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.single.t */
/* loaded from: classes6.dex */
public final class C24394t<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90873b;

    /* renamed from: io.reactivex.internal.operators.single.t$a */
    /* loaded from: classes6.dex */
    public static final class C24395a<T> implements InterfaceC23445I<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90874b;

        /* renamed from: c */
        public InterfaceC23465c f90875c;

        public C24395a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90874b = interfaceC23445I;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90875c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90875c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90874b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90875c, interfaceC23465c)) {
                this.f90875c = interfaceC23465c;
                this.f90874b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90874b.onSuccess(t);
        }
    }

    public C24394t(InterfaceC23447K<? extends T> interfaceC23447K) {
        this.f90873b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90873b.mo33096a(new C24395a(interfaceC23445I));
    }
}
