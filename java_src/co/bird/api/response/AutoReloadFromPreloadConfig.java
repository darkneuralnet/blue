package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/AutoReloadFromPreloadConfig;", "", "enabled", "", "default", "inheritsIncentive", "(ZZZ)V", "getDefault", "()Z", "getEnabled", "getInheritsIncentive", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoReloadFromPreloadConfig {

    /* renamed from: default  reason: not valid java name */
    private final boolean f122580default;
    private final boolean enabled;
    private final boolean inheritsIncentive;

    public AutoReloadFromPreloadConfig(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.f122580default = z2;
        this.inheritsIncentive = z3;
    }

    public static /* synthetic */ AutoReloadFromPreloadConfig copy$default(AutoReloadFromPreloadConfig autoReloadFromPreloadConfig, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoReloadFromPreloadConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = autoReloadFromPreloadConfig.f122580default;
        }
        if ((i & 4) != 0) {
            z3 = autoReloadFromPreloadConfig.inheritsIncentive;
        }
        return autoReloadFromPreloadConfig.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.f122580default;
    }

    public final boolean component3() {
        return this.inheritsIncentive;
    }

    public final AutoReloadFromPreloadConfig copy(boolean z, boolean z2, boolean z3) {
        return new AutoReloadFromPreloadConfig(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoReloadFromPreloadConfig) {
            AutoReloadFromPreloadConfig autoReloadFromPreloadConfig = (AutoReloadFromPreloadConfig) obj;
            return this.enabled == autoReloadFromPreloadConfig.enabled && this.f122580default == autoReloadFromPreloadConfig.f122580default && this.inheritsIncentive == autoReloadFromPreloadConfig.inheritsIncentive;
        }
        return false;
    }

    public final boolean getDefault() {
        return this.f122580default;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getInheritsIncentive() {
        return this.inheritsIncentive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f122580default;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.inheritsIncentive;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.f122580default;
        boolean z3 = this.inheritsIncentive;
        return "AutoReloadFromPreloadConfig(enabled=" + z + ", default=" + z2 + ", inheritsIncentive=" + z3 + ")";
    }
}
