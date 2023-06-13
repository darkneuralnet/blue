package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1 extends Lambda implements Function1<AnnotatedMember, Boolean> {

    /* renamed from: $m */
    final /* synthetic */ AnnotatedMember f69970$m;
    final /* synthetic */ KotlinAnnotationIntrospector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(KotlinAnnotationIntrospector kotlinAnnotationIntrospector, AnnotatedMember annotatedMember) {
        super(1);
        this.this$0 = kotlinAnnotationIntrospector;
        this.f69970$m = annotatedMember;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AnnotatedMember it) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean bool = null;
        try {
            z = this.this$0.nullToEmptyCollection;
            if (z && this.f69970$m.getType().isCollectionLikeType()) {
                bool = Boolean.FALSE;
            } else {
                z2 = this.this$0.nullToEmptyMap;
                if (z2 && this.f69970$m.getType().isMapLikeType()) {
                    bool = Boolean.FALSE;
                } else {
                    Class<?> declaringClass = this.f69970$m.getMember().getDeclaringClass();
                    Intrinsics.checkNotNullExpressionValue(declaringClass, "m.member.declaringClass");
                    if (KotlinModuleKt.isKotlinClass(declaringClass)) {
                        AnnotatedMember annotatedMember = this.f69970$m;
                        if (annotatedMember instanceof AnnotatedField) {
                            bool = this.this$0.hasRequiredMarker((AnnotatedField) annotatedMember);
                        } else if (annotatedMember instanceof AnnotatedMethod) {
                            bool = this.this$0.hasRequiredMarker((AnnotatedMethod) annotatedMember);
                        } else if (annotatedMember instanceof AnnotatedParameter) {
                            bool = this.this$0.hasRequiredMarker((AnnotatedParameter) annotatedMember);
                        }
                    }
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return bool;
    }
}
