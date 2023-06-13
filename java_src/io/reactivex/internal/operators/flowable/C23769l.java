package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23493p;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.flowable.l */
/* loaded from: classes6.dex */
public final class C23769l<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23484g<? super InterfaceC46292oT5> f88869d;

    /* renamed from: e */
    public final InterfaceC23493p f88870e;

    /* renamed from: f */
    public final InterfaceC23478a f88871f;

    /* renamed from: io.reactivex.internal.operators.flowable.l$a */
    /* loaded from: classes6.dex */
    public static final class C23770a<T> implements InterfaceC24494o<T>, InterfaceC46292oT5 {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88872b;

        /* renamed from: c */
        public final InterfaceC23484g<? super InterfaceC46292oT5> f88873c;

        /* renamed from: d */
        public final InterfaceC23493p f88874d;

        /* renamed from: e */
        public final InterfaceC23478a f88875e;

        /* renamed from: f */
        public InterfaceC46292oT5 f88876f;

        public C23770a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g, InterfaceC23493p interfaceC23493p, InterfaceC23478a interfaceC23478a) {
            this.f88872b = interfaceC42141hT5;
            this.f88873c = interfaceC23484g;
            this.f88875e = interfaceC23478a;
            this.f88874d = interfaceC23493p;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            try {
                this.f88873c.accept(interfaceC46292oT5);
                if (EnumC24463g.m32286i(this.f88876f, interfaceC46292oT5)) {
                    this.f88876f = interfaceC46292oT5;
                    this.f88872b.mo31867a(this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                interfaceC46292oT5.cancel();
                this.f88876f = EnumC24463g.CANCELLED;
                EnumC24460d.m32300c(th, this.f88872b);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            InterfaceC46292oT5 interfaceC46292oT5 = this.f88876f;
            EnumC24463g enumC24463g = EnumC24463g.CANCELLED;
            if (interfaceC46292oT5 != enumC24463g) {
                this.f88876f = enumC24463g;
                try {
                    this.f88875e.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
                interfaceC46292oT5.cancel();
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            try {
                this.f88874d.mo32932a(j);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
            this.f88876f.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88876f != EnumC24463g.CANCELLED) {
                this.f88872b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88876f != EnumC24463g.CANCELLED) {
                this.f88872b.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88872b.onNext(t);
        }
    }

    public C23769l(AbstractC24490k<T> abstractC24490k, InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g, InterfaceC23493p interfaceC23493p, InterfaceC23478a interfaceC23478a) {
        super(abstractC24490k);
        this.f88869d = interfaceC23484g;
        this.f88870e = interfaceC23493p;
        this.f88871f = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23770a(interfaceC42141hT5, this.f88869d, this.f88870e, this.f88871f));
    }
}
