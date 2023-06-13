package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23548c;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.maybe.x */
/* loaded from: classes6.dex */
public final class C23914x<T> extends AbstractC23461c implements InterfaceC23548c<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89291b;

    /* renamed from: io.reactivex.internal.operators.maybe.x$a */
    /* loaded from: classes6.dex */
    public static final class C23915a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f89292b;

        /* renamed from: c */
        public InterfaceC23465c f89293c;

        public C23915a(InterfaceC23476f interfaceC23476f) {
            this.f89292b = interfaceC23476f;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89293c.dispose();
            this.f89293c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89293c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89293c = EnumC23501d.DISPOSED;
            this.f89292b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89293c = EnumC23501d.DISPOSED;
            this.f89292b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89293c, interfaceC23465c)) {
                this.f89293c = interfaceC23465c;
                this.f89292b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89293c = EnumC23501d.DISPOSED;
            this.f89292b.onComplete();
        }
    }

    public C23914x(InterfaceC24574u<T> interfaceC24574u) {
        this.f89291b = interfaceC24574u;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f89291b.mo31865a(new C23915a(interfaceC23476f));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23548c
    /* renamed from: a */
    public AbstractC24507p<T> mo32730a() {
        return C24508a.m31995n(new C23912w(this.f89291b));
    }
}
