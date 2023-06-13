package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LHE0;", "", "", "creditCardNumber", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getCreditCardNumber", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HE0 */
/* loaded from: classes4.dex */
public final class HE0 {

    /* renamed from: a */
    public final String f13110a;

    public HE0(String creditCardNumber) {
        Intrinsics.checkNotNullParameter(creditCardNumber, "creditCardNumber");
        this.f13110a = creditCardNumber;
    }

    public static /* synthetic */ HE0 copy$default(HE0 he0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = he0.f13110a;
        }
        return he0.m104153a(str);
    }

    /* renamed from: a */
    public final HE0 m104153a(String creditCardNumber) {
        Intrinsics.checkNotNullParameter(creditCardNumber, "creditCardNumber");
        return new HE0(creditCardNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HE0) && Intrinsics.areEqual(this.f13110a, ((HE0) obj).f13110a);
    }

    public int hashCode() {
        return this.f13110a.hashCode();
    }

    public String toString() {
        String str = this.f13110a;
        return "CreditCardResult(creditCardNumber=" + str + ")";
    }
}
