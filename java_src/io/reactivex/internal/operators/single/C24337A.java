package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.C23579x;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.A */
/* loaded from: classes6.dex */
public final class C24337A<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90749b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23447K<? extends T>> f90750c;

    /* renamed from: io.reactivex.internal.operators.single.A$a */
    /* loaded from: classes6.dex */
    public static final class C24338a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90751b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23447K<? extends T>> f90752c;

        public C24338a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23492o<? super Throwable, ? extends InterfaceC23447K<? extends T>> interfaceC23492o) {
            this.f90751b = interfaceC23445I;
            this.f90752c = interfaceC23492o;
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
            try {
                ((InterfaceC23447K) C23544b.m32923e(this.f90752c.apply(th), "The nextFunction returned a null SingleSource.")).mo33096a(new C23579x(this, this.f90751b));
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f90751b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f90751b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90751b.onSuccess(t);
        }
    }

    public C24337A(InterfaceC23447K<? extends T> interfaceC23447K, InterfaceC23492o<? super Throwable, ? extends InterfaceC23447K<? extends T>> interfaceC23492o) {
        this.f90749b = interfaceC23447K;
        this.f90750c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90749b.mo33096a(new C24338a(interfaceC23445I, this.f90750c));
    }
}
