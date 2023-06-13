package co.bird.android.model;

import co.bird.android.model.BirdVehicleConnection;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u001f\u0012\u0006\u0010&\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b>\u0010?J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tH\u0016J\t\u0010!\u001a\u00020 HÆ\u0003J\t\u0010#\u001a\u00020\"HÆ\u0003J\t\u0010%\u001a\u00020$HÆ\u0003J'\u0010)\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020 2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020$HÆ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020+HÖ\u0001J\u0013\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003R\u001a\u0010&\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u00102R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u00105R\u001a\u0010(\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108R\u001d\u0010=\u001a\u0004\u0018\u00010\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, m28432d2 = {"Lco/bird/android/model/BirdVehicleConnection;", "Lco/bird/android/model/VehicleConnection;", "", "enabled", "Lio/reactivex/F;", "deepSleep", "Lio/reactivex/c;", "firmwareInquiry", "initiateChallenge", "", "command", "sendOTAUpdateCommand", "", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "token", "unlock", "byteArray", "writeRaw", "Lke5;", "component1", "Lne5;", "component2", "Lco/bird/android/model/BlePayloadEncryptor;", "component3", "rxBleConnection", "rxBleDevice", "bluetoothEncryptor", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lke5;", "getRxBleConnection", "()Lke5;", "Lne5;", "getRxBleDevice", "()Lne5;", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "deviceName$delegate", "Lkotlin/Lazy;", "getDeviceName", "()Ljava/lang/String;", "deviceName", "<init>", "(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdVehicleConnection implements VehicleConnection {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_TIMEOUT_SECONDS = 10;
    private final BlePayloadEncryptor bluetoothEncryptor;
    private final Lazy deviceName$delegate;
    private final InterfaceC44023ke5 rxBleConnection;
    private final InterfaceC45802ne5 rxBleDevice;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdVehicleConnection$Companion;", "", "()V", "DEFAULT_TIMEOUT_SECONDS", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BirdVehicleConnection(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        this.rxBleConnection = rxBleConnection;
        this.rxBleDevice = rxBleDevice;
        this.bluetoothEncryptor = bluetoothEncryptor;
        lazy = LazyKt__LazyJVMKt.lazy(new BirdVehicleConnection$deviceName$2(this));
        this.deviceName$delegate = lazy;
    }

    public static /* synthetic */ BirdVehicleConnection copy$default(BirdVehicleConnection birdVehicleConnection, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC45802ne5 interfaceC45802ne5, BlePayloadEncryptor blePayloadEncryptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC44023ke5 = birdVehicleConnection.rxBleConnection;
        }
        if ((i & 2) != 0) {
            interfaceC45802ne5 = birdVehicleConnection.rxBleDevice;
        }
        if ((i & 4) != 0) {
            blePayloadEncryptor = birdVehicleConnection.bluetoothEncryptor;
        }
        return birdVehicleConnection.copy(interfaceC44023ke5, interfaceC45802ne5, blePayloadEncryptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23447K deepSleep$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
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

    public final BirdVehicleConnection copy(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        return new BirdVehicleConnection(rxBleConnection, rxBleDevice, bluetoothEncryptor);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23442F<VehicleConnection> deepSleep(boolean z) {
        Command command;
        if (z) {
            command = Command.DEEP_SLEEP_ON;
        } else {
            command = Command.DEEP_SLEEP_OFF;
        }
        AbstractC23442F<byte[]> m33140a0 = getRxBleConnection().mo27056c(GattUuid.COMMAND.getUuid(), command.getData()).m33140a0(DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        final BirdVehicleConnection$deepSleep$1 birdVehicleConnection$deepSleep$1 = new BirdVehicleConnection$deepSleep$1(this);
        AbstractC23442F m33165A = m33140a0.m33165A(new InterfaceC23492o() { // from class: AT
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K deepSleep$lambda$0;
                deepSleep$lambda$0 = BirdVehicleConnection.deepSleep$lambda$0(Function1.this, obj);
                return deepSleep$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun deepSleep(e…te failed.\"))\n      }\n  }");
        return m33165A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdVehicleConnection) {
            BirdVehicleConnection birdVehicleConnection = (BirdVehicleConnection) obj;
            return Intrinsics.areEqual(this.rxBleConnection, birdVehicleConnection.rxBleConnection) && Intrinsics.areEqual(this.rxBleDevice, birdVehicleConnection.rxBleDevice) && Intrinsics.areEqual(this.bluetoothEncryptor, birdVehicleConnection.bluetoothEncryptor);
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c firmwareInquiry() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…implemented for Birds.\"))");
        return m33080F;
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…implemented for Birds.\"))");
        return m33080F;
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…implemented for Birds.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendPasscode(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…implemented for Birds.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public void setCurrentSessionToken(byte[] bArr) {
        VehicleConnection.DefaultImpls.setCurrentSessionToken(this, bArr);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c setSpeedMode(VehicleSpeedMode speedMode) {
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("This Bird does not support setting distinct speed modes. Try setting max speed instead."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…ing max speed instead.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c softReset() {
        AbstractC23461c m33159G = getRxBleConnection().mo27056c(GattUuid.COMMAND.getUuid(), Command.SOFT_RESET.getData()).m33140a0(DEFAULT_TIMEOUT_SECONDS, TimeUnit.SECONDS).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "rxBleConnection.writeCha…S)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // co.bird.android.model.VehicleConnection
    public Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<Observable<byte[]>> error = Observable.error(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(error, "error(UnsupportedOperati…implemented for Birds.\"))");
        return error;
    }

    @Override // co.bird.android.model.VehicleConnection
    public String toHex(byte b) {
        return VehicleConnection.DefaultImpls.toHex(this, b);
    }

    public String toString() {
        InterfaceC44023ke5 interfaceC44023ke5 = this.rxBleConnection;
        InterfaceC45802ne5 interfaceC45802ne5 = this.rxBleDevice;
        BlePayloadEncryptor blePayloadEncryptor = this.bluetoothEncryptor;
        return "BirdVehicleConnection(rxBleConnection=" + interfaceC44023ke5 + ", rxBleDevice=" + interfaceC45802ne5 + ", bluetoothEncryptor=" + blePayloadEncryptor + ")";
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c toggleLights(boolean z) {
        Command command;
        if (z) {
            command = Command.LIGHT_ON;
        } else {
            command = Command.LIGHT_OFF;
        }
        AbstractC23461c m33159G = getRxBleConnection().mo27056c(GattUuid.COMMAND.getUuid(), command.getData()).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "rxBleConnection.writeCha…ata\n    ).ignoreElement()");
        return m33159G;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c unlock(LockKind lockKind, boolean z, String token) {
        boolean isB4Model;
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(token, "token");
        if (lockKind == LockKind.BATTERY) {
            isB4Model = BirdVehicleConnectionKt.isB4Model(getRxBleDevice());
            if (isB4Model) {
                if (!z) {
                    AbstractC23461c m33159G = getRxBleConnection().mo27056c(GattUuid.COMMAND.getUuid(), Command.UNLOCK_BATTERY.getData()).m33159G();
                    Intrinsics.checkNotNullExpressionValue(m33159G, "{\n      rxBleConnection.…  ).ignoreElement()\n    }");
                    return m33159G;
                }
                AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
                Intrinsics.checkNotNullExpressionValue(m33080F, "{\n      Completable.erro…ented for Birds.\"))\n    }");
                return m33080F;
            }
        }
        AbstractC23461c m33080F2 = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F2, "error(UnsupportedOperati…implemented for Birds.\"))");
        return m33080F2;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeData(byte[] bArr, UUID uuid) {
        return VehicleConnection.DefaultImpls.writeData(this, bArr, uuid);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeRaw(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Sending raw data not allowed for Birds."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…not allowed for Birds.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public List<String> toHex(byte[] bArr) {
        return VehicleConnection.DefaultImpls.toHex(this, bArr);
    }
}
