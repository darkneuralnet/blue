package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24494o;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.h0 */
/* loaded from: classes6.dex */
public final class C24193h0<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC45761na4<? extends T> f90228b;

    /* renamed from: io.reactivex.internal.operators.observable.h0$a */
    /* loaded from: classes6.dex */
    public static final class C24194a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90229b;

        /* renamed from: c */
        public InterfaceC46292oT5 f90230c;

        public C24194a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90229b = interfaceC23436D;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f90230c, interfaceC46292oT5)) {
                this.f90230c = interfaceC46292oT5;
                this.f90229b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90230c.cancel();
            this.f90230c = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90230c == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f90229b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f90229b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f90229b.onNext(t);
        }
    }

    public C24193h0(InterfaceC45761na4<? extends T> interfaceC45761na4) {
        this.f90228b = interfaceC45761na4;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90228b.mo23497c(new C24194a(interfaceC23436D));
    }
}
