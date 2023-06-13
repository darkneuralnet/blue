package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.subscriptions.g */
/* loaded from: classes8.dex */
public enum EnumC24463g implements InterfaceC46292oT5 {
    CANCELLED;

    /* renamed from: a */
    public static boolean m32294a(AtomicReference<InterfaceC46292oT5> atomicReference) {
        InterfaceC46292oT5 andSet;
        InterfaceC46292oT5 interfaceC46292oT5 = atomicReference.get();
        EnumC24463g enumC24463g = CANCELLED;
        if (interfaceC46292oT5 != enumC24463g && (andSet = atomicReference.getAndSet(enumC24463g)) != enumC24463g) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m32293b(AtomicReference<InterfaceC46292oT5> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC46292oT5 interfaceC46292oT5 = atomicReference.get();
        if (interfaceC46292oT5 != null) {
            interfaceC46292oT5.mo21023o(j);
        } else if (m32287h(j)) {
            C24468d.m32274a(atomicLong, j);
            InterfaceC46292oT5 interfaceC46292oT52 = atomicReference.get();
            if (interfaceC46292oT52 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC46292oT52.mo21023o(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m32292c(AtomicReference<InterfaceC46292oT5> atomicReference, AtomicLong atomicLong, InterfaceC46292oT5 interfaceC46292oT5) {
        if (m32289f(atomicReference, interfaceC46292oT5)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC46292oT5.mo21023o(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m32291d(long j) {
        C24508a.m31988u(new ProtocolViolationException("More produced than requested: " + j));
    }

    /* renamed from: e */
    public static void m32290e() {
        C24508a.m31988u(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: f */
    public static boolean m32289f(AtomicReference<InterfaceC46292oT5> atomicReference, InterfaceC46292oT5 interfaceC46292oT5) {
        C23544b.m32923e(interfaceC46292oT5, "s is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC46292oT5)) {
            interfaceC46292oT5.cancel();
            if (atomicReference.get() != CANCELLED) {
                m32290e();
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m32288g(AtomicReference<InterfaceC46292oT5> atomicReference, InterfaceC46292oT5 interfaceC46292oT5, long j) {
        if (m32289f(atomicReference, interfaceC46292oT5)) {
            interfaceC46292oT5.mo21023o(j);
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m32287h(long j) {
        if (j <= 0) {
            C24508a.m31988u(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m32286i(InterfaceC46292oT5 interfaceC46292oT5, InterfaceC46292oT5 interfaceC46292oT52) {
        if (interfaceC46292oT52 == null) {
            C24508a.m31988u(new NullPointerException("next is null"));
            return false;
        } else if (interfaceC46292oT5 != null) {
            interfaceC46292oT52.cancel();
            m32290e();
            return false;
        } else {
            return true;
        }
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
    }
}
