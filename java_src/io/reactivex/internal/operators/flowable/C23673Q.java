package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.C24462f;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.flowable.Q */
/* loaded from: classes6.dex */
public final class C23673Q<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC45761na4<? extends T>> f88559d;

    /* renamed from: e */
    public final boolean f88560e;

    /* renamed from: io.reactivex.internal.operators.flowable.Q$a */
    /* loaded from: classes6.dex */
    public static final class C23674a<T> extends C24462f implements InterfaceC24494o<T> {
        private static final long serialVersionUID = 4063763155303814625L;

        /* renamed from: j */
        public final InterfaceC42141hT5<? super T> f88561j;

        /* renamed from: k */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC45761na4<? extends T>> f88562k;

        /* renamed from: l */
        public final boolean f88563l;

        /* renamed from: m */
        public boolean f88564m;

        /* renamed from: n */
        public boolean f88565n;

        /* renamed from: o */
        public long f88566o;

        public C23674a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23492o<? super Throwable, ? extends InterfaceC45761na4<? extends T>> interfaceC23492o, boolean z) {
            super(false);
            this.f88561j = interfaceC42141hT5;
            this.f88562k = interfaceC23492o;
            this.f88563l = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            m32295f(interfaceC46292oT5);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88565n) {
                return;
            }
            this.f88565n = true;
            this.f88564m = true;
            this.f88561j.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88564m) {
                if (this.f88565n) {
                    C24508a.m31988u(th);
                    return;
                } else {
                    this.f88561j.onError(th);
                    return;
                }
            }
            this.f88564m = true;
            if (this.f88563l && !(th instanceof Exception)) {
                this.f88561j.onError(th);
                return;
            }
            try {
                InterfaceC45761na4 interfaceC45761na4 = (InterfaceC45761na4) C23544b.m32923e(this.f88562k.apply(th), "The nextSupplier returned a null Publisher");
                long j = this.f88566o;
                if (j != 0) {
                    m32296e(j);
                }
                interfaceC45761na4.mo23497c(this);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f88561j.onError(new CompositeException(th, th2));
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88565n) {
                return;
            }
            if (!this.f88564m) {
                this.f88566o++;
            }
            this.f88561j.onNext(t);
        }
    }

    public C23673Q(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super Throwable, ? extends InterfaceC45761na4<? extends T>> interfaceC23492o, boolean z) {
        super(abstractC24490k);
        this.f88559d = interfaceC23492o;
        this.f88560e = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C23674a c23674a = new C23674a(interfaceC42141hT5, this.f88559d, this.f88560e);
        interfaceC42141hT5.mo31867a(c23674a);
        this.f88638c.m32166W0(c23674a);
    }
}
