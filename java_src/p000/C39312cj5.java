package p000;

import java.util.List;
/* renamed from: cj5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39312cj5 extends AbstractC41718gl2<C39923dj5> {

    /* renamed from: i */
    public final C39923dj5 f61113i;

    public C39312cj5(List<C41125fl2<C39923dj5>> list) {
        super(list);
        this.f61113i = new C39923dj5();
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public C39923dj5 mo11803i(C41125fl2<C39923dj5> c41125fl2, float f) {
        C39923dj5 c39923dj5;
        C39923dj5 c39923dj52;
        C39923dj5 c39923dj53 = c41125fl2.f80564b;
        if (c39923dj53 != null && (c39923dj5 = c41125fl2.f80565c) != null) {
            C39923dj5 c39923dj54 = c39923dj53;
            C39923dj5 c39923dj55 = c39923dj5;
            C41410gE2<A> c41410gE2 = this.f101567e;
            if (c41410gE2 != 0 && (c39923dj52 = (C39923dj5) c41410gE2.m39822b(c41125fl2.f80569g, c41125fl2.f80570h.floatValue(), c39923dj54, c39923dj55, f, m21661e(), m21660f())) != null) {
                return c39923dj52;
            }
            this.f61113i.m43834d(C48077rU2.m15911i(c39923dj54.m43836b(), c39923dj55.m43836b(), f), C48077rU2.m15911i(c39923dj54.m43835c(), c39923dj55.m43835c(), f));
            return this.f61113i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
