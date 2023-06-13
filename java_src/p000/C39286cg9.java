package p000;

import android.content.Context;
/* renamed from: cg9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39286cg9 implements Le9 {

    /* renamed from: a */
    public X94 f61051a;

    /* renamed from: b */
    public final X94 f61052b;

    /* renamed from: c */
    public final Sd9 f61053c;

    public C39286cg9(Context context, Sd9 sd9) {
        this.f61053c = sd9;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f61051a = new C37339Ym2(new X94() { // from class: Of9
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C52337yf9.f119964a);
                }
            });
        }
        this.f61052b = new C37339Ym2(new X94() { // from class: Vf9
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), Gf9.f12225a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m61067b(Sd9 sd9, C47595qf9 c47595qf9) {
        int mo70988a = sd9.mo70988a();
        if (c47595qf9.m17263a() != 0) {
            return AbstractC52339yg1.m2986d(c47595qf9.m17261c(mo70988a, false));
        }
        return AbstractC52339yg1.m2985e(c47595qf9.m17261c(mo70988a, false));
    }

    @Override // p000.Le9
    /* renamed from: a */
    public final void mo61068a(C47595qf9 c47595qf9) {
        if (this.f61053c.mo70988a() == 0) {
            X94 x94 = this.f61051a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m61067b(this.f61053c, c47595qf9));
                return;
            }
            return;
        }
        ((R96) this.f61052b.get()).mo77276a(m61067b(this.f61053c, c47595qf9));
    }
}
