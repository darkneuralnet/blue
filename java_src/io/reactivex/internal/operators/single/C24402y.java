package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.y */
/* loaded from: classes6.dex */
public final class C24402y<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90884b;

    /* renamed from: c */
    public final AbstractC23437E f90885c;

    /* renamed from: io.reactivex.internal.operators.single.y$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24403a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90886b;

        /* renamed from: c */
        public final AbstractC23437E f90887c;

        /* renamed from: d */
        public T f90888d;

        /* renamed from: e */
        public Throwable f90889e;

        public RunnableC24403a(InterfaceC23445I<? super T> interfaceC23445I, AbstractC23437E abstractC23437E) {
            this.f90886b = interfaceC23445I;
            this.f90887c = abstractC23437E;
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
            this.f90889e = th;
            EnumC23501d.m32998c(this, this.f90887c.mo32324d(this));
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f90886b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90888d = t;
            EnumC23501d.m32998c(this, this.f90887c.mo32324d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f90889e;
            if (th != null) {
                this.f90886b.onError(th);
            } else {
                this.f90886b.onSuccess((T) this.f90888d);
            }
        }
    }

    public C24402y(InterfaceC23447K<T> interfaceC23447K, AbstractC23437E abstractC23437E) {
        this.f90884b = interfaceC23447K;
        this.f90885c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90884b.mo33096a(new RunnableC24403a(interfaceC23445I, this.f90885c));
    }
}
