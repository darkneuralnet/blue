package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterCampaign;", "Landroid/os/Parcelable;", "display", "", "wirePriority", "Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;", "repairTypeIds", "", "(Ljava/lang/String;Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;Ljava/util/List;)V", "getDisplay", "()Ljava/lang/String;", "getRepairTypeIds", "()Ljava/util/List;", "getWirePriority", "()Lco/bird/android/model/wire/WireServiceCenterCampaignPriority;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireServiceCenterCampaign implements Parcelable {
    public static final Parcelable.Creator<WireServiceCenterCampaign> CREATOR = new Creator();
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("repair_type_ids")
    @InterfaceC41208ft5("repair_type_ids")
    private final List<String> repairTypeIds;
    @JsonProperty("wire_priority")
    @InterfaceC41208ft5("wire_priority")
    private final WireServiceCenterCampaignPriority wirePriority;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireServiceCenterCampaign> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterCampaign createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireServiceCenterCampaign(parcel.readString(), WireServiceCenterCampaignPriority.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireServiceCenterCampaign[] newArray(int i) {
            return new WireServiceCenterCampaign[i];
        }
    }

    public WireServiceCenterCampaign(String display, WireServiceCenterCampaignPriority wirePriority, List<String> repairTypeIds) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(wirePriority, "wirePriority");
        Intrinsics.checkNotNullParameter(repairTypeIds, "repairTypeIds");
        this.display = display;
        this.wirePriority = wirePriority;
        this.repairTypeIds = repairTypeIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireServiceCenterCampaign copy$default(WireServiceCenterCampaign wireServiceCenterCampaign, String str, WireServiceCenterCampaignPriority wireServiceCenterCampaignPriority, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireServiceCenterCampaign.display;
        }
        if ((i & 2) != 0) {
            wireServiceCenterCampaignPriority = wireServiceCenterCampaign.wirePriority;
        }
        if ((i & 4) != 0) {
            list = wireServiceCenterCampaign.repairTypeIds;
        }
        return wireServiceCenterCampaign.copy(str, wireServiceCenterCampaignPriority, list);
    }

    public final String component1() {
        return this.display;
    }

    public final WireServiceCenterCampaignPriority component2() {
        return this.wirePriority;
    }

    public final List<String> component3() {
        return this.repairTypeIds;
    }

    public final WireServiceCenterCampaign copy(String display, WireServiceCenterCampaignPriority wirePriority, List<String> repairTypeIds) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(wirePriority, "wirePriority");
        Intrinsics.checkNotNullParameter(repairTypeIds, "repairTypeIds");
        return new WireServiceCenterCampaign(display, wirePriority, repairTypeIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireServiceCenterCampaign) {
            WireServiceCenterCampaign wireServiceCenterCampaign = (WireServiceCenterCampaign) obj;
            return Intrinsics.areEqual(this.display, wireServiceCenterCampaign.display) && Intrinsics.areEqual(this.wirePriority, wireServiceCenterCampaign.wirePriority) && Intrinsics.areEqual(this.repairTypeIds, wireServiceCenterCampaign.repairTypeIds);
        }
        return false;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final List<String> getRepairTypeIds() {
        return this.repairTypeIds;
    }

    public final WireServiceCenterCampaignPriority getWirePriority() {
        return this.wirePriority;
    }

    public int hashCode() {
        return (((this.display.hashCode() * 31) + this.wirePriority.hashCode()) * 31) + this.repairTypeIds.hashCode();
    }

    public String toString() {
        String str = this.display;
        WireServiceCenterCampaignPriority wireServiceCenterCampaignPriority = this.wirePriority;
        List<String> list = this.repairTypeIds;
        return "WireServiceCenterCampaign(display=" + str + ", wirePriority=" + wireServiceCenterCampaignPriority + ", repairTypeIds=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.display);
        this.wirePriority.writeToParcel(out, i);
        out.writeStringList(this.repairTypeIds);
    }

    public /* synthetic */ WireServiceCenterCampaign(String str, WireServiceCenterCampaignPriority wireServiceCenterCampaignPriority, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, wireServiceCenterCampaignPriority, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
