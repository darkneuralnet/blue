package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.l */
/* loaded from: classes6.dex */
public final class C23887l<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f89240c;

    /* renamed from: io.reactivex.internal.operators.maybe.l$a */
    /* loaded from: classes6.dex */
    public static final class C23888a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89241b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f89242c;

        /* renamed from: d */
        public InterfaceC23465c f89243d;

        public C23888a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f89241b = interfaceC24541s;
            this.f89242c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC23465c interfaceC23465c = this.f89243d;
            this.f89243d = EnumC23501d.DISPOSED;
            interfaceC23465c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89243d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89241b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89241b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89243d, interfaceC23465c)) {
                this.f89243d = interfaceC23465c;
                this.f89241b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                if (this.f89242c.test(t)) {
                    this.f89241b.onSuccess(t);
                } else {
                    this.f89241b.onComplete();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89241b.onError(th);
            }
        }
    }

    public C23887l(InterfaceC24574u<T> interfaceC24574u, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC24574u);
        this.f89240c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23888a(interfaceC24541s, this.f89240c));
    }
}
