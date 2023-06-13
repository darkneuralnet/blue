package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.card.api.model.Brand;
import com.adyen.checkout.components.model.paymentmethods.StoredPaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC51188wj6;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100&2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$H\u0016J\u0006\u0010)\u001a\u00020(J\u0006\u0010*\u001a\u00020\u0002R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, m28432d2 = {"LiR5;", "LEf0;", "", C17296a.f69688o, "cardNumber", "", "enableLuhnCheck", "LYk1;", "l", "(Ljava/lang/String;Ljava/lang/Boolean;)LYk1;", "Lvi1;", "expiryDate", "Lcom/adyen/checkout/card/api/model/Brand$c;", "expiryDatePolicy", "m", "securityCode", "LT11;", "cardType", "r", "holderName", "n", "socialSecurityNumber", "s", "kcpBirthDateOrTaxNumber", "o", "kcpCardPassword", "p", "postalCode", "q", "f", "j", "h", "k", "g", "i", "publicKey", "LZC0;", "coroutineScope", "", "b", "LHf0;", "u", "t", "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/components/model/paymentmethods/StoredPaymentMethod;", "storedPaymentMethod", "LXf0;", "e", "LXf0;", "Ljava/util/List;", "storedDetectedCardTypes", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: iR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42716iR5 extends AbstractC32594Ef0 {

    /* renamed from: d */
    public final StoredPaymentMethod f87333d;

    /* renamed from: e */
    public final EnumC37040Xf0 f87334e;

    /* renamed from: f */
    public final List<T11> f87335f;

    @Override // p000.InterfaceC48607sN3
    /* renamed from: a */
    public String mo14257a() {
        String type = this.f87333d.getType();
        return type == null ? "unknown" : type;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: b */
    public List<T11> mo33926b(String cardNumber, String str, ZC0 coroutineScope) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return this.f87335f;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: f */
    public boolean mo33925f() {
        boolean contains;
        if (!m108597d().m53709l()) {
            contains = CollectionsKt___CollectionsKt.contains(m108596e(), this.f87334e);
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: g */
    public boolean mo33924g() {
        return false;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: h */
    public boolean mo33923h() {
        return false;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: i */
    public boolean mo33922i() {
        return false;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: j */
    public boolean mo33921j() {
        return false;
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: k */
    public boolean mo33920k() {
        return !m108597d().m53709l();
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: l */
    public C37320Yk1<String> mo33919l(String cardNumber, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        return new C37320Yk1<>(cardNumber, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: m */
    public C37320Yk1<C50580vi1> mo33918m(C50580vi1 expiryDate, Brand.EnumC16802c enumC16802c) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        return new C37320Yk1<>(expiryDate, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: n */
    public C37320Yk1<String> mo33917n(String holderName) {
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        return new C37320Yk1<>(holderName, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: o */
    public C37320Yk1<String> mo33916o(String kcpBirthDateOrTaxNumber) {
        Intrinsics.checkNotNullParameter(kcpBirthDateOrTaxNumber, "kcpBirthDateOrTaxNumber");
        return new C37320Yk1<>(kcpBirthDateOrTaxNumber, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: p */
    public C37320Yk1<String> mo33915p(String kcpCardPassword) {
        Intrinsics.checkNotNullParameter(kcpCardPassword, "kcpCardPassword");
        return new C37320Yk1<>(kcpCardPassword, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: q */
    public C37320Yk1<String> mo33914q(String postalCode) {
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        return new C37320Yk1<>(postalCode, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: r */
    public C37320Yk1<String> mo33913r(String securityCode, T11 t11) {
        EnumC37040Xf0 m84423b;
        boolean contains;
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        if (!m108597d().m53709l()) {
            Set<EnumC37040Xf0> m108596e = m108596e();
            if (t11 == null) {
                m84423b = null;
            } else {
                m84423b = t11.m84423b();
            }
            contains = CollectionsKt___CollectionsKt.contains(m108596e, m84423b);
            if (!contains) {
                return C37274Yf0.f46219a.m74600g(securityCode, t11);
            }
        }
        return new C37320Yk1<>(securityCode, AbstractC51188wj6.C29949b.f116411a);
    }

    @Override // p000.AbstractC32594Ef0
    /* renamed from: s */
    public C37320Yk1<String> mo33912s(String socialSecurityNumber) {
        Intrinsics.checkNotNullParameter(socialSecurityNumber, "socialSecurityNumber");
        return new C37320Yk1<>(socialSecurityNumber, AbstractC51188wj6.C29949b.f116411a);
    }

    /* renamed from: t */
    public final String m33911t() {
        String id = this.f87333d.getId();
        return id == null ? "ID_NOT_FOUND" : id;
    }

    /* renamed from: u */
    public final C33296Hf0 m33910u() {
        String str;
        C33296Hf0 c33296Hf0 = new C33296Hf0(null, null, null, null, null, null, null, null, false, 511, null);
        String lastFour = this.f87333d.getLastFour();
        String str2 = "";
        if (lastFour == null) {
            lastFour = "";
        }
        c33296Hf0.m103565j(lastFour);
        try {
            String expiryMonth = this.f87333d.getExpiryMonth();
            if (expiryMonth == null) {
                expiryMonth = "";
            }
            int parseInt = Integer.parseInt(expiryMonth);
            String expiryYear = this.f87333d.getExpiryYear();
            if (expiryYear != null) {
                str2 = expiryYear;
            }
            c33296Hf0.m103564k(new C50580vi1(parseInt, Integer.parseInt(str2), true));
        } catch (NumberFormatException e) {
            str = C43309jR5.f92718a;
            C32290Cx2.m111211d(str, "Failed to parse stored Date", e);
            C50580vi1 EMPTY_DATE = C50580vi1.f114526d;
            Intrinsics.checkNotNullExpressionValue(EMPTY_DATE, "EMPTY_DATE");
            c33296Hf0.m103564k(EMPTY_DATE);
        }
        return c33296Hf0;
    }
}
