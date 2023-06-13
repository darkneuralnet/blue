package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 */
/* loaded from: classes8.dex */
public final class C25489x21acc51c extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final C25489x21acc51c INSTANCE = new C25489x21acc51c();

    public C25489x21acc51c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(it));
    }
}
