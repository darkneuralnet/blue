package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Sy3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36044Sy3 {

    /* renamed from: a */
    public final ArrayList<C49940ud3> f34565a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C32855Fi0> f34566b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C5534NG> f34567c = new ArrayList<>();

    /* renamed from: d */
    public String f34568d;

    /* renamed from: a */
    public C36044Sy3 m84532a(String str) {
        this.f34568d = str;
        return this;
    }

    /* renamed from: b */
    public List<C5534NG> m84531b() {
        return new ArrayList(this.f34567c);
    }

    /* renamed from: c */
    public C32855Fi0 m84530c() {
        Iterator<C32855Fi0> it = this.f34566b.iterator();
        while (it.hasNext()) {
            C32855Fi0 next = it.next();
            if (next.m24832c() == EnumC43236jJ4.browser) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public List<C32855Fi0> m84529d() {
        return new ArrayList(this.f34566b);
    }

    /* renamed from: e */
    public List<C49940ud3> m84528e() {
        return new ArrayList(this.f34565a);
    }

    /* renamed from: f */
    public void m84527f(C5534NG c5534ng) {
        this.f34567c.add(c5534ng);
    }

    /* renamed from: g */
    public void m84526g(C32855Fi0 c32855Fi0) {
        this.f34566b.add(c32855Fi0);
    }

    /* renamed from: h */
    public C36044Sy3 m84525h(C49940ud3 c49940ud3) {
        this.f34565a.add(c49940ud3);
        return this;
    }
}
