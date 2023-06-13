package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0019HÆ\u0003J\t\u0010H\u001a\u00020\u001bHÆ\u0003J\t\u0010I\u001a\u00020\u001dHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u001fHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003JÑ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fHÆ\u0001J\u0013\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\t\u0010X\u001a\u00020YHÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&¨\u0006Z"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ServiceCenterConfig;", "", "enableRepairLog", "", "enableServiceCenterStatus", "enableBulkServiceCenterStatus", "enableWakeSleepBirds", "enableServiceCenterPicker", "enableEnterLocationModal", "enableBluetoothLocks", "validateWarehouse", "inventory", "Lco/bird/android/model/wire/configs/OperatorInventoryConfig;", "batchActions", "Lco/bird/android/model/wire/configs/ServiceCenterBatchConfig;", "whitelist", "bulkProgress", "Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;", "qualityControl", "Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;", "inspection", "Lco/bird/android/model/wire/configs/ServiceCenterInspectionConfig;", "enableServiceCenterApp", "downloadAssets", "entryRouting", "Lco/bird/android/model/wire/configs/EntryRoutingConfig;", "scrap", "Lco/bird/android/model/wire/configs/ScrapConfig;", "hardCount", "Lco/bird/android/model/wire/configs/HardCountConfig;", "routingOnRails", "Lco/bird/android/model/wire/configs/RoutingOnRailsConfig;", "(ZZZZZZZZLco/bird/android/model/wire/configs/OperatorInventoryConfig;Lco/bird/android/model/wire/configs/ServiceCenterBatchConfig;ZLco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;Lco/bird/android/model/wire/configs/ServiceCenterInspectionConfig;ZZLco/bird/android/model/wire/configs/EntryRoutingConfig;Lco/bird/android/model/wire/configs/ScrapConfig;Lco/bird/android/model/wire/configs/HardCountConfig;Lco/bird/android/model/wire/configs/RoutingOnRailsConfig;)V", "getBatchActions", "()Lco/bird/android/model/wire/configs/ServiceCenterBatchConfig;", "getBulkProgress", "()Lco/bird/android/model/wire/configs/ServiceCenterBulkProgressConfig;", "getDownloadAssets", "()Z", "getEnableBluetoothLocks", "getEnableBulkServiceCenterStatus", "getEnableEnterLocationModal", "getEnableRepairLog", "getEnableServiceCenterApp", "getEnableServiceCenterPicker", "getEnableServiceCenterStatus", "getEnableWakeSleepBirds", "getEntryRouting", "()Lco/bird/android/model/wire/configs/EntryRoutingConfig;", "getHardCount", "()Lco/bird/android/model/wire/configs/HardCountConfig;", "getInspection", "()Lco/bird/android/model/wire/configs/ServiceCenterInspectionConfig;", "getInventory", "()Lco/bird/android/model/wire/configs/OperatorInventoryConfig;", "getQualityControl", "()Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;", "getRoutingOnRails", "()Lco/bird/android/model/wire/configs/RoutingOnRailsConfig;", "getScrap", "()Lco/bird/android/model/wire/configs/ScrapConfig;", "getValidateWarehouse", "getWhitelist", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ServiceCenterConfig {
    @JsonProperty("batch_actions")
    @InterfaceC41208ft5("batch_actions")
    private final ServiceCenterBatchConfig batchActions;
    @JsonProperty("bulk_progress")
    @InterfaceC41208ft5("bulk_progress")
    private final ServiceCenterBulkProgressConfig bulkProgress;
    @JsonProperty("download_assets")
    @InterfaceC41208ft5("download_assets")
    private final boolean downloadAssets;
    @JsonProperty("enable_bluetooth_locks")
    @InterfaceC41208ft5("enable_bluetooth_locks")
    private final boolean enableBluetoothLocks;
    @JsonProperty("enable_bulk_service_center_status")
    @InterfaceC41208ft5("enable_bulk_service_center_status")
    private final boolean enableBulkServiceCenterStatus;
    @JsonProperty("enable_enter_location_modal")
    @InterfaceC41208ft5("enable_enter_location_modal")
    private final boolean enableEnterLocationModal;
    @JsonProperty("enable_repair_log")
    @InterfaceC41208ft5("enable_repair_log")
    private final boolean enableRepairLog;
    @JsonProperty("enable_service_center_app")
    @InterfaceC41208ft5("enable_service_center_app")
    private final boolean enableServiceCenterApp;
    @JsonProperty("enable_service_center_picker")
    @InterfaceC41208ft5("enable_service_center_picker")
    private final boolean enableServiceCenterPicker;
    @JsonProperty("enable_service_center_status")
    @InterfaceC41208ft5("enable_service_center_status")
    private final boolean enableServiceCenterStatus;
    @JsonProperty("enable_wake_sleep_birds")
    @InterfaceC41208ft5("enable_wake_sleep_birds")
    private final boolean enableWakeSleepBirds;
    @JsonProperty("entry_routing")
    @InterfaceC41208ft5("entry_routing")
    private final EntryRoutingConfig entryRouting;
    @JsonProperty("hard_count")
    @InterfaceC41208ft5("hard_count")
    private final HardCountConfig hardCount;
    @JsonProperty("inspection")
    @InterfaceC41208ft5("inspection")
    private final ServiceCenterInspectionConfig inspection;
    @JsonProperty("inventory")
    @InterfaceC41208ft5("inventory")
    private final OperatorInventoryConfig inventory;
    @JsonProperty("quality_control")
    @InterfaceC41208ft5("quality_control")
    private final ServiceCenterQualityControlConfig qualityControl;
    @JsonProperty("routing_on_rails")
    @InterfaceC41208ft5("routing_on_rails")
    private final RoutingOnRailsConfig routingOnRails;
    @JsonProperty("scrap")
    @InterfaceC41208ft5("scrap")
    private final ScrapConfig scrap;
    @JsonProperty("validate_warehouse")
    @InterfaceC41208ft5("validate_warehouse")
    private final boolean validateWarehouse;
    @JsonProperty("whitelist")
    @InterfaceC41208ft5("whitelist")
    private final boolean whitelist;

    public ServiceCenterConfig() {
        this(false, false, false, false, false, false, false, false, null, null, false, null, null, null, false, false, null, null, null, null, 1048575, null);
    }

    public final boolean component1() {
        return this.enableRepairLog;
    }

    public final ServiceCenterBatchConfig component10() {
        return this.batchActions;
    }

    public final boolean component11() {
        return this.whitelist;
    }

    public final ServiceCenterBulkProgressConfig component12() {
        return this.bulkProgress;
    }

    public final ServiceCenterQualityControlConfig component13() {
        return this.qualityControl;
    }

    public final ServiceCenterInspectionConfig component14() {
        return this.inspection;
    }

    public final boolean component15() {
        return this.enableServiceCenterApp;
    }

    public final boolean component16() {
        return this.downloadAssets;
    }

    public final EntryRoutingConfig component17() {
        return this.entryRouting;
    }

    public final ScrapConfig component18() {
        return this.scrap;
    }

    public final HardCountConfig component19() {
        return this.hardCount;
    }

    public final boolean component2() {
        return this.enableServiceCenterStatus;
    }

    public final RoutingOnRailsConfig component20() {
        return this.routingOnRails;
    }

    public final boolean component3() {
        return this.enableBulkServiceCenterStatus;
    }

    public final boolean component4() {
        return this.enableWakeSleepBirds;
    }

    public final boolean component5() {
        return this.enableServiceCenterPicker;
    }

    public final boolean component6() {
        return this.enableEnterLocationModal;
    }

    public final boolean component7() {
        return this.enableBluetoothLocks;
    }

    public final boolean component8() {
        return this.validateWarehouse;
    }

    public final OperatorInventoryConfig component9() {
        return this.inventory;
    }

    public final ServiceCenterConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, OperatorInventoryConfig inventory, ServiceCenterBatchConfig batchActions, boolean z9, ServiceCenterBulkProgressConfig bulkProgress, ServiceCenterQualityControlConfig qualityControl, ServiceCenterInspectionConfig inspection, boolean z10, boolean z11, EntryRoutingConfig entryRouting, ScrapConfig scrap, HardCountConfig hardCount, RoutingOnRailsConfig routingOnRails) {
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(batchActions, "batchActions");
        Intrinsics.checkNotNullParameter(bulkProgress, "bulkProgress");
        Intrinsics.checkNotNullParameter(qualityControl, "qualityControl");
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        Intrinsics.checkNotNullParameter(entryRouting, "entryRouting");
        Intrinsics.checkNotNullParameter(scrap, "scrap");
        Intrinsics.checkNotNullParameter(hardCount, "hardCount");
        Intrinsics.checkNotNullParameter(routingOnRails, "routingOnRails");
        return new ServiceCenterConfig(z, z2, z3, z4, z5, z6, z7, z8, inventory, batchActions, z9, bulkProgress, qualityControl, inspection, z10, z11, entryRouting, scrap, hardCount, routingOnRails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ServiceCenterConfig) {
            ServiceCenterConfig serviceCenterConfig = (ServiceCenterConfig) obj;
            return this.enableRepairLog == serviceCenterConfig.enableRepairLog && this.enableServiceCenterStatus == serviceCenterConfig.enableServiceCenterStatus && this.enableBulkServiceCenterStatus == serviceCenterConfig.enableBulkServiceCenterStatus && this.enableWakeSleepBirds == serviceCenterConfig.enableWakeSleepBirds && this.enableServiceCenterPicker == serviceCenterConfig.enableServiceCenterPicker && this.enableEnterLocationModal == serviceCenterConfig.enableEnterLocationModal && this.enableBluetoothLocks == serviceCenterConfig.enableBluetoothLocks && this.validateWarehouse == serviceCenterConfig.validateWarehouse && Intrinsics.areEqual(this.inventory, serviceCenterConfig.inventory) && Intrinsics.areEqual(this.batchActions, serviceCenterConfig.batchActions) && this.whitelist == serviceCenterConfig.whitelist && Intrinsics.areEqual(this.bulkProgress, serviceCenterConfig.bulkProgress) && Intrinsics.areEqual(this.qualityControl, serviceCenterConfig.qualityControl) && Intrinsics.areEqual(this.inspection, serviceCenterConfig.inspection) && this.enableServiceCenterApp == serviceCenterConfig.enableServiceCenterApp && this.downloadAssets == serviceCenterConfig.downloadAssets && Intrinsics.areEqual(this.entryRouting, serviceCenterConfig.entryRouting) && Intrinsics.areEqual(this.scrap, serviceCenterConfig.scrap) && Intrinsics.areEqual(this.hardCount, serviceCenterConfig.hardCount) && Intrinsics.areEqual(this.routingOnRails, serviceCenterConfig.routingOnRails);
        }
        return false;
    }

    public final ServiceCenterBatchConfig getBatchActions() {
        return this.batchActions;
    }

    public final ServiceCenterBulkProgressConfig getBulkProgress() {
        return this.bulkProgress;
    }

    public final boolean getDownloadAssets() {
        return this.downloadAssets;
    }

    public final boolean getEnableBluetoothLocks() {
        return this.enableBluetoothLocks;
    }

    public final boolean getEnableBulkServiceCenterStatus() {
        return this.enableBulkServiceCenterStatus;
    }

    public final boolean getEnableEnterLocationModal() {
        return this.enableEnterLocationModal;
    }

    public final boolean getEnableRepairLog() {
        return this.enableRepairLog;
    }

    public final boolean getEnableServiceCenterApp() {
        return this.enableServiceCenterApp;
    }

    public final boolean getEnableServiceCenterPicker() {
        return this.enableServiceCenterPicker;
    }

    public final boolean getEnableServiceCenterStatus() {
        return this.enableServiceCenterStatus;
    }

    public final boolean getEnableWakeSleepBirds() {
        return this.enableWakeSleepBirds;
    }

    public final EntryRoutingConfig getEntryRouting() {
        return this.entryRouting;
    }

    public final HardCountConfig getHardCount() {
        return this.hardCount;
    }

    public final ServiceCenterInspectionConfig getInspection() {
        return this.inspection;
    }

    public final OperatorInventoryConfig getInventory() {
        return this.inventory;
    }

    public final ServiceCenterQualityControlConfig getQualityControl() {
        return this.qualityControl;
    }

    public final RoutingOnRailsConfig getRoutingOnRails() {
        return this.routingOnRails;
    }

    public final ScrapConfig getScrap() {
        return this.scrap;
    }

    public final boolean getValidateWarehouse() {
        return this.validateWarehouse;
    }

    public final boolean getWhitelist() {
        return this.whitelist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableRepairLog;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableServiceCenterStatus;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableBulkServiceCenterStatus;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableWakeSleepBirds;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableServiceCenterPicker;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.enableEnterLocationModal;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.enableBluetoothLocks;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.validateWarehouse;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int hashCode = (((((i13 + i14) * 31) + this.inventory.hashCode()) * 31) + this.batchActions.hashCode()) * 31;
        ?? r28 = this.whitelist;
        int i15 = r28;
        if (r28 != 0) {
            i15 = 1;
        }
        int hashCode2 = (((((((hashCode + i15) * 31) + this.bulkProgress.hashCode()) * 31) + this.qualityControl.hashCode()) * 31) + this.inspection.hashCode()) * 31;
        ?? r29 = this.enableServiceCenterApp;
        int i16 = r29;
        if (r29 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode2 + i16) * 31;
        boolean z2 = this.downloadAssets;
        return ((((((((i17 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.entryRouting.hashCode()) * 31) + this.scrap.hashCode()) * 31) + this.hardCount.hashCode()) * 31) + this.routingOnRails.hashCode();
    }

    public String toString() {
        boolean z = this.enableRepairLog;
        boolean z2 = this.enableServiceCenterStatus;
        boolean z3 = this.enableBulkServiceCenterStatus;
        boolean z4 = this.enableWakeSleepBirds;
        boolean z5 = this.enableServiceCenterPicker;
        boolean z6 = this.enableEnterLocationModal;
        boolean z7 = this.enableBluetoothLocks;
        boolean z8 = this.validateWarehouse;
        OperatorInventoryConfig operatorInventoryConfig = this.inventory;
        ServiceCenterBatchConfig serviceCenterBatchConfig = this.batchActions;
        boolean z9 = this.whitelist;
        ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig = this.bulkProgress;
        ServiceCenterQualityControlConfig serviceCenterQualityControlConfig = this.qualityControl;
        ServiceCenterInspectionConfig serviceCenterInspectionConfig = this.inspection;
        boolean z10 = this.enableServiceCenterApp;
        boolean z11 = this.downloadAssets;
        EntryRoutingConfig entryRoutingConfig = this.entryRouting;
        ScrapConfig scrapConfig = this.scrap;
        HardCountConfig hardCountConfig = this.hardCount;
        RoutingOnRailsConfig routingOnRailsConfig = this.routingOnRails;
        return "ServiceCenterConfig(enableRepairLog=" + z + ", enableServiceCenterStatus=" + z2 + ", enableBulkServiceCenterStatus=" + z3 + ", enableWakeSleepBirds=" + z4 + ", enableServiceCenterPicker=" + z5 + ", enableEnterLocationModal=" + z6 + ", enableBluetoothLocks=" + z7 + ", validateWarehouse=" + z8 + ", inventory=" + operatorInventoryConfig + ", batchActions=" + serviceCenterBatchConfig + ", whitelist=" + z9 + ", bulkProgress=" + serviceCenterBulkProgressConfig + ", qualityControl=" + serviceCenterQualityControlConfig + ", inspection=" + serviceCenterInspectionConfig + ", enableServiceCenterApp=" + z10 + ", downloadAssets=" + z11 + ", entryRouting=" + entryRoutingConfig + ", scrap=" + scrapConfig + ", hardCount=" + hardCountConfig + ", routingOnRails=" + routingOnRailsConfig + ")";
    }

    public ServiceCenterConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, OperatorInventoryConfig inventory, ServiceCenterBatchConfig batchActions, boolean z9, ServiceCenterBulkProgressConfig bulkProgress, ServiceCenterQualityControlConfig qualityControl, ServiceCenterInspectionConfig inspection, boolean z10, boolean z11, EntryRoutingConfig entryRouting, ScrapConfig scrap, HardCountConfig hardCount, RoutingOnRailsConfig routingOnRails) {
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(batchActions, "batchActions");
        Intrinsics.checkNotNullParameter(bulkProgress, "bulkProgress");
        Intrinsics.checkNotNullParameter(qualityControl, "qualityControl");
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        Intrinsics.checkNotNullParameter(entryRouting, "entryRouting");
        Intrinsics.checkNotNullParameter(scrap, "scrap");
        Intrinsics.checkNotNullParameter(hardCount, "hardCount");
        Intrinsics.checkNotNullParameter(routingOnRails, "routingOnRails");
        this.enableRepairLog = z;
        this.enableServiceCenterStatus = z2;
        this.enableBulkServiceCenterStatus = z3;
        this.enableWakeSleepBirds = z4;
        this.enableServiceCenterPicker = z5;
        this.enableEnterLocationModal = z6;
        this.enableBluetoothLocks = z7;
        this.validateWarehouse = z8;
        this.inventory = inventory;
        this.batchActions = batchActions;
        this.whitelist = z9;
        this.bulkProgress = bulkProgress;
        this.qualityControl = qualityControl;
        this.inspection = inspection;
        this.enableServiceCenterApp = z10;
        this.downloadAssets = z11;
        this.entryRouting = entryRouting;
        this.scrap = scrap;
        this.hardCount = hardCount;
        this.routingOnRails = routingOnRails;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ServiceCenterConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, OperatorInventoryConfig operatorInventoryConfig, ServiceCenterBatchConfig serviceCenterBatchConfig, boolean z9, ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig, ServiceCenterQualityControlConfig serviceCenterQualityControlConfig, ServiceCenterInspectionConfig serviceCenterInspectionConfig, boolean z10, boolean z11, EntryRoutingConfig entryRoutingConfig, ScrapConfig scrapConfig, HardCountConfig hardCountConfig, RoutingOnRailsConfig routingOnRailsConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r13, r14, r17, r16, r45, r19, r18, r20, r21, r15, (i & 524288) != 0 ? new RoutingOnRailsConfig(r11, 1, r2) : routingOnRailsConfig);
        ServiceCenterQualityControlConfig serviceCenterQualityControlConfig2;
        ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig2;
        ServiceCenterInspectionConfig serviceCenterInspectionConfig2;
        boolean z12;
        ServiceCenterInspectionConfig serviceCenterInspectionConfig3;
        boolean z13;
        DefaultConstructorMarker defaultConstructorMarker2;
        boolean z14;
        EntryRoutingConfig entryRoutingConfig2;
        EntryRoutingConfig entryRoutingConfig3;
        ScrapConfig scrapConfig2;
        ScrapConfig scrapConfig3;
        HardCountConfig hardCountConfig2;
        boolean z15 = (i & 1) != 0 ? false : z;
        boolean z16 = (i & 2) != 0 ? false : z2;
        boolean z17 = (i & 4) != 0 ? false : z3;
        boolean z18 = (i & 8) != 0 ? false : z4;
        boolean z19 = (i & 16) != 0 ? false : z5;
        boolean z20 = (i & 32) != 0 ? false : z6;
        boolean z21 = (i & 64) != 0 ? false : z7;
        boolean z22 = (i & 128) != 0 ? false : z8;
        OperatorInventoryConfig operatorInventoryConfig2 = (i & 256) != 0 ? new OperatorInventoryConfig(false, 1, null) : operatorInventoryConfig;
        ServiceCenterBatchConfig serviceCenterBatchConfig2 = (i & 512) != 0 ? new ServiceCenterBatchConfig(false, false, false, false, 15, null) : serviceCenterBatchConfig;
        boolean z23 = (i & 1024) != 0 ? false : z9;
        ServiceCenterBulkProgressConfig serviceCenterBulkProgressConfig3 = (i & 2048) != 0 ? new ServiceCenterBulkProgressConfig(false, false, false, 0, 15, null) : serviceCenterBulkProgressConfig;
        ServiceCenterQualityControlConfig serviceCenterQualityControlConfig3 = (i & 4096) != 0 ? new ServiceCenterQualityControlConfig(false, null, false, 7, null) : serviceCenterQualityControlConfig;
        if ((i & 8192) != 0) {
            serviceCenterQualityControlConfig2 = serviceCenterQualityControlConfig3;
            serviceCenterBulkProgressConfig2 = serviceCenterBulkProgressConfig3;
            serviceCenterInspectionConfig2 = new ServiceCenterInspectionConfig(false, 1, null);
        } else {
            serviceCenterQualityControlConfig2 = serviceCenterQualityControlConfig3;
            serviceCenterBulkProgressConfig2 = serviceCenterBulkProgressConfig3;
            serviceCenterInspectionConfig2 = serviceCenterInspectionConfig;
        }
        boolean z24 = (i & 16384) != 0 ? false : z10;
        boolean z25 = (32768 & i) != 0 ? false : z11;
        if ((i & 65536) != 0) {
            z13 = z25;
            z12 = z24;
            serviceCenterInspectionConfig3 = serviceCenterInspectionConfig2;
            defaultConstructorMarker2 = null;
            z14 = false;
            entryRoutingConfig2 = new EntryRoutingConfig(false, 1, null);
        } else {
            z12 = z24;
            serviceCenterInspectionConfig3 = serviceCenterInspectionConfig2;
            z13 = z25;
            defaultConstructorMarker2 = null;
            z14 = false;
            entryRoutingConfig2 = entryRoutingConfig;
        }
        if ((i & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
            entryRoutingConfig3 = entryRoutingConfig2;
            scrapConfig2 = new ScrapConfig(z14, 1, defaultConstructorMarker2);
        } else {
            entryRoutingConfig3 = entryRoutingConfig2;
            scrapConfig2 = scrapConfig;
        }
        if ((i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0) {
            scrapConfig3 = scrapConfig2;
            hardCountConfig2 = new HardCountConfig(z14, 1, defaultConstructorMarker2);
        } else {
            scrapConfig3 = scrapConfig2;
            hardCountConfig2 = hardCountConfig;
        }
    }
}
