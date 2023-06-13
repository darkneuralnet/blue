package com.uber.autodispose;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
final class AutoDisposeEndConsumerHelper {
    private AutoDisposeEndConsumerHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static String m45230a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m45229b(Class<?> cls) {
        C24508a.m31988u(new ProtocolViolationException(m45230a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m45228c(AtomicReference<InterfaceC46292oT5> atomicReference, InterfaceC46292oT5 interfaceC46292oT5, Class<?> cls) {
        AutoDisposeUtil.m45225a(interfaceC46292oT5, "next is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC46292oT5)) {
            interfaceC46292oT5.cancel();
            if (atomicReference.get() != AutoSubscriptionHelper.CANCELLED) {
                m45229b(cls);
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m45227d(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c, Class<?> cls) {
        AutoDisposeUtil.m45225a(interfaceC23465c, "next is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC23465c)) {
            interfaceC23465c.dispose();
            if (atomicReference.get() != AutoDisposableHelper.DISPOSED) {
                m45229b(cls);
                return false;
            }
            return false;
        }
        return true;
    }
}
