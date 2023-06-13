package com.uber.autodispose;

import io.reactivex.InterfaceC23436D;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes7.dex */
final class HalfSerializer {
    private HalfSerializer() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m45214a(InterfaceC42141hT5<?> interfaceC42141hT5, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m45241b = atomicThrowable.m45241b();
            if (m45241b != null) {
                interfaceC42141hT5.onError(m45241b);
            } else {
                interfaceC42141hT5.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m45213b(InterfaceC23436D<?> interfaceC23436D, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m45241b = atomicThrowable.m45241b();
            if (m45241b != null) {
                interfaceC23436D.onError(m45241b);
            } else {
                interfaceC23436D.onComplete();
            }
        }
    }

    /* renamed from: c */
    public static void m45212c(InterfaceC42141hT5<?> interfaceC42141hT5, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.m45242a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC42141hT5.onError(atomicThrowable.m45241b());
                return;
            }
            return;
        }
        C24508a.m31988u(th);
    }

    /* renamed from: d */
    public static void m45211d(InterfaceC23436D<?> interfaceC23436D, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.m45242a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC23436D.onError(atomicThrowable.m45241b());
                return;
            }
            return;
        }
        C24508a.m31988u(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <T> boolean m45210e(InterfaceC42141hT5<? super T> interfaceC42141hT5, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC42141hT5.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m45241b = atomicThrowable.m45241b();
                if (m45241b != null) {
                    interfaceC42141hT5.onError(m45241b);
                } else {
                    interfaceC42141hT5.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> boolean m45209f(InterfaceC23436D<? super T> interfaceC23436D, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC23436D.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m45241b = atomicThrowable.m45241b();
                if (m45241b != null) {
                    interfaceC23436D.onError(m45241b);
                } else {
                    interfaceC23436D.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
