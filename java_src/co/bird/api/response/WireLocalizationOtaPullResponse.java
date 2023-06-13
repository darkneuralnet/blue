package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/WireLocalizationOtaPullResponse;", "", "response", "Lco/bird/api/response/WireLocalizationOtaPullTranslations;", "responseTime", "Lorg/joda/time/DateTime;", "latestLastModifiedTime", "(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getLatestLastModifiedTime", "()Lorg/joda/time/DateTime;", "getResponse", "()Lco/bird/api/response/WireLocalizationOtaPullTranslations;", "getResponseTime", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLocalizationOtaPullResponse {
    @JsonProperty("latest_last_modified_time")
    @InterfaceC41208ft5("latest_last_modified_time")
    private final DateTime latestLastModifiedTime;
    @JsonProperty("response")
    @InterfaceC41208ft5("response")
    private final WireLocalizationOtaPullTranslations response;
    @JsonProperty("response_time")
    @InterfaceC41208ft5("response_time")
    private final DateTime responseTime;

    public WireLocalizationOtaPullResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireLocalizationOtaPullResponse copy$default(WireLocalizationOtaPullResponse wireLocalizationOtaPullResponse, WireLocalizationOtaPullTranslations wireLocalizationOtaPullTranslations, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocalizationOtaPullTranslations = wireLocalizationOtaPullResponse.response;
        }
        if ((i & 2) != 0) {
            dateTime = wireLocalizationOtaPullResponse.responseTime;
        }
        if ((i & 4) != 0) {
            dateTime2 = wireLocalizationOtaPullResponse.latestLastModifiedTime;
        }
        return wireLocalizationOtaPullResponse.copy(wireLocalizationOtaPullTranslations, dateTime, dateTime2);
    }

    public final WireLocalizationOtaPullTranslations component1() {
        return this.response;
    }

    public final DateTime component2() {
        return this.responseTime;
    }

    public final DateTime component3() {
        return this.latestLastModifiedTime;
    }

    public final WireLocalizationOtaPullResponse copy(WireLocalizationOtaPullTranslations response, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new WireLocalizationOtaPullResponse(response, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLocalizationOtaPullResponse) {
            WireLocalizationOtaPullResponse wireLocalizationOtaPullResponse = (WireLocalizationOtaPullResponse) obj;
            return Intrinsics.areEqual(this.response, wireLocalizationOtaPullResponse.response) && Intrinsics.areEqual(this.responseTime, wireLocalizationOtaPullResponse.responseTime) && Intrinsics.areEqual(this.latestLastModifiedTime, wireLocalizationOtaPullResponse.latestLastModifiedTime);
        }
        return false;
    }

    public final DateTime getLatestLastModifiedTime() {
        return this.latestLastModifiedTime;
    }

    public final WireLocalizationOtaPullTranslations getResponse() {
        return this.response;
    }

    public final DateTime getResponseTime() {
        return this.responseTime;
    }

    public int hashCode() {
        int hashCode = this.response.hashCode() * 31;
        DateTime dateTime = this.responseTime;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.latestLastModifiedTime;
        return hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        WireLocalizationOtaPullTranslations wireLocalizationOtaPullTranslations = this.response;
        DateTime dateTime = this.responseTime;
        DateTime dateTime2 = this.latestLastModifiedTime;
        return "WireLocalizationOtaPullResponse(response=" + wireLocalizationOtaPullTranslations + ", responseTime=" + dateTime + ", latestLastModifiedTime=" + dateTime2 + ")";
    }

    public WireLocalizationOtaPullResponse(WireLocalizationOtaPullTranslations response, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        this.responseTime = dateTime;
        this.latestLastModifiedTime = dateTime2;
    }

    public /* synthetic */ WireLocalizationOtaPullResponse(WireLocalizationOtaPullTranslations wireLocalizationOtaPullTranslations, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireLocalizationOtaPullTranslations(null, 1, null) : wireLocalizationOtaPullTranslations, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? null : dateTime2);
    }
}
