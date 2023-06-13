package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Rx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35806Rx8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C35806Rx8 f32946a = new C35806Rx8();

    /* renamed from: b */
    public static final C35916Sk1 f32947b;

    /* renamed from: c */
    public static final C35916Sk1 f32948c;

    /* renamed from: d */
    public static final C35916Sk1 f32949d;

    /* renamed from: e */
    public static final C35916Sk1 f32950e;

    /* renamed from: f */
    public static final C35916Sk1 f32951f;

    /* renamed from: g */
    public static final C35916Sk1 f32952g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("maxMs");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f32947b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("minMs");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f32948c = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("avgMs");
        C52545z08 c52545z083 = new C52545z08();
        c52545z083.m2111a(3);
        f32949d = m84930a3.m84925b(c52545z083.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("firstQuartileMs");
        C52545z08 c52545z084 = new C52545z08();
        c52545z084.m2111a(4);
        f32950e = m84930a4.m84925b(c52545z084.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("medianMs");
        C52545z08 c52545z085 = new C52545z08();
        c52545z085.m2111a(5);
        f32951f = m84930a5.m84925b(c52545z085.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("thirdQuartileMs");
        C52545z08 c52545z086 = new C52545z08();
        c52545z086.m2111a(6);
        f32952g = m84930a6.m84925b(c52545z086.m2110b()).m84926a();
    }

    private C35806Rx8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C48406s19 c48406s19 = (C48406s19) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f32947b, c48406s19.m14867c());
        interfaceC35153Pd32.mo23527f(f32948c, c48406s19.m14865e());
        interfaceC35153Pd32.mo23527f(f32949d, c48406s19.m14869a());
        interfaceC35153Pd32.mo23527f(f32950e, c48406s19.m14868b());
        interfaceC35153Pd32.mo23527f(f32951f, c48406s19.m14866d());
        interfaceC35153Pd32.mo23527f(f32952g, c48406s19.m14864f());
    }
}
