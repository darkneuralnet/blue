package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: BO8 */
/* loaded from: classes5.dex */
public final class BO8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final BO8 f2258a = new BO8();

    /* renamed from: b */
    public static final C35916Sk1 f2259b;

    /* renamed from: c */
    public static final C35916Sk1 f2260c;

    /* renamed from: d */
    public static final C35916Sk1 f2261d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("inferenceCommonLogEvent");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f2259b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("imageInfo");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f2260c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("recognizerOptions");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f2261d = m84930a3.m84925b(qw73.m88439b()).m84926a();
    }

    private BO8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        Fe9 fe9 = (Fe9) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f2259b, fe9.m106770b());
        interfaceC35153Pd32.mo23527f(f2260c, fe9.m106771a());
        interfaceC35153Pd32.mo23527f(f2261d, fe9.m106769c());
    }
}
