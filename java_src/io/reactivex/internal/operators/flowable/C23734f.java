package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.subscribers.C24572a;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.flowable.f */
/* loaded from: classes6.dex */
public final class C23734f<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88769d;

    /* renamed from: e */
    public final TimeUnit f88770e;

    /* renamed from: f */
    public final AbstractC23437E f88771f;

    /* renamed from: g */
    public final boolean f88772g;

    /* renamed from: io.reactivex.internal.operators.flowable.f$a */
    /* loaded from: classes6.dex */
    public static final class C23735a<T> implements InterfaceC24494o<T>, InterfaceC46292oT5 {

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88773b;

        /* renamed from: c */
        public final long f88774c;

        /* renamed from: d */
        public final TimeUnit f88775d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f88776e;

        /* renamed from: f */
        public final boolean f88777f;

        /* renamed from: g */
        public InterfaceC46292oT5 f88778g;

        /* renamed from: io.reactivex.internal.operators.flowable.f$a$a */
        /* loaded from: classes6.dex */
        public final class RunnableC23736a implements Runnable {
            public RunnableC23736a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C23735a.this.f88773b.onComplete();
                } finally {
                    C23735a.this.f88776e.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.f$a$b */
        /* loaded from: classes6.dex */
        public final class RunnableC23737b implements Runnable {

            /* renamed from: b */
            public final Throwable f88780b;

            public RunnableC23737b(Throwable th) {
                this.f88780b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C23735a.this.f88773b.onError(this.f88780b);
                } finally {
                    C23735a.this.f88776e.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.f$a$c */
        /* loaded from: classes6.dex */
        public final class RunnableC23738c implements Runnable {

            /* renamed from: b */
            public final T f88782b;

            public RunnableC23738c(T t) {
                this.f88782b = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                C23735a.this.f88773b.onNext((T) this.f88782b);
            }
        }

        public C23735a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z) {
            this.f88773b = interfaceC42141hT5;
            this.f88774c = j;
            this.f88775d = timeUnit;
            this.f88776e = abstractC23440c;
            this.f88777f = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88778g, interfaceC46292oT5)) {
                this.f88778g = interfaceC46292oT5;
                this.f88773b.mo31867a(this);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88778g.cancel();
            this.f88776e.dispose();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            this.f88778g.mo21023o(j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88776e.mo32319c(new RunnableC23736a(), this.f88774c, this.f88775d);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88776e.mo32319c(new RunnableC23737b(th), this.f88777f ? this.f88774c : 0L, this.f88775d);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88776e.mo32319c(new RunnableC23738c(t), this.f88774c, this.f88775d);
        }
    }

    public C23734f(AbstractC24490k<T> abstractC24490k, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(abstractC24490k);
        this.f88769d = j;
        this.f88770e = timeUnit;
        this.f88771f = abstractC23437E;
        this.f88772g = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24572a c24572a;
        if (this.f88772g) {
            c24572a = interfaceC42141hT5;
        } else {
            c24572a = new C24572a(interfaceC42141hT5);
        }
        this.f88638c.m32166W0(new C23735a(c24572a, this.f88769d, this.f88770e, this.f88771f.mo8041b(), this.f88772g));
    }
}
