package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
/* loaded from: classes8.dex */
public final class LazyPackageViewDescriptorImpl$empty$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$empty$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(this.this$0.getModule().getPackageFragmentProvider(), this.this$0.getFqName()));
    }
}
