package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;", "", "id", "", "leaseId", "validationType", "validatorId", "createdAt", "Lorg/joda/time/DateTime;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLeaseId", "getResult", "()Z", "getValidationType", "getValidatorId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseValidationObjectResponse {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66733id;
    @JsonProperty("lease_id")
    @InterfaceC41208ft5("lease_id")
    private final String leaseId;
    @JsonProperty(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    @InterfaceC41208ft5(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT)
    private final boolean result;
    @JsonProperty("validation_type")
    @InterfaceC41208ft5("validation_type")
    private final String validationType;
    @JsonProperty("validator_id")
    @InterfaceC41208ft5("validator_id")
    private final String validatorId;

    public WireLeaseValidationObjectResponse(String id, String leaseId, String str, String str2, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        this.f66733id = id;
        this.leaseId = leaseId;
        this.validationType = str;
        this.validatorId = str2;
        this.createdAt = dateTime;
        this.result = z;
    }

    public static /* synthetic */ WireLeaseValidationObjectResponse copy$default(WireLeaseValidationObjectResponse wireLeaseValidationObjectResponse, String str, String str2, String str3, String str4, DateTime dateTime, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseValidationObjectResponse.f66733id;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseValidationObjectResponse.leaseId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireLeaseValidationObjectResponse.validationType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = wireLeaseValidationObjectResponse.validatorId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            dateTime = wireLeaseValidationObjectResponse.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 32) != 0) {
            z = wireLeaseValidationObjectResponse.result;
        }
        return wireLeaseValidationObjectResponse.copy(str, str5, str6, str7, dateTime2, z);
    }

    public final String component1() {
        return this.f66733id;
    }

    public final String component2() {
        return this.leaseId;
    }

    public final String component3() {
        return this.validationType;
    }

    public final String component4() {
        return this.validatorId;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final boolean component6() {
        return this.result;
    }

    public final WireLeaseValidationObjectResponse copy(String id, String leaseId, String str, String str2, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leaseId, "leaseId");
        return new WireLeaseValidationObjectResponse(id, leaseId, str, str2, dateTime, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseValidationObjectResponse) {
            WireLeaseValidationObjectResponse wireLeaseValidationObjectResponse = (WireLeaseValidationObjectResponse) obj;
            return Intrinsics.areEqual(this.f66733id, wireLeaseValidationObjectResponse.f66733id) && Intrinsics.areEqual(this.leaseId, wireLeaseValidationObjectResponse.leaseId) && Intrinsics.areEqual(this.validationType, wireLeaseValidationObjectResponse.validationType) && Intrinsics.areEqual(this.validatorId, wireLeaseValidationObjectResponse.validatorId) && Intrinsics.areEqual(this.createdAt, wireLeaseValidationObjectResponse.createdAt) && this.result == wireLeaseValidationObjectResponse.result;
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66733id;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final String getValidationType() {
        return this.validationType;
    }

    public final String getValidatorId() {
        return this.validatorId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66733id.hashCode() * 31) + this.leaseId.hashCode()) * 31;
        String str = this.validationType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validatorId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode4 = (hashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        boolean z = this.result;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f66733id;
        String str2 = this.leaseId;
        String str3 = this.validationType;
        String str4 = this.validatorId;
        DateTime dateTime = this.createdAt;
        boolean z = this.result;
        return "WireLeaseValidationObjectResponse(id=" + str + ", leaseId=" + str2 + ", validationType=" + str3 + ", validatorId=" + str4 + ", createdAt=" + dateTime + ", result=" + z + ")";
    }

    public /* synthetic */ WireLeaseValidationObjectResponse(String str, String str2, String str3, String str4, DateTime dateTime, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : dateTime, (i & 32) != 0 ? false : z);
    }
}
