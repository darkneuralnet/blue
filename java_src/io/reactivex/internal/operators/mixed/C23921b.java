package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.b */
/* loaded from: classes6.dex */
public final class C23921b<R> extends AbstractC24490k<R> {

    /* renamed from: c */
    public final InterfaceC23496h f89303c;

    /* renamed from: d */
    public final InterfaceC45761na4<? extends R> f89304d;

    /* renamed from: io.reactivex.internal.operators.mixed.b$a */
    /* loaded from: classes6.dex */
    public static final class C23922a<R> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<R>, InterfaceC23476f, InterfaceC46292oT5 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89305b;

        /* renamed from: c */
        public InterfaceC45761na4<? extends R> f89306c;

        /* renamed from: d */
        public InterfaceC23465c f89307d;

        /* renamed from: e */
        public final AtomicLong f89308e = new AtomicLong();

        public C23922a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC45761na4<? extends R> interfaceC45761na4) {
            this.f89305b = interfaceC42141hT5;
            this.f89306c = interfaceC45761na4;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            EnumC24463g.m32292c(this, this.f89308e, interfaceC46292oT5);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89307d.dispose();
            EnumC24463g.m32294a(this);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            EnumC24463g.m32293b(this, this.f89308e, j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            InterfaceC45761na4<? extends R> interfaceC45761na4 = this.f89306c;
            if (interfaceC45761na4 == null) {
                this.f89305b.onComplete();
                return;
            }
            this.f89306c = null;
            interfaceC45761na4.mo23497c(this);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89305b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(R r) {
            this.f89305b.onNext(r);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89307d, interfaceC23465c)) {
                this.f89307d = interfaceC23465c;
                this.f89305b.mo31867a(this);
            }
        }
    }

    public C23921b(InterfaceC23496h interfaceC23496h, InterfaceC45761na4<? extends R> interfaceC45761na4) {
        this.f89303c = interfaceC23496h;
        this.f89304d = interfaceC45761na4;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f89303c.mo33003g(new C23922a(interfaceC42141hT5, this.f89304d));
    }
}
