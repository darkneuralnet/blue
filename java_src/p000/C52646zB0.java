package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* renamed from: zB0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C52646zB0 implements EB0, Serializable {
    private static final long serialVersionUID = -915438501601840650L;

    /* renamed from: b */
    public int f120902b;

    /* renamed from: c */
    public int f120903c;

    /* renamed from: d */
    public C52053yB0[] f120904d;

    public C52646zB0(C52053yB0[] c52053yB0Arr) {
        this(c52053yB0Arr, BB0.m114285a(c52053yB0Arr), BB0.m114281e(c52053yB0Arr));
    }

    @Override // p000.EB0
    /* renamed from: F */
    public int mo1717F() {
        return this.f120902b;
    }

    @Override // p000.EB0
    /* renamed from: N0 */
    public double mo1716N0(int i) {
        return this.f120904d[i].f118923c;
    }

    @Override // p000.EB0
    /* renamed from: T */
    public void mo1715T(int i, C52053yB0 c52053yB0) {
        c52053yB0.mo3879o(this.f120904d[i]);
    }

    @Override // p000.EB0
    /* renamed from: W0 */
    public double mo1714W0(int i) {
        if (m109310k2()) {
            return this.f120904d[i].mo3881m();
        }
        return Double.NaN;
    }

    @Override // p000.EB0
    /* renamed from: a3 */
    public double mo1713a3(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return this.f120904d[i].mo3884j(i2);
            }
            return this.f120904d[i].f118923c;
        }
        return this.f120904d[i].f118922b;
    }

    @Override // p000.EB0
    /* renamed from: b2 */
    public C52053yB0[] mo1712b2() {
        return this.f120904d;
    }

    public Object clone() {
        return copy();
    }

    @Override // p000.EB0
    /* renamed from: d */
    public C52646zB0 copy() {
        C52053yB0[] c52053yB0Arr = new C52053yB0[size()];
        for (int i = 0; i < this.f120904d.length; i++) {
            C52053yB0 m109311R = m109311R();
            m109311R.mo3879o(this.f120904d[i]);
            c52053yB0Arr[i] = m109311R;
        }
        return new C52646zB0(c52053yB0Arr, this.f120902b, this.f120903c);
    }

    @Override // p000.EB0
    /* renamed from: e3 */
    public int mo1710e3() {
        return this.f120903c;
    }

    @Override // p000.EB0
    /* renamed from: m0 */
    public C48772sf1 mo1709m0(C48772sf1 c48772sf1) {
        int i = 0;
        while (true) {
            C52053yB0[] c52053yB0Arr = this.f120904d;
            if (i < c52053yB0Arr.length) {
                c48772sf1.m13874k(c52053yB0Arr[i]);
                i++;
            } else {
                return c48772sf1;
            }
        }
    }

    @Override // p000.EB0
    /* renamed from: n2 */
    public double mo1708n2(int i) {
        return this.f120904d[i].f118922b;
    }

    @Override // p000.EB0
    public int size() {
        return this.f120904d.length;
    }

    public String toString() {
        C52053yB0[] c52053yB0Arr = this.f120904d;
        if (c52053yB0Arr.length > 0) {
            StringBuilder sb = new StringBuilder(c52053yB0Arr.length * 17);
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(this.f120904d[0]);
            for (int i = 1; i < this.f120904d.length; i++) {
                sb.append(", ");
                sb.append(this.f120904d[i]);
            }
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }
        return "()";
    }

    @Override // p000.EB0
    /* renamed from: u */
    public C52053yB0 mo1707u(int i) {
        return this.f120904d[i];
    }

    @Override // p000.EB0
    /* renamed from: v3 */
    public double mo1706v3(int i) {
        if (m109312K2()) {
            return this.f120904d[i].mo3885h();
        }
        return Double.NaN;
    }

    @Override // p000.EB0
    /* renamed from: y1 */
    public void mo1705y1(int i, int i2, double d) {
        if (i2 != 0) {
            if (i2 != 1) {
                this.f120904d[i].mo3878p(i2, d);
                return;
            } else {
                this.f120904d[i].f118923c = d;
                return;
            }
        }
        this.f120904d[i].f118922b = d;
    }

    public C52646zB0(C52053yB0[] c52053yB0Arr, int i, int i2) {
        this.f120902b = i;
        this.f120903c = i2;
        if (c52053yB0Arr == null) {
            this.f120904d = new C52053yB0[0];
        } else {
            this.f120904d = c52053yB0Arr;
        }
    }

    public C52646zB0(int i, int i2) {
        this.f120902b = 3;
        this.f120903c = 0;
        this.f120904d = new C52053yB0[i];
        this.f120902b = i2;
        for (int i3 = 0; i3 < i; i3++) {
            this.f120904d[i3] = MB0.m95610a(i2);
        }
    }

    public C52646zB0(int i, int i2, int i3) {
        this.f120902b = 3;
        this.f120903c = 0;
        this.f120904d = new C52053yB0[i];
        this.f120902b = i2;
        this.f120903c = i3;
        for (int i4 = 0; i4 < i; i4++) {
            this.f120904d[i4] = m109311R();
        }
    }
}
