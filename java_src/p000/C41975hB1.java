package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import kotlin.text.Typography;
/* renamed from: hB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41975hB1 {

    /* renamed from: a */
    public final C1027CT f84836a;

    /* renamed from: b */
    public final C39028cF0 f84837b = new C39028cF0();

    /* renamed from: c */
    public final StringBuilder f84838c = new StringBuilder();

    public C41975hB1(C1027CT c1027ct) {
        this.f84836a = c1027ct;
    }

    /* renamed from: g */
    public static int m36655g(C1027CT c1027ct, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (c1027ct.m112217k(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String m36661a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str;
        String str2 = null;
        while (true) {
            C52826zV0 m36659c = m36659c(i, str2);
            String m76491a = C37086Xk1.m76491a(m36659c.m1307b());
            if (m76491a != null) {
                sb.append(m76491a);
            }
            if (m36659c.m1305d()) {
                str = String.valueOf(m36659c.m1306c());
            } else {
                str = null;
            }
            if (i != m36659c.m113973a()) {
                i = m36659c.m113973a();
                str2 = str;
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    public final C52233yV0 m36660b(int i) {
        char c;
        int m36656f = m36656f(i, 5);
        if (m36656f == 15) {
            return new C52233yV0(i + 5, '$');
        }
        if (m36656f >= 5 && m36656f < 15) {
            return new C52233yV0(i + 5, (char) ((m36656f + 48) - 5));
        }
        int m36656f2 = m36656f(i, 6);
        if (m36656f2 >= 32 && m36656f2 < 58) {
            return new C52233yV0(i + 6, (char) (m36656f2 + 33));
        }
        switch (m36656f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = CoreConstants.COMMA_CHAR;
                break;
            case 60:
                c = CoreConstants.DASH_CHAR;
                break;
            case 61:
                c = CoreConstants.DOT;
                break;
            case 62:
                c = JsonPointer.SEPARATOR;
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(m36656f2)));
        }
        return new C52233yV0(i + 6, c);
    }

    /* renamed from: c */
    public C52826zV0 m36659c(int i, String str) throws FormatException {
        this.f84838c.setLength(0);
        if (str != null) {
            this.f84838c.append(str);
        }
        this.f84837b.m61632h(i);
        C52826zV0 m36647o = m36647o();
        if (m36647o != null && m36647o.m1305d()) {
            return new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString(), m36647o.m1306c());
        }
        return new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString());
    }

    /* renamed from: d */
    public final C52233yV0 m36658d(int i) throws FormatException {
        char c;
        int m36656f = m36656f(i, 5);
        if (m36656f == 15) {
            return new C52233yV0(i + 5, '$');
        }
        if (m36656f >= 5 && m36656f < 15) {
            return new C52233yV0(i + 5, (char) ((m36656f + 48) - 5));
        }
        int m36656f2 = m36656f(i, 7);
        if (m36656f2 >= 64 && m36656f2 < 90) {
            return new C52233yV0(i + 7, (char) (m36656f2 + 1));
        }
        if (m36656f2 >= 90 && m36656f2 < 116) {
            return new C52233yV0(i + 7, (char) (m36656f2 + 7));
        }
        switch (m36656f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = CoreConstants.PERCENT_CHAR;
                break;
            case 235:
                c = Typography.amp;
                break;
            case 236:
                c = CoreConstants.SINGLE_QUOTE_CHAR;
                break;
            case 237:
                c = CoreConstants.LEFT_PARENTHESIS_CHAR;
                break;
            case 238:
                c = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = CoreConstants.COMMA_CHAR;
                break;
            case 242:
                c = CoreConstants.DASH_CHAR;
                break;
            case 243:
                c = CoreConstants.DOT;
                break;
            case 244:
                c = JsonPointer.SEPARATOR;
                break;
            case 245:
                c = CoreConstants.COLON_CHAR;
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = Typography.less;
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = Typography.greater;
                break;
            case C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.m45945a();
        }
        return new C52233yV0(i + 8, c);
    }

    /* renamed from: e */
    public final AV0 m36657e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f84836a.m112213o()) {
            int m36656f = m36656f(i, 4);
            if (m36656f == 0) {
                return new AV0(this.f84836a.m112213o(), 10, 10);
            }
            return new AV0(this.f84836a.m112213o(), m36656f - 1, 10);
        }
        int m36656f2 = m36656f(i, 7) - 8;
        return new AV0(i2, m36656f2 / 11, m36656f2 % 11);
    }

    /* renamed from: f */
    public int m36656f(int i, int i2) {
        return m36655g(this.f84836a, i, i2);
    }

    /* renamed from: h */
    public final boolean m36654h(int i) {
        int i2 = i + 3;
        if (i2 > this.f84836a.m112213o()) {
            return false;
        }
        while (i < i2) {
            if (this.f84836a.m112217k(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m36653i(int i) {
        int i2;
        if (i + 1 > this.f84836a.m112213o()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f84836a.m112213o(); i3++) {
            if (i3 == 2) {
                if (!this.f84836a.m112217k(i + 2)) {
                    return false;
                }
            } else if (this.f84836a.m112217k(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m36652j(int i) {
        int i2;
        if (i + 1 > this.f84836a.m112213o()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f84836a.m112213o(); i3++) {
            if (this.f84836a.m112217k(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m36651k(int i) {
        int m36656f;
        if (i + 5 > this.f84836a.m112213o()) {
            return false;
        }
        int m36656f2 = m36656f(i, 5);
        if (m36656f2 >= 5 && m36656f2 < 16) {
            return true;
        }
        if (i + 6 > this.f84836a.m112213o() || (m36656f = m36656f(i, 6)) < 16 || m36656f >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m36650l(int i) {
        int m36656f;
        if (i + 5 > this.f84836a.m112213o()) {
            return false;
        }
        int m36656f2 = m36656f(i, 5);
        if (m36656f2 >= 5 && m36656f2 < 16) {
            return true;
        }
        if (i + 7 > this.f84836a.m112213o()) {
            return false;
        }
        int m36656f3 = m36656f(i, 7);
        if (m36656f3 >= 64 && m36656f3 < 116) {
            return true;
        }
        if (i + 8 > this.f84836a.m112213o() || (m36656f = m36656f(i, 8)) < 232 || m36656f >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m36649m(int i) {
        if (i + 7 > this.f84836a.m112213o()) {
            if (i + 4 <= this.f84836a.m112213o()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f84836a.m112217k(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f84836a.m112217k(i3);
            }
        }
    }

    /* renamed from: n */
    public final C7465SW m36648n() {
        while (m36651k(this.f84837b.m61639a())) {
            C52233yV0 m36660b = m36660b(this.f84837b.m61639a());
            this.f84837b.m61632h(m36660b.m113973a());
            if (m36660b.m3446c()) {
                return new C7465SW(new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString()), true);
            }
            this.f84838c.append(m36660b.m3447b());
        }
        if (m36654h(this.f84837b.m61639a())) {
            this.f84837b.m61638b(3);
            this.f84837b.m61633g();
        } else if (m36653i(this.f84837b.m61639a())) {
            if (this.f84837b.m61639a() + 5 < this.f84836a.m112213o()) {
                this.f84837b.m61638b(5);
            } else {
                this.f84837b.m61632h(this.f84836a.m112213o());
            }
            this.f84837b.m61634f();
        }
        return new C7465SW(false);
    }

    /* renamed from: o */
    public final C52826zV0 m36647o() throws FormatException {
        C7465SW m36645q;
        boolean m85325b;
        boolean z;
        do {
            int m61639a = this.f84837b.m61639a();
            if (this.f84837b.m61637c()) {
                m36645q = m36648n();
                m85325b = m36645q.m85325b();
            } else if (this.f84837b.m61636d()) {
                m36645q = m36646p();
                m85325b = m36645q.m85325b();
            } else {
                m36645q = m36645q();
                m85325b = m36645q.m85325b();
            }
            if (m61639a != this.f84837b.m61639a()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !m85325b) {
                break;
            }
        } while (!m85325b);
        return m36645q.m85326a();
    }

    /* renamed from: p */
    public final C7465SW m36646p() throws FormatException {
        while (m36650l(this.f84837b.m61639a())) {
            C52233yV0 m36658d = m36658d(this.f84837b.m61639a());
            this.f84837b.m61632h(m36658d.m113973a());
            if (m36658d.m3446c()) {
                return new C7465SW(new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString()), true);
            }
            this.f84838c.append(m36658d.m3447b());
        }
        if (m36654h(this.f84837b.m61639a())) {
            this.f84837b.m61638b(3);
            this.f84837b.m61633g();
        } else if (m36653i(this.f84837b.m61639a())) {
            if (this.f84837b.m61639a() + 5 < this.f84836a.m112213o()) {
                this.f84837b.m61638b(5);
            } else {
                this.f84837b.m61632h(this.f84836a.m112213o());
            }
            this.f84837b.m61635e();
        }
        return new C7465SW(false);
    }

    /* renamed from: q */
    public final C7465SW m36645q() throws FormatException {
        C52826zV0 c52826zV0;
        while (m36649m(this.f84837b.m61639a())) {
            AV0 m36657e = m36657e(this.f84837b.m61639a());
            this.f84837b.m61632h(m36657e.m113973a());
            if (m36657e.m115717d()) {
                if (m36657e.m115716e()) {
                    c52826zV0 = new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString());
                } else {
                    c52826zV0 = new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString(), m36657e.m115718c());
                }
                return new C7465SW(c52826zV0, true);
            }
            this.f84838c.append(m36657e.m115719b());
            if (m36657e.m115716e()) {
                return new C7465SW(new C52826zV0(this.f84837b.m61639a(), this.f84838c.toString()), true);
            }
            this.f84838c.append(m36657e.m115718c());
        }
        if (m36652j(this.f84837b.m61639a())) {
            this.f84837b.m61635e();
            this.f84837b.m61638b(4);
        }
        return new C7465SW(false);
    }
}
