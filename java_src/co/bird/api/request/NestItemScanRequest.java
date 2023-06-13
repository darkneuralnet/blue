package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/NestItemScanRequest;", "", "sessionId", "", "nestId", "warehouseId", "scanIdentifier", "previousBirdIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getNestId", "()Ljava/lang/String;", "getPreviousBirdIds", "()Ljava/util/List;", "getScanIdentifier", "getSessionId", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestItemScanRequest {
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("previous_bird_ids")
    @InterfaceC41208ft5("previous_bird_ids")
    private final List<String> previousBirdIds;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;
    @JsonProperty(AnalyticsFields.SESSION_ID)
    @InterfaceC41208ft5(AnalyticsFields.SESSION_ID)
    private final String sessionId;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public NestItemScanRequest(String sessionId, String str, String str2, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        this.sessionId = sessionId;
        this.nestId = str;
        this.warehouseId = str2;
        this.scanIdentifier = scanIdentifier;
        this.previousBirdIds = previousBirdIds;
    }

    public static /* synthetic */ NestItemScanRequest copy$default(NestItemScanRequest nestItemScanRequest, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nestItemScanRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = nestItemScanRequest.nestId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nestItemScanRequest.warehouseId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = nestItemScanRequest.scanIdentifier;
        }
        String str7 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = nestItemScanRequest.previousBirdIds;
        }
        return nestItemScanRequest.copy(str, str5, str6, str7, list2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.nestId;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final String component4() {
        return this.scanIdentifier;
    }

    public final List<String> component5() {
        return this.previousBirdIds;
    }

    public final NestItemScanRequest copy(String sessionId, String str, String str2, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        return new NestItemScanRequest(sessionId, str, str2, scanIdentifier, previousBirdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestItemScanRequest) {
            NestItemScanRequest nestItemScanRequest = (NestItemScanRequest) obj;
            return Intrinsics.areEqual(this.sessionId, nestItemScanRequest.sessionId) && Intrinsics.areEqual(this.nestId, nestItemScanRequest.nestId) && Intrinsics.areEqual(this.warehouseId, nestItemScanRequest.warehouseId) && Intrinsics.areEqual(this.scanIdentifier, nestItemScanRequest.scanIdentifier) && Intrinsics.areEqual(this.previousBirdIds, nestItemScanRequest.previousBirdIds);
        }
        return false;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final List<String> getPreviousBirdIds() {
        return this.previousBirdIds;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        String str = this.nestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.warehouseId;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.scanIdentifier.hashCode()) * 31) + this.previousBirdIds.hashCode();
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.nestId;
        String str3 = this.warehouseId;
        String str4 = this.scanIdentifier;
        List<String> list = this.previousBirdIds;
        return "NestItemScanRequest(sessionId=" + str + ", nestId=" + str2 + ", warehouseId=" + str3 + ", scanIdentifier=" + str4 + ", previousBirdIds=" + list + ")";
    }
}
