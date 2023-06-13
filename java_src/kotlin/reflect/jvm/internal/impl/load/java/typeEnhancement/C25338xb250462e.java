package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1 */
/* loaded from: classes8.dex */
public final class C25338xb250462e extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
    final /* synthetic */ SignatureBuildingComponents $this_signatures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25338xb250462e(SignatureBuildingComponents signatureBuildingComponents) {
        super(1);
        this.$this_signatures = signatureBuildingComponents;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        invoke2(functionEnhancementBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        JavaTypeQualifiers javaTypeQualifiers;
        JavaTypeQualifiers javaTypeQualifiers2;
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String javaUtil = this.$this_signatures.javaUtil("Spliterator");
        javaTypeQualifiers = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        function.returns(javaUtil, javaTypeQualifiers, javaTypeQualifiers2);
    }
}
