package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
/* loaded from: classes8.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {
    private final Annotations annotations;

    public AnnotationsTypeAttribute(Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.annotations = annotations;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnnotationsTypeAttribute)) {
            return false;
        }
        return Intrinsics.areEqual(((AnnotationsTypeAttribute) obj).annotations, this.annotations);
    }

    public final Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public KClass<? extends AnnotationsTypeAttribute> getKey() {
        return Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute add(AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.annotations, annotationsTypeAttribute.annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute intersect(AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.areEqual(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}