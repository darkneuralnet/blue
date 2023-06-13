package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireBountyFlightSheetDetails;", "", "mapButtonOverrides", "", "Lco/bird/android/model/wire/WireBountyFlightSheetMapButtonOverrides;", "header", "Lco/bird/android/model/wire/WireBountyFlightSheetHeader;", "sections", "Lco/bird/android/model/wire/WireBountyFlightSheetSection;", "(Ljava/util/List;Lco/bird/android/model/wire/WireBountyFlightSheetHeader;Ljava/util/List;)V", "getHeader", "()Lco/bird/android/model/wire/WireBountyFlightSheetHeader;", "getMapButtonOverrides", "()Ljava/util/List;", "getSections", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBountyFlightSheetDetails {
    @JsonProperty("header")
    @InterfaceC41208ft5("header")
    private final WireBountyFlightSheetHeader header;
    @JsonProperty("map_button_overrides")
    @InterfaceC41208ft5("map_button_overrides")
    private final List<WireBountyFlightSheetMapButtonOverrides> mapButtonOverrides;
    @JsonProperty("sections")
    @InterfaceC41208ft5("sections")
    private final List<WireBountyFlightSheetSection> sections;

    public WireBountyFlightSheetDetails(List<WireBountyFlightSheetMapButtonOverrides> mapButtonOverrides, WireBountyFlightSheetHeader header, List<WireBountyFlightSheetSection> sections) {
        Intrinsics.checkNotNullParameter(mapButtonOverrides, "mapButtonOverrides");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.mapButtonOverrides = mapButtonOverrides;
        this.header = header;
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireBountyFlightSheetDetails copy$default(WireBountyFlightSheetDetails wireBountyFlightSheetDetails, List list, WireBountyFlightSheetHeader wireBountyFlightSheetHeader, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireBountyFlightSheetDetails.mapButtonOverrides;
        }
        if ((i & 2) != 0) {
            wireBountyFlightSheetHeader = wireBountyFlightSheetDetails.header;
        }
        if ((i & 4) != 0) {
            list2 = wireBountyFlightSheetDetails.sections;
        }
        return wireBountyFlightSheetDetails.copy(list, wireBountyFlightSheetHeader, list2);
    }

    public final List<WireBountyFlightSheetMapButtonOverrides> component1() {
        return this.mapButtonOverrides;
    }

    public final WireBountyFlightSheetHeader component2() {
        return this.header;
    }

    public final List<WireBountyFlightSheetSection> component3() {
        return this.sections;
    }

    public final WireBountyFlightSheetDetails copy(List<WireBountyFlightSheetMapButtonOverrides> mapButtonOverrides, WireBountyFlightSheetHeader header, List<WireBountyFlightSheetSection> sections) {
        Intrinsics.checkNotNullParameter(mapButtonOverrides, "mapButtonOverrides");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new WireBountyFlightSheetDetails(mapButtonOverrides, header, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBountyFlightSheetDetails) {
            WireBountyFlightSheetDetails wireBountyFlightSheetDetails = (WireBountyFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.mapButtonOverrides, wireBountyFlightSheetDetails.mapButtonOverrides) && Intrinsics.areEqual(this.header, wireBountyFlightSheetDetails.header) && Intrinsics.areEqual(this.sections, wireBountyFlightSheetDetails.sections);
        }
        return false;
    }

    public final WireBountyFlightSheetHeader getHeader() {
        return this.header;
    }

    public final List<WireBountyFlightSheetMapButtonOverrides> getMapButtonOverrides() {
        return this.mapButtonOverrides;
    }

    public final List<WireBountyFlightSheetSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return (((this.mapButtonOverrides.hashCode() * 31) + this.header.hashCode()) * 31) + this.sections.hashCode();
    }

    public String toString() {
        List<WireBountyFlightSheetMapButtonOverrides> list = this.mapButtonOverrides;
        WireBountyFlightSheetHeader wireBountyFlightSheetHeader = this.header;
        List<WireBountyFlightSheetSection> list2 = this.sections;
        return "WireBountyFlightSheetDetails(mapButtonOverrides=" + list + ", header=" + wireBountyFlightSheetHeader + ", sections=" + list2 + ")";
    }

    public /* synthetic */ WireBountyFlightSheetDetails(List list, WireBountyFlightSheetHeader wireBountyFlightSheetHeader, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, wireBountyFlightSheetHeader, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
