package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Yh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37300Yh8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C37300Yh8 f46298a = new C37300Yh8();

    /* renamed from: b */
    public static final C35916Sk1 f46299b;

    /* renamed from: c */
    public static final C35916Sk1 f46300c;

    /* renamed from: d */
    public static final C35916Sk1 f46301d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("logEventKey");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f46299b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("eventCount");
        C52545z08 c52545z082 = new C52545z08();
        c52545z082.m2111a(2);
        f46300c = m84930a2.m84925b(c52545z082.m2110b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("inferenceDurationStats");
        C52545z08 c52545z083 = new C52545z08();
        c52545z083.m2111a(3);
        f46301d = m84930a3.m84925b(c52545z083.m2110b()).m84926a();
    }

    private C37300Yh8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C46687p78 c46687p78 = (C46687p78) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f46299b, c46687p78.m19938a());
        interfaceC35153Pd32.mo23527f(f46300c, c46687p78.m19936c());
        interfaceC35153Pd32.mo23527f(f46301d, c46687p78.m19937b());
    }
}
