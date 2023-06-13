package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.completable.w */
/* loaded from: classes6.dex */
public final class C23629w extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88437b;

    /* renamed from: c */
    public final InterfaceC23484g<? super InterfaceC23465c> f88438c;

    /* renamed from: d */
    public final InterfaceC23484g<? super Throwable> f88439d;

    /* renamed from: e */
    public final InterfaceC23478a f88440e;

    /* renamed from: f */
    public final InterfaceC23478a f88441f;

    /* renamed from: g */
    public final InterfaceC23478a f88442g;

    /* renamed from: h */
    public final InterfaceC23478a f88443h;

    /* renamed from: io.reactivex.internal.operators.completable.w$a */
    /* loaded from: classes6.dex */
    public final class C23630a implements InterfaceC23476f, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f88444b;

        /* renamed from: c */
        public InterfaceC23465c f88445c;

        public C23630a(InterfaceC23476f interfaceC23476f) {
            this.f88444b = interfaceC23476f;
        }

        /* renamed from: a */
        public void m32895a() {
            try {
                C23629w.this.f88442g.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            try {
                C23629w.this.f88443h.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
            this.f88445c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88445c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (this.f88445c == EnumC23501d.DISPOSED) {
                return;
            }
            try {
                C23629w.this.f88440e.run();
                C23629w.this.f88441f.run();
                this.f88444b.onComplete();
                m32895a();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88444b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            if (this.f88445c == EnumC23501d.DISPOSED) {
                C24508a.m31988u(th);
                return;
            }
            try {
                C23629w.this.f88439d.accept(th);
                C23629w.this.f88441f.run();
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f88444b.onError(th);
            m32895a();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            try {
                C23629w.this.f88438c.accept(interfaceC23465c);
                if (EnumC23501d.m32993j(this.f88445c, interfaceC23465c)) {
                    this.f88445c = interfaceC23465c;
                    this.f88444b.onSubscribe(this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                interfaceC23465c.dispose();
                this.f88445c = EnumC23501d.DISPOSED;
                EnumC23502e.m32989g(th, this.f88444b);
            }
        }
    }

    public C23629w(InterfaceC23496h interfaceC23496h, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2, InterfaceC23478a interfaceC23478a3, InterfaceC23478a interfaceC23478a4) {
        this.f88437b = interfaceC23496h;
        this.f88438c = interfaceC23484g;
        this.f88439d = interfaceC23484g2;
        this.f88440e = interfaceC23478a;
        this.f88441f = interfaceC23478a2;
        this.f88442g = interfaceC23478a3;
        this.f88443h = interfaceC23478a4;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88437b.mo33003g(new C23630a(interfaceC23476f));
    }
}
