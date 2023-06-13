package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006,"}, m28432d2 = {"Lco/bird/api/request/OperatorMapRequest;", "", "latitude", "", "longitude", "radius", "kind", "Lco/bird/android/model/constant/OperatorMapKind;", "filters", "Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "bypassFilterBirdIds", "", "", "bypassFilterBountyIds", "viewport", "Lco/bird/android/model/wire/WireLocation;", "(DDDLco/bird/android/model/constant/OperatorMapKind;Lco/bird/android/model/wire/WireOperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBypassFilterBirdIds", "()Ljava/util/List;", "getBypassFilterBountyIds", "getFilters", "()Lco/bird/android/model/wire/WireOperatorMapFilterBundle;", "getKind", "()Lco/bird/android/model/constant/OperatorMapKind;", "getLatitude", "()D", "getLongitude", "getRadius", "getViewport", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapRequest {
    @JsonProperty("bypass_filter_bird_ids")
    @InterfaceC41208ft5("bypass_filter_bird_ids")
    private final List<String> bypassFilterBirdIds;
    @JsonProperty("bypass_filter_bounty_ids")
    @InterfaceC41208ft5("bypass_filter_bounty_ids")
    private final List<String> bypassFilterBountyIds;
    @JsonProperty("filters")
    @InterfaceC41208ft5("filters")
    private final WireOperatorMapFilterBundle filters;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final OperatorMapKind kind;
    @JsonProperty("latitude")
    @InterfaceC41208ft5("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    @InterfaceC41208ft5("longitude")
    private final double longitude;
    @JsonProperty("radius")
    @InterfaceC41208ft5("radius")
    private final double radius;
    @JsonProperty("viewport")
    @InterfaceC41208ft5("viewport")
    private final List<WireLocation> viewport;

    public OperatorMapRequest(double d, double d2, double d3, OperatorMapKind kind, WireOperatorMapFilterBundle filters, List<String> bypassFilterBirdIds, List<String> bypassFilterBountyIds, List<WireLocation> viewport) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(bypassFilterBirdIds, "bypassFilterBirdIds");
        Intrinsics.checkNotNullParameter(bypassFilterBountyIds, "bypassFilterBountyIds");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.latitude = d;
        this.longitude = d2;
        this.radius = d3;
        this.kind = kind;
        this.filters = filters;
        this.bypassFilterBirdIds = bypassFilterBirdIds;
        this.bypassFilterBountyIds = bypassFilterBountyIds;
        this.viewport = viewport;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final double component3() {
        return this.radius;
    }

    public final OperatorMapKind component4() {
        return this.kind;
    }

    public final WireOperatorMapFilterBundle component5() {
        return this.filters;
    }

    public final List<String> component6() {
        return this.bypassFilterBirdIds;
    }

    public final List<String> component7() {
        return this.bypassFilterBountyIds;
    }

    public final List<WireLocation> component8() {
        return this.viewport;
    }

    public final OperatorMapRequest copy(double d, double d2, double d3, OperatorMapKind kind, WireOperatorMapFilterBundle filters, List<String> bypassFilterBirdIds, List<String> bypassFilterBountyIds, List<WireLocation> viewport) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(bypassFilterBirdIds, "bypassFilterBirdIds");
        Intrinsics.checkNotNullParameter(bypassFilterBountyIds, "bypassFilterBountyIds");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        return new OperatorMapRequest(d, d2, d3, kind, filters, bypassFilterBirdIds, bypassFilterBountyIds, viewport);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapRequest) {
            OperatorMapRequest operatorMapRequest = (OperatorMapRequest) obj;
            return Double.compare(this.latitude, operatorMapRequest.latitude) == 0 && Double.compare(this.longitude, operatorMapRequest.longitude) == 0 && Double.compare(this.radius, operatorMapRequest.radius) == 0 && this.kind == operatorMapRequest.kind && Intrinsics.areEqual(this.filters, operatorMapRequest.filters) && Intrinsics.areEqual(this.bypassFilterBirdIds, operatorMapRequest.bypassFilterBirdIds) && Intrinsics.areEqual(this.bypassFilterBountyIds, operatorMapRequest.bypassFilterBountyIds) && Intrinsics.areEqual(this.viewport, operatorMapRequest.viewport);
        }
        return false;
    }

    public final List<String> getBypassFilterBirdIds() {
        return this.bypassFilterBirdIds;
    }

    public final List<String> getBypassFilterBountyIds() {
        return this.bypassFilterBountyIds;
    }

    public final WireOperatorMapFilterBundle getFilters() {
        return this.filters;
    }

    public final OperatorMapKind getKind() {
        return this.kind;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getRadius() {
        return this.radius;
    }

    public final List<WireLocation> getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.radius)) * 31) + this.kind.hashCode()) * 31) + this.filters.hashCode()) * 31) + this.bypassFilterBirdIds.hashCode()) * 31) + this.bypassFilterBountyIds.hashCode()) * 31) + this.viewport.hashCode();
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        double d3 = this.radius;
        OperatorMapKind operatorMapKind = this.kind;
        WireOperatorMapFilterBundle wireOperatorMapFilterBundle = this.filters;
        List<String> list = this.bypassFilterBirdIds;
        List<String> list2 = this.bypassFilterBountyIds;
        List<WireLocation> list3 = this.viewport;
        return "OperatorMapRequest(latitude=" + d + ", longitude=" + d2 + ", radius=" + d3 + ", kind=" + operatorMapKind + ", filters=" + wireOperatorMapFilterBundle + ", bypassFilterBirdIds=" + list + ", bypassFilterBountyIds=" + list2 + ", viewport=" + list3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OperatorMapRequest(double d, double d2, double d3, OperatorMapKind operatorMapKind, WireOperatorMapFilterBundle wireOperatorMapFilterBundle, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, operatorMapKind, wireOperatorMapFilterBundle, r10, r11, list3);
        List list4;
        List list5;
        List emptyList;
        List emptyList2;
        if ((i & 32) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList2;
        } else {
            list4 = list;
        }
        if ((i & 64) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list5 = emptyList;
        } else {
            list5 = list2;
        }
    }
}
