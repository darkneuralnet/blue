package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p000.Y70;
/* renamed from: d80  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39574d80 extends Thread {

    /* renamed from: h */
    public static final boolean f76150h = C34841Nu6.f25359b;

    /* renamed from: b */
    public final BlockingQueue<AbstractC45006mI4<?>> f76151b;

    /* renamed from: c */
    public final BlockingQueue<AbstractC45006mI4<?>> f76152c;

    /* renamed from: d */
    public final Y70 f76153d;

    /* renamed from: e */
    public final IM4 f76154e;

    /* renamed from: f */
    public volatile boolean f76155f = false;

    /* renamed from: g */
    public final C49540tw6 f76156g;

    /* renamed from: d80$a */
    /* loaded from: classes.dex */
    public class RunnableC19679a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC45006mI4 f76157b;

        public RunnableC19679a(AbstractC45006mI4 abstractC45006mI4) {
            this.f76157b = abstractC45006mI4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C39574d80.this.f76152c.put(this.f76157b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C39574d80(BlockingQueue<AbstractC45006mI4<?>> blockingQueue, BlockingQueue<AbstractC45006mI4<?>> blockingQueue2, Y70 y70, IM4 im4) {
        this.f76151b = blockingQueue;
        this.f76152c = blockingQueue2;
        this.f76153d = y70;
        this.f76154e = im4;
        this.f76156g = new C49540tw6(this, blockingQueue2, im4);
    }

    /* renamed from: b */
    private void m44586b() throws InterruptedException {
        m44585c(this.f76151b.take());
    }

    /* renamed from: c */
    public void m44585c(AbstractC45006mI4<?> abstractC45006mI4) throws InterruptedException {
        abstractC45006mI4.addMarker("cache-queue-take");
        abstractC45006mI4.sendEvent(1);
        try {
            if (abstractC45006mI4.isCanceled()) {
                abstractC45006mI4.finish("cache-discard-canceled");
                return;
            }
            Y70.C9639a c9639a = this.f76153d.get(abstractC45006mI4.getCacheKey());
            if (c9639a == null) {
                abstractC45006mI4.addMarker("cache-miss");
                if (!this.f76156g.m11187c(abstractC45006mI4)) {
                    this.f76152c.put(abstractC45006mI4);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (c9639a.m75666b(currentTimeMillis)) {
                abstractC45006mI4.addMarker("cache-hit-expired");
                abstractC45006mI4.setCacheEntry(c9639a);
                if (!this.f76156g.m11187c(abstractC45006mI4)) {
                    this.f76152c.put(abstractC45006mI4);
                }
                return;
            }
            abstractC45006mI4.addMarker("cache-hit");
            EM4<?> parseNetworkResponse = abstractC45006mI4.parseNetworkResponse(new O73(c9639a.f44574a, c9639a.f44580g));
            abstractC45006mI4.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.m109112b()) {
                abstractC45006mI4.addMarker("cache-parsing-failed");
                this.f76153d.mo4202d(abstractC45006mI4.getCacheKey(), true);
                abstractC45006mI4.setCacheEntry(null);
                if (!this.f76156g.m11187c(abstractC45006mI4)) {
                    this.f76152c.put(abstractC45006mI4);
                }
                return;
            }
            if (!c9639a.m75665c(currentTimeMillis)) {
                this.f76154e.mo102457a(abstractC45006mI4, parseNetworkResponse);
            } else {
                abstractC45006mI4.addMarker("cache-hit-refresh-needed");
                abstractC45006mI4.setCacheEntry(c9639a);
                parseNetworkResponse.f7351d = true;
                if (!this.f76156g.m11187c(abstractC45006mI4)) {
                    this.f76154e.mo102455c(abstractC45006mI4, parseNetworkResponse, new RunnableC19679a(abstractC45006mI4));
                } else {
                    this.f76154e.mo102457a(abstractC45006mI4, parseNetworkResponse);
                }
            }
        } finally {
            abstractC45006mI4.sendEvent(2);
        }
    }

    /* renamed from: d */
    public void m44584d() {
        this.f76155f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f76150h) {
            C34841Nu6.m93202e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f76153d.mo4203c();
        while (true) {
            try {
                m44586b();
            } catch (InterruptedException unused) {
                if (this.f76155f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C34841Nu6.m93204c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
