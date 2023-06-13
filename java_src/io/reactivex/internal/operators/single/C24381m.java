package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
/* renamed from: io.reactivex.internal.operators.single.m */
/* loaded from: classes6.dex */
public final class C24381m<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90850b;

    /* renamed from: c */
    public final InterfaceC23484g<? super T> f90851c;

    /* renamed from: io.reactivex.internal.operators.single.m$a */
    /* loaded from: classes6.dex */
    public final class C24382a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90852b;

        public C24382a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90852b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90852b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90852b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                C24381m.this.f90851c.accept(t);
                this.f90852b.onSuccess(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90852b.onError(th);
            }
        }
    }

    public C24381m(InterfaceC23447K<T> interfaceC23447K, InterfaceC23484g<? super T> interfaceC23484g) {
        this.f90850b = interfaceC23447K;
        this.f90851c = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90850b.mo33096a(new C24382a(interfaceC23445I));
    }
}
