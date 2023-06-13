package p000;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
/* renamed from: s */
/* loaded from: classes6.dex */
public final class C28149s extends AbstractC28493t {
    public C28149s(C1027CT c1027ct) {
        super(c1027ct);
    }

    @Override // p000.AbstractC28494t0
    /* renamed from: d */
    public String mo13277d() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(m13279b().m36656f(4, 4));
        m13281g(sb, 8, length);
        return m13279b().m36661a(sb, 48);
    }
}
