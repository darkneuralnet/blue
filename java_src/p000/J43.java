package p000;

import android.view.View;
import android.view.ViewParent;
/* renamed from: J43 */
/* loaded from: classes.dex */
public class J43 {

    /* renamed from: a */
    public ViewParent f16750a;

    /* renamed from: b */
    public ViewParent f16751b;

    /* renamed from: c */
    public final View f16752c;

    /* renamed from: d */
    public boolean f16753d;

    /* renamed from: e */
    public int[] f16754e;

    public J43(View view) {
        this.f16752c = view;
    }

    /* renamed from: a */
    public boolean m101216a(float f, float f2, boolean z) {
        ViewParent m101208i;
        if (!m101204m() || (m101208i = m101208i(0)) == null) {
            return false;
        }
        return C31781As6.m115000a(m101208i, this.f16752c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m101215b(float f, float f2) {
        ViewParent m101208i;
        if (!m101204m() || (m101208i = m101208i(0)) == null) {
            return false;
        }
        return C31781As6.m114999b(m101208i, this.f16752c, f, f2);
    }

    /* renamed from: c */
    public boolean m101214c(int i, int i2, int[] iArr, int[] iArr2) {
        return m101213d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m101213d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m101208i;
        int i4;
        int i5;
        if (!m101204m() || (m101208i = m101208i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f16752c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m101207j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C31781As6.m114998c(m101208i, this.f16752c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f16752c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m101212e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m101209h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m101211f(int i, int i2, int i3, int i4, int[] iArr) {
        return m101209h(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m101210g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m101209h(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: h */
    public final boolean m101209h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m101208i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m101204m() || (m101208i = m101208i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f16752c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m101207j = m101207j();
            m101207j[0] = 0;
            m101207j[1] = 0;
            iArr3 = m101207j;
        } else {
            iArr3 = iArr2;
        }
        C31781As6.m114997d(m101208i, this.f16752c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f16752c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    public final ViewParent m101208i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f16751b;
        }
        return this.f16750a;
    }

    /* renamed from: j */
    public final int[] m101207j() {
        if (this.f16754e == null) {
            this.f16754e = new int[2];
        }
        return this.f16754e;
    }

    /* renamed from: k */
    public boolean m101206k() {
        return m101205l(0);
    }

    /* renamed from: l */
    public boolean m101205l(int i) {
        return m101208i(i) != null;
    }

    /* renamed from: m */
    public boolean m101204m() {
        return this.f16753d;
    }

    /* renamed from: n */
    public void m101203n(boolean z) {
        if (this.f16753d) {
            C38790bq6.m62482g1(this.f16752c);
        }
        this.f16753d = z;
    }

    /* renamed from: o */
    public final void m101202o(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.f16751b = viewParent;
                return;
            }
            return;
        }
        this.f16750a = viewParent;
    }

    /* renamed from: p */
    public boolean m101201p(int i) {
        return m101200q(i, 0);
    }

    /* renamed from: q */
    public boolean m101200q(int i, int i2) {
        if (m101205l(i2)) {
            return true;
        }
        if (m101204m()) {
            View view = this.f16752c;
            for (ViewParent parent = this.f16752c.getParent(); parent != null; parent = parent.getParent()) {
                if (C31781As6.m114995f(parent, view, this.f16752c, i, i2)) {
                    m101202o(i2, parent);
                    C31781As6.m114996e(parent, view, this.f16752c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public void m101199r() {
        m101198s(0);
    }

    /* renamed from: s */
    public void m101198s(int i) {
        ViewParent m101208i = m101208i(i);
        if (m101208i != null) {
            C31781As6.m114994g(m101208i, this.f16752c, i);
            m101202o(i, null);
        }
    }
}
