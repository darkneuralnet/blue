package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
/* renamed from: io.reactivex.internal.operators.maybe.z */
/* loaded from: classes6.dex */
public final class C23917z<T, R> extends AbstractC23869a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends R> f89295c;

    /* renamed from: io.reactivex.internal.operators.maybe.z$a */
    /* loaded from: classes6.dex */
    public static final class C23918a<T, R> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super R> f89296b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends R> f89297c;

        /* renamed from: d */
        public InterfaceC23465c f89298d;

        public C23918a(InterfaceC24541s<? super R> interfaceC24541s, InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
            this.f89296b = interfaceC24541s;
            this.f89297c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC23465c interfaceC23465c = this.f89298d;
            this.f89298d = EnumC23501d.DISPOSED;
            interfaceC23465c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89298d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89296b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89296b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89298d, interfaceC23465c)) {
                this.f89298d = interfaceC23465c;
                this.f89296b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                this.f89296b.onSuccess(C23544b.m32923e(this.f89297c.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89296b.onError(th);
            }
        }
    }

    public C23917z(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends R> interfaceC23492o) {
        super(interfaceC24574u);
        this.f89295c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super R> interfaceC24541s) {
        this.f89206b.mo31865a(new C23918a(interfaceC24541s, this.f89295c));
    }
}
