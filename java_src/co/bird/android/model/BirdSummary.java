package co.bird.android.model;

import co.bird.android.model.constant.BirdModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\tHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00064"}, m28432d2 = {"Lco/bird/android/model/BirdSummary;", "", "modelDisplay", "", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "brainState", "brainStateColor", "", "condition", "trackedAtTime", "Lorg/joda/time/DateTime;", "trackedAtColor", "batteryLevel", "batteryLastTrackedAtTime", "enteredWarehouseAtTime", "(Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBatteryLastTrackedAtTime", "()Lorg/joda/time/DateTime;", "getBatteryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBrainState", "()Ljava/lang/String;", "getBrainStateColor", "getCode", "getCondition", "getEnteredWarehouseAtTime", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getModelDisplay", "getTrackedAtColor", "getTrackedAtTime", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/BirdSummary;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdSummary {
    @JsonProperty("battery_last_tracked_at_time")
    @InterfaceC41208ft5("battery_last_tracked_at_time")
    private final DateTime batteryLastTrackedAtTime;
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final Integer batteryLevel;
    @JsonProperty("brain_state")
    @InterfaceC41208ft5("brain_state")
    private final String brainState;
    @JsonProperty("brain_state_color")
    @InterfaceC41208ft5("brain_state_color")
    private final Integer brainStateColor;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("condition")
    @InterfaceC41208ft5("condition")
    private final String condition;
    @JsonProperty("entered_warehouse_at_time")
    @InterfaceC41208ft5("entered_warehouse_at_time")
    private final DateTime enteredWarehouseAtTime;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("model_display")
    @InterfaceC41208ft5("model_display")
    private final String modelDisplay;
    @JsonProperty("tracked_at_color")
    @InterfaceC41208ft5("tracked_at_color")
    private final Integer trackedAtColor;
    @JsonProperty("tracked_at_time")
    @InterfaceC41208ft5("tracked_at_time")
    private final DateTime trackedAtTime;

    public BirdSummary() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.modelDisplay;
    }

    public final DateTime component10() {
        return this.batteryLastTrackedAtTime;
    }

    public final DateTime component11() {
        return this.enteredWarehouseAtTime;
    }

    public final BirdModel component2() {
        return this.model;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.brainState;
    }

    public final Integer component5() {
        return this.brainStateColor;
    }

    public final String component6() {
        return this.condition;
    }

    public final DateTime component7() {
        return this.trackedAtTime;
    }

    public final Integer component8() {
        return this.trackedAtColor;
    }

    public final Integer component9() {
        return this.batteryLevel;
    }

    public final BirdSummary copy(String str, BirdModel birdModel, String str2, String str3, Integer num, String str4, DateTime dateTime, Integer num2, Integer num3, DateTime dateTime2, DateTime dateTime3) {
        return new BirdSummary(str, birdModel, str2, str3, num, str4, dateTime, num2, num3, dateTime2, dateTime3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdSummary) {
            BirdSummary birdSummary = (BirdSummary) obj;
            return Intrinsics.areEqual(this.modelDisplay, birdSummary.modelDisplay) && this.model == birdSummary.model && Intrinsics.areEqual(this.code, birdSummary.code) && Intrinsics.areEqual(this.brainState, birdSummary.brainState) && Intrinsics.areEqual(this.brainStateColor, birdSummary.brainStateColor) && Intrinsics.areEqual(this.condition, birdSummary.condition) && Intrinsics.areEqual(this.trackedAtTime, birdSummary.trackedAtTime) && Intrinsics.areEqual(this.trackedAtColor, birdSummary.trackedAtColor) && Intrinsics.areEqual(this.batteryLevel, birdSummary.batteryLevel) && Intrinsics.areEqual(this.batteryLastTrackedAtTime, birdSummary.batteryLastTrackedAtTime) && Intrinsics.areEqual(this.enteredWarehouseAtTime, birdSummary.enteredWarehouseAtTime);
        }
        return false;
    }

    public final DateTime getBatteryLastTrackedAtTime() {
        return this.batteryLastTrackedAtTime;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBrainState() {
        return this.brainState;
    }

    public final Integer getBrainStateColor() {
        return this.brainStateColor;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final DateTime getEnteredWarehouseAtTime() {
        return this.enteredWarehouseAtTime;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final String getModelDisplay() {
        return this.modelDisplay;
    }

    public final Integer getTrackedAtColor() {
        return this.trackedAtColor;
    }

    public final DateTime getTrackedAtTime() {
        return this.trackedAtTime;
    }

    public int hashCode() {
        String str = this.modelDisplay;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BirdModel birdModel = this.model;
        int hashCode2 = (hashCode + (birdModel == null ? 0 : birdModel.hashCode())) * 31;
        String str2 = this.code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brainState;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.brainStateColor;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.condition;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.trackedAtTime;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num2 = this.trackedAtColor;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.batteryLevel;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DateTime dateTime2 = this.batteryLastTrackedAtTime;
        int hashCode10 = (hashCode9 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.enteredWarehouseAtTime;
        return hashCode10 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    public String toString() {
        String str = this.modelDisplay;
        BirdModel birdModel = this.model;
        String str2 = this.code;
        String str3 = this.brainState;
        Integer num = this.brainStateColor;
        String str4 = this.condition;
        DateTime dateTime = this.trackedAtTime;
        Integer num2 = this.trackedAtColor;
        Integer num3 = this.batteryLevel;
        DateTime dateTime2 = this.batteryLastTrackedAtTime;
        DateTime dateTime3 = this.enteredWarehouseAtTime;
        return "BirdSummary(modelDisplay=" + str + ", model=" + birdModel + ", code=" + str2 + ", brainState=" + str3 + ", brainStateColor=" + num + ", condition=" + str4 + ", trackedAtTime=" + dateTime + ", trackedAtColor=" + num2 + ", batteryLevel=" + num3 + ", batteryLastTrackedAtTime=" + dateTime2 + ", enteredWarehouseAtTime=" + dateTime3 + ")";
    }

    public BirdSummary(String str, BirdModel birdModel, String str2, String str3, Integer num, String str4, DateTime dateTime, Integer num2, Integer num3, DateTime dateTime2, DateTime dateTime3) {
        this.modelDisplay = str;
        this.model = birdModel;
        this.code = str2;
        this.brainState = str3;
        this.brainStateColor = num;
        this.condition = str4;
        this.trackedAtTime = dateTime;
        this.trackedAtColor = num2;
        this.batteryLevel = num3;
        this.batteryLastTrackedAtTime = dateTime2;
        this.enteredWarehouseAtTime = dateTime3;
    }

    public /* synthetic */ BirdSummary(String str, BirdModel birdModel, String str2, String str3, Integer num, String str4, DateTime dateTime, Integer num2, Integer num3, DateTime dateTime2, DateTime dateTime3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : birdModel, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : dateTime, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : dateTime2, (i & 1024) == 0 ? dateTime3 : null);
    }
}
