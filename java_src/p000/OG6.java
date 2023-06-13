package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: OG6 */
/* loaded from: classes.dex */
public class OG6 {

    /* renamed from: e */
    public static final String f26276e = AbstractC32056Bx2.m113270i("WorkTimer");

    /* renamed from: a */
    public final InterfaceC41048fd5 f26277a;

    /* renamed from: b */
    public final Map<TC6, RunnableC5934b> f26278b = new HashMap();

    /* renamed from: c */
    public final Map<TC6, InterfaceC5933a> f26279c = new HashMap();

    /* renamed from: d */
    public final Object f26280d = new Object();

    /* renamed from: OG6$a */
    /* loaded from: classes.dex */
    public interface InterfaceC5933a {
        /* renamed from: b */
        void mo65516b(TC6 tc6);
    }

    /* renamed from: OG6$b */
    /* loaded from: classes.dex */
    public static class RunnableC5934b implements Runnable {

        /* renamed from: b */
        public final OG6 f26281b;

        /* renamed from: c */
        public final TC6 f26282c;

        public RunnableC5934b(OG6 og6, TC6 tc6) {
            this.f26281b = og6;
            this.f26282c = tc6;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f26281b.f26280d) {
                if (this.f26281b.f26278b.remove(this.f26282c) != null) {
                    InterfaceC5933a remove = this.f26281b.f26279c.remove(this.f26282c);
                    if (remove != null) {
                        remove.mo65516b(this.f26282c);
                    }
                } else {
                    AbstractC32056Bx2.m113272e().mo113269a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f26282c));
                }
            }
        }
    }

    public OG6(InterfaceC41048fd5 interfaceC41048fd5) {
        this.f26277a = interfaceC41048fd5;
    }

    /* renamed from: a */
    public void m92583a(TC6 tc6, long j, InterfaceC5933a interfaceC5933a) {
        synchronized (this.f26280d) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f26276e;
            m113272e.mo113269a(str, "Starting timer for " + tc6);
            m92582b(tc6);
            RunnableC5934b runnableC5934b = new RunnableC5934b(this, tc6);
            this.f26278b.put(tc6, runnableC5934b);
            this.f26279c.put(tc6, interfaceC5933a);
            this.f26277a.mo8499b(j, runnableC5934b);
        }
    }

    /* renamed from: b */
    public void m92582b(TC6 tc6) {
        synchronized (this.f26280d) {
            if (this.f26278b.remove(tc6) != null) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f26276e;
                m113272e.mo113269a(str, "Stopping timer for " + tc6);
                this.f26279c.remove(tc6);
            }
        }
    }
}
