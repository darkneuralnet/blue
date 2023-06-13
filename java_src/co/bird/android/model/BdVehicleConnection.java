package co.bird.android.model;

import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u001f\u0012\u0006\u0010/\u001a\u00020)\u0012\u0006\u00100\u001a\u00020+\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\bG\u0010HJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\"0\"2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0017H\u0016J\t\u0010*\u001a\u00020)HÆ\u0003J\t\u0010,\u001a\u00020+HÆ\u0003J\t\u0010.\u001a\u00020-HÆ\u0003J'\u00102\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u00020+2\b\b\u0002\u00101\u001a\u00020-HÆ\u0001J\t\u00103\u001a\u00020\u0002HÖ\u0001J\t\u00105\u001a\u000204HÖ\u0001J\u0013\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003R\u001a\u0010/\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001a\u00100\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b=\u0010>R\u001a\u00101\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010F\u001a\u0004\u0018\u00010\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006J"}, m28432d2 = {"Lco/bird/android/model/BdVehicleConnection;", "Lco/bird/android/model/VehicleConnection;", "", "token", "", "locking", "pcmLockCommand", "batteryLockCommand", "pileCableLockCommand", "helmetBasketLockCommand", "Lco/bird/android/model/LockKind;", "lockKind", "response", "parseLockCommandResponse", "(Lco/bird/android/model/LockKind;Ljava/lang/String;)Ljava/lang/Boolean;", "unlock", "ackResponsePostfix", "enabled", "Lio/reactivex/F;", "deepSleep", "Lio/reactivex/c;", "firmwareInquiry", "initiateChallenge", "", "command", "sendOTAUpdateCommand", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "alarm", "byteArray", "writeRaw", "Lke5;", "component1", "Lne5;", "component2", "Lco/bird/android/model/BlePayloadEncryptor;", "component3", "rxBleConnection", "rxBleDevice", "bluetoothEncryptor", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lke5;", "getRxBleConnection", "()Lke5;", "Lne5;", "getRxBleDevice", "()Lne5;", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "deviceName$delegate", "Lkotlin/Lazy;", "getDeviceName", "()Ljava/lang/String;", "deviceName", "<init>", "(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BdVehicleConnection implements VehicleConnection {
    public static final String ALARM_COMMAND_PREFIX = "AT+BKLOC=";
    public static final Companion Companion = new Companion(null);
    public static final String LIGHTS_COMMAND_ACK_PREFIX = "+ACK:BKLED,";
    public static final String LIGHTS_COMMAND_PREFIX = "AT+BKLED=";
    public static final String LOCK_COMMAND_ACK_PREFIX = "+ACK:BKSCT,";
    public static final String LOCK_COMMAND_PREFIX = "AT+BKSCT=";
    public static final String MAX_SPEED_COMMAND_ACK_PREFIX = "+ACK:BKECP,";
    public static final String MAX_SPEED_COMMAND_PREFIX = "AT+BKECP=";
    private final BlePayloadEncryptor bluetoothEncryptor;
    private final Lazy deviceName$delegate;
    private final InterfaceC44023ke5 rxBleConnection;
    private final InterfaceC45802ne5 rxBleDevice;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/BdVehicleConnection$Companion;", "", "()V", "ALARM_COMMAND_PREFIX", "", "LIGHTS_COMMAND_ACK_PREFIX", "LIGHTS_COMMAND_PREFIX", "LOCK_COMMAND_ACK_PREFIX", "LOCK_COMMAND_PREFIX", "MAX_SPEED_COMMAND_ACK_PREFIX", "MAX_SPEED_COMMAND_PREFIX", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LockKind.values().length];
            try {
                iArr[LockKind.PCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LockKind.BATTERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LockKind.CABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LockKind.BASKET_HELMET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BdVehicleConnection(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        this.rxBleConnection = rxBleConnection;
        this.rxBleDevice = rxBleDevice;
        this.bluetoothEncryptor = bluetoothEncryptor;
        lazy = LazyKt__LazyJVMKt.lazy(new BdVehicleConnection$deviceName$2(this));
        this.deviceName$delegate = lazy;
    }

    private final String ackResponsePostfix(LockKind lockKind, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[lockKind.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (z) {
                            return "30$";
                        }
                        return "31$";
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (z) {
                    return "20$";
                } else {
                    return "21$";
                }
            } else if (z) {
                return "10$";
            } else {
                return "11$";
            }
        } else if (z) {
            return "0$";
        } else {
            return "1$";
        }
    }

    private final String batteryLockCommand(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        return LOCK_COMMAND_PREFIX + str + ",1" + str2 + "$\r\n";
    }

    public static /* synthetic */ BdVehicleConnection copy$default(BdVehicleConnection bdVehicleConnection, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC45802ne5 interfaceC45802ne5, BlePayloadEncryptor blePayloadEncryptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC44023ke5 = bdVehicleConnection.rxBleConnection;
        }
        if ((i & 2) != 0) {
            interfaceC45802ne5 = bdVehicleConnection.rxBleDevice;
        }
        if ((i & 4) != 0) {
            blePayloadEncryptor = bdVehicleConnection.bluetoothEncryptor;
        }
        return bdVehicleConnection.copy(interfaceC44023ke5, interfaceC45802ne5, blePayloadEncryptor);
    }

    private final String helmetBasketLockCommand(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        return LOCK_COMMAND_PREFIX + str + ",3" + str2 + "$\r\n";
    }

    private final Boolean parseLockCommandResponse(LockKind lockKind, String str) {
        boolean contains$default;
        boolean contains$default2;
        String ackResponsePostfix = ackResponsePostfix(lockKind, false);
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) (LOCK_COMMAND_ACK_PREFIX + ackResponsePostfix), false, 2, (Object) null);
        if (contains$default) {
            return Boolean.TRUE;
        }
        String ackResponsePostfix2 = ackResponsePostfix(lockKind, true);
        contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) (LOCK_COMMAND_ACK_PREFIX + ackResponsePostfix2), false, 2, (Object) null);
        if (!contains$default2) {
            return null;
        }
        return Boolean.FALSE;
    }

    private final String pcmLockCommand(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        return LOCK_COMMAND_PREFIX + str + "," + str2 + "$\r\n";
    }

    private final String pileCableLockCommand(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        return LOCK_COMMAND_PREFIX + str + ",2" + str2 + "$\r\n";
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c alarm(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        byte[] bytes = (ALARM_COMMAND_PREFIX + token + ",0$\r\n").getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return writeData(bytes, GattUuid.BD_COMMAND.getUuid());
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

    public final BdVehicleConnection copy(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        return new BdVehicleConnection(rxBleConnection, rxBleDevice, bluetoothEncryptor);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23442F<VehicleConnection> deepSleep(boolean z) {
        AbstractC23442F<VehicleConnection> m33100x = AbstractC23442F.m33100x(new UnsupportedOperationException("Bird Zeroes cannot have their deep sleep status changed over bluetooth."));
        Intrinsics.checkNotNullExpressionValue(m33100x, "error(UnsupportedOperati…hanged over bluetooth.\"))");
        return m33100x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BdVehicleConnection) {
            BdVehicleConnection bdVehicleConnection = (BdVehicleConnection) obj;
            return Intrinsics.areEqual(this.rxBleConnection, bdVehicleConnection.rxBleConnection) && Intrinsics.areEqual(this.rxBleDevice, bdVehicleConnection.rxBleDevice) && Intrinsics.areEqual(this.bluetoothEncryptor, bdVehicleConnection.bluetoothEncryptor);
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c firmwareInquiry() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Zeroes."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…ented for Bird Zeroes.\"))");
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Bird Zero does not support setting distinct speed modes. Try setting max speed instead."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…ing max speed instead.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c softReset() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Bird Zeroes do not support soft reset command over bluetooth."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…ommand over bluetooth.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<Observable<byte[]>> mo27057b = getRxBleConnection().mo27057b(GattUuid.BD_COMMAND.getUuid(), mode);
        Intrinsics.checkNotNullExpressionValue(mo27057b, "rxBleConnection.setupNot…id.BD_COMMAND.uuid, mode)");
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
        return "BdVehicleConnection(rxBleConnection=" + interfaceC44023ke5 + ", rxBleDevice=" + interfaceC45802ne5 + ", bluetoothEncryptor=" + blePayloadEncryptor + ")";
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
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(token, "token");
        int i = WhenMappings.$EnumSwitchMapping$0[lockKind.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bytes = helmetBasketLockCommand(token, z).getBytes(Charsets.US_ASCII);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        return writeData(bytes, GattUuid.BD_COMMAND.getUuid());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                byte[] bytes2 = pileCableLockCommand(token, z).getBytes(Charsets.US_ASCII);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                return writeData(bytes2, GattUuid.BD_COMMAND.getUuid());
            }
            byte[] bytes3 = batteryLockCommand(token, z).getBytes(Charsets.US_ASCII);
            Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
            return writeData(bytes3, GattUuid.BD_COMMAND.getUuid());
        }
        byte[] bytes4 = pcmLockCommand(token, z).getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
        return writeData(bytes4, GattUuid.BD_COMMAND.getUuid());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeData(byte[] bArr, UUID uuid) {
        return VehicleConnection.DefaultImpls.writeData(this, bArr, uuid);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeRaw(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Sending raw data not allowed for Bird Zeroes."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…lowed for Bird Zeroes.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public List<String> toHex(byte[] bArr) {
        return VehicleConnection.DefaultImpls.toHex(this, bArr);
    }
}
