package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJY\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001f"}, m28432d2 = {"LEo6;", "Lz04;", "", "dynamicPricing", "", "Lco/bird/android/model/constant/PaymentMethod;", "prePayPaymentMethods", "postPayPaymentMethods", "preloadMaxIncentiveTitle", "preloadMaxIncentiveSubtitle", "paymentTermsText", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", DateTokenConverter.CONVERTER_KEY, "g", "f", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Eo6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32681Eo6 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final String f8160a;

    /* renamed from: b */
    public final List<PaymentMethod> f8161b;

    /* renamed from: c */
    public final List<PaymentMethod> f8162c;

    /* renamed from: d */
    public final String f8163d;

    /* renamed from: e */
    public final String f8164e;

    /* renamed from: f */
    public final String f8165f;

    /* JADX WARN: Multi-variable type inference failed */
    public C32681Eo6(String str, List<? extends PaymentMethod> prePayPaymentMethods, List<? extends PaymentMethod> postPayPaymentMethods, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(prePayPaymentMethods, "prePayPaymentMethods");
        Intrinsics.checkNotNullParameter(postPayPaymentMethods, "postPayPaymentMethods");
        this.f8160a = str;
        this.f8161b = prePayPaymentMethods;
        this.f8162c = postPayPaymentMethods;
        this.f8163d = str2;
        this.f8164e = str3;
        this.f8165f = str4;
    }

    public static /* synthetic */ C32681Eo6 copy$default(C32681Eo6 c32681Eo6, String str, List list, List list2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32681Eo6.f8160a;
        }
        List<PaymentMethod> list3 = list;
        if ((i & 2) != 0) {
            list3 = c32681Eo6.f8161b;
        }
        List list4 = list3;
        List<PaymentMethod> list5 = list2;
        if ((i & 4) != 0) {
            list5 = c32681Eo6.f8162c;
        }
        List list6 = list5;
        if ((i & 8) != 0) {
            str2 = c32681Eo6.f8163d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c32681Eo6.f8164e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c32681Eo6.f8165f;
        }
        return c32681Eo6.m108347a(str, list4, list6, str5, str6, str4);
    }

    /* renamed from: a */
    public final C32681Eo6 m108347a(String str, List<? extends PaymentMethod> prePayPaymentMethods, List<? extends PaymentMethod> postPayPaymentMethods, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(prePayPaymentMethods, "prePayPaymentMethods");
        Intrinsics.checkNotNullParameter(postPayPaymentMethods, "postPayPaymentMethods");
        return new C32681Eo6(str, prePayPaymentMethods, postPayPaymentMethods, str2, str3, str4);
    }

    /* renamed from: b */
    public final String m108346b() {
        return this.f8160a;
    }

    /* renamed from: c */
    public final String m108345c() {
        return this.f8165f;
    }

    /* renamed from: d */
    public final List<PaymentMethod> m108344d() {
        return this.f8162c;
    }

    /* renamed from: e */
    public final List<PaymentMethod> m108343e() {
        return this.f8161b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32681Eo6) {
            C32681Eo6 c32681Eo6 = (C32681Eo6) obj;
            return Intrinsics.areEqual(this.f8160a, c32681Eo6.f8160a) && Intrinsics.areEqual(this.f8161b, c32681Eo6.f8161b) && Intrinsics.areEqual(this.f8162c, c32681Eo6.f8162c) && Intrinsics.areEqual(this.f8163d, c32681Eo6.f8163d) && Intrinsics.areEqual(this.f8164e, c32681Eo6.f8164e) && Intrinsics.areEqual(this.f8165f, c32681Eo6.f8165f);
        }
        return false;
    }

    /* renamed from: f */
    public final String m108342f() {
        return this.f8164e;
    }

    /* renamed from: g */
    public final String m108341g() {
        return this.f8163d;
    }

    public int hashCode() {
        String str = this.f8160a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f8161b.hashCode()) * 31) + this.f8162c.hashCode()) * 31;
        String str2 = this.f8163d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8164e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8165f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f8160a;
        List<PaymentMethod> list = this.f8161b;
        List<PaymentMethod> list2 = this.f8162c;
        String str2 = this.f8163d;
        String str3 = this.f8164e;
        String str4 = this.f8165f;
        return "VersionBInitial(dynamicPricing=" + str + ", prePayPaymentMethods=" + list + ", postPayPaymentMethods=" + list2 + ", preloadMaxIncentiveTitle=" + str2 + ", preloadMaxIncentiveSubtitle=" + str3 + ", paymentTermsText=" + str4 + ")";
    }
}
