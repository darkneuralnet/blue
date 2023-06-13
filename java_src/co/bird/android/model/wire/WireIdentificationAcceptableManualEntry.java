package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ¤\u0001\u0010.\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000fHÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001a¨\u00064"}, m28432d2 = {"Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;", "", "allowedDocumentTypes", "", "", "requireIdNumberRegex", "requireIssuingAuthority", "requireGender", "", "requireNationality", "offerBeforeScan", "allowedSpecialDocumentTypes", "requireName", "requireIssueDate", "implicitAgeYears", "", "implicitExpirationDays", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllowedDocumentTypes", "()Ljava/util/List;", "getAllowedSpecialDocumentTypes", "getImplicitAgeYears", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImplicitExpirationDays", "getOfferBeforeScan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRequireGender", "getRequireIdNumberRegex", "()Ljava/lang/String;", "getRequireIssueDate", "getRequireIssuingAuthority", "getRequireName", "getRequireNationality", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationAcceptableManualEntry {
    @JsonProperty("allowed_document_types")
    @InterfaceC41208ft5("allowed_document_types")
    private final List<String> allowedDocumentTypes;
    @JsonProperty("allowed_special_document_types")
    @InterfaceC41208ft5("allowed_special_document_types")
    private final List<String> allowedSpecialDocumentTypes;
    @JsonProperty("implicit_age_years")
    @InterfaceC41208ft5("implicit_age_years")
    private final Integer implicitAgeYears;
    @JsonProperty("implicit_expiration_days")
    @InterfaceC41208ft5("implicit_expiration_days")
    private final Integer implicitExpirationDays;
    @JsonProperty("offer_before_scan")
    @InterfaceC41208ft5("offer_before_scan")
    private final Boolean offerBeforeScan;
    @JsonProperty("require_gender")
    @InterfaceC41208ft5("require_gender")
    private final Boolean requireGender;
    @JsonProperty("require_id_number_regex")
    @InterfaceC41208ft5("require_id_number_regex")
    private final String requireIdNumberRegex;
    @JsonProperty("require_issue_date")
    @InterfaceC41208ft5("require_issue_date")
    private final Boolean requireIssueDate;
    @JsonProperty("require_issuing_authority")
    @InterfaceC41208ft5("require_issuing_authority")
    private final List<String> requireIssuingAuthority;
    @JsonProperty("require_name")
    @InterfaceC41208ft5("require_name")
    private final Boolean requireName;
    @JsonProperty("require_nationality")
    @InterfaceC41208ft5("require_nationality")
    private final Boolean requireNationality;

    public WireIdentificationAcceptableManualEntry() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final List<String> component1() {
        return this.allowedDocumentTypes;
    }

    public final Integer component10() {
        return this.implicitAgeYears;
    }

    public final Integer component11() {
        return this.implicitExpirationDays;
    }

    public final String component2() {
        return this.requireIdNumberRegex;
    }

    public final List<String> component3() {
        return this.requireIssuingAuthority;
    }

    public final Boolean component4() {
        return this.requireGender;
    }

    public final Boolean component5() {
        return this.requireNationality;
    }

    public final Boolean component6() {
        return this.offerBeforeScan;
    }

    public final List<String> component7() {
        return this.allowedSpecialDocumentTypes;
    }

    public final Boolean component8() {
        return this.requireName;
    }

    public final Boolean component9() {
        return this.requireIssueDate;
    }

    public final WireIdentificationAcceptableManualEntry copy(List<String> list, String str, List<String> list2, Boolean bool, Boolean bool2, Boolean bool3, List<String> list3, Boolean bool4, Boolean bool5, Integer num, Integer num2) {
        return new WireIdentificationAcceptableManualEntry(list, str, list2, bool, bool2, bool3, list3, bool4, bool5, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationAcceptableManualEntry) {
            WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry = (WireIdentificationAcceptableManualEntry) obj;
            return Intrinsics.areEqual(this.allowedDocumentTypes, wireIdentificationAcceptableManualEntry.allowedDocumentTypes) && Intrinsics.areEqual(this.requireIdNumberRegex, wireIdentificationAcceptableManualEntry.requireIdNumberRegex) && Intrinsics.areEqual(this.requireIssuingAuthority, wireIdentificationAcceptableManualEntry.requireIssuingAuthority) && Intrinsics.areEqual(this.requireGender, wireIdentificationAcceptableManualEntry.requireGender) && Intrinsics.areEqual(this.requireNationality, wireIdentificationAcceptableManualEntry.requireNationality) && Intrinsics.areEqual(this.offerBeforeScan, wireIdentificationAcceptableManualEntry.offerBeforeScan) && Intrinsics.areEqual(this.allowedSpecialDocumentTypes, wireIdentificationAcceptableManualEntry.allowedSpecialDocumentTypes) && Intrinsics.areEqual(this.requireName, wireIdentificationAcceptableManualEntry.requireName) && Intrinsics.areEqual(this.requireIssueDate, wireIdentificationAcceptableManualEntry.requireIssueDate) && Intrinsics.areEqual(this.implicitAgeYears, wireIdentificationAcceptableManualEntry.implicitAgeYears) && Intrinsics.areEqual(this.implicitExpirationDays, wireIdentificationAcceptableManualEntry.implicitExpirationDays);
        }
        return false;
    }

    public final List<String> getAllowedDocumentTypes() {
        return this.allowedDocumentTypes;
    }

    public final List<String> getAllowedSpecialDocumentTypes() {
        return this.allowedSpecialDocumentTypes;
    }

    public final Integer getImplicitAgeYears() {
        return this.implicitAgeYears;
    }

    public final Integer getImplicitExpirationDays() {
        return this.implicitExpirationDays;
    }

    public final Boolean getOfferBeforeScan() {
        return this.offerBeforeScan;
    }

    public final Boolean getRequireGender() {
        return this.requireGender;
    }

    public final String getRequireIdNumberRegex() {
        return this.requireIdNumberRegex;
    }

    public final Boolean getRequireIssueDate() {
        return this.requireIssueDate;
    }

    public final List<String> getRequireIssuingAuthority() {
        return this.requireIssuingAuthority;
    }

    public final Boolean getRequireName() {
        return this.requireName;
    }

    public final Boolean getRequireNationality() {
        return this.requireNationality;
    }

    public int hashCode() {
        List<String> list = this.allowedDocumentTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.requireIdNumberRegex;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.requireIssuingAuthority;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.requireGender;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.requireNationality;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.offerBeforeScan;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list3 = this.allowedSpecialDocumentTypes;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool4 = this.requireName;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.requireIssueDate;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num = this.implicitAgeYears;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.implicitExpirationDays;
        return hashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.allowedDocumentTypes;
        String str = this.requireIdNumberRegex;
        List<String> list2 = this.requireIssuingAuthority;
        Boolean bool = this.requireGender;
        Boolean bool2 = this.requireNationality;
        Boolean bool3 = this.offerBeforeScan;
        List<String> list3 = this.allowedSpecialDocumentTypes;
        Boolean bool4 = this.requireName;
        Boolean bool5 = this.requireIssueDate;
        Integer num = this.implicitAgeYears;
        Integer num2 = this.implicitExpirationDays;
        return "WireIdentificationAcceptableManualEntry(allowedDocumentTypes=" + list + ", requireIdNumberRegex=" + str + ", requireIssuingAuthority=" + list2 + ", requireGender=" + bool + ", requireNationality=" + bool2 + ", offerBeforeScan=" + bool3 + ", allowedSpecialDocumentTypes=" + list3 + ", requireName=" + bool4 + ", requireIssueDate=" + bool5 + ", implicitAgeYears=" + num + ", implicitExpirationDays=" + num2 + ")";
    }

    public WireIdentificationAcceptableManualEntry(List<String> list, String str, List<String> list2, Boolean bool, Boolean bool2, Boolean bool3, List<String> list3, Boolean bool4, Boolean bool5, Integer num, Integer num2) {
        this.allowedDocumentTypes = list;
        this.requireIdNumberRegex = str;
        this.requireIssuingAuthority = list2;
        this.requireGender = bool;
        this.requireNationality = bool2;
        this.offerBeforeScan = bool3;
        this.allowedSpecialDocumentTypes = list3;
        this.requireName = bool4;
        this.requireIssueDate = bool5;
        this.implicitAgeYears = num;
        this.implicitExpirationDays = num2;
    }

    public /* synthetic */ WireIdentificationAcceptableManualEntry(List list, String str, List list2, Boolean bool, Boolean bool2, Boolean bool3, List list3, Boolean bool4, Boolean bool5, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : bool5, (i & 512) != 0 ? null : num, (i & 1024) == 0 ? num2 : null);
    }
}
