package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020&\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000eR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u001c\u0010\u000eR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b \u0010\u000eR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010)\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b\u0011\u0010(R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b\u0019\u0010(R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0014\u0010/R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b-\u0010$R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b1\u0010$¨\u00068"}, m28432d2 = {"LWf0;", "LcA3;", "", "p", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "LYk1;", C17296a.f69688o, "LYk1;", "()LYk1;", "cardNumberState", "Lvi1;", "b", DateTokenConverter.CONVERTER_KEY, "expiryDateState", "c", "j", "securityCodeState", "f", "holderNameState", "e", "k", "socialSecurityNumberState", "g", "kcpBirthDateOrTaxNumberState", "h", "kcpCardPasswordState", "i", "postalCodeState", "Z", "o", "()Z", "isStoredPaymentMethodEnable", "Le32;", "Le32;", "()Le32;", "cvcUIState", "expiryDateUIState", "", "LT11;", "l", "Ljava/util/List;", "()Ljava/util/List;", "detectedCardTypes", "m", "n", "isSocialSecurityNumberRequired", "isKCPAuthRequired", "isPostalCodeRequired", "<init>", "(LYk1;LYk1;LYk1;LYk1;LYk1;LYk1;LYk1;LYk1;ZLe32;Le32;Ljava/util/List;ZZZ)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Wf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36806Wf0 implements InterfaceC38986cA3 {

    /* renamed from: a */
    public final C37320Yk1<String> f41466a;

    /* renamed from: b */
    public final C37320Yk1<C50580vi1> f41467b;

    /* renamed from: c */
    public final C37320Yk1<String> f41468c;

    /* renamed from: d */
    public final C37320Yk1<String> f41469d;

    /* renamed from: e */
    public final C37320Yk1<String> f41470e;

    /* renamed from: f */
    public final C37320Yk1<String> f41471f;

    /* renamed from: g */
    public final C37320Yk1<String> f41472g;

    /* renamed from: h */
    public final C37320Yk1<String> f41473h;

    /* renamed from: i */
    public final boolean f41474i;

    /* renamed from: j */
    public final EnumC40118e32 f41475j;

    /* renamed from: k */
    public final EnumC40118e32 f41476k;

    /* renamed from: l */
    public final List<T11> f41477l;

    /* renamed from: m */
    public final boolean f41478m;

    /* renamed from: n */
    public final boolean f41479n;

    /* renamed from: o */
    public final boolean f41480o;

    public C36806Wf0(C37320Yk1<String> cardNumberState, C37320Yk1<C50580vi1> expiryDateState, C37320Yk1<String> securityCodeState, C37320Yk1<String> holderNameState, C37320Yk1<String> socialSecurityNumberState, C37320Yk1<String> kcpBirthDateOrTaxNumberState, C37320Yk1<String> kcpCardPasswordState, C37320Yk1<String> postalCodeState, boolean z, EnumC40118e32 cvcUIState, EnumC40118e32 expiryDateUIState, List<T11> detectedCardTypes, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(cardNumberState, "cardNumberState");
        Intrinsics.checkNotNullParameter(expiryDateState, "expiryDateState");
        Intrinsics.checkNotNullParameter(securityCodeState, "securityCodeState");
        Intrinsics.checkNotNullParameter(holderNameState, "holderNameState");
        Intrinsics.checkNotNullParameter(socialSecurityNumberState, "socialSecurityNumberState");
        Intrinsics.checkNotNullParameter(kcpBirthDateOrTaxNumberState, "kcpBirthDateOrTaxNumberState");
        Intrinsics.checkNotNullParameter(kcpCardPasswordState, "kcpCardPasswordState");
        Intrinsics.checkNotNullParameter(postalCodeState, "postalCodeState");
        Intrinsics.checkNotNullParameter(cvcUIState, "cvcUIState");
        Intrinsics.checkNotNullParameter(expiryDateUIState, "expiryDateUIState");
        Intrinsics.checkNotNullParameter(detectedCardTypes, "detectedCardTypes");
        this.f41466a = cardNumberState;
        this.f41467b = expiryDateState;
        this.f41468c = securityCodeState;
        this.f41469d = holderNameState;
        this.f41470e = socialSecurityNumberState;
        this.f41471f = kcpBirthDateOrTaxNumberState;
        this.f41472g = kcpCardPasswordState;
        this.f41473h = postalCodeState;
        this.f41474i = z;
        this.f41475j = cvcUIState;
        this.f41476k = expiryDateUIState;
        this.f41477l = detectedCardTypes;
        this.f41478m = z2;
        this.f41479n = z3;
        this.f41480o = z4;
    }

    /* renamed from: a */
    public final C37320Yk1<String> m78044a() {
        return this.f41466a;
    }

    /* renamed from: b */
    public final EnumC40118e32 m78043b() {
        return this.f41475j;
    }

    /* renamed from: c */
    public final List<T11> m78042c() {
        return this.f41477l;
    }

    /* renamed from: d */
    public final C37320Yk1<C50580vi1> m78041d() {
        return this.f41467b;
    }

    /* renamed from: e */
    public final EnumC40118e32 m78040e() {
        return this.f41476k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36806Wf0) {
            C36806Wf0 c36806Wf0 = (C36806Wf0) obj;
            return Intrinsics.areEqual(this.f41466a, c36806Wf0.f41466a) && Intrinsics.areEqual(this.f41467b, c36806Wf0.f41467b) && Intrinsics.areEqual(this.f41468c, c36806Wf0.f41468c) && Intrinsics.areEqual(this.f41469d, c36806Wf0.f41469d) && Intrinsics.areEqual(this.f41470e, c36806Wf0.f41470e) && Intrinsics.areEqual(this.f41471f, c36806Wf0.f41471f) && Intrinsics.areEqual(this.f41472g, c36806Wf0.f41472g) && Intrinsics.areEqual(this.f41473h, c36806Wf0.f41473h) && this.f41474i == c36806Wf0.f41474i && this.f41475j == c36806Wf0.f41475j && this.f41476k == c36806Wf0.f41476k && Intrinsics.areEqual(this.f41477l, c36806Wf0.f41477l) && this.f41478m == c36806Wf0.f41478m && this.f41479n == c36806Wf0.f41479n && this.f41480o == c36806Wf0.f41480o;
        }
        return false;
    }

    /* renamed from: f */
    public final C37320Yk1<String> m78039f() {
        return this.f41469d;
    }

    /* renamed from: g */
    public final C37320Yk1<String> m78038g() {
        return this.f41471f;
    }

    /* renamed from: h */
    public final C37320Yk1<String> m78037h() {
        return this.f41472g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.f41466a.hashCode() * 31) + this.f41467b.hashCode()) * 31) + this.f41468c.hashCode()) * 31) + this.f41469d.hashCode()) * 31) + this.f41470e.hashCode()) * 31) + this.f41471f.hashCode()) * 31) + this.f41472g.hashCode()) * 31) + this.f41473h.hashCode()) * 31;
        boolean z = this.f41474i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + this.f41475j.hashCode()) * 31) + this.f41476k.hashCode()) * 31) + this.f41477l.hashCode()) * 31;
        boolean z2 = this.f41478m;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z3 = this.f41479n;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z4 = this.f41480o;
        return i5 + (z4 ? 1 : z4 ? 1 : 0);
    }

    /* renamed from: i */
    public final C37320Yk1<String> m78036i() {
        return this.f41473h;
    }

    /* renamed from: j */
    public final C37320Yk1<String> m78035j() {
        return this.f41468c;
    }

    /* renamed from: k */
    public final C37320Yk1<String> m78034k() {
        return this.f41470e;
    }

    /* renamed from: l */
    public final boolean m78033l() {
        return this.f41479n;
    }

    /* renamed from: m */
    public final boolean m78032m() {
        return this.f41480o;
    }

    /* renamed from: n */
    public final boolean m78031n() {
        return this.f41478m;
    }

    /* renamed from: o */
    public final boolean m78030o() {
        return this.f41474i;
    }

    /* renamed from: p */
    public boolean m78029p() {
        if (this.f41466a.m74342a().m6431a() && this.f41467b.m74342a().m6431a() && this.f41468c.m74342a().m6431a() && this.f41469d.m74342a().m6431a() && this.f41470e.m74342a().m6431a() && this.f41471f.m74342a().m6431a() && this.f41472g.m74342a().m6431a() && this.f41473h.m74342a().m6431a()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "CardOutputData(cardNumberState=" + this.f41466a + ", expiryDateState=" + this.f41467b + ", securityCodeState=" + this.f41468c + ", holderNameState=" + this.f41469d + ", socialSecurityNumberState=" + this.f41470e + ", kcpBirthDateOrTaxNumberState=" + this.f41471f + ", kcpCardPasswordState=" + this.f41472g + ", postalCodeState=" + this.f41473h + ", isStoredPaymentMethodEnable=" + this.f41474i + ", cvcUIState=" + this.f41475j + ", expiryDateUIState=" + this.f41476k + ", detectedCardTypes=" + this.f41477l + ", isSocialSecurityNumberRequired=" + this.f41478m + ", isKCPAuthRequired=" + this.f41479n + ", isPostalCodeRequired=" + this.f41480o + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
