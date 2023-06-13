package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, m28432d2 = {"Lco/bird/api/response/OverviewPolyLine;", "", "points", "", "(Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "setPoints", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OverviewPolyLine {
    @JsonProperty("points")
    @InterfaceC41208ft5("points")
    private String points;

    public OverviewPolyLine() {
        this(null, 1, null);
    }

    public static /* synthetic */ OverviewPolyLine copy$default(OverviewPolyLine overviewPolyLine, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = overviewPolyLine.points;
        }
        return overviewPolyLine.copy(str);
    }

    public final String component1() {
        return this.points;
    }

    public final OverviewPolyLine copy(String str) {
        return new OverviewPolyLine(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverviewPolyLine) && Intrinsics.areEqual(this.points, ((OverviewPolyLine) obj).points);
    }

    public final String getPoints() {
        return this.points;
    }

    public int hashCode() {
        String str = this.points;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setPoints(String str) {
        this.points = str;
    }

    public String toString() {
        String str = this.points;
        return "OverviewPolyLine(points=" + str + ")";
    }

    public OverviewPolyLine(String str) {
        this.points = str;
    }

    public /* synthetic */ OverviewPolyLine(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
