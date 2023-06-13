package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.EnumC24466b;
import io.reactivex.plugins.C24508a;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.t0 */
/* loaded from: classes6.dex */
public final class C23805t0<T, U extends Collection<? super T>> extends AbstractC23442F<U> implements InterfaceC23547b<U> {

    /* renamed from: b */
    public final AbstractC24490k<T> f89023b;

    /* renamed from: c */
    public final Callable<U> f89024c;

    /* renamed from: io.reactivex.internal.operators.flowable.t0$a */
    /* loaded from: classes6.dex */
    public static final class C23806a<T, U extends Collection<? super T>> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super U> f89025b;

        /* renamed from: c */
        public InterfaceC46292oT5 f89026c;

        /* renamed from: d */
        public U f89027d;

        public C23806a(InterfaceC23445I<? super U> interfaceC23445I, U u) {
            this.f89025b = interfaceC23445I;
            this.f89027d = u;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89026c, interfaceC46292oT5)) {
                this.f89026c = interfaceC46292oT5;
                this.f89025b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89026c.cancel();
            this.f89026c = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89026c == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89026c = EnumC24463g.CANCELLED;
            this.f89025b.onSuccess(this.f89027d);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89027d = null;
            this.f89026c = EnumC24463g.CANCELLED;
            this.f89025b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f89027d.add(t);
        }
    }

    public C23805t0(AbstractC24490k<T> abstractC24490k) {
        this(abstractC24490k, EnumC24466b.m32279b());
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super U> interfaceC23445I) {
        try {
            this.f89023b.m32166W0(new C23806a(interfaceC23445I, (Collection) C23544b.m32923e(this.f89024c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<U> mo32773d() {
        return C24508a.m31996m(new C23800s0(this.f89023b, this.f89024c));
    }

    public C23805t0(AbstractC24490k<T> abstractC24490k, Callable<U> callable) {
        this.f89023b = abstractC24490k;
        this.f89024c = callable;
    }
}
