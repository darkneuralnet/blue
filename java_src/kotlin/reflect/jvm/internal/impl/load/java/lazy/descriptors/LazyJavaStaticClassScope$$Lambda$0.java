package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class LazyJavaStaticClassScope$$Lambda$0 implements DFS.Neighbors {
    public static final LazyJavaStaticClassScope$$Lambda$0 INSTANCE = new LazyJavaStaticClassScope$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable flatMapJavaStaticSupertypesScopes$lambda$6;
        flatMapJavaStaticSupertypesScopes$lambda$6 = LazyJavaStaticClassScope.flatMapJavaStaticSupertypesScopes$lambda$6((ClassDescriptor) obj);
        return flatMapJavaStaticSupertypesScopes$lambda$6;
    }
}
