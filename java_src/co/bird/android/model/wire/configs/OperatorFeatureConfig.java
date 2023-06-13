package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B§\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000205\u0012\b\b\u0002\u00106\u001a\u000207\u0012\b\b\u0002\u00108\u001a\u000209¢\u0006\u0002\u0010:J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0015HÆ\u0003J\t\u0010u\u001a\u00020\u0017HÆ\u0003J\t\u0010v\u001a\u00020\u0017HÆ\u0003J\t\u0010w\u001a\u00020\u0017HÆ\u0003J\t\u0010x\u001a\u00020\u001bHÆ\u0003J\t\u0010y\u001a\u00020\u001dHÆ\u0003J\t\u0010z\u001a\u00020\u001fHÆ\u0003J\t\u0010{\u001a\u00020!HÆ\u0003J\t\u0010|\u001a\u00020#HÆ\u0003J\t\u0010}\u001a\u00020%HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020'HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020)HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020+HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020-HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020/HÆ\u0003J\n\u0010\u0084\u0001\u001a\u000201HÆ\u0003J\n\u0010\u0085\u0001\u001a\u000203HÆ\u0003J\n\u0010\u0086\u0001\u001a\u000205HÆ\u0003J\n\u0010\u0087\u0001\u001a\u000207HÆ\u0003J\n\u0010\u0088\u0001\u001a\u000209HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0013HÆ\u0003J¬\u0002\u0010\u0090\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u000209HÆ\u0001J\u0015\u0010\u0091\u0001\u001a\u00020\u00172\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0093\u0001\u001a\u00030\u0094\u0001HÖ\u0001J\u000b\u0010\u0095\u0001\u001a\u00030\u0096\u0001HÖ\u0001R\u0016\u00100\u001a\u0002018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0016\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0016\u0010.\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0016\u0010,\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0016\u00102\u001a\u0002038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0016\u00104\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0016\u00108\u001a\u0002098\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0016\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0016\u00106\u001a\u0002078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010r¨\u0006\u0097\u0001"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorFeatureConfig;", "", "map", "Lco/bird/android/model/wire/configs/OperatorMapConfig;", "bulkScanner", "Lco/bird/android/model/wire/configs/OperatorBulkScannerConfig;", "wakeBirds", "Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;", "sweepBirds", "Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;", "taskList", "Lco/bird/android/model/wire/configs/OperatorTaskListConfig;", "nestMap", "Lco/bird/android/model/wire/configs/OperatorNestMapConfig;", "idTool", "Lco/bird/android/model/wire/configs/OperatorIdToolConfig;", "replaceQr", "Lco/bird/android/model/wire/configs/OperatorReplaceQrConfig;", "commandCenter", "Lco/bird/android/model/wire/configs/OperatorCommandCenterConfig;", "workOrders", "Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;", "enableLookupBird", "", "enableShakeToReport", "enablePairHandheld", "repair", "Lco/bird/android/model/wire/configs/OperatorRepairConfig;", "healthCheck", "Lco/bird/android/model/wire/configs/HealthCheckConfig;", "fleetStatus", "Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;", "maintenance", "Lco/bird/android/model/wire/configs/MaintenanceConfig;", "report", "Lco/bird/android/model/wire/configs/OperatorReportConfig;", "release", "Lco/bird/android/model/wire/configs/OperatorReleaseConfig;", "transferOrder", "Lco/bird/android/model/wire/configs/TransferOrderConfig;", "settings", "Lco/bird/android/model/wire/configs/OperatorSettingsConfig;", "batterySwap", "Lco/bird/android/model/wire/configs/OperatorBatterySwapConfig;", "inventory", "Lco/bird/android/model/wire/configs/VehicleInventoryTrackingConfig;", "fleetReport", "Lco/bird/android/model/wire/configs/OperatorFleetReportConfig;", "arParking", "Lco/bird/android/model/wire/configs/ArParkingConfig;", "nestClaims", "Lco/bird/android/model/wire/configs/OperatorNestClaimsConfig;", "nestSuggestion", "Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;", "zoneMap", "Lco/bird/android/model/wire/configs/OperatorZoneMapConfig;", "notificationCenter", "Lco/bird/android/model/wire/configs/OperatorNotificationCenterConfig;", "(Lco/bird/android/model/wire/configs/OperatorMapConfig;Lco/bird/android/model/wire/configs/OperatorBulkScannerConfig;Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;Lco/bird/android/model/wire/configs/OperatorTaskListConfig;Lco/bird/android/model/wire/configs/OperatorNestMapConfig;Lco/bird/android/model/wire/configs/OperatorIdToolConfig;Lco/bird/android/model/wire/configs/OperatorReplaceQrConfig;Lco/bird/android/model/wire/configs/OperatorCommandCenterConfig;Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;ZZZLco/bird/android/model/wire/configs/OperatorRepairConfig;Lco/bird/android/model/wire/configs/HealthCheckConfig;Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;Lco/bird/android/model/wire/configs/MaintenanceConfig;Lco/bird/android/model/wire/configs/OperatorReportConfig;Lco/bird/android/model/wire/configs/OperatorReleaseConfig;Lco/bird/android/model/wire/configs/TransferOrderConfig;Lco/bird/android/model/wire/configs/OperatorSettingsConfig;Lco/bird/android/model/wire/configs/OperatorBatterySwapConfig;Lco/bird/android/model/wire/configs/VehicleInventoryTrackingConfig;Lco/bird/android/model/wire/configs/OperatorFleetReportConfig;Lco/bird/android/model/wire/configs/ArParkingConfig;Lco/bird/android/model/wire/configs/OperatorNestClaimsConfig;Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;Lco/bird/android/model/wire/configs/OperatorZoneMapConfig;Lco/bird/android/model/wire/configs/OperatorNotificationCenterConfig;)V", "getArParking", "()Lco/bird/android/model/wire/configs/ArParkingConfig;", "getBatterySwap", "()Lco/bird/android/model/wire/configs/OperatorBatterySwapConfig;", "getBulkScanner", "()Lco/bird/android/model/wire/configs/OperatorBulkScannerConfig;", "getCommandCenter", "()Lco/bird/android/model/wire/configs/OperatorCommandCenterConfig;", "getEnableLookupBird", "()Z", "getEnablePairHandheld", "getEnableShakeToReport", "getFleetReport", "()Lco/bird/android/model/wire/configs/OperatorFleetReportConfig;", "getFleetStatus", "()Lco/bird/android/model/wire/configs/OperatorFleetStatusConfig;", "getHealthCheck", "()Lco/bird/android/model/wire/configs/HealthCheckConfig;", "getIdTool", "()Lco/bird/android/model/wire/configs/OperatorIdToolConfig;", "getInventory", "()Lco/bird/android/model/wire/configs/VehicleInventoryTrackingConfig;", "getMaintenance", "()Lco/bird/android/model/wire/configs/MaintenanceConfig;", "getMap", "()Lco/bird/android/model/wire/configs/OperatorMapConfig;", "getNestClaims", "()Lco/bird/android/model/wire/configs/OperatorNestClaimsConfig;", "getNestMap", "()Lco/bird/android/model/wire/configs/OperatorNestMapConfig;", "getNestSuggestion", "()Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;", "getNotificationCenter", "()Lco/bird/android/model/wire/configs/OperatorNotificationCenterConfig;", "getRelease", "()Lco/bird/android/model/wire/configs/OperatorReleaseConfig;", "getRepair", "()Lco/bird/android/model/wire/configs/OperatorRepairConfig;", "getReplaceQr", "()Lco/bird/android/model/wire/configs/OperatorReplaceQrConfig;", "getReport", "()Lco/bird/android/model/wire/configs/OperatorReportConfig;", "getSettings", "()Lco/bird/android/model/wire/configs/OperatorSettingsConfig;", "getSweepBirds", "()Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;", "getTaskList", "()Lco/bird/android/model/wire/configs/OperatorTaskListConfig;", "getTransferOrder", "()Lco/bird/android/model/wire/configs/TransferOrderConfig;", "getWakeBirds", "()Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;", "getWorkOrders", "()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;", "getZoneMap", "()Lco/bird/android/model/wire/configs/OperatorZoneMapConfig;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorFeatureConfig {
    @JsonProperty("ar_parking")
    @InterfaceC41208ft5("ar_parking")
    private final ArParkingConfig arParking;
    @JsonProperty("battery_swap")
    @InterfaceC41208ft5("battery_swap")
    private final OperatorBatterySwapConfig batterySwap;
    @JsonProperty("bulk_scanner")
    @InterfaceC41208ft5("bulk_scanner")
    private final OperatorBulkScannerConfig bulkScanner;
    @JsonProperty("command_center")
    @InterfaceC41208ft5("command_center")
    private final OperatorCommandCenterConfig commandCenter;
    @JsonProperty("enable_lookup_bird")
    @InterfaceC41208ft5("enable_lookup_bird")
    private final boolean enableLookupBird;
    @JsonProperty("enable_pair_handheld")
    @InterfaceC41208ft5("enable_pair_handheld")
    private final boolean enablePairHandheld;
    @JsonProperty("enable_shake_to_report")
    @InterfaceC41208ft5("enable_shake_to_report")
    private final boolean enableShakeToReport;
    @JsonProperty("fleet_report")
    @InterfaceC41208ft5("fleet_report")
    private final OperatorFleetReportConfig fleetReport;
    @JsonProperty("fleet_status")
    @InterfaceC41208ft5("fleet_status")
    private final OperatorFleetStatusConfig fleetStatus;
    @JsonProperty("health_check")
    @InterfaceC41208ft5("health_check")
    private final HealthCheckConfig healthCheck;
    @JsonProperty("id_tools")
    @InterfaceC41208ft5("id_tools")
    private final OperatorIdToolConfig idTool;
    @JsonProperty("inventory")
    @InterfaceC41208ft5("inventory")
    private final VehicleInventoryTrackingConfig inventory;
    @JsonProperty("maintenance")
    @InterfaceC41208ft5("maintenance")
    private final MaintenanceConfig maintenance;
    @JsonProperty("map")
    @InterfaceC41208ft5("map")
    private final OperatorMapConfig map;
    @JsonProperty("nest_claims")
    @InterfaceC41208ft5("nest_claims")
    private final OperatorNestClaimsConfig nestClaims;
    @JsonProperty("nest_map")
    @InterfaceC41208ft5("nest_map")
    private final OperatorNestMapConfig nestMap;
    @JsonProperty("nest_suggestion")
    @InterfaceC41208ft5("nest_suggestion")
    private final OperatorNestSuggestionConfig nestSuggestion;
    @JsonProperty("notification_center")
    @InterfaceC41208ft5("notification_center")
    private final OperatorNotificationCenterConfig notificationCenter;
    @JsonProperty("release")
    @InterfaceC41208ft5("release")
    private final OperatorReleaseConfig release;
    @JsonProperty("repair")
    @InterfaceC41208ft5("repair")
    private final OperatorRepairConfig repair;
    @JsonProperty("replace_qr")
    @InterfaceC41208ft5("replace_qr")
    private final OperatorReplaceQrConfig replaceQr;
    @JsonProperty("reports")
    @InterfaceC41208ft5("reports")
    private final OperatorReportConfig report;
    @JsonProperty("settings")
    @InterfaceC41208ft5("settings")
    private final OperatorSettingsConfig settings;
    @JsonProperty("sweep_birds")
    @InterfaceC41208ft5("sweep_birds")
    private final OperatorSweepBirdsConfig sweepBirds;
    @JsonProperty("task_list")
    @InterfaceC41208ft5("task_list")
    private final OperatorTaskListConfig taskList;
    @JsonProperty("transfer_order")
    @InterfaceC41208ft5("transfer_order")
    private final TransferOrderConfig transferOrder;
    @JsonProperty("wake_birds")
    @InterfaceC41208ft5("wake_birds")
    private final OperatorWakeBirdsConfig wakeBirds;
    @JsonProperty("work_orders")
    @InterfaceC41208ft5("work_orders")
    private final OperatorWorkOrderConfig workOrders;
    @JsonProperty("zone_map")
    @InterfaceC41208ft5("zone_map")
    private final OperatorZoneMapConfig zoneMap;

    public OperatorFeatureConfig() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final OperatorMapConfig component1() {
        return this.map;
    }

    public final OperatorWorkOrderConfig component10() {
        return this.workOrders;
    }

    public final boolean component11() {
        return this.enableLookupBird;
    }

    public final boolean component12() {
        return this.enableShakeToReport;
    }

    public final boolean component13() {
        return this.enablePairHandheld;
    }

    public final OperatorRepairConfig component14() {
        return this.repair;
    }

    public final HealthCheckConfig component15() {
        return this.healthCheck;
    }

    public final OperatorFleetStatusConfig component16() {
        return this.fleetStatus;
    }

    public final MaintenanceConfig component17() {
        return this.maintenance;
    }

    public final OperatorReportConfig component18() {
        return this.report;
    }

    public final OperatorReleaseConfig component19() {
        return this.release;
    }

    public final OperatorBulkScannerConfig component2() {
        return this.bulkScanner;
    }

    public final TransferOrderConfig component20() {
        return this.transferOrder;
    }

    public final OperatorSettingsConfig component21() {
        return this.settings;
    }

    public final OperatorBatterySwapConfig component22() {
        return this.batterySwap;
    }

    public final VehicleInventoryTrackingConfig component23() {
        return this.inventory;
    }

    public final OperatorFleetReportConfig component24() {
        return this.fleetReport;
    }

    public final ArParkingConfig component25() {
        return this.arParking;
    }

    public final OperatorNestClaimsConfig component26() {
        return this.nestClaims;
    }

    public final OperatorNestSuggestionConfig component27() {
        return this.nestSuggestion;
    }

    public final OperatorZoneMapConfig component28() {
        return this.zoneMap;
    }

    public final OperatorNotificationCenterConfig component29() {
        return this.notificationCenter;
    }

    public final OperatorWakeBirdsConfig component3() {
        return this.wakeBirds;
    }

    public final OperatorSweepBirdsConfig component4() {
        return this.sweepBirds;
    }

    public final OperatorTaskListConfig component5() {
        return this.taskList;
    }

    public final OperatorNestMapConfig component6() {
        return this.nestMap;
    }

    public final OperatorIdToolConfig component7() {
        return this.idTool;
    }

    public final OperatorReplaceQrConfig component8() {
        return this.replaceQr;
    }

    public final OperatorCommandCenterConfig component9() {
        return this.commandCenter;
    }

    public final OperatorFeatureConfig copy(OperatorMapConfig map, OperatorBulkScannerConfig bulkScanner, OperatorWakeBirdsConfig wakeBirds, OperatorSweepBirdsConfig sweepBirds, OperatorTaskListConfig taskList, OperatorNestMapConfig nestMap, OperatorIdToolConfig idTool, OperatorReplaceQrConfig replaceQr, OperatorCommandCenterConfig commandCenter, OperatorWorkOrderConfig workOrders, boolean z, boolean z2, boolean z3, OperatorRepairConfig repair, HealthCheckConfig healthCheck, OperatorFleetStatusConfig fleetStatus, MaintenanceConfig maintenance, OperatorReportConfig report, OperatorReleaseConfig release, TransferOrderConfig transferOrder, OperatorSettingsConfig settings, OperatorBatterySwapConfig batterySwap, VehicleInventoryTrackingConfig inventory, OperatorFleetReportConfig fleetReport, ArParkingConfig arParking, OperatorNestClaimsConfig nestClaims, OperatorNestSuggestionConfig nestSuggestion, OperatorZoneMapConfig zoneMap, OperatorNotificationCenterConfig notificationCenter) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(bulkScanner, "bulkScanner");
        Intrinsics.checkNotNullParameter(wakeBirds, "wakeBirds");
        Intrinsics.checkNotNullParameter(sweepBirds, "sweepBirds");
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        Intrinsics.checkNotNullParameter(nestMap, "nestMap");
        Intrinsics.checkNotNullParameter(idTool, "idTool");
        Intrinsics.checkNotNullParameter(replaceQr, "replaceQr");
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        Intrinsics.checkNotNullParameter(workOrders, "workOrders");
        Intrinsics.checkNotNullParameter(repair, "repair");
        Intrinsics.checkNotNullParameter(healthCheck, "healthCheck");
        Intrinsics.checkNotNullParameter(fleetStatus, "fleetStatus");
        Intrinsics.checkNotNullParameter(maintenance, "maintenance");
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(release, "release");
        Intrinsics.checkNotNullParameter(transferOrder, "transferOrder");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(batterySwap, "batterySwap");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(fleetReport, "fleetReport");
        Intrinsics.checkNotNullParameter(arParking, "arParking");
        Intrinsics.checkNotNullParameter(nestClaims, "nestClaims");
        Intrinsics.checkNotNullParameter(nestSuggestion, "nestSuggestion");
        Intrinsics.checkNotNullParameter(zoneMap, "zoneMap");
        Intrinsics.checkNotNullParameter(notificationCenter, "notificationCenter");
        return new OperatorFeatureConfig(map, bulkScanner, wakeBirds, sweepBirds, taskList, nestMap, idTool, replaceQr, commandCenter, workOrders, z, z2, z3, repair, healthCheck, fleetStatus, maintenance, report, release, transferOrder, settings, batterySwap, inventory, fleetReport, arParking, nestClaims, nestSuggestion, zoneMap, notificationCenter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorFeatureConfig) {
            OperatorFeatureConfig operatorFeatureConfig = (OperatorFeatureConfig) obj;
            return Intrinsics.areEqual(this.map, operatorFeatureConfig.map) && Intrinsics.areEqual(this.bulkScanner, operatorFeatureConfig.bulkScanner) && Intrinsics.areEqual(this.wakeBirds, operatorFeatureConfig.wakeBirds) && Intrinsics.areEqual(this.sweepBirds, operatorFeatureConfig.sweepBirds) && Intrinsics.areEqual(this.taskList, operatorFeatureConfig.taskList) && Intrinsics.areEqual(this.nestMap, operatorFeatureConfig.nestMap) && Intrinsics.areEqual(this.idTool, operatorFeatureConfig.idTool) && Intrinsics.areEqual(this.replaceQr, operatorFeatureConfig.replaceQr) && Intrinsics.areEqual(this.commandCenter, operatorFeatureConfig.commandCenter) && Intrinsics.areEqual(this.workOrders, operatorFeatureConfig.workOrders) && this.enableLookupBird == operatorFeatureConfig.enableLookupBird && this.enableShakeToReport == operatorFeatureConfig.enableShakeToReport && this.enablePairHandheld == operatorFeatureConfig.enablePairHandheld && Intrinsics.areEqual(this.repair, operatorFeatureConfig.repair) && Intrinsics.areEqual(this.healthCheck, operatorFeatureConfig.healthCheck) && Intrinsics.areEqual(this.fleetStatus, operatorFeatureConfig.fleetStatus) && Intrinsics.areEqual(this.maintenance, operatorFeatureConfig.maintenance) && Intrinsics.areEqual(this.report, operatorFeatureConfig.report) && Intrinsics.areEqual(this.release, operatorFeatureConfig.release) && Intrinsics.areEqual(this.transferOrder, operatorFeatureConfig.transferOrder) && Intrinsics.areEqual(this.settings, operatorFeatureConfig.settings) && Intrinsics.areEqual(this.batterySwap, operatorFeatureConfig.batterySwap) && Intrinsics.areEqual(this.inventory, operatorFeatureConfig.inventory) && Intrinsics.areEqual(this.fleetReport, operatorFeatureConfig.fleetReport) && Intrinsics.areEqual(this.arParking, operatorFeatureConfig.arParking) && Intrinsics.areEqual(this.nestClaims, operatorFeatureConfig.nestClaims) && Intrinsics.areEqual(this.nestSuggestion, operatorFeatureConfig.nestSuggestion) && Intrinsics.areEqual(this.zoneMap, operatorFeatureConfig.zoneMap) && Intrinsics.areEqual(this.notificationCenter, operatorFeatureConfig.notificationCenter);
        }
        return false;
    }

    public final ArParkingConfig getArParking() {
        return this.arParking;
    }

    public final OperatorBatterySwapConfig getBatterySwap() {
        return this.batterySwap;
    }

    public final OperatorBulkScannerConfig getBulkScanner() {
        return this.bulkScanner;
    }

    public final OperatorCommandCenterConfig getCommandCenter() {
        return this.commandCenter;
    }

    public final boolean getEnableLookupBird() {
        return this.enableLookupBird;
    }

    public final boolean getEnablePairHandheld() {
        return this.enablePairHandheld;
    }

    public final boolean getEnableShakeToReport() {
        return this.enableShakeToReport;
    }

    public final OperatorFleetReportConfig getFleetReport() {
        return this.fleetReport;
    }

    public final OperatorFleetStatusConfig getFleetStatus() {
        return this.fleetStatus;
    }

    public final HealthCheckConfig getHealthCheck() {
        return this.healthCheck;
    }

    public final OperatorIdToolConfig getIdTool() {
        return this.idTool;
    }

    public final VehicleInventoryTrackingConfig getInventory() {
        return this.inventory;
    }

    public final MaintenanceConfig getMaintenance() {
        return this.maintenance;
    }

    public final OperatorMapConfig getMap() {
        return this.map;
    }

    public final OperatorNestClaimsConfig getNestClaims() {
        return this.nestClaims;
    }

    public final OperatorNestMapConfig getNestMap() {
        return this.nestMap;
    }

    public final OperatorNestSuggestionConfig getNestSuggestion() {
        return this.nestSuggestion;
    }

    public final OperatorNotificationCenterConfig getNotificationCenter() {
        return this.notificationCenter;
    }

    public final OperatorReleaseConfig getRelease() {
        return this.release;
    }

    public final OperatorRepairConfig getRepair() {
        return this.repair;
    }

    public final OperatorReplaceQrConfig getReplaceQr() {
        return this.replaceQr;
    }

    public final OperatorReportConfig getReport() {
        return this.report;
    }

    public final OperatorSettingsConfig getSettings() {
        return this.settings;
    }

    public final OperatorSweepBirdsConfig getSweepBirds() {
        return this.sweepBirds;
    }

    public final OperatorTaskListConfig getTaskList() {
        return this.taskList;
    }

    public final TransferOrderConfig getTransferOrder() {
        return this.transferOrder;
    }

    public final OperatorWakeBirdsConfig getWakeBirds() {
        return this.wakeBirds;
    }

    public final OperatorWorkOrderConfig getWorkOrders() {
        return this.workOrders;
    }

    public final OperatorZoneMapConfig getZoneMap() {
        return this.zoneMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((this.map.hashCode() * 31) + this.bulkScanner.hashCode()) * 31) + this.wakeBirds.hashCode()) * 31) + this.sweepBirds.hashCode()) * 31) + this.taskList.hashCode()) * 31) + this.nestMap.hashCode()) * 31) + this.idTool.hashCode()) * 31) + this.replaceQr.hashCode()) * 31) + this.commandCenter.hashCode()) * 31) + this.workOrders.hashCode()) * 31;
        boolean z = this.enableLookupBird;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.enableShakeToReport;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.enablePairHandheld;
        return ((((((((((((((((((((((((((((((((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.repair.hashCode()) * 31) + this.healthCheck.hashCode()) * 31) + this.fleetStatus.hashCode()) * 31) + this.maintenance.hashCode()) * 31) + this.report.hashCode()) * 31) + this.release.hashCode()) * 31) + this.transferOrder.hashCode()) * 31) + this.settings.hashCode()) * 31) + this.batterySwap.hashCode()) * 31) + this.inventory.hashCode()) * 31) + this.fleetReport.hashCode()) * 31) + this.arParking.hashCode()) * 31) + this.nestClaims.hashCode()) * 31) + this.nestSuggestion.hashCode()) * 31) + this.zoneMap.hashCode()) * 31) + this.notificationCenter.hashCode();
    }

    public String toString() {
        OperatorMapConfig operatorMapConfig = this.map;
        OperatorBulkScannerConfig operatorBulkScannerConfig = this.bulkScanner;
        OperatorWakeBirdsConfig operatorWakeBirdsConfig = this.wakeBirds;
        OperatorSweepBirdsConfig operatorSweepBirdsConfig = this.sweepBirds;
        OperatorTaskListConfig operatorTaskListConfig = this.taskList;
        OperatorNestMapConfig operatorNestMapConfig = this.nestMap;
        OperatorIdToolConfig operatorIdToolConfig = this.idTool;
        OperatorReplaceQrConfig operatorReplaceQrConfig = this.replaceQr;
        OperatorCommandCenterConfig operatorCommandCenterConfig = this.commandCenter;
        OperatorWorkOrderConfig operatorWorkOrderConfig = this.workOrders;
        boolean z = this.enableLookupBird;
        boolean z2 = this.enableShakeToReport;
        boolean z3 = this.enablePairHandheld;
        OperatorRepairConfig operatorRepairConfig = this.repair;
        HealthCheckConfig healthCheckConfig = this.healthCheck;
        OperatorFleetStatusConfig operatorFleetStatusConfig = this.fleetStatus;
        MaintenanceConfig maintenanceConfig = this.maintenance;
        OperatorReportConfig operatorReportConfig = this.report;
        OperatorReleaseConfig operatorReleaseConfig = this.release;
        TransferOrderConfig transferOrderConfig = this.transferOrder;
        OperatorSettingsConfig operatorSettingsConfig = this.settings;
        OperatorBatterySwapConfig operatorBatterySwapConfig = this.batterySwap;
        VehicleInventoryTrackingConfig vehicleInventoryTrackingConfig = this.inventory;
        OperatorFleetReportConfig operatorFleetReportConfig = this.fleetReport;
        ArParkingConfig arParkingConfig = this.arParking;
        OperatorNestClaimsConfig operatorNestClaimsConfig = this.nestClaims;
        OperatorNestSuggestionConfig operatorNestSuggestionConfig = this.nestSuggestion;
        OperatorZoneMapConfig operatorZoneMapConfig = this.zoneMap;
        OperatorNotificationCenterConfig operatorNotificationCenterConfig = this.notificationCenter;
        return "OperatorFeatureConfig(map=" + operatorMapConfig + ", bulkScanner=" + operatorBulkScannerConfig + ", wakeBirds=" + operatorWakeBirdsConfig + ", sweepBirds=" + operatorSweepBirdsConfig + ", taskList=" + operatorTaskListConfig + ", nestMap=" + operatorNestMapConfig + ", idTool=" + operatorIdToolConfig + ", replaceQr=" + operatorReplaceQrConfig + ", commandCenter=" + operatorCommandCenterConfig + ", workOrders=" + operatorWorkOrderConfig + ", enableLookupBird=" + z + ", enableShakeToReport=" + z2 + ", enablePairHandheld=" + z3 + ", repair=" + operatorRepairConfig + ", healthCheck=" + healthCheckConfig + ", fleetStatus=" + operatorFleetStatusConfig + ", maintenance=" + maintenanceConfig + ", report=" + operatorReportConfig + ", release=" + operatorReleaseConfig + ", transferOrder=" + transferOrderConfig + ", settings=" + operatorSettingsConfig + ", batterySwap=" + operatorBatterySwapConfig + ", inventory=" + vehicleInventoryTrackingConfig + ", fleetReport=" + operatorFleetReportConfig + ", arParking=" + arParkingConfig + ", nestClaims=" + operatorNestClaimsConfig + ", nestSuggestion=" + operatorNestSuggestionConfig + ", zoneMap=" + operatorZoneMapConfig + ", notificationCenter=" + operatorNotificationCenterConfig + ")";
    }

    public OperatorFeatureConfig(OperatorMapConfig map, OperatorBulkScannerConfig bulkScanner, OperatorWakeBirdsConfig wakeBirds, OperatorSweepBirdsConfig sweepBirds, OperatorTaskListConfig taskList, OperatorNestMapConfig nestMap, OperatorIdToolConfig idTool, OperatorReplaceQrConfig replaceQr, OperatorCommandCenterConfig commandCenter, OperatorWorkOrderConfig workOrders, boolean z, boolean z2, boolean z3, OperatorRepairConfig repair, HealthCheckConfig healthCheck, OperatorFleetStatusConfig fleetStatus, MaintenanceConfig maintenance, OperatorReportConfig report, OperatorReleaseConfig release, TransferOrderConfig transferOrder, OperatorSettingsConfig settings, OperatorBatterySwapConfig batterySwap, VehicleInventoryTrackingConfig inventory, OperatorFleetReportConfig fleetReport, ArParkingConfig arParking, OperatorNestClaimsConfig nestClaims, OperatorNestSuggestionConfig nestSuggestion, OperatorZoneMapConfig zoneMap, OperatorNotificationCenterConfig notificationCenter) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(bulkScanner, "bulkScanner");
        Intrinsics.checkNotNullParameter(wakeBirds, "wakeBirds");
        Intrinsics.checkNotNullParameter(sweepBirds, "sweepBirds");
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        Intrinsics.checkNotNullParameter(nestMap, "nestMap");
        Intrinsics.checkNotNullParameter(idTool, "idTool");
        Intrinsics.checkNotNullParameter(replaceQr, "replaceQr");
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        Intrinsics.checkNotNullParameter(workOrders, "workOrders");
        Intrinsics.checkNotNullParameter(repair, "repair");
        Intrinsics.checkNotNullParameter(healthCheck, "healthCheck");
        Intrinsics.checkNotNullParameter(fleetStatus, "fleetStatus");
        Intrinsics.checkNotNullParameter(maintenance, "maintenance");
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(release, "release");
        Intrinsics.checkNotNullParameter(transferOrder, "transferOrder");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(batterySwap, "batterySwap");
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Intrinsics.checkNotNullParameter(fleetReport, "fleetReport");
        Intrinsics.checkNotNullParameter(arParking, "arParking");
        Intrinsics.checkNotNullParameter(nestClaims, "nestClaims");
        Intrinsics.checkNotNullParameter(nestSuggestion, "nestSuggestion");
        Intrinsics.checkNotNullParameter(zoneMap, "zoneMap");
        Intrinsics.checkNotNullParameter(notificationCenter, "notificationCenter");
        this.map = map;
        this.bulkScanner = bulkScanner;
        this.wakeBirds = wakeBirds;
        this.sweepBirds = sweepBirds;
        this.taskList = taskList;
        this.nestMap = nestMap;
        this.idTool = idTool;
        this.replaceQr = replaceQr;
        this.commandCenter = commandCenter;
        this.workOrders = workOrders;
        this.enableLookupBird = z;
        this.enableShakeToReport = z2;
        this.enablePairHandheld = z3;
        this.repair = repair;
        this.healthCheck = healthCheck;
        this.fleetStatus = fleetStatus;
        this.maintenance = maintenance;
        this.report = report;
        this.release = release;
        this.transferOrder = transferOrder;
        this.settings = settings;
        this.batterySwap = batterySwap;
        this.inventory = inventory;
        this.fleetReport = fleetReport;
        this.arParking = arParking;
        this.nestClaims = nestClaims;
        this.nestSuggestion = nestSuggestion;
        this.zoneMap = zoneMap;
        this.notificationCenter = notificationCenter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OperatorFeatureConfig(OperatorMapConfig operatorMapConfig, OperatorBulkScannerConfig operatorBulkScannerConfig, OperatorWakeBirdsConfig operatorWakeBirdsConfig, OperatorSweepBirdsConfig operatorSweepBirdsConfig, OperatorTaskListConfig operatorTaskListConfig, OperatorNestMapConfig operatorNestMapConfig, OperatorIdToolConfig operatorIdToolConfig, OperatorReplaceQrConfig operatorReplaceQrConfig, OperatorCommandCenterConfig operatorCommandCenterConfig, OperatorWorkOrderConfig operatorWorkOrderConfig, boolean z, boolean z2, boolean z3, OperatorRepairConfig operatorRepairConfig, HealthCheckConfig healthCheckConfig, OperatorFleetStatusConfig operatorFleetStatusConfig, MaintenanceConfig maintenanceConfig, OperatorReportConfig operatorReportConfig, OperatorReleaseConfig operatorReleaseConfig, TransferOrderConfig transferOrderConfig, OperatorSettingsConfig operatorSettingsConfig, OperatorBatterySwapConfig operatorBatterySwapConfig, VehicleInventoryTrackingConfig vehicleInventoryTrackingConfig, OperatorFleetReportConfig operatorFleetReportConfig, ArParkingConfig arParkingConfig, OperatorNestClaimsConfig operatorNestClaimsConfig, OperatorNestSuggestionConfig operatorNestSuggestionConfig, OperatorZoneMapConfig operatorZoneMapConfig, OperatorNotificationCenterConfig operatorNotificationCenterConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r12, r14, r15, r17, r16, r76, r19, r18, r20, r23, r22, r21, r24, r26, r25, r28, r27, r11, r30, r29, r0);
        boolean z4;
        OperatorRepairConfig operatorRepairConfig2;
        boolean z5;
        HealthCheckConfig healthCheckConfig2;
        OperatorFleetStatusConfig operatorFleetStatusConfig2;
        HealthCheckConfig healthCheckConfig3;
        boolean z6;
        DefaultConstructorMarker defaultConstructorMarker2;
        int i2;
        MaintenanceConfig maintenanceConfig2;
        MaintenanceConfig maintenanceConfig3;
        OperatorReportConfig operatorReportConfig2;
        OperatorReleaseConfig operatorReleaseConfig2;
        OperatorReportConfig operatorReportConfig3;
        TransferOrderConfig transferOrderConfig2;
        boolean z7;
        int i3;
        DefaultConstructorMarker defaultConstructorMarker3;
        OperatorSettingsConfig operatorSettingsConfig2;
        OperatorSettingsConfig operatorSettingsConfig3;
        OperatorBatterySwapConfig operatorBatterySwapConfig2;
        VehicleInventoryTrackingConfig vehicleInventoryTrackingConfig2;
        OperatorBatterySwapConfig operatorBatterySwapConfig3;
        OperatorFleetReportConfig operatorFleetReportConfig2;
        ArParkingConfig arParkingConfig2;
        OperatorFleetReportConfig operatorFleetReportConfig3;
        OperatorNestClaimsConfig operatorNestClaimsConfig2;
        OperatorNestSuggestionConfig operatorNestSuggestionConfig2;
        OperatorZoneMapConfig operatorZoneMapConfig2;
        OperatorNotificationCenterConfig operatorNotificationCenterConfig2;
        OperatorMapConfig operatorMapConfig2 = (i & 1) != 0 ? new OperatorMapConfig(false, false, 0L, false, null, false, 0, null, 0.0d, false, false, null, false, false, false, 32767, null) : operatorMapConfig;
        OperatorBulkScannerConfig operatorBulkScannerConfig2 = (i & 2) != 0 ? new OperatorBulkScannerConfig(false, false, false, false, false, false, false, false, false, false, Place.TYPE_SUBLOCALITY_LEVEL_1, null) : operatorBulkScannerConfig;
        OperatorWakeBirdsConfig operatorWakeBirdsConfig2 = (i & 4) != 0 ? new OperatorWakeBirdsConfig(false, false, false, false, false, false, false, 0, 0, false, null, 0, 4095, null) : operatorWakeBirdsConfig;
        OperatorSweepBirdsConfig operatorSweepBirdsConfig2 = (i & 8) != 0 ? new OperatorSweepBirdsConfig(false, false, false, false, false, 31, null) : operatorSweepBirdsConfig;
        OperatorTaskListConfig operatorTaskListConfig2 = (i & 16) != 0 ? new OperatorTaskListConfig(false, false, false, false, false, false, false, 127, null) : operatorTaskListConfig;
        OperatorNestMapConfig operatorNestMapConfig2 = (i & 32) != 0 ? new OperatorNestMapConfig(false, false, false, false, false, 0.0f, false, 127, null) : operatorNestMapConfig;
        OperatorIdToolConfig operatorIdToolConfig2 = (i & 64) != 0 ? new OperatorIdToolConfig(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, -1, 1, null) : operatorIdToolConfig;
        OperatorReplaceQrConfig operatorReplaceQrConfig2 = (i & 128) != 0 ? new OperatorReplaceQrConfig(false, 1, null) : operatorReplaceQrConfig;
        OperatorCommandCenterConfig operatorCommandCenterConfig2 = (i & 256) != 0 ? new OperatorCommandCenterConfig(false, false, 3, null) : operatorCommandCenterConfig;
        OperatorWorkOrderConfig operatorWorkOrderConfig2 = (i & 512) != 0 ? new OperatorWorkOrderConfig(false, null, false, null, false, 0, 63, null) : operatorWorkOrderConfig;
        boolean z8 = (i & 1024) != 0 ? false : z;
        boolean z9 = (i & 2048) != 0 ? false : z2;
        boolean z10 = (i & 4096) != 0 ? false : z3;
        OperatorRepairConfig operatorRepairConfig3 = (i & 8192) != 0 ? new OperatorRepairConfig(false, false, false, false, false, 31, null) : operatorRepairConfig;
        if ((i & 16384) != 0) {
            z4 = z10;
            operatorRepairConfig2 = operatorRepairConfig3;
            z5 = z9;
            healthCheckConfig2 = new HealthCheckConfig(false, null, 3, null);
        } else {
            z4 = z10;
            operatorRepairConfig2 = operatorRepairConfig3;
            z5 = z9;
            healthCheckConfig2 = healthCheckConfig;
        }
        OperatorFleetStatusConfig operatorFleetStatusConfig3 = (32768 & i) != 0 ? new OperatorFleetStatusConfig(false, false, false, false, false, 31, null) : operatorFleetStatusConfig;
        if ((65536 & i) != 0) {
            operatorFleetStatusConfig2 = operatorFleetStatusConfig3;
            healthCheckConfig3 = healthCheckConfig2;
            z6 = false;
            defaultConstructorMarker2 = null;
            i2 = 1;
            maintenanceConfig2 = new MaintenanceConfig(false, 1, null);
        } else {
            operatorFleetStatusConfig2 = operatorFleetStatusConfig3;
            healthCheckConfig3 = healthCheckConfig2;
            z6 = false;
            defaultConstructorMarker2 = null;
            i2 = 1;
            maintenanceConfig2 = maintenanceConfig;
        }
        if ((i & DateUtils.FORMAT_NUMERIC_DATE) != 0) {
            maintenanceConfig3 = maintenanceConfig2;
            operatorReportConfig2 = new OperatorReportConfig(z6, i2, defaultConstructorMarker2);
        } else {
            maintenanceConfig3 = maintenanceConfig2;
            operatorReportConfig2 = operatorReportConfig;
        }
        OperatorReleaseConfig operatorReleaseConfig3 = (262144 & i) != 0 ? new OperatorReleaseConfig(false, false, null, false, false, null, false, false, false, 511, null) : operatorReleaseConfig;
        TransferOrderConfig transferOrderConfig3 = (524288 & i) != 0 ? new TransferOrderConfig(false, false, false, false, 0, false, false, false, false, 511, null) : transferOrderConfig;
        if ((1048576 & i) != 0) {
            operatorReleaseConfig2 = operatorReleaseConfig3;
            operatorReportConfig3 = operatorReportConfig2;
            transferOrderConfig2 = transferOrderConfig3;
            z7 = false;
            i3 = 1;
            defaultConstructorMarker3 = null;
            operatorSettingsConfig2 = new OperatorSettingsConfig(false, 1, null);
        } else {
            operatorReleaseConfig2 = operatorReleaseConfig3;
            operatorReportConfig3 = operatorReportConfig2;
            transferOrderConfig2 = transferOrderConfig3;
            z7 = false;
            i3 = 1;
            defaultConstructorMarker3 = null;
            operatorSettingsConfig2 = operatorSettingsConfig;
        }
        if ((i & 2097152) != 0) {
            operatorSettingsConfig3 = operatorSettingsConfig2;
            operatorBatterySwapConfig2 = new OperatorBatterySwapConfig(z7, i3, defaultConstructorMarker3);
        } else {
            operatorSettingsConfig3 = operatorSettingsConfig2;
            operatorBatterySwapConfig2 = operatorBatterySwapConfig;
        }
        VehicleInventoryTrackingConfig vehicleInventoryTrackingConfig3 = (4194304 & i) != 0 ? new VehicleInventoryTrackingConfig(false, false, false, false, 15, null) : vehicleInventoryTrackingConfig;
        if ((8388608 & i) != 0) {
            vehicleInventoryTrackingConfig2 = vehicleInventoryTrackingConfig3;
            operatorBatterySwapConfig3 = operatorBatterySwapConfig2;
            operatorFleetReportConfig2 = new OperatorFleetReportConfig(false, 1, null);
        } else {
            vehicleInventoryTrackingConfig2 = vehicleInventoryTrackingConfig3;
            operatorBatterySwapConfig3 = operatorBatterySwapConfig2;
            operatorFleetReportConfig2 = operatorFleetReportConfig;
        }
        ArParkingConfig arParkingConfig3 = (16777216 & i) != 0 ? new ArParkingConfig(null, false, false, 7, null) : arParkingConfig;
        if ((33554432 & i) != 0) {
            arParkingConfig2 = arParkingConfig3;
            operatorFleetReportConfig3 = operatorFleetReportConfig2;
            operatorNestClaimsConfig2 = new OperatorNestClaimsConfig(false, 0, 3, null);
        } else {
            arParkingConfig2 = arParkingConfig3;
            operatorFleetReportConfig3 = operatorFleetReportConfig2;
            operatorNestClaimsConfig2 = operatorNestClaimsConfig;
        }
        OperatorNestSuggestionConfig operatorNestSuggestionConfig3 = (67108864 & i) != 0 ? new OperatorNestSuggestionConfig(false, 0.0d, 0, false, 15, null) : operatorNestSuggestionConfig;
        OperatorZoneMapConfig operatorZoneMapConfig3 = (134217728 & i) != 0 ? new OperatorZoneMapConfig(false, 0.0d, 3, null) : operatorZoneMapConfig;
        if ((i & 268435456) != 0) {
            operatorNestSuggestionConfig2 = operatorNestSuggestionConfig3;
            operatorZoneMapConfig2 = operatorZoneMapConfig3;
            operatorNotificationCenterConfig2 = new OperatorNotificationCenterConfig(false, false, 3, null);
        } else {
            operatorNestSuggestionConfig2 = operatorNestSuggestionConfig3;
            operatorZoneMapConfig2 = operatorZoneMapConfig3;
            operatorNotificationCenterConfig2 = operatorNotificationCenterConfig;
        }
    }
}
