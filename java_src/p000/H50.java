package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.response.OperatorBatchError;
import co.bird.api.response.OperatorBatchNotice;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004H\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LH50;", "", "", "successMessage", "", "Lco/bird/api/response/OperatorBatchNotice;", "notices", "failureMessage", "Lco/bird/api/response/OperatorBatchError;", "errors", "LH6;", C17296a.f69688o, "", "birdsWokenCount", "birdsFailedToWakeCount", "c", "", "success", "batchSize", "description", "b", "LG6;", "f", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkStatusConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkStatusConverter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusConverter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,110:1\n37#2,2:111\n37#2,2:113\n37#2,2:115\n37#2,2:117\n37#2,2:119\n37#2,2:121\n37#2,2:127\n37#2,2:134\n1549#3:123\n1620#3,3:124\n1549#3:130\n1620#3,3:131\n26#4:129\n26#4:136\n*S KotlinDebug\n*F\n+ 1 BulkStatusConverter.kt\nco/bird/android/feature/bulkscanner/report/regular/adapters/BulkStatusConverter\n*L\n28#1:111,2\n29#1:113,2\n44#1:115,2\n45#1:117,2\n59#1:119,2\n67#1:121,2\n88#1:127,2\n106#1:134,2\n82#1:123\n82#1:124,3\n100#1:130\n100#1:131,3\n88#1:129\n106#1:136\n*E\n"})
/* renamed from: H50 */
/* loaded from: classes3.dex */
public final class H50 {

    /* renamed from: a */
    public final Context f12822a;

    public H50(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12822a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static /* synthetic */ List m104433e(H50 h50, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return h50.m104434d(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static /* synthetic */ List m104431g(H50 h50, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return h50.m104432f(str, list);
    }

    /* renamed from: a */
    public final List<C3023H6> m104437a(String str, List<OperatorBatchNotice> notices, String str2, List<OperatorBatchError> errors) {
        List<C2637G6> emptyList;
        List<C2637G6> emptyList2;
        List listOf;
        List mutableList;
        List<C3023H6> listOf2;
        Intrinsics.checkNotNullParameter(notices, "notices");
        Intrinsics.checkNotNullParameter(errors, "errors");
        if (str != null) {
            emptyList = m104432f(str, notices);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str2 != null) {
            emptyList2 = m104434d(str2, errors);
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        spreadBuilder.addSpread(emptyList2.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf2;
    }

    /* renamed from: b */
    public final List<C3023H6> m104436b(boolean z, int i, String str) {
        C2637G6[] c2637g6Arr;
        List mutableList;
        List<C3023H6> listOf;
        if (z) {
            String string = this.f12822a.getString(C45871nl4.operator_bulk_update_successfully_added_birds_to_batch, Integer.valueOf(i), str);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …    description\n        )");
            c2637g6Arr = (C2637G6[]) m104431g(this, string, null, 2, null).toArray(new C2637G6[0]);
        } else {
            String string2 = this.f12822a.getString(C45871nl4.operator_bulk_update_failed_to_add_birds_to_batch, Integer.valueOf(i), str);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(\n     …    description\n        )");
            c2637g6Arr = (C2637G6[]) m104433e(this, string2, null, 2, null).toArray(new C2637G6[0]);
        }
        mutableList = ArraysKt___ArraysKt.toMutableList(c2637g6Arr);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: c */
    public final List<C3023H6> m104435c(int i, int i2) {
        List emptyList;
        List emptyList2;
        List listOf;
        List mutableList;
        List<C3023H6> listOf2;
        if (i > 0) {
            String string = this.f12822a.getString(C45871nl4.operator_bulk_update_woken_birds_message, Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…message, birdsWokenCount)");
            emptyList = m104431g(this, string, null, 2, null);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 > 0) {
            String string2 = this.f12822a.getString(C45871nl4.operator_bulk_update_failed_to_wake_birds_message, Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…, birdsFailedToWakeCount)");
            emptyList2 = m104433e(this, string2, null, 2, null);
        } else {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(emptyList.toArray(new C2637G6[0]));
        spreadBuilder.addSpread(emptyList2.toArray(new C2637G6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOf);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf2;
    }

    /* renamed from: d */
    public final List<C2637G6> m104434d(String str, List<OperatorBatchError> list) {
        Drawable drawable;
        C2637G6[] c2637g6Arr;
        List<C2637G6> listOf;
        int collectionSizeOrDefault;
        Drawable m94299e = NA0.m94299e(this.f12822a, C48193rg4.ic_x_circle);
        ArrayList arrayList = null;
        if (m94299e != null && (drawable = m94299e.mutate()) != null) {
            drawable.setTint(NA0.m94301c(this.f12822a, C32364Df4.birdRed));
        } else {
            drawable = null;
        }
        Spanned fromHtml = Html.fromHtml(str);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(failureMessage)");
        C2637G6 c2637g6 = new C2637G6(new C41312g40(drawable, fromHtml), C35901Si4.item_bulk_operation_status, false, 4, null);
        if (list != null) {
            List<OperatorBatchError> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorBatchError operatorBatchError : list2) {
                arrayList.add(new C2637G6(Html.fromHtml(operatorBatchError.getMessage()), C35901Si4.item_bulk_operation_detail, false, 4, null));
            }
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g6);
        if (arrayList == null || (c2637g6Arr = (C2637G6[]) arrayList.toArray(new C2637G6[0])) == null) {
            c2637g6Arr = new C2637G6[0];
        }
        spreadBuilder.addSpread(c2637g6Arr);
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: f */
    public final List<C2637G6> m104432f(String str, List<OperatorBatchNotice> list) {
        Drawable drawable;
        C2637G6[] c2637g6Arr;
        List<C2637G6> listOf;
        int collectionSizeOrDefault;
        Drawable m94299e = NA0.m94299e(this.f12822a, C48193rg4.ic_check_circle);
        ArrayList arrayList = null;
        if (m94299e != null && (drawable = m94299e.mutate()) != null) {
            drawable.setTint(NA0.m94301c(this.f12822a, C32364Df4.birdMint));
        } else {
            drawable = null;
        }
        Spanned fromHtml = Html.fromHtml(str);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(successMessage)");
        C2637G6 c2637g6 = new C2637G6(new C41312g40(drawable, fromHtml), C35901Si4.item_bulk_operation_status, false, 4, null);
        if (list != null) {
            List<OperatorBatchNotice> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorBatchNotice operatorBatchNotice : list2) {
                arrayList.add(new C2637G6(Html.fromHtml(operatorBatchNotice.getMessage()), C35901Si4.item_bulk_operation_detail, false, 4, null));
            }
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c2637g6);
        if (arrayList == null || (c2637g6Arr = (C2637G6[]) arrayList.toArray(new C2637G6[0])) == null) {
            c2637g6Arr = new C2637G6[0];
        }
        spreadBuilder.addSpread(c2637g6Arr);
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        return listOf;
    }
}
