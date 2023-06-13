package p000;

import com.uber.autodispose.ScopeProvider;
import p000.C50923wH2;
/* renamed from: RH2 */
/* loaded from: classes3.dex */
public final class RH2 implements InterfaceC48812sj1<ScopeProvider> {

    /* renamed from: a */
    public final C50923wH2.C29854c f31786a;

    public RH2(C50923wH2.C29854c c29854c) {
        this.f31786a = c29854c;
    }

    /* renamed from: a */
    public static RH2 m86995a(C50923wH2.C29854c c29854c) {
        return new RH2(c29854c);
    }

    /* renamed from: c */
    public static ScopeProvider m86993c(C50923wH2.C29854c c29854c) {
        return (ScopeProvider) C51679xZ3.m5002e(c29854c.m7042d());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScopeProvider get() {
        return m86993c(this.f31786a);
    }
}
