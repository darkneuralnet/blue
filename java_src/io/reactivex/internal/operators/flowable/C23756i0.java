package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24494o;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.i0 */
/* loaded from: classes6.dex */
public final class C23756i0<T> extends AbstractC24507p<T> implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f88824b;

    /* renamed from: io.reactivex.internal.operators.flowable.i0$a */
    /* loaded from: classes6.dex */
    public static final class C23757a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f88825b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88826c;

        /* renamed from: d */
        public boolean f88827d;

        /* renamed from: e */
        public T f88828e;

        public C23757a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f88825b = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88826c, interfaceC46292oT5)) {
                this.f88826c = interfaceC46292oT5;
                this.f88825b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88826c.cancel();
            this.f88826c = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88826c == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88827d) {
                return;
            }
            this.f88827d = true;
            this.f88826c = EnumC24463g.CANCELLED;
            T t = this.f88828e;
            this.f88828e = null;
            if (t == null) {
                this.f88825b.onComplete();
            } else {
                this.f88825b.onSuccess(t);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88827d) {
                C24508a.m31988u(th);
                return;
            }
            this.f88827d = true;
            this.f88826c = EnumC24463g.CANCELLED;
            this.f88825b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88827d) {
                return;
            }
            if (this.f88828e != null) {
                this.f88827d = true;
                this.f88826c.cancel();
                this.f88826c = EnumC24463g.CANCELLED;
                this.f88825b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f88828e = t;
        }
    }

    public C23756i0(AbstractC24490k<T> abstractC24490k) {
        this.f88824b = abstractC24490k;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f88824b.m32166W0(new C23757a(interfaceC24541s));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23751h0(this.f88824b, null, false));
    }
}
