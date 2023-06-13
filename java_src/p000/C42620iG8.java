package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: iG8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42620iG8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C42620iG8 f87050a = new C42620iG8();

    /* renamed from: b */
    public static final C35916Sk1 f87051b;

    /* renamed from: c */
    public static final C35916Sk1 f87052c;

    /* renamed from: d */
    public static final C35916Sk1 f87053d;

    /* renamed from: e */
    public static final C35916Sk1 f87054e;

    /* renamed from: f */
    public static final C35916Sk1 f87055f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("detectorOptions");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f87051b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("errorCode");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f87052c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("totalInitializationMs");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f87053d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("loggingInitializationMs");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f87054e = m84930a4.m84925b(mo74.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("otherErrors");
        MO7 mo75 = new MO7();
        mo75.m95319a(5);
        f87055f = m84930a5.m84925b(mo75.m95318b()).m84926a();
    }

    private C42620iG8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C44286l49 c44286l49 = (C44286l49) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f87051b, c44286l49.m27952c());
        interfaceC35153Pd32.mo23527f(f87052c, c44286l49.m27953b());
        interfaceC35153Pd32.mo23527f(f87053d, c44286l49.m27951d());
        interfaceC35153Pd32.mo23527f(f87054e, null);
        interfaceC35153Pd32.mo23527f(f87055f, c44286l49.m27954a());
    }
}
