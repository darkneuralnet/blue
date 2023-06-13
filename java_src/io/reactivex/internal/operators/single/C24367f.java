package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.C23579x;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.f */
/* loaded from: classes6.dex */
public final class C24367f<T, U> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90818b;

    /* renamed from: c */
    public final InterfaceC23434B<U> f90819c;

    /* renamed from: io.reactivex.internal.operators.single.f$a */
    /* loaded from: classes6.dex */
    public static final class C24368a<T, U> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<U>, InterfaceC23465c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90820b;

        /* renamed from: c */
        public final InterfaceC23447K<T> f90821c;

        /* renamed from: d */
        public boolean f90822d;

        public C24368a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23447K<T> interfaceC23447K) {
            this.f90820b = interfaceC23445I;
            this.f90821c = interfaceC23447K;
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

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90822d) {
                return;
            }
            this.f90822d = true;
            this.f90821c.mo33096a(new C23579x(this, this.f90820b));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90822d) {
                C24508a.m31988u(th);
                return;
            }
            this.f90822d = true;
            this.f90820b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(U u) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32996g(this, interfaceC23465c)) {
                this.f90820b.onSubscribe(this);
            }
        }
    }

    public C24367f(InterfaceC23447K<T> interfaceC23447K, InterfaceC23434B<U> interfaceC23434B) {
        this.f90818b = interfaceC23447K;
        this.f90819c = interfaceC23434B;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90819c.subscribe(new C24368a(interfaceC23445I, this.f90818b));
    }
}
