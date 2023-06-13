package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23484g;
/* renamed from: io.reactivex.internal.operators.single.j */
/* loaded from: classes6.dex */
public final class C24375j<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90837b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f90838c;

    /* renamed from: io.reactivex.internal.operators.single.j$a */
    /* loaded from: classes6.dex */
    public final class C24376a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90839b;

        public C24376a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90839b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            try {
                C24375j.this.f90838c.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f90839b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90839b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90839b.onSuccess(t);
        }
    }

    public C24375j(InterfaceC23447K<T> interfaceC23447K, InterfaceC23484g<? super Throwable> interfaceC23484g) {
        this.f90837b = interfaceC23447K;
        this.f90838c = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90837b.mo33096a(new C24376a(interfaceC23445I));
    }
}
