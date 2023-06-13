package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: LO8 */
/* loaded from: classes5.dex */
public final class LO8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final LO8 f21369a = new LO8();

    /* renamed from: b */
    public static final C35916Sk1 f21370b;

    /* renamed from: c */
    public static final C35916Sk1 f21371c;

    /* renamed from: d */
    public static final C35916Sk1 f21372d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("languageOption");
        QW7 qw7 = new QW7();
        qw7.m88440a(3);
        f21370b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("isUsingLegacyApi");
        QW7 qw72 = new QW7();
        qw72.m88440a(4);
        f21371c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("sdkVersion");
        QW7 qw73 = new QW7();
        qw73.m88440a(5);
        f21372d = m84930a3.m84925b(qw73.m88439b()).m84926a();
    }

    private LO8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f21370b, ((C43444jf9) obj).m30127a());
        interfaceC35153Pd32.mo23527f(f21371c, null);
        interfaceC35153Pd32.mo23527f(f21372d, null);
    }
}
