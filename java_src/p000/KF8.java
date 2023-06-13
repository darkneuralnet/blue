package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: KF8 */
/* loaded from: classes5.dex */
public final class KF8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final KF8 f19317a = new KF8();

    /* renamed from: b */
    public static final C35916Sk1 f19318b;

    /* renamed from: c */
    public static final C35916Sk1 f19319c;

    /* renamed from: d */
    public static final C35916Sk1 f19320d;

    /* renamed from: e */
    public static final C35916Sk1 f19321e;

    /* renamed from: f */
    public static final C35916Sk1 f19322f;

    /* renamed from: g */
    public static final C35916Sk1 f19323g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("detectorMode");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f19318b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("multipleObjectsEnabled");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f19319c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("classificationEnabled");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f19320d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("maxPerObjectLabelCount");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f19321e = m84930a4.m84925b(mo74.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("classificationConfidenceThreshold");
        MO7 mo75 = new MO7();
        mo75.m95319a(5);
        f19322f = m84930a5.m84925b(mo75.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("customLocalModelOptions");
        MO7 mo76 = new MO7();
        mo76.m95319a(6);
        f19323g = m84930a6.m84925b(mo76.m95318b()).m84926a();
    }

    private KF8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        X29 x29 = (X29) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f19318b, x29.m77517a());
        interfaceC35153Pd32.mo23527f(f19319c, x29.m77515c());
        interfaceC35153Pd32.mo23527f(f19320d, x29.m77516b());
        interfaceC35153Pd32.mo23527f(f19321e, null);
        interfaceC35153Pd32.mo23527f(f19322f, null);
        interfaceC35153Pd32.mo23527f(f19323g, null);
    }
}
