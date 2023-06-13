package p000;

import android.content.Context;
/* renamed from: dp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39984dp7 implements InterfaceC53018zo7 {

    /* renamed from: a */
    public X94 f77257a;

    /* renamed from: b */
    public final X94 f77258b;

    /* renamed from: c */
    public final AbstractC50054uo7 f77259c;

    public C39984dp7(Context context, AbstractC50054uo7 abstractC50054uo7) {
        this.f77259c = abstractC50054uo7;
        W70 w70 = W70.f40431g;
        C42798ia6.m33786f(context);
        final U96 m33785g = C42798ia6.m33789c().m33785g(w70);
        if (w70.mo30220a().contains(C35142Pc1.m90060b("json"))) {
            this.f77257a = new C37339Ym2(new X94() { // from class: bp7
                @Override // p000.X94
                public final Object get() {
                    return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("json"), C37596Zo7.f49283a);
                }
            });
        }
        this.f77258b = new C37339Ym2(new X94() { // from class: cp7
            @Override // p000.X94
            public final Object get() {
                return U96.this.mo80270a("FIREBASE_ML_SDK", byte[].class, C35142Pc1.m90060b("proto"), C38188ap7.f56369a);
            }
        });
    }

    /* renamed from: b */
    public static AbstractC52339yg1 m43675b(AbstractC50054uo7 abstractC50054uo7, InterfaceC48868so7 interfaceC48868so7) {
        int mo9711a = abstractC50054uo7.mo9711a();
        interfaceC48868so7.zza();
        return AbstractC52339yg1.m2985e(interfaceC48868so7.mo13615a(mo9711a, false));
    }

    @Override // p000.InterfaceC53018zo7
    /* renamed from: a */
    public final void mo405a(InterfaceC48868so7 interfaceC48868so7) {
        if (this.f77259c.mo9711a() == 0) {
            X94 x94 = this.f77257a;
            if (x94 != null) {
                ((R96) x94.get()).mo77276a(m43675b(this.f77259c, interfaceC48868so7));
                return;
            }
            return;
        }
        ((R96) this.f77258b.get()).mo77276a(m43675b(this.f77259c, interfaceC48868so7));
    }
}
