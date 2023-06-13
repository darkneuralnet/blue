package co.bird.android.model;

import co.bird.android.model.BirdBikeVehicleConnection;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u001f\u0012\u0006\u0010=\u001a\u000207\u0012\u0006\u0010>\u001a\u000209\u0012\u0006\u0010?\u001a\u00020;¢\u0006\u0004\bV\u0010WJ,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0,0,2\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u001dH\u0016J \u00104\u001a\u00020\u00072\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020#H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u000eH\u0016J\t\u00108\u001a\u000207HÆ\u0003J\t\u0010:\u001a\u000209HÆ\u0003J\t\u0010<\u001a\u00020;HÆ\u0003J'\u0010@\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002092\b\b\u0002\u0010?\u001a\u00020;HÆ\u0001J\t\u0010A\u001a\u00020#HÖ\u0001J\t\u0010C\u001a\u00020BHÖ\u0001J\u0013\u0010F\u001a\u00020\u001d2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003R\u001a\u0010=\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010>\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010?\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u001d\u0010U\u001a\u0004\u0018\u00010#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006Y"}, m28432d2 = {"Lco/bird/android/model/BirdBikeVehicleConnection;", "Lco/bird/android/model/VehicleConnection;", "Lco/bird/android/model/Command;", "command", "", "withMillisDelay", "Lkotlin/Function0;", "Lio/reactivex/c;", "andThen", "writeCommandData", "Lio/reactivex/F;", "Lue5;", "discoverServices", "requestToken", "", "currentSessionToken", "", "setCurrentSessionToken", "refreshStatus", "resetTripOdometer", "resetTotalOdometer", "resetServiceIndicator", "queryDisplayFirmware", "queryECUFirmware", "queryBMSFirmware", MessageExtension.FIELD_DATA, "Ljava/util/UUID;", "characteristicUuid", "writeData", "", "enabled", "deepSleep", "firmwareInquiry", "initiateChallenge", "sendOTAUpdateCommand", "", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "token", "unlock", "byteArray", "writeRaw", "Lke5;", "component1", "Lne5;", "component2", "Lco/bird/android/model/BlePayloadEncryptor;", "component3", "rxBleConnection", "rxBleDevice", "bluetoothEncryptor", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lke5;", "getRxBleConnection", "()Lke5;", "Lne5;", "getRxBleDevice", "()Lne5;", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "[B", "deviceName$delegate", "Lkotlin/Lazy;", "getDeviceName", "()Ljava/lang/String;", "deviceName", "<init>", "(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeVehicleConnection implements VehicleConnection {
    public static final Companion Companion = new Companion(null);
    public static final int RAW_DATA_MTU = 16;
    private final BlePayloadEncryptor bluetoothEncryptor;
    private byte[] currentSessionToken;
    private final Lazy deviceName$delegate;
    private final InterfaceC44023ke5 rxBleConnection;
    private final InterfaceC45802ne5 rxBleDevice;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdBikeVehicleConnection$Companion;", "", "()V", "RAW_DATA_MTU", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BirdBikeVehicleConnection(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        this.rxBleConnection = rxBleConnection;
        this.rxBleDevice = rxBleDevice;
        this.bluetoothEncryptor = bluetoothEncryptor;
        this.currentSessionToken = new byte[0];
        lazy = LazyKt__LazyJVMKt.lazy(new BirdBikeVehicleConnection$deviceName$2(this));
        this.deviceName$delegate = lazy;
    }

    public static /* synthetic */ BirdBikeVehicleConnection copy$default(BirdBikeVehicleConnection birdBikeVehicleConnection, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC45802ne5 interfaceC45802ne5, BlePayloadEncryptor blePayloadEncryptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC44023ke5 = birdBikeVehicleConnection.rxBleConnection;
        }
        if ((i & 2) != 0) {
            interfaceC45802ne5 = birdBikeVehicleConnection.rxBleDevice;
        }
        if ((i & 4) != 0) {
            blePayloadEncryptor = birdBikeVehicleConnection.bluetoothEncryptor;
        }
        return birdBikeVehicleConnection.copy(interfaceC44023ke5, interfaceC45802ne5, blePayloadEncryptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToNotifications$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC23461c writeCommandData(Command command, final long j, final Function0<? extends AbstractC23461c> function0) {
        byte[] plus;
        List<String> hex = toHex(command.getData());
        C41318g46.m40163a("writing bike command now: " + hex, new Object[0]);
        plus = ArraysKt___ArraysJvmKt.plus(command.getData(), this.currentSessionToken);
        AbstractC23461c m33065U = writeData(plus, GattUuid.BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID.getUuid()).m33065U(2L);
        final BirdBikeVehicleConnection$writeCommandData$1 birdBikeVehicleConnection$writeCommandData$1 = new BirdBikeVehicleConnection$writeCommandData$1(command);
        AbstractC23461c m33069Q = m33065U.m33084B(new InterfaceC23484g() { // from class: fJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdBikeVehicleConnection.writeCommandData$lambda$2(Function1.this, obj);
            }
        }).m33069Q();
        if (function0 != null) {
            m33069Q = m33069Q.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: gJ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h writeCommandData$lambda$4$lambda$3;
                    writeCommandData$lambda$4$lambda$3 = BirdBikeVehicleConnection.writeCommandData$lambda$4$lambda$3(j, function0);
                    return writeCommandData$lambda$4$lambda$3;
                }
            }));
        }
        Intrinsics.checkNotNullExpressionValue(m33069Q, "command: Command, withMi…     it\n        }\n      }");
        return m33069Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23461c writeCommandData$default(BirdBikeVehicleConnection birdBikeVehicleConnection, Command command, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 100;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return birdBikeVehicleConnection.writeCommandData(command, j, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeCommandData$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h writeCommandData$lambda$4$lambda$3(long j, Function0 function0) {
        return AbstractC23461c.m33057c0(j, TimeUnit.MILLISECONDS).m33049i((InterfaceC23496h) function0.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h writeData$lambda$0(Function1 tmp0, Object obj) {
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

    public final BirdBikeVehicleConnection copy(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        return new BirdBikeVehicleConnection(rxBleConnection, rxBleDevice, bluetoothEncryptor);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23442F<VehicleConnection> deepSleep(boolean z) {
        AbstractC23442F<VehicleConnection> m33100x = AbstractC23442F.m33100x(new UnsupportedOperationException("Bird Bike does not support deep sleep. Power off using hardware button instead."));
        Intrinsics.checkNotNullExpressionValue(m33100x, "error(UnsupportedOperati…rdware button instead.\"))");
        return m33100x;
    }

    public final AbstractC23442F<C49952ue5> discoverServices() {
        AbstractC23442F<C49952ue5> mo27058a = getRxBleConnection().mo27058a();
        Intrinsics.checkNotNullExpressionValue(mo27058a, "rxBleConnection.discoverServices()");
        return mo27058a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdBikeVehicleConnection) {
            BirdBikeVehicleConnection birdBikeVehicleConnection = (BirdBikeVehicleConnection) obj;
            return Intrinsics.areEqual(this.rxBleConnection, birdBikeVehicleConnection.rxBleConnection) && Intrinsics.areEqual(this.rxBleDevice, birdBikeVehicleConnection.rxBleDevice) && Intrinsics.areEqual(this.bluetoothEncryptor, birdBikeVehicleConnection.bluetoothEncryptor);
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c firmwareInquiry() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Bike."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Bike.\"))");
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Bike."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Bike.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryBMSFirmware() {
        return writeCommandData$default(this, Command.BIRD_BIKE_QUERY_BMS_FIRMWARE, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryDisplayFirmware() {
        return writeCommandData$default(this, Command.BIRD_BIKE_QUERY_DISPLAY_FIRMWARE, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c queryECUFirmware() {
        return writeCommandData$default(this, Command.BIRD_BIKE_QUERY_ECU_FIRMWARE, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c refreshStatus() {
        List<String> hex = toHex(this.currentSessionToken);
        C41318g46.m40163a("currentSessionToken = " + hex, new Object[0]);
        return writeCommandData(Command.BIRD_BIKE_GET_BATTERY, 200L, new BirdBikeVehicleConnection$refreshStatus$1(this));
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c requestToken() {
        return writeData(Command.BIRD_BIKE_GET_TOKEN.getData(), GattUuid.BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID.getUuid());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetServiceIndicator() {
        return writeCommandData$default(this, Command.BIRD_BIKE_CLEAR_MAINTENANCE_MILEAGE, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetTotalOdometer() {
        return writeCommandData$default(this, Command.BIRD_BIKE_CLEAR_TOTAL_ODOMETER, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c resetTripOdometer() {
        return writeCommandData$default(this, Command.BIRD_BIKE_CLEAR_TRIP_ODOMETER, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendOTAUpdateCommand(byte[] command) {
        Intrinsics.checkNotNullParameter(command, "command");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Bike."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Bike.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendPasscode(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Bike."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Bike.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public void setCurrentSessionToken(byte[] currentSessionToken) {
        Intrinsics.checkNotNullParameter(currentSessionToken, "currentSessionToken");
        List<String> hex = toHex(currentSessionToken);
        C41318g46.m40163a("currentSessionToken = " + hex, new Object[0]);
        this.currentSessionToken = currentSessionToken;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c setSpeedMode(VehicleSpeedMode speedMode) {
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Bike."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Bike.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c softReset() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Bird Bike does no support soft reset command."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…rt soft reset command.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<Observable<byte[]>> mo27057b = getRxBleConnection().mo27057b(GattUuid.BIRD_BIKE_COMMAND_CHARACTERSITIC_NOTIFY_UUID.getUuid(), mode);
        final BirdBikeVehicleConnection$subscribeToNotifications$1 birdBikeVehicleConnection$subscribeToNotifications$1 = BirdBikeVehicleConnection$subscribeToNotifications$1.INSTANCE;
        Observable<Observable<byte[]>> doOnNext = mo27057b.doOnNext(new InterfaceC23484g() { // from class: iJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdBikeVehicleConnection.subscribeToNotifications$lambda$1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "rxBleConnection.setupNot…ke char (I think) $it\") }");
        return doOnNext;
    }

    @Override // co.bird.android.model.VehicleConnection
    public String toHex(byte b) {
        return VehicleConnection.DefaultImpls.toHex(this, b);
    }

    public String toString() {
        InterfaceC44023ke5 interfaceC44023ke5 = this.rxBleConnection;
        InterfaceC45802ne5 interfaceC45802ne5 = this.rxBleDevice;
        BlePayloadEncryptor blePayloadEncryptor = this.bluetoothEncryptor;
        return "BirdBikeVehicleConnection(rxBleConnection=" + interfaceC44023ke5 + ", rxBleDevice=" + interfaceC45802ne5 + ", bluetoothEncryptor=" + blePayloadEncryptor + ")";
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c toggleLights(boolean z) {
        Command command;
        List<String> hex = toHex(this.currentSessionToken);
        C41318g46.m40163a("toggle lights lightsOn (" + z + ") currentSessionToken = " + hex, new Object[0]);
        if (z) {
            command = Command.BIRD_BIKE_HEADLIGHT_ON;
        } else {
            command = Command.BIRD_BIKE_HEADLIGHT_OFF;
        }
        return writeCommandData$default(this, command, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c unlock(LockKind lockKind, boolean z, String token) {
        Command command;
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(token, "token");
        if (z) {
            command = Command.BIRD_BIKE_SET_MOTOR_LOCK_LOCKED;
        } else {
            command = Command.BIRD_BIKE_SET_MOTOR_LOCK_UNLOCKED;
        }
        return writeCommandData$default(this, command, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeData(byte[] data, UUID characteristicUuid) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(characteristicUuid, "characteristicUuid");
        List<String> hex = toHex(data);
        C41318g46.m40163a("preparing to write " + hex, new Object[0]);
        int length = 16 - (data.length % 16);
        if (length > 0) {
            data = Arrays.copyOf(data, data.length + length);
            Intrinsics.checkNotNullExpressionValue(data, "copyOf(this, newSize)");
        }
        List<String> hex2 = toHex(data);
        C41318g46.m40163a("padding data to write " + hex2, new Object[0]);
        AbstractC23442F<byte[]> encrypt = getBluetoothEncryptor().encrypt(data, getRxBleDevice().mo17280e());
        final BirdBikeVehicleConnection$writeData$1 birdBikeVehicleConnection$writeData$1 = new BirdBikeVehicleConnection$writeData$1(this, characteristicUuid);
        AbstractC23461c m33164B = encrypt.m33164B(new InterfaceC23492o() { // from class: hJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h writeData$lambda$0;
                writeData$lambda$0 = BirdBikeVehicleConnection.writeData$lambda$0(Function1.this, obj);
                return writeData$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun writeData(d…teristicUuid)\n      }\n  }");
        return m33164B;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeRaw(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        List<String> hex = toHex(byteArray);
        C41318g46.m40163a("BirdBikeVehicleConnection.writing raw: " + hex, new Object[0]);
        AbstractC23461c m33159G = getRxBleConnection().mo27056c(GattUuid.BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID.getUuid(), byteArray).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "rxBleConnection.writeCha…y)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // co.bird.android.model.VehicleConnection
    public List<String> toHex(byte[] bArr) {
        return VehicleConnection.DefaultImpls.toHex(this, bArr);
    }
}
