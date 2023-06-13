package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: IW2 */
/* loaded from: classes2.dex */
public final class IW2 implements HW2 {

    /* renamed from: a */
    public final JW2 f15841a;

    public IW2(JW2 jw2) {
        this.f15841a = jw2;
    }

    /* renamed from: b */
    public static Y94<HW2> m101963b(JW2 jw2) {
        return C39546d52.m44621a(new IW2(jw2));
    }

    @Override // p000.HW2
    /* renamed from: a */
    public GW2 mo101964a(ScopeProvider scopeProvider, KW2 kw2) {
        return this.f15841a.m100315b(scopeProvider, kw2);
    }
}
