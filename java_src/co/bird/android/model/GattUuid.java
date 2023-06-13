package co.bird.android.model;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum BIRD_SERVICE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/GattUuid;", "", "uuid", "Ljava/util/UUID;", "(Ljava/lang/String;ILjava/util/UUID;)V", "getUuid", "()Ljava/util/UUID;", "BIRD_SERVICE", "BD_BIRD_SERVICE", "BIRD_AIR_SERVICE", "BIRD_AIR_COMMAND_UUID", "BIRD_FLEX_SERVICE", "BIRD_FLEX_COMMAND_UUID", "BIRD_FLEX_STATUS_NOTIFY_UUID", "BIRD_BIKE_SERVICE", "BIRD_BIKE_SERVICE2", "BIRD_BIKE_SERVICE3", "BIRD_BIKE_COMMAND_UUID", "BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID", "BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID", "UART_SERVICE", "UART_TX_CHARACTERISTIC", "UART_RX_CHARACTERISTIC", "LOCK", "DISTANCE", "BATTERY", "COMMAND", "BD_COMMAND", "ENERGY_MODE", "AUTH", "IMEI", "ICCID", "STM", "FAULT", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GattUuid {
    private static final /* synthetic */ GattUuid[] $VALUES;
    public static final GattUuid AUTH;
    public static final GattUuid BATTERY;
    public static final GattUuid BD_BIRD_SERVICE;
    public static final GattUuid BD_COMMAND;
    public static final GattUuid BIRD_AIR_COMMAND_UUID;
    public static final GattUuid BIRD_AIR_SERVICE;
    public static final GattUuid BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID;
    public static final GattUuid BIRD_BIKE_COMMAND_UUID;
    public static final GattUuid BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID;
    public static final GattUuid BIRD_BIKE_SERVICE;
    public static final GattUuid BIRD_BIKE_SERVICE2;
    public static final GattUuid BIRD_BIKE_SERVICE3;
    public static final GattUuid BIRD_FLEX_COMMAND_UUID;
    public static final GattUuid BIRD_FLEX_SERVICE;
    public static final GattUuid BIRD_FLEX_STATUS_NOTIFY_UUID;
    public static final GattUuid BIRD_SERVICE;
    public static final GattUuid COMMAND;
    public static final Companion Companion;
    public static final GattUuid DISTANCE;
    public static final GattUuid ENERGY_MODE;
    public static final GattUuid FAULT;
    public static final GattUuid ICCID;
    public static final GattUuid IMEI;
    public static final GattUuid LOCK;
    public static final GattUuid STM;
    public static final GattUuid UART_RX_CHARACTERISTIC;
    public static final GattUuid UART_SERVICE;
    public static final GattUuid UART_TX_CHARACTERISTIC;
    private static final GattUuid[] values;
    private final UUID uuid;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/GattUuid$Companion;", "", "()V", "values", "", "Lco/bird/android/model/GattUuid;", "getValues", "()[Lco/bird/android/model/GattUuid;", "[Lco/bird/android/model/GattUuid;", "from", "characteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nGattUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GattUuid.kt\nco/bird/android/model/GattUuid$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,100:1\n1282#2,2:101\n*S KotlinDebug\n*F\n+ 1 GattUuid.kt\nco/bird/android/model/GattUuid$Companion\n*L\n96#1:101,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GattUuid from(BluetoothGattCharacteristic characteristic) {
            GattUuid[] values;
            Intrinsics.checkNotNullParameter(characteristic, "characteristic");
            for (GattUuid gattUuid : getValues()) {
                if (Intrinsics.areEqual(gattUuid.getUuid(), characteristic.getUuid())) {
                    return gattUuid;
                }
            }
            return null;
        }

        public final GattUuid[] getValues() {
            return GattUuid.values;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ GattUuid[] $values() {
        return new GattUuid[]{BIRD_SERVICE, BD_BIRD_SERVICE, BIRD_AIR_SERVICE, BIRD_AIR_COMMAND_UUID, BIRD_FLEX_SERVICE, BIRD_FLEX_COMMAND_UUID, BIRD_FLEX_STATUS_NOTIFY_UUID, BIRD_BIKE_SERVICE, BIRD_BIKE_SERVICE2, BIRD_BIKE_SERVICE3, BIRD_BIKE_COMMAND_UUID, BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID, BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID, UART_SERVICE, UART_TX_CHARACTERISTIC, UART_RX_CHARACTERISTIC, LOCK, DISTANCE, BATTERY, COMMAND, BD_COMMAND, ENERGY_MODE, AUTH, IMEI, ICCID, STM, FAULT};
    }

    static {
        UUID fromString = UUID.fromString("0000B13D-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"0000B13D-0000-1000-8000-00805f9b34fb\")");
        BIRD_SERVICE = new GattUuid("BIRD_SERVICE", 0, fromString);
        UUID fromString2 = UUID.fromString("00002c00-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(\"00002c00-0000-1000-8000-00805f9b34fb\")");
        BD_BIRD_SERVICE = new GattUuid("BD_BIRD_SERVICE", 1, fromString2);
        UUID fromString3 = UUID.fromString("0000ffe0-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString3, "fromString(\"0000ffe0-0000-1000-8000-00805f9b34fb\")");
        BIRD_AIR_SERVICE = new GattUuid("BIRD_AIR_SERVICE", 2, fromString3);
        UUID fromString4 = UUID.fromString("0000ffe1-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString4, "fromString(\"0000ffe1-0000-1000-8000-00805f9b34fb\")");
        BIRD_AIR_COMMAND_UUID = new GattUuid("BIRD_AIR_COMMAND_UUID", 3, fromString4);
        UUID fromString5 = UUID.fromString("00002c00-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString5, "fromString(\"00002c00-0000-1000-8000-00805f9b34fb\")");
        BIRD_FLEX_SERVICE = new GattUuid("BIRD_FLEX_SERVICE", 4, fromString5);
        UUID fromString6 = UUID.fromString("00002c01-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString6, "fromString(\"00002c01-0000-1000-8000-00805f9b34fb\")");
        BIRD_FLEX_COMMAND_UUID = new GattUuid("BIRD_FLEX_COMMAND_UUID", 5, fromString6);
        UUID fromString7 = UUID.fromString("00002c03-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString7, "fromString(\"00002c03-0000-1000-8000-00805f9b34fb\")");
        BIRD_FLEX_STATUS_NOTIFY_UUID = new GattUuid("BIRD_FLEX_STATUS_NOTIFY_UUID", 6, fromString7);
        UUID fromString8 = UUID.fromString("0000fff0-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString8, "fromString(\"0000fff0-0000-1000-8000-00805f9b34fb\")");
        BIRD_BIKE_SERVICE = new GattUuid("BIRD_BIKE_SERVICE", 7, fromString8);
        UUID fromString9 = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString9, "fromString(\"0000ffb0-0000-1000-8000-00805f9b34fb\")");
        BIRD_BIKE_SERVICE2 = new GattUuid("BIRD_BIKE_SERVICE2", 8, fromString9);
        UUID fromString10 = UUID.fromString("000003c1-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString10, "fromString(\"000003c1-0000-1000-8000-00805f9b34fb\")");
        BIRD_BIKE_SERVICE3 = new GattUuid("BIRD_BIKE_SERVICE3", 9, fromString10);
        UUID fromString11 = UUID.fromString("60000001-0000-1000-8000-00805F9B34FB");
        Intrinsics.checkNotNullExpressionValue(fromString11, "fromString(\"60000001-0000-1000-8000-00805F9B34FB\")");
        BIRD_BIKE_COMMAND_UUID = new GattUuid("BIRD_BIKE_COMMAND_UUID", 10, fromString11);
        UUID fromString12 = UUID.fromString("60000002-0000-1000-8000-00805F9B34FB");
        Intrinsics.checkNotNullExpressionValue(fromString12, "fromString(\"60000002-0000-1000-8000-00805F9B34FB\")");
        BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID = new GattUuid("BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID", 11, fromString12);
        UUID fromString13 = UUID.fromString("60000003-0000-1000-8000-00805F9B34FB");
        Intrinsics.checkNotNullExpressionValue(fromString13, "fromString(\"60000003-0000-1000-8000-00805F9B34FB\")");
        BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID = new GattUuid("BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID", 12, fromString13);
        UUID fromString14 = UUID.fromString("6E400001-B5A3-F393-E0A9-E50E24DCCA9E");
        Intrinsics.checkNotNullExpressionValue(fromString14, "fromString(\"6E400001-B5A3-F393-E0A9-E50E24DCCA9E\")");
        UART_SERVICE = new GattUuid("UART_SERVICE", 13, fromString14);
        UUID fromString15 = UUID.fromString("6E400002-B5A3-F393-E0A9-E50E24DCCA9E");
        Intrinsics.checkNotNullExpressionValue(fromString15, "fromString(\"6E400002-B5A3-F393-E0A9-E50E24DCCA9E\")");
        UART_TX_CHARACTERISTIC = new GattUuid("UART_TX_CHARACTERISTIC", 14, fromString15);
        UUID fromString16 = UUID.fromString("6E400003-B5A3-F393-E0A9-E50E24DCCA9E");
        Intrinsics.checkNotNullExpressionValue(fromString16, "fromString(\"6E400003-B5A3-F393-E0A9-E50E24DCCA9E\")");
        UART_RX_CHARACTERISTIC = new GattUuid("UART_RX_CHARACTERISTIC", 15, fromString16);
        UUID fromString17 = UUID.fromString("00001335-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString17, "fromString(\"00001335-0000-1000-8000-00805f9b34fb\")");
        LOCK = new GattUuid("LOCK", 16, fromString17);
        UUID fromString18 = UUID.fromString("00001336-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString18, "fromString(\"00001336-0000-1000-8000-00805f9b34fb\")");
        DISTANCE = new GattUuid("DISTANCE", 17, fromString18);
        UUID fromString19 = UUID.fromString("00001337-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString19, "fromString(\"00001337-0000-1000-8000-00805f9b34fb\")");
        BATTERY = new GattUuid("BATTERY", 18, fromString19);
        UUID fromString20 = UUID.fromString("00001338-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString20, "fromString(\"00001338-0000-1000-8000-00805f9b34fb\")");
        COMMAND = new GattUuid("COMMAND", 19, fromString20);
        UUID fromString21 = UUID.fromString("00002c10-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString21, "fromString(\"00002c10-0000-1000-8000-00805f9b34fb\")");
        BD_COMMAND = new GattUuid("BD_COMMAND", 20, fromString21);
        UUID fromString22 = UUID.fromString("00001339-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString22, "fromString(\"00001339-0000-1000-8000-00805f9b34fb\")");
        ENERGY_MODE = new GattUuid("ENERGY_MODE", 21, fromString22);
        UUID fromString23 = UUID.fromString("00001440-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString23, "fromString(\"00001440-0000-1000-8000-00805f9b34fb\")");
        AUTH = new GattUuid("AUTH", 22, fromString23);
        UUID fromString24 = UUID.fromString("00001441-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString24, "fromString(\"00001441-0000-1000-8000-00805f9b34fb\")");
        IMEI = new GattUuid("IMEI", 23, fromString24);
        UUID fromString25 = UUID.fromString("00001442-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString25, "fromString(\"00001442-0000-1000-8000-00805f9b34fb\")");
        ICCID = new GattUuid("ICCID", 24, fromString25);
        UUID fromString26 = UUID.fromString("00001443-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString26, "fromString(\"00001443-0000-1000-8000-00805f9b34fb\")");
        STM = new GattUuid("STM", 25, fromString26);
        UUID fromString27 = UUID.fromString("00001444-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString27, "fromString(\"00001444-0000-1000-8000-00805f9b34fb\")");
        FAULT = new GattUuid("FAULT", 26, fromString27);
        $VALUES = $values();
        Companion = new Companion(null);
        values = values();
    }

    private GattUuid(String str, int i, UUID uuid) {
        this.uuid = uuid;
    }

    public static GattUuid valueOf(String str) {
        return (GattUuid) Enum.valueOf(GattUuid.class, str);
    }

    public static GattUuid[] values() {
        return (GattUuid[]) $VALUES.clone();
    }

    public final UUID getUuid() {
        return this.uuid;
    }
}
