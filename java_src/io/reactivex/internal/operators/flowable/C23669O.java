package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.O */
/* loaded from: classes6.dex */
public final class C23669O<T> extends AbstractC23695a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.O$a */
    /* loaded from: classes6.dex */
    public static final class C23670a<T> extends AtomicLong implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88549b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88550c;

        /* renamed from: d */
        public boolean f88551d;

        public C23670a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88549b = interfaceC42141hT5;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88550c, interfaceC46292oT5)) {
                this.f88550c = interfaceC46292oT5;
                this.f88549b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88550c.cancel();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this, j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88551d) {
                return;
            }
            this.f88551d = true;
            this.f88549b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88551d) {
                C24508a.m31988u(th);
                return;
            }
            this.f88551d = true;
            this.f88549b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88551d) {
                return;
            }
            if (get() != 0) {
                this.f88549b.onNext(t);
                C24468d.m32271d(this, 1L);
                return;
            }
            this.f88550c.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }
    }

    public C23669O(AbstractC24490k<T> abstractC24490k) {
        super(abstractC24490k);
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23670a(interfaceC42141hT5));
    }
}
