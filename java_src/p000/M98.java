package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: M98 */
/* loaded from: classes5.dex */
public final class M98 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final M98 f22753a = new M98();

    /* renamed from: b */
    public static final C35916Sk1 f22754b;

    /* renamed from: c */
    public static final C35916Sk1 f22755c;

    /* renamed from: d */
    public static final C35916Sk1 f22756d;

    /* renamed from: e */
    public static final C35916Sk1 f22757e;

    /* renamed from: f */
    public static final C35916Sk1 f22758f;

    /* renamed from: g */
    public static final C35916Sk1 f22759g;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f22754b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("isColdCall");
        C43347jV7 c43347jV72 = new C43347jV7();
        c43347jV72.m30420a(2);
        f22755c = m84930a2.m84925b(c43347jV72.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("imageInfo");
        C43347jV7 c43347jV73 = new C43347jV7();
        c43347jV73.m30420a(3);
        f22756d = m84930a3.m84925b(c43347jV73.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("detectorOptions");
        C43347jV7 c43347jV74 = new C43347jV7();
        c43347jV74.m30420a(4);
        f22757e = m84930a4.m84925b(c43347jV74.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("contourDetectedFaces");
        C43347jV7 c43347jV75 = new C43347jV7();
        c43347jV75.m30420a(5);
        f22758f = m84930a5.m84925b(c43347jV75.m30419b()).m84926a();
        C35916Sk1.C7526b m84930a6 = C35916Sk1.m84930a("nonContourDetectedFaces");
        C43347jV7 c43347jV76 = new C43347jV7();
        c43347jV76.m30420a(6);
        f22759g = m84930a6.m84925b(c43347jV76.m30419b()).m84926a();
    }

    private M98() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        U18 u18 = (U18) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f22754b, u18.m82100b());
        interfaceC35153Pd32.mo23527f(f22755c, u18.m82099c());
        interfaceC35153Pd32.mo23527f(f22756d, null);
        interfaceC35153Pd32.mo23527f(f22757e, u18.m82101a());
        interfaceC35153Pd32.mo23527f(f22758f, u18.m82098d());
        interfaceC35153Pd32.mo23527f(f22759g, u18.m82097e());
    }
}
