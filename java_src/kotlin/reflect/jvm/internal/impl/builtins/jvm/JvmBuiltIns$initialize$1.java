package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
/* loaded from: classes8.dex */
public final class JvmBuiltIns$initialize$1 extends Lambda implements Function0<JvmBuiltIns.Settings> {
    final /* synthetic */ boolean $isAdditionalBuiltInsFeatureSupported;
    final /* synthetic */ ModuleDescriptor $moduleDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(ModuleDescriptor moduleDescriptor, boolean z) {
        super(0);
        this.$moduleDescriptor = moduleDescriptor;
        this.$isAdditionalBuiltInsFeatureSupported = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JvmBuiltIns.Settings invoke() {
        return new JvmBuiltIns.Settings(this.$moduleDescriptor, this.$isAdditionalBuiltInsFeatureSupported);
    }
}
