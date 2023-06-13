package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetDetailFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/WireFormattedFlightSheetDetail;", "", "title", "", "detail", "format", "Lco/bird/android/model/constant/FlightSheetDetailFormat;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetDetailFormat;)V", "getDetail", "()Ljava/lang/String;", "getFormat", "()Lco/bird/android/model/constant/FlightSheetDetailFormat;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFormattedFlightSheetDetail {
    @JsonProperty("detail")
    @InterfaceC41208ft5("detail")
    private final String detail;
    @JsonProperty("format")
    @InterfaceC41208ft5("format")
    private final FlightSheetDetailFormat format;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireFormattedFlightSheetDetail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireFormattedFlightSheetDetail copy$default(WireFormattedFlightSheetDetail wireFormattedFlightSheetDetail, String str, String str2, FlightSheetDetailFormat flightSheetDetailFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireFormattedFlightSheetDetail.title;
        }
        if ((i & 2) != 0) {
            str2 = wireFormattedFlightSheetDetail.detail;
        }
        if ((i & 4) != 0) {
            flightSheetDetailFormat = wireFormattedFlightSheetDetail.format;
        }
        return wireFormattedFlightSheetDetail.copy(str, str2, flightSheetDetailFormat);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.detail;
    }

    public final FlightSheetDetailFormat component3() {
        return this.format;
    }

    public final WireFormattedFlightSheetDetail copy(String title, String detail, FlightSheetDetailFormat format) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(format, "format");
        return new WireFormattedFlightSheetDetail(title, detail, format);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFormattedFlightSheetDetail) {
            WireFormattedFlightSheetDetail wireFormattedFlightSheetDetail = (WireFormattedFlightSheetDetail) obj;
            return Intrinsics.areEqual(this.title, wireFormattedFlightSheetDetail.title) && Intrinsics.areEqual(this.detail, wireFormattedFlightSheetDetail.detail) && this.format == wireFormattedFlightSheetDetail.format;
        }
        return false;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final FlightSheetDetailFormat getFormat() {
        return this.format;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.detail.hashCode()) * 31) + this.format.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.detail;
        FlightSheetDetailFormat flightSheetDetailFormat = this.format;
        return "WireFormattedFlightSheetDetail(title=" + str + ", detail=" + str2 + ", format=" + flightSheetDetailFormat + ")";
    }

    public WireFormattedFlightSheetDetail(String title, String detail, FlightSheetDetailFormat format) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(format, "format");
        this.title = title;
        this.detail = detail;
        this.format = format;
    }

    public /* synthetic */ WireFormattedFlightSheetDetail(String str, String str2, FlightSheetDetailFormat flightSheetDetailFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? FlightSheetDetailFormat.UNKNOWN : flightSheetDetailFormat);
    }
}
