package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001bJ¤\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00064"}, m28432d2 = {"Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;", "", "documentEntryMethod", "", "selfieEntryMethod", "documentTypes", "", "services", "stateCodes", "countryCodes", "regionCodes", "minimumScore", "", "maxDocumentExpirationDays", "", "canSubmit", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCanSubmit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCountryCodes", "()Ljava/util/List;", "getDocumentEntryMethod", "()Ljava/lang/String;", "getDocumentTypes", "getMaxDocumentExpirationDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinimumScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRegionCodes", "getSelfieEntryMethod", "getServices", "getStateCodes", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;)Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationAcceptableMethod {
    @JsonProperty("can_submit")
    @InterfaceC41208ft5("can_submit")
    private final Boolean canSubmit;
    @JsonProperty("country_codes")
    @InterfaceC41208ft5("country_codes")
    private final List<String> countryCodes;
    @JsonProperty("document_entry_method")
    @InterfaceC41208ft5("document_entry_method")
    private final String documentEntryMethod;
    @JsonProperty("document_types")
    @InterfaceC41208ft5("document_types")
    private final List<String> documentTypes;
    @JsonProperty("max_document_expiration_days")
    @InterfaceC41208ft5("max_document_expiration_days")
    private final Integer maxDocumentExpirationDays;
    @JsonProperty("minimum_score")
    @InterfaceC41208ft5("minimum_score")
    private final Double minimumScore;
    @JsonProperty("region_codes")
    @InterfaceC41208ft5("region_codes")
    private final List<String> regionCodes;
    @JsonProperty("selfie_entry_method")
    @InterfaceC41208ft5("selfie_entry_method")
    private final String selfieEntryMethod;
    @JsonProperty("services")
    @InterfaceC41208ft5("services")
    private final List<String> services;
    @JsonProperty("state_codes")
    @InterfaceC41208ft5("state_codes")
    private final List<String> stateCodes;

    public WireIdentificationAcceptableMethod() {
        this(null, null, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.documentEntryMethod;
    }

    public final Boolean component10() {
        return this.canSubmit;
    }

    public final String component2() {
        return this.selfieEntryMethod;
    }

    public final List<String> component3() {
        return this.documentTypes;
    }

    public final List<String> component4() {
        return this.services;
    }

    public final List<String> component5() {
        return this.stateCodes;
    }

    public final List<String> component6() {
        return this.countryCodes;
    }

    public final List<String> component7() {
        return this.regionCodes;
    }

    public final Double component8() {
        return this.minimumScore;
    }

    public final Integer component9() {
        return this.maxDocumentExpirationDays;
    }

    public final WireIdentificationAcceptableMethod copy(String str, String str2, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Double d, Integer num, Boolean bool) {
        return new WireIdentificationAcceptableMethod(str, str2, list, list2, list3, list4, list5, d, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationAcceptableMethod) {
            WireIdentificationAcceptableMethod wireIdentificationAcceptableMethod = (WireIdentificationAcceptableMethod) obj;
            return Intrinsics.areEqual(this.documentEntryMethod, wireIdentificationAcceptableMethod.documentEntryMethod) && Intrinsics.areEqual(this.selfieEntryMethod, wireIdentificationAcceptableMethod.selfieEntryMethod) && Intrinsics.areEqual(this.documentTypes, wireIdentificationAcceptableMethod.documentTypes) && Intrinsics.areEqual(this.services, wireIdentificationAcceptableMethod.services) && Intrinsics.areEqual(this.stateCodes, wireIdentificationAcceptableMethod.stateCodes) && Intrinsics.areEqual(this.countryCodes, wireIdentificationAcceptableMethod.countryCodes) && Intrinsics.areEqual(this.regionCodes, wireIdentificationAcceptableMethod.regionCodes) && Intrinsics.areEqual((Object) this.minimumScore, (Object) wireIdentificationAcceptableMethod.minimumScore) && Intrinsics.areEqual(this.maxDocumentExpirationDays, wireIdentificationAcceptableMethod.maxDocumentExpirationDays) && Intrinsics.areEqual(this.canSubmit, wireIdentificationAcceptableMethod.canSubmit);
        }
        return false;
    }

    public final Boolean getCanSubmit() {
        return this.canSubmit;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final String getDocumentEntryMethod() {
        return this.documentEntryMethod;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }

    public final Integer getMaxDocumentExpirationDays() {
        return this.maxDocumentExpirationDays;
    }

    public final Double getMinimumScore() {
        return this.minimumScore;
    }

    public final List<String> getRegionCodes() {
        return this.regionCodes;
    }

    public final String getSelfieEntryMethod() {
        return this.selfieEntryMethod;
    }

    public final List<String> getServices() {
        return this.services;
    }

    public final List<String> getStateCodes() {
        return this.stateCodes;
    }

    public int hashCode() {
        String str = this.documentEntryMethod;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selfieEntryMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.documentTypes;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.services;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.stateCodes;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.countryCodes;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.regionCodes;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Double d = this.minimumScore;
        int hashCode8 = (hashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.maxDocumentExpirationDays;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canSubmit;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.documentEntryMethod;
        String str2 = this.selfieEntryMethod;
        List<String> list = this.documentTypes;
        List<String> list2 = this.services;
        List<String> list3 = this.stateCodes;
        List<String> list4 = this.countryCodes;
        List<String> list5 = this.regionCodes;
        Double d = this.minimumScore;
        Integer num = this.maxDocumentExpirationDays;
        Boolean bool = this.canSubmit;
        return "WireIdentificationAcceptableMethod(documentEntryMethod=" + str + ", selfieEntryMethod=" + str2 + ", documentTypes=" + list + ", services=" + list2 + ", stateCodes=" + list3 + ", countryCodes=" + list4 + ", regionCodes=" + list5 + ", minimumScore=" + d + ", maxDocumentExpirationDays=" + num + ", canSubmit=" + bool + ")";
    }

    public WireIdentificationAcceptableMethod(String str, String str2, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Double d, Integer num, Boolean bool) {
        this.documentEntryMethod = str;
        this.selfieEntryMethod = str2;
        this.documentTypes = list;
        this.services = list2;
        this.stateCodes = list3;
        this.countryCodes = list4;
        this.regionCodes = list5;
        this.minimumScore = d;
        this.maxDocumentExpirationDays = num;
        this.canSubmit = bool;
    }

    public /* synthetic */ WireIdentificationAcceptableMethod(String str, String str2, List list, List list2, List list3, List list4, List list5, Double d, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : num, (i & 512) == 0 ? bool : null);
    }
}
