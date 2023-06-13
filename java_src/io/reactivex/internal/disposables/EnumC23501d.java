package io.reactivex.internal.disposables;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.disposables.d */
/* loaded from: classes7.dex */
public enum EnumC23501d implements InterfaceC23465c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m33000a(AtomicReference<InterfaceC23465c> atomicReference) {
        InterfaceC23465c andSet;
        InterfaceC23465c interfaceC23465c = atomicReference.get();
        EnumC23501d enumC23501d = DISPOSED;
        if (interfaceC23465c != enumC23501d && (andSet = atomicReference.getAndSet(enumC23501d)) != enumC23501d) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m32999b(InterfaceC23465c interfaceC23465c) {
        return interfaceC23465c == DISPOSED;
    }

    /* renamed from: c */
    public static boolean m32998c(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c) {
        InterfaceC23465c interfaceC23465c2;
        do {
            interfaceC23465c2 = atomicReference.get();
            if (interfaceC23465c2 == DISPOSED) {
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                    return false;
                }
                return false;
            }
        } while (!C42482i24.m35337a(atomicReference, interfaceC23465c2, interfaceC23465c));
        return true;
    }

    /* renamed from: d */
    public static void m32997d() {
        C24508a.m31988u(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: g */
    public static boolean m32996g(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c) {
        InterfaceC23465c interfaceC23465c2;
        do {
            interfaceC23465c2 = atomicReference.get();
            if (interfaceC23465c2 == DISPOSED) {
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                    return false;
                }
                return false;
            }
        } while (!C42482i24.m35337a(atomicReference, interfaceC23465c2, interfaceC23465c));
        if (interfaceC23465c2 != null) {
            interfaceC23465c2.dispose();
            return true;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m32995h(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c) {
        C23544b.m32923e(interfaceC23465c, "d is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC23465c)) {
            interfaceC23465c.dispose();
            if (atomicReference.get() != DISPOSED) {
                m32997d();
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m32994i(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23465c interfaceC23465c) {
        if (!C42482i24.m35337a(atomicReference, null, interfaceC23465c)) {
            if (atomicReference.get() == DISPOSED) {
                interfaceC23465c.dispose();
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m32993j(InterfaceC23465c interfaceC23465c, InterfaceC23465c interfaceC23465c2) {
        if (interfaceC23465c2 == null) {
            C24508a.m31988u(new NullPointerException("next is null"));
            return false;
        } else if (interfaceC23465c != null) {
            interfaceC23465c2.dispose();
            m32997d();
            return false;
        } else {
            return true;
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return true;
    }
}
