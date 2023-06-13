package p000;

import android.annotation.SuppressLint;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import com.facebook.share.internal.C17296a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00030\u0002J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¨\u0006\u000e"}, m28432d2 = {"Lqp3;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "Lco/bird/android/model/persistence/OperatorOrderView;", "sections", "LH6;", C17296a.f69688o, "section", "orders", "b", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderLandingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingConverter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1549#2:53\n1620#2,3:54\n1549#2:57\n1620#2,3:58\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingConverter.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingConverter\n*L\n24#1:53\n24#1:54,3\n31#1:57\n31#1:58,3\n*E\n"})
/* renamed from: qp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47689qp3 {

    /* renamed from: a */
    public static final C27697a f105867a = new C27697a(null);
    @SuppressLint({"ConstantLocale"})

    /* renamed from: b */
    public static final SimpleDateFormat f105868b = new SimpleDateFormat("EEEE MMM dd, yyyy", Locale.getDefault());
    @SuppressLint({"ConstantLocale"})

    /* renamed from: c */
    public static final DateFormat f105869c = DateFormat.getTimeInstance(3, Locale.getDefault());

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lqp3$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "TIME_FORMATTER", "Ljava/text/DateFormat;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qp3$a */
    /* loaded from: classes3.dex */
    public static final class C27697a {
        public /* synthetic */ C27697a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27697a() {
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m16951a(List<? extends Pair<OperatorOrderViewSection, ? extends List<OperatorOrderView>>> sections) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(sections, "sections");
        List<? extends Pair<OperatorOrderViewSection, ? extends List<OperatorOrderView>>> list = sections;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(m16950b((OperatorOrderViewSection) pair.component1(), (List) pair.component2()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C3023H6 m16950b(OperatorOrderViewSection operatorOrderViewSection, List<OperatorOrderView> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<OperatorOrderView> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OperatorOrderView operatorOrderView : list2) {
            String format = f105868b.format(operatorOrderView.getAppointmentDate().toDate());
            String format2 = f105869c.format(operatorOrderView.getAppointmentDate().toDate());
            String listDescription = operatorOrderView.getListDescription();
            String orderId = operatorOrderView.getOrderId();
            OperatorOrderViewType type = operatorOrderView.getType();
            Intrinsics.checkNotNullExpressionValue(format, "format(order.appointmentDate.toDate())");
            Intrinsics.checkNotNullExpressionValue(format2, "format(order.appointmentDate.toDate())");
            arrayList.add(new C2637G6(new C36431Up3(orderId, format, format2, listDescription, type), C35442Qj4.item_operator_landing_order, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(operatorOrderViewSection.getTitle(), C35442Qj4.item_operator_landing_header, false, 4, null), null, 4, null);
    }
}
