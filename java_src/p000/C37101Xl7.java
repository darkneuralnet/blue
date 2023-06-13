package p000;

import java.util.Map;
/* renamed from: Xl7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37101Xl7 extends AbstractC41825gv9 {

    /* renamed from: b */
    public final Object f43891b;

    /* renamed from: c */
    public int f43892c;

    /* renamed from: d */
    public final /* synthetic */ C34545Mn7 f43893d;

    public C37101Xl7(C34545Mn7 c34545Mn7, int i) {
        this.f43893d = c34545Mn7;
        this.f43891b = C34545Mn7.m94816i(c34545Mn7, i);
        this.f43892c = i;
    }

    /* renamed from: a */
    public final void m76368a() {
        int m94801x;
        int i = this.f43892c;
        if (i != -1 && i < this.f43893d.size() && QX7.m88418a(this.f43891b, C34545Mn7.m94816i(this.f43893d, this.f43892c))) {
            return;
        }
        m94801x = this.f43893d.m94801x(this.f43891b);
        this.f43892c = m94801x;
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object getKey() {
        return this.f43891b;
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object getValue() {
        Map m94811n = this.f43893d.m94811n();
        if (m94811n != null) {
            return m94811n.get(this.f43891b);
        }
        m76368a();
        int i = this.f43892c;
        if (i == -1) {
            return null;
        }
        return C34545Mn7.m94813l(this.f43893d, i);
    }

    @Override // p000.AbstractC41825gv9, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m94811n = this.f43893d.m94811n();
        if (m94811n != null) {
            return m94811n.put(this.f43891b, obj);
        }
        m76368a();
        int i = this.f43892c;
        if (i == -1) {
            this.f43893d.put(this.f43891b, obj);
            return null;
        }
        Object m94813l = C34545Mn7.m94813l(this.f43893d, i);
        C34545Mn7.m94810o(this.f43893d, this.f43892c, obj);
        return m94813l;
    }
}
