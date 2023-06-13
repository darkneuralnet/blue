package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class JvmBuiltInsCustomizer$$Lambda$0 implements DFS.Neighbors {
    public static final JvmBuiltInsCustomizer$$Lambda$0 INSTANCE = new JvmBuiltInsCustomizer$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable isMutabilityViolation$lambda$7;
        isMutabilityViolation$lambda$7 = JvmBuiltInsCustomizer.isMutabilityViolation$lambda$7((CallableMemberDescriptor) obj);
        return isMutabilityViolation$lambda$7;
    }
}
