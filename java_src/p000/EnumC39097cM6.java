package p000;

import android.support.annotation.NonNull;
/* renamed from: cM6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC39097cM6 {
    AUDIT_JSON_URL("https://c.paypal.com/r/v1/device/mg-audit"),
    DEVICE_INFO_URL("https://c.paypal.com/r/v1/device/client-metadata"),
    PRODUCTION_BEACON_URL("https://b.stats.paypal.com/counter.cgi"),
    PRODUCTION_JSON_URL("https://c.paypal.com/r/v1/device/mg"),
    RAMP_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rac.json"),
    REMOTE_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rec.json"),
    SANDBOX_DEVICE_INFO_URL("https://c.sandbox.paypal.com/r/v1/device/client-metadata"),
    SANDBOX_S_URL("https://c.sandbox.paypal.com/r/v1/device/s"),
    SENSOR_URL("https://c.paypal.com/r/v1/device/s"),
    STAGE_AUDIT_JSON_URL("https://www.stage2du13.stage.paypal.com/r/v1/device/mg-audit"),
    STAGE_PROD_JSON_URL("https://www.stage2du13.stage.paypal.com/r/v1/device/mg");
    

    /* renamed from: b */
    public final String f60459b;

    EnumC39097cM6(String str) {
        this.f60459b = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f60459b;
    }
}
