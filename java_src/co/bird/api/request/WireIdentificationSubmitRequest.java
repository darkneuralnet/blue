package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireIdentificationSubmissionData;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J©\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00068"}, m28432d2 = {"Lco/bird/api/request/WireIdentificationSubmitRequest;", "", "intent", "", "habitatId", "partnerId", "userGuestId", "birdModel", "documentEntryMethod", "submissionData", "Lco/bird/android/model/wire/WireIdentificationSubmissionData;", "service", "serviceTransactionId", "documentType", "selfieEntryMethod", "stateCode", "countryCode", "regionCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentificationSubmissionData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdModel", "()Ljava/lang/String;", "getCountryCode", "getDocumentEntryMethod", "getDocumentType", "getHabitatId", "getIntent", "getPartnerId", "getRegionCode", "getSelfieEntryMethod", "getService", "getServiceTransactionId", "getStateCode", "getSubmissionData", "()Lco/bird/android/model/wire/WireIdentificationSubmissionData;", "getUserGuestId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationSubmitRequest {
    @JsonProperty("bird_model")
    @InterfaceC41208ft5("bird_model")
    private final String birdModel;
    @JsonProperty("country_code")
    @InterfaceC41208ft5("country_code")
    private final String countryCode;
    @JsonProperty("document_entry_method")
    @InterfaceC41208ft5("document_entry_method")
    private final String documentEntryMethod;
    @JsonProperty("document_type")
    @InterfaceC41208ft5("document_type")
    private final String documentType;
    @JsonProperty("habitat_id")
    @InterfaceC41208ft5("habitat_id")
    private final String habitatId;
    @JsonProperty("intent")
    @InterfaceC41208ft5("intent")
    private final String intent;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("region_code")
    @InterfaceC41208ft5("region_code")
    private final String regionCode;
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
    @JsonProperty("submission_data")
    @InterfaceC41208ft5("submission_data")
    private final WireIdentificationSubmissionData submissionData;
    @JsonProperty("user_guest_id")
    @InterfaceC41208ft5("user_guest_id")
    private final String userGuestId;

    public WireIdentificationSubmitRequest(String intent, String habitatId, String str, String str2, String str3, String documentEntryMethod, WireIdentificationSubmissionData submissionData, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        this.intent = intent;
        this.habitatId = habitatId;
        this.partnerId = str;
        this.userGuestId = str2;
        this.birdModel = str3;
        this.documentEntryMethod = documentEntryMethod;
        this.submissionData = submissionData;
        this.service = str4;
        this.serviceTransactionId = str5;
        this.documentType = str6;
        this.selfieEntryMethod = str7;
        this.stateCode = str8;
        this.countryCode = str9;
        this.regionCode = str10;
    }

    public final String component1() {
        return this.intent;
    }

    public final String component10() {
        return this.documentType;
    }

    public final String component11() {
        return this.selfieEntryMethod;
    }

    public final String component12() {
        return this.stateCode;
    }

    public final String component13() {
        return this.countryCode;
    }

    public final String component14() {
        return this.regionCode;
    }

    public final String component2() {
        return this.habitatId;
    }

    public final String component3() {
        return this.partnerId;
    }

    public final String component4() {
        return this.userGuestId;
    }

    public final String component5() {
        return this.birdModel;
    }

    public final String component6() {
        return this.documentEntryMethod;
    }

    public final WireIdentificationSubmissionData component7() {
        return this.submissionData;
    }

    public final String component8() {
        return this.service;
    }

    public final String component9() {
        return this.serviceTransactionId;
    }

    public final WireIdentificationSubmitRequest copy(String intent, String habitatId, String str, String str2, String str3, String documentEntryMethod, WireIdentificationSubmissionData submissionData, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        return new WireIdentificationSubmitRequest(intent, habitatId, str, str2, str3, documentEntryMethod, submissionData, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationSubmitRequest) {
            WireIdentificationSubmitRequest wireIdentificationSubmitRequest = (WireIdentificationSubmitRequest) obj;
            return Intrinsics.areEqual(this.intent, wireIdentificationSubmitRequest.intent) && Intrinsics.areEqual(this.habitatId, wireIdentificationSubmitRequest.habitatId) && Intrinsics.areEqual(this.partnerId, wireIdentificationSubmitRequest.partnerId) && Intrinsics.areEqual(this.userGuestId, wireIdentificationSubmitRequest.userGuestId) && Intrinsics.areEqual(this.birdModel, wireIdentificationSubmitRequest.birdModel) && Intrinsics.areEqual(this.documentEntryMethod, wireIdentificationSubmitRequest.documentEntryMethod) && Intrinsics.areEqual(this.submissionData, wireIdentificationSubmitRequest.submissionData) && Intrinsics.areEqual(this.service, wireIdentificationSubmitRequest.service) && Intrinsics.areEqual(this.serviceTransactionId, wireIdentificationSubmitRequest.serviceTransactionId) && Intrinsics.areEqual(this.documentType, wireIdentificationSubmitRequest.documentType) && Intrinsics.areEqual(this.selfieEntryMethod, wireIdentificationSubmitRequest.selfieEntryMethod) && Intrinsics.areEqual(this.stateCode, wireIdentificationSubmitRequest.stateCode) && Intrinsics.areEqual(this.countryCode, wireIdentificationSubmitRequest.countryCode) && Intrinsics.areEqual(this.regionCode, wireIdentificationSubmitRequest.regionCode);
        }
        return false;
    }

    public final String getBirdModel() {
        return this.birdModel;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDocumentEntryMethod() {
        return this.documentEntryMethod;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getRegionCode() {
        return this.regionCode;
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

    public final WireIdentificationSubmissionData getSubmissionData() {
        return this.submissionData;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public int hashCode() {
        int hashCode = ((this.intent.hashCode() * 31) + this.habitatId.hashCode()) * 31;
        String str = this.partnerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userGuestId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birdModel;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.documentEntryMethod.hashCode()) * 31) + this.submissionData.hashCode()) * 31;
        String str4 = this.service;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.serviceTransactionId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.documentType;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.selfieEntryMethod;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.stateCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.countryCode;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.regionCode;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        String str = this.intent;
        String str2 = this.habitatId;
        String str3 = this.partnerId;
        String str4 = this.userGuestId;
        String str5 = this.birdModel;
        String str6 = this.documentEntryMethod;
        WireIdentificationSubmissionData wireIdentificationSubmissionData = this.submissionData;
        String str7 = this.service;
        String str8 = this.serviceTransactionId;
        String str9 = this.documentType;
        String str10 = this.selfieEntryMethod;
        String str11 = this.stateCode;
        String str12 = this.countryCode;
        String str13 = this.regionCode;
        return "WireIdentificationSubmitRequest(intent=" + str + ", habitatId=" + str2 + ", partnerId=" + str3 + ", userGuestId=" + str4 + ", birdModel=" + str5 + ", documentEntryMethod=" + str6 + ", submissionData=" + wireIdentificationSubmissionData + ", service=" + str7 + ", serviceTransactionId=" + str8 + ", documentType=" + str9 + ", selfieEntryMethod=" + str10 + ", stateCode=" + str11 + ", countryCode=" + str12 + ", regionCode=" + str13 + ")";
    }

    public /* synthetic */ WireIdentificationSubmitRequest(String str, String str2, String str3, String str4, String str5, String str6, WireIdentificationSubmissionData wireIdentificationSubmissionData, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, wireIdentificationSubmissionData, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13);
    }
}
