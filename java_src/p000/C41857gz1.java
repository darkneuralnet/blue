package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.CouponKind;
import co.bird.android.model.wire.WireCoupon;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0001¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", C17296a.f69688o, "c", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFreeRideDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeRideDelegate.kt\nco/bird/android/app/feature/freeride/FreeRideDelegateKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1045#2:64\n*S KotlinDebug\n*F\n+ 1 FreeRideDelegate.kt\nco/bird/android/app/feature/freeride/FreeRideDelegateKt\n*L\n57#1:64\n*E\n"})
/* renamed from: gz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41857gz1 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FreeRideDelegate.kt\nco/bird/android/app/feature/freeride/FreeRideDelegateKt\n*L\n1#1,328:1\n57#2:329\n*E\n"})
    /* renamed from: gz1$a */
    /* loaded from: classes2.dex */
    public static final class C22524a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WireCoupon) t).getCreatedAt(), ((WireCoupon) t2).getCreatedAt());
            return compareValues;
        }
    }

    /* renamed from: a */
    public static final WireCoupon m37260a(List<WireCoupon> list) {
        List sortedWith;
        Object first;
        Intrinsics.checkNotNullParameter(list, "<this>");
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C22524a());
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) sortedWith);
        return (WireCoupon) first;
    }

    /* renamed from: b */
    public static final String m37259b(List<WireCoupon> list, Context context) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        WireCoupon m37260a = m37260a(list);
        if (m37260a.getKind() == CouponKind.MERCHANT_TRANSACTION) {
            String string = context.getString(C45871nl4.merchant_coupon_body, m37258c(m37260a));
            Intrinsics.checkNotNullExpressionValue(string, "{\n    context.getString(…, coupon.upToValue())\n  }");
            return string;
        }
        String string2 = context.getString(C45871nl4.g1g1_dialog_body, m37258c(m37260a));
        Intrinsics.checkNotNullExpressionValue(string2, "{\n    context.getString(…, coupon.upToValue())\n  }");
        return string2;
    }

    /* renamed from: c */
    public static final String m37258c(WireCoupon wireCoupon) {
        Intrinsics.checkNotNullParameter(wireCoupon, "<this>");
        return C51916xx1.f118396a.m4408d(wireCoupon.getMaxAmount(), C45097mS5.m25591o(wireCoupon.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
    }
}
