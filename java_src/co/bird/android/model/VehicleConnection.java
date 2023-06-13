package co.bird.android.model;

import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.UStringsKt;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 G2\u00020\u0001:\u0001GJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0006H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H&J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\tH&J\b\u0010!\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016J\u0012\u00101\u001a\b\u0012\u0004\u0012\u00020\f00*\u00020\tH\u0016J\f\u00101\u001a\u00020\f*\u000202H\u0016J \u00107\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0002R\u0014\u0010;\u001a\u0002088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "", "", "enabled", "Lio/reactivex/F;", "deepSleep", "Lio/reactivex/c;", "firmwareInquiry", "initiateChallenge", "", "command", "sendOTAUpdateCommand", "", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "token", "unlock", "alarm", "byteArray", "writeRaw", "requestToken", "currentSessionToken", "", "setCurrentSessionToken", "refreshStatus", "resetTripOdometer", "resetTotalOdometer", "resetServiceIndicator", "queryDisplayFirmware", "queryECUFirmware", "queryBMSFirmware", MessageExtension.FIELD_DATA, "Ljava/util/UUID;", "characteristicUuid", "writeData", "", "toHex", "", "src", "", "startIndex", "count", "subBytes", "Lke5;", "getRxBleConnection", "()Lke5;", "rxBleConnection", "Lne5;", "getRxBleDevice", "()Lne5;", "rxBleDevice", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "bluetoothEncryptor", "getDeviceName", "()Ljava/lang/String;", "deviceName", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface VehicleConnection {
    public static final int BLE_MAX_DATA_LENGTH = 16;
    public static final long BLE_WRITE_CHUNK_DELAY_MILLIS = 100;
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection$Companion;", "", "()V", "BLE_MAX_DATA_LENGTH", "", "BLE_WRITE_CHUNK_DELAY_MILLIS", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BLE_MAX_DATA_LENGTH = 16;
        public static final long BLE_WRITE_CHUNK_DELAY_MILLIS = 100;

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVehicleConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleConnection.kt\nco/bird/android/model/VehicleConnection$DefaultImpls\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,96:1\n11345#2:97\n11680#2,3:98\n*S KotlinDebug\n*F\n+ 1 VehicleConnection.kt\nco/bird/android/model/VehicleConnection$DefaultImpls\n*L\n93#1:97\n93#1:98,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static AbstractC23461c alarm(VehicleConnection vehicleConnection, String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Pk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.alarm$lambda$0();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void alarm$lambda$0() {
            C41318g46.m40163a("alarm() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c queryBMSFirmware(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Ok6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.queryBMSFirmware$lambda$8();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void queryBMSFirmware$lambda$8() {
            C41318g46.m40163a("queryBMSFirmware() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c queryDisplayFirmware(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Qk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.queryDisplayFirmware$lambda$6();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void queryDisplayFirmware$lambda$6() {
            C41318g46.m40163a("queryDisplayFirmware() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c queryECUFirmware(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Jk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.queryECUFirmware$lambda$7();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void queryECUFirmware$lambda$7() {
            C41318g46.m40163a("queryECUFirmware() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c refreshStatus(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Kk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.refreshStatus$lambda$2();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void refreshStatus$lambda$2() {
            C41318g46.m40163a("refreshStatus() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c requestToken(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Mk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.requestToken$lambda$1();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void requestToken$lambda$1() {
            C41318g46.m40163a("requestToken() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c resetServiceIndicator(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Nk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.resetServiceIndicator$lambda$5();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void resetServiceIndicator$lambda$5() {
            C41318g46.m40163a("resetServiceIndicator() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c resetTotalOdometer(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Ik6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.resetTotalOdometer$lambda$4();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void resetTotalOdometer$lambda$4() {
            C41318g46.m40163a("resetTotalOdometer() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static AbstractC23461c resetTripOdometer(VehicleConnection vehicleConnection) {
            AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: Hk6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    VehicleConnection.DefaultImpls.resetTripOdometer$lambda$3();
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "complete().doOnComplete … this type, ignoring.\") }");
            return m33029z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void resetTripOdometer$lambda$3() {
            C41318g46.m40163a("resetTripOdometer() called but not supported for this type, ignoring.", new Object[0]);
        }

        public static void setCurrentSessionToken(VehicleConnection vehicleConnection, byte[] currentSessionToken) {
            Intrinsics.checkNotNullParameter(currentSessionToken, "currentSessionToken");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] subBytes(VehicleConnection vehicleConnection, byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public static String toHex(VehicleConnection vehicleConnection, byte b) {
            return UStringsKt.m118126toStringLxnNnR4(UByte.m116801constructorimpl(b), 16);
        }

        public static AbstractC23461c writeData(VehicleConnection vehicleConnection, byte[] data, UUID characteristicUuid) {
            int coerceAtMost;
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(characteristicUuid, "characteristicUuid");
            List<String> hex = vehicleConnection.toHex(data);
            C41318g46.m40163a("writing data: " + hex, new Object[0]);
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(data.length, 16);
            intRef2.element = coerceAtMost;
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast((int) Math.ceil(data.length / 16.0f), 1);
            Observable<Long> intervalRange = Observable.intervalRange(0L, coerceAtLeast, 0L, 100L, TimeUnit.MILLISECONDS);
            final VehicleConnection$writeData$1 vehicleConnection$writeData$1 = new VehicleConnection$writeData$1(vehicleConnection, data, intRef, intRef2, characteristicUuid);
            AbstractC23461c ignoreElements = intervalRange.flatMapSingle(new InterfaceC23492o() { // from class: Lk6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K writeData$lambda$9;
                    writeData$lambda$9 = VehicleConnection.DefaultImpls.writeData$lambda$9(Function1.this, obj);
                    return writeData$lambda$9;
                }
            }).ignoreElements();
            Intrinsics.checkNotNullExpressionValue(ignoreElements, "fun writeData(data: Byte…    .ignoreElements()\n  }");
            return ignoreElements;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InterfaceC23447K writeData$lambda$9(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        public static List<String> toHex(VehicleConnection vehicleConnection, byte[] receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            ArrayList arrayList = new ArrayList(receiver.length);
            for (byte b : receiver) {
                arrayList.add(vehicleConnection.toHex(b));
            }
            return arrayList;
        }
    }

    AbstractC23461c alarm(String str);

    AbstractC23442F<VehicleConnection> deepSleep(boolean z);

    AbstractC23461c firmwareInquiry();

    BlePayloadEncryptor getBluetoothEncryptor();

    String getDeviceName();

    InterfaceC44023ke5 getRxBleConnection();

    InterfaceC45802ne5 getRxBleDevice();

    AbstractC23461c initiateChallenge();

    AbstractC23461c queryBMSFirmware();

    AbstractC23461c queryDisplayFirmware();

    AbstractC23461c queryECUFirmware();

    AbstractC23461c refreshStatus();

    AbstractC23461c requestToken();

    AbstractC23461c resetServiceIndicator();

    AbstractC23461c resetTotalOdometer();

    AbstractC23461c resetTripOdometer();

    AbstractC23461c sendOTAUpdateCommand(byte[] bArr);

    AbstractC23461c sendPasscode(String str);

    void setCurrentSessionToken(byte[] bArr);

    AbstractC23461c setSpeedMode(VehicleSpeedMode vehicleSpeedMode);

    AbstractC23461c softReset();

    Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 enumC41046fd3);

    String toHex(byte b);

    List<String> toHex(byte[] bArr);

    AbstractC23461c toggleLights(boolean z);

    AbstractC23461c unlock(LockKind lockKind, boolean z, String str);

    AbstractC23461c writeData(byte[] bArr, UUID uuid);

    AbstractC23461c writeRaw(byte[] bArr);
}
