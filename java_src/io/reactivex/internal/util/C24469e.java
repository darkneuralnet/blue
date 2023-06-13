package io.reactivex.internal.util;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.schedulers.InterfaceC24430i;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.CountDownLatch;
/* renamed from: io.reactivex.internal.util.e */
/* loaded from: classes8.dex */
public final class C24469e {
    private C24469e() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m32269a(CountDownLatch countDownLatch, InterfaceC23465c interfaceC23465c) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            m32268b();
            countDownLatch.await();
        } catch (InterruptedException e) {
            interfaceC23465c.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }

    /* renamed from: b */
    public static void m32268b() {
        if (C24508a.m31998k()) {
            if ((Thread.currentThread() instanceof InterfaceC24430i) || C24508a.m31990s()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
