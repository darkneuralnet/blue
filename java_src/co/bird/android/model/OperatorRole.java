package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/OperatorRole;", "Landroid/os/Parcelable;", "role", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getRole", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "toUserRoleItem", "Lco/bird/android/model/UserRoleItem;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorRole implements Parcelable {
    public static final Parcelable.Creator<OperatorRole> CREATOR = new Creator();
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final String role;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<OperatorRole> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OperatorRole createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OperatorRole(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OperatorRole[] newArray(int i) {
            return new OperatorRole[i];
        }
    }

    public OperatorRole() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OperatorRole copy$default(OperatorRole operatorRole, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorRole.role;
        }
        if ((i & 2) != 0) {
            str2 = operatorRole.title;
        }
        return operatorRole.copy(str, str2);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.title;
    }

    public final OperatorRole copy(String role, String title) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(title, "title");
        return new OperatorRole(role, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorRole) {
            OperatorRole operatorRole = (OperatorRole) obj;
            return Intrinsics.areEqual(this.role, operatorRole.role) && Intrinsics.areEqual(this.title, operatorRole.title);
        }
        return false;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.role.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        String str = this.role;
        String str2 = this.title;
        return "OperatorRole(role=" + str + ", title=" + str2 + ")";
    }

    public final UserRoleItem toUserRoleItem() {
        return new UserRoleItem(UserRole.OPERATOR, this.role, this.title, null, 8, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.role);
        out.writeString(this.title);
    }

    public OperatorRole(String role, String title) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(title, "title");
        this.role = role;
        this.title = title;
    }

    public /* synthetic */ OperatorRole(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}