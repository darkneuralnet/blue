package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class DescriptorUtilsKt$$Lambda$0 implements DFS.Neighbors {
    public static final DescriptorUtilsKt$$Lambda$0 INSTANCE = new DescriptorUtilsKt$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable declaresOrInheritsDefaultValue$lambda$5;
        declaresOrInheritsDefaultValue$lambda$5 = DescriptorUtilsKt.declaresOrInheritsDefaultValue$lambda$5((ValueParameterDescriptor) obj);
        return declaresOrInheritsDefaultValue$lambda$5;
    }
}
