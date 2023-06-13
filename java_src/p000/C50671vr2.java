package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: vr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50671vr2 {

    /* renamed from: a */
    public C48772sf1 f114790a;

    /* renamed from: b */
    public DB0 f114791b;

    /* renamed from: c */
    public C52053yB0 f114792c = null;

    /* renamed from: d */
    public List<C52053yB0[]> f114793d = null;

    public C50671vr2(C48772sf1 c48772sf1) {
        this.f114790a = c48772sf1;
    }

    /* renamed from: a */
    public final void m7925a(C52053yB0 c52053yB0) {
        if (!m7922d(c52053yB0)) {
            m7923c();
        } else {
            m7924b(this.f114792c);
            m7924b(c52053yB0);
        }
        this.f114792c = c52053yB0;
    }

    /* renamed from: b */
    public final void m7924b(C52053yB0 c52053yB0) {
        if (c52053yB0 == null) {
            return;
        }
        m7919g();
        this.f114791b.m110797f(c52053yB0, false);
    }

    /* renamed from: c */
    public final void m7923c() {
        DB0 db0 = this.f114791b;
        if (db0 == null) {
            return;
        }
        C52053yB0 c52053yB0 = this.f114792c;
        if (c52053yB0 != null) {
            db0.m110797f(c52053yB0, false);
            this.f114792c = null;
        }
        this.f114793d.add(this.f114791b.m110799b2());
        this.f114791b = null;
    }

    /* renamed from: d */
    public final boolean m7922d(C52053yB0 c52053yB0) {
        C52053yB0 c52053yB02 = this.f114792c;
        if (c52053yB02 == null) {
            if (m7921e()) {
                return true;
            }
            return false;
        }
        return this.f114790a.m13890F(c52053yB02, c52053yB0);
    }

    /* renamed from: e */
    public final boolean m7921e() {
        return this.f114791b != null;
    }

    /* renamed from: f */
    public List<C52053yB0[]> m7920f(C52053yB0[] c52053yB0Arr) {
        this.f114792c = null;
        this.f114791b = null;
        this.f114793d = new ArrayList();
        for (C52053yB0 c52053yB0 : c52053yB0Arr) {
            if (this.f114790a.m13891E(c52053yB0)) {
                m7924b(c52053yB0);
            } else {
                m7925a(c52053yB0);
            }
        }
        m7923c();
        return this.f114793d;
    }

    /* renamed from: g */
    public final void m7919g() {
        if (this.f114791b == null) {
            this.f114791b = new DB0();
        }
        C52053yB0 c52053yB0 = this.f114792c;
        if (c52053yB0 != null) {
            this.f114791b.m110797f(c52053yB0, false);
        }
        this.f114792c = null;
    }
}
