package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
/* loaded from: classes8.dex */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements Function0<DescriptorRendererImpl> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1 */
    /* loaded from: classes8.dex */
    public static final class C254381 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
        public static final C254381 INSTANCE = new C254381();

        public C254381() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            invoke2(descriptorRendererOptions);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(DescriptorRendererOptions withOptions) {
            List listOf;
            Set<FqName> plus;
            Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
            Set<FqName> excludedTypeAnnotationClasses = withOptions.getExcludedTypeAnnotationClasses();
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams});
            plus = SetsKt___SetsKt.plus((Set) excludedTypeAnnotationClasses, (Iterable) listOf);
            withOptions.setExcludedTypeAnnotationClasses(plus);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.this$0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DescriptorRendererImpl invoke() {
        DescriptorRenderer withOptions = this.this$0.withOptions(C254381.INSTANCE);
        Intrinsics.checkNotNull(withOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) withOptions;
    }
}
