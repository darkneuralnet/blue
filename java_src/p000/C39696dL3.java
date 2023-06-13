package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LdL3;", "", "", "merchantSiteId", "", "amount", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getMerchantSiteId", "()Ljava/lang/String;", "I", "getAmount", "()I", "<init>", "(Ljava/lang/String;I)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dL3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39696dL3 {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final int amount;
    @JsonProperty("merchant_site_id")
    @InterfaceC41208ft5("merchant_site_id")
    private final String merchantSiteId;

    public C39696dL3() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ C39696dL3 copy$default(C39696dL3 c39696dL3, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c39696dL3.merchantSiteId;
        }
        if ((i2 & 2) != 0) {
            i = c39696dL3.amount;
        }
        return c39696dL3.m44386a(str, i);
    }

    /* renamed from: a */
    public final C39696dL3 m44386a(String merchantSiteId, int i) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        return new C39696dL3(merchantSiteId, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39696dL3) {
            C39696dL3 c39696dL3 = (C39696dL3) obj;
            return Intrinsics.areEqual(this.merchantSiteId, c39696dL3.merchantSiteId) && this.amount == c39696dL3.amount;
        }
        return false;
    }

    public int hashCode() {
        return (this.merchantSiteId.hashCode() * 31) + Integer.hashCode(this.amount);
    }

    public String toString() {
        String str = this.merchantSiteId;
        int i = this.amount;
        return "PayMerchantRequestBodyV1(merchantSiteId=" + str + ", amount=" + i + ")";
    }

    public C39696dL3(String merchantSiteId, int i) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        this.merchantSiteId = merchantSiteId;
        this.amount = i;
    }

    public /* synthetic */ C39696dL3(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
