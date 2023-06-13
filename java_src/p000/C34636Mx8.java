package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Mx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34636Mx8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C34636Mx8 f23877a = new C34636Mx8();

    /* renamed from: b */
    public static final C35916Sk1 f23878b;

    /* renamed from: c */
    public static final C35916Sk1 f23879c;

    /* renamed from: d */
    public static final C35916Sk1 f23880d;

    /* renamed from: e */
    public static final C35916Sk1 f23881e;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("imageFormat");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f23878b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("originalImageSize");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f23879c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("compressedImageSize");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f23880d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("isOdmlImage");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f23881e = m84930a4.m84925b(mo74.m95318b()).m84926a();
    }

    private C34636Mx8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C45109mT8 c45109mT8 = (C45109mT8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f23878b, c45109mT8.m25542a());
        interfaceC35153Pd32.mo23527f(f23879c, c45109mT8.m25541b());
        interfaceC35153Pd32.mo23527f(f23880d, null);
        interfaceC35153Pd32.mo23527f(f23881e, null);
    }
}
