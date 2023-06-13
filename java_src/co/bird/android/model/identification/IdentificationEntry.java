package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0014HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jö\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0019HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 ¨\u0006W"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationEntry;", "", "id", "", "principalId", "userGuestId", "service", "serviceTransactionId", "documentType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentEntryMethod", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "selfieEntryMethod", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "location", "Lco/bird/android/model/wire/WireLocation;", "ingestionResult", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "documentHash", "score", "", "stateCode", "countryCode", "regionCode", "minAge", "", "createdAt", "updatedAt", "completedAt", "expiresAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/identification/IdentificationIngestionResult;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompletedAt", "()Ljava/lang/String;", "getCountryCode", "getCreatedAt", "getDocumentEntryMethod", "()Lco/bird/android/model/identification/IdentificationEntryMethod;", "getDocumentHash", "getDocumentType", "()Lco/bird/android/model/identification/IdentificationDocumentType;", "getExpiresAt", "getId", "getIngestionResult", "()Lco/bird/android/model/identification/IdentificationIngestionResult;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMinAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrincipalId", "getRegionCode", "getScore", "()D", "getSelfieEntryMethod", "()Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "getService", "getServiceTransactionId", "getStateCode", "getUpdatedAt", "getUserGuestId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationEntryMethod;Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/identification/IdentificationIngestionResult;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationEntry;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationEntry {
    private final String completedAt;
    private final String countryCode;
    private final String createdAt;
    private final IdentificationEntryMethod documentEntryMethod;
    private final String documentHash;
    private final IdentificationDocumentType documentType;
    private final String expiresAt;

    /* renamed from: id */
    private final String f66658id;
    private final IdentificationIngestionResult ingestionResult;
    private final WireLocation location;
    private final Integer minAge;
    private final String principalId;
    private final String regionCode;
    private final double score;
    private final IdentificationSelfieEntryMethod selfieEntryMethod;
    private final String service;
    private final String serviceTransactionId;
    private final String stateCode;
    private final String updatedAt;
    private final String userGuestId;

    public IdentificationEntry(String id, String str, String str2, String str3, String str4, IdentificationDocumentType documentType, IdentificationEntryMethod documentEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, WireLocation wireLocation, IdentificationIngestionResult identificationIngestionResult, String str5, double d, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        this.f66658id = id;
        this.principalId = str;
        this.userGuestId = str2;
        this.service = str3;
        this.serviceTransactionId = str4;
        this.documentType = documentType;
        this.documentEntryMethod = documentEntryMethod;
        this.selfieEntryMethod = identificationSelfieEntryMethod;
        this.location = wireLocation;
        this.ingestionResult = identificationIngestionResult;
        this.documentHash = str5;
        this.score = d;
        this.stateCode = str6;
        this.countryCode = str7;
        this.regionCode = str8;
        this.minAge = num;
        this.createdAt = str9;
        this.updatedAt = str10;
        this.completedAt = str11;
        this.expiresAt = str12;
    }

    public final String component1() {
        return this.f66658id;
    }

    public final IdentificationIngestionResult component10() {
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

    public final IdentificationDocumentType component6() {
        return this.documentType;
    }

    public final IdentificationEntryMethod component7() {
        return this.documentEntryMethod;
    }

    public final IdentificationSelfieEntryMethod component8() {
        return this.selfieEntryMethod;
    }

    public final WireLocation component9() {
        return this.location;
    }

    public final IdentificationEntry copy(String id, String str, String str2, String str3, String str4, IdentificationDocumentType documentType, IdentificationEntryMethod documentEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, WireLocation wireLocation, IdentificationIngestionResult identificationIngestionResult, String str5, double d, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        return new IdentificationEntry(id, str, str2, str3, str4, documentType, documentEntryMethod, identificationSelfieEntryMethod, wireLocation, identificationIngestionResult, str5, d, str6, str7, str8, num, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationEntry) {
            IdentificationEntry identificationEntry = (IdentificationEntry) obj;
            return Intrinsics.areEqual(this.f66658id, identificationEntry.f66658id) && Intrinsics.areEqual(this.principalId, identificationEntry.principalId) && Intrinsics.areEqual(this.userGuestId, identificationEntry.userGuestId) && Intrinsics.areEqual(this.service, identificationEntry.service) && Intrinsics.areEqual(this.serviceTransactionId, identificationEntry.serviceTransactionId) && this.documentType == identificationEntry.documentType && this.documentEntryMethod == identificationEntry.documentEntryMethod && this.selfieEntryMethod == identificationEntry.selfieEntryMethod && Intrinsics.areEqual(this.location, identificationEntry.location) && this.ingestionResult == identificationEntry.ingestionResult && Intrinsics.areEqual(this.documentHash, identificationEntry.documentHash) && Double.compare(this.score, identificationEntry.score) == 0 && Intrinsics.areEqual(this.stateCode, identificationEntry.stateCode) && Intrinsics.areEqual(this.countryCode, identificationEntry.countryCode) && Intrinsics.areEqual(this.regionCode, identificationEntry.regionCode) && Intrinsics.areEqual(this.minAge, identificationEntry.minAge) && Intrinsics.areEqual(this.createdAt, identificationEntry.createdAt) && Intrinsics.areEqual(this.updatedAt, identificationEntry.updatedAt) && Intrinsics.areEqual(this.completedAt, identificationEntry.completedAt) && Intrinsics.areEqual(this.expiresAt, identificationEntry.expiresAt);
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

    public final IdentificationEntryMethod getDocumentEntryMethod() {
        return this.documentEntryMethod;
    }

    public final String getDocumentHash() {
        return this.documentHash;
    }

    public final IdentificationDocumentType getDocumentType() {
        return this.documentType;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.f66658id;
    }

    public final IdentificationIngestionResult getIngestionResult() {
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

    public final IdentificationSelfieEntryMethod getSelfieEntryMethod() {
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
        int hashCode = this.f66658id.hashCode() * 31;
        String str = this.principalId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userGuestId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.service;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceTransactionId;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documentType.hashCode()) * 31) + this.documentEntryMethod.hashCode()) * 31;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        int hashCode6 = (hashCode5 + (identificationSelfieEntryMethod == null ? 0 : identificationSelfieEntryMethod.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        int hashCode7 = (hashCode6 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        IdentificationIngestionResult identificationIngestionResult = this.ingestionResult;
        int hashCode8 = (hashCode7 + (identificationIngestionResult == null ? 0 : identificationIngestionResult.hashCode())) * 31;
        String str5 = this.documentHash;
        int hashCode9 = (((hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.hashCode(this.score)) * 31;
        String str6 = this.stateCode;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countryCode;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.regionCode;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.minAge;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.createdAt;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updatedAt;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.completedAt;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.expiresAt;
        return hashCode16 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66658id;
        String str2 = this.principalId;
        String str3 = this.userGuestId;
        String str4 = this.service;
        String str5 = this.serviceTransactionId;
        IdentificationDocumentType identificationDocumentType = this.documentType;
        IdentificationEntryMethod identificationEntryMethod = this.documentEntryMethod;
        IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.selfieEntryMethod;
        WireLocation wireLocation = this.location;
        IdentificationIngestionResult identificationIngestionResult = this.ingestionResult;
        String str6 = this.documentHash;
        double d = this.score;
        String str7 = this.stateCode;
        String str8 = this.countryCode;
        String str9 = this.regionCode;
        Integer num = this.minAge;
        String str10 = this.createdAt;
        String str11 = this.updatedAt;
        String str12 = this.completedAt;
        String str13 = this.expiresAt;
        return "IdentificationEntry(id=" + str + ", principalId=" + str2 + ", userGuestId=" + str3 + ", service=" + str4 + ", serviceTransactionId=" + str5 + ", documentType=" + identificationDocumentType + ", documentEntryMethod=" + identificationEntryMethod + ", selfieEntryMethod=" + identificationSelfieEntryMethod + ", location=" + wireLocation + ", ingestionResult=" + identificationIngestionResult + ", documentHash=" + str6 + ", score=" + d + ", stateCode=" + str7 + ", countryCode=" + str8 + ", regionCode=" + str9 + ", minAge=" + num + ", createdAt=" + str10 + ", updatedAt=" + str11 + ", completedAt=" + str12 + ", expiresAt=" + str13 + ")";
    }

    public /* synthetic */ IdentificationEntry(String str, String str2, String str3, String str4, String str5, IdentificationDocumentType identificationDocumentType, IdentificationEntryMethod identificationEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, WireLocation wireLocation, IdentificationIngestionResult identificationIngestionResult, String str6, double d, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, identificationDocumentType, identificationEntryMethod, (i & 128) != 0 ? null : identificationSelfieEntryMethod, (i & 256) != 0 ? null : wireLocation, (i & 512) != 0 ? null : identificationIngestionResult, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? 0.0d : d, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : num, (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? null : str11, (262144 & i) != 0 ? null : str12, (i & 524288) != 0 ? null : str13);
    }
}
