package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/WireHabitatStatusContext;", "", "derived", "Lco/bird/android/model/wire/WireHabitatStatusDerivedContext;", "(Lco/bird/android/model/wire/WireHabitatStatusDerivedContext;)V", "getDerived", "()Lco/bird/android/model/wire/WireHabitatStatusDerivedContext;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireHabitatStatusContext {
    @JsonProperty("derived")
    @InterfaceC41208ft5("derived")
    private final WireHabitatStatusDerivedContext derived;

    public WireHabitatStatusContext() {
        this(null, 1, null);
    }

    public static /* synthetic */ WireHabitatStatusContext copy$default(WireHabitatStatusContext wireHabitatStatusContext, WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext, int i, Object obj) {
        if ((i & 1) != 0) {
            wireHabitatStatusDerivedContext = wireHabitatStatusContext.derived;
        }
        return wireHabitatStatusContext.copy(wireHabitatStatusDerivedContext);
    }

    public final WireHabitatStatusDerivedContext component1() {
        return this.derived;
    }

    public final WireHabitatStatusContext copy(WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext) {
        return new WireHabitatStatusContext(wireHabitatStatusDerivedContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireHabitatStatusContext) && Intrinsics.areEqual(this.derived, ((WireHabitatStatusContext) obj).derived);
    }

    public final WireHabitatStatusDerivedContext getDerived() {
        return this.derived;
    }

    public int hashCode() {
        WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext = this.derived;
        if (wireHabitatStatusDerivedContext == null) {
            return 0;
        }
        return wireHabitatStatusDerivedContext.hashCode();
    }

    public String toString() {
        WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext = this.derived;
        return "WireHabitatStatusContext(derived=" + wireHabitatStatusDerivedContext + ")";
    }

    public WireHabitatStatusContext(WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext) {
        this.derived = wireHabitatStatusDerivedContext;
    }

    public /* synthetic */ WireHabitatStatusContext(WireHabitatStatusDerivedContext wireHabitatStatusDerivedContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireHabitatStatusDerivedContext);
    }
}
