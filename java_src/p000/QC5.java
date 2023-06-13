package p000;

import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuVehicle;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "Ljl5;", "scanState", "LPC5;", C17296a.f69688o, "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "b", "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: QC5 */
/* loaded from: classes3.dex */
public final class QC5 {
    /* renamed from: a */
    public static final PC5 m88752a(WireSkuScanItem wireSkuScanItem, EnumC43500jl5 enumC43500jl5) {
        Intrinsics.checkNotNullParameter(wireSkuScanItem, "<this>");
        return new PC5(null, wireSkuScanItem.getItemId(), wireSkuScanItem.getItemDisplayName(), wireSkuScanItem.getItemDisplayCaption(), wireSkuScanItem.getBird(), wireSkuScanItem.getErrorCode(), wireSkuScanItem.getScanIdentifier(), enumC43500jl5, 1, null);
    }

    /* renamed from: b */
    public static final PC5 m88751b(WireSuccessfulScannedItem wireSuccessfulScannedItem, EnumC43500jl5 enumC43500jl5) {
        Intrinsics.checkNotNullParameter(wireSuccessfulScannedItem, "<this>");
        String id = wireSuccessfulScannedItem.getId();
        String itemId = wireSuccessfulScannedItem.getItemId();
        String itemDisplayName = wireSuccessfulScannedItem.getItemDisplayName();
        String itemDisplayCaption = wireSuccessfulScannedItem.getItemDisplayCaption();
        WireSkuVehicle bird = wireSuccessfulScannedItem.getBird();
        if (enumC43500jl5 == null) {
            if (wireSuccessfulScannedItem.getReceived()) {
                enumC43500jl5 = EnumC43500jl5.RECEIVED;
            } else {
                enumC43500jl5 = EnumC43500jl5.AWAITING_SCAN;
            }
        }
        return new PC5(id, itemId, itemDisplayName, itemDisplayCaption, bird, null, null, enumC43500jl5, 96, null);
    }

    public static /* synthetic */ PC5 toSkuScanItem$default(WireSkuScanItem wireSkuScanItem, EnumC43500jl5 enumC43500jl5, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC43500jl5 = null;
        }
        return m88752a(wireSkuScanItem, enumC43500jl5);
    }

    public static /* synthetic */ PC5 toSkuScanItem$default(WireSuccessfulScannedItem wireSuccessfulScannedItem, EnumC43500jl5 enumC43500jl5, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC43500jl5 = null;
        }
        return m88751b(wireSuccessfulScannedItem, enumC43500jl5);
    }
}
