package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.B */
/* loaded from: classes6.dex */
public final class C23834B<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super Throwable> f89136c;

    /* renamed from: io.reactivex.internal.operators.maybe.B$a */
    /* loaded from: classes6.dex */
    public static final class C23835a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89137b;

        /* renamed from: c */
        public final InterfaceC23494q<? super Throwable> f89138c;

        /* renamed from: d */
        public InterfaceC23465c f89139d;

        public C23835a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23494q<? super Throwable> interfaceC23494q) {
            this.f89137b = interfaceC24541s;
            this.f89138c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89139d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89139d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89137b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            try {
                if (this.f89138c.test(th)) {
                    this.f89137b.onComplete();
                } else {
                    this.f89137b.onError(th);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89137b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89139d, interfaceC23465c)) {
                this.f89139d = interfaceC23465c;
                this.f89137b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89137b.onSuccess(t);
        }
    }

    public C23834B(InterfaceC24574u<T> interfaceC24574u, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        super(interfaceC24574u);
        this.f89136c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23835a(interfaceC24541s, this.f89136c));
    }
}
