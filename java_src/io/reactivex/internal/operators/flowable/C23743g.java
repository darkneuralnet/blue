package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.g */
/* loaded from: classes6.dex */
public final class C23743g<T, U> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC45761na4<? extends T> f88796c;

    /* renamed from: d */
    public final InterfaceC45761na4<U> f88797d;

    /* renamed from: io.reactivex.internal.operators.flowable.g$a */
    /* loaded from: classes6.dex */
    public static final class C23744a<T> extends AtomicLong implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 2259811067697317255L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88798b;

        /* renamed from: c */
        public final InterfaceC45761na4<? extends T> f88799c;

        /* renamed from: d */
        public final C23744a<T>.C23745a f88800d = new C23745a();

        /* renamed from: e */
        public final AtomicReference<InterfaceC46292oT5> f88801e = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.flowable.g$a$a */
        /* loaded from: classes6.dex */
        public final class C23745a extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public C23745a() {
            }

            @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
            /* renamed from: a */
            public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
                if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
                    interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                }
            }

            @Override // p000.InterfaceC42141hT5
            public void onComplete() {
                if (get() != EnumC24463g.CANCELLED) {
                    C23744a.this.m32801b();
                }
            }

            @Override // p000.InterfaceC42141hT5
            public void onError(Throwable th) {
                if (get() != EnumC24463g.CANCELLED) {
                    C23744a.this.f88798b.onError(th);
                } else {
                    C24508a.m31988u(th);
                }
            }

            @Override // p000.InterfaceC42141hT5
            public void onNext(Object obj) {
                InterfaceC46292oT5 interfaceC46292oT5 = get();
                EnumC24463g enumC24463g = EnumC24463g.CANCELLED;
                if (interfaceC46292oT5 != enumC24463g) {
                    lazySet(enumC24463g);
                    interfaceC46292oT5.cancel();
                    C23744a.this.m32801b();
                }
            }
        }

        public C23744a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC45761na4<? extends T> interfaceC45761na4) {
            this.f88798b = interfaceC42141hT5;
            this.f88799c = interfaceC45761na4;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            EnumC24463g.m32292c(this.f88801e, this, interfaceC46292oT5);
        }

        /* renamed from: b */
        public void m32801b() {
            this.f88799c.mo23497c(this);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC24463g.m32294a(this.f88800d);
            EnumC24463g.m32294a(this.f88801e);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                EnumC24463g.m32293b(this.f88801e, this, j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88798b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88798b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88798b.onNext(t);
        }
    }

    public C23743g(InterfaceC45761na4<? extends T> interfaceC45761na4, InterfaceC45761na4<U> interfaceC45761na42) {
        this.f88796c = interfaceC45761na4;
        this.f88797d = interfaceC45761na42;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C23744a c23744a = new C23744a(interfaceC42141hT5, this.f88796c);
        interfaceC42141hT5.mo31867a(c23744a);
        this.f88797d.mo23497c(c23744a.f88800d);
    }
}
