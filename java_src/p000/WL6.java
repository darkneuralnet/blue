package p000;

import android.support.annotation.NonNull;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.PaymentMethodOptionsParams;
/* renamed from: WL6 */
/* loaded from: classes8.dex */
public enum WL6 {
    ANDROID_ID("android_id"),
    APP_FIRST_INSTALL_TIME("app_first_install_time"),
    APP_GUID("app_guid"),
    APP_ID(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID),
    APP_LAST_UPDATE_TIME("app_last_update_time"),
    APP_VERSION(AnalyticsFields.APP_VERSION),
    COMP_VERSION("comp_version"),
    CONF_URL("conf_url"),
    CPU("cpu"),
    DEVICE_MODEL("device_model"),
    DEVICE_NAME("device_name"),
    DISK("disk"),
    EMULATOR_FLAGS("ef"),
    GSF_ID("gsf_id"),
    IN_TREATMENT("t"),
    IS_EMULATOR("is_emulator"),
    IS_ROOTED("is_rooted"),
    MAC_ADDRS("mac_addrs"),
    MAGNES_GUID("magnes_guid"),
    MAGNES_SOURCE("magnes_source"),
    NOT_COLLECTIBLE_LIST("nc"),
    NOTIF_TOKEN("notif_token"),
    OS_TYPE("os_type"),
    OS_VERSION(AnalyticsFields.OS_VERSION),
    PAYLOAD_TYPE("payload_type"),
    ROOTED_FLAGS("rf"),
    SCREEN("screen"),
    SENSOR_METADATA("smd"),
    SMS_ENABLED("sms_enabled"),
    SOURCE_APP_VERSION("source_app_version"),
    SYSTEM("system"),
    T("t"),
    TOTAL_STORAGE_SPACE("total_storage_space"),
    USER_AGENT("user_agent");
    

    /* renamed from: b */
    public final String f40821b;

    /* renamed from: WL6$a */
    /* loaded from: classes8.dex */
    public enum EnumC8991a {
        CORES("cores"),
        MAX_FREQUENCY("maxFreq"),
        MIN_FREQUENCY("minFreq");
        

        /* renamed from: b */
        public final String f40826b;

        EnumC8991a(String str) {
            this.f40826b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40826b;
        }
    }

    /* renamed from: WL6$b */
    /* loaded from: classes8.dex */
    public enum EnumC8992b {
        TOTAL_SD("total_sd"),
        TOTAL_UD("total_ud");
        

        /* renamed from: b */
        public final String f40830b;

        EnumC8992b(String str) {
            this.f40830b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40830b;
        }
    }

    /* renamed from: WL6$c */
    /* loaded from: classes8.dex */
    public enum EnumC8993c {
        ANDROID_SDK_BUILD_FOR_X86("Android SDK built for x86"),
        ANDROID_X86("android_x86"),
        ANDY("andy"),
        ANDY_OS("AndyOS"),
        ANDY_OSX("AndyOSX"),
        DRIOD_4X("Driod4X"),
        DROID_4X("Droid4X"),
        GENERIC("generic"),
        GENERIC_X86("generic_x86"),
        GENY_MOTION("Genymotion"),
        GOLDFISH("goldfish"),
        GOODLE_SDK("google_sdk"),
        SDK(SdkAction.ACTION_TYPE),
        UNKNOWN("unknown"),
        VBOX_86("vbox86"),
        VBOX_86P("vbox86p"),
        RANCHU("ranchu"),
        REMIXEMU("remixemu"),
        TTVM_X86("ttVM_x86");
        

        /* renamed from: b */
        public final String f40851b;

        EnumC8993c(String str) {
            this.f40851b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40851b;
        }
    }

    /* renamed from: WL6$d */
    /* loaded from: classes8.dex */
    public enum EnumC8994d {
        DENSITY("density"),
        DENSITY_DPI("densityDpi"),
        HEIGHT("height"),
        SCALE("scale"),
        WIDTH("width"),
        X_DPI("xdpi"),
        Y_DPI("ydpi");
        

        /* renamed from: b */
        public final String f40860b;

        EnumC8994d(String str) {
            this.f40860b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40860b;
        }
    }

    /* renamed from: WL6$e */
    /* loaded from: classes8.dex */
    public enum EnumC8995e {
        FIFO_MAX_EVENT_COUNT("mec"),
        MAX_RANGE("mr"),
        NAME("n"),
        POWER("pwr"),
        RESOLUTION("re"),
        VENDOR("v"),
        VERSION("ver");
        

        /* renamed from: b */
        public final String f40869b;

        EnumC8995e(String str) {
            this.f40869b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40869b;
        }
    }

    /* renamed from: WL6$f */
    /* loaded from: classes8.dex */
    public enum EnumC8996f {
        VERSION("version"),
        BOARD("board"),
        BOOTLOADER("bootloader"),
        CPU_ABI1("cpu_abi1"),
        DISPLAY("display"),
        RADIO("radio"),
        FINGERPRINT("fingerprint"),
        HARDWARE("hardware"),
        MANUFACTURER("manufacturer"),
        PRODUCT("product"),
        TIME("time"),
        SYSTEM_TYPE("system_type");
        

        /* renamed from: b */
        public final String f40883b;

        EnumC8996f(String str) {
            this.f40883b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f40883b;
        }
    }

    WL6(String str) {
        this.f40821b = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f40821b;
    }
}
