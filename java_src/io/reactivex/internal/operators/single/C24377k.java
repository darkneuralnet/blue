package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23479b;
/* renamed from: io.reactivex.internal.operators.single.k */
/* loaded from: classes6.dex */
public final class C24377k<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90841b;

    /* renamed from: c */
    public final InterfaceC23479b<? super T, ? super Throwable> f90842c;

    /* renamed from: io.reactivex.internal.operators.single.k$a */
    /* loaded from: classes6.dex */
    public final class C24378a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90843b;

        public C24378a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90843b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            try {
                C24377k.this.f90842c.accept(null, th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f90843b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90843b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                C24377k.this.f90842c.accept(t, null);
                this.f90843b.onSuccess(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90843b.onError(th);
            }
        }
    }

    public C24377k(InterfaceC23447K<T> interfaceC23447K, InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
        this.f90841b = interfaceC23447K;
        this.f90842c = interfaceC23479b;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90841b.mo33096a(new C24378a(interfaceC23445I));
    }
}
