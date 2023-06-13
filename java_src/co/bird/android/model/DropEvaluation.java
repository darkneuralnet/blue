package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/DropEvaluation;", "Landroid/os/Parcelable;", "id", "", "dropId", "userId", "dropIssues", "", "Lco/bird/android/model/WireDropIssue;", "notes", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDropId", "()Ljava/lang/String;", "getDropIssues", "()Ljava/util/List;", "getId", "getNotes", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DropEvaluation implements Parcelable {
    public static final Parcelable.Creator<DropEvaluation> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("drop_id")
    @InterfaceC41208ft5("drop_id")
    private final String dropId;
    @JsonProperty("drop_issues")
    @InterfaceC41208ft5("drop_issues")
    private final List<WireDropIssue> dropIssues;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66591id;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DropEvaluation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropEvaluation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(WireDropIssue.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new DropEvaluation(readString, readString2, readString3, arrayList, parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DropEvaluation[] newArray(int i) {
            return new DropEvaluation[i];
        }
    }

    public DropEvaluation() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DropEvaluation copy$default(DropEvaluation dropEvaluation, String str, String str2, String str3, List list, String str4, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dropEvaluation.f66591id;
        }
        if ((i & 2) != 0) {
            str2 = dropEvaluation.dropId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = dropEvaluation.userId;
        }
        String str6 = str3;
        List<WireDropIssue> list2 = list;
        if ((i & 8) != 0) {
            list2 = dropEvaluation.dropIssues;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = dropEvaluation.notes;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            dateTime = dropEvaluation.createdAt;
        }
        return dropEvaluation.copy(str, str5, str6, list3, str7, dateTime);
    }

    public final String component1() {
        return this.f66591id;
    }

    public final String component2() {
        return this.dropId;
    }

    public final String component3() {
        return this.userId;
    }

    public final List<WireDropIssue> component4() {
        return this.dropIssues;
    }

    public final String component5() {
        return this.notes;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final DropEvaluation copy(String id, String str, String str2, List<WireDropIssue> list, String str3, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new DropEvaluation(id, str, str2, list, str3, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropEvaluation) {
            DropEvaluation dropEvaluation = (DropEvaluation) obj;
            return Intrinsics.areEqual(this.f66591id, dropEvaluation.f66591id) && Intrinsics.areEqual(this.dropId, dropEvaluation.dropId) && Intrinsics.areEqual(this.userId, dropEvaluation.userId) && Intrinsics.areEqual(this.dropIssues, dropEvaluation.dropIssues) && Intrinsics.areEqual(this.notes, dropEvaluation.notes) && Intrinsics.areEqual(this.createdAt, dropEvaluation.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getDropId() {
        return this.dropId;
    }

    public final List<WireDropIssue> getDropIssues() {
        return this.dropIssues;
    }

    public final String getId() {
        return this.f66591id;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.f66591id.hashCode() * 31;
        String str = this.dropId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<WireDropIssue> list = this.dropIssues;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.notes;
        return ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66591id;
        String str2 = this.dropId;
        String str3 = this.userId;
        List<WireDropIssue> list = this.dropIssues;
        String str4 = this.notes;
        DateTime dateTime = this.createdAt;
        return "DropEvaluation(id=" + str + ", dropId=" + str2 + ", userId=" + str3 + ", dropIssues=" + list + ", notes=" + str4 + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66591id);
        out.writeString(this.dropId);
        out.writeString(this.userId);
        List<WireDropIssue> list = this.dropIssues;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (WireDropIssue wireDropIssue : list) {
                wireDropIssue.writeToParcel(out, i);
            }
        }
        out.writeString(this.notes);
        out.writeSerializable(this.createdAt);
    }

    public DropEvaluation(String id, String str, String str2, List<WireDropIssue> list, String str3, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66591id = id;
        this.dropId = str;
        this.userId = str2;
        this.dropIssues = list;
        this.notes = str3;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DropEvaluation(String str, String str2, String str3, List list, String str4, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r12, r1, r2, r0, dateTime);
        str = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        List emptyList = (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        String str7 = (i & 16) == 0 ? str4 : null;
        if ((i & 32) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
