package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: ex8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40658ex8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C40658ex8 f79200a = new C40658ex8();

    /* renamed from: b */
    public static final C35916Sk1 f79201b;

    /* renamed from: c */
    public static final C35916Sk1 f79202c;

    /* renamed from: d */
    public static final C35916Sk1 f79203d;

    /* renamed from: e */
    public static final C35916Sk1 f79204e;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("imageFormat");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f79201b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("originalImageSize");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f79202c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("compressedImageSize");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f79203d = m84930a3.m84925b(qw73.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a4 = C35916Sk1.m84930a("isOdmlImage");
        QW7 qw74 = new QW7();
        qw74.m88440a(4);
        f79204e = m84930a4.m84925b(qw74.m88439b()).m84926a();
    }

    private C40658ex8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C46035o19 c46035o19 = (C46035o19) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f79201b, c46035o19.m21967a());
        interfaceC35153Pd32.mo23527f(f79202c, c46035o19.m21966b());
        interfaceC35153Pd32.mo23527f(f79203d, null);
        interfaceC35153Pd32.mo23527f(f79204e, null);
    }
}
