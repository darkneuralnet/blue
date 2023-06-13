package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.subscriptions.C24459c;
/* renamed from: io.reactivex.internal.operators.maybe.K */
/* loaded from: classes6.dex */
public final class C23858K<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC24574u<T> f89188c;

    /* renamed from: io.reactivex.internal.operators.maybe.K$a */
    /* loaded from: classes6.dex */
    public static final class C23859a<T> extends C24459c<T> implements InterfaceC24541s<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        public InterfaceC23465c f89189d;

        public C23859a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        @Override // io.reactivex.internal.subscriptions.C24459c, p000.InterfaceC46292oT5
        public void cancel() {
            super.cancel();
            this.f89189d.dispose();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f91047b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f91047b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89189d, interfaceC23465c)) {
                this.f89189d = interfaceC23465c;
                this.f91047b.mo31867a(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            m32302c(t);
        }
    }

    public C23858K(InterfaceC24574u<T> interfaceC24574u) {
        this.f89188c = interfaceC24574u;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f89188c.mo31865a(new C23859a(interfaceC42141hT5));
    }
}
