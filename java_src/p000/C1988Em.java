package p000;

import java.util.concurrent.Executor;
/* renamed from: Em */
/* loaded from: classes.dex */
public class C1988Em extends AbstractC45753nZ5 {

    /* renamed from: c */
    public static volatile C1988Em f8092c;

    /* renamed from: d */
    public static final Executor f8093d = new Executor() { // from class: Cm
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C1988Em.m108394j(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f8094e = new Executor() { // from class: Dm
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C1988Em.m108393k(runnable);
        }
    };

    /* renamed from: a */
    public AbstractC45753nZ5 f8095a;

    /* renamed from: b */
    public final AbstractC45753nZ5 f8096b;

    private C1988Em() {
        MY0 my0 = new MY0();
        this.f8096b = my0;
        this.f8095a = my0;
    }

    /* renamed from: g */
    public static Executor m108397g() {
        return f8094e;
    }

    /* renamed from: h */
    public static C1988Em m108396h() {
        if (f8092c != null) {
            return f8092c;
        }
        synchronized (C1988Em.class) {
            if (f8092c == null) {
                f8092c = new C1988Em();
            }
        }
        return f8092c;
    }

    /* renamed from: i */
    public static Executor m108395i() {
        return f8093d;
    }

    /* renamed from: j */
    public static /* synthetic */ void m108394j(Runnable runnable) {
        m108396h().mo23533d(runnable);
    }

    /* renamed from: k */
    public static /* synthetic */ void m108393k(Runnable runnable) {
        m108396h().mo23536a(runnable);
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: a */
    public void mo23536a(Runnable runnable) {
        this.f8095a.mo23536a(runnable);
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: c */
    public boolean mo23534c() {
        return this.f8095a.mo23534c();
    }

    @Override // p000.AbstractC45753nZ5
    /* renamed from: d */
    public void mo23533d(Runnable runnable) {
        this.f8095a.mo23533d(runnable);
    }
}
