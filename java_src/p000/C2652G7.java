package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBatch;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LG7;", "LE7;", "", "searchTerm", "", "Lco/bird/android/model/wire/WireBatch;", "batches", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "e", DateTokenConverter.CONVERTER_KEY, "LTq4;", "LTq4;", "reactiveConfig", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LTq4;Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddToBatchConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n766#2:66\n857#2,2:67\n1054#2:69\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 AddToBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchConverterImpl\n*L\n53#1:66\n53#1:67,2\n56#1:69\n57#1:70\n57#1:71,3\n*E\n"})
/* renamed from: G7 */
/* loaded from: classes3.dex */
public final class C2652G7 implements InterfaceC1738E7 {

    /* renamed from: a */
    public final C36207Tq4 f10983a;

    /* renamed from: b */
    public final Context f10984b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 AddToBatchConverter.kt\nco/bird/android/feature/servicecenter/batches/addtobatch/AddToBatchConverterImpl\n*L\n1#1,328:1\n56#2:329\n*E\n"})
    /* renamed from: G7$a */
    /* loaded from: classes3.dex */
    public static final class C2653a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireBatch) t2).getCreatedAt(), ((WireBatch) t).getCreatedAt());
            return compareValues;
        }
    }

    public C2652G7(C36207Tq4 reactiveConfig, Context context) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10983a = reactiveConfig;
        this.f10984b = context;
    }

    /* renamed from: c */
    public static final List m105772c(boolean z, C2652G7 this$0, String searchTerm, List batches) {
        C3023H6 c3023h6;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(searchTerm, "$searchTerm");
        Intrinsics.checkNotNullParameter(batches, "$batches");
        if (z) {
            c3023h6 = this$0.m105770e();
        } else {
            c3023h6 = null;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{c3023h6, this$0.m105771d(searchTerm, batches)});
        return listOfNotNull;
    }

    @Override // p000.InterfaceC1738E7
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo105774a(final String searchTerm, final List<WireBatch> batches) {
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(batches, "batches");
        final boolean createBatch = this.f10983a.m82623f8().getValue().getServiceCenterConfig().getBatchActions().getCreateBatch();
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: F7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m105772c;
                m105772c = C2652G7.m105772c(createBatch, this, searchTerm, batches);
                return m105772c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m105771d(String str, List<WireBatch> list) {
        boolean isBlank;
        List sortedWith;
        int collectionSizeOrDefault;
        List mutableList;
        List mutableListOf;
        boolean contains;
        C2637G6 c2637g6 = new C2637G6(this.f10984b.getString(C45871nl4.batches), C34740Nj4.item_header, false, 4, null);
        isBlank = StringsKt__StringsJVMKt.isBlank(str);
        if (!isBlank) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                contains = StringsKt__StringsKt.contains((CharSequence) ((WireBatch) obj).getDescription(), (CharSequence) str, true);
                if (contains) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C2653a());
        List<WireBatch> list2 = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (WireBatch wireBatch : list2) {
            arrayList2.add(new C2637G6(wireBatch, C45268mk4.item_button_secondary, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        if (mutableList.size() > 0) {
            return new C3023H6(mutableList, c2637g6, null, 4, null);
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C45268mk4.view_button_red, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m105770e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f10984b.getString(C45871nl4.batches_create_new_batch), C45268mk4.item_button, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
