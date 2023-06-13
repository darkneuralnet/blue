package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006)"}, m28432d2 = {"Lco/bird/api/request/BugReportNewRequestBody;", "", "ticketProject", "", "reason", "summary", "clientId", "fileNames", "", "generatedAt", "Lorg/joda/time/DateTime;", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireLocation;)V", "getClientId$annotations", "()V", "getClientId", "()Ljava/lang/String;", "getFileNames", "()Ljava/util/List;", "getGeneratedAt", "()Lorg/joda/time/DateTime;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getReason", "getSummary", "getTicketProject", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BugReportNewRequestBody {
    @JsonProperty(AnalyticsRequestV2.PARAM_CLIENT_ID)
    @InterfaceC41208ft5(AnalyticsRequestV2.PARAM_CLIENT_ID)
    private final String clientId;
    @JsonProperty("file_names")
    @InterfaceC41208ft5("file_names")
    private final List<String> fileNames;
    @JsonProperty("generated_at")
    @InterfaceC41208ft5("generated_at")
    private final DateTime generatedAt;
    @JsonProperty("generated_location")
    @InterfaceC41208ft5("generated_location")
    private final WireLocation location;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;
    @JsonProperty("summary")
    @InterfaceC41208ft5("summary")
    private final String summary;
    @JsonProperty("ticket_project")
    @InterfaceC41208ft5("ticket_project")
    private final String ticketProject;

    public BugReportNewRequestBody(String str, String str2, String str3, String str4, List<String> fileNames, DateTime generatedAt, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        Intrinsics.checkNotNullParameter(generatedAt, "generatedAt");
        this.ticketProject = str;
        this.reason = str2;
        this.summary = str3;
        this.clientId = str4;
        this.fileNames = fileNames;
        this.generatedAt = generatedAt;
        this.location = wireLocation;
    }

    public static /* synthetic */ BugReportNewRequestBody copy$default(BugReportNewRequestBody bugReportNewRequestBody, String str, String str2, String str3, String str4, List list, DateTime dateTime, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bugReportNewRequestBody.ticketProject;
        }
        if ((i & 2) != 0) {
            str2 = bugReportNewRequestBody.reason;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bugReportNewRequestBody.summary;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bugReportNewRequestBody.clientId;
        }
        String str7 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = bugReportNewRequestBody.fileNames;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            dateTime = bugReportNewRequestBody.generatedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 64) != 0) {
            wireLocation = bugReportNewRequestBody.location;
        }
        return bugReportNewRequestBody.copy(str, str5, str6, str7, list3, dateTime2, wireLocation);
    }

    @Deprecated(message = "This was used when users uploaded files directly to s3 bucket.")
    public static /* synthetic */ void getClientId$annotations() {
    }

    public final String component1() {
        return this.ticketProject;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.clientId;
    }

    public final List<String> component5() {
        return this.fileNames;
    }

    public final DateTime component6() {
        return this.generatedAt;
    }

    public final WireLocation component7() {
        return this.location;
    }

    public final BugReportNewRequestBody copy(String str, String str2, String str3, String str4, List<String> fileNames, DateTime generatedAt, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        Intrinsics.checkNotNullParameter(generatedAt, "generatedAt");
        return new BugReportNewRequestBody(str, str2, str3, str4, fileNames, generatedAt, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BugReportNewRequestBody) {
            BugReportNewRequestBody bugReportNewRequestBody = (BugReportNewRequestBody) obj;
            return Intrinsics.areEqual(this.ticketProject, bugReportNewRequestBody.ticketProject) && Intrinsics.areEqual(this.reason, bugReportNewRequestBody.reason) && Intrinsics.areEqual(this.summary, bugReportNewRequestBody.summary) && Intrinsics.areEqual(this.clientId, bugReportNewRequestBody.clientId) && Intrinsics.areEqual(this.fileNames, bugReportNewRequestBody.fileNames) && Intrinsics.areEqual(this.generatedAt, bugReportNewRequestBody.generatedAt) && Intrinsics.areEqual(this.location, bugReportNewRequestBody.location);
        }
        return false;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final List<String> getFileNames() {
        return this.fileNames;
    }

    public final DateTime getGeneratedAt() {
        return this.generatedAt;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTicketProject() {
        return this.ticketProject;
    }

    public int hashCode() {
        String str = this.ticketProject;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.summary;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientId;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.fileNames.hashCode()) * 31) + this.generatedAt.hashCode()) * 31;
        WireLocation wireLocation = this.location;
        return hashCode4 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketProject;
        String str2 = this.reason;
        String str3 = this.summary;
        String str4 = this.clientId;
        List<String> list = this.fileNames;
        DateTime dateTime = this.generatedAt;
        WireLocation wireLocation = this.location;
        return "BugReportNewRequestBody(ticketProject=" + str + ", reason=" + str2 + ", summary=" + str3 + ", clientId=" + str4 + ", fileNames=" + list + ", generatedAt=" + dateTime + ", location=" + wireLocation + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BugReportNewRequestBody(String str, String str2, String str3, String str4, List list, DateTime dateTime, WireLocation wireLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, r5, r6, r7, (i & 64) != 0 ? null : wireLocation);
        List list2;
        DateTime dateTime2;
        List emptyList;
        String uuid = (i & 8) != 0 ? UUID.randomUUID().toString() : str4;
        if ((i & 16) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
        if ((i & 32) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
    }
}
