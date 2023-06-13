package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C12136c;
import androidx.work.impl.background.systemalarm.C12137d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p000.OG6;
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
public class C12136c implements EC6, OG6.InterfaceC5933a {

    /* renamed from: n */
    public static final String f56252n = AbstractC32056Bx2.m113270i("DelayMetCommandHandler");

    /* renamed from: b */
    public final Context f56253b;

    /* renamed from: c */
    public final int f56254c;

    /* renamed from: d */
    public final TC6 f56255d;

    /* renamed from: e */
    public final C12137d f56256e;

    /* renamed from: f */
    public final GC6 f56257f;

    /* renamed from: g */
    public final Object f56258g;

    /* renamed from: h */
    public int f56259h;

    /* renamed from: i */
    public final Executor f56260i;

    /* renamed from: j */
    public final Executor f56261j;

    /* renamed from: k */
    public PowerManager.WakeLock f56262k;

    /* renamed from: l */
    public boolean f56263l;

    /* renamed from: m */
    public final C42698iP5 f56264m;

    public C12136c(Context context, int i, C12137d c12137d, C42698iP5 c42698iP5) {
        this.f56253b = context;
        this.f56254c = i;
        this.f56256e = c12137d;
        this.f56255d = c42698iP5.m34016a();
        this.f56264m = c42698iP5;
        C44303l66 m71757t = c12137d.m65503g().m71757t();
        this.f56260i = c12137d.m65504f().mo25425c();
        this.f56261j = c12137d.m65504f().mo25426b();
        this.f56257f = new GC6(m71757t, this);
        this.f56263l = false;
        this.f56259h = 0;
        this.f56258g = new Object();
    }

    @Override // p000.EC6
    /* renamed from: a */
    public void mo64810a(List<HG6> list) {
        this.f56260i.execute(new RunnableC48712sZ0(this));
    }

    @Override // p000.OG6.InterfaceC5933a
    /* renamed from: b */
    public void mo65516b(TC6 tc6) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56252n;
        m113272e.mo113269a(str, "Exceeded time limits on execution for " + tc6);
        this.f56260i.execute(new RunnableC48712sZ0(this));
    }

    /* renamed from: e */
    public final void m65513e() {
        synchronized (this.f56258g) {
            this.f56257f.reset();
            this.f56256e.m65502h().m92582b(this.f56255d);
            PowerManager.WakeLock wakeLock = this.f56262k;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f56252n;
                m113272e.mo113269a(str, "Releasing wakelock " + this.f56262k + "for WorkSpec " + this.f56255d);
                this.f56262k.release();
            }
        }
    }

    @Override // p000.EC6
    /* renamed from: f */
    public void mo64809f(List<HG6> list) {
        for (HG6 hg6 : list) {
            if (KG6.m99055a(hg6).equals(this.f56255d)) {
                this.f56260i.execute(new Runnable() { // from class: tZ0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12136c.this.m65510i();
                    }
                });
                return;
            }
        }
    }

    /* renamed from: g */
    public void m65512g() {
        String m84208b = this.f56255d.m84208b();
        Context context = this.f56253b;
        this.f56262k = C37433Yw6.m73957b(context, m84208b + " (" + this.f56254c + ")");
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56252n;
        m113272e.mo113269a(str, "Acquiring wakelock " + this.f56262k + "for WorkSpec " + m84208b);
        this.f56262k.acquire();
        HG6 mo100756l = this.f56256e.m65503g().m71756u().mo65549I().mo100756l(m84208b);
        if (mo100756l == null) {
            this.f56260i.execute(new RunnableC48712sZ0(this));
            return;
        }
        boolean m104071h = mo100756l.m104071h();
        this.f56263l = m104071h;
        if (!m104071h) {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            m113272e2.mo113269a(str, "No constraints for " + m84208b);
            mo64809f(Collections.singletonList(mo100756l));
            return;
        }
        this.f56257f.mo105647a(Collections.singletonList(mo100756l));
    }

    /* renamed from: h */
    public void m65511h(boolean z) {
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str = f56252n;
        m113272e.mo113269a(str, "onExecuted " + this.f56255d + ", " + z);
        m65513e();
        if (z) {
            this.f56261j.execute(new C12137d.RunnableC12139b(this.f56256e, C12134a.m65530e(this.f56253b, this.f56255d), this.f56254c));
        }
        if (this.f56263l) {
            this.f56261j.execute(new C12137d.RunnableC12139b(this.f56256e, C12134a.m65533a(this.f56253b), this.f56254c));
        }
    }

    /* renamed from: i */
    public final void m65510i() {
        if (this.f56259h == 0) {
            this.f56259h = 1;
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56252n;
            m113272e.mo113269a(str, "onAllConstraintsMet for " + this.f56255d);
            if (this.f56256e.m65505e().m34413p(this.f56264m)) {
                this.f56256e.m65502h().m92583a(this.f56255d, 600000L, this);
                return;
            } else {
                m65513e();
                return;
            }
        }
        AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
        String str2 = f56252n;
        m113272e2.mo113269a(str2, "Already started work for " + this.f56255d);
    }

    /* renamed from: j */
    public final void m65509j() {
        String m84208b = this.f56255d.m84208b();
        if (this.f56259h < 2) {
            this.f56259h = 2;
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f56252n;
            m113272e.mo113269a(str, "Stopping work for WorkSpec " + m84208b);
            this.f56261j.execute(new C12137d.RunnableC12139b(this.f56256e, C12134a.m65529f(this.f56253b, this.f56255d), this.f56254c));
            if (this.f56256e.m65505e().m34418k(this.f56255d.m84208b())) {
                AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
                m113272e2.mo113269a(str, "WorkSpec " + m84208b + " needs to be rescheduled");
                this.f56261j.execute(new C12137d.RunnableC12139b(this.f56256e, C12134a.m65530e(this.f56253b, this.f56255d), this.f56254c));
                return;
            }
            AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
            m113272e3.mo113269a(str, "Processor does not have WorkSpec " + m84208b + ". No need to reschedule");
            return;
        }
        AbstractC32056Bx2 m113272e4 = AbstractC32056Bx2.m113272e();
        String str2 = f56252n;
        m113272e4.mo113269a(str2, "Already stopped work for " + m84208b);
    }
}
