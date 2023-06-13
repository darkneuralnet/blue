package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.C23564i;
import io.reactivex.internal.observers.C23574s;
import io.reactivex.internal.util.C24469e;
import io.reactivex.internal.util.C24470f;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24479n;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: io.reactivex.internal.operators.observable.l */
/* loaded from: classes6.dex */
public final class C24215l {
    private C24215l() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> void m32497a(InterfaceC23434B<? extends T> interfaceC23434B) {
        C24470f c24470f = new C24470f();
        C23574s c23574s = new C23574s(C23506a.m32967g(), c24470f, c24470f, C23506a.m32967g());
        interfaceC23434B.subscribe(c23574s);
        C24469e.m32269a(c24470f, c23574s);
        Throwable th = c24470f.f91069b;
        if (th == null) {
            return;
        }
        throw C24475k.m32256e(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> void m32496b(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23436D<? super T> interfaceC23436D) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C23564i c23564i = new C23564i(linkedBlockingQueue);
        interfaceC23436D.onSubscribe(c23564i);
        interfaceC23434B.subscribe(c23564i);
        while (!c23564i.mo1769e()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    c23564i.dispose();
                    interfaceC23436D.onError(e);
                    return;
                }
            }
            if (c23564i.mo1769e() || poll == C23564i.f88302c || EnumC24479n.m32244d(poll, interfaceC23436D)) {
                return;
            }
            while (!c23564i.mo1769e()) {
            }
        }
    }

    /* renamed from: c */
    public static <T> void m32495c(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a) {
        C23544b.m32923e(interfaceC23484g, "onNext is null");
        C23544b.m32923e(interfaceC23484g2, "onError is null");
        C23544b.m32923e(interfaceC23478a, "onComplete is null");
        m32496b(interfaceC23434B, new C23574s(interfaceC23484g, interfaceC23484g2, interfaceC23478a, C23506a.m32967g()));
    }
}
