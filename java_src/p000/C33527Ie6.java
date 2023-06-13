package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LIe6;", "", "", "merchantSiteId", "merchantId", "LRQ2;", "location", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getMerchantSiteId", "()Ljava/lang/String;", "getMerchantId", "LRQ2;", "getLocation", "()LRQ2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;LRQ2;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ie6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33527Ie6 {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final RQ2 location;
    @JsonProperty("merchant_id")
    @InterfaceC41208ft5("merchant_id")
    private final String merchantId;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")
    private final String merchantSiteId;

    public C33527Ie6(String merchantSiteId, String merchantId, RQ2 location) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(location, "location");
        this.merchantSiteId = merchantSiteId;
        this.merchantId = merchantId;
        this.location = location;
    }

    public static /* synthetic */ C33527Ie6 copy$default(C33527Ie6 c33527Ie6, String str, String str2, RQ2 rq2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33527Ie6.merchantSiteId;
        }
        if ((i & 2) != 0) {
            str2 = c33527Ie6.merchantId;
        }
        if ((i & 4) != 0) {
            rq2 = c33527Ie6.location;
        }
        return c33527Ie6.m101843a(str, str2, rq2);
    }

    /* renamed from: a */
    public final C33527Ie6 m101843a(String merchantSiteId, String merchantId, RQ2 location) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(location, "location");
        return new C33527Ie6(merchantSiteId, merchantId, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33527Ie6) {
            C33527Ie6 c33527Ie6 = (C33527Ie6) obj;
            return Intrinsics.areEqual(this.merchantSiteId, c33527Ie6.merchantSiteId) && Intrinsics.areEqual(this.merchantId, c33527Ie6.merchantId) && Intrinsics.areEqual(this.location, c33527Ie6.location);
        }
        return false;
    }

    public int hashCode() {
        return (((this.merchantSiteId.hashCode() * 31) + this.merchantId.hashCode()) * 31) + this.location.hashCode();
    }

    public String toString() {
        String str = this.merchantSiteId;
        String str2 = this.merchantId;
        RQ2 rq2 = this.location;
        return "UpdateMerchantSiteLocationBody(merchantSiteId=" + str + ", merchantId=" + str2 + ", location=" + rq2 + ")";
    }

    public /* synthetic */ C33527Ie6(String str, String str2, RQ2 rq2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, rq2);
    }
}
