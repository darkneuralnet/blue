package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J}\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\u0006\u0010-\u001a\u00020)J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020'HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00065"}, m28432d2 = {"Lco/bird/android/model/IssueType;", "Landroid/os/Parcelable;", "id", "", "category", "display", "description", "repairScopes", "", "Lco/bird/android/model/RepairScope;", "parentId", "assetId", "subtypes", "wireCampaign", "Lco/bird/android/model/wire/WireServiceCenterCampaign;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;)V", "getAssetId", "()Ljava/lang/String;", "getCategory", "getDescription", "getDisplay", "getId", "getParentId", "getRepairScopes", "()Ljava/util/List;", "getSubtypes", "getWireCampaign", "()Lco/bird/android/model/wire/WireServiceCenterCampaign;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "isNoIssue", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueType implements Parcelable {
    public static final String NO_ISSUE_SUFFIX = "no_issues";
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("category")
    @InterfaceC41208ft5("category")
    private final String category;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66599id;
    @JsonProperty("parent_id")
    @InterfaceC41208ft5("parent_id")
    private final String parentId;
    @JsonProperty("scopes")
    @InterfaceC41208ft5("scopes")
    private final List<RepairScope> repairScopes;
    @JsonProperty("sub_types")
    @InterfaceC41208ft5("sub_types")
    private final List<IssueType> subtypes;
    @JsonProperty("wire_campaign")
    @InterfaceC41208ft5("wire_campaign")
    private final WireServiceCenterCampaign wireCampaign;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IssueType> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/IssueType$Companion;", "", "()V", "NO_ISSUE_SUFFIX", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IssueType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueType createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(RepairScope.valueOf(parcel.readString()));
                }
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(IssueType.CREATOR.createFromParcel(parcel));
            }
            return new IssueType(readString, readString2, readString3, readString4, arrayList, readString5, readString6, arrayList2, (WireServiceCenterCampaign) parcel.readParcelable(IssueType.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueType[] newArray(int i) {
            return new IssueType[i];
        }
    }

    public IssueType() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.f66599id;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.display;
    }

    public final String component4() {
        return this.description;
    }

    public final List<RepairScope> component5() {
        return this.repairScopes;
    }

    public final String component6() {
        return this.parentId;
    }

    public final String component7() {
        return this.assetId;
    }

    public final List<IssueType> component8() {
        return this.subtypes;
    }

    public final WireServiceCenterCampaign component9() {
        return this.wireCampaign;
    }

    public final IssueType copy(String id, String str, String str2, String str3, List<? extends RepairScope> list, String str4, String str5, List<IssueType> subtypes, WireServiceCenterCampaign wireServiceCenterCampaign) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        return new IssueType(id, str, str2, str3, list, str4, str5, subtypes, wireServiceCenterCampaign);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IssueType) {
            IssueType issueType = (IssueType) obj;
            return Intrinsics.areEqual(this.f66599id, issueType.f66599id) && Intrinsics.areEqual(this.category, issueType.category) && Intrinsics.areEqual(this.display, issueType.display) && Intrinsics.areEqual(this.description, issueType.description) && Intrinsics.areEqual(this.repairScopes, issueType.repairScopes) && Intrinsics.areEqual(this.parentId, issueType.parentId) && Intrinsics.areEqual(this.assetId, issueType.assetId) && Intrinsics.areEqual(this.subtypes, issueType.subtypes) && Intrinsics.areEqual(this.wireCampaign, issueType.wireCampaign);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66599id;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final List<RepairScope> getRepairScopes() {
        return this.repairScopes;
    }

    public final List<IssueType> getSubtypes() {
        return this.subtypes;
    }

    public final WireServiceCenterCampaign getWireCampaign() {
        return this.wireCampaign;
    }

    public int hashCode() {
        int hashCode = this.f66599id.hashCode() * 31;
        String str = this.category;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.display;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<RepairScope> list = this.repairScopes;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.parentId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.assetId;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.subtypes.hashCode()) * 31;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.wireCampaign;
        return hashCode7 + (wireServiceCenterCampaign != null ? wireServiceCenterCampaign.hashCode() : 0);
    }

    public final boolean isNoIssue() {
        boolean contains$default;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) this.f66599id, (CharSequence) NO_ISSUE_SUFFIX, false, 2, (Object) null);
        return contains$default;
    }

    public String toString() {
        String str = this.f66599id;
        String str2 = this.category;
        String str3 = this.display;
        String str4 = this.description;
        List<RepairScope> list = this.repairScopes;
        String str5 = this.parentId;
        String str6 = this.assetId;
        List<IssueType> list2 = this.subtypes;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.wireCampaign;
        return "IssueType(id=" + str + ", category=" + str2 + ", display=" + str3 + ", description=" + str4 + ", repairScopes=" + list + ", parentId=" + str5 + ", assetId=" + str6 + ", subtypes=" + list2 + ", wireCampaign=" + wireServiceCenterCampaign + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66599id);
        out.writeString(this.category);
        out.writeString(this.display);
        out.writeString(this.description);
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
        out.writeString(this.parentId);
        out.writeString(this.assetId);
        List<IssueType> list2 = this.subtypes;
        out.writeInt(list2.size());
        for (IssueType issueType : list2) {
            issueType.writeToParcel(out, i);
        }
        out.writeParcelable(this.wireCampaign, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssueType(String id, String str, String str2, String str3, List<? extends RepairScope> list, String str4, String str5, List<IssueType> subtypes, WireServiceCenterCampaign wireServiceCenterCampaign) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subtypes, "subtypes");
        this.f66599id = id;
        this.category = str;
        this.display = str2;
        this.description = str3;
        this.repairScopes = list;
        this.parentId = str4;
        this.assetId = str5;
        this.subtypes = subtypes;
        this.wireCampaign = wireServiceCenterCampaign;
    }

    public /* synthetic */ IssueType(String str, String str2, String str3, String str4, List list, String str5, String str6, List list2, WireServiceCenterCampaign wireServiceCenterCampaign, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 256) == 0 ? wireServiceCenterCampaign : null);
    }
}
