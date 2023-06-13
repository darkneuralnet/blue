package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Vl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36634Vl8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C36634Vl8 f39728a = new C36634Vl8();

    /* renamed from: b */
    public static final C35916Sk1 f39729b;

    /* renamed from: c */
    public static final C35916Sk1 f39730c;

    /* renamed from: d */
    public static final C35916Sk1 f39731d;

    /* renamed from: e */
    public static final C35916Sk1 f39732e;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("imageFormat");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f39729b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("originalImageSize");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f39730c = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("compressedImageSize");
        C43347jV7 c43347jV73 = new C43347jV7();
        c43347jV73.m30420a(3);
        f39731d = m84930a3.m84925b(c43347jV73.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("isOdmlImage");
        C43347jV7 c43347jV74 = new C43347jV7();
        c43347jV74.m30420a(4);
        f39732e = m84930a4.m84925b(c43347jV74.m30419b()).m84926a();
    }

    private C36634Vl8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        RK8 rk8 = (RK8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f39729b, rk8.m86844a());
        interfaceC35153Pd32.mo23527f(f39730c, rk8.m86843b());
        interfaceC35153Pd32.mo23527f(f39731d, null);
        interfaceC35153Pd32.mo23527f(f39732e, null);
    }
}
