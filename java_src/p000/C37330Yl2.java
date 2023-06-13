package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireOrderItemView;
import co.bird.android.model.wire.WireOrderItemViewDetail;
import co.bird.android.model.wire.WireServiceCenterOrderSection;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LYl2;", "", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "dateRange", "", "Lco/bird/android/model/wire/WireServiceCenterOrderSection;", "sections", "LH6;", C17296a.f69688o, "startDate", "endDate", "b", "section", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireOrderItemView;", "order", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1045#2:124\n1549#2:125\n1620#2,3:126\n1360#2:132\n1446#2,2:133\n1360#2:135\n1446#2,5:136\n1448#2,3:143\n1549#2:146\n1620#2,3:147\n37#3,2:129\n37#3,2:141\n37#3,2:150\n1#4:131\n*S KotlinDebug\n*F\n+ 1 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverter\n*L\n31#1:124\n32#1:125\n32#1:126,3\n59#1:132\n59#1:133,2\n67#1:135\n67#1:136,5\n59#1:143,3\n100#1:146\n100#1:147,3\n33#1:129,2\n74#1:141,2\n105#1:150,2\n*E\n"})
/* renamed from: Yl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37330Yl2 {

    /* renamed from: b */
    public static final C9962a f46537b = new C9962a(null);
    @SuppressLint({"ConstantLocale"})

    /* renamed from: c */
    public static final SimpleDateFormat f46538c = new SimpleDateFormat("EEE, MMMM dd", Locale.getDefault());

    /* renamed from: a */
    public final Context f46539a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LYl2$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yl2$a */
    /* loaded from: classes3.dex */
    public static final class C9962a {
        public /* synthetic */ C9962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9962a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LandingConverter.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingConverter\n*L\n1#1,328:1\n31#2:329\n*E\n"})
    /* renamed from: Yl2$b */
    /* loaded from: classes3.dex */
    public static final class C9963b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WireServiceCenterOrderSection) t).getIdx()), Integer.valueOf(((WireServiceCenterOrderSection) t2).getIdx()));
            return compareValues;
        }
    }

    public C37330Yl2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46539a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m74319a(Pair<DateTime, DateTime> dateRange, List<WireServiceCenterOrderSection> sections) {
        List sortedWith;
        int collectionSizeOrDefault;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(sections, "sections");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(m74318b(dateRange.getFirst(), dateRange.getSecond()));
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(sections, new C9963b());
        List<WireServiceCenterOrderSection> list = sortedWith;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireServiceCenterOrderSection wireServiceCenterOrderSection : list) {
            arrayList.add(m74316d(wireServiceCenterOrderSection));
        }
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: b */
    public final C3023H6 m74318b(DateTime dateTime, DateTime dateTime2) {
        List mutableListOf;
        SimpleDateFormat simpleDateFormat = f46538c;
        String format = simpleDateFormat.format(dateTime.toDate());
        String format2 = simpleDateFormat.format(dateTime2.toDate());
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(format + " - " + format2, C35442Qj4.item_order_item_date_range, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m74317c(WireOrderItemView wireOrderItemView) {
        int collectionSizeOrDefault;
        List mutableListOf;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(new C2637G6(wireOrderItemView.getTitle(), C35442Qj4.item_order_item_title, false, 4, null));
        List<WireOrderItemViewDetail> details = wireOrderItemView.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOrderItemViewDetail wireOrderItemViewDetail : details) {
            arrayList.add(new C2637G6(wireOrderItemViewDetail, C35442Qj4.item_order_item_detail, false, 4, null));
        }
        spreadBuilder.addSpread(arrayList.toArray(new C2637G6[0]));
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: d */
    public final C3023H6 m74316d(WireServiceCenterOrderSection wireServiceCenterOrderSection) {
        List<List> m72551a;
        List mutableList;
        Object first;
        List listOf;
        List listOf2;
        if (wireServiceCenterOrderSection.getItems().isEmpty()) {
            mutableList = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(wireServiceCenterOrderSection.getEmptyLabel(), C35442Qj4.item_order_item_empty, false, 4, null));
        } else {
            m72551a = C37564Zl2.m72551a(wireServiceCenterOrderSection.getItems());
            ArrayList arrayList = new ArrayList();
            for (List<WireOrderItemView> list : m72551a) {
                SimpleDateFormat simpleDateFormat = f46538c;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                C2637G6 c2637g6 = new C2637G6(simpleDateFormat.format(((WireOrderItemView) first).getDate().toDate()), C35442Qj4.item_order_item_date_subheader, false, 4, null);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(c2637g6);
                ArrayList arrayList2 = new ArrayList();
                for (WireOrderItemView wireOrderItemView : list) {
                    listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C2637G6(TuplesKt.m28425to(wireOrderItemView, m74317c(wireOrderItemView)), C35442Qj4.item_order_item, false, 4, null));
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listOf2);
                }
                spreadBuilder.addSpread(arrayList2.toArray(new C2637G6[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        }
        return new C3023H6(mutableList, new C2637G6(new C36626Vl0(wireServiceCenterOrderSection.getTitle(), true, false, null, 8, null), C35442Qj4.item_order_item_header, false, 4, null), null, 4, null);
    }
}
