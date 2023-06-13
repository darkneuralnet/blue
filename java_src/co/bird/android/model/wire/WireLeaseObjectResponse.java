package co.bird.android.model.wire;

import co.bird.android.model.AssetTaskKt;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003JÏ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000fHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001c¨\u0006H"}, m28432d2 = {"Lco/bird/android/model/wire/WireLeaseObjectResponse;", "", "id", "", "principalId", "leaseType", "leasedItemId", "associatedItemId", "startedAt", "Lorg/joda/time/DateTime;", "dueAt", "returnedAt", "finalizedAt", "currency", "initialChargeAmount", "", "returnRefundAmount", "delinquentFeeAmount", "delinquencySettledAt", "validations", "", "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;", AssetTaskKt.ASSET_PATH, "Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;", "metadata", "Lco/bird/android/model/wire/WireLeaseMetadata;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;IIILorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireLeaseMetadata;)V", "getAssets", "()Ljava/util/List;", "getAssociatedItemId", "()Ljava/lang/String;", "getCurrency", "getDelinquencySettledAt", "()Lorg/joda/time/DateTime;", "getDelinquentFeeAmount", "()I", "getDueAt", "getFinalizedAt", "getId", "getInitialChargeAmount", "getLeaseType", "getLeasedItemId", "getMetadata", "()Lco/bird/android/model/wire/WireLeaseMetadata;", "getPrincipalId", "getReturnRefundAmount", "getReturnedAt", "getStartedAt", "getValidations", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseObjectResponse {
    @JsonProperty(AssetTaskKt.ASSET_PATH)
    @InterfaceC41208ft5(AssetTaskKt.ASSET_PATH)
    private final List<WireLeaseAssetObjectResponse> assets;
    @JsonProperty("associated_item_id")
    @InterfaceC41208ft5("associated_item_id")
    private final String associatedItemId;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("delinquency_settled_at")
    @InterfaceC41208ft5("delinquency_settled_at")
    private final DateTime delinquencySettledAt;
    @JsonProperty("delinquent_fee_amount")
    @InterfaceC41208ft5("delinquent_fee_amount")
    private final int delinquentFeeAmount;
    @JsonProperty("due_at")
    @InterfaceC41208ft5("due_at")
    private final DateTime dueAt;
    @JsonProperty("finalized_at")
    @InterfaceC41208ft5("finalized_at")
    private final DateTime finalizedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66732id;
    @JsonProperty("initial_charge_amount")
    @InterfaceC41208ft5("initial_charge_amount")
    private final int initialChargeAmount;
    @JsonProperty("lease_type")
    @InterfaceC41208ft5("lease_type")
    private final String leaseType;
    @JsonProperty("leased_item_id")
    @InterfaceC41208ft5("leased_item_id")
    private final String leasedItemId;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final WireLeaseMetadata metadata;
    @JsonProperty("principal_id")
    @InterfaceC41208ft5("principal_id")
    private final String principalId;
    @JsonProperty("return_refund_amount")
    @InterfaceC41208ft5("return_refund_amount")
    private final int returnRefundAmount;
    @JsonProperty("returned_at")
    @InterfaceC41208ft5("returned_at")
    private final DateTime returnedAt;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("validations")
    @InterfaceC41208ft5("validations")
    private final List<WireLeaseValidationObjectResponse> validations;

    public WireLeaseObjectResponse(String id, String principalId, String leaseType, String str, String str2, DateTime startedAt, DateTime dueAt, DateTime dateTime, DateTime dateTime2, String currency, int i, int i2, int i3, DateTime dateTime3, List<WireLeaseValidationObjectResponse> list, List<WireLeaseAssetObjectResponse> list2, WireLeaseMetadata wireLeaseMetadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(principalId, "principalId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66732id = id;
        this.principalId = principalId;
        this.leaseType = leaseType;
        this.leasedItemId = str;
        this.associatedItemId = str2;
        this.startedAt = startedAt;
        this.dueAt = dueAt;
        this.returnedAt = dateTime;
        this.finalizedAt = dateTime2;
        this.currency = currency;
        this.initialChargeAmount = i;
        this.returnRefundAmount = i2;
        this.delinquentFeeAmount = i3;
        this.delinquencySettledAt = dateTime3;
        this.validations = list;
        this.assets = list2;
        this.metadata = wireLeaseMetadata;
    }

    public final String component1() {
        return this.f66732id;
    }

    public final String component10() {
        return this.currency;
    }

    public final int component11() {
        return this.initialChargeAmount;
    }

    public final int component12() {
        return this.returnRefundAmount;
    }

    public final int component13() {
        return this.delinquentFeeAmount;
    }

    public final DateTime component14() {
        return this.delinquencySettledAt;
    }

    public final List<WireLeaseValidationObjectResponse> component15() {
        return this.validations;
    }

    public final List<WireLeaseAssetObjectResponse> component16() {
        return this.assets;
    }

    public final WireLeaseMetadata component17() {
        return this.metadata;
    }

    public final String component2() {
        return this.principalId;
    }

    public final String component3() {
        return this.leaseType;
    }

    public final String component4() {
        return this.leasedItemId;
    }

    public final String component5() {
        return this.associatedItemId;
    }

    public final DateTime component6() {
        return this.startedAt;
    }

    public final DateTime component7() {
        return this.dueAt;
    }

    public final DateTime component8() {
        return this.returnedAt;
    }

    public final DateTime component9() {
        return this.finalizedAt;
    }

    public final WireLeaseObjectResponse copy(String id, String principalId, String leaseType, String str, String str2, DateTime startedAt, DateTime dueAt, DateTime dateTime, DateTime dateTime2, String currency, int i, int i2, int i3, DateTime dateTime3, List<WireLeaseValidationObjectResponse> list, List<WireLeaseAssetObjectResponse> list2, WireLeaseMetadata wireLeaseMetadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(principalId, "principalId");
        Intrinsics.checkNotNullParameter(leaseType, "leaseType");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(dueAt, "dueAt");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WireLeaseObjectResponse(id, principalId, leaseType, str, str2, startedAt, dueAt, dateTime, dateTime2, currency, i, i2, i3, dateTime3, list, list2, wireLeaseMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseObjectResponse) {
            WireLeaseObjectResponse wireLeaseObjectResponse = (WireLeaseObjectResponse) obj;
            return Intrinsics.areEqual(this.f66732id, wireLeaseObjectResponse.f66732id) && Intrinsics.areEqual(this.principalId, wireLeaseObjectResponse.principalId) && Intrinsics.areEqual(this.leaseType, wireLeaseObjectResponse.leaseType) && Intrinsics.areEqual(this.leasedItemId, wireLeaseObjectResponse.leasedItemId) && Intrinsics.areEqual(this.associatedItemId, wireLeaseObjectResponse.associatedItemId) && Intrinsics.areEqual(this.startedAt, wireLeaseObjectResponse.startedAt) && Intrinsics.areEqual(this.dueAt, wireLeaseObjectResponse.dueAt) && Intrinsics.areEqual(this.returnedAt, wireLeaseObjectResponse.returnedAt) && Intrinsics.areEqual(this.finalizedAt, wireLeaseObjectResponse.finalizedAt) && Intrinsics.areEqual(this.currency, wireLeaseObjectResponse.currency) && this.initialChargeAmount == wireLeaseObjectResponse.initialChargeAmount && this.returnRefundAmount == wireLeaseObjectResponse.returnRefundAmount && this.delinquentFeeAmount == wireLeaseObjectResponse.delinquentFeeAmount && Intrinsics.areEqual(this.delinquencySettledAt, wireLeaseObjectResponse.delinquencySettledAt) && Intrinsics.areEqual(this.validations, wireLeaseObjectResponse.validations) && Intrinsics.areEqual(this.assets, wireLeaseObjectResponse.assets) && Intrinsics.areEqual(this.metadata, wireLeaseObjectResponse.metadata);
        }
        return false;
    }

    public final List<WireLeaseAssetObjectResponse> getAssets() {
        return this.assets;
    }

    public final String getAssociatedItemId() {
        return this.associatedItemId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DateTime getDelinquencySettledAt() {
        return this.delinquencySettledAt;
    }

    public final int getDelinquentFeeAmount() {
        return this.delinquentFeeAmount;
    }

    public final DateTime getDueAt() {
        return this.dueAt;
    }

    public final DateTime getFinalizedAt() {
        return this.finalizedAt;
    }

    public final String getId() {
        return this.f66732id;
    }

    public final int getInitialChargeAmount() {
        return this.initialChargeAmount;
    }

    public final String getLeaseType() {
        return this.leaseType;
    }

    public final String getLeasedItemId() {
        return this.leasedItemId;
    }

    public final WireLeaseMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPrincipalId() {
        return this.principalId;
    }

    public final int getReturnRefundAmount() {
        return this.returnRefundAmount;
    }

    public final DateTime getReturnedAt() {
        return this.returnedAt;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final List<WireLeaseValidationObjectResponse> getValidations() {
        return this.validations;
    }

    public int hashCode() {
        int hashCode = ((((this.f66732id.hashCode() * 31) + this.principalId.hashCode()) * 31) + this.leaseType.hashCode()) * 31;
        String str = this.leasedItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.associatedItemId;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.startedAt.hashCode()) * 31) + this.dueAt.hashCode()) * 31;
        DateTime dateTime = this.returnedAt;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.finalizedAt;
        int hashCode5 = (((((((((hashCode4 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.initialChargeAmount)) * 31) + Integer.hashCode(this.returnRefundAmount)) * 31) + Integer.hashCode(this.delinquentFeeAmount)) * 31;
        DateTime dateTime3 = this.delinquencySettledAt;
        int hashCode6 = (hashCode5 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        List<WireLeaseValidationObjectResponse> list = this.validations;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<WireLeaseAssetObjectResponse> list2 = this.assets;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WireLeaseMetadata wireLeaseMetadata = this.metadata;
        return hashCode8 + (wireLeaseMetadata != null ? wireLeaseMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66732id;
        String str2 = this.principalId;
        String str3 = this.leaseType;
        String str4 = this.leasedItemId;
        String str5 = this.associatedItemId;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.dueAt;
        DateTime dateTime3 = this.returnedAt;
        DateTime dateTime4 = this.finalizedAt;
        String str6 = this.currency;
        int i = this.initialChargeAmount;
        int i2 = this.returnRefundAmount;
        int i3 = this.delinquentFeeAmount;
        DateTime dateTime5 = this.delinquencySettledAt;
        List<WireLeaseValidationObjectResponse> list = this.validations;
        List<WireLeaseAssetObjectResponse> list2 = this.assets;
        WireLeaseMetadata wireLeaseMetadata = this.metadata;
        return "WireLeaseObjectResponse(id=" + str + ", principalId=" + str2 + ", leaseType=" + str3 + ", leasedItemId=" + str4 + ", associatedItemId=" + str5 + ", startedAt=" + dateTime + ", dueAt=" + dateTime2 + ", returnedAt=" + dateTime3 + ", finalizedAt=" + dateTime4 + ", currency=" + str6 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ", delinquencySettledAt=" + dateTime5 + ", validations=" + list + ", assets=" + list2 + ", metadata=" + wireLeaseMetadata + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireLeaseObjectResponse(String str, String str2, String str3, String str4, String str5, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, String str6, int i, int i2, int i3, DateTime dateTime5, List list, List list2, WireLeaseMetadata wireLeaseMetadata, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r1, r2, r3, r5, r6, r8, r7, r9, r10, r11, r13, r12, r14, r37, r16, r0);
        DateTime dateTime6;
        DateTime dateTime7;
        List list3;
        WireLeaseMetadata wireLeaseMetadata2;
        String str7 = (i4 & 2) != 0 ? "" : str2;
        String str8 = (i4 & 4) == 0 ? str3 : "";
        String str9 = (i4 & 8) != 0 ? null : str4;
        String str10 = (i4 & 16) != 0 ? null : str5;
        if ((i4 & 32) != 0) {
            dateTime6 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime6, "now()");
        } else {
            dateTime6 = dateTime;
        }
        if ((i4 & 64) != 0) {
            dateTime7 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime7, "now()");
        } else {
            dateTime7 = dateTime2;
        }
        DateTime dateTime8 = (i4 & 128) != 0 ? null : dateTime3;
        DateTime dateTime9 = (i4 & 256) != 0 ? null : dateTime4;
        String str11 = (i4 & 512) != 0 ? Source.USD : str6;
        int i5 = (i4 & 1024) != 0 ? 0 : i;
        int i6 = (i4 & 2048) != 0 ? 0 : i2;
        int i7 = (i4 & 4096) == 0 ? i3 : 0;
        DateTime dateTime10 = (i4 & 8192) != 0 ? null : dateTime5;
        List emptyList = (i4 & 16384) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List emptyList2 = (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        if ((i4 & 65536) != 0) {
            list3 = emptyList;
            wireLeaseMetadata2 = new WireLeaseMetadata(null, null, 3, null);
        } else {
            list3 = emptyList;
            wireLeaseMetadata2 = wireLeaseMetadata;
        }
    }
}
