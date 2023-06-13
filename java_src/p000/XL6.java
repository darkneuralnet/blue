package p000;

import android.support.annotation.NonNull;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.networking.FraudDetectionData;
/* renamed from: XL6 */
/* loaded from: classes8.dex */
public enum XL6 {
    BASE_STATION_ID("base_station_id"),
    BATTERY("battery"),
    BSSID("bssid"),
    BSSID_ARRAY("bssid_array"),
    C("c"),
    CDMA_NETWORK_ID("cdma_network_id"),
    CDMA_SYSTEM_ID("cdma_system_id"),
    CELL_ID("cell_id"),
    CONF_VERSION("conf_version"),
    CONN_TYPE("conn_type"),
    DC_ID("dc_id"),
    DEVICE_ID("device_id"),
    DEVICE_UPTIME("device_uptime"),
    DISK("disk"),
    DS("ds"),
    IP_ADDRESSES("ip_addresses"),
    IP_ADDRS("ip_addrs"),
    IS_DEV_MODE_ON("dmo"),
    KNOWN_APPS("known_apps"),
    LINKER_ID("linker_id"),
    LOCALE_COUNTRY("locale_country"),
    LOCALE_LANG("locale_lang"),
    LOCATION("location"),
    LOCATION_AREA_CODE("location_area_code"),
    MEMORY("memory"),
    MG_ID("mg_id"),
    NETWORK_OPERATOR("network_operator"),
    PHONE_TYPE("phone_type"),
    PL("pl"),
    PROXY_SETTING("proxy_setting"),
    RISK_COMP_SESSION_ID("risk_comp_session_id"),
    ROAMING("roaming"),
    SCREEN("screen"),
    SERIAL_NUMBER("serial_number"),
    SIM_OPERATOR_NAME("sim_operator_name"),
    SIM_SERIAL_NUMBER("sim_serial_number"),
    SR("sr"),
    SSID("ssid"),
    SUBSCRIBER_ID("subscriber_id"),
    T("t"),
    TIMESTAMP(FraudDetectionData.KEY_TIMESTAMP),
    TZ("tz"),
    TZ_NAME("tz_name"),
    VPN_SETTING("VPN_setting");
    

    /* renamed from: b */
    public final String f43058b;

    /* renamed from: XL6$a */
    /* loaded from: classes8.dex */
    public enum EnumC9402a {
        CURRENT("current"),
        LEVEL("level"),
        METHOD("method"),
        LOW_POWER("low_power"),
        STATE(TransferTable.COLUMN_STATE),
        TEMP("temp"),
        VOLTAGE("voltage");
        

        /* renamed from: b */
        public final String f43067b;

        EnumC9402a(String str) {
            this.f43067b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f43067b;
        }
    }

    /* renamed from: XL6$b */
    /* loaded from: classes8.dex */
    public enum EnumC9403b {
        FREE_SD("free_sd"),
        FREE_UD("free_ud"),
        MOUNTED("mounted");
        

        /* renamed from: b */
        public final String f43072b;

        EnumC9403b(String str) {
            this.f43072b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f43072b;
        }
    }

    /* renamed from: XL6$c */
    /* loaded from: classes8.dex */
    public enum EnumC9404c {
        FREE("free"),
        FREE_RUNTIME("free_runtime"),
        MAX_RUNTIME("max_runtime"),
        TOTAL("total"),
        TOTAL_RUNTIME("total_runtime");
        

        /* renamed from: b */
        public final String f43079b;

        EnumC9404c(String str) {
            this.f43079b = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.f43079b;
        }
    }

    XL6(String str) {
        this.f43058b = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f43058b;
    }
}
