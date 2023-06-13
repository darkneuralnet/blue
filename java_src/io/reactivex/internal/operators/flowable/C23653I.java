package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.I */
/* loaded from: classes6.dex */
public final class C23653I<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC45761na4<T> f88488b;

    /* renamed from: c */
    public final T f88489c;

    /* renamed from: io.reactivex.internal.operators.flowable.I$a */
    /* loaded from: classes6.dex */
    public static final class C23654a<T> implements InterfaceC24494o<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f88490b;

        /* renamed from: c */
        public final T f88491c;

        /* renamed from: d */
        public InterfaceC46292oT5 f88492d;

        /* renamed from: e */
        public T f88493e;

        public C23654a(InterfaceC23445I<? super T> interfaceC23445I, T t) {
            this.f88490b = interfaceC23445I;
            this.f88491c = t;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88492d, interfaceC46292oT5)) {
                this.f88492d = interfaceC46292oT5;
                this.f88490b.onSubscribe(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88492d.cancel();
            this.f88492d = EnumC24463g.CANCELLED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88492d == EnumC24463g.CANCELLED;
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88492d = EnumC24463g.CANCELLED;
            T t = this.f88493e;
            if (t != null) {
                this.f88493e = null;
                this.f88490b.onSuccess(t);
                return;
            }
            T t2 = this.f88491c;
            if (t2 != null) {
                this.f88490b.onSuccess(t2);
            } else {
                this.f88490b.onError(new NoSuchElementException());
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88492d = EnumC24463g.CANCELLED;
            this.f88493e = null;
            this.f88490b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88493e = t;
        }
    }

    public C23653I(InterfaceC45761na4<T> interfaceC45761na4, T t) {
        this.f88488b = interfaceC45761na4;
        this.f88489c = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f88488b.mo23497c(new C23654a(interfaceC23445I, this.f88489c));
    }
}
