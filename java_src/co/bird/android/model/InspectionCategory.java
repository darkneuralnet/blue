package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00063"}, m28432d2 = {"Lco/bird/android/model/InspectionCategory;", "Landroid/os/Parcelable;", "id", "", "display", "description", "assetUrl", "status", "Lco/bird/android/model/InspectionCategoryStatus;", "mutable", "", "issues", "", "Lco/bird/android/model/InspectionIssue;", "notice", "Lco/bird/android/model/InspectionNotice;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InspectionCategoryStatus;ZLjava/util/List;Lco/bird/android/model/InspectionNotice;)V", "getAssetUrl", "()Ljava/lang/String;", "getDescription", "getDisplay", "getId", "getIssues", "()Ljava/util/List;", "getMutable", "()Z", "getNotice", "()Lco/bird/android/model/InspectionNotice;", "getStatus", "()Lco/bird/android/model/InspectionCategoryStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InspectionCategory implements Parcelable {
    public static final Parcelable.Creator<InspectionCategory> CREATOR = new Creator();
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
    private final String f66596id;
    @JsonProperty("issues")
    @InterfaceC41208ft5("issues")
    private final List<InspectionIssue> issues;
    @JsonProperty("mutable")
    @InterfaceC41208ft5("mutable")
    private final boolean mutable;
    @JsonProperty("notice")
    @InterfaceC41208ft5("notice")
    private final InspectionNotice notice;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final InspectionCategoryStatus status;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<InspectionCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionCategory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            InspectionCategoryStatus valueOf = InspectionCategoryStatus.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(InspectionIssue.CREATOR.createFromParcel(parcel));
            }
            return new InspectionCategory(readString, readString2, readString3, readString4, valueOf, z, arrayList, parcel.readInt() == 0 ? null : InspectionNotice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionCategory[] newArray(int i) {
            return new InspectionCategory[i];
        }
    }

    public InspectionCategory() {
        this(null, null, null, null, null, false, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66596id;
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

    public final InspectionCategoryStatus component5() {
        return this.status;
    }

    public final boolean component6() {
        return this.mutable;
    }

    public final List<InspectionIssue> component7() {
        return this.issues;
    }

    public final InspectionNotice component8() {
        return this.notice;
    }

    public final InspectionCategory copy(String id, String display, String description, String str, InspectionCategoryStatus status, boolean z, List<InspectionIssue> issues, InspectionNotice inspectionNotice) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(issues, "issues");
        return new InspectionCategory(id, display, description, str, status, z, issues, inspectionNotice);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionCategory) {
            InspectionCategory inspectionCategory = (InspectionCategory) obj;
            return Intrinsics.areEqual(this.f66596id, inspectionCategory.f66596id) && Intrinsics.areEqual(this.display, inspectionCategory.display) && Intrinsics.areEqual(this.description, inspectionCategory.description) && Intrinsics.areEqual(this.assetUrl, inspectionCategory.assetUrl) && this.status == inspectionCategory.status && this.mutable == inspectionCategory.mutable && Intrinsics.areEqual(this.issues, inspectionCategory.issues) && Intrinsics.areEqual(this.notice, inspectionCategory.notice);
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
        return this.f66596id;
    }

    public final List<InspectionIssue> getIssues() {
        return this.issues;
    }

    public final boolean getMutable() {
        return this.mutable;
    }

    public final InspectionNotice getNotice() {
        return this.notice;
    }

    public final InspectionCategoryStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66596id.hashCode() * 31) + this.display.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str = this.assetUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31;
        boolean z = this.mutable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.issues.hashCode()) * 31;
        InspectionNotice inspectionNotice = this.notice;
        return hashCode3 + (inspectionNotice != null ? inspectionNotice.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66596id;
        String str2 = this.display;
        String str3 = this.description;
        String str4 = this.assetUrl;
        InspectionCategoryStatus inspectionCategoryStatus = this.status;
        boolean z = this.mutable;
        List<InspectionIssue> list = this.issues;
        InspectionNotice inspectionNotice = this.notice;
        return "InspectionCategory(id=" + str + ", display=" + str2 + ", description=" + str3 + ", assetUrl=" + str4 + ", status=" + inspectionCategoryStatus + ", mutable=" + z + ", issues=" + list + ", notice=" + inspectionNotice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66596id);
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeString(this.assetUrl);
        out.writeString(this.status.name());
        out.writeInt(this.mutable ? 1 : 0);
        List<InspectionIssue> list = this.issues;
        out.writeInt(list.size());
        for (InspectionIssue inspectionIssue : list) {
            inspectionIssue.writeToParcel(out, i);
        }
        InspectionNotice inspectionNotice = this.notice;
        if (inspectionNotice == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        inspectionNotice.writeToParcel(out, i);
    }

    public InspectionCategory(String id, String display, String description, String str, InspectionCategoryStatus status, boolean z, List<InspectionIssue> issues, InspectionNotice inspectionNotice) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(issues, "issues");
        this.f66596id = id;
        this.display = display;
        this.description = description;
        this.assetUrl = str;
        this.status = status;
        this.mutable = z;
        this.issues = issues;
        this.notice = inspectionNotice;
    }

    public /* synthetic */ InspectionCategory(String str, String str2, String str3, String str4, InspectionCategoryStatus inspectionCategoryStatus, boolean z, List list, InspectionNotice inspectionNotice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? InspectionCategoryStatus.UNKNOWN : inspectionCategoryStatus, (i & 32) != 0 ? false : z, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 128) == 0 ? inspectionNotice : null);
    }
}
