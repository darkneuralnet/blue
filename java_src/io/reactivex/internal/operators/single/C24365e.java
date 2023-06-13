package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.observers.C23579x;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.e */
/* loaded from: classes6.dex */
public final class C24365e<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90814b;

    /* renamed from: c */
    public final InterfaceC23496h f90815c;

    /* renamed from: io.reactivex.internal.operators.single.e$a */
    /* loaded from: classes6.dex */
    public static final class C24366a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90816b;

        /* renamed from: c */
        public final InterfaceC23447K<T> f90817c;

        public C24366a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23447K<T> interfaceC23447K) {
            this.f90816b = interfaceC23445I;
            this.f90817c = interfaceC23447K;
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

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f90817c.mo33096a(new C23579x(this, this.f90816b));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f90816b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f90816b.onSubscribe(this);
            }
        }
    }

    public C24365e(InterfaceC23447K<T> interfaceC23447K, InterfaceC23496h interfaceC23496h) {
        this.f90814b = interfaceC23447K;
        this.f90815c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90815c.mo33003g(new C24366a(interfaceC23445I, this.f90814b));
    }
}
