package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/constant/InventoryScanningError;", "", "(Ljava/lang/String;I)V", "toString", "", "ACTION_NOT_PERMITTED_AT_THIS_STATE", "DUPLICATE_SCAN", "INCORRECT_COMMODITY", "INCORRECT_COMMODITY_TYPE", "INCORRECT_CONDITION", "INCORRECT_FLEET", "INCORRECT_SKU", "ITEM_ALREADY_CHECKED_IN", "ITEM_ALREADY_IN_OTHER_SKU_ORDER", "ITEM_ALREADY_IN_SKU_ORDER", "ITEM_NOT_IN_SKU_ORDER", "NOT_AUTHORIZED", "NOT_IN_INVENTORY_VEHICLE", "NOT_IN_SC_WAREHOUSE", "NOT_IN_THE_RIGHT_ZONE", "NOT_SETUP_PROPERLY", "NOT_VALID_QR_NOT_VALID_SERIAL", "NO_VALIDATION", "TERMINATED_VEHICLE", "UNAVAILABLE_VEHICLE", "VALID_QR_NOT_IN_DB", "VALID_SERIAL_NOT_IN_DB", "VEHICLE_NOT_DAMAGED", "VEHICLE_NOT_TRACKING", "UNKNOWN", "HARD_COUNT_NOT_VALID_QR_NOT_VALID_SERIAL", "HARD_COUNT_VALID_QR_NOT_IN_DB", "HARD_COUNT_VALID_SERIAL_NOT_IN_DB", "HARD_COUNT_DUPLICATE_SCAN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum InventoryScanningError {
    ACTION_NOT_PERMITTED_AT_THIS_STATE,
    DUPLICATE_SCAN,
    INCORRECT_COMMODITY,
    INCORRECT_COMMODITY_TYPE,
    INCORRECT_CONDITION,
    INCORRECT_FLEET,
    INCORRECT_SKU,
    ITEM_ALREADY_CHECKED_IN,
    ITEM_ALREADY_IN_OTHER_SKU_ORDER,
    ITEM_ALREADY_IN_SKU_ORDER,
    ITEM_NOT_IN_SKU_ORDER,
    NOT_AUTHORIZED,
    NOT_IN_INVENTORY_VEHICLE,
    NOT_IN_SC_WAREHOUSE,
    NOT_IN_THE_RIGHT_ZONE,
    NOT_SETUP_PROPERLY,
    NOT_VALID_QR_NOT_VALID_SERIAL,
    NO_VALIDATION,
    TERMINATED_VEHICLE,
    UNAVAILABLE_VEHICLE,
    VALID_QR_NOT_IN_DB,
    VALID_SERIAL_NOT_IN_DB,
    VEHICLE_NOT_DAMAGED,
    VEHICLE_NOT_TRACKING,
    UNKNOWN,
    HARD_COUNT_NOT_VALID_QR_NOT_VALID_SERIAL,
    HARD_COUNT_VALID_QR_NOT_IN_DB,
    HARD_COUNT_VALID_SERIAL_NOT_IN_DB,
    HARD_COUNT_DUPLICATE_SCAN;
    
    public static final Companion Companion = new Companion(null);
    private static final Set<InventoryScanningError> DUPLICATE_SCAN_ERRORS;
    private static final Set<InventoryScanningError> VALID_QR_NOT_IN_DB_ERRORS;
    private static final Set<InventoryScanningError> VALID_SERIAL_NOT_IN_DB_ERRORS;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/constant/InventoryScanningError$Companion;", "", "()V", "DUPLICATE_SCAN_ERRORS", "", "Lco/bird/android/model/constant/InventoryScanningError;", "getDUPLICATE_SCAN_ERRORS", "()Ljava/util/Set;", "VALID_QR_NOT_IN_DB_ERRORS", "getVALID_QR_NOT_IN_DB_ERRORS", "VALID_SERIAL_NOT_IN_DB_ERRORS", "getVALID_SERIAL_NOT_IN_DB_ERRORS", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<InventoryScanningError> getDUPLICATE_SCAN_ERRORS() {
            return InventoryScanningError.DUPLICATE_SCAN_ERRORS;
        }

        public final Set<InventoryScanningError> getVALID_QR_NOT_IN_DB_ERRORS() {
            return InventoryScanningError.VALID_QR_NOT_IN_DB_ERRORS;
        }

        public final Set<InventoryScanningError> getVALID_SERIAL_NOT_IN_DB_ERRORS() {
            return InventoryScanningError.VALID_SERIAL_NOT_IN_DB_ERRORS;
        }

        private Companion() {
        }
    }

    static {
        InventoryScanningError inventoryScanningError;
        InventoryScanningError inventoryScanningError2;
        InventoryScanningError inventoryScanningError3;
        InventoryScanningError inventoryScanningError4;
        InventoryScanningError inventoryScanningError5;
        Set<InventoryScanningError> of;
        Set<InventoryScanningError> of2;
        Set<InventoryScanningError> of3;
        of = SetsKt__SetsKt.setOf((Object[]) new InventoryScanningError[]{r0, inventoryScanningError5});
        DUPLICATE_SCAN_ERRORS = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new InventoryScanningError[]{inventoryScanningError, inventoryScanningError3});
        VALID_QR_NOT_IN_DB_ERRORS = of2;
        of3 = SetsKt__SetsKt.setOf((Object[]) new InventoryScanningError[]{inventoryScanningError2, inventoryScanningError4});
        VALID_SERIAL_NOT_IN_DB_ERRORS = of3;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
