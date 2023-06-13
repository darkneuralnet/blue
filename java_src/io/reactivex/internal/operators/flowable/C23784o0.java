package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.flowable.o0 */
/* loaded from: classes6.dex */
public final class C23784o0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23494q<? super T> f88934d;

    /* renamed from: io.reactivex.internal.operators.flowable.o0$a */
    /* loaded from: classes6.dex */
    public static final class C23785a<T> implements InterfaceC24494o<T>, InterfaceC46292oT5 {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88935b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f88936c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88937d;

        /* renamed from: e */
        public boolean f88938e;

        public C23785a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f88935b = interfaceC42141hT5;
            this.f88936c = interfaceC23494q;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88937d, interfaceC46292oT5)) {
                this.f88937d = interfaceC46292oT5;
                this.f88935b.mo31867a(this);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88937d.cancel();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f88937d.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (!this.f88938e) {
                this.f88938e = true;
                this.f88935b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (!this.f88938e) {
                this.f88938e = true;
                this.f88935b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!this.f88938e) {
                this.f88935b.onNext(t);
                try {
                    if (this.f88936c.test(t)) {
                        this.f88938e = true;
                        this.f88937d.cancel();
                        this.f88935b.onComplete();
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88937d.cancel();
                    onError(th);
                }
            }
        }
    }

    public C23784o0(AbstractC24490k<T> abstractC24490k, InterfaceC23494q<? super T> interfaceC23494q) {
        super(abstractC24490k);
        this.f88934d = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23785a(interfaceC42141hT5, this.f88934d));
    }
}
