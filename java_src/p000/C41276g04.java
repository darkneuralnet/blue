package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lg04;", "Lz04;", "", "textRes0", "", "dynamicPricing", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "c", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41276g04 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final int f81285a;

    /* renamed from: b */
    public final String f81286b;

    public C41276g04(int i, String str) {
        this.f81285a = i;
        this.f81286b = str;
    }

    public static /* synthetic */ C41276g04 copy$default(C41276g04 c41276g04, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c41276g04.f81285a;
        }
        if ((i2 & 2) != 0) {
            str = c41276g04.f81286b;
        }
        return c41276g04.m40358a(i, str);
    }

    /* renamed from: a */
    public final C41276g04 m40358a(int i, String str) {
        return new C41276g04(i, str);
    }

    /* renamed from: b */
    public final String m40357b() {
        return this.f81286b;
    }

    /* renamed from: c */
    public final int m40356c() {
        return this.f81285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41276g04) {
            C41276g04 c41276g04 = (C41276g04) obj;
            return this.f81285a == c41276g04.f81285a && Intrinsics.areEqual(this.f81286b, c41276g04.f81286b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f81285a) * 31;
        String str = this.f81286b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f81285a;
        String str = this.f81286b;
        return "PreloadMandatory(textRes0=" + i + ", dynamicPricing=" + str + ")";
    }

    public /* synthetic */ C41276g04(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C45871nl4.payment_quick_pay_now_or_later : i, str);
    }
}
