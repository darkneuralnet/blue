package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003Jh\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m28432d2 = {"Lco/bird/api/response/CannotAccessReportResponse;", "", "birdsReported", "", "birdsDiscovered", "", "photoUrls", "", "notes", "reasonTitle", "id", "reportDate", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getBirdsDiscovered", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirdsReported", "()Ljava/lang/String;", "getId", "getNotes", "getPhotoUrls", "()Ljava/util/List;", "getReasonTitle", "getReportDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)Lco/bird/api/response/CannotAccessReportResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CannotAccessReportResponse {
    @JsonProperty("birds_discovered")
    @InterfaceC41208ft5("birds_discovered")
    private final Integer birdsDiscovered;
    @JsonProperty("birds_reported")
    @InterfaceC41208ft5("birds_reported")
    private final String birdsReported;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68211id;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("reason_title")
    @InterfaceC41208ft5("reason_title")
    private final String reasonTitle;
    @JsonProperty("report_date")
    @InterfaceC41208ft5("report_date")
    private final DateTime reportDate;

    public CannotAccessReportResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CannotAccessReportResponse copy$default(CannotAccessReportResponse cannotAccessReportResponse, String str, Integer num, List list, String str2, String str3, String str4, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cannotAccessReportResponse.birdsReported;
        }
        if ((i & 2) != 0) {
            num = cannotAccessReportResponse.birdsDiscovered;
        }
        Integer num2 = num;
        List<String> list2 = list;
        if ((i & 4) != 0) {
            list2 = cannotAccessReportResponse.photoUrls;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            str2 = cannotAccessReportResponse.notes;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = cannotAccessReportResponse.reasonTitle;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = cannotAccessReportResponse.f68211id;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            dateTime = cannotAccessReportResponse.reportDate;
        }
        return cannotAccessReportResponse.copy(str, num2, list3, str5, str6, str7, dateTime);
    }

    public final String component1() {
        return this.birdsReported;
    }

    public final Integer component2() {
        return this.birdsDiscovered;
    }

    public final List<String> component3() {
        return this.photoUrls;
    }

    public final String component4() {
        return this.notes;
    }

    public final String component5() {
        return this.reasonTitle;
    }

    public final String component6() {
        return this.f68211id;
    }

    public final DateTime component7() {
        return this.reportDate;
    }

    public final CannotAccessReportResponse copy(String str, Integer num, List<String> list, String str2, String str3, String str4, DateTime dateTime) {
        return new CannotAccessReportResponse(str, num, list, str2, str3, str4, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CannotAccessReportResponse) {
            CannotAccessReportResponse cannotAccessReportResponse = (CannotAccessReportResponse) obj;
            return Intrinsics.areEqual(this.birdsReported, cannotAccessReportResponse.birdsReported) && Intrinsics.areEqual(this.birdsDiscovered, cannotAccessReportResponse.birdsDiscovered) && Intrinsics.areEqual(this.photoUrls, cannotAccessReportResponse.photoUrls) && Intrinsics.areEqual(this.notes, cannotAccessReportResponse.notes) && Intrinsics.areEqual(this.reasonTitle, cannotAccessReportResponse.reasonTitle) && Intrinsics.areEqual(this.f68211id, cannotAccessReportResponse.f68211id) && Intrinsics.areEqual(this.reportDate, cannotAccessReportResponse.reportDate);
        }
        return false;
    }

    public final Integer getBirdsDiscovered() {
        return this.birdsDiscovered;
    }

    public final String getBirdsReported() {
        return this.birdsReported;
    }

    public final String getId() {
        return this.f68211id;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public final String getReasonTitle() {
        return this.reasonTitle;
    }

    public final DateTime getReportDate() {
        return this.reportDate;
    }

    public int hashCode() {
        String str = this.birdsReported;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.birdsDiscovered;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.photoUrls;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.notes;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reasonTitle;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f68211id;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.reportDate;
        return hashCode6 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdsReported;
        Integer num = this.birdsDiscovered;
        List<String> list = this.photoUrls;
        String str2 = this.notes;
        String str3 = this.reasonTitle;
        String str4 = this.f68211id;
        DateTime dateTime = this.reportDate;
        return "CannotAccessReportResponse(birdsReported=" + str + ", birdsDiscovered=" + num + ", photoUrls=" + list + ", notes=" + str2 + ", reasonTitle=" + str3 + ", id=" + str4 + ", reportDate=" + dateTime + ")";
    }

    public CannotAccessReportResponse(String str, Integer num, List<String> list, String str2, String str3, String str4, DateTime dateTime) {
        this.birdsReported = str;
        this.birdsDiscovered = num;
        this.photoUrls = list;
        this.notes = str2;
        this.reasonTitle = str3;
        this.f68211id = str4;
        this.reportDate = dateTime;
    }

    public /* synthetic */ CannotAccessReportResponse(String str, Integer num, List list, String str2, String str3, String str4, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : dateTime);
    }
}
