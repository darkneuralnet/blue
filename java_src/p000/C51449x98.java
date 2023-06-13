package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: x98  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51449x98 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C51449x98 f117152a = new C51449x98();

    /* renamed from: b */
    public static final C35916Sk1 f117153b;

    /* renamed from: c */
    public static final C35916Sk1 f117154c;

    /* renamed from: d */
    public static final C35916Sk1 f117155d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("logEventKey");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f117153b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("eventCount");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f117154c = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("inferenceDurationStats");
        C43347jV7 c43347jV73 = new C43347jV7();
        c43347jV73.m30420a(3);
        f117155d = m84930a3.m84925b(c43347jV73.m30419b()).m84926a();
    }

    private C51449x98() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C51972y28 c51972y28 = (C51972y28) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f117153b, c51972y28.m4228a());
        interfaceC35153Pd32.mo23527f(f117154c, c51972y28.m4226c());
        interfaceC35153Pd32.mo23527f(f117155d, c51972y28.m4227b());
    }
}
