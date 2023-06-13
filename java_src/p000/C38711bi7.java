package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: bi7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38711bi7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C38711bi7 f57991a = new C38711bi7();

    /* renamed from: b */
    public static final C35916Sk1 f57992b;

    /* renamed from: c */
    public static final C35916Sk1 f57993c;

    /* renamed from: d */
    public static final C35916Sk1 f57994d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a(Stripe3ds2AuthParams.FIELD_SOURCE);
        F19 f19 = new F19();
        f19.m108098a(1);
        f57992b = m84930a.m84925b(f19.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("errorCode");
        F19 f192 = new F19();
        f192.m108098a(2);
        f57993c = m84930a2.m84925b(f192.m108097b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("errorMessage");
        F19 f193 = new F19();
        f193.m108098a(3);
        f57994d = m84930a3.m84925b(f193.m108097b()).m84926a();
    }

    private C38711bi7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        C34302Lm7 c34302Lm7 = (C34302Lm7) obj;
        throw null;
    }
}
