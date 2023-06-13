package co.bird.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/BirdActionsAndSettings;", "", "actions", "", "Lco/bird/android/model/PrivateBirdAction;", "settings", "Lco/bird/android/model/PrivateBirdSetting;", "(Ljava/util/List;Lco/bird/android/model/PrivateBirdSetting;)V", "getActions", "()Ljava/util/List;", "getSettings", "()Lco/bird/android/model/PrivateBirdSetting;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdActionsAndSettings {
    private final List<PrivateBirdAction> actions;
    private final PrivateBirdSetting settings;

    public BirdActionsAndSettings() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BirdActionsAndSettings copy$default(BirdActionsAndSettings birdActionsAndSettings, List list, PrivateBirdSetting privateBirdSetting, int i, Object obj) {
        if ((i & 1) != 0) {
            list = birdActionsAndSettings.actions;
        }
        if ((i & 2) != 0) {
            privateBirdSetting = birdActionsAndSettings.settings;
        }
        return birdActionsAndSettings.copy(list, privateBirdSetting);
    }

    public final List<PrivateBirdAction> component1() {
        return this.actions;
    }

    public final PrivateBirdSetting component2() {
        return this.settings;
    }

    public final BirdActionsAndSettings copy(List<? extends PrivateBirdAction> actions, PrivateBirdSetting settings) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new BirdActionsAndSettings(actions, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdActionsAndSettings) {
            BirdActionsAndSettings birdActionsAndSettings = (BirdActionsAndSettings) obj;
            return Intrinsics.areEqual(this.actions, birdActionsAndSettings.actions) && Intrinsics.areEqual(this.settings, birdActionsAndSettings.settings);
        }
        return false;
    }

    public final List<PrivateBirdAction> getActions() {
        return this.actions;
    }

    public final PrivateBirdSetting getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return (this.actions.hashCode() * 31) + this.settings.hashCode();
    }

    public String toString() {
        List<PrivateBirdAction> list = this.actions;
        PrivateBirdSetting privateBirdSetting = this.settings;
        return "BirdActionsAndSettings(actions=" + list + ", settings=" + privateBirdSetting + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BirdActionsAndSettings(List<? extends PrivateBirdAction> actions, PrivateBirdSetting settings) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.actions = actions;
        this.settings = settings;
    }

    public /* synthetic */ BirdActionsAndSettings(List list, PrivateBirdSetting privateBirdSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? new PrivateBirdSetting(false, 1, null) : privateBirdSetting);
    }
}
