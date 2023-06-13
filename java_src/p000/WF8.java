package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: WF8 */
/* loaded from: classes5.dex */
public final class WF8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final WF8 f40671a = new WF8();

    /* renamed from: b */
    public static final C35916Sk1 f40672b;

    /* renamed from: c */
    public static final C35916Sk1 f40673c;

    /* renamed from: d */
    public static final C35916Sk1 f40674d;

    /* renamed from: e */
    public static final C35916Sk1 f40675e;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("inferenceCommonLogEvent");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f40672b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("imageInfo");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f40673c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("detectorOptions");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f40674d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("objectInfos");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f40675e = m84930a4.m84925b(mo74.m95318b()).m84926a();
    }

    private WF8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        L39 l39 = (L39) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f40672b, l39.m97885c());
        interfaceC35153Pd32.mo23527f(f40673c, l39.m97886b());
        interfaceC35153Pd32.mo23527f(f40674d, l39.m97884d());
        interfaceC35153Pd32.mo23527f(f40675e, l39.m97887a());
    }
}
