package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/DropScoreResponse;", "", "score", "", "days", "", "(Ljava/lang/Float;I)V", "getDays", "()I", "getScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/Float;I)Lco/bird/api/response/DropScoreResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropScoreResponse {
    @JsonProperty("days")
    @InterfaceC41208ft5("days")
    private final int days;
    @JsonProperty("score")
    @InterfaceC41208ft5("score")
    private final Float score;

    public DropScoreResponse() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ DropScoreResponse copy$default(DropScoreResponse dropScoreResponse, Float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = dropScoreResponse.score;
        }
        if ((i2 & 2) != 0) {
            i = dropScoreResponse.days;
        }
        return dropScoreResponse.copy(f, i);
    }

    public final Float component1() {
        return this.score;
    }

    public final int component2() {
        return this.days;
    }

    public final DropScoreResponse copy(Float f, int i) {
        return new DropScoreResponse(f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropScoreResponse) {
            DropScoreResponse dropScoreResponse = (DropScoreResponse) obj;
            return Intrinsics.areEqual((Object) this.score, (Object) dropScoreResponse.score) && this.days == dropScoreResponse.days;
        }
        return false;
    }

    public final int getDays() {
        return this.days;
    }

    public final Float getScore() {
        return this.score;
    }

    public int hashCode() {
        Float f = this.score;
        return ((f == null ? 0 : f.hashCode()) * 31) + Integer.hashCode(this.days);
    }

    public String toString() {
        Float f = this.score;
        int i = this.days;
        return "DropScoreResponse(score=" + f + ", days=" + i + ")";
    }

    public DropScoreResponse(Float f, int i) {
        this.score = f;
        this.days = i;
    }

    public /* synthetic */ DropScoreResponse(Float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : f, (i2 & 2) != 0 ? 0 : i);
    }
}
