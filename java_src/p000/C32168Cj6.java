package p000;

import java.util.Collections;
/* renamed from: Cj6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32168Cj6<K, A> extends AbstractC26856oB<K, A> {

    /* renamed from: i */
    public final A f4578i;

    public C32168Cj6(C41410gE2<A> c41410gE2) {
        this(c41410gE2, null);
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: c */
    public float mo21663c() {
        return 1.0f;
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: h */
    public A mo21658h() {
        C41410gE2<A> c41410gE2 = this.f101567e;
        A a = this.f4578i;
        return c41410gE2.m39822b(0.0f, 0.0f, a, a, m21660f(), m21660f(), m21660f());
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: i */
    public A mo11803i(C41125fl2<K> c41125fl2, float f) {
        return mo21658h();
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: k */
    public void mo21656k() {
        if (this.f101567e != null) {
            super.mo21656k();
        }
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: m */
    public void mo21654m(float f) {
        this.f101566d = f;
    }

    public C32168Cj6(C41410gE2<A> c41410gE2, A a) {
        super(Collections.emptyList());
        m21653n(c41410gE2);
        this.f4578i = a;
    }
}
