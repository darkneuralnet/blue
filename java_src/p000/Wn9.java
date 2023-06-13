package p000;

import android.content.Context;
/* renamed from: Wn9 */
/* loaded from: classes5.dex */
public final class Wn9 implements Xl9 {

    /* renamed from: a */
    public X94 f42118a;

    /* renamed from: b */
    public final X94 f42119b;

    /* renamed from: c */
    public final AbstractC43514jm9 f42120c;

    public Wn9(Context context, AbstractC43514jm9 abstractC43514jm9) {
        this.f42120c = abstractC43514jm9;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f42118a = new C37339Ym2(new X94() { // from class: Jn9
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), Rn9.f32618a);
                }
            });
        }
        this.f42119b = new C37339Ym2(new X94() { // from class: Mn9
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), Gn9.f12477a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m77826b(AbstractC43514jm9 abstractC43514jm9, Rl9 rl9) {
        int mo29940a = abstractC43514jm9.mo29940a();
        if (rl9.zza() != 0) {
            return AbstractC52339yg1.m2986d(rl9.mo6317a(mo29940a, false));
        }
        return AbstractC52339yg1.m2985e(rl9.mo6317a(mo29940a, false));
    }

    @Override // p000.Xl9
    /* renamed from: a */
    public final void mo18710a(Rl9 rl9) {
        if (this.f42120c.mo29940a() == 0) {
            X94 x94 = this.f42118a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m77826b(this.f42120c, rl9));
                return;
            }
            return;
        }
        ((R96) this.f42119b.get()).mo77276a(m77826b(this.f42120c, rl9));
    }
}
