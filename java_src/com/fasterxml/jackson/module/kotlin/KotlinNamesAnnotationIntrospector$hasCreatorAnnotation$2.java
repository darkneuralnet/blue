package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$2 extends Lambda implements Function1<AnnotatedConstructor, Boolean> {
    final /* synthetic */ KotlinNamesAnnotationIntrospector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$2(KotlinNamesAnnotationIntrospector kotlinNamesAnnotationIntrospector) {
        super(1);
        this.this$0 = kotlinNamesAnnotationIntrospector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AnnotatedConstructor it) {
        boolean hasCreatorAnnotation;
        Intrinsics.checkNotNullParameter(it, "it");
        hasCreatorAnnotation = this.this$0.hasCreatorAnnotation(it);
        return Boolean.valueOf(hasCreatorAnnotation);
    }
}
