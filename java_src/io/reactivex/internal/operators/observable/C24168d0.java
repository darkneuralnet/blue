package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23558c;
/* renamed from: io.reactivex.internal.operators.observable.d0 */
/* loaded from: classes6.dex */
public final class C24168d0<T> extends Observable<T> {

    /* renamed from: b */
    public final T[] f90140b;

    /* renamed from: io.reactivex.internal.operators.observable.d0$a */
    /* loaded from: classes6.dex */
    public static final class C24169a<T> extends AbstractC23558c<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90141b;

        /* renamed from: c */
        public final T[] f90142c;

        /* renamed from: d */
        public int f90143d;

        /* renamed from: e */
        public boolean f90144e;

        /* renamed from: f */
        public volatile boolean f90145f;

        public C24169a(InterfaceC23436D<? super T> interfaceC23436D, T[] tArr) {
            this.f90141b = interfaceC23436D;
            this.f90142c = tArr;
        }

        /* renamed from: a */
        public void m32524a() {
            T[] tArr = this.f90142c;
            int length = tArr.length;
            for (int i = 0; i < length && !mo1769e(); i++) {
                T t = tArr[i];
                if (t == null) {
                    InterfaceC23436D<? super T> interfaceC23436D = this.f90141b;
                    interfaceC23436D.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f90141b.onNext(t);
            }
            if (!mo1769e()) {
                this.f90141b.onComplete();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 1) != 0) {
                this.f90144e = true;
                return 1;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f90143d = this.f90142c.length;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90145f = true;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90145f;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f90143d == this.f90142c.length;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() {
            int i = this.f90143d;
            T[] tArr = this.f90142c;
            if (i != tArr.length) {
                this.f90143d = i + 1;
                return (T) C23544b.m32923e(tArr[i], "The array element is null");
            }
            return null;
        }
    }

    public C24168d0(T[] tArr) {
        this.f90140b = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24169a c24169a = new C24169a(interfaceC23436D, this.f90140b);
        interfaceC23436D.onSubscribe(c24169a);
        if (c24169a.f90144e) {
            return;
        }
        c24169a.m32524a();
    }
}
