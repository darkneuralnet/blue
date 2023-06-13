package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/AutoPayBody;", "", "autoPayAsked", "", "autoPayActive", "autoPayPlan", "", "(ZZLjava/lang/String;)V", "getAutoPayActive", "()Z", "getAutoPayAsked", "getAutoPayPlan", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoPayBody {
    @JsonProperty("auto_pay_active")
    @InterfaceC41208ft5("auto_pay_active")
    private final boolean autoPayActive;
    @JsonProperty("auto_pay_asked")
    @InterfaceC41208ft5("auto_pay_asked")
    private final boolean autoPayAsked;
    @JsonProperty("auto_pay_plan")
    @InterfaceC41208ft5("auto_pay_plan")
    private final String autoPayPlan;

    public AutoPayBody(boolean z, boolean z2, String str) {
        this.autoPayAsked = z;
        this.autoPayActive = z2;
        this.autoPayPlan = str;
    }

    public static /* synthetic */ AutoPayBody copy$default(AutoPayBody autoPayBody, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoPayBody.autoPayAsked;
        }
        if ((i & 2) != 0) {
            z2 = autoPayBody.autoPayActive;
        }
        if ((i & 4) != 0) {
            str = autoPayBody.autoPayPlan;
        }
        return autoPayBody.copy(z, z2, str);
    }

    public final boolean component1() {
        return this.autoPayAsked;
    }

    public final boolean component2() {
        return this.autoPayActive;
    }

    public final String component3() {
        return this.autoPayPlan;
    }

    public final AutoPayBody copy(boolean z, boolean z2, String str) {
        return new AutoPayBody(z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoPayBody) {
            AutoPayBody autoPayBody = (AutoPayBody) obj;
            return this.autoPayAsked == autoPayBody.autoPayAsked && this.autoPayActive == autoPayBody.autoPayActive && Intrinsics.areEqual(this.autoPayPlan, autoPayBody.autoPayPlan);
        }
        return false;
    }

    public final boolean getAutoPayActive() {
        return this.autoPayActive;
    }

    public final boolean getAutoPayAsked() {
        return this.autoPayAsked;
    }

    public final String getAutoPayPlan() {
        return this.autoPayPlan;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.autoPayAsked;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.autoPayActive;
        int i2 = (i + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.autoPayPlan;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.autoPayAsked;
        boolean z2 = this.autoPayActive;
        String str = this.autoPayPlan;
        return "AutoPayBody(autoPayAsked=" + z + ", autoPayActive=" + z2 + ", autoPayPlan=" + str + ")";
    }

    public /* synthetic */ AutoPayBody(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : str);
    }
}
