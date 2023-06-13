package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.n */
/* loaded from: classes6.dex */
public final class C23953n<T, R> extends Observable<R> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f89449b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f89450c;

    /* renamed from: io.reactivex.internal.operators.mixed.n$a */
    /* loaded from: classes6.dex */
    public static final class C23954a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R>, InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89451b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f89452c;

        public C23954a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
            this.f89451b = interfaceC23436D;
            this.f89452c = interfaceC23492o;
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
            this.f89451b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89451b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(R r) {
            this.f89451b.onNext(r);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                ((InterfaceC23434B) C23544b.m32923e(this.f89452c.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89451b.onError(th);
            }
        }
    }

    public C23953n(InterfaceC23447K<T> interfaceC23447K, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        this.f89449b = interfaceC23447K;
        this.f89450c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C23954a c23954a = new C23954a(interfaceC23436D, this.f89450c);
        interfaceC23436D.onSubscribe(c23954a);
        this.f89449b.mo33096a(c23954a);
    }
}
