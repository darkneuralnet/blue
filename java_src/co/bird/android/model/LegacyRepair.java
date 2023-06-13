package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u0006;"}, m28432d2 = {"Lco/bird/android/model/LegacyRepair;", "Landroid/os/Parcelable;", "id", "", "workOrderId", "repairTypeId", "issueId", "issueTypeId", "notes", "createdBy", "display", "description", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "user", "Lco/bird/android/model/User;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/User;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCreatedBy", "()Ljava/lang/String;", "getDescription", "getDisplay", "getId", "getIssueId", "getIssueTypeId", "getNotes", "getRepairTypeId", "getUpdatedAt", "getUser", "()Lco/bird/android/model/User;", "getWorkOrderId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LegacyRepair implements Parcelable {
    public static final Parcelable.Creator<LegacyRepair> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("created_by")
    @InterfaceC41208ft5("created_by")
    private final String createdBy;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66601id;
    @JsonProperty("issue_id")
    @InterfaceC41208ft5("issue_id")
    private final String issueId;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("repair_type_id")
    @InterfaceC41208ft5("repair_type_id")
    private final String repairTypeId;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    private final transient User user;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<LegacyRepair> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyRepair createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyRepair(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyRepair[] newArray(int i) {
            return new LegacyRepair[i];
        }
    }

    public LegacyRepair() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.f66601id;
    }

    public final DateTime component10() {
        return this.createdAt;
    }

    public final DateTime component11() {
        return this.updatedAt;
    }

    public final User component12() {
        return this.user;
    }

    public final String component2() {
        return this.workOrderId;
    }

    public final String component3() {
        return this.repairTypeId;
    }

    public final String component4() {
        return this.issueId;
    }

    public final String component5() {
        return this.issueTypeId;
    }

    public final String component6() {
        return this.notes;
    }

    public final String component7() {
        return this.createdBy;
    }

    public final String component8() {
        return this.display;
    }

    public final String component9() {
        return this.description;
    }

    public final LegacyRepair copy(String id, String workOrderId, String repairTypeId, String issueId, String issueTypeId, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, User user) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        return new LegacyRepair(id, workOrderId, repairTypeId, issueId, issueTypeId, str, str2, str3, str4, dateTime, dateTime2, user);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyRepair) {
            LegacyRepair legacyRepair = (LegacyRepair) obj;
            return Intrinsics.areEqual(this.f66601id, legacyRepair.f66601id) && Intrinsics.areEqual(this.workOrderId, legacyRepair.workOrderId) && Intrinsics.areEqual(this.repairTypeId, legacyRepair.repairTypeId) && Intrinsics.areEqual(this.issueId, legacyRepair.issueId) && Intrinsics.areEqual(this.issueTypeId, legacyRepair.issueTypeId) && Intrinsics.areEqual(this.notes, legacyRepair.notes) && Intrinsics.areEqual(this.createdBy, legacyRepair.createdBy) && Intrinsics.areEqual(this.display, legacyRepair.display) && Intrinsics.areEqual(this.description, legacyRepair.description) && Intrinsics.areEqual(this.createdAt, legacyRepair.createdAt) && Intrinsics.areEqual(this.updatedAt, legacyRepair.updatedAt) && Intrinsics.areEqual(this.user, legacyRepair.user);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getId() {
        return this.f66601id;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getRepairTypeId() {
        return this.repairTypeId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f66601id.hashCode() * 31) + this.workOrderId.hashCode()) * 31) + this.repairTypeId.hashCode()) * 31) + this.issueId.hashCode()) * 31) + this.issueTypeId.hashCode()) * 31;
        String str = this.notes;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdBy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.display;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        User user = this.user;
        return hashCode7 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66601id;
        String str2 = this.workOrderId;
        String str3 = this.repairTypeId;
        String str4 = this.issueId;
        String str5 = this.issueTypeId;
        String str6 = this.notes;
        String str7 = this.createdBy;
        String str8 = this.display;
        String str9 = this.description;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        User user = this.user;
        return "LegacyRepair(id=" + str + ", workOrderId=" + str2 + ", repairTypeId=" + str3 + ", issueId=" + str4 + ", issueTypeId=" + str5 + ", notes=" + str6 + ", createdBy=" + str7 + ", display=" + str8 + ", description=" + str9 + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", user=" + user + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66601id);
        out.writeString(this.workOrderId);
        out.writeString(this.repairTypeId);
        out.writeString(this.issueId);
        out.writeString(this.issueTypeId);
        out.writeString(this.notes);
        out.writeString(this.createdBy);
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        User user = this.user;
        if (user == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        user.writeToParcel(out, i);
    }

    public LegacyRepair(String id, String workOrderId, String repairTypeId, String issueId, String issueTypeId, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, User user) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(repairTypeId, "repairTypeId");
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        this.f66601id = id;
        this.workOrderId = workOrderId;
        this.repairTypeId = repairTypeId;
        this.issueId = issueId;
        this.issueTypeId = issueTypeId;
        this.notes = str;
        this.createdBy = str2;
        this.display = str3;
        this.description = str4;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
        this.user = user;
    }

    public /* synthetic */ LegacyRepair(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DateTime dateTime, DateTime dateTime2, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : dateTime, (i & 1024) != 0 ? null : dateTime2, (i & 2048) == 0 ? user : null);
    }
}
