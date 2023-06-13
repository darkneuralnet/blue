package co.bird.android.model.constant;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/constant/Permission;", "", "requestCode", "", "permission", "", "rationale", "(Ljava/lang/String;IILjava/lang/String;I)V", "getPermission", "()Ljava/lang/String;", "getRationale", "()I", "getRequestCode", "ACCESS_FINE_LOCATION", "CAMERA", "WRITE_EXTERNAL_STORAGE", "CAMERA_GENERIC", "ACCESS_WIFI_STATE", "POST_NOTIFICATION", "BLUETOOTH_SCAN", "BLUETOOTH_CONNECT", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum Permission {
    ACCESS_FINE_LOCATION(778, "android.permission.ACCESS_FINE_LOCATION", C45871nl4.permission_rationale_location),
    CAMERA(779, "android.permission.CAMERA", C45871nl4.permission_rationale_camera),
    WRITE_EXTERNAL_STORAGE(780, "android.permission.WRITE_EXTERNAL_STORAGE", C45871nl4.permission_rationale_write),
    CAMERA_GENERIC(781, "android.permission.CAMERA", C45871nl4.permission_camera_required_message),
    ACCESS_WIFI_STATE(783, "android.permission.ACCESS_WIFI_STATE", C46464ol4.empty),
    POST_NOTIFICATION(784, "android.permission.POST_NOTIFICATIONS", C45871nl4.permission_rationale_post_notification),
    BLUETOOTH_SCAN(785, "android.permission.BLUETOOTH_SCAN", C45871nl4.permission_rationale_scan_bluetooth),
    BLUETOOTH_CONNECT(785, "android.permission.BLUETOOTH_CONNECT", C45871nl4.permission_rationale_bluetooth);
    
    private final String permission;
    private final int rationale;
    private final int requestCode;

    Permission(int i, String str, int i2) {
        this.requestCode = i;
        this.permission = str;
        this.rationale = i2;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final int getRationale() {
        return this.rationale;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }
}
