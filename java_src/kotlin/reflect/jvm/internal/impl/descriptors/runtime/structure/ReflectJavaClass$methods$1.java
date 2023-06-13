package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* loaded from: classes8.dex */
public final class ReflectJavaClass$methods$1 extends Lambda implements Function1<Method, Boolean> {
    final /* synthetic */ ReflectJavaClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(ReflectJavaClass reflectJavaClass) {
        super(1);
        this.this$0 = reflectJavaClass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r5 == false) goto L7;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(Method method) {
        boolean isEnumValuesOrValueOf;
        boolean z = false;
        if (!method.isSynthetic()) {
            if (this.this$0.isEnum()) {
                ReflectJavaClass reflectJavaClass = this.this$0;
                Intrinsics.checkNotNullExpressionValue(method, "method");
                isEnumValuesOrValueOf = reflectJavaClass.isEnumValuesOrValueOf(method);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
