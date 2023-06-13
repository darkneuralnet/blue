package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/NestFavoriteRequest;", "", "nestId", "", "partnerIds", "", "(Ljava/lang/String;Ljava/util/List;)V", "getNestId", "()Ljava/lang/String;", "getPartnerIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestFavoriteRequest {
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("partner_ids")
    @InterfaceC41208ft5("partner_ids")
    private final List<String> partnerIds;

    public NestFavoriteRequest(String nestId, List<String> partnerIds) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
        this.nestId = nestId;
        this.partnerIds = partnerIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestFavoriteRequest copy$default(NestFavoriteRequest nestFavoriteRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nestFavoriteRequest.nestId;
        }
        if ((i & 2) != 0) {
            list = nestFavoriteRequest.partnerIds;
        }
        return nestFavoriteRequest.copy(str, list);
    }

    public final String component1() {
        return this.nestId;
    }

    public final List<String> component2() {
        return this.partnerIds;
    }

    public final NestFavoriteRequest copy(String nestId, List<String> partnerIds) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
        return new NestFavoriteRequest(nestId, partnerIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestFavoriteRequest) {
            NestFavoriteRequest nestFavoriteRequest = (NestFavoriteRequest) obj;
            return Intrinsics.areEqual(this.nestId, nestFavoriteRequest.nestId) && Intrinsics.areEqual(this.partnerIds, nestFavoriteRequest.partnerIds);
        }
        return false;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final List<String> getPartnerIds() {
        return this.partnerIds;
    }

    public int hashCode() {
        return (this.nestId.hashCode() * 31) + this.partnerIds.hashCode();
    }

    public String toString() {
        String str = this.nestId;
        List<String> list = this.partnerIds;
        return "NestFavoriteRequest(nestId=" + str + ", partnerIds=" + list + ")";
    }
}