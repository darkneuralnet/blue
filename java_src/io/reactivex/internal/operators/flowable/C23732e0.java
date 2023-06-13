package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.processors.AbstractC24509a;
import io.reactivex.processors.C24513d;
import io.reactivex.subscribers.C24572a;
/* renamed from: io.reactivex.internal.operators.flowable.e0 */
/* loaded from: classes6.dex */
public final class C23732e0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23492o<? super AbstractC24490k<Throwable>, ? extends InterfaceC45761na4<?>> f88768d;

    /* renamed from: io.reactivex.internal.operators.flowable.e0$a */
    /* loaded from: classes6.dex */
    public static final class C23733a<T> extends AbstractC23696a0<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public C23733a(InterfaceC42141hT5<? super T> interfaceC42141hT5, AbstractC24509a<Throwable> abstractC24509a, InterfaceC46292oT5 interfaceC46292oT5) {
            super(interfaceC42141hT5, abstractC24509a, interfaceC46292oT5);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88641l.cancel();
            this.f88639j.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            m32853g(th);
        }
    }

    public C23732e0(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super AbstractC24490k<Throwable>, ? extends InterfaceC45761na4<?>> interfaceC23492o) {
        super(abstractC24490k);
        this.f88768d = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24572a c24572a = new C24572a(interfaceC42141hT5);
        AbstractC24509a<T> m31982x1 = C24513d.m31965z1(8).m31982x1();
        try {
            InterfaceC45761na4 interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(this.f88768d.apply(m31982x1), "handler returned a null Publisher");
            C23694Z c23694z = new C23694Z(this.f88638c);
            C23733a c23733a = new C23733a(c24572a, m31982x1, c23694z);
            c23694z.f88637e = c23733a;
            interfaceC42141hT5.mo31867a(c23733a);
            interfaceC45761na4.mo23497c(c23694z);
            c23694z.onNext(0);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC24460d.m32300c(th, interfaceC42141hT5);
        }
    }
}
