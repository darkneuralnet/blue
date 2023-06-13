package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.N */
/* loaded from: classes6.dex */
public final class C23667N<T> extends AbstractC23695a<T, T> implements InterfaceC23484g<T> {

    /* renamed from: d */
    public final InterfaceC23484g<? super T> f88544d;

    /* renamed from: io.reactivex.internal.operators.flowable.N$a */
    /* loaded from: classes6.dex */
    public static final class C23668a<T> extends AtomicLong implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88545b;

        /* renamed from: c */
        public final InterfaceC23484g<? super T> f88546c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88547d;

        /* renamed from: e */
        public boolean f88548e;

        public C23668a(InterfaceC42141hT5<? super T> interfaceC42141hT5, InterfaceC23484g<? super T> interfaceC23484g) {
            this.f88545b = interfaceC42141hT5;
            this.f88546c = interfaceC23484g;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88547d, interfaceC46292oT5)) {
                this.f88547d = interfaceC46292oT5;
                this.f88545b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88547d.cancel();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this, j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            if (this.f88548e) {
                return;
            }
            this.f88548e = true;
            this.f88545b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            if (this.f88548e) {
                C24508a.m31988u(th);
                return;
            }
            this.f88548e = true;
            this.f88545b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f88548e) {
                return;
            }
            if (get() != 0) {
                this.f88545b.onNext(t);
                C24468d.m32271d(this, 1L);
                return;
            }
            try {
                this.f88546c.accept(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                cancel();
                onError(th);
            }
        }
    }

    public C23667N(AbstractC24490k<T> abstractC24490k) {
        super(abstractC24490k);
        this.f88544d = this;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23668a(interfaceC42141hT5, this.f88544d));
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    public void accept(T t) {
    }
}
