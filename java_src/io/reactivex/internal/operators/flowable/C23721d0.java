package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.subscriptions.C24462f;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.d0 */
/* loaded from: classes6.dex */
public final class C23721d0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23494q<? super Throwable> f88747d;

    /* renamed from: e */
    public final long f88748e;

    /* renamed from: io.reactivex.internal.operators.flowable.d0$a */
    /* loaded from: classes6.dex */
    public static final class C23722a<T> extends AtomicInteger implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88749b;

        /* renamed from: c */
        public final C24462f f88750c;

        /* renamed from: d */
        public final InterfaceC45761na4<? extends T> f88751d;

        /* renamed from: e */
        public final InterfaceC23494q<? super Throwable> f88752e;

        /* renamed from: f */
        public long f88753f;

        /* renamed from: g */
        public long f88754g;

        public C23722a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, InterfaceC23494q<? super Throwable> interfaceC23494q, C24462f c24462f, InterfaceC45761na4<? extends T> interfaceC45761na4) {
            this.f88749b = interfaceC42141hT5;
            this.f88750c = c24462f;
            this.f88751d = interfaceC45761na4;
            this.f88752e = interfaceC23494q;
            this.f88753f = j;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f88750c.m32295f(interfaceC46292oT5);
        }

        /* renamed from: b */
        public void m32813b() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f88750c.m32297d()) {
                    long j = this.f88754g;
                    if (j != 0) {
                        this.f88754g = 0L;
                        this.f88750c.m32296e(j);
                    }
                    this.f88751d.mo23497c(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88749b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            long j = this.f88753f;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.f88753f = j - 1;
            }
            if (j == 0) {
                this.f88749b.onError(th);
                return;
            }
            try {
                if (!this.f88752e.test(th)) {
                    this.f88749b.onError(th);
                } else {
                    m32813b();
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f88749b.onError(new CompositeException(th, th2));
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88754g++;
            this.f88749b.onNext(t);
        }
    }

    public C23721d0(AbstractC24490k<T> abstractC24490k, long j, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        super(abstractC24490k);
        this.f88747d = interfaceC23494q;
        this.f88748e = j;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24462f c24462f = new C24462f(false);
        interfaceC42141hT5.mo31867a(c24462f);
        new C23722a(interfaceC42141hT5, this.f88748e, this.f88747d, c24462f, this.f88638c).m32813b();
    }
}
