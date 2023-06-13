package p000;

import co.bird.api.response.OpsBatchJobActionKind;
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
import p000.V60;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\f"}, m28432d2 = {"LN60;", "", "LV60$a;", "config", "Lco/bird/api/response/OpsBatchJobActionKind;", "selectedAction", "Lio/reactivex/F;", "", "LH6;", "b", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkUpdateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkUpdateConverter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1855#2,2:43\n1549#2:45\n1620#2,3:46\n*S KotlinDebug\n*F\n+ 1 BulkUpdateConverter.kt\nco/bird/android/feature/bulkscanner/update/BulkUpdateConverter\n*L\n32#1:43,2\n34#1:45\n34#1:46,3\n*E\n"})
/* renamed from: N60 */
/* loaded from: classes3.dex */
public final class N60 {
    /* renamed from: c */
    public static final List m94376c(V60.C8547a config, OpsBatchJobActionKind opsBatchJobActionKind) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        boolean z;
        Intrinsics.checkNotNullParameter(config, "$config");
        ArrayList<C39534d40> arrayList = new ArrayList();
        if (config.m80402c()) {
            arrayList.add(new C39534d40(OpsBatchJobActionKind.MARK_FIXED, C45871nl4.operator_bulk_update_mark_fixed, false, 4, null));
        }
        if (config.m80401d()) {
            arrayList.add(new C39534d40(OpsBatchJobActionKind.WAKE_BLUETOOTH, C45871nl4.operator_bulk_action_wake_bluetooth, false, 4, null));
        }
        if (config.m80403b()) {
            arrayList.add(new C39534d40(OpsBatchJobActionKind.CHIRP, C45871nl4.operator_bulk_update_chirp, false, 4, null));
        }
        for (C39534d40 c39534d40 : arrayList) {
            if (c39534d40.m44649b() == opsBatchJobActionKind) {
                z = true;
            } else {
                z = false;
            }
            c39534d40.m44646e(z);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (C39534d40 c39534d402 : arrayList) {
            arrayList2.add(new C2637G6(c39534d402, C35901Si4.view_operator_bulk_action, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m94377b(final V60.C8547a config, final OpsBatchJobActionKind opsBatchJobActionKind) {
        Intrinsics.checkNotNullParameter(config, "config");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: M60
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m94376c;
                m94376c = N60.m94376c(V60.C8547a.this, opsBatchJobActionKind);
                return m94376c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
