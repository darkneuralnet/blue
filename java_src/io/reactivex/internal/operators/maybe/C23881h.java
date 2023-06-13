package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.h */
/* loaded from: classes6.dex */
public final class C23881h<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23479b<? super T, ? super Throwable> f89230c;

    /* renamed from: io.reactivex.internal.operators.maybe.h$a */
    /* loaded from: classes6.dex */
    public static final class C23882a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89231b;

        /* renamed from: c */
        public final InterfaceC23479b<? super T, ? super Throwable> f89232c;

        /* renamed from: d */
        public InterfaceC23465c f89233d;

        public C23882a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
            this.f89231b = interfaceC24541s;
            this.f89232c = interfaceC23479b;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89233d.dispose();
            this.f89233d = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89233d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89233d = EnumC23501d.DISPOSED;
            try {
                this.f89232c.accept(null, null);
                this.f89231b.onComplete();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89231b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89233d = EnumC23501d.DISPOSED;
            try {
                this.f89232c.accept(null, th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f89231b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89233d, interfaceC23465c)) {
                this.f89233d = interfaceC23465c;
                this.f89231b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89233d = EnumC23501d.DISPOSED;
            try {
                this.f89232c.accept(t, null);
                this.f89231b.onSuccess(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89231b.onError(th);
            }
        }
    }

    public C23881h(InterfaceC24574u<T> interfaceC24574u, InterfaceC23479b<? super T, ? super Throwable> interfaceC23479b) {
        super(interfaceC24574u);
        this.f89230c = interfaceC23479b;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23882a(interfaceC24541s, this.f89230c));
    }
}
