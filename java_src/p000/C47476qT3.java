package p000;

import com.github.mikephil.charting.data.Entry;
/* renamed from: qT3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47476qT3 extends AbstractC42872ii0<XO1> {
    @Override // p000.AbstractC42872ii0
    /* renamed from: h */
    public Entry mo17498h(OM1 om1) {
        return m17497s().mo21237h((int) om1.m92387h());
    }

    /* renamed from: s */
    public XO1 m17497s() {
        return (XO1) this.f87774i.get(0);
    }

    @Override // p000.AbstractC42872ii0
    /* renamed from: t */
    public XO1 mo17499d(int i) {
        if (i == 0) {
            return m17497s();
        }
        return null;
    }

    /* renamed from: u */
    public float m17495u() {
        float f = 0.0f;
        for (int i = 0; i < m17497s().mo21241L0(); i++) {
            f += m17497s().mo21237h(i).mo51938c();
        }
        return f;
    }
}
