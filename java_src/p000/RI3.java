package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.RepairLog;
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
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, m28432d2 = {"LRI3;", "", "", "Lco/bird/android/model/RepairLog;", "repairs", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPastRepairsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PastRepairsConverter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n1#3:29\n*S KotlinDebug\n*F\n+ 1 PastRepairsConverter.kt\nco/bird/android/feature/repair/pastrepairs/adapters/PastRepairsConverter\n*L\n16#1:25\n16#1:26,3\n*E\n"})
/* renamed from: RI3 */
/* loaded from: classes3.dex */
public final class RI3 {

    /* renamed from: a */
    public final Context f31821a;

    public RI3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31821a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m86973a(List<RepairLog> repairs) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        List<RepairLog> list = repairs;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairLog repairLog : list) {
            arrayList.add(new C2637G6(repairLog, C32634Ej4.item_repair_info, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, null, new C2637G6(this.f31821a.getString(C45871nl4.past_repairs_empty), C32634Ej4.item_repair_info_empty, false, 4, null), 2, null);
        c3023h6.m104406g(mutableList.isEmpty());
        listOf = CollectionsKt__CollectionsJVMKt.listOf(c3023h6);
        return listOf;
    }
}
