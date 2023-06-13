package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* renamed from: Ss5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35992Ss5 implements InterfaceExecutorC35758Rs5 {

    /* renamed from: c */
    public final Executor f34388c;

    /* renamed from: d */
    public Runnable f34389d;

    /* renamed from: b */
    public final ArrayDeque<RunnableC7569a> f34387b = new ArrayDeque<>();

    /* renamed from: e */
    public final Object f34390e = new Object();

    /* renamed from: Ss5$a */
    /* loaded from: classes.dex */
    public static class RunnableC7569a implements Runnable {

        /* renamed from: b */
        public final C35992Ss5 f34391b;

        /* renamed from: c */
        public final Runnable f34392c;

        public RunnableC7569a(C35992Ss5 c35992Ss5, Runnable runnable) {
            this.f34391b = c35992Ss5;
            this.f34392c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34392c.run();
                synchronized (this.f34391b.f34390e) {
                    this.f34391b.m84691a();
                }
            } catch (Throwable th) {
                synchronized (this.f34391b.f34390e) {
                    this.f34391b.m84691a();
                    throw th;
                }
            }
        }
    }

    public C35992Ss5(Executor executor) {
        this.f34388c = executor;
    }

    /* renamed from: a */
    public void m84691a() {
        RunnableC7569a poll = this.f34387b.poll();
        this.f34389d = poll;
        if (poll != null) {
            this.f34388c.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f34390e) {
            this.f34387b.add(new RunnableC7569a(this, runnable));
            if (this.f34389d == null) {
                m84691a();
            }
        }
    }

    @Override // p000.InterfaceExecutorC35758Rs5
    /* renamed from: v */
    public boolean mo84690v() {
        boolean z;
        synchronized (this.f34390e) {
            if (!this.f34387b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
