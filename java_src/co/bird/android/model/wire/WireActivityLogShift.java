package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\u0010\u0010\"\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/WireActivityLogShift;", "Landroid/os/Parcelable;", "id", "", "date", "Lorg/joda/time/DateTime;", "formattedDate", "formattedShiftTime", "totalTasks", "", "tasksPerHour", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;II)V", "getDate", "()Lorg/joda/time/DateTime;", "getFormattedDate", "()Ljava/lang/String;", "getFormattedShiftTime", "getId", "getTasksPerHour", "()I", "getTotalTasks", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "isSame", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireActivityLogShift implements Parcelable {
    public static final Parcelable.Creator<WireActivityLogShift> CREATOR = new Creator();
    @JsonProperty("date")
    @InterfaceC41208ft5("date")
    private final DateTime date;
    @JsonProperty("formatted_date")
    @InterfaceC41208ft5("formatted_date")
    private final String formattedDate;
    @JsonProperty("formatted_shift_time")
    @InterfaceC41208ft5("formatted_shift_time")
    private final String formattedShiftTime;
    @JsonProperty("shift_id")
    @InterfaceC41208ft5("shift_id")

    /* renamed from: id */
    private final String f66711id;
    @JsonProperty("tasks_per_hour")
    @InterfaceC41208ft5("tasks_per_hour")
    private final int tasksPerHour;
    @JsonProperty("total_tasks")
    @InterfaceC41208ft5("total_tasks")
    private final int totalTasks;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireActivityLogShift> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireActivityLogShift createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireActivityLogShift(parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireActivityLogShift[] newArray(int i) {
            return new WireActivityLogShift[i];
        }
    }

    public WireActivityLogShift() {
        this(null, null, null, null, 0, 0, 63, null);
    }

    public static /* synthetic */ WireActivityLogShift copy$default(WireActivityLogShift wireActivityLogShift, String str, DateTime dateTime, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = wireActivityLogShift.f66711id;
        }
        if ((i3 & 2) != 0) {
            dateTime = wireActivityLogShift.date;
        }
        DateTime dateTime2 = dateTime;
        if ((i3 & 4) != 0) {
            str2 = wireActivityLogShift.formattedDate;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = wireActivityLogShift.formattedShiftTime;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i = wireActivityLogShift.totalTasks;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = wireActivityLogShift.tasksPerHour;
        }
        return wireActivityLogShift.copy(str, dateTime2, str4, str5, i4, i2);
    }

    public final String component1() {
        return this.f66711id;
    }

    public final DateTime component2() {
        return this.date;
    }

    public final String component3() {
        return this.formattedDate;
    }

    public final String component4() {
        return this.formattedShiftTime;
    }

    public final int component5() {
        return this.totalTasks;
    }

    public final int component6() {
        return this.tasksPerHour;
    }

    public final WireActivityLogShift copy(String str, DateTime dateTime, String formattedDate, String formattedShiftTime, int i, int i2) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(formattedShiftTime, "formattedShiftTime");
        return new WireActivityLogShift(str, dateTime, formattedDate, formattedShiftTime, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireActivityLogShift) {
            WireActivityLogShift wireActivityLogShift = (WireActivityLogShift) obj;
            return Intrinsics.areEqual(this.f66711id, wireActivityLogShift.f66711id) && Intrinsics.areEqual(this.date, wireActivityLogShift.date) && Intrinsics.areEqual(this.formattedDate, wireActivityLogShift.formattedDate) && Intrinsics.areEqual(this.formattedShiftTime, wireActivityLogShift.formattedShiftTime) && this.totalTasks == wireActivityLogShift.totalTasks && this.tasksPerHour == wireActivityLogShift.tasksPerHour;
        }
        return false;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final String getFormattedShiftTime() {
        return this.formattedShiftTime;
    }

    public final String getId() {
        return this.f66711id;
    }

    public final int getTasksPerHour() {
        return this.tasksPerHour;
    }

    public final int getTotalTasks() {
        return this.totalTasks;
    }

    public int hashCode() {
        String str = this.f66711id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.date;
        return ((((((((hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31) + this.formattedDate.hashCode()) * 31) + this.formattedShiftTime.hashCode()) * 31) + Integer.hashCode(this.totalTasks)) * 31) + Integer.hashCode(this.tasksPerHour);
    }

    public final boolean isSame(WireActivityLogShift wireActivityLogShift) {
        boolean z;
        DateTime dateTime;
        if (wireActivityLogShift == null) {
            return false;
        }
        String str = this.f66711id;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String str2 = wireActivityLogShift.f66711id;
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return Intrinsics.areEqual(this.f66711id, wireActivityLogShift.f66711id);
            }
        }
        DateTime dateTime2 = this.date;
        if (dateTime2 == null || (dateTime = wireActivityLogShift.date) == null) {
            return false;
        }
        return Intrinsics.areEqual(dateTime2, dateTime);
    }

    public String toString() {
        String str = this.f66711id;
        DateTime dateTime = this.date;
        String str2 = this.formattedDate;
        String str3 = this.formattedShiftTime;
        int i = this.totalTasks;
        int i2 = this.tasksPerHour;
        return "WireActivityLogShift(id=" + str + ", date=" + dateTime + ", formattedDate=" + str2 + ", formattedShiftTime=" + str3 + ", totalTasks=" + i + ", tasksPerHour=" + i2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66711id);
        out.writeSerializable(this.date);
        out.writeString(this.formattedDate);
        out.writeString(this.formattedShiftTime);
        out.writeInt(this.totalTasks);
        out.writeInt(this.tasksPerHour);
    }

    public WireActivityLogShift(String str, DateTime dateTime, String formattedDate, String formattedShiftTime, int i, int i2) {
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        Intrinsics.checkNotNullParameter(formattedShiftTime, "formattedShiftTime");
        this.f66711id = str;
        this.date = dateTime;
        this.formattedDate = formattedDate;
        this.formattedShiftTime = formattedShiftTime;
        this.totalTasks = i;
        this.tasksPerHour = i2;
    }

    public /* synthetic */ WireActivityLogShift(String str, DateTime dateTime, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) == 0 ? dateTime : null, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }
}
