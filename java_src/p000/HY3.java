package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LHY3;", "Lz04;", "", "textRes0", "", "dynamicPricing", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "c", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HY3 */
/* loaded from: classes3.dex */
public final class HY3 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final int f13525a;

    /* renamed from: b */
    public final String f13526b;

    public HY3(int i, String str) {
        this.f13525a = i;
        this.f13526b = str;
    }

    public static /* synthetic */ HY3 copy$default(HY3 hy3, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hy3.f13525a;
        }
        if ((i2 & 2) != 0) {
            str = hy3.f13526b;
        }
        return hy3.m103761a(i, str);
    }

    /* renamed from: a */
    public final HY3 m103761a(int i, String str) {
        return new HY3(i, str);
    }

    /* renamed from: b */
    public final String m103760b() {
        return this.f13526b;
    }

    /* renamed from: c */
    public final int m103759c() {
        return this.f13525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HY3) {
            HY3 hy3 = (HY3) obj;
            return this.f13525a == hy3.f13525a && Intrinsics.areEqual(this.f13526b, hy3.f13526b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f13525a) * 31;
        String str = this.f13526b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f13525a;
        String str = this.f13526b;
        return "PostPayOnlyAvailable(textRes0=" + i + ", dynamicPricing=" + str + ")";
    }

    public /* synthetic */ HY3(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C45871nl4.pay_after_ride_description : i, str);
    }
}
