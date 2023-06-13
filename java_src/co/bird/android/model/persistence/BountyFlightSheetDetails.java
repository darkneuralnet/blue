package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetHeader;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "", "bountyId", "", "mapButtonOverrides", "", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetMapButtonOverrides;", "header", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;", "sections", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;", "(Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;Ljava/util/List;)V", "getBountyId", "()Ljava/lang/String;", "getHeader", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;", "getMapButtonOverrides", "()Ljava/util/List;", "getSections", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetDetails {
    private final String bountyId;
    private final BountyFlightSheetHeader header;
    private final List<BountyFlightSheetMapButtonOverrides> mapButtonOverrides;
    private final List<BountyFlightSheetSection> sections;

    public BountyFlightSheetDetails(String bountyId, List<BountyFlightSheetMapButtonOverrides> mapButtonOverrides, BountyFlightSheetHeader header, List<BountyFlightSheetSection> sections) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        Intrinsics.checkNotNullParameter(mapButtonOverrides, "mapButtonOverrides");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.bountyId = bountyId;
        this.mapButtonOverrides = mapButtonOverrides;
        this.header = header;
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BountyFlightSheetDetails copy$default(BountyFlightSheetDetails bountyFlightSheetDetails, String str, List list, BountyFlightSheetHeader bountyFlightSheetHeader, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyFlightSheetDetails.bountyId;
        }
        if ((i & 2) != 0) {
            list = bountyFlightSheetDetails.mapButtonOverrides;
        }
        if ((i & 4) != 0) {
            bountyFlightSheetHeader = bountyFlightSheetDetails.header;
        }
        if ((i & 8) != 0) {
            list2 = bountyFlightSheetDetails.sections;
        }
        return bountyFlightSheetDetails.copy(str, list, bountyFlightSheetHeader, list2);
    }

    public final String component1() {
        return this.bountyId;
    }

    public final List<BountyFlightSheetMapButtonOverrides> component2() {
        return this.mapButtonOverrides;
    }

    public final BountyFlightSheetHeader component3() {
        return this.header;
    }

    public final List<BountyFlightSheetSection> component4() {
        return this.sections;
    }

    public final BountyFlightSheetDetails copy(String bountyId, List<BountyFlightSheetMapButtonOverrides> mapButtonOverrides, BountyFlightSheetHeader header, List<BountyFlightSheetSection> sections) {
        Intrinsics.checkNotNullParameter(bountyId, "bountyId");
        Intrinsics.checkNotNullParameter(mapButtonOverrides, "mapButtonOverrides");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new BountyFlightSheetDetails(bountyId, mapButtonOverrides, header, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetDetails) {
            BountyFlightSheetDetails bountyFlightSheetDetails = (BountyFlightSheetDetails) obj;
            return Intrinsics.areEqual(this.bountyId, bountyFlightSheetDetails.bountyId) && Intrinsics.areEqual(this.mapButtonOverrides, bountyFlightSheetDetails.mapButtonOverrides) && Intrinsics.areEqual(this.header, bountyFlightSheetDetails.header) && Intrinsics.areEqual(this.sections, bountyFlightSheetDetails.sections);
        }
        return false;
    }

    public final String getBountyId() {
        return this.bountyId;
    }

    public final BountyFlightSheetHeader getHeader() {
        return this.header;
    }

    public final List<BountyFlightSheetMapButtonOverrides> getMapButtonOverrides() {
        return this.mapButtonOverrides;
    }

    public final List<BountyFlightSheetSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return (((((this.bountyId.hashCode() * 31) + this.mapButtonOverrides.hashCode()) * 31) + this.header.hashCode()) * 31) + this.sections.hashCode();
    }

    public String toString() {
        String str = this.bountyId;
        List<BountyFlightSheetMapButtonOverrides> list = this.mapButtonOverrides;
        BountyFlightSheetHeader bountyFlightSheetHeader = this.header;
        List<BountyFlightSheetSection> list2 = this.sections;
        return "BountyFlightSheetDetails(bountyId=" + str + ", mapButtonOverrides=" + list + ", header=" + bountyFlightSheetHeader + ", sections=" + list2 + ")";
    }

    public /* synthetic */ BountyFlightSheetDetails(String str, List list, BountyFlightSheetHeader bountyFlightSheetHeader, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, bountyFlightSheetHeader, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
