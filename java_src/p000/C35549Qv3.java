package p000;

import co.bird.android.model.persistence.nestedstructures.OperatorTask;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, m28432d2 = {"LQv3;", "", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "tasks", "Lio/reactivex/F;", "LH6;", "b", "<init>", "()V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListV2Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Converter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Converter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Converter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Converter\n*L\n17#1:29\n17#1:30,3\n*E\n"})
/* renamed from: Qv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35549Qv3 {
    /* renamed from: c */
    public static final List m87573c(List tasks) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        Intrinsics.checkNotNullParameter(tasks, "$tasks");
        List<OperatorTask> list = tasks;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OperatorTask operatorTask : list) {
            arrayList.add(new C2637G6(operatorTask, C45268mk4.item_fleet_status_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, new C2637G6(null, C51779xj4.item_operator_task_list_search_v2, false, 4, null), null, 4, null));
        return listOf;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m87574b(final List<OperatorTask> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Pv3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m87573c;
                m87573c = C35549Qv3.m87573c(tasks);
                return m87573c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
