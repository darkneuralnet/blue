package p000;

import co.bird.android.model.constant.CouponDisplayTag;
import co.bird.android.model.wire.WireCouponDisplayView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002¨\u0006\u0010"}, m28432d2 = {"Ls84;", "", "", "Lco/bird/android/model/wire/WireCouponDisplayView;", "coupons", "", "isGiveFreeRidesEnabled", "LH6;", C17296a.f69688o, "", "headerStringRes", "c", "shouldShowFreeRides", "b", "<init>", "()V", "promotions_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPromotionsCenterConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromotionsCenterConverter.kt\nco/bird/android/feature/promotions/PromotionsCenterConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n3190#2,10:52\n1549#2:63\n1620#2,3:64\n1#3:62\n*S KotlinDebug\n*F\n+ 1 PromotionsCenterConverter.kt\nco/bird/android/feature/promotions/PromotionsCenterConverter\n*L\n14#1:52,10\n31#1:63\n31#1:64,3\n*E\n"})
/* renamed from: s84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48471s84 {
    /* renamed from: a */
    public final List<C3023H6> m14669a(List<WireCouponDisplayView> coupons, boolean z) {
        boolean z2;
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(coupons, "coupons");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = coupons.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((WireCouponDisplayView) next).getTag() != CouponDisplayTag.APPLIES_TO_NEXT_RIDE) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<WireCouponDisplayView> list = (List) pair.component1();
        List<WireCouponDisplayView> list2 = (List) pair.component2();
        C3023H6[] c3023h6Arr = new C3023H6[3];
        if (coupons.isEmpty() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        c3023h6Arr[0] = m14668b(z2);
        c3023h6Arr[1] = m14667c(list, C45871nl4.promo_center_next_promo_header);
        c3023h6Arr[2] = m14667c(list2, C45871nl4.promo_center_upcoming_promos_header);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c3023h6Arr);
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m14668b(boolean z) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C32166Cj4.item_promo_center_add_code, false, 4, null));
        if (z) {
            mutableListOf.add(new C2637G6(null, C32166Cj4.item_promo_center_free_ride, false, 4, null));
        }
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m14667c(List<WireCouponDisplayView> list, int i) {
        int collectionSizeOrDefault;
        List mutableList;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        List<WireCouponDisplayView> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireCouponDisplayView wireCouponDisplayView : list2) {
            arrayList.add(new C2637G6(wireCouponDisplayView, C32166Cj4.item_promo_center_coupon, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(Integer.valueOf(i), C32166Cj4.item_promo_center_header, false, 4, null), new C2637G6(null, C32166Cj4.item_promo_center_footer, false, 4, null));
    }
}
