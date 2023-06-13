package co.bird.android.app.feature.map.renderer;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconInitParams;", "", "pinShadow", "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "badgeShadow", "(Lco/bird/android/app/feature/map/renderer/ShadowInitParams;Lco/bird/android/app/feature/map/renderer/ShadowInitParams;)V", "getBadgeShadow", "()Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "getPinShadow", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class IconInitParams {
    private final ShadowInitParams badgeShadow;
    private final ShadowInitParams pinShadow;

    public IconInitParams() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ IconInitParams copy$default(IconInitParams iconInitParams, ShadowInitParams shadowInitParams, ShadowInitParams shadowInitParams2, int i, Object obj) {
        if ((i & 1) != 0) {
            shadowInitParams = iconInitParams.pinShadow;
        }
        if ((i & 2) != 0) {
            shadowInitParams2 = iconInitParams.badgeShadow;
        }
        return iconInitParams.copy(shadowInitParams, shadowInitParams2);
    }

    public final ShadowInitParams component1() {
        return this.pinShadow;
    }

    public final ShadowInitParams component2() {
        return this.badgeShadow;
    }

    public final IconInitParams copy(ShadowInitParams shadowInitParams, ShadowInitParams shadowInitParams2) {
        return new IconInitParams(shadowInitParams, shadowInitParams2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IconInitParams) {
            IconInitParams iconInitParams = (IconInitParams) obj;
            return Intrinsics.areEqual(this.pinShadow, iconInitParams.pinShadow) && Intrinsics.areEqual(this.badgeShadow, iconInitParams.badgeShadow);
        }
        return false;
    }

    public final ShadowInitParams getBadgeShadow() {
        return this.badgeShadow;
    }

    public final ShadowInitParams getPinShadow() {
        return this.pinShadow;
    }

    public int hashCode() {
        ShadowInitParams shadowInitParams = this.pinShadow;
        int hashCode = (shadowInitParams == null ? 0 : shadowInitParams.hashCode()) * 31;
        ShadowInitParams shadowInitParams2 = this.badgeShadow;
        return hashCode + (shadowInitParams2 != null ? shadowInitParams2.hashCode() : 0);
    }

    public String toString() {
        ShadowInitParams shadowInitParams = this.pinShadow;
        ShadowInitParams shadowInitParams2 = this.badgeShadow;
        return "IconInitParams(pinShadow=" + shadowInitParams + ", badgeShadow=" + shadowInitParams2 + ")";
    }

    public IconInitParams(ShadowInitParams shadowInitParams, ShadowInitParams shadowInitParams2) {
        this.pinShadow = shadowInitParams;
        this.badgeShadow = shadowInitParams2;
    }

    public /* synthetic */ IconInitParams(ShadowInitParams shadowInitParams, ShadowInitParams shadowInitParams2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : shadowInitParams, (i & 2) != 0 ? null : shadowInitParams2);
    }
}
