package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Nm8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34771Nm8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C34771Nm8 f25158a = new C34771Nm8();

    /* renamed from: b */
    public static final C35916Sk1 f25159b;

    /* renamed from: c */
    public static final C35916Sk1 f25160c;

    /* renamed from: d */
    public static final C35916Sk1 f25161d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("logEventKey");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f25159b = m84930a.m84925b(qw7.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("eventCount");
        QW7 qw72 = new QW7();
        qw72.m88440a(2);
        f25160c = m84930a2.m84925b(qw72.m88439b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("inferenceDurationStats");
        QW7 qw73 = new QW7();
        qw73.m88440a(3);
        f25161d = m84930a3.m84925b(qw73.m88439b()).m84926a();
    }

    private C34771Nm8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C35374Qb8 c35374Qb8 = (C35374Qb8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f25159b, c35374Qb8.m88368a());
        interfaceC35153Pd32.mo23527f(f25160c, c35374Qb8.m88366c());
        interfaceC35153Pd32.mo23527f(f25161d, c35374Qb8.m88367b());
    }
}
