package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.completable.m */
/* loaded from: classes6.dex */
public final class C23612m<T> extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC45761na4<T> f88409b;

    /* renamed from: io.reactivex.internal.operators.completable.m$a */
    /* loaded from: classes6.dex */
    public static final class C23613a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f88410b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88411c;

        public C23613a(InterfaceC23476f interfaceC23476f) {
            this.f88410b = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88411c, interfaceC46292oT5)) {
                this.f88411c = interfaceC46292oT5;
                this.f88410b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88411c.cancel();
            this.f88411c = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88411c == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88410b.onComplete();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88410b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
        }
    }

    public C23612m(InterfaceC45761na4<T> interfaceC45761na4) {
        this.f88409b = interfaceC45761na4;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88409b.mo23497c(new C23613a(interfaceC23476f));
    }
}
