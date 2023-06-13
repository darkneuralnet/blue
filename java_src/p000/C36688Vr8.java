package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: Vr8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36688Vr8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C36688Vr8 f39851a = new C36688Vr8();

    /* renamed from: b */
    public static final C35916Sk1 f39852b;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        C43347jV7 c43347jV7 = new C43347jV7();
        c43347jV7.m30420a(1);
        f39852b = m84930a.m84925b(c43347jV7.m30419b()).m84926a();
    }

    private C36688Vr8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f39852b, ((WR8) obj).m78434a());
    }
}
