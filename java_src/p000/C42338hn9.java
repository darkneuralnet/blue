package p000;

import android.content.Context;
/* renamed from: hn9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42338hn9 implements Dk9 {

    /* renamed from: a */
    public X94 f85893a;

    /* renamed from: b */
    public final X94 f85894b;

    /* renamed from: c */
    public final Ok9 f85895c;

    public C42338hn9(Context context, Ok9 ok9) {
        this.f85895c = ok9;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f85893a = new C37339Ym2(new X94() { // from class: Pm9
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C38763bn9.f58193a);
                }
            });
        }
        this.f85894b = new C37339Ym2(new X94() { // from class: Vm9
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), Jm9.f18213a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m35861b(Ok9 ok9, InterfaceC51794xk9 interfaceC51794xk9) {
        int mo15468a = ok9.mo15468a();
        if (interfaceC51794xk9.zza() != 0) {
            return AbstractC52339yg1.m2986d(interfaceC51794xk9.mo4750a(mo15468a, false));
        }
        return AbstractC52339yg1.m2985e(interfaceC51794xk9.mo4750a(mo15468a, false));
    }

    @Override // p000.Dk9
    /* renamed from: a */
    public final void mo35862a(InterfaceC51794xk9 interfaceC51794xk9) {
        if (this.f85895c.mo15468a() == 0) {
            X94 x94 = this.f85893a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m35861b(this.f85895c, interfaceC51794xk9));
                return;
            }
            return;
        }
        ((R96) this.f85894b.get()).mo77276a(m35861b(this.f85895c, interfaceC51794xk9));
    }
}
