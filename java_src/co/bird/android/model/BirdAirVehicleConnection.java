package co.bird.android.model;

import co.bird.android.model.BirdAirVehicleConnection;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010&\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b>\u0010?J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tH\u0016J\t\u0010!\u001a\u00020 HÆ\u0003J\t\u0010#\u001a\u00020\"HÆ\u0003J\t\u0010%\u001a\u00020$HÆ\u0003J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020 2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020$HÆ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003R\u001a\u0010&\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u00102R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u00105R\u001a\u0010(\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108R\u001d\u0010=\u001a\u0004\u0018\u00010\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, m28432d2 = {"Lco/bird/android/model/BirdAirVehicleConnection;", "Lco/bird/android/model/VehicleConnection;", "", "enabled", "Lio/reactivex/F;", "deepSleep", "Lio/reactivex/c;", "firmwareInquiry", "initiateChallenge", "", "command", "sendOTAUpdateCommand", "", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "token", "unlock", "byteArray", "writeRaw", "Lke5;", "component1", "Lne5;", "component2", "Lco/bird/android/model/BlePayloadEncryptor;", "component3", "rxBleConnection", "rxBleDevice", "bluetoothEncryptor", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lke5;", "getRxBleConnection", "()Lke5;", "Lne5;", "getRxBleDevice", "()Lne5;", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "deviceName$delegate", "Lkotlin/Lazy;", "getDeviceName", "()Ljava/lang/String;", "deviceName", "<init>", "(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdAirVehicleConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirVehicleConnection.kt\nco/bird/android/model/BirdAirVehicleConnection\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n19295#2,7:102\n*S KotlinDebug\n*F\n+ 1 BirdAirVehicleConnection.kt\nco/bird/android/model/BirdAirVehicleConnection\n*L\n58#1:102,7\n*E\n"})
/* loaded from: classes4.dex */
public final class BirdAirVehicleConnection implements VehicleConnection {
    private final BlePayloadEncryptor bluetoothEncryptor;
    private final Lazy deviceName$delegate;
    private final InterfaceC44023ke5 rxBleConnection;
    private final InterfaceC45802ne5 rxBleDevice;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VehicleSpeedMode.values().length];
            try {
                iArr[VehicleSpeedMode.SLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleSpeedMode.MED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleSpeedMode.FAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BirdAirVehicleConnection(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        this.rxBleConnection = rxBleConnection;
        this.rxBleDevice = rxBleDevice;
        this.bluetoothEncryptor = bluetoothEncryptor;
        lazy = LazyKt__LazyJVMKt.lazy(new BirdAirVehicleConnection$deviceName$2(this));
        this.deviceName$delegate = lazy;
    }

    public static /* synthetic */ BirdAirVehicleConnection copy$default(BirdAirVehicleConnection birdAirVehicleConnection, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC45802ne5 interfaceC45802ne5, BlePayloadEncryptor blePayloadEncryptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC44023ke5 = birdAirVehicleConnection.rxBleConnection;
        }
        if ((i & 2) != 0) {
            interfaceC45802ne5 = birdAirVehicleConnection.rxBleDevice;
        }
        if ((i & 4) != 0) {
            blePayloadEncryptor = birdAirVehicleConnection.bluetoothEncryptor;
        }
        return birdAirVehicleConnection.copy(interfaceC44023ke5, interfaceC45802ne5, blePayloadEncryptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h firmwareInquiry$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c alarm(String str) {
        return VehicleConnection.DefaultImpls.alarm(this, str);
    }

    public final InterfaceC44023ke5 component1() {
        return this.rxBleConnection;
    }

    public final InterfaceC45802ne5 component2() {
        return this.rxBleDevice;
    }

    public final BlePayloadEncryptor component3() {
        return this.bluetoothEncryptor;
    }

    public final BirdAirVehicleConnection copy(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        return new BirdAirVehicleConnection(rxBleConnection, rxBleDevice, bluetoothEncryptor);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23442F<VehicleConnection> deepSleep(boolean z) {
        AbstractC23442F<VehicleConnection> m33100x = AbstractC23442F.m33100x(new UnsupportedOperationException("Bird Air does not support deep sleep. Power off using hardware button instead."));
        Intrinsics.checkNotNullExpressionValue(m33100x, "error(UnsupportedOperati…rdware button instead.\"))");
        return m33100x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdAirVehicleConnection) {
            BirdAirVehicleConnection birdAirVehicleConnection = (BirdAirVehicleConnection) obj;
            return Intrinsics.areEqual(this.rxBleConnection, birdAirVehicleConnection.rxBleConnection) && Intrinsics.areEqual(this.rxBleDevice, birdAirVehicleConnection.rxBleDevice) && Intrinsics.areEqual(this.bluetoothEncryptor, birdAirVehicleConnection.bluetoothEncryptor);
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c firmwareInquiry() {
        Observable<Long> intervalRange = Observable.intervalRange(0L, 5L, 0L, 100L, TimeUnit.MILLISECONDS);
        final BirdAirVehicleConnection$firmwareInquiry$1 birdAirVehicleConnection$firmwareInquiry$1 = new BirdAirVehicleConnection$firmwareInquiry$1(this);
        AbstractC23461c flatMapCompletable = intervalRange.flatMapCompletable(new InterfaceC23492o() { // from class: bJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h firmwareInquiry$lambda$0;
                firmwareInquiry$lambda$0 = BirdAirVehicleConnection.firmwareInquiry$lambda$0(Function1.this, obj);
                return firmwareInquiry$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun firmwareInq…ND_UUID.uuid)\n      }\n  }");
        return flatMapCompletable;
    }

    @Override // co.bird.android.model.VehicleConnection
    public BlePayloadEncryptor getBluetoothEncryptor() {
        return this.bluetoothEncryptor;
    }

    @Override // co.bird.android.model.VehicleConnection
    public String getDeviceName() {
        return (String) this.deviceName$delegate.getValue();
    }

    @Override // co.bird.android.model.VehicleConnection
    public InterfaceC44023ke5 getRxBleConnection() {
        return this.rxBleConnection;
    }

    @Override // co.bird.android.model.VehicleConnection
    public InterfaceC45802ne5 getRxBleDevice() {
        return this.rxBleDevice;
    }

    public int hashCode() {
        return (((this.rxBleConnection.hashCode() * 31) + this.rxBleDevice.hashCode()) * 31) + this.bluetoothEncryptor.hashCode();
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c initiateChallenge() {
        return writeData(Command.BIRD_AIR_INITIATE_CHALLENGE.getData(), GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryBMSFirmware() {
        return VehicleConnection.DefaultImpls.queryBMSFirmware(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryDisplayFirmware() {
        return VehicleConnection.DefaultImpls.queryDisplayFirmware(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryECUFirmware() {
        return VehicleConnection.DefaultImpls.queryECUFirmware(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c refreshStatus() {
        return VehicleConnection.DefaultImpls.refreshStatus(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c requestToken() {
        return VehicleConnection.DefaultImpls.requestToken(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetServiceIndicator() {
        return VehicleConnection.DefaultImpls.resetServiceIndicator(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetTotalOdometer() {
        return VehicleConnection.DefaultImpls.resetTotalOdometer(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetTripOdometer() {
        return VehicleConnection.DefaultImpls.resetTripOdometer(this);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendOTAUpdateCommand(byte[] command) {
        Intrinsics.checkNotNullParameter(command, "command");
        return writeData(command, GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendPasscode(String passcode) {
        boolean z;
        int lastIndex;
        byte[] plus;
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        try {
            byte[] data = Command.BIRD_AIR_SEND_PASSCODE.getData();
            if (data.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte b = data[0];
                lastIndex = ArraysKt___ArraysKt.getLastIndex(data);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    b = (byte) (b + data[it.nextInt()]);
                }
                plus = ArraysKt___ArraysJvmKt.plus(Command.BIRD_AIR_SEND_PASSCODE.getData(), new byte[]{(byte) Integer.parseInt(passcode), (byte) ((b + Integer.parseInt(passcode)) & KotlinVersion.MAX_COMPONENT_VALUE)});
                return writeData(plus, GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        } catch (NumberFormatException unused) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalStateException("Invalid passcode: " + passcode));
            Intrinsics.checkNotNullExpressionValue(m33080F, "{\n      Completable.erro…scode: $passcode\"))\n    }");
            return m33080F;
        }
    }

    @Override // co.bird.android.model.VehicleConnection
    public void setCurrentSessionToken(byte[] bArr) {
        VehicleConnection.DefaultImpls.setCurrentSessionToken(this, bArr);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c setSpeedMode(VehicleSpeedMode speedMode) {
        Command command;
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        int i = WhenMappings.$EnumSwitchMapping$0[speedMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    command = Command.SPEED_MODE_3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                command = Command.SPEED_MODE_2;
            }
        } else {
            command = Command.SPEED_MODE_1;
        }
        return writeData(command.getData(), GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c softReset() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Bird Air does no support soft reset command."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…rt soft reset command.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<Observable<byte[]>> mo27057b = getRxBleConnection().mo27057b(GattUuid.BIRD_AIR_COMMAND_UUID.getUuid(), mode);
        Intrinsics.checkNotNullExpressionValue(mo27057b, "rxBleConnection.setupNot…_COMMAND_UUID.uuid, mode)");
        return mo27057b;
    }

    @Override // co.bird.android.model.VehicleConnection
    public String toHex(byte b) {
        return VehicleConnection.DefaultImpls.toHex(this, b);
    }

    public String toString() {
        InterfaceC44023ke5 interfaceC44023ke5 = this.rxBleConnection;
        InterfaceC45802ne5 interfaceC45802ne5 = this.rxBleDevice;
        BlePayloadEncryptor blePayloadEncryptor = this.bluetoothEncryptor;
        return "BirdAirVehicleConnection(rxBleConnection=" + interfaceC44023ke5 + ", rxBleDevice=" + interfaceC45802ne5 + ", bluetoothEncryptor=" + blePayloadEncryptor + ")";
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c toggleLights(boolean z) {
        Command command;
        if (z) {
            command = Command.BIRD_AIR_HEADLIGHT_ON;
        } else {
            command = Command.BIRD_AIR_HEADLIGHT_OFF;
        }
        return writeData(command.getData(), GattUuid.BIRD_AIR_COMMAND_UUID.getUuid());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c unlock(LockKind lockKind, boolean z, String token) {
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(token, "token");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Air. Lock/Unlock through VehicleManagerImpl for Bird Air now."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…Impl for Bird Air now.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeData(byte[] bArr, UUID uuid) {
        return VehicleConnection.DefaultImpls.writeData(this, bArr, uuid);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeRaw(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        List<String> hex = toHex(byteArray);
        C41318g46.m40163a("BirdAirVehicleConnection.writing raw: " + hex, new Object[0]);
        AbstractC23461c m33159G = getRxBleConnection().mo27056c(GattUuid.BIRD_AIR_COMMAND_UUID.getUuid(), byteArray).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "rxBleConnection.writeCha…y)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // co.bird.android.model.VehicleConnection
    public List<String> toHex(byte[] bArr) {
        return VehicleConnection.DefaultImpls.toHex(this, bArr);
    }
}
