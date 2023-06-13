package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.maybe.E */
/* loaded from: classes6.dex */
public final class C23841E<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC23484g<? super InterfaceC23465c> f89151c;

    /* renamed from: d */
    public final InterfaceC23484g<? super T> f89152d;

    /* renamed from: e */
    public final InterfaceC23484g<? super Throwable> f89153e;

    /* renamed from: f */
    public final InterfaceC23478a f89154f;

    /* renamed from: g */
    public final InterfaceC23478a f89155g;

    /* renamed from: h */
    public final InterfaceC23478a f89156h;

    /* renamed from: io.reactivex.internal.operators.maybe.E$a */
    /* loaded from: classes6.dex */
    public static final class C23842a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89157b;

        /* renamed from: c */
        public final C23841E<T> f89158c;

        /* renamed from: d */
        public InterfaceC23465c f89159d;

        public C23842a(InterfaceC24541s<? super T> interfaceC24541s, C23841E<T> c23841e) {
            this.f89157b = interfaceC24541s;
            this.f89158c = c23841e;
        }

        /* renamed from: a */
        public void m32745a() {
            try {
                this.f89158c.f89155g.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }

        /* renamed from: b */
        public void m32744b(Throwable th) {
            try {
                this.f89158c.f89153e.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f89159d = EnumC23501d.DISPOSED;
            this.f89157b.onError(th);
            m32745a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            try {
                this.f89158c.f89156h.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
            this.f89159d.dispose();
            this.f89159d = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89159d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            InterfaceC23465c interfaceC23465c = this.f89159d;
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c == enumC23501d) {
                return;
            }
            try {
                this.f89158c.f89154f.run();
                this.f89159d = enumC23501d;
                this.f89157b.onComplete();
                m32745a();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                m32744b(th);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            if (this.f89159d == EnumC23501d.DISPOSED) {
                C24508a.m31988u(th);
            } else {
                m32744b(th);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89159d, interfaceC23465c)) {
                try {
                    this.f89158c.f89151c.accept(interfaceC23465c);
                    this.f89159d = interfaceC23465c;
                    this.f89157b.onSubscribe(this);
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    interfaceC23465c.dispose();
                    this.f89159d = EnumC23501d.DISPOSED;
                    EnumC23502e.m32988h(th, this.f89157b);
                }
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            InterfaceC23465c interfaceC23465c = this.f89159d;
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c == enumC23501d) {
                return;
            }
            try {
                this.f89158c.f89152d.accept(t);
                this.f89159d = enumC23501d;
                this.f89157b.onSuccess(t);
                m32745a();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                m32744b(th);
            }
        }
    }

    public C23841E(InterfaceC24574u<T> interfaceC24574u, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23484g<? super T> interfaceC23484g2, InterfaceC23484g<? super Throwable> interfaceC23484g3, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2, InterfaceC23478a interfaceC23478a3) {
        super(interfaceC24574u);
        this.f89151c = interfaceC23484g;
        this.f89152d = interfaceC23484g2;
        this.f89153e = interfaceC23484g3;
        this.f89154f = interfaceC23478a;
        this.f89155g = interfaceC23478a2;
        this.f89156h = interfaceC23478a3;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23842a(interfaceC24541s, this));
    }
}
