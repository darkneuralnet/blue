package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetRideRating;", "", "label", "", "rating", "", "feedback", "(Ljava/lang/String;DLjava/lang/String;)V", "getFeedback", "()Ljava/lang/String;", "getLabel", "getRating", "()D", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetRideRating {
    @JsonProperty("feedback")
    @InterfaceC41208ft5("feedback")
    private final String feedback;
    @JsonProperty("label")
    @InterfaceC41208ft5("label")
    private final String label;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final double rating;

    public WireFlightSheetRideRating() {
        this(null, 0.0d, null, 7, null);
    }

    public static /* synthetic */ WireFlightSheetRideRating copy$default(WireFlightSheetRideRating wireFlightSheetRideRating, String str, double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFlightSheetRideRating.label;
        }
        if ((i & 2) != 0) {
            d = wireFlightSheetRideRating.rating;
        }
        if ((i & 4) != 0) {
            str2 = wireFlightSheetRideRating.feedback;
        }
        return wireFlightSheetRideRating.copy(str, d, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final double component2() {
        return this.rating;
    }

    public final String component3() {
        return this.feedback;
    }

    public final WireFlightSheetRideRating copy(String label, double d, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new WireFlightSheetRideRating(label, d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFlightSheetRideRating) {
            WireFlightSheetRideRating wireFlightSheetRideRating = (WireFlightSheetRideRating) obj;
            return Intrinsics.areEqual(this.label, wireFlightSheetRideRating.label) && Double.compare(this.rating, wireFlightSheetRideRating.rating) == 0 && Intrinsics.areEqual(this.feedback, wireFlightSheetRideRating.feedback);
        }
        return false;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getRating() {
        return this.rating;
    }

    public int hashCode() {
        int hashCode = ((this.label.hashCode() * 31) + Double.hashCode(this.rating)) * 31;
        String str = this.feedback;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.label;
        double d = this.rating;
        String str2 = this.feedback;
        return "WireFlightSheetRideRating(label=" + str + ", rating=" + d + ", feedback=" + str2 + ")";
    }

    public WireFlightSheetRideRating(String label, double d, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.rating = d;
        this.feedback = str;
    }

    public /* synthetic */ WireFlightSheetRideRating(String str, double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? null : str2);
    }
}
