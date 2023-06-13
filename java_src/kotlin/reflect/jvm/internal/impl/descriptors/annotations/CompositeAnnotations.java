package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1726#2,3:124\n1360#2:129\n1446#2,5:130\n1229#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
/* loaded from: classes8.dex */
public final class CompositeAnnotations implements Annotations {
    private final List<Annotations> delegates;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends Annotations> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.delegates = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo118085findAnnotation(FqName fqName) {
        Sequence asSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.delegates);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(asSequence, new CompositeAnnotations$findAnnotation$1(fqName));
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (AnnotationDescriptor) firstOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        Sequence<Annotations> asSequence;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.delegates);
        for (Annotations annotations : asSequence) {
            if (annotations.hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Annotations annotations : list) {
            if (!annotations.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        Sequence asSequence;
        Sequence flatMap;
        asSequence = CollectionsKt___CollectionsKt.asSequence(this.delegates);
        flatMap = SequencesKt___SequencesKt.flatMap(asSequence, CompositeAnnotations$iterator$1.INSTANCE);
        return flatMap.iterator();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CompositeAnnotations(Annotations... delegates) {
        this(r2);
        List list;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        list = ArraysKt___ArraysKt.toList(delegates);
    }
}
