package p000;

import java.io.IOException;
import java.util.Map;
/* renamed from: Qa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35364Qa7 extends AbstractC35130Pa7 {
    @Override // p000.AbstractC35130Pa7
    /* renamed from: a */
    public final int mo88389a(Map.Entry entry) {
        C39845db7 c39845db7 = (C39845db7) entry.getKey();
        return 32149011;
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: b */
    public final C36066Ta7 mo88388b(Object obj) {
        return ((AbstractC39234cb7) obj).zbb;
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: c */
    public final C36066Ta7 mo88387c(Object obj) {
        return ((AbstractC39234cb7) obj).m61182E();
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: d */
    public final Object mo88386d(C34896Oa7 c34896Oa7, InterfaceC36075Tb7 interfaceC36075Tb7, int i) {
        return c34896Oa7.m92003c(interfaceC36075Tb7, i);
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: e */
    public final void mo88385e(Object obj) {
        ((AbstractC39234cb7) obj).zbb.m83375h();
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: f */
    public final void mo88384f(InterfaceC36084Tc7 interfaceC36084Tc7, Map.Entry entry) throws IOException {
        EnumC35616Rc7 enumC35616Rc7 = EnumC35616Rc7.f32319d;
        switch (((C39845db7) entry.getKey()).f76867c.ordinal()) {
            case 0:
                interfaceC36084Tc7.mo83282n(32149011, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                interfaceC36084Tc7.mo83305C(32149011, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                interfaceC36084Tc7.mo83300H(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                interfaceC36084Tc7.mo83306B(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC36084Tc7.mo83307A(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                interfaceC36084Tc7.mo83276t(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                interfaceC36084Tc7.mo83274v(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                interfaceC36084Tc7.mo83286j(32149011, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                interfaceC36084Tc7.mo83303E(32149011, (String) entry.getValue());
                return;
            case 9:
                interfaceC36084Tc7.mo83295a(32149011, entry.getValue(), C41040fc7.m41106a().m41105b(entry.getValue().getClass()));
                return;
            case 10:
                interfaceC36084Tc7.mo83292d(32149011, entry.getValue(), C41040fc7.m41106a().m41105b(entry.getValue().getClass()));
                return;
            case 11:
                interfaceC36084Tc7.mo83290f(32149011, (AbstractC32088Ca7) entry.getValue());
                return;
            case 12:
                interfaceC36084Tc7.mo83278r(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC36084Tc7.mo83307A(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                interfaceC36084Tc7.mo83299I(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC36084Tc7.mo83284l(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                interfaceC36084Tc7.mo83287i(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                interfaceC36084Tc7.mo83279q(32149011, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC35130Pa7
    /* renamed from: g */
    public final boolean mo88383g(InterfaceC36075Tb7 interfaceC36075Tb7) {
        return interfaceC36075Tb7 instanceof AbstractC39234cb7;
    }
}
