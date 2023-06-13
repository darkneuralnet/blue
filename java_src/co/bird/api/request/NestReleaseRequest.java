package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006#"}, m28432d2 = {"Lco/bird/api/request/NestReleaseRequest;", "", "sessionId", "", "nestId", "warehouseId", "lock", "", "birdIds", "", "assetId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getBirdIds", "()Ljava/util/List;", "getLock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNestId", "getSessionId", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lco/bird/api/request/NestReleaseRequest;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestReleaseRequest {
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("bird_ids")
    @InterfaceC41208ft5("bird_ids")
    private final List<String> birdIds;
    @JsonProperty("lock")
    @InterfaceC41208ft5("lock")
    private final Boolean lock;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty(AnalyticsFields.SESSION_ID)
    @InterfaceC41208ft5(AnalyticsFields.SESSION_ID)
    private final String sessionId;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    public NestReleaseRequest(String sessionId, String str, String str2, Boolean bool, List<String> birdIds, String str3) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.sessionId = sessionId;
        this.nestId = str;
        this.warehouseId = str2;
        this.lock = bool;
        this.birdIds = birdIds;
        this.assetId = str3;
    }

    public static /* synthetic */ NestReleaseRequest copy$default(NestReleaseRequest nestReleaseRequest, String str, String str2, String str3, Boolean bool, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nestReleaseRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = nestReleaseRequest.nestId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nestReleaseRequest.warehouseId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bool = nestReleaseRequest.lock;
        }
        Boolean bool2 = bool;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = nestReleaseRequest.birdIds;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str4 = nestReleaseRequest.assetId;
        }
        return nestReleaseRequest.copy(str, str5, str6, bool2, list3, str4);
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

    public final Boolean component4() {
        return this.lock;
    }

    public final List<String> component5() {
        return this.birdIds;
    }

    public final String component6() {
        return this.assetId;
    }

    public final NestReleaseRequest copy(String sessionId, String str, String str2, Boolean bool, List<String> birdIds, String str3) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return new NestReleaseRequest(sessionId, str, str2, bool, birdIds, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestReleaseRequest) {
            NestReleaseRequest nestReleaseRequest = (NestReleaseRequest) obj;
            return Intrinsics.areEqual(this.sessionId, nestReleaseRequest.sessionId) && Intrinsics.areEqual(this.nestId, nestReleaseRequest.nestId) && Intrinsics.areEqual(this.warehouseId, nestReleaseRequest.warehouseId) && Intrinsics.areEqual(this.lock, nestReleaseRequest.lock) && Intrinsics.areEqual(this.birdIds, nestReleaseRequest.birdIds) && Intrinsics.areEqual(this.assetId, nestReleaseRequest.assetId);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final List<String> getBirdIds() {
        return this.birdIds;
    }

    public final Boolean getLock() {
        return this.lock;
    }

    public final String getNestId() {
        return this.nestId;
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
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.lock;
        int hashCode4 = (((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.birdIds.hashCode()) * 31;
        String str3 = this.assetId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.nestId;
        String str3 = this.warehouseId;
        Boolean bool = this.lock;
        List<String> list = this.birdIds;
        String str4 = this.assetId;
        return "NestReleaseRequest(sessionId=" + str + ", nestId=" + str2 + ", warehouseId=" + str3 + ", lock=" + bool + ", birdIds=" + list + ", assetId=" + str4 + ")";
    }
}
