package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BountyFlightSheetSectionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;", "", "type", "Lco/bird/android/model/constant/BountyFlightSheetSectionType;", Entry.TYPE_TEXT, "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;", "vehicleList", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;", "photos", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;", "(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;)V", "getPhotos", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;", "getText", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;", "getType", "()Lco/bird/android/model/constant/BountyFlightSheetSectionType;", "getVehicleList", "()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetSection {
    @JsonProperty("photos")
    @InterfaceC41208ft5("photos")
    private final BountyFlightSheetSectionPhotos photos;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final BountyFlightSheetSectionText text;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final BountyFlightSheetSectionType type;
    @JsonProperty("vehicle_list")
    @InterfaceC41208ft5("vehicle_list")
    private final BountyFlightSheetSectionVehicleList vehicleList;

    public BountyFlightSheetSection(BountyFlightSheetSectionType type, BountyFlightSheetSectionText bountyFlightSheetSectionText, BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList, BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.text = bountyFlightSheetSectionText;
        this.vehicleList = bountyFlightSheetSectionVehicleList;
        this.photos = bountyFlightSheetSectionPhotos;
    }

    public static /* synthetic */ BountyFlightSheetSection copy$default(BountyFlightSheetSection bountyFlightSheetSection, BountyFlightSheetSectionType bountyFlightSheetSectionType, BountyFlightSheetSectionText bountyFlightSheetSectionText, BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList, BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos, int i, Object obj) {
        if ((i & 1) != 0) {
            bountyFlightSheetSectionType = bountyFlightSheetSection.type;
        }
        if ((i & 2) != 0) {
            bountyFlightSheetSectionText = bountyFlightSheetSection.text;
        }
        if ((i & 4) != 0) {
            bountyFlightSheetSectionVehicleList = bountyFlightSheetSection.vehicleList;
        }
        if ((i & 8) != 0) {
            bountyFlightSheetSectionPhotos = bountyFlightSheetSection.photos;
        }
        return bountyFlightSheetSection.copy(bountyFlightSheetSectionType, bountyFlightSheetSectionText, bountyFlightSheetSectionVehicleList, bountyFlightSheetSectionPhotos);
    }

    public final BountyFlightSheetSectionType component1() {
        return this.type;
    }

    public final BountyFlightSheetSectionText component2() {
        return this.text;
    }

    public final BountyFlightSheetSectionVehicleList component3() {
        return this.vehicleList;
    }

    public final BountyFlightSheetSectionPhotos component4() {
        return this.photos;
    }

    public final BountyFlightSheetSection copy(BountyFlightSheetSectionType type, BountyFlightSheetSectionText bountyFlightSheetSectionText, BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList, BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new BountyFlightSheetSection(type, bountyFlightSheetSectionText, bountyFlightSheetSectionVehicleList, bountyFlightSheetSectionPhotos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetSection) {
            BountyFlightSheetSection bountyFlightSheetSection = (BountyFlightSheetSection) obj;
            return this.type == bountyFlightSheetSection.type && Intrinsics.areEqual(this.text, bountyFlightSheetSection.text) && Intrinsics.areEqual(this.vehicleList, bountyFlightSheetSection.vehicleList) && Intrinsics.areEqual(this.photos, bountyFlightSheetSection.photos);
        }
        return false;
    }

    public final BountyFlightSheetSectionPhotos getPhotos() {
        return this.photos;
    }

    public final BountyFlightSheetSectionText getText() {
        return this.text;
    }

    public final BountyFlightSheetSectionType getType() {
        return this.type;
    }

    public final BountyFlightSheetSectionVehicleList getVehicleList() {
        return this.vehicleList;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        BountyFlightSheetSectionText bountyFlightSheetSectionText = this.text;
        int hashCode2 = (hashCode + (bountyFlightSheetSectionText == null ? 0 : bountyFlightSheetSectionText.hashCode())) * 31;
        BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList = this.vehicleList;
        int hashCode3 = (hashCode2 + (bountyFlightSheetSectionVehicleList == null ? 0 : bountyFlightSheetSectionVehicleList.hashCode())) * 31;
        BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos = this.photos;
        return hashCode3 + (bountyFlightSheetSectionPhotos != null ? bountyFlightSheetSectionPhotos.hashCode() : 0);
    }

    public String toString() {
        BountyFlightSheetSectionType bountyFlightSheetSectionType = this.type;
        BountyFlightSheetSectionText bountyFlightSheetSectionText = this.text;
        BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList = this.vehicleList;
        BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos = this.photos;
        return "BountyFlightSheetSection(type=" + bountyFlightSheetSectionType + ", text=" + bountyFlightSheetSectionText + ", vehicleList=" + bountyFlightSheetSectionVehicleList + ", photos=" + bountyFlightSheetSectionPhotos + ")";
    }

    public /* synthetic */ BountyFlightSheetSection(BountyFlightSheetSectionType bountyFlightSheetSectionType, BountyFlightSheetSectionText bountyFlightSheetSectionText, BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList, BountyFlightSheetSectionPhotos bountyFlightSheetSectionPhotos, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bountyFlightSheetSectionType, (i & 2) != 0 ? null : bountyFlightSheetSectionText, (i & 4) != 0 ? null : bountyFlightSheetSectionVehicleList, (i & 8) != 0 ? null : bountyFlightSheetSectionPhotos);
    }
}
