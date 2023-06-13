package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
/* renamed from: io.reactivex.internal.operators.single.z */
/* loaded from: classes6.dex */
public final class C24404z<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90890b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends T> f90891c;

    /* renamed from: d */
    public final T f90892d;

    /* renamed from: io.reactivex.internal.operators.single.z$a */
    /* loaded from: classes6.dex */
    public final class C24405a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90893b;

        public C24405a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90893b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            T apply;
            C24404z c24404z = C24404z.this;
            InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o = c24404z.f90891c;
            if (interfaceC23492o != null) {
                try {
                    apply = interfaceC23492o.apply(th);
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    this.f90893b.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                apply = c24404z.f90892d;
            }
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f90893b.onError(nullPointerException);
                return;
            }
            this.f90893b.onSuccess(apply);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90893b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90893b.onSuccess(t);
        }
    }

    public C24404z(InterfaceC23447K<? extends T> interfaceC23447K, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o, T t) {
        this.f90890b = interfaceC23447K;
        this.f90891c = interfaceC23492o;
        this.f90892d = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90890b.mo33096a(new C24405a(interfaceC23445I));
    }
}
