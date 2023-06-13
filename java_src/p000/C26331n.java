package p000;
/* renamed from: n */
/* loaded from: classes6.dex */
public final class C26331n extends AbstractC27746r {
    public C26331n(C1027CT c1027ct) {
        super(c1027ct);
    }

    @Override // p000.AbstractC28976u
    /* renamed from: h */
    public void mo11115h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // p000.AbstractC28976u
    /* renamed from: i */
    public int mo11114i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
