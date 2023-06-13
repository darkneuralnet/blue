package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.internal.subscriptions.C24462f;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.flowable.c0 */
/* loaded from: classes6.dex */
public final class C23717c0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23481d<? super Integer, ? super Throwable> f88731d;

    /* renamed from: io.reactivex.internal.operators.flowable.c0$a */
    /* loaded from: classes6.dex */
    public static final class C23718a<T> extends AtomicInteger implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88732b;

        /* renamed from: c */
        public final C24462f f88733c;

        /* renamed from: d */
        public final InterfaceC45761na4<? extends T> f88734d;

        /* renamed from: e */
        public final InterfaceC23481d<? super Integer, ? super Throwable> f88735e;

        /* renamed from: f */
        public int f88736f;

        /* renamed from: g */
        public long f88737g;

        public C23718a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d, C24462f c24462f, InterfaceC45761na4<? extends T> interfaceC45761na4) {
            this.f88732b = interfaceC42141hT5;
            this.f88733c = c24462f;
            this.f88734d = interfaceC45761na4;
            this.f88735e = interfaceC23481d;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f88733c.m32295f(interfaceC46292oT5);
        }

        /* renamed from: b */
        public void m32814b() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f88733c.m32297d()) {
                    long j = this.f88737g;
                    if (j != 0) {
                        this.f88737g = 0L;
                        this.f88733c.m32296e(j);
                    }
                    this.f88734d.mo23497c(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88732b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            try {
                InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d = this.f88735e;
                int i = this.f88736f + 1;
                this.f88736f = i;
                if (!interfaceC23481d.test(Integer.valueOf(i), th)) {
                    this.f88732b.onError(th);
                } else {
                    m32814b();
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f88732b.onError(new CompositeException(th, th2));
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88737g++;
            this.f88732b.onNext(t);
        }
    }

    public C23717c0(AbstractC24490k<T> abstractC24490k, InterfaceC23481d<? super Integer, ? super Throwable> interfaceC23481d) {
        super(abstractC24490k);
        this.f88731d = interfaceC23481d;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24462f c24462f = new C24462f(false);
        interfaceC42141hT5.mo31867a(c24462f);
        new C23718a(interfaceC42141hT5, this.f88731d, c24462f, this.f88638c).m32814b();
    }
}
