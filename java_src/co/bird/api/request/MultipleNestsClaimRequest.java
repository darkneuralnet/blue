package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u00102\u001a\u00020\u0006HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003Jª\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020$2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0006HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b#\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016¨\u0006="}, m28432d2 = {"Lco/bird/api/request/MultipleNestsClaimRequest;", "", "id", "", "nestId", "initialTaskCount", "", "confirmedSlotsCount", "releasedCount", "nestIds", "", "confirmedNestIds", "confirmedAt", "Lorg/joda/time/DateTime;", "expireAt", "closedAt", "createdAt", "updatedAt", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lco/bird/api/request/MultipleNestsClaimResult;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILjava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/api/request/MultipleNestsClaimResult;)V", "getClosedAt", "()Lorg/joda/time/DateTime;", "getConfirmedAt", "getConfirmedNestIds", "()Ljava/util/List;", "getConfirmedSlotsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "getExpireAt", "getId", "()Ljava/lang/String;", "getInitialTaskCount", "()I", "isConfirmed", "", "()Z", "getNestId", "getNestIds", "getReleasedCount", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILjava/util/List;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/api/request/MultipleNestsClaimResult;)Lco/bird/api/request/MultipleNestsClaimRequest;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MultipleNestsClaimRequest {
    @JsonProperty("closed_at")
    @InterfaceC41208ft5("closed_at")
    private final DateTime closedAt;
    @JsonProperty("confirmed_at")
    @InterfaceC41208ft5("confirmed_at")
    private final DateTime confirmedAt;
    @JsonProperty("confirmed_nest_ids")
    @InterfaceC41208ft5("confirmed_nest_ids")
    private final List<String> confirmedNestIds;
    @JsonProperty("confirmed_slots_count")
    @InterfaceC41208ft5("confirmed_slots_count")
    private final Integer confirmedSlotsCount;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("expire_at")
    @InterfaceC41208ft5("expire_at")
    private final DateTime expireAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68204id;
    @JsonProperty("initial_task_count")
    @InterfaceC41208ft5("initial_task_count")
    private final int initialTaskCount;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("nest_ids")
    @InterfaceC41208ft5("nest_ids")
    private final List<String> nestIds;
    @JsonProperty("released_count")
    @InterfaceC41208ft5("released_count")
    private final int releasedCount;
    @JsonProperty(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    @InterfaceC41208ft5(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    private final MultipleNestsClaimResult result;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public MultipleNestsClaimRequest(String id, String nestId, int i, Integer num, int i2, List<String> nestIds, List<String> confirmedNestIds, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, MultipleNestsClaimResult multipleNestsClaimResult) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(nestIds, "nestIds");
        Intrinsics.checkNotNullParameter(confirmedNestIds, "confirmedNestIds");
        this.f68204id = id;
        this.nestId = nestId;
        this.initialTaskCount = i;
        this.confirmedSlotsCount = num;
        this.releasedCount = i2;
        this.nestIds = nestIds;
        this.confirmedNestIds = confirmedNestIds;
        this.confirmedAt = dateTime;
        this.expireAt = dateTime2;
        this.closedAt = dateTime3;
        this.createdAt = dateTime4;
        this.updatedAt = dateTime5;
        this.result = multipleNestsClaimResult;
    }

    private final MultipleNestsClaimResult component13() {
        return this.result;
    }

    public final String component1() {
        return this.f68204id;
    }

    public final DateTime component10() {
        return this.closedAt;
    }

    public final DateTime component11() {
        return this.createdAt;
    }

    public final DateTime component12() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.nestId;
    }

    public final int component3() {
        return this.initialTaskCount;
    }

    public final Integer component4() {
        return this.confirmedSlotsCount;
    }

    public final int component5() {
        return this.releasedCount;
    }

    public final List<String> component6() {
        return this.nestIds;
    }

    public final List<String> component7() {
        return this.confirmedNestIds;
    }

    public final DateTime component8() {
        return this.confirmedAt;
    }

    public final DateTime component9() {
        return this.expireAt;
    }

    public final MultipleNestsClaimRequest copy(String id, String nestId, int i, Integer num, int i2, List<String> nestIds, List<String> confirmedNestIds, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, MultipleNestsClaimResult multipleNestsClaimResult) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(nestIds, "nestIds");
        Intrinsics.checkNotNullParameter(confirmedNestIds, "confirmedNestIds");
        return new MultipleNestsClaimRequest(id, nestId, i, num, i2, nestIds, confirmedNestIds, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, multipleNestsClaimResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultipleNestsClaimRequest) {
            MultipleNestsClaimRequest multipleNestsClaimRequest = (MultipleNestsClaimRequest) obj;
            return Intrinsics.areEqual(this.f68204id, multipleNestsClaimRequest.f68204id) && Intrinsics.areEqual(this.nestId, multipleNestsClaimRequest.nestId) && this.initialTaskCount == multipleNestsClaimRequest.initialTaskCount && Intrinsics.areEqual(this.confirmedSlotsCount, multipleNestsClaimRequest.confirmedSlotsCount) && this.releasedCount == multipleNestsClaimRequest.releasedCount && Intrinsics.areEqual(this.nestIds, multipleNestsClaimRequest.nestIds) && Intrinsics.areEqual(this.confirmedNestIds, multipleNestsClaimRequest.confirmedNestIds) && Intrinsics.areEqual(this.confirmedAt, multipleNestsClaimRequest.confirmedAt) && Intrinsics.areEqual(this.expireAt, multipleNestsClaimRequest.expireAt) && Intrinsics.areEqual(this.closedAt, multipleNestsClaimRequest.closedAt) && Intrinsics.areEqual(this.createdAt, multipleNestsClaimRequest.createdAt) && Intrinsics.areEqual(this.updatedAt, multipleNestsClaimRequest.updatedAt) && this.result == multipleNestsClaimRequest.result;
        }
        return false;
    }

    public final DateTime getClosedAt() {
        return this.closedAt;
    }

    public final DateTime getConfirmedAt() {
        return this.confirmedAt;
    }

    public final List<String> getConfirmedNestIds() {
        return this.confirmedNestIds;
    }

    public final Integer getConfirmedSlotsCount() {
        return this.confirmedSlotsCount;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getExpireAt() {
        return this.expireAt;
    }

    public final String getId() {
        return this.f68204id;
    }

    public final int getInitialTaskCount() {
        return this.initialTaskCount;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final List<String> getNestIds() {
        return this.nestIds;
    }

    public final int getReleasedCount() {
        return this.releasedCount;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((((this.f68204id.hashCode() * 31) + this.nestId.hashCode()) * 31) + Integer.hashCode(this.initialTaskCount)) * 31;
        Integer num = this.confirmedSlotsCount;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.releasedCount)) * 31) + this.nestIds.hashCode()) * 31) + this.confirmedNestIds.hashCode()) * 31;
        DateTime dateTime = this.confirmedAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expireAt;
        int hashCode4 = (hashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.closedAt;
        int hashCode5 = (hashCode4 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        DateTime dateTime5 = this.updatedAt;
        int hashCode7 = (hashCode6 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        MultipleNestsClaimResult multipleNestsClaimResult = this.result;
        return hashCode7 + (multipleNestsClaimResult != null ? multipleNestsClaimResult.hashCode() : 0);
    }

    public final boolean isConfirmed() {
        return this.confirmedAt != null;
    }

    public String toString() {
        String str = this.f68204id;
        String str2 = this.nestId;
        int i = this.initialTaskCount;
        Integer num = this.confirmedSlotsCount;
        int i2 = this.releasedCount;
        List<String> list = this.nestIds;
        List<String> list2 = this.confirmedNestIds;
        DateTime dateTime = this.confirmedAt;
        DateTime dateTime2 = this.expireAt;
        DateTime dateTime3 = this.closedAt;
        DateTime dateTime4 = this.createdAt;
        DateTime dateTime5 = this.updatedAt;
        MultipleNestsClaimResult multipleNestsClaimResult = this.result;
        return "MultipleNestsClaimRequest(id=" + str + ", nestId=" + str2 + ", initialTaskCount=" + i + ", confirmedSlotsCount=" + num + ", releasedCount=" + i2 + ", nestIds=" + list + ", confirmedNestIds=" + list2 + ", confirmedAt=" + dateTime + ", expireAt=" + dateTime2 + ", closedAt=" + dateTime3 + ", createdAt=" + dateTime4 + ", updatedAt=" + dateTime5 + ", result=" + multipleNestsClaimResult + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultipleNestsClaimRequest(String str, String str2, int i, Integer num, int i2, List list, List list2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, MultipleNestsClaimResult multipleNestsClaimResult, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r6, r7, r8, r9, r10, (i3 & 128) != 0 ? null : dateTime, (i3 & 256) != 0 ? null : dateTime2, (i3 & 512) != 0 ? null : dateTime3, (i3 & 1024) != 0 ? null : dateTime4, (i3 & 2048) != 0 ? null : dateTime5, (i3 & 4096) != 0 ? null : multipleNestsClaimResult);
        List list3;
        List list4;
        List emptyList;
        List emptyList2;
        int i4 = (i3 & 4) != 0 ? 0 : i;
        Integer num2 = (i3 & 8) != 0 ? null : num;
        int i5 = (i3 & 16) != 0 ? 0 : i2;
        if ((i3 & 32) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        if ((i3 & 64) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
    }
}
