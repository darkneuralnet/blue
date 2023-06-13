package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* loaded from: classes8.dex */
public final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements Function1<String, CharSequence> {
    public static final SignatureBuildingComponents$jvmDescriptor$1 INSTANCE = new SignatureBuildingComponents$jvmDescriptor$1();

    public SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String it) {
        String escapeClassName;
        Intrinsics.checkNotNullParameter(it, "it");
        escapeClassName = SignatureBuildingComponents.INSTANCE.escapeClassName(it);
        return escapeClassName;
    }
}
