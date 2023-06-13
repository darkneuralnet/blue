package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/ReservationFeedbackBody;", "", "reservationId", "", "issues", "", "feedback", "photoUrls", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getFeedback", "()Ljava/lang/String;", "getIssues", "()Ljava/util/List;", "getPhotoUrls", "getReservationId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationFeedbackBody {
    @JsonProperty("feedback")
    @InterfaceC41208ft5("feedback")
    private final String feedback;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<String> issues;
    @JsonProperty("photo_urls")
    @InterfaceC41208ft5("photo_urls")
    private final List<String> photoUrls;
    @JsonProperty("reservation_id")
    @InterfaceC41208ft5("reservation_id")
    private final String reservationId;

    public ReservationFeedbackBody(String reservationId, List<String> list, String str, List<String> list2) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        this.reservationId = reservationId;
        this.issues = list;
        this.feedback = str;
        this.photoUrls = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReservationFeedbackBody copy$default(ReservationFeedbackBody reservationFeedbackBody, String str, List list, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reservationFeedbackBody.reservationId;
        }
        if ((i & 2) != 0) {
            list = reservationFeedbackBody.issues;
        }
        if ((i & 4) != 0) {
            str2 = reservationFeedbackBody.feedback;
        }
        if ((i & 8) != 0) {
            list2 = reservationFeedbackBody.photoUrls;
        }
        return reservationFeedbackBody.copy(str, list, str2, list2);
    }

    public final String component1() {
        return this.reservationId;
    }

    public final List<String> component2() {
        return this.issues;
    }

    public final String component3() {
        return this.feedback;
    }

    public final List<String> component4() {
        return this.photoUrls;
    }

    public final ReservationFeedbackBody copy(String reservationId, List<String> list, String str, List<String> list2) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        return new ReservationFeedbackBody(reservationId, list, str, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReservationFeedbackBody) {
            ReservationFeedbackBody reservationFeedbackBody = (ReservationFeedbackBody) obj;
            return Intrinsics.areEqual(this.reservationId, reservationFeedbackBody.reservationId) && Intrinsics.areEqual(this.issues, reservationFeedbackBody.issues) && Intrinsics.areEqual(this.feedback, reservationFeedbackBody.feedback) && Intrinsics.areEqual(this.photoUrls, reservationFeedbackBody.photoUrls);
        }
        return false;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final List<String> getPhotoUrls() {
        return this.photoUrls;
    }

    public final String getReservationId() {
        return this.reservationId;
    }

    public int hashCode() {
        int hashCode = this.reservationId.hashCode() * 31;
        List<String> list = this.issues;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.feedback;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.photoUrls;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.reservationId;
        List<String> list = this.issues;
        String str2 = this.feedback;
        List<String> list2 = this.photoUrls;
        return "ReservationFeedbackBody(reservationId=" + str + ", issues=" + list + ", feedback=" + str2 + ", photoUrls=" + list2 + ")";
    }
}
