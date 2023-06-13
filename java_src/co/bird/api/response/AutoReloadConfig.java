package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JW\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m28432d2 = {"Lco/bird/api/response/AutoReloadConfig;", "", "options", "", "Lco/bird/api/response/ReloadOption;", "enabled", "", "currentOption", "mandatory", "mandatoryMinBalance", "", "nagMinRideCount", "", "nagEveryRideCount", "(Ljava/util/List;ZLco/bird/api/response/ReloadOption;ZJII)V", "getCurrentOption", "()Lco/bird/api/response/ReloadOption;", "getEnabled", "()Z", "getMandatory", "getMandatoryMinBalance", "()J", "getNagEveryRideCount", "()I", "getNagMinRideCount", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoReloadConfig {
    private final ReloadOption currentOption;
    private final boolean enabled;
    private final boolean mandatory;
    private final long mandatoryMinBalance;
    private final int nagEveryRideCount;
    private final int nagMinRideCount;
    private final List<ReloadOption> options;

    public AutoReloadConfig(List<ReloadOption> options, boolean z, ReloadOption reloadOption, boolean z2, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.enabled = z;
        this.currentOption = reloadOption;
        this.mandatory = z2;
        this.mandatoryMinBalance = j;
        this.nagMinRideCount = i;
        this.nagEveryRideCount = i2;
    }

    public final List<ReloadOption> component1() {
        return this.options;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final ReloadOption component3() {
        return this.currentOption;
    }

    public final boolean component4() {
        return this.mandatory;
    }

    public final long component5() {
        return this.mandatoryMinBalance;
    }

    public final int component6() {
        return this.nagMinRideCount;
    }

    public final int component7() {
        return this.nagEveryRideCount;
    }

    public final AutoReloadConfig copy(List<ReloadOption> options, boolean z, ReloadOption reloadOption, boolean z2, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new AutoReloadConfig(options, z, reloadOption, z2, j, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoReloadConfig) {
            AutoReloadConfig autoReloadConfig = (AutoReloadConfig) obj;
            return Intrinsics.areEqual(this.options, autoReloadConfig.options) && this.enabled == autoReloadConfig.enabled && Intrinsics.areEqual(this.currentOption, autoReloadConfig.currentOption) && this.mandatory == autoReloadConfig.mandatory && this.mandatoryMinBalance == autoReloadConfig.mandatoryMinBalance && this.nagMinRideCount == autoReloadConfig.nagMinRideCount && this.nagEveryRideCount == autoReloadConfig.nagEveryRideCount;
        }
        return false;
    }

    public final ReloadOption getCurrentOption() {
        return this.currentOption;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final long getMandatoryMinBalance() {
        return this.mandatoryMinBalance;
    }

    public final int getNagEveryRideCount() {
        return this.nagEveryRideCount;
    }

    public final int getNagMinRideCount() {
        return this.nagMinRideCount;
    }

    public final List<ReloadOption> getOptions() {
        return this.options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ReloadOption reloadOption = this.currentOption;
        int hashCode2 = (i2 + (reloadOption == null ? 0 : reloadOption.hashCode())) * 31;
        boolean z2 = this.mandatory;
        return ((((((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Long.hashCode(this.mandatoryMinBalance)) * 31) + Integer.hashCode(this.nagMinRideCount)) * 31) + Integer.hashCode(this.nagEveryRideCount);
    }

    public String toString() {
        List<ReloadOption> list = this.options;
        boolean z = this.enabled;
        ReloadOption reloadOption = this.currentOption;
        boolean z2 = this.mandatory;
        long j = this.mandatoryMinBalance;
        int i = this.nagMinRideCount;
        int i2 = this.nagEveryRideCount;
        return "AutoReloadConfig(options=" + list + ", enabled=" + z + ", currentOption=" + reloadOption + ", mandatory=" + z2 + ", mandatoryMinBalance=" + j + ", nagMinRideCount=" + i + ", nagEveryRideCount=" + i2 + ")";
    }
}
