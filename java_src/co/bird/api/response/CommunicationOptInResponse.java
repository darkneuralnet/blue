package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/CommunicationOptInResponse;", "", "id", "", "userId", "optedIn", "", "createdAt", "Lorg/joda/time/DateTime;", "optInString", "(Ljava/lang/String;Ljava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getOptInString", "getOptedIn", "()Z", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationOptInResponse {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68212id;
    @JsonProperty("opt_in_string")
    @InterfaceC41208ft5("opt_in_string")
    private final String optInString;
    @JsonProperty("opted_in")
    @InterfaceC41208ft5("opted_in")
    private final boolean optedIn;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public CommunicationOptInResponse() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ CommunicationOptInResponse copy$default(CommunicationOptInResponse communicationOptInResponse, String str, String str2, boolean z, DateTime dateTime, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communicationOptInResponse.f68212id;
        }
        if ((i & 2) != 0) {
            str2 = communicationOptInResponse.userId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = communicationOptInResponse.optedIn;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            dateTime = communicationOptInResponse.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            str3 = communicationOptInResponse.optInString;
        }
        return communicationOptInResponse.copy(str, str4, z2, dateTime2, str3);
    }

    public final String component1() {
        return this.f68212id;
    }

    public final String component2() {
        return this.userId;
    }

    public final boolean component3() {
        return this.optedIn;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.optInString;
    }

    public final CommunicationOptInResponse copy(String id, String userId, boolean z, DateTime createdAt, String optInString) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(optInString, "optInString");
        return new CommunicationOptInResponse(id, userId, z, createdAt, optInString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommunicationOptInResponse) {
            CommunicationOptInResponse communicationOptInResponse = (CommunicationOptInResponse) obj;
            return Intrinsics.areEqual(this.f68212id, communicationOptInResponse.f68212id) && Intrinsics.areEqual(this.userId, communicationOptInResponse.userId) && this.optedIn == communicationOptInResponse.optedIn && Intrinsics.areEqual(this.createdAt, communicationOptInResponse.createdAt) && Intrinsics.areEqual(this.optInString, communicationOptInResponse.optInString);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68212id;
    }

    public final String getOptInString() {
        return this.optInString;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f68212id.hashCode() * 31) + this.userId.hashCode()) * 31;
        boolean z = this.optedIn;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.createdAt.hashCode()) * 31) + this.optInString.hashCode();
    }

    public String toString() {
        String str = this.f68212id;
        String str2 = this.userId;
        boolean z = this.optedIn;
        DateTime dateTime = this.createdAt;
        String str3 = this.optInString;
        return "CommunicationOptInResponse(id=" + str + ", userId=" + str2 + ", optedIn=" + z + ", createdAt=" + dateTime + ", optInString=" + str3 + ")";
    }

    public CommunicationOptInResponse(String id, String userId, boolean z, DateTime createdAt, String optInString) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(optInString, "optInString");
        this.f68212id = id;
        this.userId = userId;
        this.optedIn = z;
        this.createdAt = createdAt;
        this.optInString = optInString;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CommunicationOptInResponse(String str, String str2, boolean z, DateTime dateTime, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r11, r1, r2, dateTime, (i & 16) != 0 ? "" : str3);
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
