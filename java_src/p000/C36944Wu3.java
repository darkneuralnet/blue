package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, m28432d2 = {"LWu3;", "LUu3;", "", "Lco/bird/android/model/wire/WireBird;", "tasks", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskConverter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n*S KotlinDebug\n*F\n+ 1 OperatorTaskConverter.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskConverterImpl\n*L\n19#1:31\n19#1:32,3\n*E\n"})
/* renamed from: Wu3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36944Wu3 implements InterfaceC36476Uu3 {
    /* renamed from: c */
    public static final List m77716c(List tasks) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        Intrinsics.checkNotNullParameter(tasks, "$tasks");
        List<WireBird> list = tasks;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird : list) {
            arrayList.add(new C2637G6(wireBird, C51186wj4.view_operator_task, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{new C3023H6(new ArrayList(), new C2637G6(null, C51186wj4.item_operator_task_list_search, false, 4, null), null, 4, null), new C3023H6(mutableList, null, null, 6, null)});
        return listOf;
    }

    @Override // p000.InterfaceC36476Uu3
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo77718a(final List<WireBird> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Vu3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m77716c;
                m77716c = C36944Wu3.m77716c(tasks);
                return m77716c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
