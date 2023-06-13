package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
/* renamed from: io.reactivex.internal.operators.maybe.i */
/* loaded from: classes6.dex */
public final class C23883i<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89234b;

    /* renamed from: c */
    public final InterfaceC23478a f89235c;

    /* renamed from: io.reactivex.internal.operators.maybe.i$a */
    /* loaded from: classes6.dex */
    public final class C23884a implements InterfaceC24541s<T> {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89236b;

        public C23884a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89236b = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            try {
                C23883i.this.f89235c.run();
                this.f89236b.onComplete();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89236b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            try {
                C23883i.this.f89235c.run();
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f89236b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89236b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                C23883i.this.f89235c.run();
                this.f89236b.onSuccess(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89236b.onError(th);
            }
        }
    }

    public C23883i(InterfaceC24574u<T> interfaceC24574u, InterfaceC23478a interfaceC23478a) {
        this.f89234b = interfaceC24574u;
        this.f89235c = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89234b.mo31865a(new C23884a(interfaceC24541s));
    }
}
