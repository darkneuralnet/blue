package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/SkuOrderMissingRequestBody;", "", "skuOrderId", "", "missingSkus", "", "Lco/bird/api/request/SkuOrderMissing;", "(Ljava/lang/String;Ljava/util/List;)V", "getMissingSkus", "()Ljava/util/List;", "getSkuOrderId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SkuOrderMissingRequestBody {
    @JsonProperty("items")
    @InterfaceC41208ft5("items")
    private final List<SkuOrderMissing> missingSkus;
    @JsonProperty("sku_order_id")
    @InterfaceC41208ft5("sku_order_id")
    private final String skuOrderId;

    public SkuOrderMissingRequestBody(String skuOrderId, List<SkuOrderMissing> missingSkus) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(missingSkus, "missingSkus");
        this.skuOrderId = skuOrderId;
        this.missingSkus = missingSkus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuOrderMissingRequestBody copy$default(SkuOrderMissingRequestBody skuOrderMissingRequestBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skuOrderMissingRequestBody.skuOrderId;
        }
        if ((i & 2) != 0) {
            list = skuOrderMissingRequestBody.missingSkus;
        }
        return skuOrderMissingRequestBody.copy(str, list);
    }

    public final String component1() {
        return this.skuOrderId;
    }

    public final List<SkuOrderMissing> component2() {
        return this.missingSkus;
    }

    public final SkuOrderMissingRequestBody copy(String skuOrderId, List<SkuOrderMissing> missingSkus) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(missingSkus, "missingSkus");
        return new SkuOrderMissingRequestBody(skuOrderId, missingSkus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuOrderMissingRequestBody) {
            SkuOrderMissingRequestBody skuOrderMissingRequestBody = (SkuOrderMissingRequestBody) obj;
            return Intrinsics.areEqual(this.skuOrderId, skuOrderMissingRequestBody.skuOrderId) && Intrinsics.areEqual(this.missingSkus, skuOrderMissingRequestBody.missingSkus);
        }
        return false;
    }

    public final List<SkuOrderMissing> getMissingSkus() {
        return this.missingSkus;
    }

    public final String getSkuOrderId() {
        return this.skuOrderId;
    }

    public int hashCode() {
        return (this.skuOrderId.hashCode() * 31) + this.missingSkus.hashCode();
    }

    public String toString() {
        String str = this.skuOrderId;
        List<SkuOrderMissing> list = this.missingSkus;
        return "SkuOrderMissingRequestBody(skuOrderId=" + str + ", missingSkus=" + list + ")";
    }
}
