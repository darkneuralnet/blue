package p000;
/* renamed from: jp */
/* loaded from: classes8.dex */
public class RunnableC25027jp implements Runnable, JY3 {

    /* renamed from: b */
    public final C40926fQ3 f93389b = new C40926fQ3();

    /* renamed from: c */
    public final C31902Bg1 f93390c;

    public RunnableC25027jp(C31902Bg1 c31902Bg1) {
        this.f93390c = c31902Bg1;
    }

    @Override // p000.JY3
    /* renamed from: a */
    public void mo29884a(C46885pT5 c46885pT5, Object obj) {
        this.f93389b.m41410a(C40333eQ3.m42887a(c46885pT5, obj));
        this.f93390c.m113707d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        C40333eQ3 m41409b = this.f93389b.m41409b();
        if (m41409b != null) {
            this.f93390c.m113704g(m41409b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
