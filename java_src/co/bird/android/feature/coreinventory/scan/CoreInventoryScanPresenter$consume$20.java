package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072B\u0010\u0006\u001a>\u0012\u0004\u0012\u00020\u0001\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$20\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1774#2,4:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$20\n*L\n220#1:262,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$20 extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>>, Integer> {

    /* renamed from: g */
    public static final CoreInventoryScanPresenter$consume$20 f63855g = new CoreInventoryScanPresenter$consume$20();

    public CoreInventoryScanPresenter$consume$20() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final Integer invoke(Pair<Unit, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>> pair) {
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        List<Pair<WireVehicleInventoryScan, Boolean>> pairs = pair.component2();
        Intrinsics.checkNotNullExpressionValue(pairs, "pairs");
        List<Pair<WireVehicleInventoryScan, Boolean>> list = pairs;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if ((!Intrinsics.areEqual((Boolean) ((Pair) it.next()).component2(), Boolean.TRUE)) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        return Integer.valueOf(i);
    }
}
