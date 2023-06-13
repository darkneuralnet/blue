package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/PhysicalLockEvent;", "", "birdId", "", "eventType", "Lco/bird/android/model/PhysicalLockEventKind;", "(Ljava/lang/String;Lco/bird/android/model/PhysicalLockEventKind;)V", "getBirdId", "()Ljava/lang/String;", "getEventType", "()Lco/bird/android/model/PhysicalLockEventKind;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PhysicalLockEvent {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("event_type")
    @InterfaceC41208ft5("event_type")
    private final PhysicalLockEventKind eventType;

    public PhysicalLockEvent() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PhysicalLockEvent copy$default(PhysicalLockEvent physicalLockEvent, String str, PhysicalLockEventKind physicalLockEventKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = physicalLockEvent.birdId;
        }
        if ((i & 2) != 0) {
            physicalLockEventKind = physicalLockEvent.eventType;
        }
        return physicalLockEvent.copy(str, physicalLockEventKind);
    }

    public final String component1() {
        return this.birdId;
    }

    public final PhysicalLockEventKind component2() {
        return this.eventType;
    }

    public final PhysicalLockEvent copy(String birdId, PhysicalLockEventKind physicalLockEventKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new PhysicalLockEvent(birdId, physicalLockEventKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhysicalLockEvent) {
            PhysicalLockEvent physicalLockEvent = (PhysicalLockEvent) obj;
            return Intrinsics.areEqual(this.birdId, physicalLockEvent.birdId) && this.eventType == physicalLockEvent.eventType;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final PhysicalLockEventKind getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        PhysicalLockEventKind physicalLockEventKind = this.eventType;
        return hashCode + (physicalLockEventKind == null ? 0 : physicalLockEventKind.hashCode());
    }

    public String toString() {
        String str = this.birdId;
        PhysicalLockEventKind physicalLockEventKind = this.eventType;
        return "PhysicalLockEvent(birdId=" + str + ", eventType=" + physicalLockEventKind + ")";
    }

    public PhysicalLockEvent(String birdId, PhysicalLockEventKind physicalLockEventKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.birdId = birdId;
        this.eventType = physicalLockEventKind;
    }

    public /* synthetic */ PhysicalLockEvent(String str, PhysicalLockEventKind physicalLockEventKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : physicalLockEventKind);
    }
}
