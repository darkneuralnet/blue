package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24541s;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.S */
/* loaded from: classes6.dex */
public final class C24090S<T> extends AbstractC24507p<T> implements InterfaceC23549d<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89916b;

    /* renamed from: c */
    public final long f89917c;

    /* renamed from: io.reactivex.internal.operators.observable.S$a */
    /* loaded from: classes6.dex */
    public static final class C24091a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89918b;

        /* renamed from: c */
        public final long f89919c;

        /* renamed from: d */
        public InterfaceC23465c f89920d;

        /* renamed from: e */
        public long f89921e;

        /* renamed from: f */
        public boolean f89922f;

        public C24091a(InterfaceC24541s<? super T> interfaceC24541s, long j) {
            this.f89918b = interfaceC24541s;
            this.f89919c = j;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89920d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89920d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f89922f) {
                this.f89922f = true;
                this.f89918b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89922f) {
                C24508a.m31988u(th);
                return;
            }
            this.f89922f = true;
            this.f89918b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89922f) {
                return;
            }
            long j = this.f89921e;
            if (j == this.f89919c) {
                this.f89922f = true;
                this.f89920d.dispose();
                this.f89918b.onSuccess(t);
                return;
            }
            this.f89921e = j + 1;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89920d, interfaceC23465c)) {
                this.f89920d = interfaceC23465c;
                this.f89918b.onSubscribe(this);
            }
        }
    }

    public C24090S(InterfaceC23434B<T> interfaceC23434B, long j) {
        this.f89916b = interfaceC23434B;
        this.f89917c = j;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89916b.subscribe(new C24091a(interfaceC24541s, this.f89917c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<T> mo32427c() {
        return C24508a.m31994o(new C24082Q(this.f89916b, this.f89917c, null, false));
    }
}
