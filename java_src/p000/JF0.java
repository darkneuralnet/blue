package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.Serializable;
/* renamed from: JF0 */
/* loaded from: classes8.dex */
public final class JF0 implements Serializable, Comparable, Cloneable {

    /* renamed from: d */
    public static final JF0 f17071d = new JF0(3.141592653589793d, 1.2246467991473532E-16d);

    /* renamed from: e */
    public static final JF0 f17072e = new JF0(6.283185307179586d, 2.4492935982947064E-16d);

    /* renamed from: f */
    public static final JF0 f17073f = new JF0(1.5707963267948966d, 6.123233995736766E-17d);

    /* renamed from: g */
    public static final JF0 f17074g = new JF0(2.718281828459045d, 1.4456468917292502E-16d);

    /* renamed from: h */
    public static final JF0 f17075h = new JF0(Double.NaN, Double.NaN);

    /* renamed from: i */
    public static final JF0 f17076i = m100916l0(10.0d);

    /* renamed from: j */
    public static final JF0 f17077j = m100916l0(1.0d);

    /* renamed from: b */
    public double f17078b = 0.0d;

    /* renamed from: c */
    public double f17079c = 0.0d;

    public JF0() {
        m100915m(0.0d);
    }

    /* renamed from: f */
    public static JF0 m100926f(JF0 jf0) {
        return new JF0(jf0);
    }

    /* renamed from: f0 */
    public static String m100925f0(char c, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    /* renamed from: g */
    public static JF0 m100924g() {
        return new JF0(Double.NaN, Double.NaN);
    }

    /* renamed from: l0 */
    public static JF0 m100916l0(double d) {
        return new JF0(d);
    }

    /* renamed from: w */
    public static int m100908w(double d) {
        double abs = Math.abs(d);
        int floor = (int) Math.floor(Math.log(abs) / Math.log(10.0d));
        if (Math.pow(10.0d, floor) * 10.0d <= abs) {
            return floor + 1;
        }
        return floor;
    }

    /* renamed from: H */
    public final JF0 m100940H(JF0 jf0) {
        if (jf0.m100912p()) {
            return m100924g();
        }
        return m100926f(this).m100932Z(jf0);
    }

    /* renamed from: J */
    public final JF0 m100939J() {
        if (m100912p()) {
            return this;
        }
        return new JF0(-this.f17078b, -this.f17079c);
    }

    /* renamed from: M */
    public JF0 m100938M(int i) {
        if (i == 0.0d) {
            return m100916l0(1.0d);
        }
        JF0 jf0 = new JF0(this);
        JF0 m100916l0 = m100916l0(1.0d);
        int abs = Math.abs(i);
        if (abs > 1) {
            while (abs > 0) {
                if (abs % 2 == 1) {
                    m100916l0.m100932Z(jf0);
                }
                abs /= 2;
                if (abs > 0) {
                    jf0 = jf0.m100927e0();
                }
            }
            jf0 = m100916l0;
        }
        if (i < 0) {
            return jf0.m100937N();
        }
        return jf0;
    }

    /* renamed from: N */
    public final JF0 m100937N() {
        double d = this.f17078b;
        double d2 = 1.0d / d;
        double d3 = d2 * 1.34217729E8d;
        double d4 = 1.34217729E8d * d;
        double d5 = d3 - (d3 - d2);
        double d6 = d2 - d5;
        double d7 = d2 * d;
        double d8 = d4 - (d4 - d);
        double d9 = d - d8;
        double d10 = (((1.0d - d7) - (((((d5 * d8) - d7) + (d5 * d9)) + (d8 * d6)) + (d6 * d9))) - (this.f17079c * d2)) / d;
        double d11 = d2 + d10;
        return new JF0(d11, (d2 - d11) + d10);
    }

    /* renamed from: P */
    public final JF0 m100936P(double d) {
        double d2 = this.f17078b;
        double d3 = d2 + d;
        double d4 = d3 - d2;
        double d5 = (d - d4) + (d2 - (d3 - d4)) + this.f17079c;
        double d6 = d3 + d5;
        double d7 = d5 + (d3 - d6);
        double d8 = d6 + d7;
        this.f17078b = d8;
        this.f17079c = d7 + (d6 - d8);
        return this;
    }

    /* renamed from: U */
    public final JF0 m100935U(double d, double d2) {
        double d3 = this.f17078b;
        double d4 = d3 + d;
        double d5 = this.f17079c;
        double d6 = d5 + d2;
        double d7 = d4 - d3;
        double d8 = d6 - d5;
        double d9 = (d - d7) + (d3 - (d4 - d7));
        double d10 = (d2 - d8) + (d5 - (d6 - d8));
        double d11 = d9 + d6;
        double d12 = d4 + d11;
        double d13 = d10 + d11 + (d4 - d12);
        double d14 = d12 + d13;
        this.f17078b = d14;
        this.f17079c = d13 + (d12 - d14);
        return this;
    }

    /* renamed from: W */
    public final JF0 m100934W(JF0 jf0) {
        return m100935U(jf0.f17078b, jf0.f17079c);
    }

    /* renamed from: Y */
    public final JF0 m100933Y(double d, double d2) {
        double d3 = this.f17078b;
        double d4 = d3 * 1.34217729E8d;
        double d5 = 1.34217729E8d * d;
        double d6 = d4 - (d4 - d3);
        double d7 = d3 - d6;
        double d8 = d3 * d;
        double d9 = d5 - (d5 - d);
        double d10 = d - d9;
        double d11 = ((d6 * d9) - d8) + (d6 * d10) + (d9 * d7) + (d7 * d10) + (d3 * d2) + (this.f17079c * d);
        double d12 = d8 + d11;
        this.f17078b = d12;
        this.f17079c = d11 + (d8 - d12);
        return this;
    }

    /* renamed from: Z */
    public final JF0 m100932Z(JF0 jf0) {
        return m100933Y(jf0.f17078b, jf0.f17079c);
    }

    /* renamed from: c0 */
    public final JF0 m100931c0(JF0 jf0) {
        if (m100912p()) {
            return this;
        }
        return m100935U(-jf0.f17078b, -jf0.f17079c);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        JF0 jf0 = (JF0) obj;
        double d = this.f17078b;
        double d2 = jf0.f17078b;
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        double d3 = this.f17079c;
        double d4 = jf0.f17079c;
        if (d3 < d4) {
            return -1;
        }
        if (d3 > d4) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public JF0 m100930d() {
        if (m100912p()) {
            return f17075h;
        }
        if (m100911q()) {
            return m100939J();
        }
        return new JF0(this);
    }

    /* renamed from: d0 */
    public int m100929d0() {
        double d = this.f17078b;
        if (d > 0.0d) {
            return 1;
        }
        if (d < 0.0d) {
            return -1;
        }
        double d2 = this.f17079c;
        if (d2 > 0.0d) {
            return 1;
        }
        if (d2 < 0.0d) {
            return -1;
        }
        return 0;
    }

    /* renamed from: e */
    public final JF0 m100928e(JF0 jf0) {
        return m100926f(this).m100934W(jf0);
    }

    /* renamed from: e0 */
    public JF0 m100927e0() {
        return m100940H(this);
    }

    /* renamed from: g0 */
    public final JF0 m100923g0(JF0 jf0) {
        return m100928e(jf0.m100939J());
    }

    /* renamed from: h */
    public final JF0 m100922h(JF0 jf0) {
        double d = this.f17078b;
        double d2 = jf0.f17078b;
        double d3 = d / d2;
        double d4 = d3 * 1.34217729E8d;
        double d5 = 1.34217729E8d * d2;
        double d6 = d4 - (d4 - d3);
        double d7 = d3 - d6;
        double d8 = d3 * d2;
        double d9 = d5 - (d5 - d2);
        double d10 = d2 - d9;
        double d11 = ((((d - d8) - (((((d6 * d9) - d8) + (d6 * d10)) + (d9 * d7)) + (d7 * d10))) + this.f17079c) - (jf0.f17079c * d3)) / d2;
        double d12 = d3 + d11;
        return new JF0(d12, (d3 - d12) + d11);
    }

    /* renamed from: h0 */
    public String m100921h0() {
        int[] iArr;
        String str;
        if (m100910r()) {
            return "0.0E0";
        }
        String m100919k = m100919k();
        if (m100919k != null) {
            return m100919k;
        }
        String m100920j = m100920j(false, new int[1]);
        String str2 = "E" + iArr[0];
        if (m100920j.charAt(0) != '0') {
            if (m100920j.length() > 1) {
                str = m100920j.substring(1);
            } else {
                str = "";
            }
            String str3 = m100920j.charAt(0) + InstructionFileId.DOT + str;
            if (m100911q()) {
                return Detail.EMPTY_CHAR + str3 + str2;
            }
            return str3 + str2;
        }
        throw new IllegalStateException("Found leading zero: " + m100920j);
    }

    /* renamed from: j */
    public final String m100920j(boolean z, int[] iArr) {
        char c;
        boolean z2;
        JF0 m100930d = m100930d();
        int m100908w = m100908w(m100930d.f17078b);
        JF0 jf0 = f17076i;
        JF0 m100922h = m100930d.m100922h(jf0.m100938M(m100908w));
        if (m100922h.m100917l(jf0)) {
            m100922h = m100922h.m100922h(jf0);
            m100908w++;
        } else if (m100922h.m100909t(f17077j)) {
            m100922h = m100922h.m100940H(jf0);
            m100908w--;
        }
        int i = m100908w + 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 <= 31; i2++) {
            if (z && i2 == i) {
                stringBuffer.append(CoreConstants.DOT);
            }
            int i3 = (int) m100922h.f17078b;
            if (i3 < 0) {
                break;
            }
            boolean z3 = true;
            if (i3 > 9) {
                c = '9';
                z2 = true;
            } else {
                c = (char) (i3 + 48);
                z2 = false;
            }
            stringBuffer.append(c);
            JF0 m100923g0 = m100922h.m100923g0(m100916l0(i3));
            JF0 jf02 = f17076i;
            m100922h = m100923g0.m100940H(jf02);
            if (z2) {
                m100922h.m100934W(jf02);
            }
            int m100908w2 = m100908w(m100922h.f17078b);
            if (m100908w2 < 0 && Math.abs(m100908w2) >= 31 - i2) {
                z3 = false;
            }
            if (!z3) {
                break;
            }
        }
        iArr[0] = m100908w;
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public final String m100919k() {
        if (m100910r()) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        if (m100912p()) {
            return "NaN ";
        }
        return null;
    }

    /* renamed from: k0 */
    public String m100918k0() {
        String m100919k = m100919k();
        if (m100919k != null) {
            return m100919k;
        }
        int[] iArr = new int[1];
        String m100920j = m100920j(true, iArr);
        int i = iArr[0] + 1;
        if (m100920j.charAt(0) == '.') {
            m100920j = "0" + m100920j;
        } else if (i < 0) {
            m100920j = "0." + m100925f0('0', -i) + m100920j;
        } else if (m100920j.indexOf(46) == -1) {
            m100920j = m100920j + m100925f0('0', i - m100920j.length()) + ".0";
        }
        if (m100911q()) {
            return Detail.EMPTY_CHAR + m100920j;
        }
        return m100920j;
    }

    /* renamed from: l */
    public boolean m100917l(JF0 jf0) {
        double d = this.f17078b;
        double d2 = jf0.f17078b;
        return d > d2 || (d == d2 && this.f17079c > jf0.f17079c);
    }

    /* renamed from: m */
    public final void m100915m(double d) {
        this.f17078b = d;
        this.f17079c = 0.0d;
    }

    /* renamed from: n */
    public final void m100914n(double d, double d2) {
        this.f17078b = d;
        this.f17079c = d2;
    }

    /* renamed from: o */
    public final void m100913o(JF0 jf0) {
        this.f17078b = jf0.f17078b;
        this.f17079c = jf0.f17079c;
    }

    /* renamed from: p */
    public boolean m100912p() {
        return Double.isNaN(this.f17078b);
    }

    /* renamed from: q */
    public boolean m100911q() {
        double d = this.f17078b;
        return d < 0.0d || (d == 0.0d && this.f17079c < 0.0d);
    }

    /* renamed from: r */
    public boolean m100910r() {
        return this.f17078b == 0.0d && this.f17079c == 0.0d;
    }

    /* renamed from: t */
    public boolean m100909t(JF0 jf0) {
        double d = this.f17078b;
        double d2 = jf0.f17078b;
        return d < d2 || (d == d2 && this.f17079c < jf0.f17079c);
    }

    public String toString() {
        int m100908w = m100908w(this.f17078b);
        if (m100908w >= -3 && m100908w <= 20) {
            return m100918k0();
        }
        return m100921h0();
    }

    public JF0(double d) {
        m100915m(d);
    }

    public JF0(double d, double d2) {
        m100914n(d, d2);
    }

    public JF0(JF0 jf0) {
        m100913o(jf0);
    }
}
