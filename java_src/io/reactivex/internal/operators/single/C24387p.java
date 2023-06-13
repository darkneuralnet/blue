package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.p */
/* loaded from: classes6.dex */
public final class C24387p<T> extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90861b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90862c;

    /* renamed from: io.reactivex.internal.operators.single.p$a */
    /* loaded from: classes6.dex */
    public static final class C24388a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: b */
        public final InterfaceC23476f f90863b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90864c;

        public C24388a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
            this.f90863b = interfaceC23476f;
            this.f90864c = interfaceC23492o;
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
            this.f90863b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90863b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f90864c.apply(t), "The mapper returned a null CompletableSource");
                if (!mo1769e()) {
                    interfaceC23496h.mo33003g(this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(th);
            }
        }
    }

    public C24387p(InterfaceC23447K<T> interfaceC23447K, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        this.f90861b = interfaceC23447K;
        this.f90862c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C24388a c24388a = new C24388a(interfaceC23476f, this.f90862c);
        interfaceC23476f.onSubscribe(c24388a);
        this.f90861b.mo33096a(c24388a);
    }
}
