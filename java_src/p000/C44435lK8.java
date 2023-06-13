package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: lK8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44435lK8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C44435lK8 f95879a = new C44435lK8();

    /* renamed from: b */
    public static final C35916Sk1 f95880b;

    /* renamed from: c */
    public static final C35916Sk1 f95881c;

    /* renamed from: d */
    public static final C35916Sk1 f95882d;

    /* renamed from: e */
    public static final C35916Sk1 f95883e;

    /* renamed from: f */
    public static final C35916Sk1 f95884f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("durationMs");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f95880b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("handledErrors");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f95881c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("partiallyHandledErrors");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f95882d = m84930a3.m84925b(mo73.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("unhandledErrors");
        MO7 mo74 = new MO7();
        mo74.m95319a(4);
        f95883e = m84930a4.m84925b(mo74.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("httpResponseCode");
        MO7 mo75 = new MO7();
        mo75.m95319a(5);
        f95884f = m84930a5.m84925b(mo75.m95318b()).m84926a();
    }

    private C44435lK8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C47874r79 c47874r79 = (C47874r79) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f95880b, c47874r79.m16454e());
        interfaceC35153Pd32.mo23527f(f95881c, c47874r79.m16458a());
        interfaceC35153Pd32.mo23527f(f95882d, c47874r79.m16457b());
        interfaceC35153Pd32.mo23527f(f95883e, c47874r79.m16456c());
        interfaceC35153Pd32.mo23527f(f95884f, c47874r79.m16455d());
    }
}
