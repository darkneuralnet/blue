package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.j0 */
/* loaded from: classes6.dex */
public final class C23761j0<T> extends AbstractC23442F<T> implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f88840b;

    /* renamed from: c */
    public final T f88841c;

    /* renamed from: io.reactivex.internal.operators.flowable.j0$a */
    /* loaded from: classes6.dex */
    public static final class C23762a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f88842b;

        /* renamed from: c */
        public final T f88843c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88844d;

        /* renamed from: e */
        public boolean f88845e;

        /* renamed from: f */
        public T f88846f;

        public C23762a(InterfaceC23445I<? super T> interfaceC23445I, T t) {
            this.f88842b = interfaceC23445I;
            this.f88843c = t;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88844d, interfaceC46292oT5)) {
                this.f88844d = interfaceC46292oT5;
                this.f88842b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88844d.cancel();
            this.f88844d = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88844d == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88845e) {
                return;
            }
            this.f88845e = true;
            this.f88844d = EnumC24463g.CANCELLED;
            T t = this.f88846f;
            this.f88846f = null;
            if (t == null) {
                t = this.f88843c;
            }
            if (t != null) {
                this.f88842b.onSuccess(t);
            } else {
                this.f88842b.onError(new NoSuchElementException());
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88845e) {
                C24508a.m31988u(th);
                return;
            }
            this.f88845e = true;
            this.f88844d = EnumC24463g.CANCELLED;
            this.f88842b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88845e) {
                return;
            }
            if (this.f88846f != null) {
                this.f88845e = true;
                this.f88844d.cancel();
                this.f88844d = EnumC24463g.CANCELLED;
                this.f88842b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f88846f = t;
        }
    }

    public C23761j0(AbstractC24490k<T> abstractC24490k, T t) {
        this.f88840b = abstractC24490k;
        this.f88841c = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f88840b.m32166W0(new C23762a(interfaceC23445I, this.f88841c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23751h0(this.f88840b, this.f88841c, true));
    }
}
