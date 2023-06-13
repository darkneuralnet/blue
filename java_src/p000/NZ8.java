package p000;

import android.content.Context;
/* renamed from: NZ8 */
/* loaded from: classes5.dex */
public final class NZ8 implements InterfaceC51073wX8 {

    /* renamed from: a */
    public X94 f24802a;

    /* renamed from: b */
    public final X94 f24803b;

    /* renamed from: c */
    public final AbstractC51064wW8 f24804c;

    public NZ8(Context context, AbstractC51064wW8 abstractC51064wW8) {
        this.f24804c = abstractC51064wW8;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f24802a = new C37339Ym2(new X94() { // from class: MY8
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C49304tY8.f110744a);
                }
            });
        }
        this.f24803b = new C37339Ym2(new X94() { // from class: WY8
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), CY8.f4201a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m93746b(AbstractC51064wW8 abstractC51064wW8, C43968kY8 c43968kY8) {
        int mo6711a = abstractC51064wW8.mo6711a();
        if (c43968kY8.m28843a() != 0) {
            return AbstractC52339yg1.m2986d(c43968kY8.m28841c(mo6711a, false));
        }
        return AbstractC52339yg1.m2985e(c43968kY8.m28841c(mo6711a, false));
    }

    @Override // p000.InterfaceC51073wX8
    /* renamed from: a */
    public final void mo6683a(C43968kY8 c43968kY8) {
        if (this.f24804c.mo6711a() == 0) {
            X94 x94 = this.f24802a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m93746b(this.f24804c, c43968kY8));
                return;
            }
            return;
        }
        ((R96) this.f24803b.get()).mo77276a(m93746b(this.f24804c, c43968kY8));
    }
}
