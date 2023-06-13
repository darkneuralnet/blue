package io.reactivex.internal.subscribers;

import io.reactivex.InterfaceC24494o;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.subscribers.c */
/* loaded from: classes8.dex */
public final class C24448c<T> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<T>, InterfaceC46292oT5, InterfaceC23465c, InterfaceC24502f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b */
    public final InterfaceC23484g<? super T> f91026b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f91027c;

    /* renamed from: d */
    public final InterfaceC23478a f91028d;

    /* renamed from: e */
    public final InterfaceC23484g<? super InterfaceC46292oT5> f91029e;

    public C24448c(InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23484g<? super InterfaceC46292oT5> interfaceC23484g3) {
        this.f91026b = interfaceC23484g;
        this.f91027c = interfaceC23484g2;
        this.f91028d = interfaceC23478a;
        this.f91029e = interfaceC23484g3;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
            try {
                this.f91029e.accept(this);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                interfaceC46292oT5.cancel();
                onError(th);
            }
        }
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        EnumC24463g.m32294a(this);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return get() == EnumC24463g.CANCELLED;
    }

    @Override // io.reactivex.observers.InterfaceC24502f
    public boolean hasCustomOnError() {
        return this.f91027c != C23506a.f88250f;
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        get().mo21023o(j);
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        InterfaceC46292oT5 interfaceC46292oT5 = get();
        EnumC24463g enumC24463g = EnumC24463g.CANCELLED;
        if (interfaceC46292oT5 != enumC24463g) {
            lazySet(enumC24463g);
            try {
                this.f91028d.run();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                C24508a.m31988u(th);
            }
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        InterfaceC46292oT5 interfaceC46292oT5 = get();
        EnumC24463g enumC24463g = EnumC24463g.CANCELLED;
        if (interfaceC46292oT5 != enumC24463g) {
            lazySet(enumC24463g);
            try {
                this.f91027c.accept(th);
                return;
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                C24508a.m31988u(new CompositeException(th, th2));
                return;
            }
        }
        C24508a.m31988u(th);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        if (!mo1769e()) {
            try {
                this.f91026b.accept(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                get().cancel();
                onError(th);
            }
        }
    }
}
