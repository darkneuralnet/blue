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
/* renamed from: io.reactivex.internal.operators.flowable.n */
/* loaded from: classes6.dex */
public final class C23778n<T> extends AbstractC24507p<T> implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f88912b;

    /* renamed from: c */
    public final long f88913c;

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    /* loaded from: classes6.dex */
    public static final class C23779a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f88914b;

        /* renamed from: c */
        public final long f88915c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88916d;

        /* renamed from: e */
        public long f88917e;

        /* renamed from: f */
        public boolean f88918f;

        public C23779a(InterfaceC24541s<? super T> interfaceC24541s, long j) {
            this.f88914b = interfaceC24541s;
            this.f88915c = j;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88916d, interfaceC46292oT5)) {
                this.f88916d = interfaceC46292oT5;
                this.f88914b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88916d.cancel();
            this.f88916d = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88916d == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88916d = EnumC24463g.CANCELLED;
            if (!this.f88918f) {
                this.f88918f = true;
                this.f88914b.onComplete();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88918f) {
                C24508a.m31988u(th);
                return;
            }
            this.f88918f = true;
            this.f88916d = EnumC24463g.CANCELLED;
            this.f88914b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88918f) {
                return;
            }
            long j = this.f88917e;
            if (j == this.f88915c) {
                this.f88918f = true;
                this.f88916d.cancel();
                this.f88916d = EnumC24463g.CANCELLED;
                this.f88914b.onSuccess(t);
                return;
            }
            this.f88917e = j + 1;
        }
    }

    public C23778n(AbstractC24490k<T> abstractC24490k, long j) {
        this.f88912b = abstractC24490k;
        this.f88913c = j;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f88912b.m32166W0(new C23779a(interfaceC24541s, this.f88913c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23773m(this.f88912b, this.f88913c, null, false));
    }
}
