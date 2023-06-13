package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.C23567l;
/* renamed from: io.reactivex.internal.operators.maybe.L */
/* loaded from: classes6.dex */
public final class C23860L<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89190b;

    /* renamed from: io.reactivex.internal.operators.maybe.L$a */
    /* loaded from: classes6.dex */
    public static final class C23861a<T> extends C23567l<T> implements InterfaceC24541s<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        public InterfaceC23465c f89191d;

        public C23861a(InterfaceC23436D<? super T> interfaceC23436D) {
            super(interfaceC23436D);
        }

        @Override // io.reactivex.internal.observers.C23567l, io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            super.dispose();
            this.f89191d.dispose();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            m32911a();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            m32909d(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89191d, interfaceC23465c)) {
                this.f89191d = interfaceC23465c;
                this.f88308b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            m32910c(t);
        }
    }

    public C23860L(InterfaceC24574u<T> interfaceC24574u) {
        this.f89190b = interfaceC24574u;
    }

    /* renamed from: a */
    public static <T> InterfaceC24541s<T> m32740a(InterfaceC23436D<? super T> interfaceC23436D) {
        return new C23861a(interfaceC23436D);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f89190b.mo31865a(m32740a(interfaceC23436D));
    }
}
