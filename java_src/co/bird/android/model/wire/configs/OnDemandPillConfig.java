package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OnDemandPillConfig;", "", "timeRenderCap", "", "visibleIfTimeLessThan", "preorderText", "", "postorderText", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "isNull", "", "()Z", "getPostorderText", "()Ljava/lang/String;", "getPreorderText", "getTimeRenderCap", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVisibleIfTimeLessThan", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/OnDemandPillConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OnDemandPillConfig {
    @JsonProperty("postorder_text")
    @InterfaceC41208ft5("postorder_text")
    private final String postorderText;
    @JsonProperty("preorder_text")
    @InterfaceC41208ft5("preorder_text")
    private final String preorderText;
    @JsonProperty("time_render_cap")
    @InterfaceC41208ft5("time_render_cap")
    private final Integer timeRenderCap;
    @JsonProperty("visible_if_time_less_than")
    @InterfaceC41208ft5("visible_if_time_less_than")
    private final Integer visibleIfTimeLessThan;

    public OnDemandPillConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OnDemandPillConfig copy$default(OnDemandPillConfig onDemandPillConfig, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = onDemandPillConfig.timeRenderCap;
        }
        if ((i & 2) != 0) {
            num2 = onDemandPillConfig.visibleIfTimeLessThan;
        }
        if ((i & 4) != 0) {
            str = onDemandPillConfig.preorderText;
        }
        if ((i & 8) != 0) {
            str2 = onDemandPillConfig.postorderText;
        }
        return onDemandPillConfig.copy(num, num2, str, str2);
    }

    public final Integer component1() {
        return this.timeRenderCap;
    }

    public final Integer component2() {
        return this.visibleIfTimeLessThan;
    }

    public final String component3() {
        return this.preorderText;
    }

    public final String component4() {
        return this.postorderText;
    }

    public final OnDemandPillConfig copy(Integer num, Integer num2, String str, String str2) {
        return new OnDemandPillConfig(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDemandPillConfig) {
            OnDemandPillConfig onDemandPillConfig = (OnDemandPillConfig) obj;
            return Intrinsics.areEqual(this.timeRenderCap, onDemandPillConfig.timeRenderCap) && Intrinsics.areEqual(this.visibleIfTimeLessThan, onDemandPillConfig.visibleIfTimeLessThan) && Intrinsics.areEqual(this.preorderText, onDemandPillConfig.preorderText) && Intrinsics.areEqual(this.postorderText, onDemandPillConfig.postorderText);
        }
        return false;
    }

    public final String getPostorderText() {
        return this.postorderText;
    }

    public final String getPreorderText() {
        return this.preorderText;
    }

    public final Integer getTimeRenderCap() {
        return this.timeRenderCap;
    }

    public final Integer getVisibleIfTimeLessThan() {
        return this.visibleIfTimeLessThan;
    }

    public int hashCode() {
        Integer num = this.timeRenderCap;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.visibleIfTimeLessThan;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.preorderText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postorderText;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isNull() {
        if (this.timeRenderCap == null && this.visibleIfTimeLessThan == null && this.preorderText == null && this.postorderText == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        Integer num = this.timeRenderCap;
        Integer num2 = this.visibleIfTimeLessThan;
        String str = this.preorderText;
        String str2 = this.postorderText;
        return "OnDemandPillConfig(timeRenderCap=" + num + ", visibleIfTimeLessThan=" + num2 + ", preorderText=" + str + ", postorderText=" + str2 + ")";
    }

    public OnDemandPillConfig(Integer num, Integer num2, String str, String str2) {
        this.timeRenderCap = num;
        this.visibleIfTimeLessThan = num2;
        this.preorderText = str;
        this.postorderText = str2;
    }

    public /* synthetic */ OnDemandPillConfig(Integer num, Integer num2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
