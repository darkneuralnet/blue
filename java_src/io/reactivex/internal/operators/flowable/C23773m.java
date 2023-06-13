package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.C24459c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.m */
/* loaded from: classes6.dex */
public final class C23773m<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88882d;

    /* renamed from: e */
    public final T f88883e;

    /* renamed from: f */
    public final boolean f88884f;

    /* renamed from: io.reactivex.internal.operators.flowable.m$a */
    /* loaded from: classes6.dex */
    public static final class C23774a<T> extends C24459c<T> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: d */
        public final long f88885d;

        /* renamed from: e */
        public final T f88886e;

        /* renamed from: f */
        public final boolean f88887f;

        /* renamed from: g */
        public InterfaceC46292oT5 f88888g;

        /* renamed from: h */
        public long f88889h;

        /* renamed from: i */
        public boolean f88890i;

        public C23774a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, T t, boolean z) {
            super(interfaceC42141hT5);
            this.f88885d = j;
            this.f88886e = t;
            this.f88887f = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88888g, interfaceC46292oT5)) {
                this.f88888g = interfaceC46292oT5;
                this.f91047b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.C24459c, p000.InterfaceC46292oT5
        public void cancel() {
            super.cancel();
            this.f88888g.cancel();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (!this.f88890i) {
                this.f88890i = true;
                T t = this.f88886e;
                if (t == null) {
                    if (this.f88887f) {
                        this.f91047b.onError(new NoSuchElementException());
                        return;
                    } else {
                        this.f91047b.onComplete();
                        return;
                    }
                }
                m32302c(t);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88890i) {
                C24508a.m31988u(th);
                return;
            }
            this.f88890i = true;
            this.f91047b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88890i) {
                return;
            }
            long j = this.f88889h;
            if (j == this.f88885d) {
                this.f88890i = true;
                this.f88888g.cancel();
                m32302c(t);
                return;
            }
            this.f88889h = j + 1;
        }
    }

    public C23773m(AbstractC24490k<T> abstractC24490k, long j, T t, boolean z) {
        super(abstractC24490k);
        this.f88882d = j;
        this.f88883e = t;
        this.f88884f = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23774a(interfaceC42141hT5, this.f88882d, this.f88883e, this.f88884f));
    }
}
