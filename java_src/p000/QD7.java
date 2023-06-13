package p000;

import java.util.Map;
/* renamed from: QD7 */
/* loaded from: classes5.dex */
public final class QD7 extends AbstractC35301Pt7 {

    /* renamed from: b */
    public final Object f30060b;

    /* renamed from: c */
    public int f30061c;

    /* renamed from: d */
    public final /* synthetic */ C50910wF7 f30062d;

    public QD7(C50910wF7 c50910wF7, int i) {
        this.f30062d = c50910wF7;
        this.f30060b = C50910wF7.m7075i(c50910wF7, i);
        this.f30061c = i;
    }

    /* renamed from: a */
    public final void m88730a() {
        int m7060x;
        int i = this.f30061c;
        if (i != -1 && i < this.f30062d.size() && C45986nw9.m22158a(this.f30060b, C50910wF7.m7075i(this.f30062d, this.f30061c))) {
            return;
        }
        m7060x = this.f30062d.m7060x(this.f30060b);
        this.f30061c = m7060x;
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object getKey() {
        return this.f30060b;
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object getValue() {
        Map m7070n = this.f30062d.m7070n();
        if (m7070n != null) {
            return m7070n.get(this.f30060b);
        }
        m88730a();
        int i = this.f30061c;
        if (i == -1) {
            return null;
        }
        return C50910wF7.m7072l(this.f30062d, i);
    }

    @Override // p000.AbstractC35301Pt7, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m7070n = this.f30062d.m7070n();
        if (m7070n != null) {
            return m7070n.put(this.f30060b, obj);
        }
        m88730a();
        int i = this.f30061c;
        if (i == -1) {
            this.f30062d.put(this.f30060b, obj);
            return null;
        }
        Object m7072l = C50910wF7.m7072l(this.f30062d, i);
        C50910wF7.m7069o(this.f30062d, this.f30061c, obj);
        return m7072l;
    }
}
