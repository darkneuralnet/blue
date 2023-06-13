package io.reactivex.internal.util;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.util.i */
/* loaded from: classes8.dex */
public final class C24473i {
    private C24473i() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static String m32264a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: b */
    public static void m32263b(Class<?> cls) {
        C24508a.m31988u(new ProtocolViolationException(m32264a(cls.getName())));
    }

    /* renamed from: c */
    public static boolean m32262c(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c, Class<?> cls) {
        C23544b.m32923e(interfaceC23465c, "next is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC23465c)) {
            interfaceC23465c.dispose();
            if (atomicReference.get() != EnumC23501d.DISPOSED) {
                m32263b(cls);
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m32261d(InterfaceC23465c interfaceC23465c, InterfaceC23465c interfaceC23465c2, Class<?> cls) {
        C23544b.m32923e(interfaceC23465c2, "next is null");
        if (interfaceC23465c != null) {
            interfaceC23465c2.dispose();
            if (interfaceC23465c != EnumC23501d.DISPOSED) {
                m32263b(cls);
                return false;
            }
            return false;
        }
        return true;
    }
}
