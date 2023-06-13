package p000;

import android.content.Context;
/* renamed from: n69  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45492n69 implements InterfaceC47251q49 {

    /* renamed from: a */
    public X94 f99460a;

    /* renamed from: b */
    public final X94 f99461b;

    /* renamed from: c */
    public final L29 f99462c;

    public C45492n69(Context context, L29 l29) {
        this.f99462c = l29;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f99460a = new C37339Ym2(new X94() { // from class: X59
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), H59.f12839a);
                }
            });
        }
        this.f99461b = new C37339Ym2(new X94() { // from class: f69
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), P59.f27895a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m24323b(L29 l29, C52596z59 c52596z59) {
        int mo16572a = l29.mo16572a();
        if (c52596z59.m1830a() != 0) {
            return AbstractC52339yg1.m2986d(c52596z59.m1828c(mo16572a, false));
        }
        return AbstractC52339yg1.m2985e(c52596z59.m1828c(mo16572a, false));
    }

    @Override // p000.InterfaceC47251q49
    /* renamed from: a */
    public final void mo18232a(C52596z59 c52596z59) {
        if (this.f99462c.mo16572a() == 0) {
            X94 x94 = this.f99460a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m24323b(this.f99462c, c52596z59));
                return;
            }
            return;
        }
        ((R96) this.f99461b.get()).mo77276a(m24323b(this.f99462c, c52596z59));
    }
}
