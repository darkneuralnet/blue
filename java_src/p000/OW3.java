package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.OW3.InterfaceC6024a;
/* renamed from: OW3 */
/* loaded from: classes6.dex */
public class OW3<T extends InterfaceC6024a> {

    /* renamed from: a */
    public final C51351x00 f26721a;

    /* renamed from: b */
    public final int f26722b;

    /* renamed from: c */
    public List<T> f26723c;

    /* renamed from: d */
    public List<OW3<T>> f26724d;

    /* renamed from: OW3$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC6024a {
        /* renamed from: c */
        GW3 mo75547c();
    }

    public OW3(double d, double d2, double d3, double d4) {
        this(new C51351x00(d, d2, d3, d4));
    }

    /* renamed from: a */
    public void m92115a(T t) {
        GW3 mo75547c = t.mo75547c();
        if (this.f26721a.m6009a(mo75547c.f12013a, mo75547c.f12014b)) {
            m92113c(mo75547c.f12013a, mo75547c.f12014b, t);
        }
    }

    /* renamed from: b */
    public void m92114b() {
        this.f26724d = null;
        List<T> list = this.f26723c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: c */
    public final void m92113c(double d, double d2, T t) {
        List<OW3<T>> list = this.f26724d;
        if (list != null) {
            C51351x00 c51351x00 = this.f26721a;
            if (d2 < c51351x00.f116960f) {
                if (d < c51351x00.f116959e) {
                    list.get(0).m92113c(d, d2, t);
                    return;
                } else {
                    list.get(1).m92113c(d, d2, t);
                    return;
                }
            } else if (d < c51351x00.f116959e) {
                list.get(2).m92113c(d, d2, t);
                return;
            } else {
                list.get(3).m92113c(d, d2, t);
                return;
            }
        }
        if (this.f26723c == null) {
            this.f26723c = new ArrayList();
        }
        this.f26723c.add(t);
        if (this.f26723c.size() > 50 && this.f26722b < 40) {
            m92108h();
        }
    }

    /* renamed from: d */
    public final boolean m92112d(double d, double d2, T t) {
        List<OW3<T>> list = this.f26724d;
        if (list != null) {
            C51351x00 c51351x00 = this.f26721a;
            if (d2 < c51351x00.f116960f) {
                if (d < c51351x00.f116959e) {
                    return list.get(0).m92112d(d, d2, t);
                }
                return list.get(1).m92112d(d, d2, t);
            } else if (d < c51351x00.f116959e) {
                return list.get(2).m92112d(d, d2, t);
            } else {
                return list.get(3).m92112d(d, d2, t);
            }
        }
        List<T> list2 = this.f26723c;
        if (list2 == null) {
            return false;
        }
        return list2.remove(t);
    }

    /* renamed from: e */
    public boolean m92111e(T t) {
        GW3 mo75547c = t.mo75547c();
        if (this.f26721a.m6009a(mo75547c.f12013a, mo75547c.f12014b)) {
            return m92112d(mo75547c.f12013a, mo75547c.f12014b, t);
        }
        return false;
    }

    /* renamed from: f */
    public Collection<T> m92110f(C51351x00 c51351x00) {
        ArrayList arrayList = new ArrayList();
        m92109g(c51351x00, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public final void m92109g(C51351x00 c51351x00, Collection<T> collection) {
        if (!this.f26721a.m6005e(c51351x00)) {
            return;
        }
        List<OW3<T>> list = this.f26724d;
        if (list != null) {
            for (OW3<T> ow3 : list) {
                ow3.m92109g(c51351x00, collection);
            }
        } else if (this.f26723c != null) {
            if (c51351x00.m6008b(this.f26721a)) {
                collection.addAll(this.f26723c);
                return;
            }
            for (T t : this.f26723c) {
                if (c51351x00.m6007c(t.mo75547c())) {
                    collection.add(t);
                }
            }
        }
    }

    /* renamed from: h */
    public final void m92108h() {
        ArrayList arrayList = new ArrayList(4);
        this.f26724d = arrayList;
        C51351x00 c51351x00 = this.f26721a;
        arrayList.add(new OW3(c51351x00.f116955a, c51351x00.f116959e, c51351x00.f116956b, c51351x00.f116960f, this.f26722b + 1));
        List<OW3<T>> list = this.f26724d;
        C51351x00 c51351x002 = this.f26721a;
        list.add(new OW3<>(c51351x002.f116959e, c51351x002.f116957c, c51351x002.f116956b, c51351x002.f116960f, this.f26722b + 1));
        List<OW3<T>> list2 = this.f26724d;
        C51351x00 c51351x003 = this.f26721a;
        list2.add(new OW3<>(c51351x003.f116955a, c51351x003.f116959e, c51351x003.f116960f, c51351x003.f116958d, this.f26722b + 1));
        List<OW3<T>> list3 = this.f26724d;
        C51351x00 c51351x004 = this.f26721a;
        list3.add(new OW3<>(c51351x004.f116959e, c51351x004.f116957c, c51351x004.f116960f, c51351x004.f116958d, this.f26722b + 1));
        List<T> list4 = this.f26723c;
        this.f26723c = null;
        for (T t : list4) {
            m92113c(t.mo75547c().f12013a, t.mo75547c().f12014b, t);
        }
    }

    public OW3(C51351x00 c51351x00) {
        this(c51351x00, 0);
    }

    public OW3(double d, double d2, double d3, double d4, int i) {
        this(new C51351x00(d, d2, d3, d4), i);
    }

    public OW3(C51351x00 c51351x00, int i) {
        this.f26724d = null;
        this.f26721a = c51351x00;
        this.f26722b = i;
    }
}
