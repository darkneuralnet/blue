package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.h */
/* loaded from: classes6.dex */
public final class C24190h<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T>[] f90219b;

    /* renamed from: c */
    public final Iterable<? extends InterfaceC23434B<? extends T>> f90220c;

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    /* loaded from: classes6.dex */
    public static final class C24191a<T> implements InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90221b;

        /* renamed from: c */
        public final C24192b<T>[] f90222c;

        /* renamed from: d */
        public final AtomicInteger f90223d = new AtomicInteger();

        public C24191a(InterfaceC23436D<? super T> interfaceC23436D, int i) {
            this.f90221b = interfaceC23436D;
            this.f90222c = new C24192b[i];
        }

        /* renamed from: a */
        public void m32510a(InterfaceC23434B<? extends T>[] interfaceC23434BArr) {
            C24192b<T>[] c24192bArr = this.f90222c;
            int length = c24192bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                c24192bArr[i] = new C24192b<>(this, i2, this.f90221b);
                i = i2;
            }
            this.f90223d.lazySet(0);
            this.f90221b.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.f90223d.get() == 0; i3++) {
                interfaceC23434BArr[i3].subscribe(c24192bArr[i3]);
            }
        }

        /* renamed from: b */
        public boolean m32509b(int i) {
            int i2 = this.f90223d.get();
            int i3 = 0;
            if (i2 == 0) {
                if (!this.f90223d.compareAndSet(0, i)) {
                    return false;
                }
                C24192b<T>[] c24192bArr = this.f90222c;
                int length = c24192bArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        c24192bArr[i3].m32508a();
                    }
                    i3 = i4;
                }
                return true;
            } else if (i2 == i) {
                return true;
            } else {
                return false;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f90223d.get() != -1) {
                this.f90223d.lazySet(-1);
                for (C24192b<T> c24192b : this.f90222c) {
                    c24192b.m32508a();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90223d.get() == -1;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.h$b */
    /* loaded from: classes6.dex */
    public static final class C24192b<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -1185974347409665484L;

        /* renamed from: b */
        public final C24191a<T> f90224b;

        /* renamed from: c */
        public final int f90225c;

        /* renamed from: d */
        public final InterfaceC23436D<? super T> f90226d;

        /* renamed from: e */
        public boolean f90227e;

        public C24192b(C24191a<T> c24191a, int i, InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90224b = c24191a;
            this.f90225c = i;
            this.f90226d = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32508a() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90227e) {
                this.f90226d.onComplete();
            } else if (this.f90224b.m32509b(this.f90225c)) {
                this.f90227e = true;
                this.f90226d.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90227e) {
                this.f90226d.onError(th);
            } else if (this.f90224b.m32509b(this.f90225c)) {
                this.f90227e = true;
                this.f90226d.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90227e) {
                this.f90226d.onNext(t);
            } else if (this.f90224b.m32509b(this.f90225c)) {
                this.f90227e = true;
                this.f90226d.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    public C24190h(InterfaceC23434B<? extends T>[] interfaceC23434BArr, Iterable<? extends InterfaceC23434B<? extends T>> iterable) {
        this.f90219b = interfaceC23434BArr;
        this.f90220c = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        int length;
        InterfaceC23434B<? extends T>[] interfaceC23434BArr = this.f90219b;
        if (interfaceC23434BArr == null) {
            interfaceC23434BArr = new InterfaceC23434B[8];
            try {
                length = 0;
                for (InterfaceC23434B<? extends T> interfaceC23434B : this.f90220c) {
                    if (interfaceC23434B == null) {
                        EnumC23502e.m32987i(new NullPointerException("One of the sources is null"), interfaceC23436D);
                        return;
                    }
                    if (length == interfaceC23434BArr.length) {
                        InterfaceC23434B<? extends T>[] interfaceC23434BArr2 = new InterfaceC23434B[(length >> 2) + length];
                        System.arraycopy(interfaceC23434BArr, 0, interfaceC23434BArr2, 0, length);
                        interfaceC23434BArr = interfaceC23434BArr2;
                    }
                    int i = length + 1;
                    interfaceC23434BArr[length] = interfaceC23434B;
                    length = i;
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
                return;
            }
        } else {
            length = interfaceC23434BArr.length;
        }
        if (length == 0) {
            EnumC23502e.m32990d(interfaceC23436D);
        } else if (length == 1) {
            interfaceC23434BArr[0].subscribe(interfaceC23436D);
        } else {
            new C24191a(interfaceC23436D, length).m32510a(interfaceC23434BArr);
        }
    }
}
