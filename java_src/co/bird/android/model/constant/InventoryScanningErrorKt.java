package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0005"}, m28432d2 = {"isDuplicateScan", "", "Lco/bird/android/model/constant/InventoryScanningError;", "isValidQRNotInDB", "isValidSerialNotInDB", "model-constant"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InventoryScanningErrorKt {
    public static final boolean isDuplicateScan(InventoryScanningError inventoryScanningError) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(InventoryScanningError.Companion.getDUPLICATE_SCAN_ERRORS(), inventoryScanningError);
        return contains;
    }

    public static final boolean isValidQRNotInDB(InventoryScanningError inventoryScanningError) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(InventoryScanningError.Companion.getVALID_QR_NOT_IN_DB_ERRORS(), inventoryScanningError);
        return contains;
    }

    public static final boolean isValidSerialNotInDB(InventoryScanningError inventoryScanningError) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(InventoryScanningError.Companion.getVALID_SERIAL_NOT_IN_DB_ERRORS(), inventoryScanningError);
        return contains;
    }
}
