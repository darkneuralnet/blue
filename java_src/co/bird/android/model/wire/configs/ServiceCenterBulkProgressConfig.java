package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;", "", "enableHibernate", "", "enableHibernateCreateBatch", "enableCharging", "hibernateMinBattery", "", "(ZZZI)V", "getEnableCharging", "()Z", "getEnableHibernate", "getEnableHibernateCreateBatch", "getHibernateMinBattery", "()I", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ServiceCenterBulkProgressConfig {
    @JsonProperty("enable_charging")
    @InterfaceC41208ft5("enable_charging")
    private final boolean enableCharging;
    @JsonProperty("enable_hibernation")
    @InterfaceC41208ft5("enable_hibernation")
    private final boolean enableHibernate;
    @JsonProperty("enable_hibernation_create_batch")
    @InterfaceC41208ft5("enable_hibernation_create_batch")
    private final boolean enableHibernateCreateBatch;
    @JsonProperty("hibernate_min_battery")
    @InterfaceC41208ft5("hibernate_min_battery")
    private final int hibernateMinBattery;

    public ServiceCenterBulkProgressConfig() {
        this(false, false, false, 0, 15, null);
    }

    public static /* synthetic */ ServiceCenterBulkProgressConfig copy$default(ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = serviceCenterBulkProgressConfig.enableHibernate;
        }
        if ((i2 & 2) != 0) {
            z2 = serviceCenterBulkProgressConfig.enableHibernateCreateBatch;
        }
        if ((i2 & 4) != 0) {
            z3 = serviceCenterBulkProgressConfig.enableCharging;
        }
        if ((i2 & 8) != 0) {
            i = serviceCenterBulkProgressConfig.hibernateMinBattery;
        }
        return serviceCenterBulkProgressConfig.copy(z, z2, z3, i);
    }

    public final boolean component1() {
        return this.enableHibernate;
    }

    public final boolean component2() {
        return this.enableHibernateCreateBatch;
    }

    public final boolean component3() {
        return this.enableCharging;
    }

    public final int component4() {
        return this.hibernateMinBattery;
    }

    public final ServiceCenterBulkProgressConfig copy(boolean z, boolean z2, boolean z3, int i) {
        return new ServiceCenterBulkProgressConfig(z, z2, z3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceCenterBulkProgressConfig) {
            ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig = (ServiceCenterBulkProgressConfig) obj;
            return this.enableHibernate == serviceCenterBulkProgressConfig.enableHibernate && this.enableHibernateCreateBatch == serviceCenterBulkProgressConfig.enableHibernateCreateBatch && this.enableCharging == serviceCenterBulkProgressConfig.enableCharging && this.hibernateMinBattery == serviceCenterBulkProgressConfig.hibernateMinBattery;
        }
        return false;
    }

    public final boolean getEnableCharging() {
        return this.enableCharging;
    }

    public final boolean getEnableHibernate() {
        return this.enableHibernate;
    }

    public final boolean getEnableHibernateCreateBatch() {
        return this.enableHibernateCreateBatch;
    }

    public final int getHibernateMinBattery() {
        return this.hibernateMinBattery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableHibernate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableHibernateCreateBatch;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.enableCharging;
        return ((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.hibernateMinBattery);
    }

    public String toString() {
        boolean z = this.enableHibernate;
        boolean z2 = this.enableHibernateCreateBatch;
        boolean z3 = this.enableCharging;
        int i = this.hibernateMinBattery;
        return "ServiceCenterBulkProgressConfig(enableHibernate=" + z + ", enableHibernateCreateBatch=" + z2 + ", enableCharging=" + z3 + ", hibernateMinBattery=" + i + ")";
    }

    public ServiceCenterBulkProgressConfig(boolean z, boolean z2, boolean z3, int i) {
        this.enableHibernate = z;
        this.enableHibernateCreateBatch = z2;
        this.enableCharging = z3;
        this.hibernateMinBattery = i;
    }

    public /* synthetic */ ServiceCenterBulkProgressConfig(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 40 : i);
    }
}
