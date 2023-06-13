package p000;

import android.graphics.DashPathEffect;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Xu */
/* loaded from: classes5.dex */
public abstract class AbstractC9544Xu extends AbstractC34817Ns0 {

    /* renamed from: g */
    public AbstractC33806Jj6 f44173g;

    /* renamed from: n */
    public int f44180n;

    /* renamed from: o */
    public int f44181o;

    /* renamed from: z */
    public List<C38203ar2> f44192z;

    /* renamed from: h */
    public int f44174h = -7829368;

    /* renamed from: i */
    public float f44175i = 1.0f;

    /* renamed from: j */
    public int f44176j = -7829368;

    /* renamed from: k */
    public float f44177k = 1.0f;

    /* renamed from: l */
    public float[] f44178l = new float[0];

    /* renamed from: m */
    public float[] f44179m = new float[0];

    /* renamed from: p */
    public int f44182p = 6;

    /* renamed from: q */
    public float f44183q = 1.0f;

    /* renamed from: r */
    public boolean f44184r = false;

    /* renamed from: s */
    public boolean f44185s = false;

    /* renamed from: t */
    public boolean f44186t = true;

    /* renamed from: u */
    public boolean f44187u = true;

    /* renamed from: v */
    public boolean f44188v = true;

    /* renamed from: w */
    public boolean f44189w = false;

    /* renamed from: x */
    public DashPathEffect f44190x = null;

    /* renamed from: y */
    public DashPathEffect f44191y = null;

    /* renamed from: A */
    public boolean f44164A = false;

    /* renamed from: B */
    public boolean f44165B = true;

    /* renamed from: C */
    public float f44166C = 0.0f;

    /* renamed from: D */
    public float f44167D = 0.0f;

    /* renamed from: E */
    public boolean f44168E = false;

    /* renamed from: F */
    public boolean f44169F = false;

    /* renamed from: G */
    public float f44170G = 0.0f;

    /* renamed from: H */
    public float f44171H = 0.0f;

    /* renamed from: I */
    public float f44172I = 0.0f;

    public AbstractC9544Xu() {
        this.f25314e = AbstractC34967Oi6.m91656e(10.0f);
        this.f25311b = AbstractC34967Oi6.m91656e(5.0f);
        this.f25312c = AbstractC34967Oi6.m91656e(5.0f);
        this.f44192z = new ArrayList();
    }

    /* renamed from: A */
    public boolean m76152A() {
        return this.f44188v;
    }

    /* renamed from: B */
    public boolean m76151B() {
        return this.f44164A;
    }

    /* renamed from: C */
    public boolean m76150C() {
        return this.f44185s;
    }

    /* renamed from: D */
    public boolean m76149D() {
        return this.f44184r;
    }

    /* renamed from: E */
    public void m76148E() {
        this.f44192z.clear();
    }

    /* renamed from: F */
    public void m76147F(float f) {
        this.f44169F = true;
        this.f44170G = f;
        this.f44172I = Math.abs(f - this.f44171H);
    }

    /* renamed from: G */
    public void m76146G(float f) {
        this.f44168E = true;
        this.f44171H = f;
        this.f44172I = Math.abs(this.f44170G - f);
    }

    /* renamed from: H */
    public void m76145H(boolean z) {
        this.f44186t = z;
    }

    /* renamed from: I */
    public void m76144I(boolean z) {
        this.f44188v = z;
    }

    /* renamed from: J */
    public void m76143J(boolean z) {
        this.f44164A = z;
    }

    /* renamed from: K */
    public void m76142K(int i) {
        if (i > 25) {
            i = 25;
        }
        if (i < 2) {
            i = 2;
        }
        this.f44182p = i;
        this.f44185s = false;
    }

    /* renamed from: L */
    public void m76141L(int i, boolean z) {
        m76142K(i);
        this.f44185s = z;
    }

    /* renamed from: M */
    public void m76140M(float f) {
        this.f44167D = f;
    }

    /* renamed from: N */
    public void m76139N(float f) {
        this.f44166C = f;
    }

    /* renamed from: O */
    public void m76138O(AbstractC33806Jj6 abstractC33806Jj6) {
        if (abstractC33806Jj6 == null) {
            this.f44173g = new C48685sW0(this.f44181o);
        } else {
            this.f44173g = abstractC33806Jj6;
        }
    }

    /* renamed from: i */
    public void m76137i(C38203ar2 c38203ar2) {
        this.f44192z.add(c38203ar2);
        if (this.f44192z.size() > 6) {
            Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
        }
    }

    /* renamed from: j */
    public void mo71674j(float f, float f2) {
        float f3;
        float f4;
        if (this.f44168E) {
            f3 = this.f44171H;
        } else {
            f3 = f - this.f44166C;
        }
        if (this.f44169F) {
            f4 = this.f44170G;
        } else {
            f4 = f2 + this.f44167D;
        }
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.f44171H = f3;
        this.f44170G = f4;
        this.f44172I = Math.abs(f4 - f3);
    }

    /* renamed from: k */
    public int m76136k() {
        return this.f44176j;
    }

    /* renamed from: l */
    public DashPathEffect m76135l() {
        return this.f44190x;
    }

    /* renamed from: m */
    public float m76134m() {
        return this.f44177k;
    }

    /* renamed from: n */
    public String m76133n(int i) {
        if (i >= 0 && i < this.f44178l.length) {
            return m76125v().mo58186a(this.f44178l[i], this);
        }
        return "";
    }

    /* renamed from: o */
    public float m76132o() {
        return this.f44183q;
    }

    /* renamed from: p */
    public int m76131p() {
        return this.f44174h;
    }

    /* renamed from: q */
    public DashPathEffect m76130q() {
        return this.f44191y;
    }

    /* renamed from: r */
    public float m76129r() {
        return this.f44175i;
    }

    /* renamed from: s */
    public int m76128s() {
        return this.f44182p;
    }

    /* renamed from: t */
    public List<C38203ar2> m76127t() {
        return this.f44192z;
    }

    /* renamed from: u */
    public String m76126u() {
        String str = "";
        for (int i = 0; i < this.f44178l.length; i++) {
            String m76133n = m76133n(i);
            if (m76133n != null && str.length() < m76133n.length()) {
                str = m76133n;
            }
        }
        return str;
    }

    /* renamed from: v */
    public AbstractC33806Jj6 m76125v() {
        AbstractC33806Jj6 abstractC33806Jj6 = this.f44173g;
        if (abstractC33806Jj6 == null || ((abstractC33806Jj6 instanceof C48685sW0) && ((C48685sW0) abstractC33806Jj6).m14122j() != this.f44181o)) {
            this.f44173g = new C48685sW0(this.f44181o);
        }
        return this.f44173g;
    }

    /* renamed from: w */
    public boolean m76124w() {
        return this.f44189w && this.f44180n > 0;
    }

    /* renamed from: x */
    public boolean m76123x() {
        return this.f44187u;
    }

    /* renamed from: y */
    public boolean m76122y() {
        return this.f44165B;
    }

    /* renamed from: z */
    public boolean m76121z() {
        return this.f44186t;
    }
}
