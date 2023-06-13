package co.bird.android.model;

import co.bird.android.model.constant.Permission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28432d2 = {"toMetadataStr", "", "Lco/bird/android/model/PermissionStatus;", "permission", "Lco/bird/android/model/constant/Permission;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PermissionStatusKt {
    public static final String toMetadataStr(PermissionStatus permissionStatus, Permission permission) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (permissionStatus == PermissionStatus.GRANTED) {
            if (permission == Permission.ACCESS_FINE_LOCATION) {
                return "authorized_always";
            }
            return "authorized";
        }
        return permissionStatus.toString();
    }
}
