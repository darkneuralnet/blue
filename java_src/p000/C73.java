package p000;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.util.concurrent.BlockingQueue;
/* renamed from: C73 */
/* loaded from: classes.dex */
public class C73 extends Thread {

    /* renamed from: b */
    public final BlockingQueue<AbstractC45006mI4<?>> f3408b;

    /* renamed from: c */
    public final InterfaceC49646u73 f3409c;

    /* renamed from: d */
    public final Y70 f3410d;

    /* renamed from: e */
    public final IM4 f3411e;

    /* renamed from: f */
    public volatile boolean f3412f = false;

    public C73(BlockingQueue<AbstractC45006mI4<?>> blockingQueue, InterfaceC49646u73 interfaceC49646u73, Y70 y70, IM4 im4) {
        this.f3408b = blockingQueue;
        this.f3409c = interfaceC49646u73;
        this.f3410d = y70;
        this.f3411e = im4;
    }

    /* renamed from: c */
    private void m112879c() throws InterruptedException {
        m112878d(this.f3408b.take());
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void m112881a(AbstractC45006mI4<?> abstractC45006mI4) {
        TrafficStats.setThreadStatsTag(abstractC45006mI4.getTrafficStatsTag());
    }

    /* renamed from: b */
    public final void m112880b(AbstractC45006mI4<?> abstractC45006mI4, VolleyError volleyError) {
        this.f3411e.mo102456b(abstractC45006mI4, abstractC45006mI4.parseNetworkError(volleyError));
    }

    /* renamed from: d */
    public void m112878d(AbstractC45006mI4<?> abstractC45006mI4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        abstractC45006mI4.sendEvent(3);
        try {
            try {
                try {
                    abstractC45006mI4.addMarker("network-queue-take");
                } catch (VolleyError e) {
                    e.m53506a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m112880b(abstractC45006mI4, e);
                    abstractC45006mI4.notifyListenerResponseNotUsable();
                }
            } catch (Exception e2) {
                C34841Nu6.m93203d(e2, "Unhandled exception %s", e2.toString());
                VolleyError volleyError = new VolleyError(e2);
                volleyError.m53506a(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f3411e.mo102456b(abstractC45006mI4, volleyError);
                abstractC45006mI4.notifyListenerResponseNotUsable();
            }
            if (abstractC45006mI4.isCanceled()) {
                abstractC45006mI4.finish("network-discard-cancelled");
                abstractC45006mI4.notifyListenerResponseNotUsable();
                return;
            }
            m112881a(abstractC45006mI4);
            O73 mo10844a = this.f3409c.mo10844a(abstractC45006mI4);
            abstractC45006mI4.addMarker("network-http-complete");
            if (mo10844a.f25922e && abstractC45006mI4.hasHadResponseDelivered()) {
                abstractC45006mI4.finish("not-modified");
                abstractC45006mI4.notifyListenerResponseNotUsable();
                return;
            }
            EM4<?> parseNetworkResponse = abstractC45006mI4.parseNetworkResponse(mo10844a);
            abstractC45006mI4.addMarker("network-parse-complete");
            if (abstractC45006mI4.shouldCache() && parseNetworkResponse.f7349b != null) {
                this.f3410d.mo4201e(abstractC45006mI4.getCacheKey(), parseNetworkResponse.f7349b);
                abstractC45006mI4.addMarker("network-cache-written");
            }
            abstractC45006mI4.markDelivered();
            this.f3411e.mo102457a(abstractC45006mI4, parseNetworkResponse);
            abstractC45006mI4.notifyListenerResponseReceived(parseNetworkResponse);
        } finally {
            abstractC45006mI4.sendEvent(4);
        }
    }

    /* renamed from: e */
    public void m112877e() {
        this.f3412f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m112879c();
            } catch (InterruptedException unused) {
                if (this.f3412f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C34841Nu6.m93204c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
