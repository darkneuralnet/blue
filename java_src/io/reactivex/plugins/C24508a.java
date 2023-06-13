package io.reactivex.plugins;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.Observable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.flowables.AbstractC23477a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23482e;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.schedulers.C24439o;
import io.reactivex.internal.util.C24475k;
import io.reactivex.observables.AbstractC24495a;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
/* renamed from: io.reactivex.plugins.a */
/* loaded from: classes8.dex */
public final class C24508a {

    /* renamed from: a */
    public static volatile InterfaceC23484g<? super Throwable> f91119a;

    /* renamed from: b */
    public static volatile InterfaceC23492o<? super Runnable, ? extends Runnable> f91120b;

    /* renamed from: c */
    public static volatile InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> f91121c;

    /* renamed from: d */
    public static volatile InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> f91122d;

    /* renamed from: e */
    public static volatile InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> f91123e;

    /* renamed from: f */
    public static volatile InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> f91124f;

    /* renamed from: g */
    public static volatile InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> f91125g;

    /* renamed from: h */
    public static volatile InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> f91126h;

    /* renamed from: i */
    public static volatile InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> f91127i;

    /* renamed from: j */
    public static volatile InterfaceC23492o<? super AbstractC24490k, ? extends AbstractC24490k> f91128j;

    /* renamed from: k */
    public static volatile InterfaceC23492o<? super AbstractC23477a, ? extends AbstractC23477a> f91129k;

    /* renamed from: l */
    public static volatile InterfaceC23492o<? super Observable, ? extends Observable> f91130l;

    /* renamed from: m */
    public static volatile InterfaceC23492o<? super AbstractC24495a, ? extends AbstractC24495a> f91131m;

    /* renamed from: n */
    public static volatile InterfaceC23492o<? super AbstractC24507p, ? extends AbstractC24507p> f91132n;

    /* renamed from: o */
    public static volatile InterfaceC23492o<? super AbstractC23442F, ? extends AbstractC23442F> f91133o;

    /* renamed from: p */
    public static volatile InterfaceC23492o<? super AbstractC23461c, ? extends AbstractC23461c> f91134p;

    /* renamed from: q */
    public static volatile InterfaceC23480c<? super AbstractC24490k, ? super InterfaceC42141hT5, ? extends InterfaceC42141hT5> f91135q;

    /* renamed from: r */
    public static volatile InterfaceC23480c<? super AbstractC24507p, ? super InterfaceC24541s, ? extends InterfaceC24541s> f91136r;

    /* renamed from: s */
    public static volatile InterfaceC23480c<? super Observable, ? super InterfaceC23436D, ? extends InterfaceC23436D> f91137s;

    /* renamed from: t */
    public static volatile InterfaceC23480c<? super AbstractC23442F, ? super InterfaceC23445I, ? extends InterfaceC23445I> f91138t;

    /* renamed from: u */
    public static volatile InterfaceC23480c<? super AbstractC23461c, ? super InterfaceC23476f, ? extends InterfaceC23476f> f91139u;

    /* renamed from: v */
    public static volatile InterfaceC23482e f91140v;

    /* renamed from: w */
    public static volatile boolean f91141w;

    /* renamed from: x */
    public static volatile boolean f91142x;

    private C24508a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: A */
    public static <T> InterfaceC24541s<? super T> m32018A(AbstractC24507p<T> abstractC24507p, InterfaceC24541s<? super T> interfaceC24541s) {
        InterfaceC23480c<? super AbstractC24507p, ? super InterfaceC24541s, ? extends InterfaceC24541s> interfaceC23480c = f91136r;
        if (interfaceC23480c != null) {
            return (InterfaceC24541s) m32008a(interfaceC23480c, abstractC24507p, interfaceC24541s);
        }
        return interfaceC24541s;
    }

    /* renamed from: B */
    public static <T> InterfaceC23436D<? super T> m32017B(Observable<T> observable, InterfaceC23436D<? super T> interfaceC23436D) {
        InterfaceC23480c<? super Observable, ? super InterfaceC23436D, ? extends InterfaceC23436D> interfaceC23480c = f91137s;
        if (interfaceC23480c != null) {
            return (InterfaceC23436D) m32008a(interfaceC23480c, observable, interfaceC23436D);
        }
        return interfaceC23436D;
    }

    /* renamed from: C */
    public static <T> InterfaceC23445I<? super T> m32016C(AbstractC23442F<T> abstractC23442F, InterfaceC23445I<? super T> interfaceC23445I) {
        InterfaceC23480c<? super AbstractC23442F, ? super InterfaceC23445I, ? extends InterfaceC23445I> interfaceC23480c = f91138t;
        if (interfaceC23480c != null) {
            return (InterfaceC23445I) m32008a(interfaceC23480c, abstractC23442F, interfaceC23445I);
        }
        return interfaceC23445I;
    }

    /* renamed from: D */
    public static void m32015D(InterfaceC23484g<? super Throwable> interfaceC23484g) {
        if (!f91141w) {
            f91119a = interfaceC23484g;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: E */
    public static void m32014E(InterfaceC23480c<? super AbstractC23461c, ? super InterfaceC23476f, ? extends InterfaceC23476f> interfaceC23480c) {
        if (!f91141w) {
            f91139u = interfaceC23480c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: F */
    public static void m32013F(InterfaceC23480c<? super AbstractC24490k, ? super InterfaceC42141hT5, ? extends InterfaceC42141hT5> interfaceC23480c) {
        if (!f91141w) {
            f91135q = interfaceC23480c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: G */
    public static void m32012G(InterfaceC23480c<? super AbstractC24507p, InterfaceC24541s, ? extends InterfaceC24541s> interfaceC23480c) {
        if (!f91141w) {
            f91136r = interfaceC23480c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: H */
    public static void m32011H(InterfaceC23480c<? super Observable, ? super InterfaceC23436D, ? extends InterfaceC23436D> interfaceC23480c) {
        if (!f91141w) {
            f91137s = interfaceC23480c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: I */
    public static void m32010I(InterfaceC23480c<? super AbstractC23442F, ? super InterfaceC23445I, ? extends InterfaceC23445I> interfaceC23480c) {
        if (!f91141w) {
            f91138t = interfaceC23480c;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: J */
    public static void m32009J(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static <T, U, R> R m32008a(InterfaceC23480c<T, U, R> interfaceC23480c, T t, U u) {
        try {
            return interfaceC23480c.apply(t, u);
        } catch (Throwable th) {
            throw C24475k.m32256e(th);
        }
    }

    /* renamed from: b */
    public static <T, R> R m32007b(InterfaceC23492o<T, R> interfaceC23492o, T t) {
        try {
            return interfaceC23492o.apply(t);
        } catch (Throwable th) {
            throw C24475k.m32256e(th);
        }
    }

    /* renamed from: c */
    public static AbstractC23437E m32006c(InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> interfaceC23492o, Callable<AbstractC23437E> callable) {
        return (AbstractC23437E) C23544b.m32923e(m32007b(interfaceC23492o, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    public static AbstractC23437E m32005d(Callable<AbstractC23437E> callable) {
        try {
            return (AbstractC23437E) C23544b.m32923e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C24475k.m32256e(th);
        }
    }

    /* renamed from: e */
    public static AbstractC23437E m32004e(ThreadFactory threadFactory) {
        return new C24439o((ThreadFactory) C23544b.m32923e(threadFactory, "threadFactory is null"));
    }

    /* renamed from: f */
    public static AbstractC23437E m32003f(Callable<AbstractC23437E> callable) {
        C23544b.m32923e(callable, "Scheduler Callable can't be null");
        InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> interfaceC23492o = f91121c;
        if (interfaceC23492o == null) {
            return m32005d(callable);
        }
        return m32006c(interfaceC23492o, callable);
    }

    /* renamed from: g */
    public static AbstractC23437E m32002g(Callable<AbstractC23437E> callable) {
        C23544b.m32923e(callable, "Scheduler Callable can't be null");
        InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> interfaceC23492o = f91123e;
        if (interfaceC23492o == null) {
            return m32005d(callable);
        }
        return m32006c(interfaceC23492o, callable);
    }

    /* renamed from: h */
    public static AbstractC23437E m32001h(Callable<AbstractC23437E> callable) {
        C23544b.m32923e(callable, "Scheduler Callable can't be null");
        InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> interfaceC23492o = f91124f;
        if (interfaceC23492o == null) {
            return m32005d(callable);
        }
        return m32006c(interfaceC23492o, callable);
    }

    /* renamed from: i */
    public static AbstractC23437E m32000i(Callable<AbstractC23437E> callable) {
        C23544b.m32923e(callable, "Scheduler Callable can't be null");
        InterfaceC23492o<? super Callable<AbstractC23437E>, ? extends AbstractC23437E> interfaceC23492o = f91122d;
        if (interfaceC23492o == null) {
            return m32005d(callable);
        }
        return m32006c(interfaceC23492o, callable);
    }

    /* renamed from: j */
    public static boolean m31999j(Throwable th) {
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m31998k() {
        return f91142x;
    }

    /* renamed from: l */
    public static AbstractC23461c m31997l(AbstractC23461c abstractC23461c) {
        InterfaceC23492o<? super AbstractC23461c, ? extends AbstractC23461c> interfaceC23492o = f91134p;
        if (interfaceC23492o != null) {
            return (AbstractC23461c) m32007b(interfaceC23492o, abstractC23461c);
        }
        return abstractC23461c;
    }

    /* renamed from: m */
    public static <T> AbstractC24490k<T> m31996m(AbstractC24490k<T> abstractC24490k) {
        InterfaceC23492o<? super AbstractC24490k, ? extends AbstractC24490k> interfaceC23492o = f91128j;
        if (interfaceC23492o != null) {
            return (AbstractC24490k) m32007b(interfaceC23492o, abstractC24490k);
        }
        return abstractC24490k;
    }

    /* renamed from: n */
    public static <T> AbstractC24507p<T> m31995n(AbstractC24507p<T> abstractC24507p) {
        InterfaceC23492o<? super AbstractC24507p, ? extends AbstractC24507p> interfaceC23492o = f91132n;
        if (interfaceC23492o != null) {
            return (AbstractC24507p) m32007b(interfaceC23492o, abstractC24507p);
        }
        return abstractC24507p;
    }

    /* renamed from: o */
    public static <T> Observable<T> m31994o(Observable<T> observable) {
        InterfaceC23492o<? super Observable, ? extends Observable> interfaceC23492o = f91130l;
        if (interfaceC23492o != null) {
            return (Observable) m32007b(interfaceC23492o, observable);
        }
        return observable;
    }

    /* renamed from: p */
    public static <T> AbstractC23442F<T> m31993p(AbstractC23442F<T> abstractC23442F) {
        InterfaceC23492o<? super AbstractC23442F, ? extends AbstractC23442F> interfaceC23492o = f91133o;
        if (interfaceC23492o != null) {
            return (AbstractC23442F) m32007b(interfaceC23492o, abstractC23442F);
        }
        return abstractC23442F;
    }

    /* renamed from: q */
    public static <T> AbstractC23477a<T> m31992q(AbstractC23477a<T> abstractC23477a) {
        InterfaceC23492o<? super AbstractC23477a, ? extends AbstractC23477a> interfaceC23492o = f91129k;
        if (interfaceC23492o != null) {
            return (AbstractC23477a) m32007b(interfaceC23492o, abstractC23477a);
        }
        return abstractC23477a;
    }

    /* renamed from: r */
    public static <T> AbstractC24495a<T> m31991r(AbstractC24495a<T> abstractC24495a) {
        InterfaceC23492o<? super AbstractC24495a, ? extends AbstractC24495a> interfaceC23492o = f91131m;
        if (interfaceC23492o != null) {
            return (AbstractC24495a) m32007b(interfaceC23492o, abstractC24495a);
        }
        return abstractC24495a;
    }

    /* renamed from: s */
    public static boolean m31990s() {
        InterfaceC23482e interfaceC23482e = f91140v;
        if (interfaceC23482e != null) {
            try {
                return interfaceC23482e.mo33005a();
            } catch (Throwable th) {
                throw C24475k.m32256e(th);
            }
        }
        return false;
    }

    /* renamed from: t */
    public static AbstractC23437E m31989t(AbstractC23437E abstractC23437E) {
        InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> interfaceC23492o = f91125g;
        if (interfaceC23492o == null) {
            return abstractC23437E;
        }
        return (AbstractC23437E) m32007b(interfaceC23492o, abstractC23437E);
    }

    /* renamed from: u */
    public static void m31988u(Throwable th) {
        InterfaceC23484g<? super Throwable> interfaceC23484g = f91119a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m31999j(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC23484g != null) {
            try {
                interfaceC23484g.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m32009J(th2);
            }
        }
        th.printStackTrace();
        m32009J(th);
    }

    /* renamed from: v */
    public static AbstractC23437E m31987v(AbstractC23437E abstractC23437E) {
        InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> interfaceC23492o = f91127i;
        if (interfaceC23492o == null) {
            return abstractC23437E;
        }
        return (AbstractC23437E) m32007b(interfaceC23492o, abstractC23437E);
    }

    /* renamed from: w */
    public static Runnable m31986w(Runnable runnable) {
        C23544b.m32923e(runnable, "run is null");
        InterfaceC23492o<? super Runnable, ? extends Runnable> interfaceC23492o = f91120b;
        if (interfaceC23492o == null) {
            return runnable;
        }
        return (Runnable) m32007b(interfaceC23492o, runnable);
    }

    /* renamed from: x */
    public static AbstractC23437E m31985x(AbstractC23437E abstractC23437E) {
        InterfaceC23492o<? super AbstractC23437E, ? extends AbstractC23437E> interfaceC23492o = f91126h;
        if (interfaceC23492o == null) {
            return abstractC23437E;
        }
        return (AbstractC23437E) m32007b(interfaceC23492o, abstractC23437E);
    }

    /* renamed from: y */
    public static <T> InterfaceC42141hT5<? super T> m31984y(AbstractC24490k<T> abstractC24490k, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        InterfaceC23480c<? super AbstractC24490k, ? super InterfaceC42141hT5, ? extends InterfaceC42141hT5> interfaceC23480c = f91135q;
        if (interfaceC23480c != null) {
            return (InterfaceC42141hT5) m32008a(interfaceC23480c, abstractC24490k, interfaceC42141hT5);
        }
        return interfaceC42141hT5;
    }

    /* renamed from: z */
    public static InterfaceC23476f m31983z(AbstractC23461c abstractC23461c, InterfaceC23476f interfaceC23476f) {
        InterfaceC23480c<? super AbstractC23461c, ? super InterfaceC23476f, ? extends InterfaceC23476f> interfaceC23480c = f91139u;
        if (interfaceC23480c != null) {
            return (InterfaceC23476f) m32008a(interfaceC23480c, abstractC23461c, interfaceC23476f);
        }
        return interfaceC23476f;
    }
}
