package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt__StringsJVMKt;
/* loaded from: classes8.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String replace$default;
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "relativeClassName.asString()");
        replace$default = StringsKt__StringsJVMKt.replace$default(asString, (char) CoreConstants.DOT, '$', false, 4, (Object) null);
        if (!classId.getPackageFqName().isRoot()) {
            return classId.getPackageFqName() + CoreConstants.DOT + replace$default;
        }
        return replace$default;
    }
}
