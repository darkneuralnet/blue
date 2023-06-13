package p000;

import com.google.zxing.NotFoundException;
/* renamed from: r */
/* loaded from: classes6.dex */
public abstract class AbstractC27746r extends AbstractC28976u {
    public AbstractC27746r(C1027CT c1027ct) {
        super(c1027ct);
    }

    @Override // p000.AbstractC28494t0
    /* renamed from: d */
    public String mo13277d() throws NotFoundException {
        if (m13278c().m112213o() == 60) {
            StringBuilder sb = new StringBuilder();
            m13282f(sb, 5);
            m11113j(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.m45943a();
    }
}
