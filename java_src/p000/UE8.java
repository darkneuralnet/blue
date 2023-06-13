package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: UE8 */
/* loaded from: classes5.dex */
public final class UE8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final UE8 f37128a = new UE8();

    /* renamed from: b */
    public static final C35916Sk1 f37129b;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        C52545z08 c52545z08 = new C52545z08();
        c52545z08.m2111a(1);
        f37129b = m84930a.m84925b(c52545z08.m2110b()).m84926a();
    }

    private UE8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f37129b, ((C50254v89) obj).m9132a());
    }
}
