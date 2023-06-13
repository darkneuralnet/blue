package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
/* renamed from: o */
/* loaded from: classes6.dex */
public final class C26778o extends AbstractC28493t {
    public C26778o(C1027CT c1027ct) {
        super(c1027ct);
    }

    @Override // p000.AbstractC28494t0
    /* renamed from: d */
    public String mo13277d() throws NotFoundException, FormatException {
        if (m13278c().m112213o() >= 48) {
            StringBuilder sb = new StringBuilder();
            m13282f(sb, 8);
            int m36656f = m13279b().m36656f(48, 2);
            sb.append("(392");
            sb.append(m36656f);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb.append(m13279b().m36659c(50, null).m1307b());
            return sb.toString();
        }
        throw NotFoundException.m45943a();
    }
}
