package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;
/* renamed from: q */
/* loaded from: classes6.dex */
public final class C27448q extends AbstractC28976u {

    /* renamed from: c */
    public final String f104457c;

    /* renamed from: d */
    public final String f104458d;

    public C27448q(C1027CT c1027ct, String str, String str2) {
        super(c1027ct);
        this.f104457c = str2;
        this.f104458d = str;
    }

    @Override // p000.AbstractC28494t0
    /* renamed from: d */
    public String mo13277d() throws NotFoundException {
        if (m13278c().m112213o() == 84) {
            StringBuilder sb = new StringBuilder();
            m13282f(sb, 8);
            m11113j(sb, 48, 20);
            m18345k(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.AbstractC28976u
    /* renamed from: h */
    public void mo11115h(StringBuilder sb, int i) {
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.f104458d);
        sb.append(i / 100000);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // p000.AbstractC28976u
    /* renamed from: i */
    public int mo11114i(int i) {
        return i % 100000;
    }

    /* renamed from: k */
    public final void m18345k(StringBuilder sb, int i) {
        int m36656f = m13279b().m36656f(i, 16);
        if (m36656f == 38400) {
            return;
        }
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.f104457c);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        int i2 = m36656f % 32;
        int i3 = m36656f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i2);
    }
}
