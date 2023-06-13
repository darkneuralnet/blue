package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
/* loaded from: classes8.dex */
public final class StaticScopeForKotlinEnum$properties$2 extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$properties$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.this$0 = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends PropertyDescriptor> invoke() {
        ClassDescriptor classDescriptor;
        List<? extends PropertyDescriptor> listOfNotNull;
        classDescriptor = this.this$0.containingClass;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(DescriptorFactory.createEnumEntriesProperty(classDescriptor));
        return listOfNotNull;
    }
}
