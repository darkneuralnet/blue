package p000;

import java.util.logging.Level;
/* renamed from: cw */
/* loaded from: classes8.dex */
public final class RunnableC19644cw implements Runnable, JY3 {

    /* renamed from: b */
    public final C40926fQ3 f75879b = new C40926fQ3();

    /* renamed from: c */
    public final C31902Bg1 f75880c;

    /* renamed from: d */
    public volatile boolean f75881d;

    public RunnableC19644cw(C31902Bg1 c31902Bg1) {
        this.f75880c = c31902Bg1;
    }

    @Override // p000.JY3
    /* renamed from: a */
    public void mo29884a(C46885pT5 c46885pT5, Object obj) {
        C40333eQ3 m42887a = C40333eQ3.m42887a(c46885pT5, obj);
        synchronized (this) {
            this.f75879b.m41410a(m42887a);
            if (!this.f75881d) {
                this.f75881d = true;
                this.f75880c.m113707d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                C40333eQ3 m41408c = this.f75879b.m41408c(1000);
                if (m41408c == null) {
                    synchronized (this) {
                        m41408c = this.f75879b.m41409b();
                        if (m41408c == null) {
                            return;
                        }
                    }
                }
                this.f75880c.m113704g(m41408c);
            } catch (InterruptedException e) {
                InterfaceC52510yx2 m113706e = this.f75880c.m113706e();
                Level level = Level.WARNING;
                m113706e.mo2218b(level, Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.f75881d = false;
            }
        }
    }
}
