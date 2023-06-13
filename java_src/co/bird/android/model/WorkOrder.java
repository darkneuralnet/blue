package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0002\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003JÁ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016HÆ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020BHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020BHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006N"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "Landroid/os/Parcelable;", "id", "", "birdId", "createdBy", "createdAt", "Lorg/joda/time/DateTime;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/WorkOrderCreateSource;", "sourceDisplay", "status", "Lco/bird/android/model/WorkOrderStatus;", "statusDisplay", "statusReason", "Lco/bird/android/model/WorkOrderStatusReason;", "notes", "updatedAt", "deletedAt", "user", "Lco/bird/android/model/User;", "issues", "", "Lco/bird/android/model/Issue;", "repairs", "Lco/bird/android/model/LegacyRepair;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/WorkOrderCreateSource;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatus;Ljava/lang/String;Lco/bird/android/model/WorkOrderStatusReason;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/User;Ljava/util/List;Ljava/util/List;)V", "getBirdId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCreatedBy", "getDeletedAt", "getId", "getIssues", "()Ljava/util/List;", "getNotes", "getRepairs", "getSource", "()Lco/bird/android/model/WorkOrderCreateSource;", "getSourceDisplay", "getStatus", "()Lco/bird/android/model/WorkOrderStatus;", "getStatusDisplay", "getStatusReason", "()Lco/bird/android/model/WorkOrderStatusReason;", "getUpdatedAt", "getUser", "()Lco/bird/android/model/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WorkOrder implements Parcelable {
    public static final Parcelable.Creator<WorkOrder> CREATOR = new Creator();
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("created_by")
    @InterfaceC41208ft5("created_by")
    private final String createdBy;
    @JsonProperty("deleted_at")
    @InterfaceC41208ft5("deleted_at")
    private final DateTime deletedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66636id;
    private final transient List<Issue> issues;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    private final transient List<LegacyRepair> repairs;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final WorkOrderCreateSource source;
    @JsonProperty("source_display")
    @InterfaceC41208ft5("source_display")
    private final String sourceDisplay;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WorkOrderStatus status;
    @JsonProperty("status_display")
    @InterfaceC41208ft5("status_display")
    private final String statusDisplay;
    @JsonProperty("status_reason")
    @InterfaceC41208ft5("status_reason")
    private final WorkOrderStatusReason statusReason;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    private final transient User user;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WorkOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            WorkOrderCreateSource valueOf = parcel.readInt() == 0 ? null : WorkOrderCreateSource.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            WorkOrderStatus createFromParcel = WorkOrderStatus.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            WorkOrderStatusReason valueOf2 = parcel.readInt() == 0 ? null : WorkOrderStatusReason.valueOf(parcel.readString());
            String readString6 = parcel.readString();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            User createFromParcel2 = parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList.add(Issue.CREATOR.createFromParcel(parcel));
                i++;
                readInt = readInt;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                arrayList2.add(LegacyRepair.CREATOR.createFromParcel(parcel));
                i2++;
                readInt2 = readInt2;
            }
            return new WorkOrder(readString, readString2, readString3, dateTime, valueOf, readString4, createFromParcel, readString5, valueOf2, readString6, dateTime2, dateTime3, createFromParcel2, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkOrder[] newArray(int i) {
            return new WorkOrder[i];
        }
    }

    public WorkOrder() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final String component1() {
        return this.f66636id;
    }

    public final String component10() {
        return this.notes;
    }

    public final DateTime component11() {
        return this.updatedAt;
    }

    public final DateTime component12() {
        return this.deletedAt;
    }

    public final User component13() {
        return this.user;
    }

    public final List<Issue> component14() {
        return this.issues;
    }

    public final List<LegacyRepair> component15() {
        return this.repairs;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.createdBy;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final WorkOrderCreateSource component5() {
        return this.source;
    }

    public final String component6() {
        return this.sourceDisplay;
    }

    public final WorkOrderStatus component7() {
        return this.status;
    }

    public final String component8() {
        return this.statusDisplay;
    }

    public final WorkOrderStatusReason component9() {
        return this.statusReason;
    }

    public final WorkOrder copy(String id, String str, String str2, DateTime dateTime, WorkOrderCreateSource workOrderCreateSource, String str3, WorkOrderStatus status, String str4, WorkOrderStatusReason workOrderStatusReason, String str5, DateTime dateTime2, DateTime dateTime3, User user, List<Issue> issues, List<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        return new WorkOrder(id, str, str2, dateTime, workOrderCreateSource, str3, status, str4, workOrderStatusReason, str5, dateTime2, dateTime3, user, issues, repairs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkOrder) {
            WorkOrder workOrder = (WorkOrder) obj;
            return Intrinsics.areEqual(this.f66636id, workOrder.f66636id) && Intrinsics.areEqual(this.birdId, workOrder.birdId) && Intrinsics.areEqual(this.createdBy, workOrder.createdBy) && Intrinsics.areEqual(this.createdAt, workOrder.createdAt) && this.source == workOrder.source && Intrinsics.areEqual(this.sourceDisplay, workOrder.sourceDisplay) && this.status == workOrder.status && Intrinsics.areEqual(this.statusDisplay, workOrder.statusDisplay) && this.statusReason == workOrder.statusReason && Intrinsics.areEqual(this.notes, workOrder.notes) && Intrinsics.areEqual(this.updatedAt, workOrder.updatedAt) && Intrinsics.areEqual(this.deletedAt, workOrder.deletedAt) && Intrinsics.areEqual(this.user, workOrder.user) && Intrinsics.areEqual(this.issues, workOrder.issues) && Intrinsics.areEqual(this.repairs, workOrder.repairs);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final DateTime getDeletedAt() {
        return this.deletedAt;
    }

    public final String getId() {
        return this.f66636id;
    }

    public final List<Issue> getIssues() {
        return this.issues;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<LegacyRepair> getRepairs() {
        return this.repairs;
    }

    public final WorkOrderCreateSource getSource() {
        return this.source;
    }

    public final String getSourceDisplay() {
        return this.sourceDisplay;
    }

    public final WorkOrderStatus getStatus() {
        return this.status;
    }

    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    public final WorkOrderStatusReason getStatusReason() {
        return this.statusReason;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.f66636id.hashCode() * 31;
        String str = this.birdId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createdBy;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        WorkOrderCreateSource workOrderCreateSource = this.source;
        int hashCode5 = (hashCode4 + (workOrderCreateSource == null ? 0 : workOrderCreateSource.hashCode())) * 31;
        String str3 = this.sourceDisplay;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.status.hashCode()) * 31;
        String str4 = this.statusDisplay;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        int hashCode8 = (hashCode7 + (workOrderStatusReason == null ? 0 : workOrderStatusReason.hashCode())) * 31;
        String str5 = this.notes;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        int hashCode10 = (hashCode9 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.deletedAt;
        int hashCode11 = (hashCode10 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        User user = this.user;
        return ((((hashCode11 + (user != null ? user.hashCode() : 0)) * 31) + this.issues.hashCode()) * 31) + this.repairs.hashCode();
    }

    public String toString() {
        String str = this.f66636id;
        String str2 = this.birdId;
        String str3 = this.createdBy;
        DateTime dateTime = this.createdAt;
        WorkOrderCreateSource workOrderCreateSource = this.source;
        String str4 = this.sourceDisplay;
        WorkOrderStatus workOrderStatus = this.status;
        String str5 = this.statusDisplay;
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        String str6 = this.notes;
        DateTime dateTime2 = this.updatedAt;
        DateTime dateTime3 = this.deletedAt;
        User user = this.user;
        List<Issue> list = this.issues;
        List<LegacyRepair> list2 = this.repairs;
        return "WorkOrder(id=" + str + ", birdId=" + str2 + ", createdBy=" + str3 + ", createdAt=" + dateTime + ", source=" + workOrderCreateSource + ", sourceDisplay=" + str4 + ", status=" + workOrderStatus + ", statusDisplay=" + str5 + ", statusReason=" + workOrderStatusReason + ", notes=" + str6 + ", updatedAt=" + dateTime2 + ", deletedAt=" + dateTime3 + ", user=" + user + ", issues=" + list + ", repairs=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66636id);
        out.writeString(this.birdId);
        out.writeString(this.createdBy);
        out.writeSerializable(this.createdAt);
        WorkOrderCreateSource workOrderCreateSource = this.source;
        if (workOrderCreateSource == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(workOrderCreateSource.name());
        }
        out.writeString(this.sourceDisplay);
        this.status.writeToParcel(out, i);
        out.writeString(this.statusDisplay);
        WorkOrderStatusReason workOrderStatusReason = this.statusReason;
        if (workOrderStatusReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(workOrderStatusReason.name());
        }
        out.writeString(this.notes);
        out.writeSerializable(this.updatedAt);
        out.writeSerializable(this.deletedAt);
        User user = this.user;
        if (user == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            user.writeToParcel(out, i);
        }
        List<Issue> list = this.issues;
        out.writeInt(list.size());
        for (Issue issue : list) {
            issue.writeToParcel(out, i);
        }
        List<LegacyRepair> list2 = this.repairs;
        out.writeInt(list2.size());
        for (LegacyRepair legacyRepair : list2) {
            legacyRepair.writeToParcel(out, i);
        }
    }

    public WorkOrder(String id, String str, String str2, DateTime dateTime, WorkOrderCreateSource workOrderCreateSource, String str3, WorkOrderStatus status, String str4, WorkOrderStatusReason workOrderStatusReason, String str5, DateTime dateTime2, DateTime dateTime3, User user, List<Issue> issues, List<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        this.f66636id = id;
        this.birdId = str;
        this.createdBy = str2;
        this.createdAt = dateTime;
        this.source = workOrderCreateSource;
        this.sourceDisplay = str3;
        this.status = status;
        this.statusDisplay = str4;
        this.statusReason = workOrderStatusReason;
        this.notes = str5;
        this.updatedAt = dateTime2;
        this.deletedAt = dateTime3;
        this.user = user;
        this.issues = issues;
        this.repairs = repairs;
    }

    public /* synthetic */ WorkOrder(String str, String str2, String str3, DateTime dateTime, WorkOrderCreateSource workOrderCreateSource, String str4, WorkOrderStatus workOrderStatus, String str5, WorkOrderStatusReason workOrderStatusReason, String str6, DateTime dateTime2, DateTime dateTime3, User user, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? null : workOrderCreateSource, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? WorkOrderStatus.UNKNOWN : workOrderStatus, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : workOrderStatusReason, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : dateTime2, (i & 2048) != 0 ? null : dateTime3, (i & 4096) == 0 ? user : null, (i & 8192) != 0 ? CollectionsKt.emptyList() : list, (i & 16384) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
