package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Dw8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32521Dw8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C32521Dw8 f6638a = new C32521Dw8();

    /* renamed from: b */
    public static final C35916Sk1 f6639b;

    /* renamed from: c */
    public static final C35916Sk1 f6640c;

    /* renamed from: d */
    public static final C35916Sk1 f6641d;

    /* renamed from: e */
    public static final C35916Sk1 f6642e;

    /* renamed from: f */
    public static final C35916Sk1 f6643f;

    /* renamed from: g */
    public static final C35916Sk1 f6644g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("maxMs");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f6639b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("minMs");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f6640c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("avgMs");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f6641d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("firstQuartileMs");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f6642e = m84930a4.m84925b(mo74.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("medianMs");
        MO7 mo75 = new MO7();
        mo75.m95319a(5);
        f6643f = m84930a5.m84925b(mo75.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("thirdQuartileMs");
        MO7 mo76 = new MO7();
        mo76.m95319a(6);
        f6644g = m84930a6.m84925b(mo76.m95318b()).m84926a();
    }

    private C32521Dw8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        ZR8 zr8 = (ZR8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f6639b, zr8.m73101c());
        interfaceC35153Pd32.mo23527f(f6640c, zr8.m73099e());
        interfaceC35153Pd32.mo23527f(f6641d, zr8.m73103a());
        interfaceC35153Pd32.mo23527f(f6642e, zr8.m73102b());
        interfaceC35153Pd32.mo23527f(f6643f, zr8.m73100d());
        interfaceC35153Pd32.mo23527f(f6644g, zr8.m73098f());
    }
}
