package p000;

import java.util.List;
/* renamed from: b26  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C38316b26 extends AbstractC41718gl2<N51> {

    /* renamed from: b26$a */
    /* loaded from: classes2.dex */
    public class C12278a extends C41410gE2<N51> {

        /* renamed from: d */
        public final /* synthetic */ TD2 f56814d;

        /* renamed from: e */
        public final /* synthetic */ C41410gE2 f56815e;

        /* renamed from: f */
        public final /* synthetic */ N51 f56816f;

        public C12278a(TD2 td2, C41410gE2 c41410gE2, N51 n51) {
            this.f56814d = td2;
            this.f56815e = c41410gE2;
            this.f56816f = n51;
        }

        @Override // p000.C41410gE2
        /* renamed from: d */
        public N51 mo39823a(TD2<N51> td2) {
            N51 m84190g;
            this.f56814d.m84189h(td2.m84191f(), td2.m84196a(), td2.m84190g().f24120a, td2.m84195b().f24120a, td2.m84193d(), td2.m84194c(), td2.m84192e());
            String str = (String) this.f56815e.mo39823a(this.f56814d);
            if (td2.m84194c() == 1.0f) {
                m84190g = td2.m84195b();
            } else {
                m84190g = td2.m84190g();
            }
            N51 n51 = m84190g;
            this.f56816f.m94388a(str, n51.f24121b, n51.f24122c, n51.f24123d, n51.f24124e, n51.f24125f, n51.f24126g, n51.f24127h, n51.f24128i, n51.f24129j, n51.f24130k, n51.f24131l, n51.f24132m);
            return this.f56816f;
        }
    }

    public C38316b26(List<C41125fl2<N51>> list) {
        super(list);
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public N51 mo11803i(C41125fl2<N51> c41125fl2, float f) {
        N51 n51;
        float floatValue;
        N51 n512;
        C41410gE2<A> c41410gE2 = this.f101567e;
        if (c41410gE2 != 0) {
            float f2 = c41125fl2.f80569g;
            Float f3 = c41125fl2.f80570h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            N51 n513 = c41125fl2.f80564b;
            N51 n514 = n513;
            N51 n515 = c41125fl2.f80565c;
            if (n515 == null) {
                n512 = n513;
            } else {
                n512 = n515;
            }
            return (N51) c41410gE2.m39822b(f2, floatValue, n514, n512, f, m21662d(), m21660f());
        } else if (f == 1.0f && (n51 = c41125fl2.f80565c) != null) {
            return n51;
        } else {
            return c41125fl2.f80564b;
        }
    }

    /* renamed from: q */
    public void m65083q(C41410gE2<String> c41410gE2) {
        super.m21653n(new C12278a(new TD2(), c41410gE2, new N51()));
    }
}
