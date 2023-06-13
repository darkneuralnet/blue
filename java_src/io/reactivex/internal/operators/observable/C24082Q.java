package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.observable.Q */
/* loaded from: classes6.dex */
public final class C24082Q<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f89884c;

    /* renamed from: d */
    public final T f89885d;

    /* renamed from: e */
    public final boolean f89886e;

    /* renamed from: io.reactivex.internal.operators.observable.Q$a */
    /* loaded from: classes6.dex */
    public static final class C24083a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89887b;

        /* renamed from: c */
        public final long f89888c;

        /* renamed from: d */
        public final T f89889d;

        /* renamed from: e */
        public final boolean f89890e;

        /* renamed from: f */
        public InterfaceC23465c f89891f;

        /* renamed from: g */
        public long f89892g;

        /* renamed from: h */
        public boolean f89893h;

        public C24083a(InterfaceC23436D<? super T> interfaceC23436D, long j, T t, boolean z) {
            this.f89887b = interfaceC23436D;
            this.f89888c = j;
            this.f89889d = t;
            this.f89890e = z;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89891f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89891f.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f89893h) {
                this.f89893h = true;
                T t = this.f89889d;
                if (t == null && this.f89890e) {
                    this.f89887b.onError(new NoSuchElementException());
                    return;
                }
                if (t != null) {
                    this.f89887b.onNext(t);
                }
                this.f89887b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89893h) {
                C24508a.m31988u(th);
                return;
            }
            this.f89893h = true;
            this.f89887b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89893h) {
                return;
            }
            long j = this.f89892g;
            if (j == this.f89888c) {
                this.f89893h = true;
                this.f89891f.dispose();
                this.f89887b.onNext(t);
                this.f89887b.onComplete();
                return;
            }
            this.f89892g = j + 1;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89891f, interfaceC23465c)) {
                this.f89891f = interfaceC23465c;
                this.f89887b.onSubscribe(this);
            }
        }
    }

    public C24082Q(InterfaceC23434B<T> interfaceC23434B, long j, T t, boolean z) {
        super(interfaceC23434B);
        this.f89884c = j;
        this.f89885d = t;
        this.f89886e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24083a(interfaceC23436D, this.f89884c, this.f89885d, this.f89886e));
    }
}
