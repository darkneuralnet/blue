package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Ir8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33646Ir8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C33646Ir8 f16339a = new C33646Ir8();

    /* renamed from: b */
    public static final C35916Sk1 f16340b;

    /* renamed from: c */
    public static final C35916Sk1 f16341c;

    /* renamed from: d */
    public static final C35916Sk1 f16342d;

    /* renamed from: e */
    public static final C35916Sk1 f16343e;

    /* renamed from: f */
    public static final C35916Sk1 f16344f;

    /* renamed from: g */
    public static final C35916Sk1 f16345g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("inferenceCommonLogEvent");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f16340b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("options");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f16341c = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("imageInfo");
        C43347jV7 c43347jV73 = new C43347jV7();
        c43347jV73.m30420a(3);
        f16342d = m84930a3.m84925b(c43347jV73.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("detectorOptions");
        C43347jV7 c43347jV74 = new C43347jV7();
        c43347jV74.m30420a(4);
        f16343e = m84930a4.m84925b(c43347jV74.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("contourDetectedFaces");
        C43347jV7 c43347jV75 = new C43347jV7();
        c43347jV75.m30420a(5);
        f16344f = m84930a5.m84925b(c43347jV75.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("nonContourDetectedFaces");
        C43347jV7 c43347jV76 = new C43347jV7();
        c43347jV76.m30420a(6);
        f16345g = m84930a6.m84925b(c43347jV76.m30419b()).m84926a();
    }

    private C33646Ir8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C47463qR8 c47463qR8 = (C47463qR8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f16340b, c47463qR8.m17504c());
        interfaceC35153Pd32.mo23527f(f16341c, null);
        interfaceC35153Pd32.mo23527f(f16342d, c47463qR8.m17505b());
        interfaceC35153Pd32.mo23527f(f16343e, c47463qR8.m17506a());
        interfaceC35153Pd32.mo23527f(f16344f, c47463qR8.m17503d());
        interfaceC35153Pd32.mo23527f(f16345g, c47463qR8.m17502e());
    }
}
