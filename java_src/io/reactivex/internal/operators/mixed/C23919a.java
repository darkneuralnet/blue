package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.a */
/* loaded from: classes6.dex */
public final class C23919a<R> extends Observable<R> {

    /* renamed from: b */
    public final InterfaceC23496h f89299b;

    /* renamed from: c */
    public final InterfaceC23434B<? extends R> f89300c;

    /* renamed from: io.reactivex.internal.operators.mixed.a$a */
    /* loaded from: classes6.dex */
    public static final class C23920a<R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R>, InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -8948264376121066672L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89301b;

        /* renamed from: c */
        public InterfaceC23434B<? extends R> f89302c;

        public C23920a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23434B<? extends R> interfaceC23434B) {
            this.f89302c = interfaceC23434B;
            this.f89301b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            InterfaceC23434B<? extends R> interfaceC23434B = this.f89302c;
            if (interfaceC23434B == null) {
                this.f89301b.onComplete();
                return;
            }
            this.f89302c = null;
            interfaceC23434B.subscribe(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89301b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(R r) {
            this.f89301b.onNext(r);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }
    }

    public C23919a(InterfaceC23496h interfaceC23496h, InterfaceC23434B<? extends R> interfaceC23434B) {
        this.f89299b = interfaceC23496h;
        this.f89300c = interfaceC23434B;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C23920a c23920a = new C23920a(interfaceC23436D, this.f89300c);
        interfaceC23436D.onSubscribe(c23920a);
        this.f89299b.mo33003g(c23920a);
    }
}
