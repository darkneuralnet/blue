package p000;

import java.util.ArrayDeque;
import java.util.Queue;
/* renamed from: RN6 */
/* loaded from: classes6.dex */
public final class RN6<ResultT> {

    /* renamed from: a */
    public final Object f31982a = new Object();

    /* renamed from: b */
    public Queue<GN6<ResultT>> f31983b;

    /* renamed from: c */
    public boolean f31984c;

    /* renamed from: a */
    public final void m86788a(GN6<ResultT> gn6) {
        synchronized (this.f31982a) {
            if (this.f31983b == null) {
                this.f31983b = new ArrayDeque();
            }
            this.f31983b.add(gn6);
        }
    }

    /* renamed from: b */
    public final void m86787b(XY5<ResultT> xy5) {
        GN6<ResultT> poll;
        synchronized (this.f31982a) {
            if (this.f31983b != null && !this.f31984c) {
                this.f31984c = true;
                while (true) {
                    synchronized (this.f31982a) {
                        poll = this.f31983b.poll();
                        if (poll == null) {
                            this.f31984c = false;
                            return;
                        }
                    }
                    poll.mo5321a(xy5);
                }
            }
        }
    }
}
