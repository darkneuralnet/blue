package p000;

import android.content.Context;
/* renamed from: ph9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47022ph9 implements We9 {

    /* renamed from: a */
    public X94 f103952a;

    /* renamed from: b */
    public final X94 f103953b;

    /* renamed from: c */
    public final AbstractC45223mf9 f103954c;

    public C47022ph9(Context context, AbstractC45223mf9 abstractC45223mf9) {
        this.f103954c = abstractC45223mf9;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f103952a = new C37339Ym2(new X94() { // from class: Rg9
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C42278hh9.f85684a);
                }
            });
        }
        this.f103953b = new C37339Ym2(new X94() { // from class: Zg9
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), Jg9.f18002a);
            }
        });
    }
}
