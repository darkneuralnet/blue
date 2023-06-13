package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: yF8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52097yF8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C52097yF8 f119272a = new C52097yF8();

    /* renamed from: b */
    public static final C35916Sk1 f119273b;

    /* renamed from: c */
    public static final C35916Sk1 f119274c;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("detectorOptions");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f119273b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("errorCode");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f119274c = m84930a2.m84925b(mo72.m95318b()).m84926a();
    }

    private C52097yF8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C43673k29 c43673k29 = (C43673k29) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f119273b, c43673k29.m29410b());
        interfaceC35153Pd32.mo23527f(f119274c, c43673k29.m29411a());
    }
}
