package p000;

import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: jf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43443jf8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C43443jf8 f93114a = new C43443jf8();

    /* renamed from: b */
    public static final C35916Sk1 f93115b;

    /* renamed from: c */
    public static final C35916Sk1 f93116c;

    /* renamed from: d */
    public static final C35916Sk1 f93117d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a("options");
        C46258oP7 c46258oP7 = new C46258oP7();
        c46258oP7.m21095a(1);
        f93115b = m84930a.m84925b(c46258oP7.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("eventType");
        C46258oP7 c46258oP72 = new C46258oP7();
        c46258oP72.m21095a(2);
        f93116c = m84930a2.m84925b(c46258oP72.m21094b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("errorCode");
        C46258oP7 c46258oP73 = new C46258oP7();
        c46258oP73.m21095a(3);
        f93117d = m84930a3.m84925b(c46258oP73.m21094b()).m84926a();
    }

    private C43443jf8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        WC8 wc8 = (WC8) obj;
        InterfaceC35153Pd3 interfaceC35153Pd32 = interfaceC35153Pd3;
        interfaceC35153Pd32.mo23527f(f93115b, wc8.m78707a());
        interfaceC35153Pd32.mo23527f(f93116c, null);
        interfaceC35153Pd32.mo23527f(f93117d, wc8.m78706b());
    }
}
