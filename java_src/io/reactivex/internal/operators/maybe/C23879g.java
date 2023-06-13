package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.maybe.g */
/* loaded from: classes6.dex */
public final class C23879g<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23478a f89226c;

    /* renamed from: io.reactivex.internal.operators.maybe.g$a */
    /* loaded from: classes6.dex */
    public static final class C23880a<T> extends AtomicInteger implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89227b;

        /* renamed from: c */
        public final InterfaceC23478a f89228c;

        /* renamed from: d */
        public InterfaceC23465c f89229d;

        public C23880a(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC23478a interfaceC23478a) {
            this.f89227b = interfaceC24541s;
            this.f89228c = interfaceC23478a;
        }

        /* renamed from: a */
        public void m32731a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f89228c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89229d.dispose();
            m32731a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89229d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89227b.onComplete();
            m32731a();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89227b.onError(th);
            m32731a();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89229d, interfaceC23465c)) {
                this.f89229d = interfaceC23465c;
                this.f89227b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89227b.onSuccess(t);
            m32731a();
        }
    }

    public C23879g(InterfaceC24574u<T> interfaceC24574u, InterfaceC23478a interfaceC23478a) {
        super(interfaceC24574u);
        this.f89226c = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23880a(interfaceC24541s, this.f89226c));
    }
}
