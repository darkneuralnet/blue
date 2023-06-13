package co.bird.android.model;

import co.bird.android.model.BirdFlexVehicleConnection;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.constant.VehicleSpeedMode;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0086\b\u0018\u0000 M2\u00020\u0001:\bNMOPQRSTB\u001f\u0012\u0006\u00102\u001a\u00020,\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00104\u001a\u000200¢\u0006\u0004\bK\u0010LJ,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001b0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\nH\u0016J \u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016J\t\u0010-\u001a\u00020,HÆ\u0003J\t\u0010/\u001a\u00020.HÆ\u0003J\t\u00101\u001a\u000200HÆ\u0003J'\u00105\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020,2\b\b\u0002\u00103\u001a\u00020.2\b\b\u0002\u00104\u001a\u000200HÆ\u0001J\t\u00106\u001a\u00020\u0012HÖ\u0001J\t\u00108\u001a\u000207HÖ\u0001J\u0013\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003R\u001a\u00102\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b=\u0010>R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b@\u0010AR\u001a\u00104\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\u001d\u0010J\u001a\u0004\u0018\u00010\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006U"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection;", "Lco/bird/android/model/VehicleConnection;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "command", "", "withMillisDelay", "Lkotlin/Function0;", "Lio/reactivex/c;", "andThen", "writeCommandData", "", "enabled", "Lio/reactivex/F;", "deepSleep", "firmwareInquiry", "initiateChallenge", "", "sendOTAUpdateCommand", "", "passcode", "sendPasscode", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "setSpeedMode", "softReset", "Lfd3;", "mode", "Lio/reactivex/Observable;", "subscribeToNotifications", "lightsOn", "toggleLights", "Lco/bird/android/model/LockKind;", "lockKind", "locking", "token", "unlock", "byteArray", "writeRaw", "requestToken", "currentSessionToken", "", "setCurrentSessionToken", "refreshStatus", "alarm", "Lke5;", "component1", "Lne5;", "component2", "Lco/bird/android/model/BlePayloadEncryptor;", "component3", "rxBleConnection", "rxBleDevice", "bluetoothEncryptor", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Lke5;", "getRxBleConnection", "()Lke5;", "Lne5;", "getRxBleDevice", "()Lne5;", "Lco/bird/android/model/BlePayloadEncryptor;", "getBluetoothEncryptor", "()Lco/bird/android/model/BlePayloadEncryptor;", "Ljava/lang/String;", "deviceName$delegate", "Lkotlin/Lazy;", "getDeviceName", "()Ljava/lang/String;", "deviceName", "<init>", "(Lke5;Lne5;Lco/bird/android/model/BlePayloadEncryptor;)V", "Companion", "ChirpLightFlexCommand", "FlexCommand", "HeadlightOffFlexCommand", "HeadlightOnFlexCommand", "LockFlexCommand", "RefreshStatusFlexCommand", "UnLockFlexCommand", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdFlexVehicleConnection implements VehicleConnection {
    public static final String CHIRP_LIGHT_COMMAND = "OKLOC";
    public static final String CONTROL_COMMAND_PREFIX = "AT+";
    public static final String CONTROL_COMMAND_RESPONSE_PREFIX = "+ACK";
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_STATUS_COMMAND = "OKECO";
    public static final String LOCK_PCM_COMMAND = "OKSCM";
    public static final String MESSAGE_INSTRUCTION_RESPONSE_PREFIX = "+RESP";
    public static final String REFRESH_STATUS_COMMAND = "OKALC";
    public static final String TOGGLE_HEADLIGHT_COMMAND = "OKLED";
    public static final String UNSOLICITED_STATUS_COMMAND = "OKCCF";
    private final BlePayloadEncryptor bluetoothEncryptor;
    private String currentSessionToken;
    private final Lazy deviceName$delegate;
    private final InterfaceC44023ke5 rxBleConnection;
    private final InterfaceC45802ne5 rxBleDevice;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$ChirpLightFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class ChirpLightFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ ChirpLightFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ ChirpLightFlexCommand m116245boximpl(String str) {
            return new ChirpLightFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116246constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116247equalsimpl(String str, Object obj) {
            return (obj instanceof ChirpLightFlexCommand) && Intrinsics.areEqual(str, ((ChirpLightFlexCommand) obj).m116253unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116248equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116249getCommandimpl(String str) {
            return "AT+OKLOC=" + str + ",0001$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116250getPayloadimpl(String str) {
            return m116245boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116251hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116252toStringimpl(String str) {
            return "ChirpLightFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116247equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116249getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116251hashCodeimpl(this.token);
        }

        public String toString() {
            return m116252toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116253unboximpl() {
            return this.token;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$Companion;", "", "()V", "CHIRP_LIGHT_COMMAND", "", "CONTROL_COMMAND_PREFIX", "CONTROL_COMMAND_RESPONSE_PREFIX", "ERROR_STATUS_COMMAND", "LOCK_PCM_COMMAND", "MESSAGE_INSTRUCTION_RESPONSE_PREFIX", "REFRESH_STATUS_COMMAND", "TOGGLE_HEADLIGHT_COMMAND", "UNSOLICITED_STATUS_COMMAND", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "", "command", "", "getCommand", "()Ljava/lang/String;", "payload", "", "getPayload", "()[B", "token", "getToken", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public interface FlexCommand {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static byte[] getPayload(FlexCommand flexCommand) {
                byte[] bytes = flexCommand.getCommand().getBytes(Charsets.US_ASCII);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            }
        }

        String getCommand();

        byte[] getPayload();

        String getToken();
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$HeadlightOffFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class HeadlightOffFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ HeadlightOffFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ HeadlightOffFlexCommand m116254boximpl(String str) {
            return new HeadlightOffFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116255constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116256equalsimpl(String str, Object obj) {
            return (obj instanceof HeadlightOffFlexCommand) && Intrinsics.areEqual(str, ((HeadlightOffFlexCommand) obj).m116262unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116257equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116258getCommandimpl(String str) {
            return "AT+OKLED=" + str + ",0,0,0004$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116259getPayloadimpl(String str) {
            return m116254boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116260hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116261toStringimpl(String str) {
            return "HeadlightOffFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116256equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116258getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116260hashCodeimpl(this.token);
        }

        public String toString() {
            return m116261toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116262unboximpl() {
            return this.token;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$HeadlightOnFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class HeadlightOnFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ HeadlightOnFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ HeadlightOnFlexCommand m116263boximpl(String str) {
            return new HeadlightOnFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116264constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116265equalsimpl(String str, Object obj) {
            return (obj instanceof HeadlightOnFlexCommand) && Intrinsics.areEqual(str, ((HeadlightOnFlexCommand) obj).m116271unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116266equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116267getCommandimpl(String str) {
            return "AT+OKLED=" + str + ",0,1,0004$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116268getPayloadimpl(String str) {
            return m116263boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116269hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116270toStringimpl(String str) {
            return "HeadlightOnFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116265equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116267getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116269hashCodeimpl(this.token);
        }

        public String toString() {
            return m116270toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116271unboximpl() {
            return this.token;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$LockFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class LockFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ LockFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ LockFlexCommand m116272boximpl(String str) {
            return new LockFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116273constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116274equalsimpl(String str, Object obj) {
            return (obj instanceof LockFlexCommand) && Intrinsics.areEqual(str, ((LockFlexCommand) obj).m116280unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116275equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116276getCommandimpl(String str) {
            return "AT+OKSCM=" + str + ",1,0001$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116277getPayloadimpl(String str) {
            return m116272boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116278hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116279toStringimpl(String str) {
            return "LockFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116274equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116276getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116278hashCodeimpl(this.token);
        }

        public String toString() {
            return m116279toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116280unboximpl() {
            return this.token;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$RefreshStatusFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class RefreshStatusFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ RefreshStatusFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ RefreshStatusFlexCommand m116281boximpl(String str) {
            return new RefreshStatusFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116282constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116283equalsimpl(String str, Object obj) {
            return (obj instanceof RefreshStatusFlexCommand) && Intrinsics.areEqual(str, ((RefreshStatusFlexCommand) obj).m116289unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116284equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116285getCommandimpl(String str) {
            return "AT+OKALC=" + str + ",0001$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116286getPayloadimpl(String str) {
            return m116281boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116287hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116288toStringimpl(String str) {
            return "RefreshStatusFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116283equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116285getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116287hashCodeimpl(this.token);
        }

        public String toString() {
            return m116288toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116289unboximpl() {
            return this.token;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdFlexVehicleConnection$UnLockFlexCommand;", "Lco/bird/android/model/BirdFlexVehicleConnection$FlexCommand;", "token", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "command", "getCommand-impl", "getToken", "()Ljava/lang/String;", "equals", "", LegacyRepairType.OTHER_KEY, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @JvmInline
    /* loaded from: classes4.dex */
    public static final class UnLockFlexCommand implements FlexCommand {
        private final String token;

        private /* synthetic */ UnLockFlexCommand(String str) {
            this.token = str;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ UnLockFlexCommand m116290boximpl(String str) {
            return new UnLockFlexCommand(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m116291constructorimpl(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return token;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m116292equalsimpl(String str, Object obj) {
            return (obj instanceof UnLockFlexCommand) && Intrinsics.areEqual(str, ((UnLockFlexCommand) obj).m116298unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m116293equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: getCommand-impl  reason: not valid java name */
        public static String m116294getCommandimpl(String str) {
            return "AT+OKSCM=" + str + ",0,0001$\r\n";
        }

        /* renamed from: getPayload-impl  reason: not valid java name */
        public static byte[] m116295getPayloadimpl(String str) {
            return m116290boximpl(str).getPayload();
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m116296hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m116297toStringimpl(String str) {
            return "UnLockFlexCommand(token=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m116292equalsimpl(this.token, obj);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getCommand() {
            return m116294getCommandimpl(this.token);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public byte[] getPayload() {
            return FlexCommand.DefaultImpls.getPayload(this);
        }

        @Override // co.bird.android.model.BirdFlexVehicleConnection.FlexCommand
        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            return m116296hashCodeimpl(this.token);
        }

        public String toString() {
            return m116297toStringimpl(this.token);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116298unboximpl() {
            return this.token;
        }
    }

    public BirdFlexVehicleConnection(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        this.rxBleConnection = rxBleConnection;
        this.rxBleDevice = rxBleDevice;
        this.bluetoothEncryptor = bluetoothEncryptor;
        this.currentSessionToken = "";
        lazy = LazyKt__LazyJVMKt.lazy(new BirdFlexVehicleConnection$deviceName$2(this));
        this.deviceName$delegate = lazy;
    }

    public static /* synthetic */ BirdFlexVehicleConnection copy$default(BirdFlexVehicleConnection birdFlexVehicleConnection, InterfaceC44023ke5 interfaceC44023ke5, InterfaceC45802ne5 interfaceC45802ne5, BlePayloadEncryptor blePayloadEncryptor, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC44023ke5 = birdFlexVehicleConnection.rxBleConnection;
        }
        if ((i & 2) != 0) {
            interfaceC45802ne5 = birdFlexVehicleConnection.rxBleDevice;
        }
        if ((i & 4) != 0) {
            blePayloadEncryptor = birdFlexVehicleConnection.bluetoothEncryptor;
        }
        return birdFlexVehicleConnection.copy(interfaceC44023ke5, interfaceC45802ne5, blePayloadEncryptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B subscribeToNotifications$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B subscribeToNotifications$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToNotifications$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final AbstractC23461c writeCommandData(FlexCommand flexCommand, final long j, final Function0<? extends AbstractC23461c> function0) {
        String command = flexCommand.getCommand();
        byte[] payload = flexCommand.getPayload();
        C41318g46.m40163a("writing flex command now: " + command + " - " + payload, new Object[0]);
        AbstractC23461c m33065U = writeData(flexCommand.getPayload(), GattUuid.BIRD_FLEX_COMMAND_UUID.getUuid()).m33065U(2L);
        final BirdFlexVehicleConnection$writeCommandData$1 birdFlexVehicleConnection$writeCommandData$1 = new BirdFlexVehicleConnection$writeCommandData$1(flexCommand);
        AbstractC23461c m33069Q = m33065U.m33084B(new InterfaceC23484g() { // from class: ML
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdFlexVehicleConnection.writeCommandData$lambda$3(Function1.this, obj);
            }
        }).m33069Q();
        if (function0 != null) {
            m33069Q = m33069Q.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: NL
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h writeCommandData$lambda$5$lambda$4;
                    writeCommandData$lambda$5$lambda$4 = BirdFlexVehicleConnection.writeCommandData$lambda$5$lambda$4(j, function0);
                    return writeCommandData$lambda$5$lambda$4;
                }
            }));
        }
        Intrinsics.checkNotNullExpressionValue(m33069Q, "command: FlexCommand, wi…     it\n        }\n      }");
        return m33069Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23461c writeCommandData$default(BirdFlexVehicleConnection birdFlexVehicleConnection, FlexCommand flexCommand, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 100;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return birdFlexVehicleConnection.writeCommandData(flexCommand, j, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeCommandData$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h writeCommandData$lambda$5$lambda$4(long j, Function0 function0) {
        return AbstractC23461c.m33057c0(j, TimeUnit.MILLISECONDS).m33049i((InterfaceC23496h) function0.invoke());
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c alarm(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return writeCommandData$default(this, ChirpLightFlexCommand.m116245boximpl(ChirpLightFlexCommand.m116246constructorimpl(this.currentSessionToken)), 0L, null, 6, null);
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

    public final BirdFlexVehicleConnection copy(InterfaceC44023ke5 rxBleConnection, InterfaceC45802ne5 rxBleDevice, BlePayloadEncryptor bluetoothEncryptor) {
        Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        Intrinsics.checkNotNullParameter(rxBleDevice, "rxBleDevice");
        Intrinsics.checkNotNullParameter(bluetoothEncryptor, "bluetoothEncryptor");
        return new BirdFlexVehicleConnection(rxBleConnection, rxBleDevice, bluetoothEncryptor);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23442F<VehicleConnection> deepSleep(boolean z) {
        AbstractC23442F<VehicleConnection> m33100x = AbstractC23442F.m33100x(new UnsupportedOperationException("Bird Flex does not support deep sleep. Power off using hardware button instead."));
        Intrinsics.checkNotNullExpressionValue(m33100x, "error(UnsupportedOperati…rdware button instead.\"))");
        return m33100x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdFlexVehicleConnection) {
            BirdFlexVehicleConnection birdFlexVehicleConnection = (BirdFlexVehicleConnection) obj;
            return Intrinsics.areEqual(this.rxBleConnection, birdFlexVehicleConnection.rxBleConnection) && Intrinsics.areEqual(this.rxBleDevice, birdFlexVehicleConnection.rxBleDevice) && Intrinsics.areEqual(this.bluetoothEncryptor, birdFlexVehicleConnection.bluetoothEncryptor);
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c firmwareInquiry() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
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
        return writeCommandData$default(this, RefreshStatusFlexCommand.m116281boximpl(RefreshStatusFlexCommand.m116282constructorimpl(this.currentSessionToken)), 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c requestToken() {
        return writeData(Command.BIRD_BIKE_GET_TOKEN.getData(), GattUuid.BIRD_BIKE_COMMAND_WRITE_CHARACTERSITIC_UUID.getUuid());
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
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c sendPasscode(String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public void setCurrentSessionToken(byte[] currentSessionToken) {
        Intrinsics.checkNotNullParameter(currentSessionToken, "currentSessionToken");
        List<String> hex = toHex(currentSessionToken);
        C41318g46.m40163a("currentSessionToken = " + hex, new Object[0]);
        String str = new String(currentSessionToken, Charsets.US_ASCII);
        this.currentSessionToken = str;
        C41318g46.m40163a("currentSessionToken ASCII = " + str, new Object[0]);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c setSpeedMode(VehicleSpeedMode speedMode) {
        Intrinsics.checkNotNullParameter(speedMode, "speedMode");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c softReset() {
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public Observable<Observable<byte[]>> subscribeToNotifications(EnumC41046fd3 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<Observable<byte[]>> mo27057b = getRxBleConnection().mo27057b(GattUuid.BIRD_FLEX_COMMAND_UUID.getUuid(), mode);
        final BirdFlexVehicleConnection$subscribeToNotifications$1 birdFlexVehicleConnection$subscribeToNotifications$1 = BirdFlexVehicleConnection$subscribeToNotifications$1.INSTANCE;
        InterfaceC23434B flatMap = mo27057b.flatMap(new InterfaceC23492o() { // from class: OL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B subscribeToNotifications$lambda$0;
                subscribeToNotifications$lambda$0 = BirdFlexVehicleConnection.subscribeToNotifications$lambda$0(Function1.this, obj);
                return subscribeToNotifications$lambda$0;
            }
        });
        Observable<Observable<byte[]>> mo27057b2 = getRxBleConnection().mo27057b(GattUuid.BIRD_FLEX_STATUS_NOTIFY_UUID.getUuid(), mode);
        final BirdFlexVehicleConnection$subscribeToNotifications$2 birdFlexVehicleConnection$subscribeToNotifications$2 = BirdFlexVehicleConnection$subscribeToNotifications$2.INSTANCE;
        Observable just = Observable.just(Observable.merge(flatMap, mo27057b2.flatMap(new InterfaceC23492o() { // from class: PL
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B subscribeToNotifications$lambda$1;
                subscribeToNotifications$lambda$1 = BirdFlexVehicleConnection.subscribeToNotifications$lambda$1(Function1.this, obj);
                return subscribeToNotifications$lambda$1;
            }
        })));
        final BirdFlexVehicleConnection$subscribeToNotifications$3 birdFlexVehicleConnection$subscribeToNotifications$3 = BirdFlexVehicleConnection$subscribeToNotifications$3.INSTANCE;
        Observable<Observable<byte[]>> doOnNext = just.doOnNext(new InterfaceC23484g() { // from class: QL
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BirdFlexVehicleConnection.subscribeToNotifications$lambda$2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "just(\n      Observable.m…cations for bird flex\") }");
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
        return "BirdFlexVehicleConnection(rxBleConnection=" + interfaceC44023ke5 + ", rxBleDevice=" + interfaceC45802ne5 + ", bluetoothEncryptor=" + blePayloadEncryptor + ")";
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c toggleLights(boolean z) {
        FlexCommand m116254boximpl;
        if (z) {
            m116254boximpl = HeadlightOnFlexCommand.m116263boximpl(HeadlightOnFlexCommand.m116264constructorimpl(this.currentSessionToken));
        } else {
            m116254boximpl = HeadlightOffFlexCommand.m116254boximpl(HeadlightOffFlexCommand.m116255constructorimpl(this.currentSessionToken));
        }
        return writeCommandData$default(this, m116254boximpl, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c unlock(LockKind lockKind, boolean z, String token) {
        FlexCommand m116290boximpl;
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        Intrinsics.checkNotNullParameter(token, "token");
        if (z) {
            m116290boximpl = LockFlexCommand.m116272boximpl(LockFlexCommand.m116273constructorimpl(this.currentSessionToken));
        } else {
            m116290boximpl = UnLockFlexCommand.m116290boximpl(UnLockFlexCommand.m116291constructorimpl(this.currentSessionToken));
        }
        return writeCommandData$default(this, m116290boximpl, 0L, null, 6, null);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeData(byte[] bArr, UUID uuid) {
        return VehicleConnection.DefaultImpls.writeData(this, bArr, uuid);
    }

    @Override // co.bird.android.model.VehicleConnection
    public AbstractC23461c writeRaw(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new UnsupportedOperationException("Currently not implemented for Bird Flex."));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(UnsupportedOperati…emented for Bird Flex.\"))");
        return m33080F;
    }

    @Override // co.bird.android.model.VehicleConnection
    public List<String> toHex(byte[] bArr) {
        return VehicleConnection.DefaultImpls.toHex(this, bArr);
    }
}
