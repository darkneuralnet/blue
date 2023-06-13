package co.bird.android.model;

import co.bird.android.model.constant.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/UserRoleItem;", "", "userRole", "Lco/bird/android/model/constant/UserRole;", "userRoleCode", "", "userRoleTitle", "userRoleTitleStringRes", "", "(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getUserRole", "()Lco/bird/android/model/constant/UserRole;", "getUserRoleCode", "()Ljava/lang/String;", "getUserRoleTitle", "getUserRoleTitleStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lco/bird/android/model/constant/UserRole;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/UserRoleItem;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserRoleItem {
    @JsonProperty("user_role")
    @InterfaceC41208ft5("user_role")
    private final UserRole userRole;
    @JsonProperty("user_role_code")
    @InterfaceC41208ft5("user_role_code")
    private final String userRoleCode;
    @JsonProperty("user_role_title")
    @InterfaceC41208ft5("user_role_title")
    private final String userRoleTitle;
    @JsonProperty("user_role_title_string_res")
    @InterfaceC41208ft5("user_role_title_string_res")
    private final Integer userRoleTitleStringRes;

    public UserRoleItem(UserRole userRole, String userRoleCode, String str, Integer num) {
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(userRoleCode, "userRoleCode");
        this.userRole = userRole;
        this.userRoleCode = userRoleCode;
        this.userRoleTitle = str;
        this.userRoleTitleStringRes = num;
    }

    public static /* synthetic */ UserRoleItem copy$default(UserRoleItem userRoleItem, UserRole userRole, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            userRole = userRoleItem.userRole;
        }
        if ((i & 2) != 0) {
            str = userRoleItem.userRoleCode;
        }
        if ((i & 4) != 0) {
            str2 = userRoleItem.userRoleTitle;
        }
        if ((i & 8) != 0) {
            num = userRoleItem.userRoleTitleStringRes;
        }
        return userRoleItem.copy(userRole, str, str2, num);
    }

    public final UserRole component1() {
        return this.userRole;
    }

    public final String component2() {
        return this.userRoleCode;
    }

    public final String component3() {
        return this.userRoleTitle;
    }

    public final Integer component4() {
        return this.userRoleTitleStringRes;
    }

    public final UserRoleItem copy(UserRole userRole, String userRoleCode, String str, Integer num) {
        Intrinsics.checkNotNullParameter(userRole, "userRole");
        Intrinsics.checkNotNullParameter(userRoleCode, "userRoleCode");
        return new UserRoleItem(userRole, userRoleCode, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserRoleItem) {
            UserRoleItem userRoleItem = (UserRoleItem) obj;
            return this.userRole == userRoleItem.userRole && Intrinsics.areEqual(this.userRoleCode, userRoleItem.userRoleCode) && Intrinsics.areEqual(this.userRoleTitle, userRoleItem.userRoleTitle) && Intrinsics.areEqual(this.userRoleTitleStringRes, userRoleItem.userRoleTitleStringRes);
        }
        return false;
    }

    public final UserRole getUserRole() {
        return this.userRole;
    }

    public final String getUserRoleCode() {
        return this.userRoleCode;
    }

    public final String getUserRoleTitle() {
        return this.userRoleTitle;
    }

    public final Integer getUserRoleTitleStringRes() {
        return this.userRoleTitleStringRes;
    }

    public int hashCode() {
        int hashCode = ((this.userRole.hashCode() * 31) + this.userRoleCode.hashCode()) * 31;
        String str = this.userRoleTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.userRoleTitleStringRes;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        UserRole userRole = this.userRole;
        String str = this.userRoleCode;
        String str2 = this.userRoleTitle;
        Integer num = this.userRoleTitleStringRes;
        return "UserRoleItem(userRole=" + userRole + ", userRoleCode=" + str + ", userRoleTitle=" + str2 + ", userRoleTitleStringRes=" + num + ")";
    }

    public /* synthetic */ UserRoleItem(UserRole userRole, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userRole, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
