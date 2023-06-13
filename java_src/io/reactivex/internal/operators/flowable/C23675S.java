package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscribers.AbstractC24455j;
/* renamed from: io.reactivex.internal.operators.flowable.S */
/* loaded from: classes6.dex */
public final class C23675S<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final InterfaceC23492o<? super Throwable, ? extends T> f88567d;

    /* renamed from: io.reactivex.internal.operators.flowable.S$a */
    /* loaded from: classes6.dex */
    public static final class C23676a<T> extends AbstractC24455j<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* renamed from: f */
        public final InterfaceC23492o<? super Throwable, ? extends T> f88568f;

        public C23676a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
            super(interfaceC42141hT5);
            this.f88568f = interfaceC23492o;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f91037b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            try {
                m32304b(C23544b.m32923e(this.f88568f.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f91037b.onError(new CompositeException(th, th2));
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f91040e++;
            this.f91037b.onNext(t);
        }
    }

    public C23675S(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        super(abstractC24490k);
        this.f88567d = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23676a(interfaceC42141hT5, this.f88567d));
    }
}
