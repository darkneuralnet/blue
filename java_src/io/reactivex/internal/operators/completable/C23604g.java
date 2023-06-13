package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.completable.g */
/* loaded from: classes6.dex */
public final class C23604g extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88396b;

    /* renamed from: c */
    public final InterfaceC23478a f88397c;

    /* renamed from: io.reactivex.internal.operators.completable.g$a */
    /* loaded from: classes6.dex */
    public static final class C23605a extends AtomicInteger implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC23476f f88398b;

        /* renamed from: c */
        public final InterfaceC23478a f88399c;

        /* renamed from: d */
        public InterfaceC23465c f88400d;

        public C23605a(InterfaceC23476f interfaceC23476f, InterfaceC23478a interfaceC23478a) {
            this.f88398b = interfaceC23476f;
            this.f88399c = interfaceC23478a;
        }

        /* renamed from: a */
        public void m32896a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f88399c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88400d.dispose();
            m32896a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88400d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88398b.onComplete();
            m32896a();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88398b.onError(th);
            m32896a();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f88400d, interfaceC23465c)) {
                this.f88400d = interfaceC23465c;
                this.f88398b.onSubscribe(this);
            }
        }
    }

    public C23604g(InterfaceC23496h interfaceC23496h, InterfaceC23478a interfaceC23478a) {
        this.f88396b = interfaceC23496h;
        this.f88397c = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88396b.mo33003g(new C23605a(interfaceC23476f, this.f88397c));
    }
}
