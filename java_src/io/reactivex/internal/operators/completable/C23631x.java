package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.x */
/* loaded from: classes6.dex */
public final class C23631x extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88447b;

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23496h> f88448c;

    /* renamed from: io.reactivex.internal.operators.completable.x$a */
    /* loaded from: classes6.dex */
    public static final class C23632a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = 5018523762564524046L;

        /* renamed from: b */
        public final InterfaceC23476f f88449b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23496h> f88450c;

        /* renamed from: d */
        public boolean f88451d;

        public C23632a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super Throwable, ? extends InterfaceC23496h> interfaceC23492o) {
            this.f88449b = interfaceC23476f;
            this.f88450c = interfaceC23492o;
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
            this.f88449b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            if (this.f88451d) {
                this.f88449b.onError(th);
                return;
            }
            this.f88451d = true;
            try {
                ((InterfaceC23496h) C23544b.m32923e(this.f88450c.apply(th), "The errorMapper returned a null CompletableSource")).mo33003g(this);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f88449b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
        }
    }

    public C23631x(InterfaceC23496h interfaceC23496h, InterfaceC23492o<? super Throwable, ? extends InterfaceC23496h> interfaceC23492o) {
        this.f88447b = interfaceC23496h;
        this.f88448c = interfaceC23492o;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23632a c23632a = new C23632a(interfaceC23476f, this.f88448c);
        interfaceC23476f.onSubscribe(c23632a);
        this.f88447b.mo33003g(c23632a);
    }
}
