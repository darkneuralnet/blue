package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, m28432d2 = {"Lh04;", "", "", "", "options", "", "strCurrency", "LH6;", C17296a.f69688o, "Lc04;", "option", "b", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadOptionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadOptionConverter.kt\nco/bird/android/feature/payment/converters/PreloadOptionConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1549#2:33\n1620#2,3:34\n*S KotlinDebug\n*F\n+ 1 PreloadOptionConverter.kt\nco/bird/android/feature/payment/converters/PreloadOptionConverter\n*L\n16#1:33\n16#1:34,3\n*E\n"})
/* renamed from: h04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41869h04 {
    /* renamed from: a */
    public final List<C3023H6> m37233a(List<Long> options, String strCurrency) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(strCurrency, "strCurrency");
        Currency m25591o = C45097mS5.m25591o(strCurrency);
        List<Long> list = options;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Number number : list) {
            long longValue = number.longValue();
            arrayList.add(new C2637G6(new C38887c04(longValue, strCurrency, C51916xx1.f118396a.m4408d(longValue, m25591o, EnumC36501Ux1.SHOW_IF_NON_ZERO)), C31932Bj4.item_preload_amount, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final List<C3023H6> m37232b(C38887c04 option) {
        List mutableListOf;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(option, "option");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(option, C31932Bj4.item_preload_amount, false, 4, null));
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableListOf, null, null, 6, null));
        return listOf;
    }
}
