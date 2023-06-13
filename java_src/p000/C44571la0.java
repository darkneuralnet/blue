package p000;

import android.util.Size;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11211o;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11225s;
/* renamed from: la0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44571la0 implements C11213q.InterfaceC11217d {

    /* renamed from: a */
    public static final C44571la0 f96336a = new C44571la0();

    @Override // androidx.camera.core.impl.C11213q.InterfaceC11217d
    /* renamed from: a */
    public void mo27145a(Size size, InterfaceC11225s<?> interfaceC11225s, C11213q.C11215b c11215b) {
        C11213q m69272m = interfaceC11225s.m69272m(null);
        InterfaceC11197f m69367S = C11210n.m69367S();
        int m69344l = C11213q.m69355a().m69344l();
        if (m69272m != null) {
            m69344l = m69272m.m69344l();
            c11215b.m69343a(m69272m.m69354b());
            c11215b.m69341c(m69272m.m69347i());
            c11215b.m69342b(m69272m.m69349g());
            m69367S = m69272m.m69352d();
        }
        c11215b.m69325s(m69367S);
        if (interfaceC11225s instanceof C11211o) {
            C38314b24.m65085b(size, c11215b);
        }
        C43385ja0 c43385ja0 = new C43385ja0(interfaceC11225s);
        c11215b.m69323u(c43385ja0.m30306V(m69344l));
        c11215b.m69339e(c43385ja0.m30305W(C51102wb0.m6618b()));
        c11215b.m69334j(c43385ja0.m30302Z(C36059Ta0.m83385b()));
        c11215b.m69340d(C39267cf0.m61091d(c43385ja0.m30303Y(K90.m99127c())));
        C11209m m69372V = C11209m.m69372V();
        m69372V.mo69373C(C43385ja0.f92942K, c43385ja0.m30309S(C32090Cb0.m112090e()));
        m69372V.mo69373C(C43385ja0.f92944M, c43385ja0.m30304X(null));
        m69372V.mo69373C(C43385ja0.f92938G, Long.valueOf(c43385ja0.m30301a0(-1L)));
        c11215b.m69337g(m69372V);
        c11215b.m69337g(c43385ja0.m30308T());
    }
}
