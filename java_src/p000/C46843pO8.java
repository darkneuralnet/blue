package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: pO8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46843pO8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C46843pO8 f103637a = new C46843pO8();

    /* renamed from: b */
    public static final C35916Sk1 f103638b;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("errorCode");
        QW7 qw7 = new QW7();
        qw7.m88440a(1);
        f103638b = m84930a.m84925b(qw7.m88439b()).m84926a();
    }

    private C46843pO8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        interfaceC35153Pd3.mo23527f(f103638b, ((C43434je9) obj).m30133a());
    }
}
