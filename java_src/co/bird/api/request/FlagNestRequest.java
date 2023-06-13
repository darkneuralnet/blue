package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/request/FlagNestRequest;", "", "nestId", "", "reason", "comment", "requestedNestSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getComment", "()Ljava/lang/String;", "getNestId", "getReason", "getRequestedNestSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/api/request/FlagNestRequest;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlagNestRequest {
    @JsonProperty("comment")
    @InterfaceC41208ft5("comment")
    private final String comment;
    @JsonProperty("nest_id")
    @InterfaceC41208ft5("nest_id")
    private final String nestId;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;
    @JsonProperty("requested_nest_size")
    @InterfaceC41208ft5("requested_nest_size")
    private final Integer requestedNestSize;

    public FlagNestRequest(String nestId, String reason, String str, Integer num) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.nestId = nestId;
        this.reason = reason;
        this.comment = str;
        this.requestedNestSize = num;
    }

    public static /* synthetic */ FlagNestRequest copy$default(FlagNestRequest flagNestRequest, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flagNestRequest.nestId;
        }
        if ((i & 2) != 0) {
            str2 = flagNestRequest.reason;
        }
        if ((i & 4) != 0) {
            str3 = flagNestRequest.comment;
        }
        if ((i & 8) != 0) {
            num = flagNestRequest.requestedNestSize;
        }
        return flagNestRequest.copy(str, str2, str3, num);
    }

    public final String component1() {
        return this.nestId;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.comment;
    }

    public final Integer component4() {
        return this.requestedNestSize;
    }

    public final FlagNestRequest copy(String nestId, String reason, String str, Integer num) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new FlagNestRequest(nestId, reason, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagNestRequest) {
            FlagNestRequest flagNestRequest = (FlagNestRequest) obj;
            return Intrinsics.areEqual(this.nestId, flagNestRequest.nestId) && Intrinsics.areEqual(this.reason, flagNestRequest.reason) && Intrinsics.areEqual(this.comment, flagNestRequest.comment) && Intrinsics.areEqual(this.requestedNestSize, flagNestRequest.requestedNestSize);
        }
        return false;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getNestId() {
        return this.nestId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Integer getRequestedNestSize() {
        return this.requestedNestSize;
    }

    public int hashCode() {
        int hashCode = ((this.nestId.hashCode() * 31) + this.reason.hashCode()) * 31;
        String str = this.comment;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.requestedNestSize;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.nestId;
        String str2 = this.reason;
        String str3 = this.comment;
        Integer num = this.requestedNestSize;
        return "FlagNestRequest(nestId=" + str + ", reason=" + str2 + ", comment=" + str3 + ", requestedNestSize=" + num + ")";
    }
}
