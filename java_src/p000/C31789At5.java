package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LAt5;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "birdStatusPairs", "Lco/bird/android/model/wire/WireBird;", "tasks", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceCenterBulkBirdDetailConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceCenterBulkBirdDetailConverter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/ServiceCenterBulkBirdDetailConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1549#2:38\n1620#2,2:39\n1747#2,3:41\n1622#2:44\n1#3:45\n*S KotlinDebug\n*F\n+ 1 ServiceCenterBulkBirdDetailConverter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/ServiceCenterBulkBirdDetailConverter\n*L\n20#1:38\n20#1:39,2\n28#1:41,3\n20#1:44\n*E\n"})
/* renamed from: At5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31789At5 {

    /* renamed from: a */
    public final Context f1311a;

    public C31789At5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1311a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m114985a(List<Pair<Bird, WireServiceCenterStatus>> birdStatusPairs, List<WireBird> tasks) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(birdStatusPairs, "birdStatusPairs");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        List<Pair<Bird, WireServiceCenterStatus>> list = birdStatusPairs;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Bird bird = (Bird) pair.component1();
            WireServiceCenterStatus wireServiceCenterStatus = (WireServiceCenterStatus) pair.component2();
            String code = bird.getCode();
            int batteryLevel = bird.getBatteryLevel();
            String str = (wireServiceCenterStatus == null || (r3 = wireServiceCenterStatus.getDisplayName()) == null) ? "" : "";
            int m94301c = NA0.m94301c(this.f1311a, C32364Df4.birdNewRoad);
            List<WireBird> list2 = tasks;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(bird.getId(), ((WireBird) it2.next()).getId())) {
                        z = true;
                        break;
                    }
                }
            }
            arrayList.add(new C2637G6(new C19728dL(bird, code, batteryLevel, str, m94301c, z), C35901Si4.item_operator_bird_detail, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
