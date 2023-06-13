package co.bird.android.model;

import co.bird.android.model.constant.BirdModel;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tBy\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009a\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0010HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b'\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006="}, m28432d2 = {"Lco/bird/android/model/BirdSummaryViewModel;", "", "birdSummary", "Lco/bird/android/model/BirdSummary;", "trackedAt", "", "batteryLastTrackedAt", "warehouse", "serviceStatus", "(Lco/bird/android/model/BirdSummary;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PaymentMethodOptionsParams.Blik.PARAM_CODE, "displayModel", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "brainState", "brainStateColor", "", "condition", "trackedAtColor", "battery", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBattery", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBatteryLastTrackedAt", "()Ljava/lang/String;", "getBirdSummary", "()Lco/bird/android/model/BirdSummary;", "setBirdSummary", "(Lco/bird/android/model/BirdSummary;)V", "getBrainState", "getBrainStateColor", "getCode", "getCondition", "getDisplayModel", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getServiceStatus", "getTrackedAt", "getTrackedAtColor", "getWarehouse", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lco/bird/android/model/BirdSummaryViewModel;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdSummaryViewModel {
    public static final Companion Companion = new Companion(null);
    private static final String EMPTY_CHAR = "-";
    private final Integer battery;
    private final String batteryLastTrackedAt;
    private BirdSummary birdSummary;
    private final String brainState;
    private final Integer brainStateColor;
    private final String code;
    private final String condition;
    private final String displayModel;
    private final BirdModel model;
    private final String serviceStatus;
    private final String trackedAt;
    private final Integer trackedAtColor;
    private final String warehouse;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdSummaryViewModel$Companion;", "", "()V", "EMPTY_CHAR", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BirdSummaryViewModel(String str, String str2, BirdModel birdModel, String str3, String str4, String brainState, Integer num, String condition, String str5, Integer num2, Integer num3, String str6) {
        Intrinsics.checkNotNullParameter(brainState, "brainState");
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.code = str;
        this.displayModel = str2;
        this.model = birdModel;
        this.warehouse = str3;
        this.serviceStatus = str4;
        this.brainState = brainState;
        this.brainStateColor = num;
        this.condition = condition;
        this.trackedAt = str5;
        this.trackedAtColor = num2;
        this.battery = num3;
        this.batteryLastTrackedAt = str6;
    }

    public final String component1() {
        return this.code;
    }

    public final Integer component10() {
        return this.trackedAtColor;
    }

    public final Integer component11() {
        return this.battery;
    }

    public final String component12() {
        return this.batteryLastTrackedAt;
    }

    public final String component2() {
        return this.displayModel;
    }

    public final BirdModel component3() {
        return this.model;
    }

    public final String component4() {
        return this.warehouse;
    }

    public final String component5() {
        return this.serviceStatus;
    }

    public final String component6() {
        return this.brainState;
    }

    public final Integer component7() {
        return this.brainStateColor;
    }

    public final String component8() {
        return this.condition;
    }

    public final String component9() {
        return this.trackedAt;
    }

    public final BirdSummaryViewModel copy(String str, String str2, BirdModel birdModel, String str3, String str4, String brainState, Integer num, String condition, String str5, Integer num2, Integer num3, String str6) {
        Intrinsics.checkNotNullParameter(brainState, "brainState");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new BirdSummaryViewModel(str, str2, birdModel, str3, str4, brainState, num, condition, str5, num2, num3, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdSummaryViewModel) {
            BirdSummaryViewModel birdSummaryViewModel = (BirdSummaryViewModel) obj;
            return Intrinsics.areEqual(this.code, birdSummaryViewModel.code) && Intrinsics.areEqual(this.displayModel, birdSummaryViewModel.displayModel) && this.model == birdSummaryViewModel.model && Intrinsics.areEqual(this.warehouse, birdSummaryViewModel.warehouse) && Intrinsics.areEqual(this.serviceStatus, birdSummaryViewModel.serviceStatus) && Intrinsics.areEqual(this.brainState, birdSummaryViewModel.brainState) && Intrinsics.areEqual(this.brainStateColor, birdSummaryViewModel.brainStateColor) && Intrinsics.areEqual(this.condition, birdSummaryViewModel.condition) && Intrinsics.areEqual(this.trackedAt, birdSummaryViewModel.trackedAt) && Intrinsics.areEqual(this.trackedAtColor, birdSummaryViewModel.trackedAtColor) && Intrinsics.areEqual(this.battery, birdSummaryViewModel.battery) && Intrinsics.areEqual(this.batteryLastTrackedAt, birdSummaryViewModel.batteryLastTrackedAt);
        }
        return false;
    }

    public final Integer getBattery() {
        return this.battery;
    }

    public final String getBatteryLastTrackedAt() {
        return this.batteryLastTrackedAt;
    }

    public final BirdSummary getBirdSummary() {
        return this.birdSummary;
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

    public final String getDisplayModel() {
        return this.displayModel;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final String getServiceStatus() {
        return this.serviceStatus;
    }

    public final String getTrackedAt() {
        return this.trackedAt;
    }

    public final Integer getTrackedAtColor() {
        return this.trackedAtColor;
    }

    public final String getWarehouse() {
        return this.warehouse;
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayModel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BirdModel birdModel = this.model;
        int hashCode3 = (hashCode2 + (birdModel == null ? 0 : birdModel.hashCode())) * 31;
        String str3 = this.warehouse;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceStatus;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.brainState.hashCode()) * 31;
        Integer num = this.brainStateColor;
        int hashCode6 = (((hashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.condition.hashCode()) * 31;
        String str5 = this.trackedAt;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.trackedAtColor;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.battery;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.batteryLastTrackedAt;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBirdSummary(BirdSummary birdSummary) {
        this.birdSummary = birdSummary;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.displayModel;
        BirdModel birdModel = this.model;
        String str3 = this.warehouse;
        String str4 = this.serviceStatus;
        String str5 = this.brainState;
        Integer num = this.brainStateColor;
        String str6 = this.condition;
        String str7 = this.trackedAt;
        Integer num2 = this.trackedAtColor;
        Integer num3 = this.battery;
        String str8 = this.batteryLastTrackedAt;
        return "BirdSummaryViewModel(code=" + str + ", displayModel=" + str2 + ", model=" + birdModel + ", warehouse=" + str3 + ", serviceStatus=" + str4 + ", brainState=" + str5 + ", brainStateColor=" + num + ", condition=" + str6 + ", trackedAt=" + str7 + ", trackedAtColor=" + num2 + ", battery=" + num3 + ", batteryLastTrackedAt=" + str8 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BirdSummaryViewModel(BirdSummary birdSummary, String str, String str2, String str3, String str4) {
        this(r3, r4, r5, str3, str4, r8, r9, r1 == null ? "-" : r1, str, birdSummary.getTrackedAtColor(), birdSummary.getBatteryLevel(), str2);
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        String code = birdSummary.getCode();
        String modelDisplay = birdSummary.getModelDisplay();
        BirdModel model = birdSummary.getModel();
        String brainState = birdSummary.getBrainState();
        String str5 = brainState == null ? "-" : brainState;
        Integer brainStateColor = birdSummary.getBrainStateColor();
        String condition = birdSummary.getCondition();
        this.birdSummary = birdSummary;
    }
}
