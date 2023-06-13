package p000;

import co.bird.android.model.wire.WireCaptureValidation;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"LHe0;", "", "", "Lco/bird/android/model/wire/WireCaptureValidation;", "captureValidations", "LH6;", C17296a.f69688o, "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCaptureBulkScannerConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerConverter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerConverter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerConverter\n*L\n13#1:31\n13#1:32,3\n*E\n"})
/* renamed from: He0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33287He0 {
    /* renamed from: a */
    public final List<C3023H6> m103620a(List<WireCaptureValidation> captureValidations) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(captureValidations, "captureValidations");
        List<WireCaptureValidation> list = captureValidations;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireCaptureValidation wireCaptureValidation : list) {
            arrayList.add(new C2637G6(wireCaptureValidation, C45268mk4.item_fleet_status_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(Integer.valueOf(captureValidations.size()), C36144Tj4.item_scan_header, false, 4, null), null, 4, null));
        return listOf;
    }
}
