package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.n0 */
/* loaded from: classes6.dex */
public final class C23780n0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88919d;

    /* renamed from: io.reactivex.internal.operators.flowable.n0$a */
    /* loaded from: classes6.dex */
    public static final class C23781a<T> extends AtomicBoolean implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -5636543848937116287L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88920b;

        /* renamed from: c */
        public final long f88921c;

        /* renamed from: d */
        public boolean f88922d;

        /* renamed from: e */
        public InterfaceC46292oT5 f88923e;

        /* renamed from: f */
        public long f88924f;

        public C23781a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j) {
            this.f88920b = interfaceC42141hT5;
            this.f88921c = j;
            this.f88924f = j;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88923e, interfaceC46292oT5)) {
                this.f88923e = interfaceC46292oT5;
                if (this.f88921c == 0) {
                    interfaceC46292oT5.cancel();
                    this.f88922d = true;
                    EnumC24460d.m32301a(this.f88920b);
                    return;
                }
                this.f88920b.mo31867a(this);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88923e.cancel();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (!EnumC24463g.m32287h(j)) {
                return;
            }
            if (!get() && compareAndSet(false, true) && j >= this.f88921c) {
                this.f88923e.mo21023o(LongCompanionObject.MAX_VALUE);
            } else {
                this.f88923e.mo21023o(j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (!this.f88922d) {
                this.f88922d = true;
                this.f88920b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (!this.f88922d) {
                this.f88922d = true;
                this.f88923e.cancel();
                this.f88920b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            boolean z;
            if (!this.f88922d) {
                long j = this.f88924f;
                long j2 = j - 1;
                this.f88924f = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f88920b.onNext(t);
                    if (z) {
                        this.f88923e.cancel();
                        onComplete();
                    }
                }
            }
        }
    }

    public C23780n0(AbstractC24490k<T> abstractC24490k, long j) {
        super(abstractC24490k);
        this.f88919d = j;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23781a(interfaceC42141hT5, this.f88919d));
    }
}
