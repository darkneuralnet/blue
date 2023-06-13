package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.f */
/* loaded from: classes6.dex */
public final class C23932f<T, R> extends Observable<R> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89357b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f89358c;

    /* renamed from: io.reactivex.internal.operators.mixed.f$a */
    /* loaded from: classes6.dex */
    public static final class C23933a<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R>, InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89359b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f89360c;

        public C23933a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
            this.f89359b = interfaceC23436D;
            this.f89360c = interfaceC23492o;
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
            this.f89359b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89359b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(R r) {
            this.f89359b.onNext(r);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                ((InterfaceC23434B) C23544b.m32923e(this.f89360c.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89359b.onError(th);
            }
        }
    }

    public C23932f(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        this.f89357b = interfaceC24574u;
        this.f89358c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C23933a c23933a = new C23933a(interfaceC23436D, this.f89358c);
        interfaceC23436D.onSubscribe(c23933a);
        this.f89357b.mo31865a(c23933a);
    }
}
