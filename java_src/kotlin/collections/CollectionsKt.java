package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, m28431k = 4, m28430mv = {1, 8, 0}, m28428xi = 49)
/* loaded from: classes8.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ ArrayList arrayListOf(Object... objArr) {
        return CollectionsKt__CollectionsKt.arrayListOf(objArr);
    }

    public static /* bridge */ /* synthetic */ Sequence asSequence(Iterable iterable) {
        return CollectionsKt___CollectionsKt.asSequence(iterable);
    }

    @PublishedApi
    public static /* bridge */ /* synthetic */ int collectionSizeOrDefault(Iterable iterable, int i) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, i);
    }

    public static /* bridge */ /* synthetic */ List emptyList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static /* bridge */ /* synthetic */ Set intersect(Iterable iterable, Iterable iterable2) {
        return CollectionsKt___CollectionsKt.intersect(iterable, iterable2);
    }

    public static /* bridge */ /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        return CollectionsKt___CollectionsKt.joinTo$default(iterable, appendable, charSequence, charSequence2, charSequence3, i, charSequence4, function1, i2, obj);
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, charSequence, charSequence2, charSequence3, i, charSequence4, function1, i2, obj);
    }

    public static /* bridge */ /* synthetic */ List listOf(Object obj) {
        return CollectionsKt__CollectionsJVMKt.listOf(obj);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static /* bridge */ /* synthetic */ void throwIndexOverflow() {
        CollectionsKt__CollectionsKt.throwIndexOverflow();
    }

    public static /* bridge */ /* synthetic */ int[] toIntArray(Collection collection) {
        return CollectionsKt___CollectionsKt.toIntArray(collection);
    }

    public static /* bridge */ /* synthetic */ List toList(Iterable iterable) {
        return CollectionsKt___CollectionsKt.toList(iterable);
    }

    public static /* bridge */ /* synthetic */ List toMutableList(Collection collection) {
        return CollectionsKt___CollectionsKt.toMutableList(collection);
    }

    public static /* bridge */ /* synthetic */ Object firstOrNull(List list) {
        return CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
    }

    public static /* bridge */ /* synthetic */ Object lastOrNull(List list) {
        return CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
    }

    public static /* bridge */ /* synthetic */ List listOf(Object... objArr) {
        return CollectionsKt__CollectionsKt.listOf(objArr);
    }
}
