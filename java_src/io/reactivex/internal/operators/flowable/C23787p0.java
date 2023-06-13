package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import io.reactivex.subscribers.C24572a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.p0 */
/* loaded from: classes6.dex */
public final class C23787p0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88940d;

    /* renamed from: e */
    public final TimeUnit f88941e;

    /* renamed from: f */
    public final AbstractC23437E f88942f;

    /* renamed from: io.reactivex.internal.operators.flowable.p0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23788a<T> extends AtomicLong implements InterfaceC24494o<T>, InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88943b;

        /* renamed from: c */
        public final long f88944c;

        /* renamed from: d */
        public final TimeUnit f88945d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f88946e;

        /* renamed from: f */
        public InterfaceC46292oT5 f88947f;

        /* renamed from: g */
        public final C23505h f88948g = new C23505h();

        /* renamed from: h */
        public volatile boolean f88949h;

        /* renamed from: i */
        public boolean f88950i;

        public RunnableC23788a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            this.f88943b = interfaceC42141hT5;
            this.f88944c = j;
            this.f88945d = timeUnit;
            this.f88946e = abstractC23440c;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88947f, interfaceC46292oT5)) {
                this.f88947f = interfaceC46292oT5;
                this.f88943b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88947f.cancel();
            this.f88946e.dispose();
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
            if (this.f88950i) {
                return;
            }
            this.f88950i = true;
            this.f88943b.onComplete();
            this.f88946e.dispose();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88950i) {
                C24508a.m31988u(th);
                return;
            }
            this.f88950i = true;
            this.f88943b.onError(th);
            this.f88946e.dispose();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!this.f88950i && !this.f88949h) {
                this.f88949h = true;
                if (get() != 0) {
                    this.f88943b.onNext(t);
                    C24468d.m32271d(this, 1L);
                    InterfaceC23465c interfaceC23465c = this.f88948g.get();
                    if (interfaceC23465c != null) {
                        interfaceC23465c.dispose();
                    }
                    this.f88948g.m32981a(this.f88946e.mo32319c(this, this.f88944c, this.f88945d));
                    return;
                }
                this.f88950i = true;
                cancel();
                this.f88943b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88949h = false;
        }
    }

    public C23787p0(AbstractC24490k<T> abstractC24490k, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        super(abstractC24490k);
        this.f88940d = j;
        this.f88941e = timeUnit;
        this.f88942f = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new RunnableC23788a(new C24572a(interfaceC42141hT5), this.f88940d, this.f88941e, this.f88942f.mo8041b()));
    }
}
