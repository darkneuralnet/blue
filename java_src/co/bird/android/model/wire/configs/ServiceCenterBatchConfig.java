package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ServiceCenterBatchConfig;", "", "enabled", "", "createBatch", "addToBatch", "viewAllBatches", "(ZZZZ)V", "getAddToBatch", "()Z", "getCreateBatch", "getEnabled", "getViewAllBatches", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ServiceCenterBatchConfig {
    @JsonProperty("add_to_batch")
    @InterfaceC41208ft5("add_to_batch")
    private final boolean addToBatch;
    @JsonProperty("create_batch")
    @InterfaceC41208ft5("create_batch")
    private final boolean createBatch;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("view_all_batches")
    @InterfaceC41208ft5("view_all_batches")
    private final boolean viewAllBatches;

    public ServiceCenterBatchConfig() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ ServiceCenterBatchConfig copy$default(ServiceCenterBatchConfig serviceCenterBatchConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = serviceCenterBatchConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = serviceCenterBatchConfig.createBatch;
        }
        if ((i & 4) != 0) {
            z3 = serviceCenterBatchConfig.addToBatch;
        }
        if ((i & 8) != 0) {
            z4 = serviceCenterBatchConfig.viewAllBatches;
        }
        return serviceCenterBatchConfig.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.createBatch;
    }

    public final boolean component3() {
        return this.addToBatch;
    }

    public final boolean component4() {
        return this.viewAllBatches;
    }

    public final ServiceCenterBatchConfig copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new ServiceCenterBatchConfig(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceCenterBatchConfig) {
            ServiceCenterBatchConfig serviceCenterBatchConfig = (ServiceCenterBatchConfig) obj;
            return this.enabled == serviceCenterBatchConfig.enabled && this.createBatch == serviceCenterBatchConfig.createBatch && this.addToBatch == serviceCenterBatchConfig.addToBatch && this.viewAllBatches == serviceCenterBatchConfig.viewAllBatches;
        }
        return false;
    }

    public final boolean getAddToBatch() {
        return this.addToBatch;
    }

    public final boolean getCreateBatch() {
        return this.createBatch;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getViewAllBatches() {
        return this.viewAllBatches;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.createBatch;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.addToBatch;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.viewAllBatches;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.createBatch;
        boolean z3 = this.addToBatch;
        boolean z4 = this.viewAllBatches;
        return "ServiceCenterBatchConfig(enabled=" + z + ", createBatch=" + z2 + ", addToBatch=" + z3 + ", viewAllBatches=" + z4 + ")";
    }

    public ServiceCenterBatchConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enabled = z;
        this.createBatch = z2;
        this.addToBatch = z3;
        this.viewAllBatches = z4;
    }

    public /* synthetic */ ServiceCenterBatchConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
