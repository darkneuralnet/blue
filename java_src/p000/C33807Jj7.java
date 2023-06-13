package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Jj7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33807Jj7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C33807Jj7 f18088a = new C33807Jj7();

    /* renamed from: b */
    public static final C35916Sk1 f18089b;

    /* renamed from: c */
    public static final C35916Sk1 f18090c;

    /* renamed from: d */
    public static final C35916Sk1 f18091d;

    /* renamed from: e */
    public static final C35916Sk1 f18092e;

    /* renamed from: f */
    public static final C35916Sk1 f18093f;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("durationMs");
        F19 f19 = new F19();
        f19.m108098a(1);
        f18089b = m84930a.m84925b(f19.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("handledErrors");
        F19 f192 = new F19();
        f192.m108098a(2);
        f18090c = m84930a2.m84925b(f192.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("partiallyHandledErrors");
        F19 f193 = new F19();
        f193.m108098a(3);
        f18091d = m84930a3.m84925b(f193.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("unhandledErrors");
        F19 f194 = new F19();
        f194.m108098a(4);
        f18092e = m84930a4.m84925b(f194.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a5 = C35916Sk1.m84930a("httpResponseCode");
        F19 f195 = new F19();
        f195.m108098a(5);
        f18093f = m84930a5.m84925b(f195.m108097b()).m84926a();
    }

    private C33807Jj7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C31962Bm7 c31962Bm7 = (C31962Bm7) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f18089b, c31962Bm7.m113498e());
        interfaceC35153Pd32.mo23527f(f18090c, c31962Bm7.m113502a());
        interfaceC35153Pd32.mo23527f(f18091d, c31962Bm7.m113501b());
        interfaceC35153Pd32.mo23527f(f18092e, c31962Bm7.m113500c());
        interfaceC35153Pd32.mo23527f(f18093f, c31962Bm7.m113499d());
    }
}
