package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003Jú\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0015HÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006O"}, m28432d2 = {"Lco/bird/android/model/wire/WireIdentification;", "", "id", "", "principalId", "userGuestId", "service", "serviceTransactionId", "documentType", "documentEntryMethod", "selfieEntryMethod", "location", "Lco/bird/android/model/wire/WireLocation;", "ingestionResult", "documentHash", "score", "", "stateCode", "countryCode", "regionCode", "minAge", "", "createdAt", "updatedAt", "completedAt", "expiresAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompletedAt", "()Ljava/lang/String;", "getCountryCode", "getCreatedAt", "getDocumentEntryMethod", "getDocumentHash", "getDocumentType", "getExpiresAt", "getId", "getIngestionResult", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMinAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrincipalId", "getRegionCode", "getScore", "()D", "getSelfieEntryMethod", "getService", "getServiceTransactionId", "getStateCode", "getUpdatedAt", "getUserGuestId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireIdentification;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentification {
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final String completedAt;
    @JsonProperty("country_code")
    @InterfaceC41208ft5("country_code")
    private final String countryCode;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final String createdAt;
    @JsonProperty("document_entry_method")
    @InterfaceC41208ft5("document_entry_method")
    private final String documentEntryMethod;
    @JsonProperty("document_hash")
    @InterfaceC41208ft5("document_hash")
    private final String documentHash;
    @JsonProperty("document_type")
    @InterfaceC41208ft5("document_type")
    private final String documentType;
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final String expiresAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66729id;
    @JsonProperty("ingestion_result")
    @InterfaceC41208ft5("ingestion_result")
    private final String ingestionResult;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("min_age")
    @InterfaceC41208ft5("min_age")
    private final Integer minAge;
    @JsonProperty("principal_id")
    @InterfaceC41208ft5("principal_id")
    private final String principalId;
    @JsonProperty("region_code")
    @InterfaceC41208ft5("region_code")
    private final String regionCode;
    @JsonProperty("score")
    @InterfaceC41208ft5("score")
    private final double score;
    @JsonProperty("selfie_entry_method")
    @InterfaceC41208ft5("selfie_entry_method")
    private final String selfieEntryMethod;
    @JsonProperty("service")
    @InterfaceC41208ft5("service")
    private final String service;
    @JsonProperty("service_transaction_id")
    @InterfaceC41208ft5("service_transaction_id")
    private final String serviceTransactionId;
    @JsonProperty("state_code")
    @InterfaceC41208ft5("state_code")
    private final String stateCode;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final String updatedAt;
    @JsonProperty("user_guest_id")
    @InterfaceC41208ft5("user_guest_id")
    private final String userGuestId;

    public WireIdentification() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final String component1() {
        return this.f66729id;
    }

    public final String component10() {
        return this.ingestionResult;
    }

    public final String component11() {
        return this.documentHash;
    }

    public final double component12() {
        return this.score;
    }

    public final String component13() {
        return this.stateCode;
    }

    public final String component14() {
        return this.countryCode;
    }

    public final String component15() {
        return this.regionCode;
    }

    public final Integer component16() {
        return this.minAge;
    }

    public final String component17() {
        return this.createdAt;
    }

    public final String component18() {
        return this.updatedAt;
    }

    public final String component19() {
        return this.completedAt;
    }

    public final String component2() {
        return this.principalId;
    }

    public final String component20() {
        return this.expiresAt;
    }

    public final String component3() {
        return this.userGuestId;
    }

    public final String component4() {
        return this.service;
    }

    public final String component5() {
        return this.serviceTransactionId;
    }

    public final String component6() {
        return this.documentType;
    }

    public final String component7() {
        return this.documentEntryMethod;
    }

    public final String component8() {
        return this.selfieEntryMethod;
    }

    public final WireLocation component9() {
        return this.location;
    }

    public final WireIdentification copy(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, WireLocation wireLocation, String str8, String str9, double d, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireIdentification(id, str, str2, str3, str4, str5, str6, str7, wireLocation, str8, str9, d, str10, str11, str12, num, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentification) {
            WireIdentification wireIdentification = (WireIdentification) obj;
            return Intrinsics.areEqual(this.f66729id, wireIdentification.f66729id) && Intrinsics.areEqual(this.principalId, wireIdentification.principalId) && Intrinsics.areEqual(this.userGuestId, wireIdentification.userGuestId) && Intrinsics.areEqual(this.service, wireIdentification.service) && Intrinsics.areEqual(this.serviceTransactionId, wireIdentification.serviceTransactionId) && Intrinsics.areEqual(this.documentType, wireIdentification.documentType) && Intrinsics.areEqual(this.documentEntryMethod, wireIdentification.documentEntryMethod) && Intrinsics.areEqual(this.selfieEntryMethod, wireIdentification.selfieEntryMethod) && Intrinsics.areEqual(this.location, wireIdentification.location) && Intrinsics.areEqual(this.ingestionResult, wireIdentification.ingestionResult) && Intrinsics.areEqual(this.documentHash, wireIdentification.documentHash) && Double.compare(this.score, wireIdentification.score) == 0 && Intrinsics.areEqual(this.stateCode, wireIdentification.stateCode) && Intrinsics.areEqual(this.countryCode, wireIdentification.countryCode) && Intrinsics.areEqual(this.regionCode, wireIdentification.regionCode) && Intrinsics.areEqual(this.minAge, wireIdentification.minAge) && Intrinsics.areEqual(this.createdAt, wireIdentification.createdAt) && Intrinsics.areEqual(this.updatedAt, wireIdentification.updatedAt) && Intrinsics.areEqual(this.completedAt, wireIdentification.completedAt) && Intrinsics.areEqual(this.expiresAt, wireIdentification.expiresAt);
        }
        return false;
    }

    public final String getCompletedAt() {
        return this.completedAt;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDocumentEntryMethod() {
        return this.documentEntryMethod;
    }

    public final String getDocumentHash() {
        return this.documentHash;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.f66729id;
    }

    public final String getIngestionResult() {
        return this.ingestionResult;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final Integer getMinAge() {
        return this.minAge;
    }

    public final String getPrincipalId() {
        return this.principalId;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final double getScore() {
        return this.score;
    }

    public final String getSelfieEntryMethod() {
        return this.selfieEntryMethod;
    }

    public final String getService() {
        return this.service;
    }

    public final String getServiceTransactionId() {
        return this.serviceTransactionId;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public int hashCode() {
        int hashCode = this.f66729id.hashCode() * 31;
        String str = this.principalId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userGuestId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.service;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceTransactionId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.documentType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.documentEntryMethod;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.selfieEntryMethod;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        int hashCode9 = (hashCode8 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        String str8 = this.ingestionResult;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.documentHash;
        int hashCode11 = (((hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + Double.hashCode(this.score)) * 31;
        String str10 = this.stateCode;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.countryCode;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.regionCode;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.minAge;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.createdAt;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.updatedAt;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.completedAt;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.expiresAt;
        return hashCode18 + (str16 != null ? str16.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66729id;
        String str2 = this.principalId;
        String str3 = this.userGuestId;
        String str4 = this.service;
        String str5 = this.serviceTransactionId;
        String str6 = this.documentType;
        String str7 = this.documentEntryMethod;
        String str8 = this.selfieEntryMethod;
        WireLocation wireLocation = this.location;
        String str9 = this.ingestionResult;
        String str10 = this.documentHash;
        double d = this.score;
        String str11 = this.stateCode;
        String str12 = this.countryCode;
        String str13 = this.regionCode;
        Integer num = this.minAge;
        String str14 = this.createdAt;
        String str15 = this.updatedAt;
        String str16 = this.completedAt;
        String str17 = this.expiresAt;
        return "WireIdentification(id=" + str + ", principalId=" + str2 + ", userGuestId=" + str3 + ", service=" + str4 + ", serviceTransactionId=" + str5 + ", documentType=" + str6 + ", documentEntryMethod=" + str7 + ", selfieEntryMethod=" + str8 + ", location=" + wireLocation + ", ingestionResult=" + str9 + ", documentHash=" + str10 + ", score=" + d + ", stateCode=" + str11 + ", countryCode=" + str12 + ", regionCode=" + str13 + ", minAge=" + num + ", createdAt=" + str14 + ", updatedAt=" + str15 + ", completedAt=" + str16 + ", expiresAt=" + str17 + ")";
    }

    public WireIdentification(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, WireLocation wireLocation, String str8, String str9, double d, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66729id = id;
        this.principalId = str;
        this.userGuestId = str2;
        this.service = str3;
        this.serviceTransactionId = str4;
        this.documentType = str5;
        this.documentEntryMethod = str6;
        this.selfieEntryMethod = str7;
        this.location = wireLocation;
        this.ingestionResult = str8;
        this.documentHash = str9;
        this.score = d;
        this.stateCode = str10;
        this.countryCode = str11;
        this.regionCode = str12;
        this.minAge = num;
        this.createdAt = str13;
        this.updatedAt = str14;
        this.completedAt = str15;
        this.expiresAt = str16;
    }

    public /* synthetic */ WireIdentification(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WireLocation wireLocation, String str9, String str10, double d, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : wireLocation, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? 0.0d : d, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num, (i & 65536) != 0 ? null : str14, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str15, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str16, (i & 524288) != 0 ? null : str17);
    }
}
