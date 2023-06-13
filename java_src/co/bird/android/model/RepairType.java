package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, m28432d2 = {"Lco/bird/android/model/RepairType;", "Landroid/os/Parcelable;", "id", "", "issueTypeId", "display", "description", "requireNotes", "", "repairScopes", "", "Lco/bird/android/model/RepairScope;", "assetId", "partKind", "Lco/bird/android/model/constant/PartKind;", "idToolDisplay", "notes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getDescription", "getDisplay", "getId", "getIdToolDisplay", "getIssueTypeId", "getNotes", "getPartKind", "()Lco/bird/android/model/constant/PartKind;", "getRepairScopes", "()Ljava/util/List;", "getRequireNotes", "()Z", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairType implements Parcelable {
    public static final Parcelable.Creator<RepairType> CREATOR = new Creator();
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66624id;
    @JsonProperty("id_tool_display")
    @InterfaceC41208ft5("id_tool_display")
    private final String idToolDisplay;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    private final transient String notes;
    @JsonProperty("part_kind")
    @InterfaceC41208ft5("part_kind")
    private final PartKind partKind;
    @JsonProperty("scopes")
    @InterfaceC41208ft5("scopes")
    private final List<RepairScope> repairScopes;
    @JsonProperty("require_notes")
    @InterfaceC41208ft5("require_notes")
    private final boolean requireNotes;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RepairType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairType createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(RepairScope.valueOf(parcel.readString()));
                }
            }
            return new RepairType(readString, readString2, readString3, readString4, z, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : PartKind.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairType[] newArray(int i) {
            return new RepairType[i];
        }
    }

    public RepairType() {
        this(null, null, null, null, false, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final String component1() {
        return this.f66624id;
    }

    public final String component10() {
        return this.notes;
    }

    public final String component2() {
        return this.issueTypeId;
    }

    public final String component3() {
        return this.display;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.requireNotes;
    }

    public final List<RepairScope> component6() {
        return this.repairScopes;
    }

    public final String component7() {
        return this.assetId;
    }

    public final PartKind component8() {
        return this.partKind;
    }

    public final String component9() {
        return this.idToolDisplay;
    }

    public final RepairType copy(String id, String issueTypeId, String str, String str2, boolean z, List<? extends RepairScope> list, String str3, PartKind partKind, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        return new RepairType(id, issueTypeId, str, str2, z, list, str3, partKind, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairType) {
            RepairType repairType = (RepairType) obj;
            return Intrinsics.areEqual(this.f66624id, repairType.f66624id) && Intrinsics.areEqual(this.issueTypeId, repairType.issueTypeId) && Intrinsics.areEqual(this.display, repairType.display) && Intrinsics.areEqual(this.description, repairType.description) && this.requireNotes == repairType.requireNotes && Intrinsics.areEqual(this.repairScopes, repairType.repairScopes) && Intrinsics.areEqual(this.assetId, repairType.assetId) && this.partKind == repairType.partKind && Intrinsics.areEqual(this.idToolDisplay, repairType.idToolDisplay) && Intrinsics.areEqual(this.notes, repairType.notes);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66624id;
    }

    public final String getIdToolDisplay() {
        return this.idToolDisplay;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final PartKind getPartKind() {
        return this.partKind;
    }

    public final List<RepairScope> getRepairScopes() {
        return this.repairScopes;
    }

    public final boolean getRequireNotes() {
        return this.requireNotes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66624id.hashCode() * 31) + this.issueTypeId.hashCode()) * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.requireNotes;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        List<RepairScope> list = this.repairScopes;
        int hashCode4 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.assetId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PartKind partKind = this.partKind;
        int hashCode6 = (hashCode5 + (partKind == null ? 0 : partKind.hashCode())) * 31;
        String str4 = this.idToolDisplay;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.notes;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66624id;
        String str2 = this.issueTypeId;
        String str3 = this.display;
        String str4 = this.description;
        boolean z = this.requireNotes;
        List<RepairScope> list = this.repairScopes;
        String str5 = this.assetId;
        PartKind partKind = this.partKind;
        String str6 = this.idToolDisplay;
        String str7 = this.notes;
        return "RepairType(id=" + str + ", issueTypeId=" + str2 + ", display=" + str3 + ", description=" + str4 + ", requireNotes=" + z + ", repairScopes=" + list + ", assetId=" + str5 + ", partKind=" + partKind + ", idToolDisplay=" + str6 + ", notes=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66624id);
        out.writeString(this.issueTypeId);
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeInt(this.requireNotes ? 1 : 0);
        List<RepairScope> list = this.repairScopes;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (RepairScope repairScope : list) {
                out.writeString(repairScope.name());
            }
        }
        out.writeString(this.assetId);
        PartKind partKind = this.partKind;
        if (partKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(partKind.name());
        }
        out.writeString(this.idToolDisplay);
        out.writeString(this.notes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepairType(String id, String issueTypeId, String str, String str2, boolean z, List<? extends RepairScope> list, String str3, PartKind partKind, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        this.f66624id = id;
        this.issueTypeId = issueTypeId;
        this.display = str;
        this.description = str2;
        this.requireNotes = z;
        this.repairScopes = list;
        this.assetId = str3;
        this.partKind = partKind;
        this.idToolDisplay = str4;
        this.notes = str5;
    }

    public /* synthetic */ RepairType(String str, String str2, String str3, String str4, boolean z, List list, String str5, PartKind partKind, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : partKind, (i & 256) != 0 ? null : str6, (i & 512) == 0 ? str7 : null);
    }
}
