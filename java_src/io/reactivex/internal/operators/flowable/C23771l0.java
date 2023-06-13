package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.C24462f;
/* renamed from: io.reactivex.internal.operators.flowable.l0 */
/* loaded from: classes6.dex */
public final class C23771l0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC45761na4<? extends T> f88877d;

    /* renamed from: io.reactivex.internal.operators.flowable.l0$a */
    /* loaded from: classes6.dex */
    public static final class C23772a<T> implements InterfaceC24494o<T> {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88878b;

        /* renamed from: c */
        public final InterfaceC45761na4<? extends T> f88879c;

        /* renamed from: e */
        public boolean f88881e = true;

        /* renamed from: d */
        public final C24462f f88880d = new C24462f(false);

        public C23772a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC45761na4<? extends T> interfaceC45761na4) {
            this.f88878b = interfaceC42141hT5;
            this.f88879c = interfaceC45761na4;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f88880d.m32295f(interfaceC46292oT5);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88881e) {
                this.f88881e = false;
                this.f88879c.mo23497c(this);
                return;
            }
            this.f88878b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88878b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88881e) {
                this.f88881e = false;
            }
            this.f88878b.onNext(t);
        }
    }

    public C23771l0(AbstractC24490k<T> abstractC24490k, InterfaceC45761na4<? extends T> interfaceC45761na4) {
        super(abstractC24490k);
        this.f88877d = interfaceC45761na4;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C23772a c23772a = new C23772a(interfaceC42141hT5, this.f88877d);
        interfaceC42141hT5.mo31867a(c23772a.f88880d);
        this.f88638c.m32166W0(c23772a);
    }
}
