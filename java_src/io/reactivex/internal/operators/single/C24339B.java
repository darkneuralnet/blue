package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.B */
/* loaded from: classes6.dex */
public final class C24339B<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<? extends T> f90753b;

    /* renamed from: c */
    public final AbstractC23437E f90754c;

    /* renamed from: io.reactivex.internal.operators.single.B$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24340a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90755b;

        /* renamed from: c */
        public final C23505h f90756c = new C23505h();

        /* renamed from: d */
        public final InterfaceC23447K<? extends T> f90757d;

        public RunnableC24340a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23447K<? extends T> interfaceC23447K) {
            this.f90755b = interfaceC23445I;
            this.f90757d = interfaceC23447K;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            this.f90756c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90755b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90755b.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f90757d.mo33096a(this);
        }
    }

    public C24339B(InterfaceC23447K<? extends T> interfaceC23447K, AbstractC23437E abstractC23437E) {
        this.f90753b = interfaceC23447K;
        this.f90754c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        RunnableC24340a runnableC24340a = new RunnableC24340a(interfaceC23445I, this.f90753b);
        interfaceC23445I.onSubscribe(runnableC24340a);
        runnableC24340a.f90756c.m32981a(this.f90754c.mo32324d(runnableC24340a));
    }
}
