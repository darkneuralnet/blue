package co.bird.android.model;

import co.bird.android.model.constant.UserRole;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0006"}, m28432d2 = {"getCode", "", "Lco/bird/android/model/constant/UserRole;", "getRoleParam", "Lco/bird/android/model/UserRoleItem;", "toUserRoleItem", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserRoleItemKt {
    public static final String getCode(UserRole userRole) {
        Intrinsics.checkNotNullParameter(userRole, "<this>");
        String name = userRole.name();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final String getRoleParam(UserRoleItem userRoleItem) {
        boolean equals;
        Intrinsics.checkNotNullParameter(userRoleItem, "<this>");
        if (userRoleItem.getUserRole() == UserRole.OPERATOR) {
            equals = StringsKt__StringsJVMKt.equals(getCode(userRoleItem.getUserRole()), userRoleItem.getUserRoleCode(), true);
            if (!equals) {
                return userRoleItem.getUserRoleCode();
            }
        }
        return null;
    }

    public static final UserRoleItem toUserRoleItem(UserRole userRole) {
        Intrinsics.checkNotNullParameter(userRole, "<this>");
        return new UserRoleItem(userRole, getCode(userRole), null, null, 12, null);
    }
}
