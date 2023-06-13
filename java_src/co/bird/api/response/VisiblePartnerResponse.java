package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/response/VisiblePartnerResponse;", "", "showBird", "", "partnerIds", "", "", "(ZLjava/util/List;)V", "getPartnerIds", "()Ljava/util/List;", "getShowBird", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VisiblePartnerResponse {
    @JsonProperty("partner_ids")
    @InterfaceC41208ft5("partner_ids")
    private final List<String> partnerIds;
    @JsonProperty("bird_rides")
    @InterfaceC41208ft5("bird_rides")
    private final boolean showBird;

    public VisiblePartnerResponse() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisiblePartnerResponse copy$default(VisiblePartnerResponse visiblePartnerResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = visiblePartnerResponse.showBird;
        }
        if ((i & 2) != 0) {
            list = visiblePartnerResponse.partnerIds;
        }
        return visiblePartnerResponse.copy(z, list);
    }

    public final boolean component1() {
        return this.showBird;
    }

    public final List<String> component2() {
        return this.partnerIds;
    }

    public final VisiblePartnerResponse copy(boolean z, List<String> partnerIds) {
        Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
        return new VisiblePartnerResponse(z, partnerIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisiblePartnerResponse) {
            VisiblePartnerResponse visiblePartnerResponse = (VisiblePartnerResponse) obj;
            return this.showBird == visiblePartnerResponse.showBird && Intrinsics.areEqual(this.partnerIds, visiblePartnerResponse.partnerIds);
        }
        return false;
    }

    public final List<String> getPartnerIds() {
        return this.partnerIds;
    }

    public final boolean getShowBird() {
        return this.showBird;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.showBird;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.partnerIds.hashCode();
    }

    public String toString() {
        boolean z = this.showBird;
        List<String> list = this.partnerIds;
        return "VisiblePartnerResponse(showBird=" + z + ", partnerIds=" + list + ")";
    }

    public VisiblePartnerResponse(boolean z, List<String> partnerIds) {
        Intrinsics.checkNotNullParameter(partnerIds, "partnerIds");
        this.showBird = z;
        this.partnerIds = partnerIds;
    }

    public /* synthetic */ VisiblePartnerResponse(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
