package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ`\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, m28432d2 = {"Lco/bird/api/response/PreloadConfig;", "", "options", "", "Lco/bird/api/response/ReloadOption;", "enabled", "", "mandatory", "mandatoryMinBalance", "", "maxIncentiveText", "", "maxIncentiveSubtext", "skipIfOverMinBalance", "(Ljava/util/List;ZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEnabled", "()Z", "getMandatory", "getMandatoryMinBalance", "()J", "getMaxIncentiveSubtext", "()Ljava/lang/String;", "getMaxIncentiveText", "getOptions", "()Ljava/util/List;", "getSkipIfOverMinBalance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;ZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/api/response/PreloadConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PreloadConfig {
    private final boolean enabled;
    private final boolean mandatory;
    private final long mandatoryMinBalance;
    private final String maxIncentiveSubtext;
    private final String maxIncentiveText;
    private final List<ReloadOption> options;
    private final Boolean skipIfOverMinBalance;

    public PreloadConfig(List<ReloadOption> options, boolean z, boolean z2, long j, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.enabled = z;
        this.mandatory = z2;
        this.mandatoryMinBalance = j;
        this.maxIncentiveText = str;
        this.maxIncentiveSubtext = str2;
        this.skipIfOverMinBalance = bool;
    }

    public final List<ReloadOption> component1() {
        return this.options;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final boolean component3() {
        return this.mandatory;
    }

    public final long component4() {
        return this.mandatoryMinBalance;
    }

    public final String component5() {
        return this.maxIncentiveText;
    }

    public final String component6() {
        return this.maxIncentiveSubtext;
    }

    public final Boolean component7() {
        return this.skipIfOverMinBalance;
    }

    public final PreloadConfig copy(List<ReloadOption> options, boolean z, boolean z2, long j, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new PreloadConfig(options, z, z2, j, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreloadConfig) {
            PreloadConfig preloadConfig = (PreloadConfig) obj;
            return Intrinsics.areEqual(this.options, preloadConfig.options) && this.enabled == preloadConfig.enabled && this.mandatory == preloadConfig.mandatory && this.mandatoryMinBalance == preloadConfig.mandatoryMinBalance && Intrinsics.areEqual(this.maxIncentiveText, preloadConfig.maxIncentiveText) && Intrinsics.areEqual(this.maxIncentiveSubtext, preloadConfig.maxIncentiveSubtext) && Intrinsics.areEqual(this.skipIfOverMinBalance, preloadConfig.skipIfOverMinBalance);
        }
        return false;
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

    public final String getMaxIncentiveSubtext() {
        return this.maxIncentiveSubtext;
    }

    public final String getMaxIncentiveText() {
        return this.maxIncentiveText;
    }

    public final List<ReloadOption> getOptions() {
        return this.options;
    }

    public final Boolean getSkipIfOverMinBalance() {
        return this.skipIfOverMinBalance;
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
        boolean z2 = this.mandatory;
        int hashCode2 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Long.hashCode(this.mandatoryMinBalance)) * 31;
        String str = this.maxIncentiveText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxIncentiveSubtext;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.skipIfOverMinBalance;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<ReloadOption> list = this.options;
        boolean z = this.enabled;
        boolean z2 = this.mandatory;
        long j = this.mandatoryMinBalance;
        String str = this.maxIncentiveText;
        String str2 = this.maxIncentiveSubtext;
        Boolean bool = this.skipIfOverMinBalance;
        return "PreloadConfig(options=" + list + ", enabled=" + z + ", mandatory=" + z2 + ", mandatoryMinBalance=" + j + ", maxIncentiveText=" + str + ", maxIncentiveSubtext=" + str2 + ", skipIfOverMinBalance=" + bool + ")";
    }

    public /* synthetic */ PreloadConfig(List list, boolean z, boolean z2, long j, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, z2, j, str, str2, (i & 64) != 0 ? null : bool);
    }
}
