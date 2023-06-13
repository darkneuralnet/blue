package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 */
/* loaded from: classes8.dex */
public final class C25331xf9ff8566 extends Lambda implements Function1<TAnnotation, Boolean> {
    final /* synthetic */ AbstractSignatureParts.TypeAndDefaultQualifiers $this_extractQualifiersFromAnnotations;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25331xf9ff8566(AbstractSignatureParts<TAnnotation> abstractSignatureParts, AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_extractQualifiersFromAnnotations = typeAndDefaultQualifiers;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(TAnnotation extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return Boolean.valueOf(this.this$0.forceWarning(extractNullability, this.$this_extractQualifiersFromAnnotations.getType()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((C25331xf9ff8566) obj);
    }
}
