package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/WireLeaseMetadata;", "", "helmet", "", "physicalLockSticker", "(Ljava/lang/String;Ljava/lang/String;)V", "getHelmet", "()Ljava/lang/String;", "getPhysicalLockSticker", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLeaseMetadata {
    @JsonProperty("helmet")
    @InterfaceC41208ft5("helmet")
    private final String helmet;
    @JsonProperty("physical_lock_sticker")
    @InterfaceC41208ft5("physical_lock_sticker")
    private final String physicalLockSticker;

    public WireLeaseMetadata() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireLeaseMetadata copy$default(WireLeaseMetadata wireLeaseMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireLeaseMetadata.helmet;
        }
        if ((i & 2) != 0) {
            str2 = wireLeaseMetadata.physicalLockSticker;
        }
        return wireLeaseMetadata.copy(str, str2);
    }

    public final String component1() {
        return this.helmet;
    }

    public final String component2() {
        return this.physicalLockSticker;
    }

    public final WireLeaseMetadata copy(String str, String str2) {
        return new WireLeaseMetadata(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLeaseMetadata) {
            WireLeaseMetadata wireLeaseMetadata = (WireLeaseMetadata) obj;
            return Intrinsics.areEqual(this.helmet, wireLeaseMetadata.helmet) && Intrinsics.areEqual(this.physicalLockSticker, wireLeaseMetadata.physicalLockSticker);
        }
        return false;
    }

    public final String getHelmet() {
        return this.helmet;
    }

    public final String getPhysicalLockSticker() {
        return this.physicalLockSticker;
    }

    public int hashCode() {
        String str = this.helmet;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.physicalLockSticker;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.helmet;
        String str2 = this.physicalLockSticker;
        return "WireLeaseMetadata(helmet=" + str + ", physicalLockSticker=" + str2 + ")";
    }

    public WireLeaseMetadata(String str, String str2) {
        this.helmet = str;
        this.physicalLockSticker = str2;
    }

    public /* synthetic */ WireLeaseMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
