package p000;

import co.bird.android.model.QCInspection;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, m28432d2 = {"LNW5;", "LLW5;", "", "Lco/bird/android/model/QCInspection;", "qcInspections", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlConverter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1549#2:27\n1620#2,3:28\n1#3:31\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlConverter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlConverterImpl\n*L\n19#1:27\n19#1:28,3\n*E\n"})
/* renamed from: NW5 */
/* loaded from: classes4.dex */
public final class NW5 implements LW5 {
    /* renamed from: c */
    public static final List m93811c(List qcInspections) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        Intrinsics.checkNotNullParameter(qcInspections, "$qcInspections");
        List<QCInspection> list = qcInspections;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (QCInspection qCInspection : list) {
            arrayList.add(new C2637G6(qCInspection, C43489jk4.item_inspection_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    @Override // p000.LW5
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo93813a(final List<QCInspection> qcInspections) {
        Intrinsics.checkNotNullParameter(qcInspections, "qcInspections");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: MW5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m93811c;
                m93811c = NW5.m93811c(qcInspections);
                return m93811c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      qcI…Schedulers.computation())");
        return m33142Y;
    }
}
