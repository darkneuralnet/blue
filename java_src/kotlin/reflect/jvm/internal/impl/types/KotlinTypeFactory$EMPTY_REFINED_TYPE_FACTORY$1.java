package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
/* loaded from: classes8.dex */
public final class KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 extends Lambda implements Function1 {
    public static final KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 INSTANCE = new KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1();

    public KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "<anonymous parameter 0>");
        return null;
    }
}