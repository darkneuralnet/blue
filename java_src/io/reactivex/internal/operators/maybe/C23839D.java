package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
/* renamed from: io.reactivex.internal.operators.maybe.D */
/* loaded from: classes6.dex */
public final class C23839D<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends T> f89147c;

    /* renamed from: io.reactivex.internal.operators.maybe.D$a */
    /* loaded from: classes6.dex */
    public static final class C23840a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89148b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends T> f89149c;

        /* renamed from: d */
        public InterfaceC23465c f89150d;

        public C23840a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
            this.f89148b = interfaceC24541s;
            this.f89149c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89150d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89150d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89148b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            try {
                this.f89148b.onSuccess(C23544b.m32923e(this.f89149c.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89148b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89150d, interfaceC23465c)) {
                this.f89150d = interfaceC23465c;
                this.f89148b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89148b.onSuccess(t);
        }
    }

    public C23839D(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        super(interfaceC24574u);
        this.f89147c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23840a(interfaceC24541s, this.f89147c));
    }
}
