package co.bird.android.manager.vtbeacon;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/manager/vtbeacon/VTBeaconError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "CommandFailed", "UnknownDevice", "Lco/bird/android/manager/vtbeacon/VTBeaconError$CommandFailed;", "Lco/bird/android/manager/vtbeacon/VTBeaconError$UnknownDevice;", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class VTBeaconError extends Exception {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/manager/vtbeacon/VTBeaconError$CommandFailed;", "Lco/bird/android/manager/vtbeacon/VTBeaconError;", "command", "", "(B)V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class CommandFailed extends VTBeaconError {
        public CommandFailed(byte b) {
            super("Command failed: " + ((int) b), null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/manager/vtbeacon/VTBeaconError$UnknownDevice;", "Lco/bird/android/manager/vtbeacon/VTBeaconError;", "macAddress", "", "(Ljava/lang/String;)V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnknownDevice extends VTBeaconError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownDevice(String macAddress) {
            super("Unknown device: " + macAddress, null);
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        }
    }

    public /* synthetic */ VTBeaconError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public VTBeaconError(String str) {
        super(str);
    }
}
