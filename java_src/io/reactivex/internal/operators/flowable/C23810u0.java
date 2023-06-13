package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.flowable.u0 */
/* loaded from: classes6.dex */
public final class C23810u0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final AbstractC23437E f89041d;

    /* renamed from: io.reactivex.internal.operators.flowable.u0$a */
    /* loaded from: classes6.dex */
    public static final class C23811a<T> extends AtomicBoolean implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 1015244841293359600L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f89042b;

        /* renamed from: c */
        public final AbstractC23437E f89043c;

        /* renamed from: d */
        public InterfaceC46292oT5 f89044d;

        /* renamed from: io.reactivex.internal.operators.flowable.u0$a$a */
        /* loaded from: classes6.dex */
        public final class RunnableC23812a implements Runnable {
            public RunnableC23812a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C23811a.this.f89044d.cancel();
            }
        }

        public C23811a(InterfaceC42141hT5<? super T> interfaceC42141hT5, AbstractC23437E abstractC23437E) {
            this.f89042b = interfaceC42141hT5;
            this.f89043c = abstractC23437E;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89044d, interfaceC46292oT5)) {
                this.f89044d = interfaceC46292oT5;
                this.f89042b.mo31867a(this);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f89043c.mo32324d(new RunnableC23812a());
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f89044d.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (!get()) {
                this.f89042b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (get()) {
                C24508a.m31988u(th);
            } else {
                this.f89042b.onError(th);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!get()) {
                this.f89042b.onNext(t);
            }
        }
    }

    public C23810u0(AbstractC24490k<T> abstractC24490k, AbstractC23437E abstractC23437E) {
        super(abstractC24490k);
        this.f89041d = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23811a(interfaceC42141hT5, this.f89041d));
    }
}
