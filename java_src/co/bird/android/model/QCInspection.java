package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.QCKind;
import co.bird.android.model.constant.QCStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jk\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00062"}, m28432d2 = {"Lco/bird/android/model/QCInspection;", "Landroid/os/Parcelable;", "id", "", "title", "description", "workOrderId", "issueTypeId", "repairTypeId", "kind", "Lco/bird/android/model/constant/QCKind;", "status", "Lco/bird/android/model/constant/QCStatus;", "assetId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/QCKind;Lco/bird/android/model/constant/QCStatus;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getDescription", "getId", "getIssueTypeId", "getKind", "()Lco/bird/android/model/constant/QCKind;", "getRepairTypeId", "getStatus", "()Lco/bird/android/model/constant/QCStatus;", "getTitle", "getWorkOrderId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QCInspection implements Parcelable {
    public static final Parcelable.Creator<QCInspection> CREATOR = new Creator();
    @JsonProperty("asset_id")
    @InterfaceC41208ft5("asset_id")
    private final String assetId;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final transient String f66615id;
    @JsonProperty("issue_type_id")
    @InterfaceC41208ft5("issue_type_id")
    private final String issueTypeId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final QCKind kind;
    @JsonProperty("repair_type_id")
    @InterfaceC41208ft5("repair_type_id")
    private final String repairTypeId;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final QCStatus status;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("work_order_id")
    @InterfaceC41208ft5("work_order_id")
    private final String workOrderId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<QCInspection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCInspection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QCInspection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), QCKind.valueOf(parcel.readString()), QCStatus.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QCInspection[] newArray(int i) {
            return new QCInspection[i];
        }
    }

    public QCInspection() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.f66615id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.workOrderId;
    }

    public final String component5() {
        return this.issueTypeId;
    }

    public final String component6() {
        return this.repairTypeId;
    }

    public final QCKind component7() {
        return this.kind;
    }

    public final QCStatus component8() {
        return this.status;
    }

    public final String component9() {
        return this.assetId;
    }

    public final QCInspection copy(String id, String str, String str2, String workOrderId, String issueTypeId, String str3, QCKind kind, QCStatus status, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        return new QCInspection(id, str, str2, workOrderId, issueTypeId, str3, kind, status, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QCInspection) {
            QCInspection qCInspection = (QCInspection) obj;
            return Intrinsics.areEqual(this.f66615id, qCInspection.f66615id) && Intrinsics.areEqual(this.title, qCInspection.title) && Intrinsics.areEqual(this.description, qCInspection.description) && Intrinsics.areEqual(this.workOrderId, qCInspection.workOrderId) && Intrinsics.areEqual(this.issueTypeId, qCInspection.issueTypeId) && Intrinsics.areEqual(this.repairTypeId, qCInspection.repairTypeId) && this.kind == qCInspection.kind && this.status == qCInspection.status && Intrinsics.areEqual(this.assetId, qCInspection.assetId);
        }
        return false;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f66615id;
    }

    public final String getIssueTypeId() {
        return this.issueTypeId;
    }

    public final QCKind getKind() {
        return this.kind;
    }

    public final String getRepairTypeId() {
        return this.repairTypeId;
    }

    public final QCStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWorkOrderId() {
        return this.workOrderId;
    }

    public int hashCode() {
        int hashCode = this.f66615id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.workOrderId.hashCode()) * 31) + this.issueTypeId.hashCode()) * 31;
        String str3 = this.repairTypeId;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.kind.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str4 = this.assetId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66615id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.workOrderId;
        String str5 = this.issueTypeId;
        String str6 = this.repairTypeId;
        QCKind qCKind = this.kind;
        QCStatus qCStatus = this.status;
        String str7 = this.assetId;
        return "QCInspection(id=" + str + ", title=" + str2 + ", description=" + str3 + ", workOrderId=" + str4 + ", issueTypeId=" + str5 + ", repairTypeId=" + str6 + ", kind=" + qCKind + ", status=" + qCStatus + ", assetId=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66615id);
        out.writeString(this.title);
        out.writeString(this.description);
        out.writeString(this.workOrderId);
        out.writeString(this.issueTypeId);
        out.writeString(this.repairTypeId);
        out.writeString(this.kind.name());
        out.writeString(this.status.name());
        out.writeString(this.assetId);
    }

    public QCInspection(String id, String str, String str2, String workOrderId, String issueTypeId, String str3, QCKind kind, QCStatus status, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f66615id = id;
        this.title = str;
        this.description = str2;
        this.workOrderId = workOrderId;
        this.issueTypeId = issueTypeId;
        this.repairTypeId = str3;
        this.kind = kind;
        this.status = status;
        this.assetId = str4;
    }

    public /* synthetic */ QCInspection(String str, String str2, String str3, String str4, String str5, String str6, QCKind qCKind, QCStatus qCStatus, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? QCKind.STANDARD : qCKind, (i & 128) != 0 ? QCStatus.OPEN : qCStatus, (i & 256) == 0 ? str7 : null);
    }
}
