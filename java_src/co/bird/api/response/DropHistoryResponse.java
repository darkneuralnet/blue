package co.bird.api.response;

import co.bird.android.model.DropScoreReport;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireDrop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J=\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/response/DropHistoryResponse;", "", "drops", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireDrop;", "scoreReports", "", "Lco/bird/android/model/DropScoreReport;", "dropsPendingReview", "", "(Lco/bird/api/response/CollectionResponse;Ljava/util/List;Ljava/util/List;)V", "getDrops", "()Lco/bird/api/response/CollectionResponse;", "getDropsPendingReview", "()Ljava/util/List;", "getScoreReports", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropHistoryResponse {
    @JsonProperty("drops")
    @InterfaceC41208ft5("drops")
    private final CollectionResponse<WireDrop> drops;
    @JsonProperty("drops_pending_review")
    @InterfaceC41208ft5("drops_pending_review")
    private final List<String> dropsPendingReview;
    @JsonProperty("score_reports")
    @InterfaceC41208ft5("score_reports")
    private final List<DropScoreReport> scoreReports;

    public DropHistoryResponse(CollectionResponse<WireDrop> drops, List<DropScoreReport> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(drops, "drops");
        this.drops = drops;
        this.scoreReports = list;
        this.dropsPendingReview = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropHistoryResponse copy$default(DropHistoryResponse dropHistoryResponse, CollectionResponse collectionResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            collectionResponse = dropHistoryResponse.drops;
        }
        if ((i & 2) != 0) {
            list = dropHistoryResponse.scoreReports;
        }
        if ((i & 4) != 0) {
            list2 = dropHistoryResponse.dropsPendingReview;
        }
        return dropHistoryResponse.copy(collectionResponse, list, list2);
    }

    public final CollectionResponse<WireDrop> component1() {
        return this.drops;
    }

    public final List<DropScoreReport> component2() {
        return this.scoreReports;
    }

    public final List<String> component3() {
        return this.dropsPendingReview;
    }

    public final DropHistoryResponse copy(CollectionResponse<WireDrop> drops, List<DropScoreReport> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(drops, "drops");
        return new DropHistoryResponse(drops, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropHistoryResponse) {
            DropHistoryResponse dropHistoryResponse = (DropHistoryResponse) obj;
            return Intrinsics.areEqual(this.drops, dropHistoryResponse.drops) && Intrinsics.areEqual(this.scoreReports, dropHistoryResponse.scoreReports) && Intrinsics.areEqual(this.dropsPendingReview, dropHistoryResponse.dropsPendingReview);
        }
        return false;
    }

    public final CollectionResponse<WireDrop> getDrops() {
        return this.drops;
    }

    public final List<String> getDropsPendingReview() {
        return this.dropsPendingReview;
    }

    public final List<DropScoreReport> getScoreReports() {
        return this.scoreReports;
    }

    public int hashCode() {
        int hashCode = this.drops.hashCode() * 31;
        List<DropScoreReport> list = this.scoreReports;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.dropsPendingReview;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        CollectionResponse<WireDrop> collectionResponse = this.drops;
        List<DropScoreReport> list = this.scoreReports;
        List<String> list2 = this.dropsPendingReview;
        return "DropHistoryResponse(drops=" + collectionResponse + ", scoreReports=" + list + ", dropsPendingReview=" + list2 + ")";
    }

    public /* synthetic */ DropHistoryResponse(CollectionResponse collectionResponse, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collectionResponse, (i & 2) != 0 ? null : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
