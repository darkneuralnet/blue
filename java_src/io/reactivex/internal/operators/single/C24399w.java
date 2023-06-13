package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
/* renamed from: io.reactivex.internal.operators.single.w */
/* loaded from: classes6.dex */
public final class C24399w<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90879b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends R> f90880c;

    /* renamed from: io.reactivex.internal.operators.single.w$a */
    /* loaded from: classes6.dex */
    public static final class C24400a<T, R> implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super R> f90881b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends R> f90882c;

        public C24400a(InterfaceC23445I<? super R> interfaceC23445I, InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
            this.f90881b = interfaceC23445I;
            this.f90882c = interfaceC23492o;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90881b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90881b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                this.f90881b.onSuccess(C23544b.m32923e(this.f90882c.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(th);
            }
        }
    }

    public C24399w(InterfaceC23447K<? extends T> interfaceC23447K, InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
        this.f90879b = interfaceC23447K;
        this.f90880c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        this.f90879b.mo33096a(new C24400a(interfaceC23445I, this.f90880c));
    }
}
