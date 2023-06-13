package p000;

import java.io.IOException;
import java.util.Map;
/* renamed from: n38  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45461n38 extends W28 {
    @Override // p000.W28
    /* renamed from: a */
    public final int mo24514a(Map.Entry entry) {
        return ((C38368b78) entry.getKey()).f56956b;
    }

    @Override // p000.W28
    /* renamed from: b */
    public final C39542d48 mo24513b(Object obj) {
        return ((Q58) obj).zza;
    }

    @Override // p000.W28
    /* renamed from: c */
    public final C39542d48 mo24512c(Object obj) {
        return ((Q58) obj).m88922H();
    }

    @Override // p000.W28
    /* renamed from: d */
    public final Object mo24511d(J28 j28, InterfaceC39926dj8 interfaceC39926dj8, int i) {
        return j28.m101255b(interfaceC39926dj8, i);
    }

    @Override // p000.W28
    /* renamed from: e */
    public final void mo24510e(Object obj) {
        ((Q58) obj).zza.m44635g();
    }

    @Override // p000.W28
    /* renamed from: f */
    public final void mo24509f(InterfaceC36040Sx8 interfaceC36040Sx8, Map.Entry entry) throws IOException {
        C38368b78 c38368b78 = (C38368b78) entry.getKey();
        EnumC50737vx8 enumC50737vx8 = EnumC50737vx8.f114977c;
        switch (c38368b78.f56957c.ordinal()) {
            case 0:
                interfaceC36040Sx8.mo84552g(c38368b78.f56956b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                interfaceC36040Sx8.mo84549j(c38368b78.f56956b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                interfaceC36040Sx8.mo84546m(c38368b78.f56956b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                interfaceC36040Sx8.mo84567B(c38368b78.f56956b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC36040Sx8.mo84544o(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                interfaceC36040Sx8.mo84548k(c38368b78.f56956b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                interfaceC36040Sx8.mo84551h(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                interfaceC36040Sx8.mo84553f(c38368b78.f56956b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                interfaceC36040Sx8.mo84541r(c38368b78.f56956b, (String) entry.getValue());
                return;
            case 9:
                interfaceC36040Sx8.mo84561H(c38368b78.f56956b, entry.getValue(), C48247rl8.m15451a().m15450b(entry.getValue().getClass()));
                return;
            case 10:
                interfaceC36040Sx8.mo84562G(c38368b78.f56956b, entry.getValue(), C48247rl8.m15451a().m15450b(entry.getValue().getClass()));
                return;
            case 11:
                interfaceC36040Sx8.mo84559J(c38368b78.f56956b, (AbstractC41604gZ7) entry.getValue());
                return;
            case 12:
                interfaceC36040Sx8.mo84536w(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC36040Sx8.mo84544o(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                interfaceC36040Sx8.mo84565D(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC36040Sx8.mo84563F(c38368b78.f56956b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                interfaceC36040Sx8.mo84538u(c38368b78.f56956b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                interfaceC36040Sx8.mo84539t(c38368b78.f56956b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // p000.W28
    /* renamed from: g */
    public final boolean mo24508g(InterfaceC39926dj8 interfaceC39926dj8) {
        return interfaceC39926dj8 instanceof Q58;
    }
}
