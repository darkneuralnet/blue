package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* loaded from: classes8.dex */
public final class FunctionsKt$ALWAYS_NULL$1 extends Lambda implements Function1 {
    public static final FunctionsKt$ALWAYS_NULL$1 INSTANCE = new FunctionsKt$ALWAYS_NULL$1();

    public FunctionsKt$ALWAYS_NULL$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Void invoke(Object obj) {
        return null;
    }
}
