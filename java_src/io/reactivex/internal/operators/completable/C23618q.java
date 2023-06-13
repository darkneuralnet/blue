package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.completable.q */
/* loaded from: classes6.dex */
public final class C23618q extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88416b;

    /* renamed from: io.reactivex.internal.operators.completable.q$a */
    /* loaded from: classes6.dex */
    public static final class C23619a implements InterfaceC23476f, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23476f f88417b;

        /* renamed from: c */
        public InterfaceC23465c f88418c;

        public C23619a(InterfaceC23476f interfaceC23476f) {
            this.f88417b = interfaceC23476f;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f88418c.dispose();
            this.f88418c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f88418c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88417b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88417b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f88418c, interfaceC23465c)) {
                this.f88418c = interfaceC23465c;
                this.f88417b.onSubscribe(this);
            }
        }
    }

    public C23618q(InterfaceC23496h interfaceC23496h) {
        this.f88416b = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88416b.mo33003g(new C23619a(interfaceC23476f));
    }
}
