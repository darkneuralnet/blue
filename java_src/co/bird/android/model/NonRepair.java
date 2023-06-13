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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003Je\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006/"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "Landroid/os/Parcelable;", "display", "", "description", "status", "allowRepairs", "", "selected", "notes", "reasons", "", "Lco/bird/android/model/NonRepairReason;", "notificationOnly", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Z)V", "getAllowRepairs", "()Z", "getDescription", "()Ljava/lang/String;", "getDisplay", "getNotes", "getNotificationOnly", "getReasons", "()Ljava/util/List;", "getSelected", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NonRepair implements Parcelable {
    public static final Parcelable.Creator<NonRepair> CREATOR = new Creator();
    @JsonProperty("allow_repairs")
    @InterfaceC41208ft5("allow_repairs")
    private final boolean allowRepairs;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("display")
    @InterfaceC41208ft5("display")
    private final String display;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("notification_only")
    @InterfaceC41208ft5("notification_only")
    private final boolean notificationOnly;
    @JsonProperty("reasons")
    @InterfaceC41208ft5("reasons")
    private final List<NonRepairReason> reasons;
    @JsonProperty("selected")
    @InterfaceC41208ft5("selected")
    private final boolean selected;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final String status;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<NonRepair> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonRepair createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(NonRepairReason.CREATOR.createFromParcel(parcel));
            }
            return new NonRepair(readString, readString2, readString3, z, z2, readString4, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonRepair[] newArray(int i) {
            return new NonRepair[i];
        }
    }

    public NonRepair() {
        this(null, null, null, false, false, null, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.display;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.status;
    }

    public final boolean component4() {
        return this.allowRepairs;
    }

    public final boolean component5() {
        return this.selected;
    }

    public final String component6() {
        return this.notes;
    }

    public final List<NonRepairReason> component7() {
        return this.reasons;
    }

    public final boolean component8() {
        return this.notificationOnly;
    }

    public final NonRepair copy(String str, String str2, String status, boolean z, boolean z2, String str3, List<NonRepairReason> reasons, boolean z3) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new NonRepair(str, str2, status, z, z2, str3, reasons, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NonRepair) {
            NonRepair nonRepair = (NonRepair) obj;
            return Intrinsics.areEqual(this.display, nonRepair.display) && Intrinsics.areEqual(this.description, nonRepair.description) && Intrinsics.areEqual(this.status, nonRepair.status) && this.allowRepairs == nonRepair.allowRepairs && this.selected == nonRepair.selected && Intrinsics.areEqual(this.notes, nonRepair.notes) && Intrinsics.areEqual(this.reasons, nonRepair.reasons) && this.notificationOnly == nonRepair.notificationOnly;
        }
        return false;
    }

    public final boolean getAllowRepairs() {
        return this.allowRepairs;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final boolean getNotificationOnly() {
        return this.notificationOnly;
    }

    public final List<NonRepairReason> getReasons() {
        return this.reasons;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.display;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.status.hashCode()) * 31;
        boolean z = this.allowRepairs;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.selected;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str3 = this.notes;
        int hashCode3 = (((i4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.reasons.hashCode()) * 31;
        boolean z3 = this.notificationOnly;
        return hashCode3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        String str = this.display;
        String str2 = this.description;
        String str3 = this.status;
        boolean z = this.allowRepairs;
        boolean z2 = this.selected;
        String str4 = this.notes;
        List<NonRepairReason> list = this.reasons;
        boolean z3 = this.notificationOnly;
        return "NonRepair(display=" + str + ", description=" + str2 + ", status=" + str3 + ", allowRepairs=" + z + ", selected=" + z2 + ", notes=" + str4 + ", reasons=" + list + ", notificationOnly=" + z3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.display);
        out.writeString(this.description);
        out.writeString(this.status);
        out.writeInt(this.allowRepairs ? 1 : 0);
        out.writeInt(this.selected ? 1 : 0);
        out.writeString(this.notes);
        List<NonRepairReason> list = this.reasons;
        out.writeInt(list.size());
        for (NonRepairReason nonRepairReason : list) {
            nonRepairReason.writeToParcel(out, i);
        }
        out.writeInt(this.notificationOnly ? 1 : 0);
    }

    public NonRepair(String str, String str2, String status, boolean z, boolean z2, String str3, List<NonRepairReason> reasons, boolean z3) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.display = str;
        this.description = str2;
        this.status = status;
        this.allowRepairs = z;
        this.selected = z2;
        this.notes = str3;
        this.reasons = reasons;
        this.notificationOnly = z3;
    }

    public /* synthetic */ NonRepair(String str, String str2, String str3, boolean z, boolean z2, String str4, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? str4 : null, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 128) == 0 ? z3 : false);
    }
}
