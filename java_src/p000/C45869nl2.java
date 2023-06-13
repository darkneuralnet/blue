package p000;

import java.security.GeneralSecurityException;
import p000.C44090kl2;
/* renamed from: nl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45869nl2 {

    /* renamed from: a */
    public final C44090kl2.C25224b f100470a;

    public C45869nl2(C44090kl2.C25224b c25224b) {
        this.f100470a = c25224b;
    }

    /* renamed from: i */
    public static C45869nl2 m23215i() {
        return new C45869nl2(C44090kl2.m28515O());
    }

    /* renamed from: j */
    public static C45869nl2 m23214j(C44683ll2 c44683ll2) {
        return new C45869nl2(c44683ll2.m26875f().toBuilder());
    }

    /* renamed from: a */
    public synchronized C45869nl2 m23223a(C33811Jk2 c33811Jk2) throws GeneralSecurityException {
        m23222b(c33811Jk2.m99872b(), false);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public synchronized int m23222b(C34045Kk2 c34045Kk2, boolean z) throws GeneralSecurityException {
        C44090kl2.C25225c m23218f;
        m23218f = m23218f(c34045Kk2);
        this.f100470a.m28509y(m23218f);
        if (z) {
            this.f100470a.m28510C(m23218f.m28501L());
        }
        return m23218f.m28501L();
    }

    /* renamed from: c */
    public final synchronized C44090kl2.C25225c m23221c(C42301hk2 c42301hk2, EnumC40189eA3 enumC40189eA3) throws GeneralSecurityException {
        int m23217g;
        m23217g = m23217g();
        if (enumC40189eA3 != EnumC40189eA3.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return C44090kl2.C25225c.m28497P().m28490y(c42301hk2).m28489z(m23217g).m28491B(EnumC33577Ik2.ENABLED).m28492A(enumC40189eA3).build();
    }

    /* renamed from: d */
    public synchronized C44683ll2 m23220d() throws GeneralSecurityException {
        return C44683ll2.m26876e(this.f100470a.build());
    }

    /* renamed from: e */
    public final synchronized boolean m23219e(int i) {
        for (C44090kl2.C25225c c25225c : this.f100470a.m28511B()) {
            if (c25225c.m28501L() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final synchronized C44090kl2.C25225c m23218f(C34045Kk2 c34045Kk2) throws GeneralSecurityException {
        return m23221c(C34830Nt4.m93224j(c34045Kk2), c34045Kk2.m98331K());
    }

    /* renamed from: g */
    public final synchronized int m23217g() {
        int m13789b;
        m13789b = C48807si6.m13789b();
        while (m23219e(m13789b)) {
            m13789b = C48807si6.m13789b();
        }
        return m13789b;
    }

    /* renamed from: h */
    public synchronized C45869nl2 m23216h(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.f100470a.m28512A(); i2++) {
            C44090kl2.C25225c m28508z = this.f100470a.m28508z(i2);
            if (m28508z.m28501L() == i) {
                if (m28508z.m28499N().equals(EnumC33577Ik2.ENABLED)) {
                    this.f100470a.m28510C(i);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
