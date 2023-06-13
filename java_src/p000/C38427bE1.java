package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C12120a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.UC6;
/* renamed from: bE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38427bE1 implements InterfaceC51810xm5, EC6, InterfaceC31677Ah1 {

    /* renamed from: k */
    public static final String f57098k = AbstractC32056Bx2.m113270i("GreedyScheduler");

    /* renamed from: b */
    public final Context f57099b;

    /* renamed from: c */
    public final C37830aD6 f57100c;

    /* renamed from: d */
    public final FC6 f57101d;

    /* renamed from: f */
    public C49898uZ0 f57103f;

    /* renamed from: g */
    public boolean f57104g;

    /* renamed from: j */
    public Boolean f57107j;

    /* renamed from: e */
    public final Set<HG6> f57102e = new HashSet();

    /* renamed from: i */
    public final C43291jP5 f57106i = new C43291jP5();

    /* renamed from: h */
    public final Object f57105h = new Object();

    public C38427bE1(Context context, C12120a c12120a, C44303l66 c44303l66, C37830aD6 c37830aD6) {
        this.f57099b = context;
        this.f57100c = c37830aD6;
        this.f57101d = new GC6(c44303l66, this);
        this.f57103f = new C49898uZ0(this, c12120a.m65599k());
    }

    @Override // p000.EC6
    /* renamed from: a */
    public void mo64810a(List<HG6> list) {
        for (HG6 hg6 : list) {
            TC6 m99055a = KG6.m99055a(hg6);
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str = f57098k;
            m113272e.mo113269a(str, "Constraints not met: Cancelling work ID " + m99055a);
            C42698iP5 m30657b = this.f57106i.m30657b(m99055a);
            if (m30657b != null) {
                this.f57100c.m71774D(m30657b);
            }
        }
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: b */
    public void mo4716b(HG6... hg6Arr) {
        if (this.f57107j == null) {
            m64808g();
        }
        if (!this.f57107j.booleanValue()) {
            AbstractC32056Bx2.m113272e().mo113265f(f57098k, "Ignoring schedule request in a secondary process");
            return;
        }
        m64807h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (HG6 hg6 : hg6Arr) {
            if (!this.f57106i.m30658a(KG6.m99055a(hg6))) {
                long m104076c = hg6.m104076c();
                long currentTimeMillis = System.currentTimeMillis();
                if (hg6.f13192b == UC6.EnumC8214a.ENQUEUED) {
                    if (currentTimeMillis < m104076c) {
                        C49898uZ0 c49898uZ0 = this.f57103f;
                        if (c49898uZ0 != null) {
                            c49898uZ0.m10065a(hg6);
                        }
                    } else if (hg6.m104071h()) {
                        if (hg6.f13200j.m26576h()) {
                            AbstractC32056Bx2.m113272e().mo113269a(f57098k, "Ignoring " + hg6 + ". Requires device idle.");
                        } else if (hg6.f13200j.m26579e()) {
                            AbstractC32056Bx2.m113272e().mo113269a(f57098k, "Ignoring " + hg6 + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(hg6);
                            hashSet2.add(hg6.f13191a);
                        }
                    } else if (!this.f57106i.m30658a(KG6.m99055a(hg6))) {
                        AbstractC32056Bx2.m113272e().mo113269a(f57098k, "Starting work for " + hg6.f13191a);
                        this.f57100c.m71777A(this.f57106i.m30654e(hg6));
                    }
                }
            }
        }
        synchronized (this.f57105h) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                AbstractC32056Bx2.m113272e().mo113269a(f57098k, "Starting tracking for " + join);
                this.f57102e.addAll(hashSet);
                this.f57101d.mo105647a(this.f57102e);
            }
        }
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: c */
    public boolean mo4715c() {
        return false;
    }

    @Override // p000.InterfaceC31677Ah1
    /* renamed from: d */
    public void mo34425d(TC6 tc6, boolean z) {
        this.f57106i.m30657b(tc6);
        m64806i(tc6);
    }

    @Override // p000.InterfaceC51810xm5
    /* renamed from: e */
    public void mo4714e(String str) {
        if (this.f57107j == null) {
            m64808g();
        }
        if (!this.f57107j.booleanValue()) {
            AbstractC32056Bx2.m113272e().mo113265f(f57098k, "Ignoring schedule request in non-main process");
            return;
        }
        m64807h();
        AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
        String str2 = f57098k;
        m113272e.mo113269a(str2, "Cancelling work ID " + str);
        C49898uZ0 c49898uZ0 = this.f57103f;
        if (c49898uZ0 != null) {
            c49898uZ0.m10064b(str);
        }
        for (C42698iP5 c42698iP5 : this.f57106i.m30656c(str)) {
            this.f57100c.m71774D(c42698iP5);
        }
    }

    @Override // p000.EC6
    /* renamed from: f */
    public void mo64809f(List<HG6> list) {
        for (HG6 hg6 : list) {
            TC6 m99055a = KG6.m99055a(hg6);
            if (!this.f57106i.m30658a(m99055a)) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                String str = f57098k;
                m113272e.mo113269a(str, "Constraints met: Scheduling work ID " + m99055a);
                this.f57100c.m71777A(this.f57106i.m30655d(m99055a));
            }
        }
    }

    /* renamed from: g */
    public final void m64808g() {
        this.f57107j = Boolean.valueOf(R64.m87314b(this.f57099b, this.f57100c.m71763n()));
    }

    /* renamed from: h */
    public final void m64807h() {
        if (!this.f57104g) {
            this.f57100c.m71759r().m34422g(this);
            this.f57104g = true;
        }
    }

    /* renamed from: i */
    public final void m64806i(TC6 tc6) {
        synchronized (this.f57105h) {
            Iterator<HG6> it = this.f57102e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HG6 next = it.next();
                if (KG6.m99055a(next).equals(tc6)) {
                    AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                    String str = f57098k;
                    m113272e.mo113269a(str, "Stopping tracking for " + tc6);
                    this.f57102e.remove(next);
                    this.f57101d.mo105647a(this.f57102e);
                    break;
                }
            }
        }
    }
}
