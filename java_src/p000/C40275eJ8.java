package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: eJ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40275eJ8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C40275eJ8 f78229a = new C40275eJ8();

    /* renamed from: b */
    public static final C35916Sk1 f78230b;

    /* renamed from: c */
    public static final C35916Sk1 f78231c;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorSpace");
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f78230b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("errorCode");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f78231c = m84930a2.m84925b(mo72.m95318b()).m84926a();
    }

    private C40275eJ8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        N69 n69 = (N69) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f78230b, n69.m94362a());
        interfaceC35153Pd32.mo23527f(f78231c, n69.m94361b());
    }
}
