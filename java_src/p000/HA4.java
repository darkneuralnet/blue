package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import io.reactivex.AbstractC23442F;
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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0013"}, m28432d2 = {"LHA4;", "LkE;", "LFA4;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "", "Lco/bird/android/model/LegacyRepairType;", "repairs", "", "enableCommandCenter", "Lio/reactivex/F;", "LH6;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairListConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListConverter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n766#2:64\n857#2,2:65\n1549#2:67\n1620#2,3:68\n766#2:71\n857#2,2:72\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 RepairListConverter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListConverterImpl\n*L\n40#1:64\n40#1:65,2\n41#1:67\n41#1:68,3\n46#1:71\n46#1:72,2\n47#1:74,3\n*E\n"})
/* renamed from: HA4 */
/* loaded from: classes3.dex */
public final class HA4 extends AbstractC25130kE implements FA4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HA4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
        if (r3 == null) goto L49;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m104194e(WireBird bird, List list, HA4 this$0, BirdSummaryBody birdSummary, boolean z) {
        int i;
        List arrayList;
        List listOf;
        int collectionSizeOrDefault;
        String lowerCase;
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        C2637G6 c2637g6 = new C2637G6(bird, C45268mk4.item_hollow_button, false, 4, null);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C2637G6 c2637g62 = new C2637G6(Integer.valueOf(i), C45268mk4.view_list_header, false, 4, null);
        if (list != null) {
            ArrayList<LegacyRepairType> arrayList2 = new ArrayList();
            for (Object obj : list) {
                Intrinsics.checkNotNullExpressionValue(((LegacyRepairType) obj).getKey().toLowerCase(), "this as java.lang.String).toLowerCase()");
                if (!Intrinsics.areEqual(lowerCase, LegacyRepairType.OTHER_KEY)) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (LegacyRepairType legacyRepairType : arrayList2) {
                arrayList3.add(new C2637G6(legacyRepairType, C34740Nj4.view_repair_logger_list_repair, false, 4, null));
            }
            arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        }
        arrayList = new ArrayList();
        List list2 = arrayList;
        if (list != null) {
            ArrayList<LegacyRepairType> arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                String lowerCase2 = ((LegacyRepairType) obj2).getKey().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual(lowerCase2, LegacyRepairType.OTHER_KEY)) {
                    arrayList4.add(obj2);
                }
            }
            for (LegacyRepairType legacyRepairType2 : arrayList4) {
                list2.add(new C2637G6(legacyRepairType2, C34740Nj4.view_repair_logger_list_repair, false, 4, null));
            }
        }
        if (list2.isEmpty()) {
            list2.add(new C2637G6(null, C34740Nj4.view_repair_logger_list_empty, false, 4, null));
        }
        C3023H6 copy$default = C3023H6.copy$default(this$0.m29186c(birdSummary), null, null, c2637g6, 3, null);
        copy$default.m104406g(z);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{copy$default, new C3023H6(list2, c2637g62, null, 4, null)});
        return listOf;
    }

    @Override // p000.FA4
    /* renamed from: b */
    public AbstractC23442F<List<C3023H6>> mo104196b(final WireBird bird, final BirdSummaryBody birdSummary, final List<LegacyRepairType> list, final boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: GA4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m104194e;
                m104194e = HA4.m104194e(WireBird.this, list, this, birdSummary, z);
                return m104194e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n\n      va…ion, repairSection)\n    }");
        return m33161E;
    }
}
