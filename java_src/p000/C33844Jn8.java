package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Jn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33844Jn8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C33844Jn8 f18247a = new C33844Jn8();

    /* renamed from: b */
    public static final C35916Sk1 f18248b;

    /* renamed from: c */
    public static final C35916Sk1 f18249c;

    /* renamed from: d */
    public static final C35916Sk1 f18250d;

    /* renamed from: e */
    public static final C35916Sk1 f18251e;

    /* renamed from: f */
    public static final C35916Sk1 f18252f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f18248b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("hasResult");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f18249c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("isColdCall");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f18250d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("imageInfo");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f18251e = m84930a4.m84925b(mo74.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("detectorOptions");
        MO7 mo75 = new MO7();
        mo75.m95319a(5);
        f18252f = m84930a5.m84925b(mo75.m95318b()).m84926a();
    }

    private C33844Jn8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C33781Jg8 c33781Jg8 = (C33781Jg8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f18248b, c33781Jg8.m100029a());
        interfaceC35153Pd32.mo23527f(f18249c, c33781Jg8.m100027c());
        interfaceC35153Pd32.mo23527f(f18250d, c33781Jg8.m100026d());
        interfaceC35153Pd32.mo23527f(f18251e, null);
        interfaceC35153Pd32.mo23527f(f18252f, c33781Jg8.m100028b());
    }
}
