package io.reactivex.android.plugins;

import io.reactivex.AbstractC23437E;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.android.plugins.a */
/* loaded from: classes6.dex */
public final class C23453a {

    /* renamed from: a */
    public static volatile InterfaceC23492o<Callable<AbstractC23437E>, AbstractC23437E> f88212a;

    /* renamed from: b */
    public static volatile InterfaceC23492o<AbstractC23437E, AbstractC23437E> f88213b;

    private C23453a() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static <T, R> R m33092a(InterfaceC23492o<T, R> interfaceC23492o, T t) {
        try {
            return interfaceC23492o.apply(t);
        } catch (Throwable th) {
            throw C23475a.m33010a(th);
        }
    }

    /* renamed from: b */
    public static AbstractC23437E m33091b(InterfaceC23492o<Callable<AbstractC23437E>, AbstractC23437E> interfaceC23492o, Callable<AbstractC23437E> callable) {
        AbstractC23437E abstractC23437E = (AbstractC23437E) m33092a(interfaceC23492o, callable);
        if (abstractC23437E != null) {
            return abstractC23437E;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    public static AbstractC23437E m33090c(Callable<AbstractC23437E> callable) {
        try {
            AbstractC23437E call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C23475a.m33010a(th);
        }
    }

    /* renamed from: d */
    public static AbstractC23437E m33089d(Callable<AbstractC23437E> callable) {
        if (callable != null) {
            InterfaceC23492o<Callable<AbstractC23437E>, AbstractC23437E> interfaceC23492o = f88212a;
            if (interfaceC23492o == null) {
                return m33090c(callable);
            }
            return m33091b(interfaceC23492o, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static AbstractC23437E m33088e(AbstractC23437E abstractC23437E) {
        if (abstractC23437E != null) {
            InterfaceC23492o<AbstractC23437E, AbstractC23437E> interfaceC23492o = f88213b;
            if (interfaceC23492o == null) {
                return abstractC23437E;
            }
            return (AbstractC23437E) m33092a(interfaceC23492o, abstractC23437E);
        }
        throw new NullPointerException("scheduler == null");
    }
}
