package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BirdPayTutorialConfig;", "", "enabled", "", "navigationTitle", "", "steps", "", "Lco/bird/android/model/wire/configs/BirdPayTutorialStep;", "(ZLjava/lang/String;Ljava/util/List;)V", "getEnabled", "()Z", "getNavigationTitle", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPayTutorialConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("navigation_title")
    @InterfaceC41208ft5("navigation_title")
    private final String navigationTitle;
    @JsonProperty("steps")
    @InterfaceC41208ft5("steps")
    private final List<BirdPayTutorialStep> steps;

    public BirdPayTutorialConfig() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BirdPayTutorialConfig copy$default(BirdPayTutorialConfig birdPayTutorialConfig, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = birdPayTutorialConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = birdPayTutorialConfig.navigationTitle;
        }
        if ((i & 4) != 0) {
            list = birdPayTutorialConfig.steps;
        }
        return birdPayTutorialConfig.copy(z, str, list);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.navigationTitle;
    }

    public final List<BirdPayTutorialStep> component3() {
        return this.steps;
    }

    public final BirdPayTutorialConfig copy(boolean z, String navigationTitle, List<BirdPayTutorialStep> steps) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new BirdPayTutorialConfig(z, navigationTitle, steps);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPayTutorialConfig) {
            BirdPayTutorialConfig birdPayTutorialConfig = (BirdPayTutorialConfig) obj;
            return this.enabled == birdPayTutorialConfig.enabled && Intrinsics.areEqual(this.navigationTitle, birdPayTutorialConfig.navigationTitle) && Intrinsics.areEqual(this.steps, birdPayTutorialConfig.steps);
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<BirdPayTutorialStep> getSteps() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.navigationTitle.hashCode()) * 31) + this.steps.hashCode();
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.navigationTitle;
        List<BirdPayTutorialStep> list = this.steps;
        return "BirdPayTutorialConfig(enabled=" + z + ", navigationTitle=" + str + ", steps=" + list + ")";
    }

    public BirdPayTutorialConfig(boolean z, String navigationTitle, List<BirdPayTutorialStep> steps) {
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.enabled = z;
        this.navigationTitle = navigationTitle;
        this.steps = steps;
    }

    public /* synthetic */ BirdPayTutorialConfig(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
