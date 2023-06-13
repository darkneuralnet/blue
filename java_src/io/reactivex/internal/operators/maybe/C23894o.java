package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.o */
/* loaded from: classes6.dex */
public final class C23894o<T> extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89256b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89257c;

    /* renamed from: io.reactivex.internal.operators.maybe.o$a */
    /* loaded from: classes6.dex */
    public static final class C23895a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: b */
        public final InterfaceC23476f f89258b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89259c;

        public C23895a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
            this.f89258b = interfaceC23476f;
            this.f89259c = interfaceC23492o;
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

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89258b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89258b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89259c.apply(t), "The mapper returned a null CompletableSource");
                if (!mo1769e()) {
                    interfaceC23496h.mo33003g(this);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                onError(th);
            }
        }
    }

    public C23894o(InterfaceC24574u<T> interfaceC24574u, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o) {
        this.f89256b = interfaceC24574u;
        this.f89257c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23895a c23895a = new C23895a(interfaceC23476f, this.f89257c);
        interfaceC23476f.onSubscribe(c23895a);
        this.f89256b.mo31865a(c23895a);
    }
}
