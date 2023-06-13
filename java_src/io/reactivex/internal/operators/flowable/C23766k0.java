package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.k0 */
/* loaded from: classes6.dex */
public final class C23766k0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final AbstractC23437E f88859d;

    /* renamed from: e */
    public final boolean f88860e;

    /* renamed from: io.reactivex.internal.operators.flowable.k0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23767a<T> extends AtomicReference<Thread> implements InterfaceC24494o<T>, InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88861b;

        /* renamed from: c */
        public final AbstractC23437E.AbstractC23440c f88862c;

        /* renamed from: d */
        public final AtomicReference<InterfaceC46292oT5> f88863d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicLong f88864e = new AtomicLong();

        /* renamed from: f */
        public final boolean f88865f;

        /* renamed from: g */
        public InterfaceC45761na4<T> f88866g;

        /* renamed from: io.reactivex.internal.operators.flowable.k0$a$a */
        /* loaded from: classes6.dex */
        public static final class RunnableC23768a implements Runnable {

            /* renamed from: b */
            public final InterfaceC46292oT5 f88867b;

            /* renamed from: c */
            public final long f88868c;

            public RunnableC23768a(InterfaceC46292oT5 interfaceC46292oT5, long j) {
                this.f88867b = interfaceC46292oT5;
                this.f88868c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f88867b.mo21023o(this.f88868c);
            }
        }

        public RunnableC23767a(InterfaceC42141hT5<? super T> interfaceC42141hT5, AbstractC23437E.AbstractC23440c abstractC23440c, InterfaceC45761na4<T> interfaceC45761na4, boolean z) {
            this.f88861b = interfaceC42141hT5;
            this.f88862c = abstractC23440c;
            this.f88866g = interfaceC45761na4;
            this.f88865f = !z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this.f88863d, interfaceC46292oT5)) {
                long andSet = this.f88864e.getAndSet(0L);
                if (andSet != 0) {
                    m32796b(andSet, interfaceC46292oT5);
                }
            }
        }

        /* renamed from: b */
        public void m32796b(long j, InterfaceC46292oT5 interfaceC46292oT5) {
            if (!this.f88865f && Thread.currentThread() != get()) {
                this.f88862c.mo32320b(new RunnableC23768a(interfaceC46292oT5, j));
            } else {
                interfaceC46292oT5.mo21023o(j);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC24463g.m32294a(this.f88863d);
            this.f88862c.dispose();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                InterfaceC46292oT5 interfaceC46292oT5 = this.f88863d.get();
                if (interfaceC46292oT5 != null) {
                    m32796b(j, interfaceC46292oT5);
                    return;
                }
                C24468d.m32274a(this.f88864e, j);
                InterfaceC46292oT5 interfaceC46292oT52 = this.f88863d.get();
                if (interfaceC46292oT52 != null) {
                    long andSet = this.f88864e.getAndSet(0L);
                    if (andSet != 0) {
                        m32796b(andSet, interfaceC46292oT52);
                    }
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88861b.onComplete();
            this.f88862c.dispose();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88861b.onError(th);
            this.f88862c.dispose();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88861b.onNext(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC45761na4<T> interfaceC45761na4 = this.f88866g;
            this.f88866g = null;
            interfaceC45761na4.mo23497c(this);
        }
    }

    public C23766k0(AbstractC24490k<T> abstractC24490k, AbstractC23437E abstractC23437E, boolean z) {
        super(abstractC24490k);
        this.f88859d = abstractC23437E;
        this.f88860e = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        AbstractC23437E.AbstractC23440c mo8041b = this.f88859d.mo8041b();
        RunnableC23767a runnableC23767a = new RunnableC23767a(interfaceC42141hT5, mo8041b, this.f88638c, this.f88860e);
        interfaceC42141hT5.mo31867a(runnableC23767a);
        mo8041b.mo32320b(runnableC23767a);
    }
}
