package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.internal.operators.flowable.B */
/* loaded from: classes6.dex */
public final class C23642B<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final Observable<T> f88469c;

    /* renamed from: io.reactivex.internal.operators.flowable.B$a */
    /* loaded from: classes6.dex */
    public static final class C23643a<T> implements InterfaceC23436D<T>, InterfaceC46292oT5 {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88470b;

        /* renamed from: c */
        public InterfaceC23465c f88471c;

        public C23643a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88470b = interfaceC42141hT5;
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88471c.dispose();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f88470b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f88470b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f88470b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88471c = interfaceC23465c;
            this.f88470b.mo31867a(this);
        }
    }

    public C23642B(Observable<T> observable) {
        this.f88469c = observable;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88469c.subscribe(new C23643a(interfaceC42141hT5));
    }
}
