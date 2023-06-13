package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireQuickLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m28432d2 = {"Lco/bird/android/model/RepairIssue;", "Landroid/os/Parcelable;", "id", "", "display", "completed", "", "selected", "repairs", "", "Lco/bird/android/model/Repair;", "nonRepairs", "Lco/bird/android/model/NonRepair;", "trainingGuide", "Lco/bird/android/model/wire/WireQuickLink;", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireQuickLink;)V", "getCompleted", "()Z", "getDisplay", "()Ljava/lang/String;", "getId", "getNonRepairs", "()Ljava/util/List;", "getRepairs", "getSelected", "getTrainingGuide", "()Lco/bird/android/model/wire/WireQuickLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairIssue implements Parcelable {
    public static final Parcelable.Creator<RepairIssue> CREATOR = new Creator();
    @JsonProperty("completed")
    @InterfaceC41208ft5("completed")
    private final boolean completed;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66623id;
    @JsonProperty("non_repairs")
    @InterfaceC41208ft5("non_repairs")
    private final List<NonRepair> nonRepairs;
    @JsonProperty("repairs")
    @InterfaceC41208ft5("repairs")
    private final List<Repair> repairs;
    @JsonProperty("selected")
    @InterfaceC41208ft5("selected")
    private final boolean selected;
    @JsonProperty("training_guide")
    @InterfaceC41208ft5("training_guide")
    private final WireQuickLink trainingGuide;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RepairIssue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairIssue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Repair.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(NonRepair.CREATOR.createFromParcel(parcel));
            }
            return new RepairIssue(readString, readString2, z, z2, arrayList, arrayList2, (WireQuickLink) parcel.readParcelable(RepairIssue.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairIssue[] newArray(int i) {
            return new RepairIssue[i];
        }
    }

    public RepairIssue() {
        this(null, null, false, false, null, null, null, 127, null);
    }

    public static /* synthetic */ RepairIssue copy$default(RepairIssue repairIssue, String str, String str2, boolean z, boolean z2, List list, List list2, WireQuickLink wireQuickLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repairIssue.f66623id;
        }
        if ((i & 2) != 0) {
            str2 = repairIssue.display;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = repairIssue.completed;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = repairIssue.selected;
        }
        boolean z4 = z2;
        List<Repair> list3 = list;
        if ((i & 16) != 0) {
            list3 = repairIssue.repairs;
        }
        List list4 = list3;
        List<NonRepair> list5 = list2;
        if ((i & 32) != 0) {
            list5 = repairIssue.nonRepairs;
        }
        List list6 = list5;
        if ((i & 64) != 0) {
            wireQuickLink = repairIssue.trainingGuide;
        }
        return repairIssue.copy(str, str3, z3, z4, list4, list6, wireQuickLink);
    }

    public final String component1() {
        return this.f66623id;
    }

    public final String component2() {
        return this.display;
    }

    public final boolean component3() {
        return this.completed;
    }

    public final boolean component4() {
        return this.selected;
    }

    public final List<Repair> component5() {
        return this.repairs;
    }

    public final List<NonRepair> component6() {
        return this.nonRepairs;
    }

    public final WireQuickLink component7() {
        return this.trainingGuide;
    }

    public final RepairIssue copy(String id, String str, boolean z, boolean z2, List<Repair> repairs, List<NonRepair> nonRepairs, WireQuickLink wireQuickLink) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Intrinsics.checkNotNullParameter(nonRepairs, "nonRepairs");
        return new RepairIssue(id, str, z, z2, repairs, nonRepairs, wireQuickLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairIssue) {
            RepairIssue repairIssue = (RepairIssue) obj;
            return Intrinsics.areEqual(this.f66623id, repairIssue.f66623id) && Intrinsics.areEqual(this.display, repairIssue.display) && this.completed == repairIssue.completed && this.selected == repairIssue.selected && Intrinsics.areEqual(this.repairs, repairIssue.repairs) && Intrinsics.areEqual(this.nonRepairs, repairIssue.nonRepairs) && Intrinsics.areEqual(this.trainingGuide, repairIssue.trainingGuide);
        }
        return false;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66623id;
    }

    public final List<NonRepair> getNonRepairs() {
        return this.nonRepairs;
    }

    public final List<Repair> getRepairs() {
        return this.repairs;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final WireQuickLink getTrainingGuide() {
        return this.trainingGuide;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66623id.hashCode() * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.completed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.selected;
        int hashCode3 = (((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.repairs.hashCode()) * 31) + this.nonRepairs.hashCode()) * 31;
        WireQuickLink wireQuickLink = this.trainingGuide;
        return hashCode3 + (wireQuickLink != null ? wireQuickLink.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66623id;
        String str2 = this.display;
        boolean z = this.completed;
        boolean z2 = this.selected;
        List<Repair> list = this.repairs;
        List<NonRepair> list2 = this.nonRepairs;
        WireQuickLink wireQuickLink = this.trainingGuide;
        return "RepairIssue(id=" + str + ", display=" + str2 + ", completed=" + z + ", selected=" + z2 + ", repairs=" + list + ", nonRepairs=" + list2 + ", trainingGuide=" + wireQuickLink + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66623id);
        out.writeString(this.display);
        out.writeInt(this.completed ? 1 : 0);
        out.writeInt(this.selected ? 1 : 0);
        List<Repair> list = this.repairs;
        out.writeInt(list.size());
        for (Repair repair : list) {
            repair.writeToParcel(out, i);
        }
        List<NonRepair> list2 = this.nonRepairs;
        out.writeInt(list2.size());
        for (NonRepair nonRepair : list2) {
            nonRepair.writeToParcel(out, i);
        }
        out.writeParcelable(this.trainingGuide, i);
    }

    public RepairIssue(String id, String str, boolean z, boolean z2, List<Repair> repairs, List<NonRepair> nonRepairs, WireQuickLink wireQuickLink) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Intrinsics.checkNotNullParameter(nonRepairs, "nonRepairs");
        this.f66623id = id;
        this.display = str;
        this.completed = z;
        this.selected = z2;
        this.repairs = repairs;
        this.nonRepairs = nonRepairs;
        this.trainingGuide = wireQuickLink;
    }

    public /* synthetic */ RepairIssue(String str, String str2, boolean z, boolean z2, List list, List list2, WireQuickLink wireQuickLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 64) == 0 ? wireQuickLink : null);
    }
}
