package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.subscribers.C24572a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.v0 */
/* loaded from: classes6.dex */
public final class C23816v0<T, U, R> extends AbstractC23695a<T, R> {

    /* renamed from: d */
    public final InterfaceC23480c<? super T, ? super U, ? extends R> f89061d;

    /* renamed from: e */
    public final InterfaceC45761na4<? extends U> f89062e;

    /* renamed from: io.reactivex.internal.operators.flowable.v0$a */
    /* loaded from: classes6.dex */
    public final class C23817a implements InterfaceC24494o<U> {

        /* renamed from: b */
        public final C23818b<T, U, R> f89063b;

        public C23817a(C23818b<T, U, R> c23818b) {
            this.f89063b = c23818b;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (this.f89063b.m32762c(interfaceC46292oT5)) {
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89063b.m32763b(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(U u) {
            this.f89063b.lazySet(u);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.v0$b */
    /* loaded from: classes6.dex */
    public static final class C23818b<T, U, R> extends AtomicReference<U> implements InterfaceC23546a<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89065b;

        /* renamed from: c */
        public final InterfaceC23480c<? super T, ? super U, ? extends R> f89066c;

        /* renamed from: d */
        public final AtomicReference<InterfaceC46292oT5> f89067d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicLong f89068e = new AtomicLong();

        /* renamed from: f */
        public final AtomicReference<InterfaceC46292oT5> f89069f = new AtomicReference<>();

        public C23818b(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c) {
            this.f89065b = interfaceC42141hT5;
            this.f89066c = interfaceC23480c;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            EnumC24463g.m32292c(this.f89067d, this.f89068e, interfaceC46292oT5);
        }

        /* renamed from: b */
        public void m32763b(Throwable th) {
            EnumC24463g.m32294a(this.f89067d);
            this.f89065b.onError(th);
        }

        /* renamed from: c */
        public boolean m32762c(InterfaceC46292oT5 interfaceC46292oT5) {
            return EnumC24463g.m32289f(this.f89069f, interfaceC46292oT5);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC24463g.m32294a(this.f89067d);
            EnumC24463g.m32294a(this.f89069f);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23546a
        /* renamed from: h */
        public boolean mo32761h(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.f89065b.onNext(C23544b.m32923e(this.f89066c.apply(t, u), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    cancel();
                    this.f89065b.onError(th);
                }
            }
            return false;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            EnumC24463g.m32293b(this.f89067d, this.f89068e, j);
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            EnumC24463g.m32294a(this.f89069f);
            this.f89065b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            EnumC24463g.m32294a(this.f89069f);
            this.f89065b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!mo32761h(t)) {
                this.f89067d.get().mo21023o(1L);
            }
        }
    }

    public C23816v0(AbstractC24490k<T> abstractC24490k, InterfaceC23480c<? super T, ? super U, ? extends R> interfaceC23480c, InterfaceC45761na4<? extends U> interfaceC45761na4) {
        super(abstractC24490k);
        this.f89061d = interfaceC23480c;
        this.f89062e = interfaceC45761na4;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        C24572a c24572a = new C24572a(interfaceC42141hT5);
        C23818b c23818b = new C23818b(c24572a, this.f89061d);
        c24572a.mo31867a(c23818b);
        this.f89062e.mo23497c(new C23817a(c23818b));
        this.f88638c.m32166W0(c23818b);
    }
}
