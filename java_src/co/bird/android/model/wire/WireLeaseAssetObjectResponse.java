package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/wire/WireLeaseAssetObjectResponse;", "", "id", "", "leaseId", "assetId", "createdAt", "Lorg/joda/time/DateTime;", "purpose", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getLeaseId", "getPurpose", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseAssetObjectResponse {
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66731id;
    @JsonProperty("lease_id")
    @InterfaceC41208ft5("lease_id")
    private final String leaseId;
    @JsonProperty("purpose")
    @InterfaceC41208ft5("purpose")
    private final String purpose;

    public WireLeaseAssetObjectResponse(String id, String str, String str2, DateTime dateTime, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66731id = id;
        this.leaseId = str;
        this.assetId = str2;
        this.createdAt = dateTime;
        this.purpose = str3;
    }

    public static /* synthetic */ WireLeaseAssetObjectResponse copy$default(WireLeaseAssetObjectResponse wireLeaseAssetObjectResponse, String str, String str2, String str3, DateTime dateTime, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseAssetObjectResponse.f66731id;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseAssetObjectResponse.leaseId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = wireLeaseAssetObjectResponse.assetId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            dateTime = wireLeaseAssetObjectResponse.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            str4 = wireLeaseAssetObjectResponse.purpose;
        }
        return wireLeaseAssetObjectResponse.copy(str, str5, str6, dateTime2, str4);
    }

    public final String component1() {
        return this.f66731id;
    }

    public final String component2() {
        return this.leaseId;
    }

    public final String component3() {
        return this.assetId;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.purpose;
    }

    public final WireLeaseAssetObjectResponse copy(String id, String str, String str2, DateTime dateTime, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireLeaseAssetObjectResponse(id, str, str2, dateTime, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseAssetObjectResponse) {
            WireLeaseAssetObjectResponse wireLeaseAssetObjectResponse = (WireLeaseAssetObjectResponse) obj;
            return Intrinsics.areEqual(this.f66731id, wireLeaseAssetObjectResponse.f66731id) && Intrinsics.areEqual(this.leaseId, wireLeaseAssetObjectResponse.leaseId) && Intrinsics.areEqual(this.assetId, wireLeaseAssetObjectResponse.assetId) && Intrinsics.areEqual(this.createdAt, wireLeaseAssetObjectResponse.createdAt) && Intrinsics.areEqual(this.purpose, wireLeaseAssetObjectResponse.purpose);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66731id;
    }

    public final String getLeaseId() {
        return this.leaseId;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        int hashCode = this.f66731id.hashCode() * 31;
        String str = this.leaseId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assetId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str3 = this.purpose;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66731id;
        String str2 = this.leaseId;
        String str3 = this.assetId;
        DateTime dateTime = this.createdAt;
        String str4 = this.purpose;
        return "WireLeaseAssetObjectResponse(id=" + str + ", leaseId=" + str2 + ", assetId=" + str3 + ", createdAt=" + dateTime + ", purpose=" + str4 + ")";
    }

    public /* synthetic */ WireLeaseAssetObjectResponse(String str, String str2, String str3, DateTime dateTime, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? null : str4);
    }
}
