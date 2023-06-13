package co.bird.android.model;

import android.bluetooth.BluetoothGattCharacteristic;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.encoding.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0012\n\u0002\b:\b\u0086\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001<B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;¨\u0006="}, m28432d2 = {"Lco/bird/android/model/Command;", "", MessageExtension.FIELD_DATA, "", "(Ljava/lang/String;I[B)V", "getData", "()[B", "AUTH", "LOCK", "UNLOCK_LIGHT_ON", "UNLOCK_LIGHT_OFF", "UNLOCK_BATTERY", "LIGHT_ON", "LIGHT_OFF", "CRUISE_ON", "CRUISE_OFF", "ALARM_CHIRP", "ALARM_SHORT", "ALARM_LONG", "DISCONNECT", "DEEP_SLEEP_ON", "DEEP_SLEEP_OFF", "MAX_SPEED", "RENTAL_MODE", "RETAIL_MODE", "SOFT_RESET", "FLASH_LIGHTS", "SPEED_MODE_1", "SPEED_MODE_2", "SPEED_MODE_3", "BIRD_AIR_HEADLIGHT_OFF", "BIRD_AIR_HEADLIGHT_ON", "BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY", "BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY", "BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY", "BIRD_AIR_INITIATE_CHALLENGE", "BIRD_AIR_SEND_PASSCODE", "BIRD_AIR_INITIATE_OTA_UPDATE", "BIRD_AIR_SYNC_OTA_UPDATE", "BIRD_AIR_OTA_UPDATE_HEADER", "BIRD_AIR_OTA_UPDATE_FILE_WRITE", "BIRD_AIR_STOP_UPDATE", "BIRD_AIR_PCM_MODE", "BIRD_AIR_PCM_UPDATE_START", "BIRD_AIR_PCM_UPDATE_END", "BIRD_BIKE_GET_TOKEN", "BIRD_BIKE_GET_BATTERY", "BIRD_BIKE_QUERY_RIDE_DATA", "BIRD_BIKE_HEADLIGHT_OFF", "BIRD_BIKE_HEADLIGHT_ON", "BIRD_BIKE_READ_HEADLIGHT_STATE", "BIRD_BIKE_CLEAR_TRIP_ODOMETER", "BIRD_BIKE_CLEAR_TOTAL_ODOMETER", "BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE", "BIRD_BIKE_QUERY_DISPLAY_FIRMWARE", "BIRD_BIKE_QUERY_ECU_FIRMWARE", "BIRD_BIKE_QUERY_BMS_FIRMWARE", "BIRD_BIKE_QUERY_MOTOR_LOCK", "BIRD_BIKE_SET_MOTOR_LOCK_LOCKED", "BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Command {
    private static final /* synthetic */ Command[] $VALUES;
    public static final Command BIRD_AIR_PCM_UPDATE_END;
    public static final Command BIRD_AIR_PCM_UPDATE_START;
    public static final Command BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE;
    public static final Command BIRD_BIKE_CLEAR_TOTAL_ODOMETER;
    public static final Command BIRD_BIKE_CLEAR_TRIP_ODOMETER;
    public static final Command BIRD_BIKE_GET_BATTERY;
    public static final Command BIRD_BIKE_GET_TOKEN;
    public static final Command BIRD_BIKE_HEADLIGHT_OFF;
    public static final Command BIRD_BIKE_HEADLIGHT_ON;
    public static final Command BIRD_BIKE_QUERY_BMS_FIRMWARE;
    public static final Command BIRD_BIKE_QUERY_DISPLAY_FIRMWARE;
    public static final Command BIRD_BIKE_QUERY_ECU_FIRMWARE;
    public static final Command BIRD_BIKE_QUERY_MOTOR_LOCK;
    public static final Command BIRD_BIKE_QUERY_RIDE_DATA;
    public static final Command BIRD_BIKE_READ_HEADLIGHT_STATE;
    public static final Command BIRD_BIKE_SET_MOTOR_LOCK_LOCKED;
    public static final Command BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED;
    public static final Companion Companion;
    private static final Command[] values;
    private final byte[] data;
    public static final Command AUTH = new Command("AUTH", 0, new byte[]{-79, Base64.padSymbol});
    public static final Command LOCK = new Command("LOCK", 1, new byte[]{0, 21});
    public static final Command UNLOCK_LIGHT_ON = new Command("UNLOCK_LIGHT_ON", 2, new byte[]{0, 22, 0});
    public static final Command UNLOCK_LIGHT_OFF = new Command("UNLOCK_LIGHT_OFF", 3, new byte[]{0, 22, 15});
    public static final Command UNLOCK_BATTERY = new Command("UNLOCK_BATTERY", 4, new byte[]{0, ByteCompanionObject.MIN_VALUE, 7, 1, 51, 49, 1, 2, 6, 1});
    public static final Command LIGHT_ON = new Command("LIGHT_ON", 5, new byte[]{0, 66, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE});
    public static final Command LIGHT_OFF = new Command("LIGHT_OFF", 6, new byte[]{0, 67, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE});
    public static final Command CRUISE_ON = new Command("CRUISE_ON", 7, new byte[]{0, 25});
    public static final Command CRUISE_OFF = new Command("CRUISE_OFF", 8, new byte[]{0, 32});
    public static final Command ALARM_CHIRP = new Command("ALARM_CHIRP", 9, new byte[]{0, 33});
    public static final Command ALARM_SHORT = new Command("ALARM_SHORT", 10, new byte[]{0, 34});
    public static final Command ALARM_LONG = new Command("ALARM_LONG", 11, new byte[]{0, 35});
    public static final Command DISCONNECT = new Command("DISCONNECT", 12, new byte[]{0, 96});
    public static final Command DEEP_SLEEP_ON = new Command("DEEP_SLEEP_ON", 13, new byte[]{0, 51});
    public static final Command DEEP_SLEEP_OFF = new Command("DEEP_SLEEP_OFF", 14, new byte[]{0, 49});
    public static final Command MAX_SPEED = new Command("MAX_SPEED", 15, new byte[]{0, 50});
    public static final Command RENTAL_MODE = new Command("RENTAL_MODE", 16, new byte[]{0, 40});
    public static final Command RETAIL_MODE = new Command("RETAIL_MODE", 17, new byte[]{0, 69});
    public static final Command SOFT_RESET = new Command("SOFT_RESET", 18, new byte[]{0, 65});
    public static final Command FLASH_LIGHTS = new Command("FLASH_LIGHTS", 19, new byte[]{0, 99});
    public static final Command SPEED_MODE_1 = new Command("SPEED_MODE_1", 20, new byte[]{43, 77, 79, 68, 69, Base64.padSymbol, 49});
    public static final Command SPEED_MODE_2 = new Command("SPEED_MODE_2", 21, new byte[]{43, 77, 79, 68, 69, Base64.padSymbol, 50});
    public static final Command SPEED_MODE_3 = new Command("SPEED_MODE_3", 22, new byte[]{43, 77, 79, 68, 69, Base64.padSymbol, 51});
    public static final Command BIRD_AIR_HEADLIGHT_OFF = new Command("BIRD_AIR_HEADLIGHT_OFF", 23, new byte[]{43, 72, 76, 71, 84, Base64.padSymbol, 48});
    public static final Command BIRD_AIR_HEADLIGHT_ON = new Command("BIRD_AIR_HEADLIGHT_ON", 24, new byte[]{43, 72, 76, 71, 84, Base64.padSymbol, 49});
    public static final Command BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY = new Command("BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY", 25, new byte[]{43, 83, 86, 71, 84, Base64.padSymbol, 63});
    public static final Command BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY = new Command("BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY", 26, new byte[]{43, 72, 86, 71, 84, Base64.padSymbol, 63});
    public static final Command BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY = new Command("BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY", 27, new byte[]{58, 23, 17, 2, 70, 87, -57, 0, 13, 10});
    public static final Command BIRD_AIR_INITIATE_CHALLENGE = new Command("BIRD_AIR_INITIATE_CHALLENGE", 28, new byte[]{-82, 75, 69, 89, 63, -42});
    public static final Command BIRD_AIR_SEND_PASSCODE = new Command("BIRD_AIR_SEND_PASSCODE", 29, new byte[]{-82, 75, 69, 89});
    public static final Command BIRD_AIR_INITIATE_OTA_UPDATE = new Command("BIRD_AIR_INITIATE_OTA_UPDATE", 30, new byte[]{-82, 0, 0, 0});
    public static final Command BIRD_AIR_SYNC_OTA_UPDATE = new Command("BIRD_AIR_SYNC_OTA_UPDATE", 31, new byte[]{-92, 0, 0, 0});
    public static final Command BIRD_AIR_OTA_UPDATE_HEADER = new Command("BIRD_AIR_OTA_UPDATE_HEADER", 32, new byte[]{-96, 0, 0, 0});
    public static final Command BIRD_AIR_OTA_UPDATE_FILE_WRITE = new Command("BIRD_AIR_OTA_UPDATE_FILE_WRITE", 33, new byte[]{0, 0, 0, 0});
    public static final Command BIRD_AIR_STOP_UPDATE = new Command("BIRD_AIR_STOP_UPDATE", 34, new byte[]{-1, 0, 0, 0});
    public static final Command BIRD_AIR_PCM_MODE = new Command("BIRD_AIR_PCM_MODE", 35, new byte[]{58, 23, 82, 2, 83, 84, 18, 1, 13, 10});

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/Command$Companion;", "", "()V", "values", "", "Lco/bird/android/model/Command;", "getValues", "()[Lco/bird/android/model/Command;", "[Lco/bird/android/model/Command;", "from", "characteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Command.kt\nco/bird/android/model/Command$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,126:1\n1282#2,2:127\n*S KotlinDebug\n*F\n+ 1 Command.kt\nco/bird/android/model/Command$Companion\n*L\n120#1:127,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Command from(BluetoothGattCharacteristic characteristic) {
            Command[] values;
            boolean z;
            Intrinsics.checkNotNullParameter(characteristic, "characteristic");
            for (Command command : getValues()) {
                if (characteristic.getValue() != null && Arrays.equals(command.getData(), characteristic.getValue())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return command;
                }
            }
            return null;
        }

        public final Command[] getValues() {
            return Command.values;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Command[] $values() {
        return new Command[]{AUTH, LOCK, UNLOCK_LIGHT_ON, UNLOCK_LIGHT_OFF, UNLOCK_BATTERY, LIGHT_ON, LIGHT_OFF, CRUISE_ON, CRUISE_OFF, ALARM_CHIRP, ALARM_SHORT, ALARM_LONG, DISCONNECT, DEEP_SLEEP_ON, DEEP_SLEEP_OFF, MAX_SPEED, RENTAL_MODE, RETAIL_MODE, SOFT_RESET, FLASH_LIGHTS, SPEED_MODE_1, SPEED_MODE_2, SPEED_MODE_3, BIRD_AIR_HEADLIGHT_OFF, BIRD_AIR_HEADLIGHT_ON, BIRD_AIR_DASH_FIRMWARE_VERSION_INQUIRY, BIRD_AIR_DASH_HARDWARE_FIRMWARE_VERSION_INQUIRY, BIRD_AIR_PCM_FIRMWARE_VERSION_INQUIRY, BIRD_AIR_INITIATE_CHALLENGE, BIRD_AIR_SEND_PASSCODE, BIRD_AIR_INITIATE_OTA_UPDATE, BIRD_AIR_SYNC_OTA_UPDATE, BIRD_AIR_OTA_UPDATE_HEADER, BIRD_AIR_OTA_UPDATE_FILE_WRITE, BIRD_AIR_STOP_UPDATE, BIRD_AIR_PCM_MODE, BIRD_AIR_PCM_UPDATE_START, BIRD_AIR_PCM_UPDATE_END, BIRD_BIKE_GET_TOKEN, BIRD_BIKE_GET_BATTERY, BIRD_BIKE_QUERY_RIDE_DATA, BIRD_BIKE_HEADLIGHT_OFF, BIRD_BIKE_HEADLIGHT_ON, BIRD_BIKE_READ_HEADLIGHT_STATE, BIRD_BIKE_CLEAR_TRIP_ODOMETER, BIRD_BIKE_CLEAR_TOTAL_ODOMETER, BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE, BIRD_BIKE_QUERY_DISPLAY_FIRMWARE, BIRD_BIKE_QUERY_ECU_FIRMWARE, BIRD_BIKE_QUERY_BMS_FIRMWARE, BIRD_BIKE_QUERY_MOTOR_LOCK, BIRD_BIKE_SET_MOTOR_LOCK_LOCKED, BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED};
    }

    static {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 20; i++) {
            bArr[i] = 68;
        }
        BIRD_AIR_PCM_UPDATE_START = new Command("BIRD_AIR_PCM_UPDATE_START", 36, bArr);
        byte[] bArr2 = new byte[20];
        for (int i2 = 0; i2 < 20; i2++) {
            bArr2[i2] = 85;
        }
        BIRD_AIR_PCM_UPDATE_END = new Command("BIRD_AIR_PCM_UPDATE_END", 37, bArr2);
        BIRD_BIKE_GET_TOKEN = new Command("BIRD_BIKE_GET_TOKEN", 38, new byte[]{6, 1, 1, 1});
        BIRD_BIKE_GET_BATTERY = new Command("BIRD_BIKE_GET_BATTERY", 39, new byte[]{2, 1, 1, 1});
        BIRD_BIKE_QUERY_RIDE_DATA = new Command("BIRD_BIKE_QUERY_RIDE_DATA", 40, new byte[]{5, 72, 1, 1});
        BIRD_BIKE_HEADLIGHT_OFF = new Command("BIRD_BIKE_HEADLIGHT_OFF", 41, new byte[]{5, 71, 1, 0});
        BIRD_BIKE_HEADLIGHT_ON = new Command("BIRD_BIKE_HEADLIGHT_ON", 42, new byte[]{5, 71, 1, 1});
        BIRD_BIKE_READ_HEADLIGHT_STATE = new Command("BIRD_BIKE_READ_HEADLIGHT_STATE", 43, new byte[]{5, 69, 1, 1});
        BIRD_BIKE_CLEAR_TRIP_ODOMETER = new Command("BIRD_BIKE_CLEAR_TRIP_ODOMETER", 44, new byte[]{2, 32, 1, 1});
        BIRD_BIKE_CLEAR_TOTAL_ODOMETER = new Command("BIRD_BIKE_CLEAR_TOTAL_ODOMETER", 45, new byte[]{2, 32, 1, 2});
        BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE = new Command("BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE", 46, new byte[]{2, 32, 1, 3});
        BIRD_BIKE_QUERY_DISPLAY_FIRMWARE = new Command("BIRD_BIKE_QUERY_DISPLAY_FIRMWARE", 47, new byte[]{1, 4, 1, 1});
        BIRD_BIKE_QUERY_ECU_FIRMWARE = new Command("BIRD_BIKE_QUERY_ECU_FIRMWARE", 48, new byte[]{1, 6, 1, 1});
        BIRD_BIKE_QUERY_BMS_FIRMWARE = new Command("BIRD_BIKE_QUERY_BMS_FIRMWARE", 49, new byte[]{1, 8, 1, 1});
        BIRD_BIKE_QUERY_MOTOR_LOCK = new Command("BIRD_BIKE_QUERY_MOTOR_LOCK", 50, new byte[]{5, 14, 1, 1});
        BIRD_BIKE_SET_MOTOR_LOCK_LOCKED = new Command("BIRD_BIKE_SET_MOTOR_LOCK_LOCKED", 51, new byte[]{5, 12, 1, 1});
        BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED = new Command("BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED", 52, new byte[]{5, 1, 1, 1});
        $VALUES = $values();
        Companion = new Companion(null);
        values = values();
    }

    private Command(String str, int i, byte[] bArr) {
        this.data = bArr;
    }

    public static Command valueOf(String str) {
        return (Command) Enum.valueOf(Command.class, str);
    }

    public static Command[] values() {
        return (Command[]) $VALUES.clone();
    }

    public final byte[] getData() {
        return this.data;
    }
}
