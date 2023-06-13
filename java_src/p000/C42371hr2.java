package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: hr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42371hr2 {

    /* renamed from: a */
    public C38409bC1 f85994a;

    /* renamed from: b */
    public C46712pA3 f85995b;

    /* renamed from: c */
    public int f85996c;

    /* renamed from: d */
    public int f85997d;

    /* renamed from: e */
    public boolean f85998e;

    /* renamed from: f */
    public boolean f85999f = true;

    /* renamed from: g */
    public boolean f86000g = true;

    /* renamed from: h */
    public List<C32002Br2> f86001h = new ArrayList();

    public C42371hr2(C40711f32 c40711f32, C46712pA3 c46712pA3, boolean z, int i, C38409bC1 c38409bC1) {
        this.f85995b = c46712pA3;
        this.f85996c = i;
        this.f85994a = c38409bC1;
        this.f85998e = z;
        this.f85997d = c40711f32.m42231a();
    }

    /* renamed from: b */
    public static int m35759b(C47305qA3 c47305qA3, int i) {
        if (c47305qA3.m18010q(i) || c47305qA3.m18004w(i)) {
            return 0;
        }
        return c47305qA3.m18024c(i);
    }

    /* renamed from: a */
    public final void m35760a() {
        for (C45526nA3 c45526nA3 : this.f85995b.m19849b()) {
            if (c45526nA3.m24263E() && !c45526nA3.m24260H()) {
                this.f86001h.add(m35754g(c45526nA3));
                c45526nA3.m24256L();
            }
        }
    }

    /* renamed from: c */
    public List<C32002Br2> m35758c() {
        m35756e();
        m35760a();
        return this.f86001h;
    }

    /* renamed from: d */
    public final boolean m35757d(C47305qA3 c47305qA3) {
        if (c47305qA3.m18012o()) {
            return false;
        }
        if ((!this.f86000g && c47305qA3.m18014m()) || c47305qA3.m18007t()) {
            return false;
        }
        if (this.f85996c != 1) {
            if (c47305qA3.m18009r()) {
                return false;
            }
            if (this.f85998e && c47305qA3.m18003x(this.f85997d)) {
                return false;
            }
        }
        if (this.f85999f && this.f85996c == 1 && c47305qA3.m18011p()) {
            return true;
        }
        return C49083tA3.m12946g(this.f85996c, m35759b(c47305qA3, 0), m35759b(c47305qA3, 1));
    }

    /* renamed from: e */
    public final void m35756e() {
        for (C45526nA3 c45526nA3 : this.f85995b.m19849b()) {
            if (!c45526nA3.m24264D() && m35757d(c45526nA3.m24237x())) {
                c45526nA3.m24258J();
            }
        }
    }

    /* renamed from: f */
    public void m35755f(boolean z) {
        this.f86000g = !z;
        this.f85999f = !z;
    }

    /* renamed from: g */
    public final C32002Br2 m35754g(C45526nA3 c45526nA3) {
        boolean m24235z = c45526nA3.m24235z();
        DB0 db0 = new DB0();
        db0.m110797f(c45526nA3.m107413m(), false);
        c45526nA3.m24244q(db0);
        return this.f85994a.m64848g(db0.m110793w(m24235z));
    }
}
