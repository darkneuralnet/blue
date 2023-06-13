package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.C24462f;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.Y */
/* loaded from: classes6.dex */
public final class C23692Y<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88628d;

    /* renamed from: io.reactivex.internal.operators.flowable.Y$a */
    /* loaded from: classes6.dex */
    public static final class C23693a<T> extends AtomicInteger implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88629b;

        /* renamed from: c */
        public final C24462f f88630c;

        /* renamed from: d */
        public final InterfaceC45761na4<? extends T> f88631d;

        /* renamed from: e */
        public long f88632e;

        /* renamed from: f */
        public long f88633f;

        public C23693a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, C24462f c24462f, InterfaceC45761na4<? extends T> interfaceC45761na4) {
            this.f88629b = interfaceC42141hT5;
            this.f88630c = c24462f;
            this.f88631d = interfaceC45761na4;
            this.f88632e = j;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f88630c.m32295f(interfaceC46292oT5);
        }

        /* renamed from: b */
        public void m32854b() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f88630c.m32297d()) {
                    long j = this.f88633f;
                    if (j != 0) {
                        this.f88633f = 0L;
                        this.f88630c.m32296e(j);
                    }
                    this.f88631d.mo23497c(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            long j = this.f88632e;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.f88632e = j - 1;
            }
            if (j != 0) {
                m32854b();
            } else {
                this.f88629b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88629b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88633f++;
            this.f88629b.onNext(t);
        }
    }

    public C23692Y(AbstractC24490k<T> abstractC24490k, long j) {
        super(abstractC24490k);
        this.f88628d = j;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24462f c24462f = new C24462f(false);
        interfaceC42141hT5.mo31867a(c24462f);
        long j = this.f88628d;
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j - 1;
        }
        new C23693a(interfaceC42141hT5, j2, c24462f, this.f88638c).m32854b();
    }
}
