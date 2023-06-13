package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LeL3;", "", "", "merchantSiteId", "", "amount", "tip", C17296a.f69688o, "(Ljava/lang/String;ILjava/lang/Integer;)LeL3;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getMerchantSiteId", "()Ljava/lang/String;", "I", "getAmount", "()I", "Ljava/lang/Integer;", "getTip", "()Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eL3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40288eL3 {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final int amount;
    @JsonProperty("merchant_site_id")
    @InterfaceC41208ft5("merchant_site_id")
    private final String merchantSiteId;
    @JsonProperty("tip_amount")
    @InterfaceC41208ft5("tip_amount")
    private final Integer tip;

    public C40288eL3() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ C40288eL3 copy$default(C40288eL3 c40288eL3, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c40288eL3.merchantSiteId;
        }
        if ((i2 & 2) != 0) {
            i = c40288eL3.amount;
        }
        if ((i2 & 4) != 0) {
            num = c40288eL3.tip;
        }
        return c40288eL3.m43020a(str, i, num);
    }

    /* renamed from: a */
    public final C40288eL3 m43020a(String merchantSiteId, int i, Integer num) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        return new C40288eL3(merchantSiteId, i, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40288eL3) {
            C40288eL3 c40288eL3 = (C40288eL3) obj;
            return Intrinsics.areEqual(this.merchantSiteId, c40288eL3.merchantSiteId) && this.amount == c40288eL3.amount && Intrinsics.areEqual(this.tip, c40288eL3.tip);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.merchantSiteId.hashCode() * 31) + Integer.hashCode(this.amount)) * 31;
        Integer num = this.tip;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.merchantSiteId;
        int i = this.amount;
        Integer num = this.tip;
        return "PayMerchantRequestBodyV2(merchantSiteId=" + str + ", amount=" + i + ", tip=" + num + ")";
    }

    public C40288eL3(String merchantSiteId, int i, Integer num) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        this.merchantSiteId = merchantSiteId;
        this.amount = i;
        this.tip = num;
    }

    public /* synthetic */ C40288eL3(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num);
    }
}
