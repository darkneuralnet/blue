package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
/* loaded from: classes8.dex */
public final class NotFoundClasses$packageFragments$1 extends Lambda implements Function1<FqName, PackageFragmentDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PackageFragmentDescriptor invoke(FqName fqName) {
        ModuleDescriptor moduleDescriptor;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        moduleDescriptor = this.this$0.module;
        return new EmptyPackageFragmentDescriptor(moduleDescriptor, fqName);
    }
}
