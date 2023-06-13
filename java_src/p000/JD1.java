package p000;

import java.util.List;
/* renamed from: JD1 */
/* loaded from: classes2.dex */
public class JD1 extends AbstractC41718gl2<HD1> {

    /* renamed from: i */
    public final HD1 f17054i;

    public JD1(List<C41125fl2<HD1>> list) {
        super(list);
        HD1 hd1 = list.get(0).f80564b;
        int m104169e = hd1 != null ? hd1.m104169e() : 0;
        this.f17054i = new HD1(new float[m104169e], new int[m104169e]);
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public HD1 mo11803i(C41125fl2<HD1> c41125fl2, float f) {
        this.f17054i.m104168f(c41125fl2.f80564b, c41125fl2.f80565c, f);
        return this.f17054i;
    }
}
