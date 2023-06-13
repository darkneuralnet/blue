package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import p000.C35916Sk1;
/* renamed from: vy8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50747vy8 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final C50747vy8 f115060a = new C50747vy8();

    /* renamed from: b */
    public static final C35916Sk1 f115061b;

    /* renamed from: c */
    public static final C35916Sk1 f115062c;

    /* renamed from: d */
    public static final C35916Sk1 f115063d;

    static {
        C35916Sk1.C7526b m84930a = C35916Sk1.m84930a(Stripe3ds2AuthParams.FIELD_SOURCE);
        MO7 mo7 = new MO7();
        mo7.m95319a(1);
        f115061b = m84930a.m84925b(mo7.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a2 = C35916Sk1.m84930a("errorCode");
        MO7 mo72 = new MO7();
        mo72.m95319a(2);
        f115062c = m84930a2.m84925b(mo72.m95318b()).m84926a();
        C35916Sk1.C7526b m84930a3 = C35916Sk1.m84930a("errorMessage");
        MO7 mo73 = new MO7();
        mo73.m95319a(3);
        f115063d = m84930a3.m84925b(mo73.m95318b()).m84926a();
    }

    private C50747vy8() {
    }

    @Override // p000.InterfaceC45768nb1
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
        P89 p89 = (P89) obj;
        throw null;
    }
}
