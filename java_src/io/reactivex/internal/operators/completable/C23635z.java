package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.z */
/* loaded from: classes6.dex */
public final class C23635z extends AbstractC23461c {

    /* renamed from: b */
    public final AbstractC23461c f88457b;

    /* renamed from: c */
    public final InterfaceC23496h f88458c;

    /* renamed from: io.reactivex.internal.operators.completable.z$a */
    /* loaded from: classes6.dex */
    public static final class C23636a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = 3533011714830024923L;

        /* renamed from: b */
        public final InterfaceC23476f f88459b;

        /* renamed from: c */
        public final C23637a f88460c = new C23637a(this);

        /* renamed from: d */
        public final AtomicBoolean f88461d = new AtomicBoolean();

        /* renamed from: io.reactivex.internal.operators.completable.z$a$a */
        /* loaded from: classes6.dex */
        public static final class C23637a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f {
            private static final long serialVersionUID = 5176264485428790318L;

            /* renamed from: b */
            public final C23636a f88462b;

            public C23637a(C23636a c23636a) {
                this.f88462b = c23636a;
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                this.f88462b.m32894a();
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                this.f88462b.m32893b(th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23636a(InterfaceC23476f interfaceC23476f) {
            this.f88459b = interfaceC23476f;
        }

        /* renamed from: a */
        public void m32894a() {
            if (this.f88461d.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this);
                this.f88459b.onComplete();
            }
        }

        /* renamed from: b */
        public void m32893b(Throwable th) {
            if (this.f88461d.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this);
                this.f88459b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (this.f88461d.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this);
                EnumC23501d.m33000a(this.f88460c);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88461d.get();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (this.f88461d.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this.f88460c);
                this.f88459b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            if (this.f88461d.compareAndSet(false, true)) {
                EnumC23501d.m33000a(this.f88460c);
                this.f88459b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    public C23635z(AbstractC23461c abstractC23461c, InterfaceC23496h interfaceC23496h) {
        this.f88457b = abstractC23461c;
        this.f88458c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23636a c23636a = new C23636a(interfaceC23476f);
        interfaceC23476f.onSubscribe(c23636a);
        this.f88458c.mo33003g(c23636a.f88460c);
        this.f88457b.mo33003g(c23636a);
    }
}
