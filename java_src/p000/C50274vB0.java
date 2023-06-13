package p000;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ContainerOrderStatus;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuOrderKt;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007*\b\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a%\u0010\u000b\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001a\u0010\u0010\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u001c\u0010\u0013\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u001a\u0012\u0010\u0014\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0015\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a$\u0010\u0019\u001a\u00020\u0018*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u001a\u001a\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010#\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050$*\b\u0012\u0004\u0012\u00020\u00050\u0007\u001a\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050$*\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireContainerOrder;", "wireContainerOrder", "LG6;", "h", "", "i", "", "actionText", "j", "(Lco/bird/android/model/wire/WireContainerOrder;Landroid/content/Context;Ljava/lang/Integer;)LG6;", "Lco/bird/android/model/wire/WireTransferOrderLineItem;", "Lco/bird/android/model/wire/WireTransferOrder;", "transferOrder", "k", "", "displayStatusIndicator", DateTokenConverter.CONVERTER_KEY, "c", "b", "outbound", "collapse", "LH6;", "e", "Lorg/joda/time/DateTime;", "", C17296a.f69688o, "targetDateTime", "actualDateTime", "Landroid/text/Spannable;", "f", "numerator", "denominator", "g", "", "l", "m", "co.bird.android.feature.transfer-order"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConverterUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConverterUtil.kt\nco/bird/android/feature/transferorder/util/ConverterUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1549#2:233\n1620#2,3:234\n1549#2:237\n1620#2,3:238\n1#3:241\n*S KotlinDebug\n*F\n+ 1 ConverterUtil.kt\nco/bird/android/feature/transferorder/util/ConverterUtilKt\n*L\n51#1:233\n51#1:234,3\n225#1:237\n225#1:238,3\n*E\n"})
/* renamed from: vB0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50274vB0 {
    /* renamed from: a */
    public static final String m9055a(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return C51916xx1.f118396a.m4393s(dateTime, ", ");
    }

    /* renamed from: b */
    public static final C2637G6 m9054b(WireContainerOrder wireContainerOrder, Context context) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (wireContainerOrder.getBooked()) {
            i = C45871nl4.container_order_booking_status_booked;
        } else {
            i = C45871nl4.container_order_booking_status_not_booked;
        }
        if (wireContainerOrder.getBooked()) {
            i2 = C32364Df4.birdGreen;
        } else {
            i2 = C32364Df4.birdRed;
        }
        int i3 = C35442Qj4.item_line_item_status;
        String string = context.getString(C45871nl4.container_order_booking_status_label);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…der_booking_status_label)");
        String string2 = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(bookedLabel)");
        return new C2637G6(new C49486tr2(string, new HQ5(string2, C40788fB0.m41776f(context, i2), null, 4, null)), i3, false, 4, null);
    }

    /* renamed from: c */
    public static final C2637G6 m9053c(WireContainerOrder wireContainerOrder, Context context) {
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C35442Qj4.item_header_value;
        String string = context.getString(C45871nl4.container_order_id_label);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…container_order_id_label)");
        return new C2637G6(new C50079ur2(string, wireContainerOrder.getId()), i, false, 4, null);
    }

    /* renamed from: d */
    public static final C2637G6 m9052d(WireContainerOrder wireContainerOrder, Context context, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C35442Qj4.item_container_order;
        String id = wireContainerOrder.getId();
        String m84512a = C36050Sz0.m84512a(wireContainerOrder, context);
        HQ5 hq5 = new HQ5(C35816Rz0.m86147a(wireContainerOrder.getStatus(), context), C40788fB0.m41776f(context, C35816Rz0.m86146b(wireContainerOrder.getStatus())), null, 4, null);
        if (z && wireContainerOrder.getStatus() == ContainerOrderStatus.CHECKED_IN) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C2637G6(new C52521yy3(id, m84512a, hq5, Boolean.valueOf(z2)), i, false, 4, null);
    }

    /* renamed from: e */
    public static final C3023H6 m9051e(WireContainerOrder wireContainerOrder, Context context, boolean z, boolean z2) {
        C35631Re4 c35631Re4;
        C2637G6 c2637g6;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z3 = !z2;
        if (z) {
            c35631Re4 = new C35631Re4(Integer.valueOf(C45871nl4.container_order_pickup_header), Integer.valueOf(C45871nl4.container_order_target_eta_pickup), Integer.valueOf(C45871nl4.container_order_actual_eta_pickup), wireContainerOrder.getTargetPickupDate(), wireContainerOrder.getActualPickupDate());
        } else {
            c35631Re4 = new C35631Re4(Integer.valueOf(C45871nl4.container_order_arrival_header), Integer.valueOf(C45871nl4.container_order_target_eta_delivery), Integer.valueOf(C45871nl4.container_order_actual_eta_delivery), wireContainerOrder.getTargetDeliveryDate(), wireContainerOrder.getActualDeliveryDate());
        }
        int intValue = ((Number) c35631Re4.m86500a()).intValue();
        int intValue2 = ((Number) c35631Re4.m86499b()).intValue();
        int intValue3 = ((Number) c35631Re4.m86498c()).intValue();
        DateTime dateTime = (DateTime) c35631Re4.m86497d();
        DateTime dateTime2 = (DateTime) c35631Re4.m86496e();
        String string = context.getString(intValue);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(headerTextRes)");
        C2637G6 c2637g62 = new C2637G6(new C36626Vl0(string, true, z2, null, 8, null), C35442Qj4.item_container_order_details_header, false, 4, null);
        C2637G6[] c2637g6Arr = new C2637G6[2];
        C2637G6 c2637g63 = null;
        if (dateTime != null) {
            int i = C35442Qj4.item_header_spannable_status_cta;
            String string2 = context.getString(intValue2);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(targetTextRes)");
            c2637g6 = new C2637G6(new HH1(null, string2, new SpannableString(m9055a(dateTime)), 1, null), i, z3);
        } else {
            c2637g6 = null;
        }
        c2637g6Arr[0] = c2637g6;
        if (dateTime2 != null) {
            int i2 = C35442Qj4.item_header_spannable_status_cta;
            String string3 = context.getString(intValue3);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(actualTextRes)");
            if (dateTime == null) {
                dateTime = dateTime2;
            }
            c2637g63 = new C2637G6(new HH1(null, string3, m9050f(dateTime, dateTime2, context), 1, null), i2, z3);
        }
        c2637g6Arr[1] = c2637g63;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
        return new C3023H6(m9043m(listOfNotNull), c2637g62, null, 4, null);
    }

    /* renamed from: f */
    public static final Spannable m9050f(DateTime targetDateTime, DateTime actualDateTime, Context context) {
        DateTime minus;
        Pair pair;
        Pair pair2;
        int i;
        List split$default;
        Object last;
        Intrinsics.checkNotNullParameter(targetDateTime, "targetDateTime");
        Intrinsics.checkNotNullParameter(actualDateTime, "actualDateTime");
        Intrinsics.checkNotNullParameter(context, "context");
        String m9055a = m9055a(actualDateTime);
        boolean isAfter = actualDateTime.isAfter(targetDateTime);
        if (isAfter) {
            minus = actualDateTime.minus(targetDateTime.getMillis());
        } else {
            minus = targetDateTime.minus(actualDateTime.getMillis());
        }
        int millis = (int) (minus.getMillis() / ((long) DateTimeConstants.MILLIS_PER_DAY));
        int millis2 = (int) (minus.getMillis() / ((long) DateTimeConstants.MILLIS_PER_HOUR));
        if (isAfter && millis > 0) {
            pair = new Pair(Integer.valueOf(C37089Xk4.transfer_order_time_day_late), Integer.valueOf(millis));
        } else if (!isAfter && millis > 0) {
            pair = new Pair(Integer.valueOf(C37089Xk4.transfer_order_time_day_early), Integer.valueOf(millis));
        } else {
            if (isAfter && millis2 > 0) {
                pair2 = new Pair(Integer.valueOf(C37089Xk4.transfer_order_time_hour_late), Integer.valueOf(millis2));
            } else if (!isAfter && millis2 > 0) {
                pair2 = new Pair(Integer.valueOf(C37089Xk4.transfer_order_time_hour_early), Integer.valueOf(millis2));
            } else {
                pair = new Pair(-1, -1);
            }
            pair = pair2;
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        if (intValue == -1 && intValue2 == -1) {
            return new SpannableString(m9055a);
        }
        if (isAfter) {
            i = C32364Df4.birdRed;
        } else {
            i = C32364Df4.birdGreen;
        }
        String quantityString = context.getResources().getQuantityString(intValue, intValue2, Integer.valueOf(intValue2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…gRes, quantity, quantity)");
        split$default = StringsKt__StringsKt.split$default((CharSequence) (m9055a + " " + quantityString), new String[]{", "}, false, 0, 6, (Object) null);
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) split$default);
        return C45097mS5.m25592n(m9055a + " " + quantityString, (String) last, new ForegroundColorSpan(NA0.m94301c(context, i)));
    }

    /* renamed from: g */
    public static final Spannable m9049g(int i, int i2, Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        String string = context.getString(C45871nl4.sku_order_items_expected, Integer.valueOf(i), Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…, numerator, denominator)");
        SpannableString m25592n = C45097mS5.m25592n(string, string, new ForegroundColorSpan(NA0.m94301c(context, C32364Df4.birdGreen)));
        if (!z) {
            return C45097mS5.m25592n(m25592n, i + " ", new ForegroundColorSpan(NA0.m94301c(context, C32364Df4.birdRed)));
        }
        return m25592n;
    }

    public static /* synthetic */ C2637G6 generateContainerOrderItem$default(WireContainerOrder wireContainerOrder, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m9052d(wireContainerOrder, context, z);
    }

    public static /* synthetic */ C3023H6 generateDeliverySection$default(WireContainerOrder wireContainerOrder, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return m9051e(wireContainerOrder, context, z, z2);
    }

    public static /* synthetic */ C2637G6 generateStatusItem$default(WireContainerOrder wireContainerOrder, Context context, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return m9046j(wireContainerOrder, context, num);
    }

    /* renamed from: h */
    public static final C2637G6 m9048h(WireSkuOrder wireSkuOrder, Context context, WireContainerOrder wireContainerOrder) {
        String str;
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        int i = C35442Qj4.item_container_order_sku_order;
        String id = wireSkuOrder.getId();
        String m84512a = C36050Sz0.m84512a(wireContainerOrder, context);
        int quantity = wireSkuOrder.getQuantity();
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem != null) {
            str = WireSkuOrderKt.commodity(transferOrderLineItem);
        } else {
            str = null;
        }
        return new C2637G6(new C52521yy3(id, m84512a + " - " + quantity + " " + str, new HQ5(DC5.m110690a(wireSkuOrder.getStatus(), context), C40788fB0.m41776f(context, DC5.m110689b(wireSkuOrder.getStatus())), null, 4, null), null, 8, null), i, false, 4, null);
    }

    /* renamed from: i */
    public static final List<C2637G6> m9047i(List<WireSkuOrder> list, Context context, WireContainerOrder wireContainerOrder) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wireContainerOrder, "wireContainerOrder");
        List<WireSkuOrder> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireSkuOrder wireSkuOrder : list2) {
            arrayList.add(m9048h(wireSkuOrder, context, wireContainerOrder));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static final C2637G6 m9046j(WireContainerOrder wireContainerOrder, Context context, Integer num) {
        Intrinsics.checkNotNullParameter(wireContainerOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C2637G6(new HQ5(C35816Rz0.m86147a(wireContainerOrder.getStatus(), context), C40788fB0.m41776f(context, C35816Rz0.m86146b(wireContainerOrder.getStatus())), num), C35442Qj4.item_container_order_status, false, 4, null);
    }

    /* renamed from: k */
    public static final C2637G6 m9045k(WireTransferOrderLineItem wireTransferOrderLineItem, Context context, WireTransferOrder transferOrder) {
        Intrinsics.checkNotNullParameter(wireTransferOrderLineItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transferOrder, "transferOrder");
        return new C2637G6(new C52521yy3(wireTransferOrderLineItem.getId(), C42554i96.m34391a(wireTransferOrderLineItem, context), new HQ5(transferOrder.getStatus().label(), C40788fB0.m41776f(context, C41961h96.m36771a(transferOrder.getStatus())), null, 4, null), null, 8, null), C35442Qj4.item_transfer_order, false, 4, null);
    }

    /* renamed from: l */
    public static final List<C2637G6> m9044l(List<C2637G6> list) {
        int collectionSizeOrDefault;
        List<C2637G6> mutableList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<C2637G6> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C2637G6 c2637g6 : list2) {
            arrayList.add(C2637G6.copy$default(c2637g6, null, 0, false, 3, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return mutableList;
    }

    /* renamed from: m */
    public static final List<C2637G6> m9043m(List<C2637G6> list) {
        List<C2637G6> mutableList;
        List<C2637G6> mutableListOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        if (!(!mutableList.isEmpty())) {
            mutableList = null;
        }
        if (mutableList == null) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C35442Qj4.item_empty_state, false, 4, null));
            return mutableListOf;
        }
        return mutableList;
    }
}
