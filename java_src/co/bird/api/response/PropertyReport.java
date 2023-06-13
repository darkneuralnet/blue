package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PropertyReportAction;
import co.bird.android.model.PropertyReportNextStep;
import co.bird.android.model.PropertyReportStatus;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u0093\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u00107\u001a\u000208HÖ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000208HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000208HÖ\u0001R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006D"}, m28432d2 = {"Lco/bird/api/response/PropertyReport;", "Landroid/os/Parcelable;", "id", "", "userId", "birdId", "cannotAccessReportId", "roleId", "location", "Lco/bird/android/model/wire/WireLocation;", "status", "Lco/bird/android/model/PropertyReportStatus;", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "resolvedAt", "action", "Lco/bird/android/model/PropertyReportAction;", "nextStep", "Lco/bird/android/model/PropertyReportNextStep;", "notes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/PropertyReportStatus;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/PropertyReportAction;Lco/bird/android/model/PropertyReportNextStep;Ljava/lang/String;)V", "getAction", "()Lco/bird/android/model/PropertyReportAction;", "getBirdId", "()Ljava/lang/String;", "getCannotAccessReportId", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNextStep", "()Lco/bird/android/model/PropertyReportNextStep;", "getNotes", "getResolvedAt", "getRoleId", "getStatus", "()Lco/bird/android/model/PropertyReportStatus;", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PropertyReport implements Parcelable {
    public static final Parcelable.Creator<PropertyReport> CREATOR = new Creator();
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final PropertyReportAction action;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("cannot_access_report_id")
    @InterfaceC41208ft5("cannot_access_report_id")
    private final String cannotAccessReportId;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68224id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("next_step")
    @InterfaceC41208ft5("next_step")
    private final PropertyReportNextStep nextStep;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("resolved_at")
    @InterfaceC41208ft5("resolved_at")
    private final DateTime resolvedAt;
    @JsonProperty("role_id")
    @InterfaceC41208ft5("role_id")
    private final String roleId;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final PropertyReportStatus status;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PropertyReport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyReport createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PropertyReport(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (WireLocation) parcel.readParcelable(PropertyReport.class.getClassLoader()), (PropertyReportStatus) parcel.readParcelable(PropertyReport.class.getClassLoader()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), PropertyReportAction.valueOf(parcel.readString()), PropertyReportNextStep.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyReport[] newArray(int i) {
            return new PropertyReport[i];
        }
    }

    public PropertyReport(String id, String userId, String birdId, String str, String str2, WireLocation location, PropertyReportStatus status, DateTime createdAt, DateTime updatedAt, DateTime dateTime, PropertyReportAction action, PropertyReportNextStep nextStep, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f68224id = id;
        this.userId = userId;
        this.birdId = birdId;
        this.cannotAccessReportId = str;
        this.roleId = str2;
        this.location = location;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.resolvedAt = dateTime;
        this.action = action;
        this.nextStep = nextStep;
        this.notes = str3;
    }

    public final String component1() {
        return this.f68224id;
    }

    public final DateTime component10() {
        return this.resolvedAt;
    }

    public final PropertyReportAction component11() {
        return this.action;
    }

    public final PropertyReportNextStep component12() {
        return this.nextStep;
    }

    public final String component13() {
        return this.notes;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.birdId;
    }

    public final String component4() {
        return this.cannotAccessReportId;
    }

    public final String component5() {
        return this.roleId;
    }

    public final WireLocation component6() {
        return this.location;
    }

    public final PropertyReportStatus component7() {
        return this.status;
    }

    public final DateTime component8() {
        return this.createdAt;
    }

    public final DateTime component9() {
        return this.updatedAt;
    }

    public final PropertyReport copy(String id, String userId, String birdId, String str, String str2, WireLocation location, PropertyReportStatus status, DateTime createdAt, DateTime updatedAt, DateTime dateTime, PropertyReportAction action, PropertyReportNextStep nextStep, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        return new PropertyReport(id, userId, birdId, str, str2, location, status, createdAt, updatedAt, dateTime, action, nextStep, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PropertyReport) {
            PropertyReport propertyReport = (PropertyReport) obj;
            return Intrinsics.areEqual(this.f68224id, propertyReport.f68224id) && Intrinsics.areEqual(this.userId, propertyReport.userId) && Intrinsics.areEqual(this.birdId, propertyReport.birdId) && Intrinsics.areEqual(this.cannotAccessReportId, propertyReport.cannotAccessReportId) && Intrinsics.areEqual(this.roleId, propertyReport.roleId) && Intrinsics.areEqual(this.location, propertyReport.location) && this.status == propertyReport.status && Intrinsics.areEqual(this.createdAt, propertyReport.createdAt) && Intrinsics.areEqual(this.updatedAt, propertyReport.updatedAt) && Intrinsics.areEqual(this.resolvedAt, propertyReport.resolvedAt) && this.action == propertyReport.action && this.nextStep == propertyReport.nextStep && Intrinsics.areEqual(this.notes, propertyReport.notes);
        }
        return false;
    }

    public final PropertyReportAction getAction() {
        return this.action;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getCannotAccessReportId() {
        return this.cannotAccessReportId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68224id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final PropertyReportNextStep getNextStep() {
        return this.nextStep;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final DateTime getResolvedAt() {
        return this.resolvedAt;
    }

    public final String getRoleId() {
        return this.roleId;
    }

    public final PropertyReportStatus getStatus() {
        return this.status;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((this.f68224id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.birdId.hashCode()) * 31;
        String str = this.cannotAccessReportId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.roleId;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.location.hashCode()) * 31) + this.status.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        DateTime dateTime = this.resolvedAt;
        int hashCode4 = (((((hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.action.hashCode()) * 31) + this.nextStep.hashCode()) * 31;
        String str3 = this.notes;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68224id;
        String str2 = this.userId;
        String str3 = this.birdId;
        String str4 = this.cannotAccessReportId;
        String str5 = this.roleId;
        WireLocation wireLocation = this.location;
        PropertyReportStatus propertyReportStatus = this.status;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        DateTime dateTime3 = this.resolvedAt;
        PropertyReportAction propertyReportAction = this.action;
        PropertyReportNextStep propertyReportNextStep = this.nextStep;
        String str6 = this.notes;
        return "PropertyReport(id=" + str + ", userId=" + str2 + ", birdId=" + str3 + ", cannotAccessReportId=" + str4 + ", roleId=" + str5 + ", location=" + wireLocation + ", status=" + propertyReportStatus + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", resolvedAt=" + dateTime3 + ", action=" + propertyReportAction + ", nextStep=" + propertyReportNextStep + ", notes=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f68224id);
        out.writeString(this.userId);
        out.writeString(this.birdId);
        out.writeString(this.cannotAccessReportId);
        out.writeString(this.roleId);
        out.writeParcelable(this.location, i);
        out.writeParcelable(this.status, i);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        out.writeSerializable(this.resolvedAt);
        out.writeString(this.action.name());
        out.writeString(this.nextStep.name());
        out.writeString(this.notes);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PropertyReport(String str, String str2, String str3, String str4, String str5, WireLocation wireLocation, PropertyReportStatus propertyReportStatus, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, PropertyReportAction propertyReportAction, PropertyReportNextStep propertyReportNextStep, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, r7, r8, wireLocation, r10, r11, r12, (i & 512) != 0 ? null : dateTime3, propertyReportAction, propertyReportNextStep, (i & 4096) != 0 ? null : str6);
        DateTime dateTime4;
        DateTime dateTime5;
        String str7 = (i & 1) != 0 ? "" : str;
        String str8 = (i & 2) != 0 ? "" : str2;
        String str9 = (i & 4) != 0 ? "" : str3;
        String str10 = (i & 8) != 0 ? null : str4;
        String str11 = (i & 16) != 0 ? null : str5;
        PropertyReportStatus propertyReportStatus2 = (i & 64) != 0 ? PropertyReportStatus.OPEN : propertyReportStatus;
        if ((i & 128) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
        if ((i & 256) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime5 = now2;
        } else {
            dateTime5 = dateTime2;
        }
    }
}
