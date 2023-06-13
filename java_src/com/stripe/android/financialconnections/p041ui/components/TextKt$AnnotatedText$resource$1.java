package com.stripe.android.financialconnections.p041ui.components;

import android.text.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,144:1\n1282#2,2:145\n*S KotlinDebug\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1\n*L\n48#1:145,2\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$resource$1 */
/* loaded from: classes7.dex */
public final class TextKt$AnnotatedText$resource$1 extends Lambda implements Function1<Annotation, GN5> {
    final /* synthetic */ Map<StringAnnotation, GN5> $annotationStyles;
    final /* synthetic */ EX2<String> $pressedAnnotation$delegate;
    final /* synthetic */ long $pressedColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$AnnotatedText$resource$1(Map<StringAnnotation, GN5> map, long j, EX2<String> ex2) {
        super(1);
        this.$annotationStyles = map;
        this.$pressedColor = j;
        this.$pressedAnnotation$delegate = ex2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GN5 invoke(Annotation annotation) {
        StringAnnotation stringAnnotation;
        String AnnotatedText$lambda$1;
        GN5 m105174a;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringAnnotation[] values = StringAnnotation.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stringAnnotation = null;
                break;
            }
            stringAnnotation = values[i];
            if (Intrinsics.areEqual(stringAnnotation.getValue(), annotation.getKey())) {
                break;
            }
            i++;
        }
        GN5 gn5 = this.$annotationStyles.get(stringAnnotation);
        AnnotatedText$lambda$1 = TextKt.AnnotatedText$lambda$1(this.$pressedAnnotation$delegate);
        if (Intrinsics.areEqual(AnnotatedText$lambda$1, annotation.getValue())) {
            if (gn5 != null) {
                m105174a = gn5.m105174a((r35 & 1) != 0 ? gn5.m105168g() : this.$pressedColor, (r35 & 2) != 0 ? gn5.f11830b : 0L, (r35 & 4) != 0 ? gn5.f11831c : null, (r35 & 8) != 0 ? gn5.f11832d : null, (r35 & 16) != 0 ? gn5.f11833e : null, (r35 & 32) != 0 ? gn5.f11834f : null, (r35 & 64) != 0 ? gn5.f11835g : null, (r35 & 128) != 0 ? gn5.f11836h : 0L, (r35 & 256) != 0 ? gn5.f11837i : null, (r35 & 512) != 0 ? gn5.f11838j : null, (r35 & 1024) != 0 ? gn5.f11839k : null, (r35 & 2048) != 0 ? gn5.f11840l : 0L, (r35 & 4096) != 0 ? gn5.f11841m : null, (r35 & 8192) != 0 ? gn5.f11842n : null);
                return m105174a;
            }
            return null;
        }
        return gn5;
    }
}
