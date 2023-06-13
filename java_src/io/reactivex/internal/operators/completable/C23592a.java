package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.completable.a */
/* loaded from: classes6.dex */
public final class C23592a extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h[] f88366b;

    /* renamed from: c */
    public final Iterable<? extends InterfaceC23496h> f88367c;

    /* renamed from: io.reactivex.internal.operators.completable.a$a */
    /* loaded from: classes6.dex */
    public static final class C23593a implements InterfaceC23476f {

        /* renamed from: b */
        public final AtomicBoolean f88368b;

        /* renamed from: c */
        public final C23464b f88369c;

        /* renamed from: d */
        public final InterfaceC23476f f88370d;

        /* renamed from: e */
        public InterfaceC23465c f88371e;

        public C23593a(AtomicBoolean atomicBoolean, C23464b c23464b, InterfaceC23476f interfaceC23476f) {
            this.f88368b = atomicBoolean;
            this.f88369c = c23464b;
            this.f88370d = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (this.f88368b.compareAndSet(false, true)) {
                this.f88369c.mo32984b(this.f88371e);
                this.f88369c.dispose();
                this.f88370d.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            if (this.f88368b.compareAndSet(false, true)) {
                this.f88369c.mo32984b(this.f88371e);
                this.f88369c.dispose();
                this.f88370d.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88371e = interfaceC23465c;
            this.f88369c.mo32983c(interfaceC23465c);
        }
    }

    public C23592a(InterfaceC23496h[] interfaceC23496hArr, Iterable<? extends InterfaceC23496h> iterable) {
        this.f88366b = interfaceC23496hArr;
        this.f88367c = iterable;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        int length;
        InterfaceC23496h[] interfaceC23496hArr = this.f88366b;
        if (interfaceC23496hArr == null) {
            interfaceC23496hArr = new InterfaceC23496h[8];
            try {
                length = 0;
                for (InterfaceC23496h interfaceC23496h : this.f88367c) {
                    if (interfaceC23496h == null) {
                        EnumC23502e.m32989g(new NullPointerException("One of the sources is null"), interfaceC23476f);
                        return;
                    }
                    if (length == interfaceC23496hArr.length) {
                        InterfaceC23496h[] interfaceC23496hArr2 = new InterfaceC23496h[(length >> 2) + length];
                        System.arraycopy(interfaceC23496hArr, 0, interfaceC23496hArr2, 0, length);
                        interfaceC23496hArr = interfaceC23496hArr2;
                    }
                    int i = length + 1;
                    interfaceC23496hArr[length] = interfaceC23496h;
                    length = i;
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32989g(th, interfaceC23476f);
                return;
            }
        } else {
            length = interfaceC23496hArr.length;
        }
        C23464b c23464b = new C23464b();
        interfaceC23476f.onSubscribe(c23464b);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC23496h interfaceC23496h2 = interfaceC23496hArr[i2];
            if (c23464b.mo1769e()) {
                return;
            }
            if (interfaceC23496h2 == null) {
                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    c23464b.dispose();
                    interfaceC23476f.onError(nullPointerException);
                    return;
                }
                C24508a.m31988u(nullPointerException);
                return;
            }
            interfaceC23496h2.mo33003g(new C23593a(atomicBoolean, c23464b, interfaceC23476f));
        }
        if (length == 0) {
            interfaceC23476f.onComplete();
        }
    }
}
