package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC51188wj6;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, m28432d2 = {"LRj2;", "", "", "birthDateOrTaxNumber", "LYk1;", C17296a.f69688o, "cardPassword", "b", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Rj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35674Rj2 {

    /* renamed from: a */
    public static final C35674Rj2 f32477a = new C35674Rj2();

    private C35674Rj2() {
    }

    /* renamed from: a */
    public final C37320Yk1<String> m86418a(String birthDateOrTaxNumber) {
        AbstractC51188wj6 c29948a;
        Intrinsics.checkNotNullParameter(birthDateOrTaxNumber, "birthDateOrTaxNumber");
        int length = birthDateOrTaxNumber.length();
        if (length == 6 && C48066rT0.f107119a.m15926a(birthDateOrTaxNumber, "yyMMdd")) {
            c29948a = AbstractC51188wj6.C29949b.f116411a;
        } else if (length == 10) {
            c29948a = AbstractC51188wj6.C29949b.f116411a;
        } else {
            c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_kcp_birth_date_or_tax_number_invalid);
        }
        return new C37320Yk1<>(birthDateOrTaxNumber, c29948a);
    }

    /* renamed from: b */
    public final C37320Yk1<String> m86417b(String cardPassword) {
        AbstractC51188wj6 c29948a;
        Intrinsics.checkNotNullParameter(cardPassword, "cardPassword");
        if (cardPassword.length() == 2) {
            c29948a = AbstractC51188wj6.C29949b.f116411a;
        } else {
            c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_kcp_password_invalid);
        }
        return new C37320Yk1<>(cardPassword, c29948a);
    }
}
