package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: CC8 */
/* loaded from: classes5.dex */
public final class CC8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final CC8 f3613a = new CC8();

    /* renamed from: b */
    public static final C35916Sk1 f3614b;

    /* renamed from: c */
    public static final C35916Sk1 f3615c;

    /* renamed from: d */
    public static final C35916Sk1 f3616d;

    /* renamed from: e */
    public static final C35916Sk1 f3617e;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("category");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f3614b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("classificationConfidence");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f3615c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("trackingId");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f3616d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("labelCount");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f3617e = m84930a4.m84925b(mo74.m95318b()).m84926a();
    }

    private CC8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        OY8 oy8 = (OY8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f3614b, oy8.m92016a());
        interfaceC35153Pd32.mo23527f(f3615c, oy8.m92015b());
        interfaceC35153Pd32.mo23527f(f3616d, oy8.m92014c());
        interfaceC35153Pd32.mo23527f(f3617e, null);
    }
}
