package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\b\u0010\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001d\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "(Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "apiVersion", "", "(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V", "marketOrRegionRestrictionParams", "", "", "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations", "()V", "getMarketOrRegionRestrictionParams$3ds2sdk_release", "()Ljava/util/Map;", "permissionParams", "getPermissionParams$3ds2sdk_release$annotations", "getPermissionParams$3ds2sdk_release", "platformVersionParams", "getPlatformVersionParams$3ds2sdk_release$annotations", "getPlatformVersionParams$3ds2sdk_release", "create", "Reason", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DeviceParamNotAvailableFactoryImpl implements DeviceParamNotAvailableFactory {
    private final int apiVersion;
    private final Supplier<HardwareId> hardwareIdSupplier;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MARKET_OR_REGION_RESTRICTION", "PLATFORM_VERSION", "PERMISSION", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Reason {
        MARKET_OR_REGION_RESTRICTION("RE01"),
        PLATFORM_VERSION("RE02"),
        PERMISSION("RE03");
        
        private final String code;

        Reason(String str) {
            this.code = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public DeviceParamNotAvailableFactoryImpl(int i, Supplier<HardwareId> hardwareIdSupplier) {
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
        this.apiVersion = i;
        this.hardwareIdSupplier = hardwareIdSupplier;
    }

    public static /* synthetic */ void getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPermissionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPlatformVersionParams$3ds2sdk_release$annotations() {
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory
    public Map<String, String> create() {
        Map plus;
        Map<String, String> plus2;
        plus = MapsKt__MapsKt.plus(getMarketOrRegionRestrictionParams$3ds2sdk_release(), getPlatformVersionParams$3ds2sdk_release());
        plus2 = MapsKt__MapsKt.plus(plus, getPermissionParams$3ds2sdk_release());
        return plus2;
    }

    public final Map<String, String> getMarketOrRegionRestrictionParams$3ds2sdk_release() {
        List listOf;
        DeviceParam[] values;
        HashMap hashMap = new HashMap();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new DeviceParam[]{DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_HARDWARE_ID, DeviceParam.PARAM_SCREEN_RESOLUTION});
        for (DeviceParam deviceParam : DeviceParam.values()) {
            if (!listOf.contains(deviceParam)) {
                hashMap.put(deviceParam.toString(), Reason.MARKET_OR_REGION_RESTRICTION.toString());
            }
        }
        return hashMap;
    }

    public final Map<String, String> getPermissionParams$3ds2sdk_release() {
        HashMap hashMap = new HashMap();
        String deviceParam = DeviceParam.PARAM_WIFI_MAC.toString();
        Reason reason = Reason.PERMISSION;
        hashMap.put(deviceParam, reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_BSSID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_SSID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_NETWORK_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_P2P_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_TDLS_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_LATITUDE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_LONGITUDE.toString(), reason.toString());
        if (!this.hardwareIdSupplier.get().isPresent()) {
            hashMap.put(DeviceParam.PARAM_HARDWARE_ID.toString(), Reason.PLATFORM_VERSION.toString());
        }
        hashMap.put(DeviceParam.PARAM_DEVICE_NAME.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_ADDRESS.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_BONDED_DEVICE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_IS_ENABLED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_DEVICE_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_SUBSCRIBER_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IMEI_SV.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_GROUP_IDENTIFIER_L1.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_SIM_SERIAL_NUMBER.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_VOICE_MAIL_ALPHA_TAG.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_VOICE_MAIL_NUMBER.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BUILD_SERIAL.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.toString(), reason.toString());
        return hashMap;
    }

    public final Map<String, String> getPlatformVersionParams$3ds2sdk_release() {
        HashMap hashMap = new HashMap();
        if (this.apiVersion < 26) {
            String deviceParam = DeviceParam.PARAM_TELE_IMEI_SV.toString();
            Reason reason = Reason.PLATFORM_VERSION;
            hashMap.put(deviceParam, reason.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_SERIAL.toString(), reason.toString());
            hashMap.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.toString(), reason.toString());
        }
        if (this.apiVersion < 23) {
            String deviceParam2 = DeviceParam.PARAM_TELE_PHONE_COUNT.toString();
            Reason reason2 = Reason.PLATFORM_VERSION;
            hashMap.put(deviceParam2, reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_PREVIEW_SDK_INT.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_SDK_INT.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_SECURITY_PATCH.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_SYSTEM_VIBRATE_WHEN_RINGING.toString(), reason2.toString());
        }
        if (this.apiVersion > 23) {
            hashMap.put(DeviceParam.PARAM_SECURE_SYS_PROP_SETTING_VERSION.toString(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 22) {
            hashMap.put(DeviceParam.PARAM_TELE_IS_VOICE_CAPABLE.toString(), Reason.PLATFORM_VERSION.toString());
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceParamNotAvailableFactoryImpl(Supplier<HardwareId> hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        Intrinsics.checkNotNullParameter(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
