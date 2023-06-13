package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LVn6;", "LTn6;", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehiclesInBatchConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1054#2:53\n1549#2:54\n1620#2,3:55\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchConverterImpl\n*L\n43#1:53\n44#1:54\n44#1:55,3\n*E\n"})
/* renamed from: Vn6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36650Vn6 implements InterfaceC36182Tn6 {

    /* renamed from: a */
    public final Context f39769a;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 VehiclesInBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchConverterImpl\n*L\n1#1,328:1\n43#2:329\n*E\n"})
    /* renamed from: Vn6$a */
    /* loaded from: classes3.dex */
    public static final class C8796a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireBird) t2).getCode(), ((WireBird) t).getCode());
            return compareValues;
        }
    }

    public C36650Vn6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39769a = context;
    }

    /* renamed from: c */
    public static final List m79416c(C36650Vn6 this$0, List birds) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birds, "$birds");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m79415d(), this$0.m79414e(birds)});
        return listOfNotNull;
    }

    @Override // p000.InterfaceC36182Tn6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo79418a(final List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Un6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m79416c;
                m79416c = C36650Vn6.m79416c(C36650Vn6.this, birds);
                return m79416c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m79415d() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f39769a.getString(C45871nl4.batches_add_to_batch), C45268mk4.item_button, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m79414e(List<WireBird> list) {
        List sortedWith;
        int collectionSizeOrDefault;
        List mutableList;
        C2637G6 c2637g6 = new C2637G6(this.f39769a.getString(C45871nl4.vehicles_with_count, Integer.valueOf(list.size())), C34740Nj4.item_header, false, 4, null);
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C8796a());
        List<WireBird> list2 = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird : list2) {
            arrayList.add(new C2637G6(wireBird, C34740Nj4.item_bird_with_battery, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList.size() > 0) {
            return new C3023H6(mutableList, c2637g6, null, 4, null);
        }
        return null;
    }
}
