package co.bird.android.model.wire;

import co.bird.android.model.constant.InventoryScanningError;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"toInventoryScanningError", "Lco/bird/android/model/constant/InventoryScanningError;", "", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWireSkuScanItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireSkuScanItem.kt\nco/bird/android/model/wire/WireSkuScanItemKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1109#2,2:50\n1109#2,2:52\n*S KotlinDebug\n*F\n+ 1 WireSkuScanItem.kt\nco/bird/android/model/wire/WireSkuScanItemKt\n*L\n44#1:50,2\n46#1:52,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WireSkuScanItemKt {
    public static final InventoryScanningError toInventoryScanningError(String str) {
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Object[] enumConstants = InventoryScanningError.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            for (Object obj : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((InventoryScanningError) obj).name(), str, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj, "{\n    InventoryScanningE….equals(this, true) }\n  }");
                    return (InventoryScanningError) obj;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            Object[] enumConstants2 = InventoryScanningError.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants2);
            for (Object obj2 : enumConstants2) {
                InventoryScanningError inventoryScanningError = (InventoryScanningError) obj2;
                if (Intrinsics.areEqual(inventoryScanningError.name(), "UNKNOWN")) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    InventoryScanningE…m.name == \"UNKNOWN\" }\n  }");
                    return inventoryScanningError;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
