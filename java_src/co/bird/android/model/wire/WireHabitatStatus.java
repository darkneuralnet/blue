package co.bird.android.model.wire;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/WireHabitatStatus;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireHabitatStatusContext;", "(Lco/bird/android/model/wire/WireHabitatStatusContext;)V", "getContext", "()Lco/bird/android/model/wire/WireHabitatStatusContext;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireHabitatStatus {
    @JsonProperty(CoreConstants.CONTEXT_SCOPE_VALUE)
    @InterfaceC41208ft5(CoreConstants.CONTEXT_SCOPE_VALUE)
    private final WireHabitatStatusContext context;

    public WireHabitatStatus() {
        this(null, 1, null);
    }

    public static /* synthetic */ WireHabitatStatus copy$default(WireHabitatStatus wireHabitatStatus, WireHabitatStatusContext wireHabitatStatusContext, int i, Object obj) {
        if ((i & 1) != 0) {
            wireHabitatStatusContext = wireHabitatStatus.context;
        }
        return wireHabitatStatus.copy(wireHabitatStatusContext);
    }

    public final WireHabitatStatusContext component1() {
        return this.context;
    }

    public final WireHabitatStatus copy(WireHabitatStatusContext wireHabitatStatusContext) {
        return new WireHabitatStatus(wireHabitatStatusContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireHabitatStatus) && Intrinsics.areEqual(this.context, ((WireHabitatStatus) obj).context);
    }

    public final WireHabitatStatusContext getContext() {
        return this.context;
    }

    public int hashCode() {
        WireHabitatStatusContext wireHabitatStatusContext = this.context;
        if (wireHabitatStatusContext == null) {
            return 0;
        }
        return wireHabitatStatusContext.hashCode();
    }

    public String toString() {
        WireHabitatStatusContext wireHabitatStatusContext = this.context;
        return "WireHabitatStatus(context=" + wireHabitatStatusContext + ")";
    }

    public WireHabitatStatus(WireHabitatStatusContext wireHabitatStatusContext) {
        this.context = wireHabitatStatusContext;
    }

    public /* synthetic */ WireHabitatStatus(WireHabitatStatusContext wireHabitatStatusContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireHabitatStatusContext);
    }
}
