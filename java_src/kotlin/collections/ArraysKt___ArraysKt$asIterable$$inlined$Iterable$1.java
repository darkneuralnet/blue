package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, m28432d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24236#2:71\n*E\n"})
/* loaded from: classes8.dex */
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1 implements Iterable<T>, KMappedMarker {
    final /* synthetic */ Object[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(Object[] objArr) {
        this.$this_asIterable$inlined = objArr;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return ArrayIteratorKt.iterator(this.$this_asIterable$inlined);
    }
}