package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.constant.OperatorOrderViewTypeKt;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.nestedstructures.OperatorOrderViewDetail;
import com.facebook.share.internal.C17296a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LGo3;", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "order", "", "LH6;", C17296a.f69688o, "e", "f", "c", "b", "Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;", "details", "g", "", "instructions", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1#2:186\n1559#3:187\n1590#3,4:188\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsConverter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsConverter\n*L\n145#1:187\n145#1:188,4\n*E\n"})
/* renamed from: Go3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33146Go3 {

    /* renamed from: b */
    public static final C2951a f12484b = new C2951a(null);
    @SuppressLint({"ConstantLocale"})

    /* renamed from: c */
    public static final SimpleDateFormat f12485c = new SimpleDateFormat("EEEE MMM dd yyyy", Locale.getDefault());
    @SuppressLint({"ConstantLocale"})

    /* renamed from: d */
    public static final DateFormat f12486d = DateFormat.getTimeInstance(3);

    /* renamed from: a */
    public final Context f12487a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LGo3$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "TIME_FORMATTER", "Ljava/text/DateFormat;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Go3$a */
    /* loaded from: classes3.dex */
    public static final class C2951a {
        public /* synthetic */ C2951a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2951a() {
        }
    }

    public C33146Go3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12487a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m104708a(OperatorOrderView order) {
        C3023H6 m104704e;
        C3023H6 c3023h6;
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(order, "order");
        C3023H6[] c3023h6Arr = new C3023H6[5];
        if (OperatorOrderViewTypeKt.isLongtail(order.getType())) {
            m104704e = m104703f(order);
        } else {
            m104704e = m104704e(order);
        }
        c3023h6Arr[0] = m104704e;
        c3023h6Arr[1] = m104706c(order);
        c3023h6Arr[2] = m104707b(order);
        c3023h6Arr[3] = m104702g(order.getDetails());
        String instructions = order.getInstructions();
        if (instructions != null) {
            c3023h6 = m104705d(instructions);
        } else {
            c3023h6 = null;
        }
        c3023h6Arr[4] = c3023h6;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c3023h6Arr);
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m104707b(OperatorOrderView operatorOrderView) {
        List mutableListOf;
        if (!OperatorOrderViewTypeKt.isLongtail(operatorOrderView.getType())) {
            return null;
        }
        C2637G6 c2637g6 = new C2637G6(operatorOrderView, C35442Qj4.item_operator_order_bill_of_lading, false, 4, null);
        C2637G6 c2637g62 = new C2637G6(new C45910np3(NA0.m94299e(this.f12487a, C48193rg4.ic_doc), this.f12487a.getString(C45871nl4.operator_bill_of_lading_status_label_uppercased)), C35442Qj4.item_operator_order_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6);
        return new C3023H6(mutableListOf, c2637g62, null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m104706c(OperatorOrderView operatorOrderView) {
        int i;
        List mutableListOf;
        String format = f12485c.format(operatorOrderView.getAppointmentDate().toDate());
        Intrinsics.checkNotNullExpressionValue(format, "DATE_FORMATTER.format(or…appointmentDate.toDate())");
        String format2 = f12486d.format(operatorOrderView.getAppointmentDate().toDate());
        Intrinsics.checkNotNullExpressionValue(format2, "TIME_FORMATTER.format(or…appointmentDate.toDate())");
        C2637G6 c2637g6 = new C2637G6(new C31976Bo3(format, format2), C35442Qj4.item_operator_order_date, false, 4, null);
        Drawable m94299e = NA0.m94299e(this.f12487a, C48193rg4.ic_event);
        Context context = this.f12487a;
        if (OperatorOrderViewTypeKt.isLongtail(operatorOrderView.getType())) {
            i = C45871nl4.operator_delivery_date_time_label_uppercased;
        } else {
            i = C45871nl4.operator_pickup_date_time_label_uppercased;
        }
        C2637G6 c2637g62 = new C2637G6(new C45910np3(m94299e, context.getString(i)), C35442Qj4.item_operator_order_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6);
        return new C3023H6(mutableListOf, c2637g62, null, 4, null);
    }

    /* renamed from: d */
    public final C3023H6 m104705d(String str) {
        List mutableListOf;
        C2637G6 c2637g6 = new C2637G6(str, C35442Qj4.item_operator_order_instructions, false, 4, null);
        C2637G6 c2637g62 = new C2637G6(new C45910np3(NA0.m94299e(this.f12487a, C48193rg4.ic_book), this.f12487a.getString(C45871nl4.operator_pickup_instructions_label_uppercased)), C35442Qj4.item_operator_order_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6);
        return new C3023H6(mutableListOf, c2637g62, null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m104704e(OperatorOrderView operatorOrderView) {
        String string;
        List mutableListOf;
        C2637G6 c2637g6 = new C2637G6(operatorOrderView, C35442Qj4.item_operator_order_location, false, 4, null);
        Drawable m94299e = NA0.m94299e(this.f12487a, C48193rg4.ic_map);
        if (operatorOrderView.getType() == OperatorOrderViewType.PICK_UP) {
            string = this.f12487a.getString(C45871nl4.operator_pickup_location_label_uppercased);
        } else {
            string = this.f12487a.getString(C45871nl4.operator_dropoff_location_label_uppercased);
        }
        C2637G6 c2637g62 = new C2637G6(new C45910np3(m94299e, string), C35442Qj4.item_operator_order_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6);
        return new C3023H6(mutableListOf, c2637g62, null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m104703f(OperatorOrderView operatorOrderView) {
        String string;
        List mutableListOf;
        C2637G6 c2637g6 = new C2637G6(operatorOrderView, C35442Qj4.item_operator_order_delivery_point, false, 4, null);
        Drawable m94299e = NA0.m94299e(this.f12487a, C48193rg4.ic_address);
        if (operatorOrderView.getType() == OperatorOrderViewType.LONGTAIL_RETURN) {
            string = this.f12487a.getString(C45871nl4.operator_return_order_location_label_uppercased);
        } else {
            string = this.f12487a.getString(C45871nl4.operator_delivery_order_location_label_uppercased);
        }
        C2637G6 c2637g62 = new C2637G6(new C45910np3(m94299e, string), C35442Qj4.item_operator_order_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6);
        return new C3023H6(mutableListOf, c2637g62, null, 4, null);
    }

    /* renamed from: g */
    public final C3023H6 m104702g(List<OperatorOrderViewDetail> list) {
        int collectionSizeOrDefault;
        List mutableList;
        int i;
        List<OperatorOrderViewDetail> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            OperatorOrderViewDetail operatorOrderViewDetail = (OperatorOrderViewDetail) obj;
            String title = operatorOrderViewDetail.getTitle();
            String detail = operatorOrderViewDetail.getDetail();
            Context context = this.f12487a;
            if (i2 % 2 == 0) {
                i = C32364Df4.baseBG;
            } else {
                i = C32364Df4.birdWhite;
            }
            arrayList.add(new C2637G6(new C32210Co3(title, detail, NA0.m94301c(context, i)), C35442Qj4.item_operator_order_detail, false, 4, null));
            i2 = i3;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(new C45910np3(NA0.m94299e(this.f12487a, C48193rg4.ic_list), this.f12487a.getString(C45871nl4.operator_pickup_order_details_label_uppercased)), C35442Qj4.item_operator_order_header, false, 4, null), null, 4, null);
    }
}
