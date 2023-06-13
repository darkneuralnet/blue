package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WirePushNotificationCommand;", "", "commandName", "", "parameters", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getCommandName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePushNotificationCommand {
    @JsonProperty("command_name")
    @InterfaceC41208ft5("command_name")
    private final String commandName;
    @JsonProperty("parameters")
    @InterfaceC41208ft5("parameters")
    private final Map<String, Object> parameters;

    public WirePushNotificationCommand() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WirePushNotificationCommand copy$default(WirePushNotificationCommand wirePushNotificationCommand, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wirePushNotificationCommand.commandName;
        }
        if ((i & 2) != 0) {
            map = wirePushNotificationCommand.parameters;
        }
        return wirePushNotificationCommand.copy(str, map);
    }

    public final String component1() {
        return this.commandName;
    }

    public final Map<String, Object> component2() {
        return this.parameters;
    }

    public final WirePushNotificationCommand copy(String commandName, Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new WirePushNotificationCommand(commandName, parameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePushNotificationCommand) {
            WirePushNotificationCommand wirePushNotificationCommand = (WirePushNotificationCommand) obj;
            return Intrinsics.areEqual(this.commandName, wirePushNotificationCommand.commandName) && Intrinsics.areEqual(this.parameters, wirePushNotificationCommand.parameters);
        }
        return false;
    }

    public final String getCommandName() {
        return this.commandName;
    }

    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return (this.commandName.hashCode() * 31) + this.parameters.hashCode();
    }

    public String toString() {
        String str = this.commandName;
        Map<String, Object> map = this.parameters;
        return "WirePushNotificationCommand(commandName=" + str + ", parameters=" + map + ")";
    }

    public WirePushNotificationCommand(String commandName, Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.commandName = commandName;
        this.parameters = parameters;
    }

    public /* synthetic */ WirePushNotificationCommand(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
