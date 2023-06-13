package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/LocationSkuCountAdjustBody;", "", "adjustmentAmount", "", "userId", "", "(ILjava/lang/String;)V", "getAdjustmentAmount", "()I", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocationSkuCountAdjustBody {
    @JsonProperty("adjustment_amount")
    @InterfaceC41208ft5("adjustment_amount")
    private final int adjustmentAmount;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public LocationSkuCountAdjustBody(int i, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.adjustmentAmount = i;
        this.userId = userId;
    }

    public static /* synthetic */ LocationSkuCountAdjustBody copy$default(LocationSkuCountAdjustBody locationSkuCountAdjustBody, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = locationSkuCountAdjustBody.adjustmentAmount;
        }
        if ((i2 & 2) != 0) {
            str = locationSkuCountAdjustBody.userId;
        }
        return locationSkuCountAdjustBody.copy(i, str);
    }

    public final int component1() {
        return this.adjustmentAmount;
    }

    public final String component2() {
        return this.userId;
    }

    public final LocationSkuCountAdjustBody copy(int i, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new LocationSkuCountAdjustBody(i, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationSkuCountAdjustBody) {
            LocationSkuCountAdjustBody locationSkuCountAdjustBody = (LocationSkuCountAdjustBody) obj;
            return this.adjustmentAmount == locationSkuCountAdjustBody.adjustmentAmount && Intrinsics.areEqual(this.userId, locationSkuCountAdjustBody.userId);
        }
        return false;
    }

    public final int getAdjustmentAmount() {
        return this.adjustmentAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.adjustmentAmount) * 31) + this.userId.hashCode();
    }

    public String toString() {
        int i = this.adjustmentAmount;
        String str = this.userId;
        return "LocationSkuCountAdjustBody(adjustmentAmount=" + i + ", userId=" + str + ")";
    }
}
