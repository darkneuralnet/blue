package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.fuseable.InterfaceC23547b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.plugins.C24508a;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.E */
/* loaded from: classes6.dex */
public final class C23647E<T> extends AbstractC23461c implements InterfaceC23547b<T> {

    /* renamed from: b */
    public final AbstractC24490k<T> f88475b;

    /* renamed from: io.reactivex.internal.operators.flowable.E$a */
    /* loaded from: classes6.dex */
    public static final class C23648a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f88476b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88477c;

        public C23648a(InterfaceC23476f interfaceC23476f) {
            this.f88476b = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88477c, interfaceC46292oT5)) {
                this.f88477c = interfaceC46292oT5;
                this.f88476b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88477c.cancel();
            this.f88477c = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88477c == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88477c = EnumC24463g.CANCELLED;
            this.f88476b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88477c = EnumC24463g.CANCELLED;
            this.f88476b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
        }
    }

    public C23647E(AbstractC24490k<T> abstractC24490k) {
        this.f88475b = abstractC24490k;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88475b.m32166W0(new C23648a(interfaceC23476f));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23547b
    /* renamed from: d */
    public AbstractC24490k<T> mo32773d() {
        return C24508a.m31996m(new C23645D(this.f88475b));
    }
}
