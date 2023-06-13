package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdTaskAction;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J¨\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001c¨\u0006="}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorTask;", "", "birdId", "", "taskId", "imei", "birdCode", "subtitle", "subtitleColor", "Lco/bird/android/model/wire/WireThemedColors;", "batteryLevel", "", "labelText", "labelColor", "statusIcon", "Lco/bird/android/model/constant/ClientIcon;", "statusIconBackgroundColor", "statusDisplayName", "actions", "", "Lco/bird/android/model/constant/BirdTaskAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getImei", "getLabelColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getLabelText", "getStatusDisplayName", "getStatusIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getStatusIconBackgroundColor", "getSubtitle", "getSubtitleColor", "getTaskId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/wire/WireOperatorTask;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireOperatorTask {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<BirdTaskAction> actions;
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final Integer batteryLevel;
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("imei")
    @InterfaceC41208ft5("imei")
    private final String imei;
    @JsonProperty("label_color")
    @InterfaceC41208ft5("label_color")
    private final WireThemedColors labelColor;
    @JsonProperty("label_text")
    @InterfaceC41208ft5("label_text")
    private final String labelText;
    @JsonProperty("status_display_name")
    @InterfaceC41208ft5("status_display_name")
    private final String statusDisplayName;
    @JsonProperty("status_icon")
    @InterfaceC41208ft5("status_icon")
    private final ClientIcon statusIcon;
    @JsonProperty("status_icon_background_color")
    @InterfaceC41208ft5("status_icon_background_color")
    private final WireThemedColors statusIconBackgroundColor;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("subtitle_color")
    @InterfaceC41208ft5("subtitle_color")
    private final WireThemedColors subtitleColor;
    @JsonProperty("task_id")
    @InterfaceC41208ft5("task_id")
    private final String taskId;

    public WireOperatorTask() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.birdId;
    }

    public final ClientIcon component10() {
        return this.statusIcon;
    }

    public final WireThemedColors component11() {
        return this.statusIconBackgroundColor;
    }

    public final String component12() {
        return this.statusDisplayName;
    }

    public final List<BirdTaskAction> component13() {
        return this.actions;
    }

    public final String component2() {
        return this.taskId;
    }

    public final String component3() {
        return this.imei;
    }

    public final String component4() {
        return this.birdCode;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final WireThemedColors component6() {
        return this.subtitleColor;
    }

    public final Integer component7() {
        return this.batteryLevel;
    }

    public final String component8() {
        return this.labelText;
    }

    public final WireThemedColors component9() {
        return this.labelColor;
    }

    public final WireOperatorTask copy(String birdId, String taskId, String str, String birdCode, String str2, WireThemedColors wireThemedColors, Integer num, String str3, WireThemedColors wireThemedColors2, ClientIcon clientIcon, WireThemedColors wireThemedColors3, String str4, List<? extends BirdTaskAction> actions) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new WireOperatorTask(birdId, taskId, str, birdCode, str2, wireThemedColors, num, str3, wireThemedColors2, clientIcon, wireThemedColors3, str4, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireOperatorTask) {
            WireOperatorTask wireOperatorTask = (WireOperatorTask) obj;
            return Intrinsics.areEqual(this.birdId, wireOperatorTask.birdId) && Intrinsics.areEqual(this.taskId, wireOperatorTask.taskId) && Intrinsics.areEqual(this.imei, wireOperatorTask.imei) && Intrinsics.areEqual(this.birdCode, wireOperatorTask.birdCode) && Intrinsics.areEqual(this.subtitle, wireOperatorTask.subtitle) && Intrinsics.areEqual(this.subtitleColor, wireOperatorTask.subtitleColor) && Intrinsics.areEqual(this.batteryLevel, wireOperatorTask.batteryLevel) && Intrinsics.areEqual(this.labelText, wireOperatorTask.labelText) && Intrinsics.areEqual(this.labelColor, wireOperatorTask.labelColor) && this.statusIcon == wireOperatorTask.statusIcon && Intrinsics.areEqual(this.statusIconBackgroundColor, wireOperatorTask.statusIconBackgroundColor) && Intrinsics.areEqual(this.statusDisplayName, wireOperatorTask.statusDisplayName) && Intrinsics.areEqual(this.actions, wireOperatorTask.actions);
        }
        return false;
    }

    public final List<BirdTaskAction> getActions() {
        return this.actions;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getImei() {
        return this.imei;
    }

    public final WireThemedColors getLabelColor() {
        return this.labelColor;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final String getStatusDisplayName() {
        return this.statusDisplayName;
    }

    public final ClientIcon getStatusIcon() {
        return this.statusIcon;
    }

    public final WireThemedColors getStatusIconBackgroundColor() {
        return this.statusIconBackgroundColor;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final WireThemedColors getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int hashCode = ((this.birdId.hashCode() * 31) + this.taskId.hashCode()) * 31;
        String str = this.imei;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.birdCode.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireThemedColors wireThemedColors = this.subtitleColor;
        int hashCode4 = (hashCode3 + (wireThemedColors == null ? 0 : wireThemedColors.hashCode())) * 31;
        Integer num = this.batteryLevel;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.labelText;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WireThemedColors wireThemedColors2 = this.labelColor;
        int hashCode7 = (hashCode6 + (wireThemedColors2 == null ? 0 : wireThemedColors2.hashCode())) * 31;
        ClientIcon clientIcon = this.statusIcon;
        int hashCode8 = (hashCode7 + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        WireThemedColors wireThemedColors3 = this.statusIconBackgroundColor;
        int hashCode9 = (hashCode8 + (wireThemedColors3 == null ? 0 : wireThemedColors3.hashCode())) * 31;
        String str4 = this.statusDisplayName;
        return ((hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.actions.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.taskId;
        String str3 = this.imei;
        String str4 = this.birdCode;
        String str5 = this.subtitle;
        WireThemedColors wireThemedColors = this.subtitleColor;
        Integer num = this.batteryLevel;
        String str6 = this.labelText;
        WireThemedColors wireThemedColors2 = this.labelColor;
        ClientIcon clientIcon = this.statusIcon;
        WireThemedColors wireThemedColors3 = this.statusIconBackgroundColor;
        String str7 = this.statusDisplayName;
        List<BirdTaskAction> list = this.actions;
        return "WireOperatorTask(birdId=" + str + ", taskId=" + str2 + ", imei=" + str3 + ", birdCode=" + str4 + ", subtitle=" + str5 + ", subtitleColor=" + wireThemedColors + ", batteryLevel=" + num + ", labelText=" + str6 + ", labelColor=" + wireThemedColors2 + ", statusIcon=" + clientIcon + ", statusIconBackgroundColor=" + wireThemedColors3 + ", statusDisplayName=" + str7 + ", actions=" + list + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireOperatorTask(String birdId, String taskId, String str, String birdCode, String str2, WireThemedColors wireThemedColors, Integer num, String str3, WireThemedColors wireThemedColors2, ClientIcon clientIcon, WireThemedColors wireThemedColors3, String str4, List<? extends BirdTaskAction> actions) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.birdId = birdId;
        this.taskId = taskId;
        this.imei = str;
        this.birdCode = birdCode;
        this.subtitle = str2;
        this.subtitleColor = wireThemedColors;
        this.batteryLevel = num;
        this.labelText = str3;
        this.labelColor = wireThemedColors2;
        this.statusIcon = clientIcon;
        this.statusIconBackgroundColor = wireThemedColors3;
        this.statusDisplayName = str4;
        this.actions = actions;
    }

    public /* synthetic */ WireOperatorTask(String str, String str2, String str3, String str4, String str5, WireThemedColors wireThemedColors, Integer num, String str6, WireThemedColors wireThemedColors2, ClientIcon clientIcon, WireThemedColors wireThemedColors3, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : wireThemedColors, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : wireThemedColors2, (i & 512) != 0 ? null : clientIcon, (i & 1024) != 0 ? null : wireThemedColors3, (i & 2048) == 0 ? str7 : null, (i & 4096) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
