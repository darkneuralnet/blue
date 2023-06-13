package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/TestRideRequestBody;", "", "birdId", "", "skuOrderId", "(Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getSkuOrderId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TestRideRequestBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("sku_order_id")
    @InterfaceC41208ft5("sku_order_id")
    private final String skuOrderId;

    public TestRideRequestBody(String birdId, String skuOrderId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        this.birdId = birdId;
        this.skuOrderId = skuOrderId;
    }

    public static /* synthetic */ TestRideRequestBody copy$default(TestRideRequestBody testRideRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testRideRequestBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = testRideRequestBody.skuOrderId;
        }
        return testRideRequestBody.copy(str, str2);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.skuOrderId;
    }

    public final TestRideRequestBody copy(String birdId, String skuOrderId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return new TestRideRequestBody(birdId, skuOrderId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestRideRequestBody) {
            TestRideRequestBody testRideRequestBody = (TestRideRequestBody) obj;
            return Intrinsics.areEqual(this.birdId, testRideRequestBody.birdId) && Intrinsics.areEqual(this.skuOrderId, testRideRequestBody.skuOrderId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getSkuOrderId() {
        return this.skuOrderId;
    }

    public int hashCode() {
        return (this.birdId.hashCode() * 31) + this.skuOrderId.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.skuOrderId;
        return "TestRideRequestBody(birdId=" + str + ", skuOrderId=" + str2 + ")";
    }
}