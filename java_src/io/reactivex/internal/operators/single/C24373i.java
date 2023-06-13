package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.i */
/* loaded from: classes6.dex */
public final class C24373i<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90833b;

    /* renamed from: c */
    public final InterfaceC23478a f90834c;

    /* renamed from: io.reactivex.internal.operators.single.i$a */
    /* loaded from: classes6.dex */
    public static final class C24374a<T> extends AtomicReference<InterfaceC23478a> implements InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = -8583764624474935784L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90835b;

        /* renamed from: c */
        public InterfaceC23465c f90836c;

        public C24374a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23478a interfaceC23478a) {
            this.f90835b = interfaceC23445I;
            lazySet(interfaceC23478a);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC23478a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
                this.f90836c.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90836c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90835b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90836c, interfaceC23465c)) {
                this.f90836c = interfaceC23465c;
                this.f90835b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90835b.onSuccess(t);
        }
    }

    public C24373i(InterfaceC23447K<T> interfaceC23447K, InterfaceC23478a interfaceC23478a) {
        this.f90833b = interfaceC23447K;
        this.f90834c = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90833b.mo33096a(new C24374a(interfaceC23445I, this.f90834c));
    }
}
