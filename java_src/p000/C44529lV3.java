package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: lV3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44529lV3 {

    /* renamed from: a */
    public List f96263a;

    /* renamed from: b */
    public N83 f96264b;

    /* renamed from: c */
    public List f96265c;

    public C44529lV3(J83 j83) {
        this.f96263a = new ArrayList();
        this.f96265c = new ArrayList();
        this.f96264b = new N83(j83);
    }

    /* renamed from: j */
    public static void m27204j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((C44278l41) ((D83) it.next()).m110883k()).m27969p();
        }
    }

    /* renamed from: a */
    public void m27213a(C50256v91 c50256v91) {
        this.f96264b.m94325a(c50256v91);
        this.f96265c.add(c50256v91);
    }

    /* renamed from: b */
    public void m27212b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) it.next();
            this.f96263a.add(c47293q91);
            C43685k41 c43685k41 = new C43685k41(c47293q91, true);
            C43685k41 c43685k412 = new C43685k41(c47293q91, false);
            c43685k41.m29378H(c43685k412);
            c43685k412.m29378H(c43685k41);
            m27213a(c43685k41);
            m27213a(c43685k412);
        }
    }

    /* renamed from: c */
    public D83 m27211c(C52053yB0 c52053yB0) {
        return this.f96264b.m94324b(c52053yB0);
    }

    /* renamed from: d */
    public Collection m27210d() {
        return this.f96265c;
    }

    /* renamed from: e */
    public Iterator m27209e() {
        return this.f96263a.iterator();
    }

    /* renamed from: f */
    public Iterator m27208f() {
        return this.f96264b.m94321e();
    }

    /* renamed from: g */
    public Collection m27207g() {
        return this.f96264b.m94320f();
    }

    /* renamed from: h */
    public void m27206h(C47293q91 c47293q91) {
        this.f96263a.add(c47293q91);
    }

    /* renamed from: i */
    public boolean m27205i(int i, C52053yB0 c52053yB0) {
        C35926Sl2 m85838b;
        D83 m94323c = this.f96264b.m94323c(c52053yB0);
        if (m94323c == null || (m85838b = m94323c.m85838b()) == null || m85838b.m84874d(i) != 1) {
            return false;
        }
        return true;
    }

    public C44529lV3() {
        this.f96263a = new ArrayList();
        this.f96265c = new ArrayList();
        this.f96264b = new N83(new J83());
    }
}
