package com.uber.autodispose;

import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes7.dex */
enum AutoSubscriptionHelper implements InterfaceC46292oT5 {
    CANCELLED;

    /* renamed from: a */
    public static boolean m45224a(AtomicReference<InterfaceC46292oT5> atomicReference) {
        InterfaceC46292oT5 andSet;
        InterfaceC46292oT5 interfaceC46292oT5 = atomicReference.get();
        AutoSubscriptionHelper autoSubscriptionHelper = CANCELLED;
        if (interfaceC46292oT5 != autoSubscriptionHelper && (andSet = atomicReference.getAndSet(autoSubscriptionHelper)) != autoSubscriptionHelper) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m45223b(AtomicReference<InterfaceC46292oT5> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC46292oT5 interfaceC46292oT5 = atomicReference.get();
        if (interfaceC46292oT5 != null) {
            interfaceC46292oT5.mo21023o(j);
        } else if (m45219f(j)) {
            AutoDisposeBackpressureHelper.m45232a(atomicLong, j);
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
    public static boolean m45222c(AtomicReference<InterfaceC46292oT5> atomicReference, AtomicLong atomicLong, InterfaceC46292oT5 interfaceC46292oT5) {
        if (m45220e(atomicReference, interfaceC46292oT5)) {
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
    public static void m45221d() {
        C24508a.m31988u(new IllegalStateException("Subscription already set!"));
    }

    /* renamed from: e */
    public static boolean m45220e(AtomicReference<InterfaceC46292oT5> atomicReference, InterfaceC46292oT5 interfaceC46292oT5) {
        AutoDisposeUtil.m45225a(interfaceC46292oT5, "s is null");
        if (!C42482i24.m35337a(atomicReference, null, interfaceC46292oT5)) {
            interfaceC46292oT5.cancel();
            if (atomicReference.get() != CANCELLED) {
                m45221d();
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m45219f(long j) {
        if (j <= 0) {
            C24508a.m31988u(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
    }
}
