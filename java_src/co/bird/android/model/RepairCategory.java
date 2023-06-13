package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireQuickLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003Js\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, m28432d2 = {"Lco/bird/android/model/RepairCategory;", "Landroid/os/Parcelable;", "id", "", "display", "description", "assetUrl", "issues", "", "Lco/bird/android/model/RepairIssue;", "trainingGuide", "Lco/bird/android/model/wire/WireQuickLink;", "nonRepairs", "Lco/bird/android/model/NonRepair;", "overviewNonRepairs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireQuickLink;Ljava/util/List;Ljava/util/List;)V", "getAssetUrl", "()Ljava/lang/String;", "getDescription", "getDisplay", "getId", "getIssues", "()Ljava/util/List;", "getNonRepairs", "getOverviewNonRepairs", "getTrainingGuide", "()Lco/bird/android/model/wire/WireQuickLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairCategory implements Parcelable {
    public static final Parcelable.Creator<RepairCategory> CREATOR = new Creator();
    @JsonProperty("asset_url")
    @InterfaceC41208ft5("asset_url")
    private final String assetUrl;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66622id;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<RepairIssue> issues;
    @JsonProperty("non_repairs")
    @InterfaceC41208ft5("non_repairs")
    private final List<NonRepair> nonRepairs;
    @JsonProperty("overview_non_repairs")
    @InterfaceC41208ft5("overview_non_repairs")
    private final List<NonRepair> overviewNonRepairs;
    @JsonProperty("training_guide")
    @InterfaceC41208ft5("training_guide")
    private final WireQuickLink trainingGuide;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RepairCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairCategory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RepairIssue.CREATOR.createFromParcel(parcel));
            }
            WireQuickLink wireQuickLink = (WireQuickLink) parcel.readParcelable(RepairCategory.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(NonRepair.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(NonRepair.CREATOR.createFromParcel(parcel));
            }
            return new RepairCategory(readString, readString2, readString3, readString4, arrayList, wireQuickLink, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairCategory[] newArray(int i) {
            return new RepairCategory[i];
        }
    }

    public RepairCategory() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66622id;
    }

    public final String component2() {
        return this.display;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.assetUrl;
    }

    public final List<RepairIssue> component5() {
        return this.issues;
    }

    public final WireQuickLink component6() {
        return this.trainingGuide;
    }

    public final List<NonRepair> component7() {
        return this.nonRepairs;
    }

    public final List<NonRepair> component8() {
        return this.overviewNonRepairs;
    }

    public final RepairCategory copy(String id, String str, String str2, String str3, List<RepairIssue> issues, WireQuickLink wireQuickLink, List<NonRepair> nonRepairs, List<NonRepair> overviewNonRepairs) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(nonRepairs, "nonRepairs");
        Intrinsics.checkNotNullParameter(overviewNonRepairs, "overviewNonRepairs");
        return new RepairCategory(id, str, str2, str3, issues, wireQuickLink, nonRepairs, overviewNonRepairs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairCategory) {
            RepairCategory repairCategory = (RepairCategory) obj;
            return Intrinsics.areEqual(this.f66622id, repairCategory.f66622id) && Intrinsics.areEqual(this.display, repairCategory.display) && Intrinsics.areEqual(this.description, repairCategory.description) && Intrinsics.areEqual(this.assetUrl, repairCategory.assetUrl) && Intrinsics.areEqual(this.issues, repairCategory.issues) && Intrinsics.areEqual(this.trainingGuide, repairCategory.trainingGuide) && Intrinsics.areEqual(this.nonRepairs, repairCategory.nonRepairs) && Intrinsics.areEqual(this.overviewNonRepairs, repairCategory.overviewNonRepairs);
        }
        return false;
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66622id;
    }

    public final List<RepairIssue> getIssues() {
        return this.issues;
    }

    public final List<NonRepair> getNonRepairs() {
        return this.nonRepairs;
    }

    public final List<NonRepair> getOverviewNonRepairs() {
        return this.overviewNonRepairs;
    }

    public final WireQuickLink getTrainingGuide() {
        return this.trainingGuide;
    }

    public int hashCode() {
        int hashCode = this.f66622id.hashCode() * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.assetUrl;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.issues.hashCode()) * 31;
        WireQuickLink wireQuickLink = this.trainingGuide;
        return ((((hashCode4 + (wireQuickLink != null ? wireQuickLink.hashCode() : 0)) * 31) + this.nonRepairs.hashCode()) * 31) + this.overviewNonRepairs.hashCode();
    }

    public String toString() {
        String str = this.f66622id;
        String str2 = this.display;
        String str3 = this.description;
        String str4 = this.assetUrl;
        List<RepairIssue> list = this.issues;
        WireQuickLink wireQuickLink = this.trainingGuide;
        List<NonRepair> list2 = this.nonRepairs;
        List<NonRepair> list3 = this.overviewNonRepairs;
        return "RepairCategory(id=" + str + ", display=" + str2 + ", description=" + str3 + ", assetUrl=" + str4 + ", issues=" + list + ", trainingGuide=" + wireQuickLink + ", nonRepairs=" + list2 + ", overviewNonRepairs=" + list3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66622id);
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeString(this.assetUrl);
        List<RepairIssue> list = this.issues;
        out.writeInt(list.size());
        for (RepairIssue repairIssue : list) {
            repairIssue.writeToParcel(out, i);
        }
        out.writeParcelable(this.trainingGuide, i);
        List<NonRepair> list2 = this.nonRepairs;
        out.writeInt(list2.size());
        for (NonRepair nonRepair : list2) {
            nonRepair.writeToParcel(out, i);
        }
        List<NonRepair> list3 = this.overviewNonRepairs;
        out.writeInt(list3.size());
        for (NonRepair nonRepair2 : list3) {
            nonRepair2.writeToParcel(out, i);
        }
    }

    public RepairCategory(String id, String str, String str2, String str3, List<RepairIssue> issues, WireQuickLink wireQuickLink, List<NonRepair> nonRepairs, List<NonRepair> overviewNonRepairs) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(nonRepairs, "nonRepairs");
        Intrinsics.checkNotNullParameter(overviewNonRepairs, "overviewNonRepairs");
        this.f66622id = id;
        this.display = str;
        this.description = str2;
        this.assetUrl = str3;
        this.issues = issues;
        this.trainingGuide = wireQuickLink;
        this.nonRepairs = nonRepairs;
        this.overviewNonRepairs = overviewNonRepairs;
    }

    public /* synthetic */ RepairCategory(String str, String str2, String str3, String str4, List list, WireQuickLink wireQuickLink, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) == 0 ? wireQuickLink : null, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
