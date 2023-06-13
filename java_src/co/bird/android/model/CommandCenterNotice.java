package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/CommandCenterNotice;", "", "textColor", "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getTextColor", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CommandCenterNotice {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final int textColor;

    public CommandCenterNotice(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.textColor = i;
        this.message = message;
    }

    public static /* synthetic */ CommandCenterNotice copy$default(CommandCenterNotice commandCenterNotice, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commandCenterNotice.textColor;
        }
        if ((i2 & 2) != 0) {
            str = commandCenterNotice.message;
        }
        return commandCenterNotice.copy(i, str);
    }

    public final int component1() {
        return this.textColor;
    }

    public final String component2() {
        return this.message;
    }

    public final CommandCenterNotice copy(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new CommandCenterNotice(i, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandCenterNotice) {
            CommandCenterNotice commandCenterNotice = (CommandCenterNotice) obj;
            return this.textColor == commandCenterNotice.textColor && Intrinsics.areEqual(this.message, commandCenterNotice.message);
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (Integer.hashCode(this.textColor) * 31) + this.message.hashCode();
    }

    public String toString() {
        int i = this.textColor;
        String str = this.message;
        return "CommandCenterNotice(textColor=" + i + ", message=" + str + ")";
    }

    public /* synthetic */ CommandCenterNotice(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
