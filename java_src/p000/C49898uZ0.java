package p000;

import java.util.HashMap;
import java.util.Map;
/* renamed from: uZ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49898uZ0 {

    /* renamed from: d */
    public static final String f112608d = AbstractC32056Bx2.m113270i("DelayedWorkTracker");

    /* renamed from: a */
    public final C38427bE1 f112609a;

    /* renamed from: b */
    public final InterfaceC41048fd5 f112610b;

    /* renamed from: c */
    public final Map<String, Runnable> f112611c = new HashMap();

    /* renamed from: uZ0$a */
    /* loaded from: classes.dex */
    public class RunnableC29254a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ HG6 f112612b;

        public RunnableC29254a(HG6 hg6) {
            this.f112612b = hg6;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = C49898uZ0.f112608d;
            m113272e.mo113269a(str, "Scheduling work " + this.f112612b.f13191a);
            C49898uZ0.this.f112609a.mo4716b(this.f112612b);
        }
    }

    public C49898uZ0(C38427bE1 c38427bE1, InterfaceC41048fd5 interfaceC41048fd5) {
        this.f112609a = c38427bE1;
        this.f112610b = interfaceC41048fd5;
    }

    /* renamed from: a */
    public void m10065a(HG6 hg6) {
        Runnable remove = this.f112611c.remove(hg6.f13191a);
        if (remove != null) {
            this.f112610b.mo8500a(remove);
        }
        RunnableC29254a runnableC29254a = new RunnableC29254a(hg6);
        this.f112611c.put(hg6.f13191a, runnableC29254a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f112610b.mo8499b(hg6.m104076c() - currentTimeMillis, runnableC29254a);
    }

    /* renamed from: b */
    public void m10064b(String str) {
        Runnable remove = this.f112611c.remove(str);
        if (remove != null) {
            this.f112610b.mo8500a(remove);
        }
    }
}
