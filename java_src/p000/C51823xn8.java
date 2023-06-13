package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: xn8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51823xn8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C51823xn8 f118132a = new C51823xn8();

    /* renamed from: b */
    public static final C35916Sk1 f118133b;

    /* renamed from: c */
    public static final C35916Sk1 f118134c;

    /* renamed from: d */
    public static final C35916Sk1 f118135d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("logEventKey");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f118133b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("eventCount");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f118134c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("inferenceDurationStats");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f118135d = m84930a3.m84925b(mo73.m95318b()).m84926a();
    }

    private C51823xn8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C46428oh8 c46428oh8 = (C46428oh8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f118133b, c46428oh8.m20615a());
        interfaceC35153Pd32.mo23527f(f118134c, c46428oh8.m20613c());
        interfaceC35153Pd32.mo23527f(f118135d, c46428oh8.m20614b());
    }
}
