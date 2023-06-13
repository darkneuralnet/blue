package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"Lii5;", "", "", "Lhi5;", "cards", "LH6;", C17296a.f69688o, "<init>", "()V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSaveMoneyConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyConverter.kt\nco/bird/android/feature/savemoney/SaveMoneyConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n*S KotlinDebug\n*F\n+ 1 SaveMoneyConverter.kt\nco/bird/android/feature/savemoney/SaveMoneyConverter\n*L\n23#1:34\n23#1:35,3\n*E\n"})
/* renamed from: ii5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42877ii5 {
    /* renamed from: a */
    public final List<C3023H6> m33537a(List<? extends EnumC42284hi5> cards) {
        int collectionSizeOrDefault;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(cards, "cards");
        ArrayList arrayList = new ArrayList();
        if (!cards.isEmpty()) {
            arrayList.add(new C2637G6(Integer.valueOf(C45871nl4.save_money_header), C34038Kj4.item_title, false, 4, null));
        }
        List<? extends EnumC42284hi5> list = cards;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (EnumC42284hi5 enumC42284hi5 : list) {
            arrayList2.add(new C2637G6(enumC42284hi5, C34038Kj4.item_save_money_card, false, 4, null));
        }
        arrayList.addAll(arrayList2);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(arrayList, null, null, 6, null));
        return listOf;
    }
}
