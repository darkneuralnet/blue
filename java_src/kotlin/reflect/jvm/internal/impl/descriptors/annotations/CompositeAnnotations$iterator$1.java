package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
/* loaded from: classes8.dex */
public final class CompositeAnnotations$iterator$1 extends Lambda implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {
    public static final CompositeAnnotations$iterator$1 INSTANCE = new CompositeAnnotations$iterator$1();

    public CompositeAnnotations$iterator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Sequence<AnnotationDescriptor> invoke(Annotations it) {
        Sequence<AnnotationDescriptor> asSequence;
        Intrinsics.checkNotNullParameter(it, "it");
        asSequence = CollectionsKt___CollectionsKt.asSequence(it);
        return asSequence;
    }
}
