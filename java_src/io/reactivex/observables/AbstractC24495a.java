package io.reactivex.observables;

import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.observable.C24023I0;
import io.reactivex.internal.operators.observable.C24084Q0;
import io.reactivex.internal.operators.observable.C24208k;
import io.reactivex.internal.operators.observable.InterfaceC24031J0;
import io.reactivex.internal.util.C24471g;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.observables.a */
/* loaded from: classes8.dex */
public abstract class AbstractC24495a<T> extends Observable<T> {
    /* renamed from: a */
    public Observable<T> m32089a(int i) {
        return m32088c(i, C23506a.m32967g());
    }

    /* renamed from: c */
    public Observable<T> m32088c(int i, InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g) {
        if (i <= 0) {
            mo32086g(interfaceC23484g);
            return C24508a.m31991r(this);
        }
        return C24508a.m31994o(new C24208k(this, i, interfaceC23484g));
    }

    /* renamed from: e */
    public final InterfaceC23465c m32087e() {
        C24471g c24471g = new C24471g();
        mo32086g(c24471g);
        return c24471g.f91070b;
    }

    /* renamed from: g */
    public abstract void mo32086g(InterfaceC23484g<? super InterfaceC23465c> interfaceC23484g);

    /* renamed from: h */
    public final AbstractC24495a<T> m32085h() {
        if (this instanceof InterfaceC24031J0) {
            return C24508a.m31991r(new C24023I0(((InterfaceC24031J0) this).mo32648b()));
        }
        return this;
    }

    /* renamed from: i */
    public Observable<T> m32084i() {
        return C24508a.m31994o(new C24084Q0(m32085h()));
    }

    /* renamed from: j */
    public final Observable<T> m32083j(int i) {
        return m32082k(i, 0L, TimeUnit.NANOSECONDS, C24542a.m31930e());
    }

    /* renamed from: k */
    public final Observable<T> m32082k(int i, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        C23544b.m32922f(i, "subscriberCount");
        C23544b.m32923e(timeUnit, "unit is null");
        C23544b.m32923e(abstractC23437E, "scheduler is null");
        return C24508a.m31994o(new C24084Q0(m32085h(), i, j, timeUnit, abstractC23437E));
    }
}
