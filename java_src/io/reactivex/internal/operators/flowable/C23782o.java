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
/* renamed from: io.reactivex.internal.operators.flowable.o */
/* loaded from: classes6.dex */
public final class C23782o<T> extends AbstractC23442F<T> implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f88925b;

    /* renamed from: c */
    public final long f88926c;

    /* renamed from: d */
    public final T f88927d;

    /* renamed from: io.reactivex.internal.operators.flowable.o$a */
    /* loaded from: classes6.dex */
    public static final class C23783a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f88928b;

        /* renamed from: c */
        public final long f88929c;

        /* renamed from: d */
        public final T f88930d;

        /* renamed from: e */
        public InterfaceC46292oT5 f88931e;

        /* renamed from: f */
        public long f88932f;

        /* renamed from: g */
        public boolean f88933g;

        public C23783a(InterfaceC23445I<? super T> interfaceC23445I, long j, T t) {
            this.f88928b = interfaceC23445I;
            this.f88929c = j;
            this.f88930d = t;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88931e, interfaceC46292oT5)) {
                this.f88931e = interfaceC46292oT5;
                this.f88928b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88931e.cancel();
            this.f88931e = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88931e == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88931e = EnumC24463g.CANCELLED;
            if (!this.f88933g) {
                this.f88933g = true;
                T t = this.f88930d;
                if (t != null) {
                    this.f88928b.onSuccess(t);
                } else {
                    this.f88928b.onError(new NoSuchElementException());
                }
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88933g) {
                C24508a.m31988u(th);
                return;
            }
            this.f88933g = true;
            this.f88931e = EnumC24463g.CANCELLED;
            this.f88928b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88933g) {
                return;
            }
            long j = this.f88932f;
            if (j == this.f88929c) {
                this.f88933g = true;
                this.f88931e.cancel();
                this.f88931e = EnumC24463g.CANCELLED;
                this.f88928b.onSuccess(t);
                return;
            }
            this.f88932f = j + 1;
        }
    }

    public C23782o(AbstractC24490k<T> abstractC24490k, long j, T t) {
        this.f88925b = abstractC24490k;
        this.f88926c = j;
        this.f88927d = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f88925b.m32166W0(new C23783a(interfaceC23445I, this.f88926c, this.f88927d));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23773m(this.f88925b, this.f88926c, this.f88927d, true));
    }
}
