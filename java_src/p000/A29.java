package p000;

import android.content.Context;
/* renamed from: A29 */
/* loaded from: classes5.dex */
public final class A29 implements InterfaceC40688f09 {

    /* renamed from: a */
    public X94 f52a;

    /* renamed from: b */
    public final X94 f53b;

    /* renamed from: c */
    public final AbstractC51360x09 f54c;

    public A29(Context context, AbstractC51360x09 abstractC51360x09) {
        this.f54c = abstractC51360x09;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f52a = new C37339Ym2(new X94() { // from class: W19
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C47231q29.f104597a);
                }
            });
        }
        this.f53b = new C37339Ym2(new X94() { // from class: g29
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), M19.f22448a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m116169b(AbstractC51360x09 abstractC51360x09, VZ8 vz8) {
        return AbstractC52339yg1.m2985e(vz8.mo79745a(abstractC51360x09.mo5987a(), false));
    }

    @Override // p000.InterfaceC40688f09
    /* renamed from: a */
    public final void mo42285a(VZ8 vz8) {
        if (this.f54c.mo5987a() == 0) {
            X94 x94 = this.f52a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m116169b(this.f54c, vz8));
                return;
            }
            return;
        }
        ((R96) this.f53b.get()).mo77276a(m116169b(this.f54c, vz8));
    }
}
