package io.reactivex.internal.util;

import io.reactivex.InterfaceC23436D;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.util.l */
/* loaded from: classes8.dex */
public final class C24477l {
    private C24477l() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m32255a(InterfaceC42141hT5<?> interfaceC42141hT5, AtomicInteger atomicInteger, C24467c c24467c) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m32275b = c24467c.m32275b();
            if (m32275b != null) {
                interfaceC42141hT5.onError(m32275b);
            } else {
                interfaceC42141hT5.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m32254b(InterfaceC23436D<?> interfaceC23436D, AtomicInteger atomicInteger, C24467c c24467c) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m32275b = c24467c.m32275b();
            if (m32275b != null) {
                interfaceC23436D.onError(m32275b);
            } else {
                interfaceC23436D.onComplete();
            }
        }
    }

    /* renamed from: c */
    public static void m32253c(InterfaceC42141hT5<?> interfaceC42141hT5, Throwable th, AtomicInteger atomicInteger, C24467c c24467c) {
        if (c24467c.m32276a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC42141hT5.onError(c24467c.m32275b());
                return;
            }
            return;
        }
        C24508a.m31988u(th);
    }

    /* renamed from: d */
    public static void m32252d(InterfaceC23436D<?> interfaceC23436D, Throwable th, AtomicInteger atomicInteger, C24467c c24467c) {
        if (c24467c.m32276a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC23436D.onError(c24467c.m32275b());
                return;
            }
            return;
        }
        C24508a.m31988u(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> void m32251e(InterfaceC42141hT5<? super T> interfaceC42141hT5, T t, AtomicInteger atomicInteger, C24467c c24467c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC42141hT5.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m32275b = c24467c.m32275b();
                if (m32275b != null) {
                    interfaceC42141hT5.onError(m32275b);
                } else {
                    interfaceC42141hT5.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> void m32250f(InterfaceC23436D<? super T> interfaceC23436D, T t, AtomicInteger atomicInteger, C24467c c24467c) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC23436D.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m32275b = c24467c.m32275b();
                if (m32275b != null) {
                    interfaceC23436D.onError(m32275b);
                } else {
                    interfaceC23436D.onComplete();
                }
            }
        }
    }
}
