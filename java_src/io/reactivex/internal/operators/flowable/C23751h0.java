package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.C24459c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.h0 */
/* loaded from: classes6.dex */
public final class C23751h0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final T f88815d;

    /* renamed from: e */
    public final boolean f88816e;

    /* renamed from: io.reactivex.internal.operators.flowable.h0$a */
    /* loaded from: classes6.dex */
    public static final class C23752a<T> extends C24459c<T> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -5526049321428043809L;

        /* renamed from: d */
        public final T f88817d;

        /* renamed from: e */
        public final boolean f88818e;

        /* renamed from: f */
        public InterfaceC46292oT5 f88819f;

        /* renamed from: g */
        public boolean f88820g;

        public C23752a(InterfaceC42141hT5<? super T> interfaceC42141hT5, T t, boolean z) {
            super(interfaceC42141hT5);
            this.f88817d = t;
            this.f88818e = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88819f, interfaceC46292oT5)) {
                this.f88819f = interfaceC46292oT5;
                this.f91047b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.C24459c, p000.InterfaceC46292oT5
        public void cancel() {
            super.cancel();
            this.f88819f.cancel();
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88820g) {
                return;
            }
            this.f88820g = true;
            T t = this.f91048c;
            this.f91048c = null;
            if (t == null) {
                t = this.f88817d;
            }
            if (t == null) {
                if (this.f88818e) {
                    this.f91047b.onError(new NoSuchElementException());
                    return;
                } else {
                    this.f91047b.onComplete();
                    return;
                }
            }
            m32302c(t);
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88820g) {
                C24508a.m31988u(th);
                return;
            }
            this.f88820g = true;
            this.f91047b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88820g) {
                return;
            }
            if (this.f91048c != null) {
                this.f88820g = true;
                this.f88819f.cancel();
                this.f91047b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f91048c = t;
        }
    }

    public C23751h0(AbstractC24490k<T> abstractC24490k, T t, boolean z) {
        super(abstractC24490k);
        this.f88815d = t;
        this.f88816e = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23752a(interfaceC42141hT5, this.f88815d, this.f88816e));
    }
}
