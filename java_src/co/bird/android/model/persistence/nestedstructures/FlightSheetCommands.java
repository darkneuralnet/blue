package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetCommand;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\fHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "idx", "", "title", "", "commands", "", "Lco/bird/android/model/constant/FlightSheetCommand;", "alarmDurationOptions", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetIntOption;", "isBirdLocked", "", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "getAlarmDurationOptions", "()Ljava/util/List;", "getCommands", "getIdx", "()I", "()Z", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetCommands implements FlightSheetSection {
    @JsonProperty("alarm_duration_options")
    @InterfaceC41208ft5("alarm_duration_options")
    private final List<FlightSheetIntOption> alarmDurationOptions;
    @JsonProperty("commands")
    @InterfaceC41208ft5("commands")
    private final List<FlightSheetCommand> commands;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("is_bird_locked")
    @InterfaceC41208ft5("is_bird_locked")
    private final boolean isBirdLocked;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public FlightSheetCommands() {
        this(0, null, null, null, false, 31, null);
    }

    public static /* synthetic */ FlightSheetCommands copy$default(FlightSheetCommands flightSheetCommands, int i, String str, List list, List list2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flightSheetCommands.idx;
        }
        if ((i2 & 2) != 0) {
            str = flightSheetCommands.title;
        }
        String str2 = str;
        List<FlightSheetCommand> list3 = list;
        if ((i2 & 4) != 0) {
            list3 = flightSheetCommands.commands;
        }
        List list4 = list3;
        List<FlightSheetIntOption> list5 = list2;
        if ((i2 & 8) != 0) {
            list5 = flightSheetCommands.alarmDurationOptions;
        }
        List list6 = list5;
        if ((i2 & 16) != 0) {
            z = flightSheetCommands.isBirdLocked;
        }
        return flightSheetCommands.copy(i, str2, list4, list6, z);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<FlightSheetCommand> component3() {
        return this.commands;
    }

    public final List<FlightSheetIntOption> component4() {
        return this.alarmDurationOptions;
    }

    public final boolean component5() {
        return this.isBirdLocked;
    }

    public final FlightSheetCommands copy(int i, String str, List<? extends FlightSheetCommand> commands, List<FlightSheetIntOption> alarmDurationOptions, boolean z) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        Intrinsics.checkNotNullParameter(alarmDurationOptions, "alarmDurationOptions");
        return new FlightSheetCommands(i, str, commands, alarmDurationOptions, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetCommands) {
            FlightSheetCommands flightSheetCommands = (FlightSheetCommands) obj;
            return this.idx == flightSheetCommands.idx && Intrinsics.areEqual(this.title, flightSheetCommands.title) && Intrinsics.areEqual(this.commands, flightSheetCommands.commands) && Intrinsics.areEqual(this.alarmDurationOptions, flightSheetCommands.alarmDurationOptions) && this.isBirdLocked == flightSheetCommands.isBirdLocked;
        }
        return false;
    }

    public final List<FlightSheetIntOption> getAlarmDurationOptions() {
        return this.alarmDurationOptions;
    }

    public final List<FlightSheetCommand> getCommands() {
        return this.commands;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.commands.hashCode()) * 31) + this.alarmDurationOptions.hashCode()) * 31;
        boolean z = this.isBirdLocked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isBirdLocked() {
        return this.isBirdLocked;
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<FlightSheetCommand> list = this.commands;
        List<FlightSheetIntOption> list2 = this.alarmDurationOptions;
        boolean z = this.isBirdLocked;
        return "FlightSheetCommands(idx=" + i + ", title=" + str + ", commands=" + list + ", alarmDurationOptions=" + list2 + ", isBirdLocked=" + z + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSheetCommands(int i, String str, List<? extends FlightSheetCommand> commands, List<FlightSheetIntOption> alarmDurationOptions, boolean z) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        Intrinsics.checkNotNullParameter(alarmDurationOptions, "alarmDurationOptions");
        this.idx = i;
        this.title = str;
        this.commands = commands;
        this.alarmDurationOptions = alarmDurationOptions;
        this.isBirdLocked = z;
    }

    public /* synthetic */ FlightSheetCommands(int i, String str, List list, List list2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? false : z);
    }
}
