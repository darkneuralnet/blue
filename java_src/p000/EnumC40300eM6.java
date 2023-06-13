package p000;

import android.support.annotation.NonNull;
/* renamed from: eM6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC40300eM6 {
    CONF_VERSION("conf_version"),
    CONF_ENDPOINT_URL("endpoint_url"),
    CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
    ANDROID_APPS_TO_CHECK("android_apps_to_check"),
    NOT_COLLECTABLE("nc"),
    MG_ID("m"),
    SENSOR_COLLECT_TIME("s");
    

    /* renamed from: b */
    public final String f78277b;

    EnumC40300eM6(String str) {
        this.f78277b = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f78277b;
    }
}
