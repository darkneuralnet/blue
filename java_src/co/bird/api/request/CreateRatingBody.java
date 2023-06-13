package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J@\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/request/CreateRatingBody;", "", "rideId", "", "rating", "", "feedback", "issues", "", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "getFeedback", "()Ljava/lang/String;", "getIssues", "()Ljava/util/List;", "getRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRideId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lco/bird/api/request/CreateRatingBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateRatingBody {
    @JsonProperty("feedback")
    @InterfaceC41208ft5("feedback")
    private final String feedback;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<String> issues;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final Double rating;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;

    public CreateRatingBody(String rideId, Double d, String str, List<String> issues) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.rideId = rideId;
        this.rating = d;
        this.feedback = str;
        this.issues = issues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateRatingBody copy$default(CreateRatingBody createRatingBody, String str, Double d, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createRatingBody.rideId;
        }
        if ((i & 2) != 0) {
            d = createRatingBody.rating;
        }
        if ((i & 4) != 0) {
            str2 = createRatingBody.feedback;
        }
        if ((i & 8) != 0) {
            list = createRatingBody.issues;
        }
        return createRatingBody.copy(str, d, str2, list);
    }

    public final String component1() {
        return this.rideId;
    }

    public final Double component2() {
        return this.rating;
    }

    public final String component3() {
        return this.feedback;
    }

    public final List<String> component4() {
        return this.issues;
    }

    public final CreateRatingBody copy(String rideId, Double d, String str, List<String> issues) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(issues, "issues");
        return new CreateRatingBody(rideId, d, str, issues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateRatingBody) {
            CreateRatingBody createRatingBody = (CreateRatingBody) obj;
            return Intrinsics.areEqual(this.rideId, createRatingBody.rideId) && Intrinsics.areEqual((Object) this.rating, (Object) createRatingBody.rating) && Intrinsics.areEqual(this.feedback, createRatingBody.feedback) && Intrinsics.areEqual(this.issues, createRatingBody.issues);
        }
        return false;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final Double getRating() {
        return this.rating;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        int hashCode = this.rideId.hashCode() * 31;
        Double d = this.rating;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.feedback;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.issues.hashCode();
    }

    public String toString() {
        String str = this.rideId;
        Double d = this.rating;
        String str2 = this.feedback;
        List<String> list = this.issues;
        return "CreateRatingBody(rideId=" + str + ", rating=" + d + ", feedback=" + str2 + ", issues=" + list + ")";
    }

    public /* synthetic */ CreateRatingBody(String str, Double d, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Double.valueOf(5.0d) : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
