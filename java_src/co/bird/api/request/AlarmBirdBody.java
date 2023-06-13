package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AlarmCommand;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/AlarmBirdBody;", "", "birdId", "", "command", "Lco/bird/android/model/constant/AlarmCommand;", "durationSeconds", "", "(Ljava/lang/String;Lco/bird/android/model/constant/AlarmCommand;Ljava/lang/Integer;)V", "getBirdId", "()Ljava/lang/String;", "getCommand", "()Lco/bird/android/model/constant/AlarmCommand;", "getDurationSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/AlarmCommand;Ljava/lang/Integer;)Lco/bird/api/request/AlarmBirdBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AlarmBirdBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("command")
    @InterfaceC41208ft5("command")
    private final AlarmCommand command;
    @JsonProperty("duration_seconds")
    @InterfaceC41208ft5("duration_seconds")
    private final Integer durationSeconds;

    public AlarmBirdBody(String birdId, AlarmCommand command, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.birdId = birdId;
        this.command = command;
        this.durationSeconds = num;
    }

    public static /* synthetic */ AlarmBirdBody copy$default(AlarmBirdBody alarmBirdBody, String str, AlarmCommand alarmCommand, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alarmBirdBody.birdId;
        }
        if ((i & 2) != 0) {
            alarmCommand = alarmBirdBody.command;
        }
        if ((i & 4) != 0) {
            num = alarmBirdBody.durationSeconds;
        }
        return alarmBirdBody.copy(str, alarmCommand, num);
    }

    public final String component1() {
        return this.birdId;
    }

    public final AlarmCommand component2() {
        return this.command;
    }

    public final Integer component3() {
        return this.durationSeconds;
    }

    public final AlarmBirdBody copy(String birdId, AlarmCommand command, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new AlarmBirdBody(birdId, command, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlarmBirdBody) {
            AlarmBirdBody alarmBirdBody = (AlarmBirdBody) obj;
            return Intrinsics.areEqual(this.birdId, alarmBirdBody.birdId) && this.command == alarmBirdBody.command && Intrinsics.areEqual(this.durationSeconds, alarmBirdBody.durationSeconds);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final AlarmCommand getCommand() {
        return this.command;
    }

    public final Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public int hashCode() {
        int hashCode = ((this.birdId.hashCode() * 31) + this.command.hashCode()) * 31;
        Integer num = this.durationSeconds;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.birdId;
        AlarmCommand alarmCommand = this.command;
        Integer num = this.durationSeconds;
        return "AlarmBirdBody(birdId=" + str + ", command=" + alarmCommand + ", durationSeconds=" + num + ")";
    }

    public /* synthetic */ AlarmBirdBody(String str, AlarmCommand alarmCommand, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, alarmCommand, (i & 4) != 0 ? null : num);
    }
}
