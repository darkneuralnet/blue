package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* loaded from: classes8.dex */
public final class RawTypeImpl$render$newArgs$1 extends Lambda implements Function1<String, CharSequence> {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }
}
