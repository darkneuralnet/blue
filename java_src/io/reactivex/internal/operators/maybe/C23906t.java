package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.t */
/* loaded from: classes6.dex */
public final class C23906t<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23496h f89281b;

    /* renamed from: io.reactivex.internal.operators.maybe.t$a */
    /* loaded from: classes6.dex */
    public static final class C23907a<T> implements InterfaceC23476f, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89282b;

        /* renamed from: c */
        public InterfaceC23465c f89283c;

        public C23907a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89282b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89283c.dispose();
            this.f89283c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89283c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f89283c = EnumC23501d.DISPOSED;
            this.f89282b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f89283c = EnumC23501d.DISPOSED;
            this.f89282b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89283c, interfaceC23465c)) {
                this.f89283c = interfaceC23465c;
                this.f89282b.onSubscribe(this);
            }
        }
    }

    public C23906t(InterfaceC23496h interfaceC23496h) {
        this.f89281b = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89281b.mo33003g(new C23907a(interfaceC24541s));
    }
}
