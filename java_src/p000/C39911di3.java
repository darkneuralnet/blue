package p000;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
/* renamed from: di3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39911di3 {

    /* renamed from: a */
    public final PriorityBlockingQueue<C37302Yi1> f77078a = new PriorityBlockingQueue<>();

    /* renamed from: a */
    public void m43875a(C37302Yi1 c37302Yi1) {
        this.f77078a.add(c37302Yi1);
    }

    /* renamed from: b */
    public boolean m43874b() {
        return this.f77078a.isEmpty();
    }

    /* renamed from: c */
    public boolean m43873c(C37302Yi1 c37302Yi1) {
        Iterator<C37302Yi1> it = this.f77078a.iterator();
        while (it.hasNext()) {
            C37302Yi1 next = it.next();
            if (next == c37302Yi1) {
                return this.f77078a.remove(next);
            }
        }
        return false;
    }

    /* renamed from: d */
    public C37302Yi1<?> m43872d() throws InterruptedException {
        return this.f77078a.take();
    }

    /* renamed from: e */
    public C37302Yi1<?> m43871e() {
        return this.f77078a.poll();
    }
}
